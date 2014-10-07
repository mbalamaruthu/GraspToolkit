package uk.ac.standrews.graspide.grasp.ui.analysis

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.generator.GeneratorUtil
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders
import uk.ac.standrews.graspide.grasp.graspDSL.Provides
import uk.ac.standrews.graspide.grasp.graspDSL.Requires


/**
 * Analysis utility class that identifies Affected by chain of the given element.
 */

public class AffectedByAnalysisUtil {

    def List<LinkProviders> getAffectedBys(EObject rootElement) {

        val List<LinkProviders> providedObjects = new ArrayList<LinkProviders>();
        var currentElement = rootElement;

        while (currentElement != null && currentElement instanceof LinkProviderPart) {

            var Iterable<Link> links = currentElement.eContainer.eContents.filter(typeof(Link));
            for (link : links) {

                if (isDependencyExistsForElement(link.linkConsumer, rootElement)) {
                    providedObjects.addAll(link.linkProviders.providers);
                }
            }
            currentElement = currentElement.eContainer;
        }

        return providedObjects;
    }

    def String getConsumerFullName(LinkConsumerExpression consumerExpression) {

        val consumer = consumerExpression.consumer;
        var StringBuilder consumerName = new StringBuilder();
        consumerName.append(AnalysisUtil.getElementFullName(consumer));

        var Iterable<String> rightList = consumerExpression.rightConsumer;
        if (rightList != null && rightList.size > 0) {

            if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("in"))
                rightList = rightList.take(rightList.size - 1)

            val utility = new GeneratorUtil();
            val lastConsumer = utility.getLastConsumer(consumerExpression, false);

            if (lastConsumer instanceof Requires) {
                rightList = rightList.take(rightList.size - 1)
            }

            for (right : rightList) {
                consumerName.append(".").append(right);
            }
        }
        return consumerName.toString();

    }

    private def boolean isDependencyExistsForElement(LinkConsumerExpression expression, EObject element) {
        if (expression == null)
            return false;

        var EObject consumer = expression.consumer;
        var Iterable<String> rightList = expression.rightConsumer;

        var EObject currentConsumer = consumer;

        if (consumer != null && consumer.equals(element))
            return true;

        if (rightList == null || rightList.size == 0)
            return false;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("out"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentConsumer = AnalysisUtil.findElementInComposition(consumer.eContents, right)

            if (currentConsumer == null) {
                return false;
            } else if (currentConsumer instanceof LinkProviderPart && currentConsumer.equals(element)) {
                return true;
            }
            consumer = currentConsumer;
        }
        return false;
    }

    def EObject getLastProviderPartElement(LinkProviders providers) {

        if (providers == null)
            return null;

        var EObject provider = providers.provider;
        var Iterable<String> rightList = providers.rightProvider;

        var EObject currentProvider = provider;

        if (provider == null || rightList == null || rightList.size == 0)
            return provider;

        if (rightList.get(rightList.size - 1) != null && rightList.get(rightList.size - 1).equals("in"))
            rightList = rightList.take(rightList.size - 1)

        for (right : rightList) {

            currentProvider = AnalysisUtil.findElementInComposition(provider.eContents, right)

            if (currentProvider == null || currentProvider instanceof Provides) {
                return provider;
            }
            provider = currentProvider;
        }

        return provider;
    }

}
