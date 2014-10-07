package uk.ac.standrews.graspide.grasp.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;
import uk.ac.standrews.graspide.grasp.validation.GraspDSLValidator;

/**
 * Validations for Reason constructs
 */
@SuppressWarnings("all")
public class ReasonValidator {
  private GraspDSLValidator validator = null;
  
  public ReasonValidator(final GraspDSLValidator validator) {
    this.validator = validator;
  }
  
  public void validateReasons(final Reason reason) {
    boolean _hasBothSupportAndInhibits = this.hasBothSupportAndInhibits(reason);
    if (_hasBothSupportAndInhibits) {
      Set<String> supported = new HashSet<String>();
      SupportsClause _supportsClause = reason.getSupportsClause();
      EList<RequirementOrQuality> _value = _supportsClause.getValue();
      for (final RequirementOrQuality value : _value) {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(value, null));
        if (!_notEquals) {
          _and = false;
        } else {
          String _name = value.getName();
          boolean _notEquals_1 = (!Objects.equal(_name, null));
          _and = _notEquals_1;
        }
        if (_and) {
          String _name_1 = value.getName();
          supported.add(_name_1);
        }
      }
      InhibitsClause _inhibitsClause = reason.getInhibitsClause();
      EList<RequirementOrQuality> _value_1 = _inhibitsClause.getValue();
      for (final RequirementOrQuality value_1 : _value_1) {
        boolean _and_1 = false;
        boolean _notEquals_2 = (!Objects.equal(value_1, null));
        if (!_notEquals_2) {
          _and_1 = false;
        } else {
          String _name_2 = value_1.getName();
          boolean _notEquals_3 = (!Objects.equal(_name_2, null));
          _and_1 = _notEquals_3;
        }
        if (_and_1) {
          String _name_3 = value_1.getName();
          boolean _contains = supported.contains(_name_3);
          if (_contains) {
            String _name_4 = value_1.getName();
            String _plus = ("Reason Supports and Inhibits the Same Requirement or Quality Attribute \'" + _name_4);
            String _plus_1 = (_plus + 
              "\'");
            this.validator.warning(_plus_1, reason, GraspDSLPackage.Literals.REASON__INHIBITS_CLAUSE);
          }
        }
      }
    }
  }
  
  private boolean hasBothSupportAndInhibits(final Reason reason) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    boolean _and_3 = false;
    boolean _and_4 = false;
    SupportsClause _supportsClause = reason.getSupportsClause();
    boolean _notEquals = (!Objects.equal(_supportsClause, null));
    if (!_notEquals) {
      _and_4 = false;
    } else {
      InhibitsClause _inhibitsClause = reason.getInhibitsClause();
      boolean _notEquals_1 = (!Objects.equal(_inhibitsClause, null));
      _and_4 = _notEquals_1;
    }
    if (!_and_4) {
      _and_3 = false;
    } else {
      SupportsClause _supportsClause_1 = reason.getSupportsClause();
      EList<RequirementOrQuality> _value = _supportsClause_1.getValue();
      boolean _notEquals_2 = (!Objects.equal(_value, null));
      _and_3 = _notEquals_2;
    }
    if (!_and_3) {
      _and_2 = false;
    } else {
      InhibitsClause _inhibitsClause_1 = reason.getInhibitsClause();
      EList<RequirementOrQuality> _value_1 = _inhibitsClause_1.getValue();
      boolean _notEquals_3 = (!Objects.equal(_value_1, null));
      _and_2 = _notEquals_3;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      SupportsClause _supportsClause_2 = reason.getSupportsClause();
      EList<RequirementOrQuality> _value_2 = _supportsClause_2.getValue();
      int _size = _value_2.size();
      boolean _greaterThan = (_size > 0);
      _and_1 = _greaterThan;
    }
    if (!_and_1) {
      _and = false;
    } else {
      InhibitsClause _inhibitsClause_2 = reason.getInhibitsClause();
      EList<RequirementOrQuality> _value_3 = _inhibitsClause_2.getValue();
      int _size_1 = _value_3.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      _and = _greaterThan_1;
    }
    return _and;
  }
}
