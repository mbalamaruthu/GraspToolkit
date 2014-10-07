package uk.ac.standrews.graspide.grasp.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.graspDSL.System;
import uk.ac.standrews.graspide.grasp.ui.hover.GraspElementsDocumentation;


/**
 * Grasp Hover Documentation Provider Extension Point for description contents.
 *
 */
public class GraspDocumentationProvider implements IEObjectDocumentationProvider
 {

    public String getDocumentation(EObject object) {

        if(object instanceof Architecture){
            return GraspElementsDocumentation.getArchitectureText();
        }

        if(object instanceof System){
            return GraspElementsDocumentation.getSystemText();
        }

        if(object instanceof Layer){
            return GraspElementsDocumentation.getLayerText();
        }

        if(object instanceof Component){
            return GraspElementsDocumentation.getComponentText();
        }

        if(object instanceof Connector){
            return GraspElementsDocumentation.getConnectorText();
        }

        if(object instanceof Link){
            return GraspElementsDocumentation.getLinkText();
        }

        if(object instanceof Template){
            return GraspElementsDocumentation.getTemplateText();
        }

        if(object instanceof Rationale){
            return GraspElementsDocumentation.getRationaleText();
        }

        if(object instanceof Reason){
            return GraspElementsDocumentation.getReasonText();
        }

        if(object instanceof Provides){
            return GraspElementsDocumentation.getProvideText();
        }

        if(object instanceof Requires){
            return GraspElementsDocumentation.getRequireText();
        }

        if(object instanceof Requirement){
            return GraspElementsDocumentation.getRequirementText();
        }

        if(object instanceof Qattribute){
            return GraspElementsDocumentation.getQualityText();
        }
        return "";
    }

}
