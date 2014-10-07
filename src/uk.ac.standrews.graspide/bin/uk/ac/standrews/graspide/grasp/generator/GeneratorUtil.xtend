package uk.ac.standrews.graspide.grasp.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.Layer
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders
import uk.ac.standrews.graspide.grasp.graspDSL.Requires
import uk.ac.standrews.graspide.grasp.graspDSL.Template

/**
 * Code Generator utility functions
 */

class GeneratorUtil {

    def getLastLinkProvider(LinkProviders providers) {
        if (providers == null)
            return null;

        var provider = providers.provider;
        var Iterable<String> rightList = providers.rightProvider;

        var currentProvider = provider;

        if (provider == null || rightList == null || rightList.size == 0)
            return currentProvider;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("in"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentProvider = findProviderInComposition(provider.eContents, right)

            if (currentProvider == null) {

                currentProvider = findProviderInTemplates(provider, right);

                if (currentProvider == null) {

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

    def getLastConsumer(LinkConsumerExpression expression, boolean isValidateConsumer) {
        if (expression == null)
            return null;

        var consumer = expression.consumer;
        var Iterable<String> rightList = expression.rightConsumer;

        var currentConsumer = consumer;

        if (consumer == null || rightList == null || rightList.size == 0)
            return currentConsumer;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("out"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentConsumer = findConsumerInComposition(consumer.eContents, right)

            if (currentConsumer == null) {

                currentConsumer = findConsumerInTemplates(consumer, right);

                if (currentConsumer == null && isValidateConsumer) {
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
