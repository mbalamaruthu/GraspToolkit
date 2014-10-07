package uk.ac.standrews.graspide.grasp.ui.analysis

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList
import uk.ac.standrews.graspide.grasp.graspDSL.Requires

/**
 * Analysis utility class that identifies Affects chain of the given element.
 */

class AffectsAnalysisUtil {

    def List<LinkConsumerExpression> getAffectsElements(EObject rootElement) {
        val List<LinkConsumerExpression> consumerObjects = new ArrayList<LinkConsumerExpression>();
        var currentElement = rootElement;

        while (currentElement != null && currentElement instanceof LinkProviderPart) {

            var Iterable<Link> links = currentElement.eContainer.eContents.filter(typeof(Link));
            for (link : links) {

                if (isDependencyExistsForElement(link.linkProviders, rootElement)) {
                    consumerObjects.addAll(link.linkConsumer);
                }
            }
            currentElement = currentElement.eContainer;
        }

        return consumerObjects;

    }

    def private isDependencyExistsForElement(LinkProvidersList providerList, EObject rootElement) {

        if (providerList == null || rootElement == null)
            return false;
        for (providers : providerList.providers) {
            if (isProviderDependencyExistsForElement(providers, rootElement)) {
                return true;

            }
        }

        return false;

    }

    def private isProviderDependencyExistsForElement(LinkProviders providers, EObject rootElement) {
        if (providers == null)
            return false;

        var EObject provider = providers.provider;
        var Iterable<String> rightList = providers.rightProvider;

        var EObject currentProvider = provider;

        if (provider != null && provider.equals(rootElement))
            return true;

        if (rightList == null || rightList.size == 0)
            return false;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("in"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentProvider = AnalysisUtil.findElementInComposition(provider.eContents, right)

            if (currentProvider == null) {
                return false;
            } else if (currentProvider instanceof LinkProviderPart && currentProvider.equals(rootElement)) {
                return true;
            }
            provider = currentProvider;
        }
        return false;

    }

    def EObject getLastConsumerPartElement(LinkConsumerExpression consumerExpression) {

        if (consumerExpression == null)
            return null;

        var EObject consumer = consumerExpression.consumer;
        var Iterable<String> rightList = consumerExpression.rightConsumer;

        var EObject currentConsumer = consumer;

        if (consumer == null || rightList == null || rightList.size == 0)
            return consumer;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("out"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentConsumer = AnalysisUtil.findElementInComposition(consumer.eContents, right)

            if (currentConsumer == null || currentConsumer instanceof Requires) {
                return consumer;
            }
            consumer = currentConsumer;
        }

        return consumer;
    }

}
