package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Rationale constructs
 */
@SuppressWarnings("all")
public class RationaleValidator {
  private GraspDSLValidator validator = null;
  
  public RationaleValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void addRationaleUsage(final Architecture architecture, final Set<String> rationaleSet) {
    Iterable<EObject> _allContentsIterable = EObjectExtensions.allContentsIterable(architecture);
    Iterable<BecauseCausalcontext> allContents = Iterables.<BecauseCausalcontext>filter(_allContentsIterable, BecauseCausalcontext.class);
    for (final BecauseCausalcontext causalContext : allContents) {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(causalContext, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        Rationale _value = causalContext.getValue();
        boolean _notEquals_1 = (!Objects.equal(_value, null));
        _and_1 = _notEquals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        Rationale _value_1 = causalContext.getValue();
        String _name = _value_1.getName();
        boolean _notEquals_2 = (!Objects.equal(_name, null));
        _and = _notEquals_2;
      }
      if (_and) {
        Rationale _value_2 = causalContext.getValue();
        String _name_1 = _value_2.getName();
        rationaleSet.add(_name_1);
      }
    }
  }
  
  public void validateRationaleUsages(final DeclarationEnd declarationEnd, final Set<String> rationaleSet) {
    EObject _eContainer = declarationEnd.eContainer();
    ArchitectureBody architectureBody = ((ArchitectureBody) _eContainer);
    EList<Declaration> declarationsAtEnd = declarationEnd.getDeclaration();
    DeclarationStart _declarationStart = architectureBody.getDeclarationStart();
    EList<Declaration> declarationsAtStart = _declarationStart.getDeclaration();
    List<Rationale> rationaleDeclaration = new ArrayList<Rationale>();
    this.getRationaleDeclarations(declarationsAtStart, rationaleDeclaration);
    this.getRationaleDeclarations(declarationsAtEnd, rationaleDeclaration);
    this.removeInheritedRationales(rationaleDeclaration);
    for (final Rationale rationale : rationaleDeclaration) {
      boolean _and = false;
      String _name = rationale.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name_1 = rationale.getName();
        boolean _contains = rationaleSet.contains(_name_1);
        boolean _not = (!_contains);
        _and = _not;
      }
      if (_and) {
        String _name_2 = rationale.getName();
        String _plus = ("Rationale \'" + _name_2);
        String _plus_1 = (_plus + "\' is not Realized by any Elements");
        this.validator.warning(_plus_1, rationale, 
          GraspDSLPackage.Literals.DECLARATION__NAME);
      }
    }
  }
  
  public void validateEmptyRationales(final Rationale rationale) {
    String _name = rationale.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      return;
    }
    boolean _or = false;
    EList<Reason> _reason = rationale.getReason();
    boolean _equals_1 = Objects.equal(_reason, null);
    if (_equals_1) {
      _or = true;
    } else {
      EList<Reason> _reason_1 = rationale.getReason();
      int _size = _reason_1.size();
      boolean _equals_2 = (_size == 0);
      _or = _equals_2;
    }
    if (_or) {
      String _name_1 = rationale.getName();
      String _plus = ("Rationale \'" + _name_1);
      String _plus_1 = (_plus + "\' does not contain any reasons");
      this.validator.info(_plus_1, rationale, 
        GraspDSLPackage.Literals.RATIONALE__REASON);
    }
  }
  
  public void validateSelfReferenceRationale(final Rationale rationale) {
    boolean _or = false;
    boolean _or_1 = false;
    String _name = rationale.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or_1 = true;
    } else {
      Rationale _superRationale = rationale.getSuperRationale();
      boolean _equals_1 = Objects.equal(_superRationale, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      Rationale _superRationale_1 = rationale.getSuperRationale();
      String _name_1 = _superRationale_1.getName();
      boolean _equals_2 = Objects.equal(_name_1, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    String _name_2 = rationale.getName();
    Rationale _superRationale_2 = rationale.getSuperRationale();
    String _name_3 = _superRationale_2.getName();
    boolean _equals_3 = _name_2.equals(_name_3);
    if (_equals_3) {
      String _name_4 = rationale.getName();
      String _plus = ("Rationale \'" + _name_4);
      String _plus_1 = (_plus + "\' cannot Extend itself");
      this.validator.error(_plus_1, 
        GraspDSLPackage.Literals.RATIONALE__SUPER_RATIONALE);
    }
  }
  
  public void validatorRationaleForcycle(final Rationale rationale) {
    boolean _or = false;
    boolean _or_1 = false;
    String _name = rationale.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      _or_1 = true;
    } else {
      Rationale _superRationale = rationale.getSuperRationale();
      boolean _equals_1 = Objects.equal(_superRationale, null);
      _or_1 = _equals_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      Rationale _superRationale_1 = rationale.getSuperRationale();
      String _name_1 = _superRationale_1.getName();
      boolean _equals_2 = Objects.equal(_name_1, null);
      _or = _equals_2;
    }
    if (_or) {
      return;
    }
    HashSet<String> visitedRationaleNames = CollectionLiterals.<String>newHashSet();
    Rationale currentRationale = rationale.getSuperRationale();
    boolean _notEquals = (!Objects.equal(currentRationale, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        boolean _and = false;
        String _name_2 = currentRationale.getName();
        boolean _notEquals_1 = (!Objects.equal(_name_2, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          String _name_3 = rationale.getName();
          String _name_4 = currentRationale.getName();
          boolean _equals_3 = _name_3.equals(_name_4);
          _and = _equals_3;
        }
        if (_and) {
          String _name_5 = rationale.getName();
          String _plus = ("Cycle exist in extends Rationale \'" + _name_5);
          String _plus_1 = (_plus + "\'");
          this.validator.error(_plus_1, 
            GraspDSLPackage.Literals.RATIONALE__SUPER_RATIONALE);
          return;
        }
        String _name_6 = currentRationale.getName();
        boolean _add = visitedRationaleNames.add(_name_6);
        boolean _not = (!_add);
        if (_not) {
          return;
        }
        Rationale _superRationale_2 = currentRationale.getSuperRationale();
        currentRationale = _superRationale_2;
      }
      boolean _notEquals_1 = (!Objects.equal(currentRationale, null));
      _while = _notEquals_1;
    }
  }
  
  private void removeInheritedRationales(final List<Rationale> rationales) {
    List<Rationale> rationaleCopy = new ArrayList<Rationale>(rationales);
    for (final Rationale current : rationaleCopy) {
      {
        boolean foundAsSuper = false;
        String currentName = current.getName();
        boolean _notEquals = (!Objects.equal(currentName, null));
        if (_notEquals) {
          for (final Rationale rationale : rationales) {
            {
              String rationaleName = rationale.getName();
              Rationale superRationale = rationale.getSuperRationale();
              boolean _and = false;
              boolean _and_1 = false;
              boolean _notEquals_1 = (!Objects.equal(superRationale, null));
              if (!_notEquals_1) {
                _and_1 = false;
              } else {
                boolean _equals = currentName.equals(rationaleName);
                boolean _not = (!_equals);
                _and_1 = _not;
              }
              if (!_and_1) {
                _and = false;
              } else {
                String _name = superRationale.getName();
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
          rationales.remove(current);
        }
      }
    }
  }
  
  private void getRationaleDeclarations(final EList<Declaration> declarations, final List<Rationale> rationaleDeclaration) {
    boolean _notEquals = (!Objects.equal(declarations, null));
    if (_notEquals) {
      for (final Declaration declaration : declarations) {
        if ((declaration instanceof Rationale)) {
          rationaleDeclaration.add(((Rationale)declaration));
        }
      }
    }
  }
}
