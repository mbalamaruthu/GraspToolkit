package uk.ac.standrews.graspide.grasp.ui.quickfix;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLFactory;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;

/**
 * Custom quickfixes Extension Point
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
@SuppressWarnings("all")
public class GraspDSLQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(Diagnostic.LINKING_DIAGNOSTIC)
  public void createMissingEntity(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String message = issue.getMessage();
    boolean _notEquals = (!Objects.equal(message, null));
    if (_notEquals) {
      boolean _startsWith = message.startsWith("Couldn\'t resolve reference to Template");
      if (_startsWith) {
        this.fixCreateTemplateIssue(acceptor, issue);
      } else {
        boolean _startsWith_1 = message.startsWith("Couldn\'t resolve reference to Rationale");
        if (_startsWith_1) {
          this.fixCreateRationaleIssue(acceptor, issue);
        } else {
          boolean _startsWith_2 = message.startsWith("Couldn\'t resolve reference to RequirementOrQuality");
          if (_startsWith_2) {
            this.fixCreateRequirementOrQualityIssue(acceptor, issue);
          }
        }
      }
    }
  }
  
  public void fixCreateRequirementOrQualityIssue(final IssueResolutionAcceptor acceptor, final Issue issue) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject issueElement, final IModificationContext issueContext) throws Exception {
        final ArchitectureBody architecture = EcoreUtil2.<ArchitectureBody>getContainerOfType(issueElement, ArchitectureBody.class);
        DeclarationStart _declarationStart = architecture.getDeclarationStart();
        final EList<Declaration> declarations = _declarationStart.getDeclaration();
        int _size = declarations.size();
        Requirement _createRequirement = GraspDSLFactory.eINSTANCE.createRequirement();
        final Procedure1<Requirement> _function = new Procedure1<Requirement>() {
          public void apply(final Requirement it) {
            try {
              IXtextDocument _xtextDocument = issueContext.getXtextDocument();
              Integer _offset = issue.getOffset();
              Integer _length = issue.getLength();
              String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
              it.setName(_get);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        Requirement _doubleArrow = ObjectExtensions.<Requirement>operator_doubleArrow(_createRequirement, _function);
        declarations.add(_size, _doubleArrow);
      }
    };
    acceptor.accept(issue, 
      "Create missing Requirement", 
      "Create missing Requirement", 
      null, _function);
    final ISemanticModification _function_1 = new ISemanticModification() {
      public void apply(final EObject issueElement, final IModificationContext issueContext) throws Exception {
        final ArchitectureBody architecture = EcoreUtil2.<ArchitectureBody>getContainerOfType(issueElement, ArchitectureBody.class);
        DeclarationStart _declarationStart = architecture.getDeclarationStart();
        final EList<Declaration> declarations = _declarationStart.getDeclaration();
        int _size = declarations.size();
        Qattribute _createQattribute = GraspDSLFactory.eINSTANCE.createQattribute();
        final Procedure1<Qattribute> _function = new Procedure1<Qattribute>() {
          public void apply(final Qattribute it) {
            try {
              IXtextDocument _xtextDocument = issueContext.getXtextDocument();
              Integer _offset = issue.getOffset();
              Integer _length = issue.getLength();
              String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
              it.setName(_get);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        Qattribute _doubleArrow = ObjectExtensions.<Qattribute>operator_doubleArrow(_createQattribute, _function);
        declarations.add(_size, _doubleArrow);
      }
    };
    acceptor.accept(issue, 
      "Create missing Quality Attribute", 
      "Create missing Quality Attribute", 
      null, _function_1);
  }
  
  public void fixCreateRationaleIssue(final IssueResolutionAcceptor acceptor, final Issue issue) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject issueElement, final IModificationContext issueContext) throws Exception {
        final ArchitectureBody architecture = EcoreUtil2.<ArchitectureBody>getContainerOfType(issueElement, ArchitectureBody.class);
        DeclarationStart _declarationStart = architecture.getDeclarationStart();
        final EList<Declaration> declarations = _declarationStart.getDeclaration();
        int _size = declarations.size();
        Rationale _createRationale = GraspDSLFactory.eINSTANCE.createRationale();
        final Procedure1<Rationale> _function = new Procedure1<Rationale>() {
          public void apply(final Rationale it) {
            try {
              IXtextDocument _xtextDocument = issueContext.getXtextDocument();
              Integer _offset = issue.getOffset();
              Integer _length = issue.getLength();
              String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
              it.setName(_get);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        Rationale _doubleArrow = ObjectExtensions.<Rationale>operator_doubleArrow(_createRationale, _function);
        declarations.add(_size, _doubleArrow);
      }
    };
    acceptor.accept(issue, 
      "Create missing Rationale", 
      "Create missing Rationale", 
      null, _function);
  }
  
  public void fixCreateTemplateIssue(final IssueResolutionAcceptor acceptor, final Issue issue) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject issueElement, final IModificationContext issueContext) throws Exception {
        final ArchitectureBody architecture = EcoreUtil2.<ArchitectureBody>getContainerOfType(issueElement, ArchitectureBody.class);
        DeclarationStart _declarationStart = architecture.getDeclarationStart();
        final EList<Declaration> declarations = _declarationStart.getDeclaration();
        int _size = declarations.size();
        Template _createTemplate = GraspDSLFactory.eINSTANCE.createTemplate();
        final Procedure1<Template> _function = new Procedure1<Template>() {
          public void apply(final Template it) {
            try {
              IXtextDocument _xtextDocument = issueContext.getXtextDocument();
              Integer _offset = issue.getOffset();
              Integer _length = issue.getLength();
              String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
              it.setName(_get);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        Template _doubleArrow = ObjectExtensions.<Template>operator_doubleArrow(_createTemplate, _function);
        declarations.add(_size, _doubleArrow);
      }
    };
    acceptor.accept(issue, 
      "Create missing Template", 
      "Create missing Template", 
      null, _function);
  }
}
