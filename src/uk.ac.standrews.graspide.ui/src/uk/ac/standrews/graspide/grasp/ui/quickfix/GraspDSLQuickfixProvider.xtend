package uk.ac.standrews.graspide.grasp.ui.quickfix

import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLFactory

import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * Custom quickfixes Extension Point
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class GraspDSLQuickfixProvider extends DefaultQuickfixProvider {

    @Fix(Diagnostic::LINKING_DIAGNOSTIC)
    def void createMissingEntity(Issue issue, IssueResolutionAcceptor acceptor) {
        val String message = issue.message
        //println(message)
        if (message != null) {
            if (message.startsWith("Couldn't resolve reference to Template")) {
                fixCreateTemplateIssue(acceptor, issue);
            } else if (message.startsWith("Couldn't resolve reference to Rationale")) {
                fixCreateRationaleIssue(acceptor, issue);
            } else if (message.startsWith("Couldn't resolve reference to RequirementOrQuality")) {
                fixCreateRequirementOrQualityIssue(acceptor, issue);
            }
        }
    }

    def fixCreateRequirementOrQualityIssue(IssueResolutionAcceptor acceptor, Issue issue) {
        acceptor.accept(
            issue,
            "Create missing Requirement",
            "Create missing Requirement",
            null,
            [ issueElement, issueContext |
                val architecture = issueElement.getContainerOfType(typeof(ArchitectureBody))
                val declarations = architecture.declarationStart.declaration
                declarations.add(
                    declarations.size,
                    GraspDSLFactory::eINSTANCE.createRequirement() => [
                        name = issueContext.xtextDocument.get(issue.offset, issue.length)
                    ]
                )
            ]
        )

        acceptor.accept(
            issue,
            "Create missing Quality Attribute",
            "Create missing Quality Attribute",
            null,
            [ issueElement, issueContext |
                val architecture = issueElement.getContainerOfType(typeof(ArchitectureBody))
                val declarations = architecture.declarationStart.declaration
                declarations.add(
                    declarations.size,
                    GraspDSLFactory::eINSTANCE.createQattribute() => [
                        name = issueContext.xtextDocument.get(issue.offset, issue.length)
                    ]
                )
            ]
        )
    }

    def fixCreateRationaleIssue(IssueResolutionAcceptor acceptor, Issue issue) {
        acceptor.accept(
            issue,
            "Create missing Rationale",
            "Create missing Rationale",
            null,
            [ issueElement, issueContext |
                val architecture = issueElement.getContainerOfType(typeof(ArchitectureBody))
                val declarations = architecture.declarationStart.declaration
                declarations.add(
                    declarations.size,
                    GraspDSLFactory::eINSTANCE.createRationale() => [
                        name = issueContext.xtextDocument.get(issue.offset, issue.length)
                    ]
                )
            ]
        )
    }

    def fixCreateTemplateIssue(IssueResolutionAcceptor acceptor, Issue issue) {
        acceptor.accept(
            issue,
            "Create missing Template",
            "Create missing Template",
            null,
            [ issueElement, issueContext |
                val architecture = issueElement.getContainerOfType(typeof(ArchitectureBody))
                val declarations = architecture.declarationStart.declaration
                declarations.add(
                    declarations.size,
                    GraspDSLFactory::eINSTANCE.createTemplate() => [
                        name = issueContext.xtextDocument.get(issue.offset, issue.length)
                    ]
                )
            ]
        )
    }
}
