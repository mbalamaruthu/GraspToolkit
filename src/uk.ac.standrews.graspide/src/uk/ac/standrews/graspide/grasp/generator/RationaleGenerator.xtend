package uk.ac.standrews.graspide.grasp.generator

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext
import uk.ac.standrews.graspide.grasp.graspDSL.Component
import uk.ac.standrews.graspide.grasp.graspDSL.Connector
import uk.ac.standrews.graspide.grasp.graspDSL.Layer
import uk.ac.standrews.graspide.grasp.graspDSL.Link
import uk.ac.standrews.graspide.grasp.graspDSL.Provides
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale
import uk.ac.standrews.graspide.grasp.graspDSL.Requires

/**
 * Generator Class for Rationales in architecture.
 *
 */

class RationaleGenerator {
    def static void extractAndSetRationales(EObject object) {
        var List<BecauseCausalcontext> becauseClauseList;
        becauseClauseList = getBecauseList(object)
        var List<Rationale> rationales = new ArrayList<Rationale>();

        addRationalesFromBecauseList(becauseClauseList, rationales)
        ContentGenerator.setRationales(rationales);
    }

    def static addRationalesFromBecauseList(List<BecauseCausalcontext> becauseClauseList, List<Rationale> rationales) {
        if (becauseClauseList == null || becauseClauseList.size == 0)
            return;
        for (becauseClause : becauseClauseList) {
            rationales.add(becauseClause.value);
        }
    }

    def static getBecauseList(EObject object) {
        if (object instanceof Provides) {
            if (object.becauseClause != null)
                return object.becauseClause.members;
        } else if (object instanceof Component) {
            if (object.becauseClause != null)
                return object.becauseClause.members;
        } else if (object instanceof Connector) {
            if (object.becauseClause != null)
                return object.becauseClause.members;
        } else if (object instanceof Layer) {
            if (object.becauseClause != null)
                return object.becauseClause.members;
        }  else if (object instanceof Link) {
            if (object.becauseClause != null)
                return object.becauseClause.members;
        }
        return null;
    }

    def static void extractAndSetRationales(List<Link> linkList) {

        var List<Rationale> rationales = new ArrayList<Rationale>();
        for (link : linkList) {
            var becauseList = getBecauseList(link);
            addRationalesFromBecauseList(becauseList, rationales)
        }

        ContentGenerator.setRationales(rationales);

        rationales = new ArrayList<Rationale>();

        if (linkList.size > 0) {
            var Link link = linkList.get(0);
            val GeneratorUtil utility = new GeneratorUtil();
            val EObject lastConsumer = utility.getLastConsumer(link.linkConsumer, false);
            if (lastConsumer instanceof Requires) {
                if (lastConsumer.becauseRequiresClause != null) {
                    val becauseList = lastConsumer.becauseRequiresClause.members;
                    addRationalesFromBecauseList(becauseList, rationales)
                }
            }
        }

        ContentGenerator.setRequiredRationales(rationales);
    }
}
