package uk.ac.standrews.graspide.grasp.validation

import uk.ac.standrews.graspide.grasp.graspDSL.Declaration
import org.eclipse.emf.common.util.EList
import uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality
import java.util.List
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
import java.util.ArrayList
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import java.util.Set
import java.util.HashSet
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture
import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

/**
 * Validations for Quality attribute and requirement constructs
 */

class QualityRequirementValidator {
    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {

        this.validator = validator;

    }

    def void validateDuplicateRequirementsInhibits(InhibitsClause inhibitClause) {
        if (inhibitClause.value != null && inhibitClause.value.size > 0) {

            var Set<String> inhibited = new HashSet<String>();

            for (value : inhibitClause.value) {

                if (value != null && value.name != null) {

                    if (!inhibited.add(value.name)) {
                        validator.error(
                            "Duplicates in Inhibited Requirement or Quality Attribute '" + value.name +
                                "'", inhibitClause,
                            GraspDSLPackage.Literals::INHIBITS_CLAUSE__VALUE)
                    }
                }
            }
        }
    }

    def void validateQualityReqUsages(DeclarationEnd declarationEnd, Set<String> qualityReqSet) {
        var architectureBody = declarationEnd.eContainer as ArchitectureBody;

        var declarationsAtEnd = declarationEnd.declaration;
        var declarationsAtStart = architectureBody.declarationStart.declaration;

        var List<RequirementOrQuality> qualityorReqDeclarations = new ArrayList<RequirementOrQuality>();
        getQualityOrReqDeclarations(declarationsAtStart, qualityorReqDeclarations)
        getQualityOrReqDeclarations(declarationsAtEnd, qualityorReqDeclarations)

        for (qualityReq : qualityorReqDeclarations) {

            if (qualityReq.name != null && !qualityReqSet.contains(qualityReq.name)) {
                validator.warning(
                    "Requirement or Quality Attribute '" + qualityReq.name + "' is not supported by any Elements",
                    qualityReq,
                    GraspDSLPackage.Literals::DECLARATION__NAME
                )
            }
        }
    }

    def validateDuplicateRequirementsSupport(SupportsClause supportClause) {
        if (supportClause.value != null && supportClause.value.size > 0) {

            var Set<String> supported = new HashSet<String>();

            for (value : supportClause.value) {

                if (value != null && value.name != null) {

                    if (!supported.add(value.name)) {
                        validator.error(
                            "Duplicates in Supported Requirement or Quality Attribute '" + value.name +
                                "'", supportClause,
                            GraspDSLPackage.Literals::SUPPORTS_CLAUSE__VALUE)
                    }
                }
            }
        }
    }

    def validateQattributeSupport(Qattribute qattribute) {
        if (isInvalidQAttributeWithoutSupportsClause(qattribute)) {
            return
        }
        var currentName = qattribute.name;

        for (content : qattribute.supportsClause.value) {

            if (content instanceof Qattribute && content.name != null && content.name.equals(currentName)) {
                validator.warning("Quality Attribute cannot support itself '" + content.name + "'", content,
                    GraspDSLPackage.Literals::QATTRIBUTE__SUPPORTS_CLAUSE)

            }
        }
    }

    def addReqorQattributeUsages(Architecture architecture, Set<String> qualityReqSet) {

        var allContents = architecture.allContentsIterable.filter(typeof(SupportsClause));

        for (supportClause : allContents) {
            if (supportClause != null && supportClause.value != null && supportClause.value.size != 0)
                for (content : supportClause.value)
                    qualityReqSet.add(content.name)
        }
    }

    private def isInvalidQAttributeWithoutSupportsClause(Qattribute qattribute) {
        qattribute == null || qattribute.name == null || qattribute.supportsClause == null ||
            qattribute.supportsClause.value == null || qattribute.supportsClause.value.size == 0
    }

    private def getQualityOrReqDeclarations(EList<Declaration> declarations,
        List<RequirementOrQuality> qualityRequirements) {
        if (declarations != null) {
            for (declaration : declarations) {

                if (declaration instanceof RequirementOrQuality) {
                    qualityRequirements.add(declaration);
                }
            }
        }
    }
}
