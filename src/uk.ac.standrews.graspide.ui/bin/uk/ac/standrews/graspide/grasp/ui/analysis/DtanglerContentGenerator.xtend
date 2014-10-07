package uk.ac.standrews.graspide.grasp.ui.analysis

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart

import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

/**
 * Dtangler dependency files content generator using Xtend Templates
 */
class DtanglerContentGenerator {
    AffectsAnalysisUtil affectsAnalysisUtil = new AffectsAnalysisUtil();

    def CharSequence getFlatMatrixContents(Architecture architecture) {
        var StringBuilder contentBuilder = new StringBuilder();
        var allContents = architecture.architecutrebody.system.allContentsIterable;
        for (content : allContents) {

            if (content instanceof Component || content instanceof Connector) {
                var dependentElements = affectsAnalysisUtil.getAffectsElements(content);
                var fullName = AnalysisUtil.getElementFullName(content);

                if (dependentElements.nullOrEmpty) {
                    contentBuilder.append("{").append(fullName).append("}\n");
                } else {
                    for (element : dependentElements) {
                        contentBuilder.append("{").append(fullName).append("}");
                        var providerElement = affectsAnalysisUtil.getLastConsumerPartElement(element);
                        var elementFullName = AnalysisUtil.getElementFullName(providerElement);
                        contentBuilder.append(" : {").append(elementFullName).append("}\n")
                    }
                }

            }
        }

        contentBuilder.toString();
    }

    def CharSequence getScopedMatrixContents(Architecture architecture) {
        var StringBuilder contentBuilder = new StringBuilder();
        var List<EObject> elementsQueue1 = architecture.architecutrebody.system.eContents;
        var List<EObject> elementsQueue2 = new ArrayList<EObject>();
        var currentQueue = elementsQueue1;
        var nextQueue = elementsQueue2;
        var boolean firstStack = true;
        var long level = 0;
        while (!elementsQueue1.nullOrEmpty || !elementsQueue2.nullOrEmpty) {
            if (firstStack) {
                firstStack = false;
                currentQueue = elementsQueue1;
                elementsQueue2 = new ArrayList<EObject>();
                nextQueue = elementsQueue2;
            } else {
                firstStack = true;
                currentQueue = elementsQueue2;
                elementsQueue1 = new ArrayList<EObject>();
                nextQueue = elementsQueue1;
            }

            for (content : currentQueue) {

                if (content instanceof LinkProviderPart) {
                    nextQueue.addAll(content.eContents);
                    var dependentElements = affectsAnalysisUtil.getAffectsElements(content);
                    var consumerElementFullName = AnalysisUtil.getElementFullName(content);
                    var consumerLevelName = getLevelName(consumerElementFullName, level);

                    if (dependentElements.nullOrEmpty) {
                        contentBuilder.append(level + 1).append(" {").append(consumerLevelName).append("}\n");
                    } else {
                        for (element : dependentElements) {
                            contentBuilder.append(level + 1).append(" {").append(consumerLevelName).append("}");
                            var providerElement = affectsAnalysisUtil.getLastConsumerPartElement(element);

                                val providerElementFullName = AnalysisUtil.getElementFullName(providerElement);
                                val providerLevelName = getLevelName(providerElementFullName, level);
                                if (!providerLevelName.nullOrEmpty) {
                                contentBuilder.append(" : ").append(level + 1).append(" {").append(providerLevelName).
                                    append("}\n")

                            } else {
                                contentBuilder.append("\n");
                            }

                        }
                    }
                }
            }
            level = level + 1;

        }

        contentBuilder.toString();
    }

    def String getLevelName(String fullName, long maxLevel) {
        var StringBuilder nameBuilder = new StringBuilder();
        var String[] splitNames = fullName.split("\\.");
        if (splitNames.length < maxLevel + 1)
            return nameBuilder.toString();

        nameBuilder.append(splitNames.get(0));
        var int level = 0;
        while (level < maxLevel) {
            nameBuilder.append(" ").append(splitNames.get(level + 1))
            level = level + 1;
        }

        return nameBuilder.toString();

    }

}
