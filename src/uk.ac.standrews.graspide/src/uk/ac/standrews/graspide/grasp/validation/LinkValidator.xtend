package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.graspDSL.Template
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.Requires
import uk.ac.standrews.graspide.grasp.graspDSL.Layer
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList
import java.util.HashSet
import java.util.Set
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.Provides

/**
 * Validations for Link Configuration constructs
 */

class LinkValidator {
    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {
        this.validator = validator;
    }

    def void validateLinkForLayerConfiguration(Link link) {
        var linkExpression = link.linkConsumer;
        var linkProviderList = link.linkProviders;
        if (linkExpression == null || linkExpression.consumer == null || linkProviderList == null ||
            linkProviderList.providers == null)
            return;

        var lastConsumer = validateLinkConsumer(linkExpression, false);
        if (lastConsumer instanceof Layer) {
             validator.error(
                        "Invalid Link Configuration on layers from layer '" + lastConsumer.name + "'",
                        GraspDSLPackage.Literals::LINK__LINK_CONSUMER
                    )
        }

        for (provider : linkProviderList.providers) {
            var lastProvider = validateLinkProvider(provider);

            if (lastProvider instanceof Layer) {
                validator.error(
                        "Invalid Link Configuration on layers to layer '" + lastProvider.name + "'",
                        GraspDSLPackage.Literals::LINK__LINK_PROVIDERS
                    )
            }
        }
    }

    def void validateLinkForLayerConstraints(Link link) {
        var linkExpression = link.linkConsumer;
        var linkProviderList = link.linkProviders;

        if (linkExpression == null || linkExpression.consumer == null || linkProviderList == null ||
            linkProviderList.providers == null)
            return;
        var linkConsumer = linkExpression.consumer;

        if (!(linkConsumer instanceof Layer)) {

            var boolean layerFound = false;

            for (provider : linkProviderList.providers) {
                if (provider.provider instanceof Layer)
                    layerFound = true;
            }

            if (layerFound) {
                validator.warning(
                    "Consumer is not conforming to strict layer constraints (communicate only with layer above or below)",
                    link,
                    GraspDSLPackage.Literals::LINK__LINK_CONSUMER
                )
            }
            return;
        } else {

            for (provider : linkProviderList.providers)
                validateLinkLayerProviderForLayeringConstraints(link, provider.provider, linkConsumer as Layer)

        }
    }

    private def validateLinkLayerProviderForLayeringConstraints(Link link, LinkProviderPart provider, Layer consumerLayer) {

        if (provider == null)
            return;

        if (!(provider instanceof Layer )) {
            validator.warning(
                "Provider '" + provider.name +
                    "' is not conforming to strict layer constraints (can only with layer above or below)",
                link,
                GraspDSLPackage.Literals::LINK__LINK_PROVIDERS
            )
            return;
        }

        var providerLayer = provider as Layer;

        if (consumerLayer.superLayer != null && consumerLayer.superLayer.size > 0) {

            for (layer : consumerLayer.superLayer) {

                if (layer.name.equals(providerLayer.name))
                    return;
            }
        }

        if (providerLayer.superLayer != null && providerLayer.superLayer.size > 0) {

            for (layer : providerLayer.superLayer) {

                if (layer.name.equals(consumerLayer.name))
                    return;
            }
        }
        validator.warning(
            "Consumer '" + consumerLayer.name + "' and Provider '" + providerLayer.name +
                "'are not conforming to strict layer constraints (can only with layer above or below)",
            link,
            GraspDSLPackage.Literals::LINK__LINK_CONSUMER
        )
        return

    }

    def validateLinkForInterfaceMatch(Link link) {
        var lastConsumer = validateLinkConsumer(link.linkConsumer, false);
        var String consumerName = null;

        if (lastConsumer instanceof Requires)
            consumerName = lastConsumer.type;

        var lastProvider = validateLinkProviders(link, link.linkProviders, consumerName);

        if (consumerName == null && lastProvider.size > 0) {
            validator.warning(
                "Providers Provides Interfaces (Names) is not matched by Consumer with Requires Interface",
                link,
                GraspDSLPackage.Literals::LINK__LINK_CONSUMER
            )
        }
    }

    def validateLinkLayerAutoCompletion(Link link){
        validateLinkConsumer(link.linkConsumer, true);
        validateLinkProviders(link, link.linkProviders, null);
    }


    private def Set<String> validateLinkProviders(Link link, LinkProvidersList list, String consumerName) {

        var Set<String> returnProvides = new HashSet<String>();
        if (list.providers == null)
            return returnProvides;

        for (provider : list.providers) {
            var lastProvider = validateLinkProvider(provider);

            if (lastProvider != null && lastProvider instanceof Provides && lastProvider.name != null) {
                returnProvides.add(lastProvider.name);

                if (consumerName != null && !consumerName.equals(lastProvider.name)) {
                    validator.warning(
                        "Consumer's Require Interface '" + consumerName +
                            "' does not match with Providers Provides Interface '" + lastProvider.name + "'",
                        link,
                        GraspDSLPackage.Literals::LINK__LINK_PROVIDERS
                    )
                }
            } else if (consumerName != null) {
                validator.warning(
                    "Consumer's Require Interface '" + consumerName +
                        "' does not match with Providers Provides Interface",
                    link,
                    GraspDSLPackage.Literals::LINK__LINK_PROVIDERS
                )

            }
        }
        return returnProvides;
    }

