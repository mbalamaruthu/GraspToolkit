/*
* generated by Xtext
*/
package uk.ac.standrews.graspide.grasp.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import uk.ac.standrews.graspide.grasp.graspDSL.Annotation
import uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause
import uk.ac.standrews.graspide.grasp.graspDSL.Check
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.Property
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute
import uk.ac.standrews.graspide.grasp.graspDSL.Reason
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class GraspDSLOutlineTreeProvider extends DefaultOutlineTreeProvider {

    def _isLeaf(Link ele) {
        true
    }

    def _isLeaf(Reason ele) {
        true
    }

    def _isLeaf(Check ele) {
        true
    }

    def _isLeaf(Annotation ele) {
        true
    }
    def _isLeaf(ArgumentList ele) {
        true
    }

     def _isLeaf(Qattribute ele) {
        true
    }

     def _isLeaf(Requirement ele) {
        true
    }

 def _isLeaf(BecauseClause ele) {
        true
    }
    def _isLeaf(Property ele) {
        true
    }
}
