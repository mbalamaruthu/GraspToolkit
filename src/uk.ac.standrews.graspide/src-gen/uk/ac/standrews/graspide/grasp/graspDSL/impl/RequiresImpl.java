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
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl#getBecauseRequiresClause <em>Because Requires Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl#getRequiresConstituent <em>Requires Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiresImpl extends TemplateConstituentImpl implements Requires
{
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
   * The cached value of the '{@link #getBecauseRequiresClause() <em>Because Requires Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecauseRequiresClause()
   * @generated
   * @ordered
   */
  protected BecauseClause becauseRequiresClause;

  /**
   * The cached value of the '{@link #getRequiresConstituent() <em>Requires Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiresConstituent()
   * @generated
   * @ordered
   */
  protected EList<RequiresConstituent> requiresConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiresImpl()
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
    return GraspDSLPackage.Literals.REQUIRES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REQUIRES__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REQUIRES__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecauseClause getBecauseRequiresClause()
  {
    return becauseRequiresClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecauseRequiresClause(BecauseClause newBecauseRequiresClause, NotificationChain msgs)
  {
    BecauseClause oldBecauseRequiresClause = becauseRequiresClause;
    becauseRequiresClause = newBecauseRequiresClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE, oldBecauseRequiresClause, newBecauseRequiresClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecauseRequiresClause(BecauseClause newBecauseRequiresClause)
  {
    if (newBecauseRequiresClause != becauseRequiresClause)
    {
      NotificationChain msgs = null;
      if (becauseRequiresClause != null)
        msgs = ((InternalEObject)becauseRequiresClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE, null, msgs);
      if (newBecauseRequiresClause != null)
        msgs = ((InternalEObject)newBecauseRequiresClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE, null, msgs);
      msgs = basicSetBecauseRequiresClause(newBecauseRequiresClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE, newBecauseRequiresClause, newBecauseRequiresClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequiresConstituent> getRequiresConstituent()
  {
    if (requiresConstituent == null)
    {
      requiresConstituent = new EObjectContainmentEList<RequiresConstituent>(RequiresConstituent.class, this, GraspDSLPackage.REQUIRES__REQUIRES_CONSTITUENT);
    }
    return requiresConstituent;
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
      case GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE:
        return basicSetBecauseRequiresClause(null, msgs);
      case GraspDSLPackage.REQUIRES__REQUIRES_CONSTITUENT:
        return ((InternalEList<?>)getRequiresConstituent()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.REQUIRES__TYPE:
        return getType();
      case GraspDSLPackage.REQUIRES__VALUE:
        return getValue();
      case GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE:
        return getBecauseRequiresClause();
      case GraspDSLPackage.REQUIRES__REQUIRES_CONSTITUENT:
        return getRequiresConstituent();
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
      case GraspDSLPackage.REQUIRES__TYPE:
        setType((String)newValue);
        return;
      case GraspDSLPackage.REQUIRES__VALUE:
        setValue((String)newValue);
        return;
      case GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE:
        setBecauseRequiresClause((BecauseClause)newValue);
        return;
      case GraspDSLPackage.REQUIRES__REQUIRES_CONSTITUENT:
        getRequiresConstituent().clear();
        getRequiresConstituent().addAll((Collection<? extends RequiresConstituent>)newValue);
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
      case GraspDSLPackage.REQUIRES__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GraspDSLPackage.REQUIRES__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE:
        setBecauseRequiresClause((BecauseClause)null);
        return;
      case GraspDSLPackage.REQUIRES__REQUIRES_CONSTITUENT:
        getRequiresConstituent().clear();
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
      case GraspDSLPackage.REQUIRES__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case GraspDSLPackage.REQUIRES__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case GraspDSLPackage.REQUIRES__BECAUSE_REQUIRES_CLAUSE:
        return becauseRequiresClause != null;
      case GraspDSLPackage.REQUIRES__REQUIRES_CONSTITUENT:
        return requiresConstituent != null && !requiresConstituent.isEmpty();
    }
    return super.eIsSet(featureID);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //RequiresImpl
