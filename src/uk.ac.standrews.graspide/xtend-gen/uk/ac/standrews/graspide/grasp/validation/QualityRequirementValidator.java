package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Quality attribute and requirement constructs
 */
@SuppressWarnings("all")
public class QualityRequirementValidator {
  private GraspDSLValidator validator = null;
  
  public QualityRequirementValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateDuplicateRequirementsInhibits(final InhibitsClause inhibitClause) {
    boolean _and = false;
    EList<RequirementOrQuality> _value = inhibitClause.getValue();
    boolean _notEquals = (!Objects.equal(_value, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<RequirementOrQuality> _value_1 = inhibitClause.getValue();
      int _size = _value_1.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      Set<String> inhibited = new HashSet<String>();
      EList<RequirementOrQuality> _value_2 = inhibitClause.getValue();
      for (final RequirementOrQuality value : _value_2) {
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(value, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          String _name = value.getName();
          boolean _notEquals_2 = (!Objects.equal(_name, null));
          _and_1 = _notEquals_2;
        }
        if (_and_1) {
          String _name_1 = value.getName();
          boolean _add = inhibited.add(_name_1);
          boolean _not = (!_add);
          if (_not) {
            String _name_2 = value.getName();
            String _plus = ("Duplicates in Inhibited Requirement or Quality Attribute \'" + _name_2);
            String _plus_1 = (_plus + 
              "\'");
            this.validator.error(_plus_1, inhibitClause, 
              GraspDSLPackage.Literals.INHIBITS_CLAUSE__VALUE);
          }
        }
      }
    }
  }
  
  public void validateQualityReqUsages(final DeclarationEnd declarationEnd, final Set<String> qualityReqSet) {
    EObject _eContainer = declarationEnd.eContainer();
    ArchitectureBody architectureBody = ((ArchitectureBody) _eContainer);
    EList<Declaration> declarationsAtEnd = declarationEnd.getDeclaration();
    DeclarationStart _declarationStart = architectureBody.getDeclarationStart();
    EList<Declaration> declarationsAtStart = _declarationStart.getDeclaration();
    List<RequirementOrQuality> qualityorReqDeclarations = new ArrayList<RequirementOrQuality>();
    this.getQualityOrReqDeclarations(declarationsAtStart, qualityorReqDeclarations);
    this.getQualityOrReqDeclarations(declarationsAtEnd, qualityorReqDeclarations);
    for (final RequirementOrQuality qualityReq : qualityorReqDeclarations) {
      boolean _and = false;
      String _name = qualityReq.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _name_1 = qualityReq.getName();
        boolean _contains = qualityReqSet.contains(_name_1);
        boolean _not = (!_contains);
        _and = _not;
      }
      if (_and) {
        String _name_2 = qualityReq.getName();
        String _plus = ("Requirement or Quality Attribute \'" + _name_2);
        String _plus_1 = (_plus + "\' is not supported by any Elements");
        this.validator.warning(_plus_1, qualityReq, 
          GraspDSLPackage.Literals.DECLARATION__NAME);
      }
    }
  }
  