    private def validateLinkProvider(LinkProviders providers) {
        if (providers == null)
            return null;

        var provider = providers.provider;
        var Iterable<String> rightList = providers.rightProvider;

        var currentProvider = provider;

        if (provider == null || rightList == null || rightList.size == 0)
            return null;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("in"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentProvider = findProviderInComposition(provider.eContents, right)

            if (currentProvider == null) {

                currentProvider = findProviderInTemplates(provider, right);

                if (currentProvider == null) {

                    validator.error(
                        "Invalid Provider Name '" + right + "'",
                        GraspDSLPackage.Literals::LINK__LINK_PROVIDERS
                    )
                    return null
                }
            }
            provider = currentProvider;
        }

        return currentProvider;

    }

    private def findProviderInTemplates(LinkProviderPart part, String right) {

        var LinkProviderPart provider = null;
        if (part instanceof Component) {

            provider = findProviderInTemplate(part.value, right);

        } else if (part instanceof Connector) {

            provider = findProviderInTemplate(part.value, right);
        }
        return provider;
    }

    private def findProviderInTemplate(Template template, String right) {

        var LinkProviderPart provider = null;
        var Template currentTemplate = template;
        while (currentTemplate != null) {

            provider = findProviderInComposition(currentTemplate.eContents, right);

            if (provider != null || currentTemplate == currentTemplate.superTemplate)
                return provider

            currentTemplate = currentTemplate.superTemplate;
        }
        return provider;
    }

    private def findProviderInComposition(EList<EObject> list, String right) {
        var LinkProviderPart lastComponent = null

        for (content : list) {

            if (lastComponent != null)
                return lastComponent;

            if (content instanceof LinkProviderPart) {
                if (content.name != null && content.name.equals(right)) {

                    lastComponent = content;

                }
            }
        }
        return lastComponent

    }

    private def LinkConsumerPart validateLinkConsumer(LinkConsumerExpression expression, boolean isValidateConsumer) {
        if (expression == null)
            return null;

        var consumer = expression.consumer;
        var Iterable<String> rightList = expression.rightConsumer;

        var currentConsumer = consumer;

        if (consumer == null || rightList == null || rightList.size == 0)
            return null;

        if(rightList.get(rightList.size-1)!= null && rightList.get(rightList.size-1).equals("out"))
            rightList = rightList.take(rightList.size-1)

        for (right : rightList) {

            currentConsumer = findConsumerInComposition(consumer.eContents, right)

            if (currentConsumer == null) {

                currentConsumer = findConsumerInTemplates(consumer, right);

                if (currentConsumer == null && isValidateConsumer) {

                    validator.error(
                        "Invalid Consumer Name '" + right + "'",
                        GraspDSLPackage.Literals::LINK__LINK_CONSUMER
                    )
                    return null;
                }
            }

            consumer = currentConsumer;
        }

        return currentConsumer;
    }

    private def LinkConsumerPart findConsumerInTemplates(LinkConsumerPart part, String right) {

        var LinkConsumerPart consumer = null;
        if (part instanceof Component) {

            consumer = findConsumerInTemplate(part.value, right);

        } else if (part instanceof Connector) {

            consumer = findConsumerInTemplate(part.value, right);
        }
        return consumer;
    }

    private def findConsumerInTemplate(Template template, String right) {
        var LinkConsumerPart consumer = null;
        var Template currentTemplate = template;
        while (currentTemplate != null) {

            consumer = findConsumerInComposition(currentTemplate.eContents, right);

            if (consumer != null || currentTemplate == currentTemplate.superTemplate)
                return consumer

            currentTemplate = currentTemplate.superTemplate;
        }

        return consumer;

    }

    private def findConsumerInComposition(EList<EObject> contents, String right) {

        var LinkConsumerPart lastComponent = null

        if (contents == null)
            return lastComponent;

        for (content : contents) {

            if (lastComponent != null)
                return lastComponent;

            if (content instanceof LinkConsumerPart) {
                if (content instanceof Layer) {
                    if (content.name != null && content.name.equals(right)) {
                        lastComponent = content;
                    }
                } else if (content instanceof Component) {
                    if (content.name != null && content.name.equals(right)) {
                        lastComponent = content;
                    }
                } else if (content instanceof Connector) {
                    if (content.name != null && content.name.equals(right)) {
                        lastComponent = content;
                    }
                } else if (content instanceof Requires) {
                    if (content.type != null && content.type.equals(right)) {
                        lastComponent = content;
                    }
                }
            }
        }
        return lastComponent
    }
}
