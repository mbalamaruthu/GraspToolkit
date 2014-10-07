package uk.ac.standrews.graspide.grasp.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import uk.ac.standrews.graspide.grasp.graspDSL.Requires;

/**
 * Grasp Hover Provider extension for First line or Heading.
 *
 */
public class GraspHoverProvider extends DefaultEObjectHoverProvider {

    @Override
    protected boolean hasHover(EObject object) {
        if (object instanceof Requires)
            return true;
        return super.hasHover(object);
    }

    @Override
    protected String getFirstLine(EObject object) {
        if (object instanceof Requires) {
            String label = ((Requires)object).getType();
            String name = object.eClass().getName();
            return name+ ((label != null) ? " <b>"+name+" : "+label+"</b>" : "");
        }
        return super.getFirstLine(object);
    }

}
