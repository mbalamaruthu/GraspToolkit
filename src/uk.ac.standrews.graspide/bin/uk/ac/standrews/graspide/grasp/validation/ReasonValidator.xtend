package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.Reason
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import java.util.HashSet
import java.util.Set

/**
 * Validations for Reason constructs
 */

class ReasonValidator {

    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {
        this.validator = validator;
    }

    def void validateReasons(Reason reason) {
        if (hasBothSupportAndInhibits(reason)) {
            var Set<String> supported = new HashSet<String>();

            for (value : reason.supportsClause.value) {
                if (value != null && value.name != null) {
                    supported.add(value.name)
                }
            }

            for (value : reason.inhibitsClause.value) {
                if (value != null && value.name != null) {

                    if (supported.contains(value.name)) {

                        validator.warning(
                            "Reason Supports and Inhibits the Same Requirement or Quality Attribute '" + value.name +
                                "'", reason, GraspDSLPackage.Literals::REASON__INHIBITS_CLAUSE)
                    }
                }
            }
        }
    }

    private def hasBothSupportAndInhibits(Reason reason) {
        reason.supportsClause != null && reason.inhibitsClause != null && reason.supportsClause.value != null &&
            reason.inhibitsClause.value != null && reason.supportsClause.value.size > 0 &&
            reason.inhibitsClause.value.size > 0
    }

}
