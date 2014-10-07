/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl#getBecauseClause <em>Because Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl#getProvidesConstituent <em>Provides Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidesImpl extends TemplateConstituentImpl implements Provides
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBecauseClause() <em>Because Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecauseClause()
   * @generated
   * @ordered
   */
  protected BecauseClause becauseClause;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getProvidesConstituent() <em>Provides Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidesConstituent()
   * @generated
   * @ordered
   */
  protected EList<ProvidesConstituent> providesConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraspDSLPackage.Literals.PROVIDES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.PROVIDES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecauseClause getBecauseClause()
  {
    return becauseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecauseClause(BecauseClause newBecauseClause, NotificationChain msgs)
  {
    BecauseClause oldBecauseClause = becauseClause;
    becauseClause = newBecauseClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE, oldBecauseClause, newBecauseClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecauseClause(BecauseClause newBecauseClause)
  {
    if (newBecauseClause != becauseClause)
    {
      NotificationChain msgs = null;
      if (becauseClause != null)
        msgs = ((InternalEObject)becauseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE, null, msgs);
      if (newBecauseClause != null)
        msgs = ((InternalEObject)newBecauseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE, null, msgs);
      msgs = basicSetBecauseClause(newBecauseClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE, newBecauseClause, newBecauseClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.PROVIDES__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.PROVIDES__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProvidesConstituent> getProvidesConstituent()
  {
    if (providesConstituent == null)
    {
      providesConstituent = new EObjectContainmentEList<ProvidesConstituent>(ProvidesConstituent.class, this, GraspDSLPackage.PROVIDES__PROVIDES_CONSTITUENT);
    }
    return providesConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE:
        return basicSetBecauseClause(null, msgs);
      case GraspDSLPackage.PROVIDES__PROVIDES_CONSTITUENT:
        return ((InternalEList<?>)getProvidesConstituent()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraspDSLPackage.PROVIDES__NAME:
        return getName();
      case GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE:
        return getBecauseClause();
      case GraspDSLPackage.PROVIDES__VALUE:
        return getValue();
      case GraspDSLPackage.PROVIDES__TYPE:
        return getType();
      case GraspDSLPackage.PROVIDES__PROVIDES_CONSTITUENT:
        return getProvidesConstituent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraspDSLPackage.PROVIDES__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)newValue);
        return;
      case GraspDSLPackage.PROVIDES__VALUE:
        setValue((String)newValue);
        return;
      case GraspDSLPackage.PROVIDES__TYPE:
        setType((String)newValue);
        return;
      case GraspDSLPackage.PROVIDES__PROVIDES_CONSTITUENT:
        getProvidesConstituent().clear();
        getProvidesConstituent().addAll((Collection<? extends ProvidesConstituent>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraspDSLPackage.PROVIDES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)null);
        return;
      case GraspDSLPackage.PROVIDES__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case GraspDSLPackage.PROVIDES__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GraspDSLPackage.PROVIDES__PROVIDES_CONSTITUENT:
        getProvidesConstituent().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraspDSLPackage.PROVIDES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE:
        return becauseClause != null;
      case GraspDSLPackage.PROVIDES__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case GraspDSLPackage.PROVIDES__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case GraspDSLPackage.PROVIDES__PROVIDES_CONSTITUENT:
        return providesConstituent != null && !providesConstituent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == LinkProviderPart.class)
    {
      switch (derivedFeatureID)
      {
        case GraspDSLPackage.PROVIDES__NAME: return GraspDSLPackage.LINK_PROVIDER_PART__NAME;
        case GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE: return GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == LinkProviderPart.class)
    {
      switch (baseFeatureID)
      {
        case GraspDSLPackage.LINK_PROVIDER_PART__NAME: return GraspDSLPackage.PROVIDES__NAME;
        case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE: return GraspDSLPackage.PROVIDES__BECAUSE_CLAUSE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ProvidesImpl
