package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.Rationale
import java.util.ArrayList
import java.util.List
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration
import org.eclipse.emf.common.util.EList
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import java.util.Set
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture
import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

/**
 * Validations for Rationale constructs
 */

class RationaleValidator {
    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {

        this.validator = validator;

    }

    def addRationaleUsage(Architecture architecture, Set<String> rationaleSet) {
        var allContents = architecture.allContentsIterable.filter(typeof(BecauseCausalcontext));

        for (causalContext : allContents) {
            if (causalContext != null && causalContext.value != null && causalContext.value.name != null) {
                rationaleSet.add(causalContext.value.name)
            }
        }
    }

    def void validateRationaleUsages(DeclarationEnd declarationEnd, Set<String> rationaleSet) {
        var architectureBody = declarationEnd.eContainer as ArchitectureBody;

        var declarationsAtEnd = declarationEnd.declaration;
        var declarationsAtStart = architectureBody.declarationStart.declaration;

        var List<Rationale> rationaleDeclaration = new ArrayList<Rationale>();
        getRationaleDeclarations(declarationsAtStart, rationaleDeclaration)
        getRationaleDeclarations(declarationsAtEnd, rationaleDeclaration)

        removeInheritedRationales(rationaleDeclaration)

        for (rationale : rationaleDeclaration) {

            if (rationale.name != null && !rationaleSet.contains(rationale.name)) {
                validator.warning(
                    "Rationale '" + rationale.name + "' is not Realized by any Elements",
                    rationale,
                    GraspDSLPackage.Literals::DECLARATION__NAME
                )
            }
        }
    }

     def validateEmptyRationales(Rationale rationale) {
        if (rationale.name == null ) {
            return
        }

        if (rationale.reason == null || rationale.reason.size == 0) {
            validator.info(
                "Rationale '" + rationale.name + "' does not contain any reasons", rationale,
                GraspDSLPackage.Literals::RATIONALE__REASON
            )
        }
    }

    def validateSelfReferenceRationale(Rationale rationale) {
        if (rationale.name == null || rationale.superRationale == null || rationale.superRationale.name == null) {
            return
        }

        if (rationale.name.equals(rationale.superRationale.name)) {
            validator.error(
                "Rationale '" + rationale.name + "' cannot Extend itself",
                GraspDSLPackage.Literals::RATIONALE__SUPER_RATIONALE
            )
        }
    }

    def validatorRationaleForcycle(Rationale rationale) {
        if (rationale.name == null || rationale.superRationale == null || rationale.superRationale.name == null) {
            return
        }

        var visitedRationaleNames = newHashSet();

        var currentRationale = rationale.superRationale;



        while (currentRationale != null) {


            if(currentRationale.name != null && rationale.name.equals(currentRationale.name))
            {
                validator.error(
                    "Cycle exist in extends Rationale '" + rationale.name + "'",
                    GraspDSLPackage.Literals::RATIONALE__SUPER_RATIONALE
                )
                return;

            }
            if(!visitedRationaleNames.add(currentRationale.name))
                return;
            currentRationale = currentRationale.superRationale;
        }
    }

    private def removeInheritedRationales(List<Rationale> rationales) {
        var List<Rationale> rationaleCopy = new ArrayList<Rationale>(rationales);

        for (current : rationaleCopy) {

            var boolean foundAsSuper = false;
            var currentName = current.name;

            if (currentName != null) {

                for (rationale : rationales) {

                    var rationaleName = rationale.name;
                    var superRationale = rationale.superRationale;
                    if (superRationale != null && !currentName.equals(rationaleName) &&
                        currentName.equals(superRationale.name))
                        foundAsSuper = true;
                }
            }

            if (foundAsSuper) {
                rationales.remove(current);
            }
        }
    }

    private def getRationaleDeclarations(EList<Declaration> declarations, List<Rationale> rationaleDeclaration) {
        if (declarations != null) {
            for (declaration : declarations) {

                if (declaration instanceof Rationale) {
                    rationaleDeclaration.add(declaration);
                }
            }
        }
    }

}
