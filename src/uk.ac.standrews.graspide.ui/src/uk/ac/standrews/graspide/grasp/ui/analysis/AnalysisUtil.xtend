package uk.ac.standrews.graspide.grasp.ui.analysis

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
import uk.ac.standrews.graspide.grasp.graspDSL.System
import java.util.List
import java.util.ArrayList
import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector

/**
 * Common Analysis utility functions
 */
class AnalysisUtil {

    private static System architectureSystem;

    def static setArchitectureSystem(System system){
        architectureSystem = system;
    }

    def static findElementInComposition(EList<EObject> contents, String elementName) {

        var EObject lastComponent = null

        if (contents == null)
            return lastComponent;

        for (content : contents) {

            if (lastComponent != null)
                return lastComponent;

            if (content instanceof LinkProviderPart) {
                if (content.name != null && content.name.equals(elementName)) {
                    lastComponent = content;
                }
            }
        }

        return lastComponent
    }

    def static List<EObject> getAllElements(System system){
        architectureSystem = system;

        var List<EObject> allElements = new ArrayList<EObject>();

        var iterableContents = architectureSystem.allContentsIterable
        allElements.addAll(iterableContents.filter(typeof(Component)));
        allElements.addAll(iterableContents.filter(typeof(Connector)));

        return allElements;

    }

    def static EObject getElementFromName(String fullName){

        var EObject element = null;

        if(fullName.nullOrEmpty)
            return element;

        var EObject currentElement = architectureSystem;

        var String[] names = fullName.split("\\.");

        for(name:names){
            element = findElementInComposition(currentElement.eContents , name)
            currentElement = element;
            if(element == null)
                return element;
        }

        return element;
    }

    def static String getElementFullName(EObject element) {

        var StringBuilder fullname = new StringBuilder();
        fullname.append((element as LinkProviderPart).name);
        var currentElement = element.eContainer;

        while (currentElement instanceof LinkProviderPart) {

            fullname.insert(0, currentElement.name + ".");
            currentElement = currentElement.eContainer;
        }
        return fullname.toString();
    }
}
