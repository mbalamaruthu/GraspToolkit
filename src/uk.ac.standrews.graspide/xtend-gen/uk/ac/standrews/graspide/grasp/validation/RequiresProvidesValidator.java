package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import uk.ac.standrews.graspide.grasp.generator.GeneratorUtil;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Requires and Provides Interface constructs
 */
@SuppressWarnings("all")
public class RequiresProvidesValidator {
  private GraspDSLValidator validator = null;
  
  public RequiresProvidesValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateRequires(final uk.ac.standrews.graspide.grasp.graspDSL.System system) {
    Iterable<EObject> iterableContents = EObjectExtensions.allContentsIterable(system);
    Iterable<Connector> filteredConnectors = Iterables.<Connector>filter(iterableContents, Connector.class);
    Iterable<Component> filteredComponents = Iterables.<Component>filter(iterableContents, Component.class);
    Set<Requires> requires = null;
    for (final Connector connector : filteredConnectors) {
      {
        HashSet<Requires> _hashSet = new HashSet<Requires>();
        requires = _hashSet;
        Template _value = connector.getValue();
        this.populateRequiresList(requires, _value);
        this.checkRequiresForElement(requires, connector);
      }
    }
    for (final Component component : filteredComponents) {
      {
        HashSet<Requires> _hashSet = new HashSet<Requires>();
        requires = _hashSet;
        Template _value = component.getValue();
        this.populateRequiresList(requires, _value);
        this.checkRequiresForElement(requires, component);
      }
    }
  }
  
  private void checkRequiresForElement(final Set<Requires> requires, final EObject element) {
    boolean _or = false;
    boolean _equals = Objects.equal(requires, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _isEmpty = requires.isEmpty();
      _or = _isEmpty;
    }
    if (_or) {
      return;
    }
    EObject currentElement = element;
    Stack<LinkProviderPart> containedElements = new Stack<LinkProviderPart>();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(currentElement, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (currentElement instanceof LinkProviderPart);
    }
    boolean _while = _and;
    while (_while) {
      {
        EObject _eContainer = currentElement.eContainer();
        EList<EObject> _eContents = _eContainer.eContents();
        Iterable<Link> links = Iterables.<Link>filter(_eContents, Link.class);
        for (final Link link : links) {
          {
            Object _clone = containedElements.clone();
            Stack<LinkProviderPart> clonedElements = ((Stack<LinkProviderPart>) _clone);
            this.checkRequiresInLink(requires, link, currentElement, clonedElements);
            boolean _isEmpty_1 = requires.isEmpty();
            if (_isEmpty_1) {
              return;
            }
          }
        }
        containedElements.push(((LinkProviderPart) currentElement));
        EObject _eContainer_1 = currentElement.eContainer();
        currentElement = _eContainer_1;
      }
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(currentElement, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        _and_1 = (currentElement instanceof LinkProviderPart);
      }
      _while = _and_1;
    }
    if ((element instanceof Component)) {
      String _name = ((Component)element).getName();
      String _plus = ("Component \'" + _name);
      String _plus_1 = (_plus + "\' has unsatisfied Require Interfaces ");
      final Function1<Requires,String> _function = new Function1<Requires,String>() {
        public String apply(final Requires t) {
          return t.getType();
        }
      };
      String _join = IterableExtensions.<Requires>join(requires, ", ", _function);
      String _plus_2 = (_plus_1 + _join);
      this.validator.warning(_plus_2, element, 
        GraspDSLPackage.Literals.LINK_PROVIDER_PART__NAME);
    } else {
      if ((element instanceof Connector)) {
        String _name_1 = ((Connector)element).getName();
        String _plus_3 = ("Connector \'" + _name_1);
        String _plus_4 = (_plus_3 + "\' has unsatisfied Require Interfaces ");
        final Function1<Requires,String> _function_1 = new Function1<Requires,String>() {
          public String apply(final Requires t) {
            return t.getType();
          }
        };
        String _join_1 = IterableExtensions.<Requires>join(requires, ", ", _function_1);
        String _plus_5 = (_plus_4 + _join_1);
        this.validator.warning(_plus_5, element, 
          GraspDSLPackage.Literals.LINK_PROVIDER_PART__NAME);
      }
    }
  }
  
