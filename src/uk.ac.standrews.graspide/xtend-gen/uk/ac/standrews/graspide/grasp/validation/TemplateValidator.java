package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Property;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Template constructs
 */
@SuppressWarnings("all")
public class TemplateValidator {
  private GraspDSLValidator validator = null;
  
  public TemplateValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateTemplatesForCycle(final Template template) {
    boolean _or = false;
    String _name = template.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or = true;
    } else {
      Template _superTemplate = template.getSuperTemplate();
      boolean _equals_1 = Objects.equal(_superTemplate, null);
      _or = _equals_1;
    }
    if (_or) {
      return;
    }
    HashSet<String> visitedTemplateNames = CollectionLiterals.<String>newHashSet();
    HashSet<String> visitedConstituentNames = new HashSet<String>();
    this.addConstituentNames(template, visitedConstituentNames, true);
    Template currentTemplate = template.getSuperTemplate();
    boolean _notEquals = (!Objects.equal(currentTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        boolean _and = false;
        String _name_1 = currentTemplate.getName();
        boolean _notEquals_1 = (!Objects.equal(_name_1, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          String _name_2 = template.getName();
          String _name_3 = currentTemplate.getName();
          boolean _equals_2 = _name_2.equals(_name_3);
          _and = _equals_2;
        }
        if (_and) {
          String _name_4 = template.getName();
          String _plus = ("Cycle exist in extends Template \'" + _name_4);
          String _plus_1 = (_plus + "\'");
          this.validator.error(_plus_1, 
            GraspDSLPackage.Literals.TEMPLATE__SUPER_TEMPLATE);
          return;
        }
        this.addConstituentNames(currentTemplate, visitedConstituentNames, false);
        String _name_5 = currentTemplate.getName();
        boolean _add = visitedTemplateNames.add(_name_5);
        boolean _not = (!_add);
        if (_not) {
          return;
        }
        Template _superTemplate_1 = currentTemplate.getSuperTemplate();
        currentTemplate = _superTemplate_1;
      }
      boolean _notEquals_1 = (!Objects.equal(currentTemplate, null));
      _while = _notEquals_1;
    }
  }
  