  public void validateDuplicateRequirementsSupport(final SupportsClause supportClause) {
    boolean _and = false;
    EList<RequirementOrQuality> _value = supportClause.getValue();
    boolean _notEquals = (!Objects.equal(_value, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<RequirementOrQuality> _value_1 = supportClause.getValue();
      int _size = _value_1.size();
      boolean _greaterThan = (_size > 0);
      _and = _greaterThan;
    }
    if (_and) {
      Set<String> supported = new HashSet<String>();
      EList<RequirementOrQuality> _value_2 = supportClause.getValue();
      for (final RequirementOrQuality value : _value_2) {
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(value, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          String _name = value.getName();
          boolean _notEquals_2 = (!Objects.equal(_name, null));
          _and_1 = _notEquals_2;
        }
        if (_and_1) {
          String _name_1 = value.getName();
          boolean _add = supported.add(_name_1);
          boolean _not = (!_add);
          if (_not) {
            String _name_2 = value.getName();
            String _plus = ("Duplicates in Supported Requirement or Quality Attribute \'" + _name_2);
            String _plus_1 = (_plus + 
              "\'");
            this.validator.error(_plus_1, supportClause, 
              GraspDSLPackage.Literals.SUPPORTS_CLAUSE__VALUE);
          }
        }
      }
    }
  }
  
  public void validateQattributeSupport(final Qattribute qattribute) {
    boolean _isInvalidQAttributeWithoutSupportsClause = this.isInvalidQAttributeWithoutSupportsClause(qattribute);
    if (_isInvalidQAttributeWithoutSupportsClause) {
      return;
    }
    String currentName = qattribute.getName();
    SupportsClause _supportsClause = qattribute.getSupportsClause();
    EList<RequirementOrQuality> _value = _supportsClause.getValue();
    for (final RequirementOrQuality content : _value) {
      boolean _and = false;
      boolean _and_1 = false;
      if (!(content instanceof Qattribute)) {
        _and_1 = false;
      } else {
        String _name = content.getName();
        boolean _notEquals = (!Objects.equal(_name, null));
        _and_1 = _notEquals;
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _name_1 = content.getName();
        boolean _equals = _name_1.equals(currentName);
        _and = _equals;
      }
      if (_and) {
        String _name_2 = content.getName();
        String _plus = ("Quality Attribute cannot support itself \'" + _name_2);
        String _plus_1 = (_plus + "\'");
        this.validator.warning(_plus_1, content, 
          GraspDSLPackage.Literals.QATTRIBUTE__SUPPORTS_CLAUSE);
      }
    }
  }
  
  public void addReqorQattributeUsages(final Architecture architecture, final Set<String> qualityReqSet) {
    Iterable<EObject> _allContentsIterable = EObjectExtensions.allContentsIterable(architecture);
    Iterable<SupportsClause> allContents = Iterables.<SupportsClause>filter(_allContentsIterable, SupportsClause.class);
    for (final SupportsClause supportClause : allContents) {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(supportClause, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        EList<RequirementOrQuality> _value = supportClause.getValue();
        boolean _notEquals_1 = (!Objects.equal(_value, null));
        _and_1 = _notEquals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        EList<RequirementOrQuality> _value_1 = supportClause.getValue();
        int _size = _value_1.size();
        boolean _notEquals_2 = (_size != 0);
        _and = _notEquals_2;
      }
      if (_and) {
        EList<RequirementOrQuality> _value_2 = supportClause.getValue();
        for (final RequirementOrQuality content : _value_2) {
          String _name = content.getName();
          qualityReqSet.add(_name);
        }
      }
    }
  }
  
  private boolean isInvalidQAttributeWithoutSupportsClause(final Qattribute qattribute) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _equals = Objects.equal(qattribute, null);
    if (_equals) {
      _or_3 = true;
    } else {
      String _name = qattribute.getName();
      boolean _equals_1 = Objects.equal(_name, null);
      _or_3 = _equals_1;
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      SupportsClause _supportsClause = qattribute.getSupportsClause();
      boolean _equals_2 = Objects.equal(_supportsClause, null);
      _or_2 = _equals_2;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      SupportsClause _supportsClause_1 = qattribute.getSupportsClause();
      EList<RequirementOrQuality> _value = _supportsClause_1.getValue();
      boolean _equals_3 = Objects.equal(_value, null);
      _or_1 = _equals_3;
    }
    if (_or_1) {
      _or = true;
    } else {
      SupportsClause _supportsClause_2 = qattribute.getSupportsClause();
      EList<RequirementOrQuality> _value_1 = _supportsClause_2.getValue();
      int _size = _value_1.size();
      boolean _equals_4 = (_size == 0);
      _or = _equals_4;
    }
    return _or;
  }
  
  private void getQualityOrReqDeclarations(final EList<Declaration> declarations, final List<RequirementOrQuality> qualityRequirements) {
    boolean _notEquals = (!Objects.equal(declarations, null));
    if (_notEquals) {
      for (final Declaration declaration : declarations) {
        if ((declaration instanceof RequirementOrQuality)) {
          qualityRequirements.add(((RequirementOrQuality)declaration));
        }
      }
    }
  }
}
