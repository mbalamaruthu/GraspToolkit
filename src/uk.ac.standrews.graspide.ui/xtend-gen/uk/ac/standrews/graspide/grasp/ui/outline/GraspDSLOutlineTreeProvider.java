/**
 * generated by Xtext
 */
package uk.ac.standrews.graspide.grasp.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Check;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.Property;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class GraspDSLOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final Link ele) {
    return true;
  }
  
  public boolean _isLeaf(final Reason ele) {
    return true;
  }
  
  public boolean _isLeaf(final Check ele) {
    return true;
  }
  
  public boolean _isLeaf(final Annotation ele) {
    return true;
  }
  
  public boolean _isLeaf(final ArgumentList ele) {
    return true;
  }
  
  public boolean _isLeaf(final Qattribute ele) {
    return true;
  }
  
  public boolean _isLeaf(final Requirement ele) {
    return true;
  }
  
  public boolean _isLeaf(final BecauseClause ele) {
    return true;
  }
  
  public boolean _isLeaf(final Property ele) {
    return true;
  }
}