  private void addConstituentNames(final Template template, final HashSet<String> visitedConstituentNames, final boolean isBaseTemplate) {
    EList<TemplateConstituent> _templateConstituent = template.getTemplateConstituent();
    for (final TemplateConstituent constituent : _templateConstituent) {
      if ((constituent instanceof Template)) {
        boolean _and = false;
        String _name = ((Template)constituent).getName();
        boolean _add = visitedConstituentNames.add(_name);
        boolean _not = (!_add);
        if (!_not) {
          _and = false;
        } else {
          _and = (!isBaseTemplate);
        }
        if (_and) {
          String _name_1 = ((Template)constituent).getName();
          String _plus = ("Redefinition of Element after Inheritance \'" + _name_1);
          String _plus_1 = (_plus + "\'");
          this.validator.info(_plus_1, constituent, 
            GraspDSLPackage.Literals.DECLARATION__NAME);
        }
      } else {
        if ((constituent instanceof Property)) {
          boolean _and_1 = false;
          String _name_2 = ((Property)constituent).getName();
          boolean _add_1 = visitedConstituentNames.add(_name_2);
          boolean _not_1 = (!_add_1);
          if (!_not_1) {
            _and_1 = false;
          } else {
            _and_1 = (!isBaseTemplate);
          }
          if (_and_1) {
            String _name_3 = ((Property)constituent).getName();
            String _plus_2 = ("Redefinition of Element after Inheritance \'" + _name_3);
            String _plus_3 = (_plus_2 + "\'");
            this.validator.info(_plus_3, constituent, 
              GraspDSLPackage.Literals.PROPERTY__NAME);
          }
        } else {
          if ((constituent instanceof Provides)) {
            boolean _and_2 = false;
            String _name_4 = ((Provides)constituent).getName();
            boolean _add_2 = visitedConstituentNames.add(_name_4);
            boolean _not_2 = (!_add_2);
            if (!_not_2) {
              _and_2 = false;
            } else {
              _and_2 = (!isBaseTemplate);
            }
            if (_and_2) {
              String _name_5 = ((Provides)constituent).getName();
              String _plus_4 = ("Redefinition of Element after Inheritance \'" + _name_5);
              String _plus_5 = (_plus_4 + "\'");
              this.validator.info(_plus_5, constituent, 
                GraspDSLPackage.Literals.LINK_PROVIDER_PART__NAME);
            }
          } else {
            if ((constituent instanceof Requires)) {
              String _type = ((Requires)constituent).getType();
              boolean _add_3 = visitedConstituentNames.add(_type);
              boolean _not_3 = (!_add_3);
              if (_not_3) {
                if (isBaseTemplate) {
                  String _type_1 = ((Requires)constituent).getType();
                  String _plus_6 = ("Duplicate identifier \'" + _type_1);
                  String _plus_7 = (_plus_6 + "\'");
                  this.validator.error(_plus_7, constituent, 
                    GraspDSLPackage.Literals.REQUIRES__TYPE);
                } else {
                  String _type_2 = ((Requires)constituent).getType();
                  String _plus_8 = ("Redefinition of Element after Inheritance \'" + _type_2);
                  String _plus_9 = (_plus_8 + "\'");
                  this.validator.info(_plus_9, constituent, 
                    GraspDSLPackage.Literals.REQUIRES__TYPE);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void validateSelfReferenceTemplates(final Template template) {
    boolean _or = false;
    boolean _or_1 = false;
    String _name = template.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or_1 = true;
    } else {
      Template _superTemplate = template.getSuperTemplate();
      boolean _equals_1 = Objects.equal(_superTemplate, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      Template _superTemplate_1 = template.getSuperTemplate();
      String _name_1 = _superTemplate_1.getName();
      boolean _equals_2 = Objects.equal(_name_1, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    String _name_2 = template.getName();
    Template _superTemplate_2 = template.getSuperTemplate();
    String _name_3 = _superTemplate_2.getName();
    boolean _equals_3 = _name_2.equals(_name_3);
    if (_equals_3) {
      String _name_4 = template.getName();
      String _plus = ("Template cannot Extend itself \'" + _name_4);
      String _plus_1 = (_plus + "\'");
      this.validator.error(_plus_1, 
        GraspDSLPackage.Literals.TEMPLATE__SUPER_TEMPLATE);
    }
  }
  
  public void addTemplateUsagesInComponents(final Component component, final Set<String> templateSet) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(component, null);
    if (_equals) {
      _or_1 = true;
    } else {
      Template _value = component.getValue();
      boolean _equals_1 = Objects.equal(_value, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      Template _value_1 = component.getValue();
      String _name = _value_1.getName();
      boolean _equals_2 = Objects.equal(_name, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    Template _value_2 = component.getValue();
    String _name_1 = _value_2.getName();
    templateSet.add(_name_1);
  }
  
  public void addTemplateUsagesInConnectors(final Connector connector, final Set<String> templateSet) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(connector, null);
    if (_equals) {
      _or_1 = true;
    } else {
      Template _value = connector.getValue();
      boolean _equals_1 = Objects.equal(_value, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      Template _value_1 = connector.getValue();
      String _name = _value_1.getName();
      boolean _equals_2 = Objects.equal(_name, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    Template _value_2 = connector.getValue();
    String _name_1 = _value_2.getName();
    templateSet.add(_name_1);
  }
  
  public void validateTemplateUsage(final DeclarationEnd declarationEnd, final Set<String> templateSet) {
    EObject _eContainer = declarationEnd.eContainer();
    ArchitectureBody architectureBody = ((ArchitectureBody) _eContainer);
    EList<Declaration> declarationsAtEnd = declarationEnd.getDeclaration();
    DeclarationStart _declarationStart = architectureBody.getDeclarationStart();
    EList<Declaration> declarationsAtStart = _declarationStart.getDeclaration();
    List<Template> templateDeclaration = new ArrayList<Template>();
    this.getTemplateDeclarations(declarationsAtStart, templateDeclaration);
    this.getTemplateDeclarations(declarationsAtEnd, templateDeclaration);
    this.removeInheritedTemplates(templateDeclaration);
    for (final Template template : templateDeclaration) {
      boolean _and = false;
      String _name = template.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name_1 = template.getName();
        boolean _contains = templateSet.contains(_name_1);
        boolean _not = (!_contains);
        _and = _not;
      }
      if (_and) {
        String _name_2 = template.getName();
        String _plus = ("Template \'" + _name_2);
        String _plus_1 = (_plus + "\' is not initialised by a component or connector");
        this.validator.warning(_plus_1, template, 
          GraspDSLPackage.Literals.DECLARATION__NAME);
      }
    }
  }
  
  private void getTemplateDeclarations(final EList<Declaration> declarations, final List<Template> templates) {
    boolean _notEquals = (!Objects.equal(declarations, null));
    if (_notEquals) {
      for (final Declaration declaration : declarations) {
        if ((declaration instanceof Template)) {
          templates.add(((Template)declaration));
        }
      }
    }
  }
  
  private void removeInheritedTemplates(final List<Template> templates) {
    List<Template> templateCopy = new ArrayList<Template>(templates);
    for (final Template current : templateCopy) {
      {
        boolean foundAsSuper = false;
        String currentName = current.getName();
        boolean _notEquals = (!Objects.equal(currentName, null));
        if (_notEquals) {
          for (final Template template : templates) {
            {
              String templateName = template.getName();
              Template superTemplate = template.getSuperTemplate();
              boolean _and = false;
              boolean _and_1 = false;
              boolean _notEquals_1 = (!Objects.equal(superTemplate, null));
              if (!_notEquals_1) {
                _and_1 = false;
              } else {
                boolean _equals = currentName.equals(templateName);
                boolean _not = (!_equals);
                _and_1 = _not;
              }
              if (!_and_1) {
                _and = false;
              } else {
                String _name = superTemplate.getName();
                boolean _equals_1 = currentName.equals(_name);
                _and = _equals_1;
              }
              if (_and) {
                foundAsSuper = true;
              }
            }
          }
        }
        if (foundAsSuper) {
          templates.remove(current);
        }
      }
    }
  }
}