  private boolean checkRequiresInLink(final Set<Requires> requires, final Link link, final EObject element, final Stack<LinkProviderPart> containedElements) {
    boolean _xblockexpression = false;
    {
      LinkConsumerExpression linkExpression = link.getLinkConsumer();
      boolean _xifexpression = false;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(linkExpression, null));
      if (!_notEquals) {
        _and = false;
      } else {
        LinkConsumerPart _consumer = linkExpression.getConsumer();
        boolean _notEquals_1 = (!Objects.equal(_consumer, null));
        _and = _notEquals_1;
      }
      if (_and) {
        boolean _xblockexpression_1 = false;
        {
          LinkConsumerPart linkConsumer = linkExpression.getConsumer();
          boolean _xifexpression_1 = false;
          boolean _equals = element.equals(linkConsumer);
          if (_equals) {
            boolean _xblockexpression_2 = false;
            {
              GeneratorUtil utility = new GeneratorUtil();
              LinkConsumerPart lastComponent = utility.getLastConsumer(linkExpression, false);
              boolean _xifexpression_2 = false;
              if ((lastComponent instanceof Requires)) {
                boolean _xifexpression_3 = false;
                EList<String> _rightConsumer = linkExpression.getRightConsumer();
                boolean _isElementContainedinHeirarchy = this.isElementContainedinHeirarchy(_rightConsumer, containedElements);
                if (_isElementContainedinHeirarchy) {
                  _xifexpression_3 = requires.remove(lastComponent);
                }
                _xifexpression_2 = _xifexpression_3;
              }
              _xblockexpression_2 = _xifexpression_2;
            }
            _xifexpression_1 = _xblockexpression_2;
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean isElementContainedinHeirarchy(final EList<String> rightList, final Stack<LinkProviderPart> stack) {
    boolean _or = false;
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(stack);
    if (_isNullOrEmpty) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(rightList, null);
      _or = _equals;
    }
    if (_or) {
      return true;
    }
    for (final String elementName : rightList) {
      {
        final LinkProviderPart topElement = stack.pop();
        boolean _or_1 = false;
        boolean _or_2 = false;
        boolean _equals_1 = Objects.equal(topElement, null);
        if (_equals_1) {
          _or_2 = true;
        } else {
          String _name = topElement.getName();
          boolean _equals_2 = Objects.equal(_name, null);
          _or_2 = _equals_2;
        }
        if (_or_2) {
          _or_1 = true;
        } else {
          String _name_1 = topElement.getName();
          boolean _equals_3 = _name_1.equals(elementName);
          boolean _not = (!_equals_3);
          _or_1 = _not;
        }
        if (_or_1) {
          return false;
        }
        boolean _empty = stack.empty();
        if (_empty) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void populateRequiresList(final Set<Requires> requires, final Template template) {
    Template currentTemplate = template;
    HashSet<Template> templateSet = new HashSet<Template>();
    boolean _notEquals = (!Objects.equal(currentTemplate, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        Iterable<EObject> iterableContents = EObjectExtensions.allContentsIterable(currentTemplate);
        Iterable<Requires> filteredRequires = Iterables.<Requires>filter(iterableContents, Requires.class);
        boolean _notEquals_1 = (!Objects.equal(filteredRequires, null));
        if (_notEquals_1) {
          Iterables.<Requires>addAll(requires, filteredRequires);
        }
        templateSet.add(currentTemplate);
        Template _superTemplate = currentTemplate.getSuperTemplate();
        currentTemplate = _superTemplate;
        boolean _contains = templateSet.contains(currentTemplate);
        if (_contains) {
          return;
        }
      }
      boolean _notEquals_1 = (!Objects.equal(currentTemplate, null));
      _while = _notEquals_1;
    }
  }
  
  public void validateRequiresAndProvides(final ArchitectureBody architectureBody) {
    List<Template> declarations = new ArrayList<Template>();
    this.getAllDeclarations(architectureBody, declarations);
    Set<String> requiresSet = new HashSet<String>();
    Set<String> providesSet = new HashSet<String>();
    Set<Requires> requiresObjectSet = new HashSet<Requires>();
    Set<Provides> providesObjectSet = new HashSet<Provides>();
    for (final Template declaration : declarations) {
      this.getAllRequiresAndProvides(declaration, requiresSet, providesSet, requiresObjectSet, providesObjectSet);
    }
    for (final String require : requiresSet) {
      boolean _contains = providesSet.contains(require);
      if (_contains) {
        providesSet.remove(require);
      } else {
        final Function1<Requires,Boolean> _function = new Function1<Requires,Boolean>() {
          public Boolean apply(final Requires it) {
            boolean _and = false;
            String _type = it.getType();
            boolean _notEquals = (!Objects.equal(_type, null));
            if (!_notEquals) {
              _and = false;
            } else {
              String _type_1 = it.getType();
              boolean _equals = _type_1.equals(require);
              _and = _equals;
            }
            return Boolean.valueOf(_and);
          }
        };
        Requires requireObject = IterableExtensions.<Requires>findFirst(requiresObjectSet, _function);
        this.validator.warning(
          (("Requires Definition \'" + require) + "\' has no matching Provider Definition"), requireObject, 
          GraspDSLPackage.Literals.REQUIRES__TYPE);
      }
    }
    for (final String provide : providesSet) {
      {
        final Function1<Provides,Boolean> _function_1 = new Function1<Provides,Boolean>() {
          public Boolean apply(final Provides it) {
            boolean _and = false;
            String _name = it.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            if (!_notEquals) {
              _and = false;
            } else {
              String _name_1 = it.getName();
              boolean _equals = _name_1.equals(provide);
              _and = _equals;
            }
            return Boolean.valueOf(_and);
          }
        };
        Provides provideObject = IterableExtensions.<Provides>findFirst(providesObjectSet, _function_1);
        this.validator.info(
          (("Provider Definition \'" + provide) + "\' has no matching Requires Definition"), provideObject, 
          GraspDSLPackage.Literals.LINK_PROVIDER_PART__NAME);
      }
    }
  }
  
  private void getAllDeclarations(final ArchitectureBody architectureBody, final List<Template> declarations) {
    DeclarationStart start = architectureBody.getDeclarationStart();
    DeclarationEnd end = architectureBody.getDeclarationEnd();
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(start, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      EList<Declaration> _declaration = start.getDeclaration();
      boolean _notEquals_1 = (!Objects.equal(_declaration, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      EList<Declaration> _declaration_1 = start.getDeclaration();
      int _size = _declaration_1.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      EList<Declaration> _declaration_2 = start.getDeclaration();
      for (final Declaration declaration : _declaration_2) {
        if ((declaration instanceof Template)) {
          declarations.add(((Template)declaration));
        }
      }
    }
    boolean _and_2 = false;
    boolean _and_3 = false;
    boolean _notEquals_2 = (!Objects.equal(end, null));
    if (!_notEquals_2) {
      _and_3 = false;
    } else {
      EList<Declaration> _declaration_3 = end.getDeclaration();
      boolean _notEquals_3 = (!Objects.equal(_declaration_3, null));
      _and_3 = _notEquals_3;
    }
    if (!_and_3) {
      _and_2 = false;
    } else {
      EList<Declaration> _declaration_4 = end.getDeclaration();
      int _size_1 = _declaration_4.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      _and_2 = _greaterThan_1;
    }
    if (_and_2) {
      EList<Declaration> _declaration_5 = end.getDeclaration();
      for (final Declaration declaration_1 : _declaration_5) {
        if ((declaration_1 instanceof Template)) {
          declarations.add(((Template)declaration_1));
        }
      }
    }
  }
  
  private void getAllRequiresAndProvides(final Template template, final Set<String> requiresSet, final Set<String> providesSet, final Set<Requires> requiresObjectSet, final Set<Provides> providesObjectSet) {
    Set<Template> templateSet = new HashSet<Template>();
    templateSet.add(template);
    int _size = templateSet.size();
    boolean _greaterThan = (_size > 0);
    boolean _while = _greaterThan;
    while (_while) {
      {
        Template currentTemplate = IterableExtensions.<Template>head(templateSet);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _notEquals = (!Objects.equal(currentTemplate, null));
        if (!_notEquals) {
          _and_1 = false;
        } else {
          EList<EObject> _eContents = currentTemplate.eContents();
          boolean _notEquals_1 = (!Objects.equal(_eContents, null));
          _and_1 = _notEquals_1;
        }
        if (!_and_1) {
          _and = false;
        } else {
          EList<EObject> _eContents_1 = currentTemplate.eContents();
          int _size_1 = _eContents_1.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          _and = _greaterThan_1;
        }
        if (_and) {
          EList<EObject> _eContents_2 = currentTemplate.eContents();
          for (final EObject content : _eContents_2) {
            if ((content instanceof Requires)) {
              String _type = ((Requires)content).getType();
              requiresSet.add(_type);
              requiresObjectSet.add(((Requires)content));
            } else {
              if ((content instanceof Provides)) {
                String _name = ((Provides)content).getName();
                providesSet.add(_name);
                providesObjectSet.add(((Provides)content));
              } else {
                if ((content instanceof Template)) {
                  templateSet.add(((Template)content));
                }
              }
            }
          }
        }
        templateSet.remove(currentTemplate);
      }
      int _size_1 = templateSet.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      _while = _greaterThan_1;
    }
  }
}
