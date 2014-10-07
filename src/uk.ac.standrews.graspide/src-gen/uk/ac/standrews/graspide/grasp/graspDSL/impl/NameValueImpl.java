/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.standrews.graspide.grasp.graspDSL.Expression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.NameValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValueImpl#getNamePair <em>Name Pair</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValueImpl#getValuePair <em>Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameValueImpl extends MinimalEObjectImpl.Container implements NameValue
{
  /**
   * The default value of the '{@link #getNamePair() <em>Name Pair</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamePair()
   * @generated
   * @ordered
   */
  protected static final String NAME_PAIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamePair() <em>Name Pair</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamePair()
   * @generated
   * @ordered
   */
  protected String namePair = NAME_PAIR_EDEFAULT;

  /**
   * The cached value of the '{@link #getValuePair() <em>Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuePair()
   * @generated
   * @ordered
   */
  protected Expression valuePair;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameValueImpl()
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
    return GraspDSLPackage.Literals.NAME_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamePair()
  {
    return namePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamePair(String newNamePair)
  {
    String oldNamePair = namePair;
    namePair = newNamePair;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.NAME_VALUE__NAME_PAIR, oldNamePair, namePair));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValuePair()
  {
    return valuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuePair(Expression newValuePair, NotificationChain msgs)
  {
    Expression oldValuePair = valuePair;
    valuePair = newValuePair;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.NAME_VALUE__VALUE_PAIR, oldValuePair, newValuePair);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuePair(Expression newValuePair)
  {
    if (newValuePair != valuePair)
    {
      NotificationChain msgs = null;
      if (valuePair != null)
        msgs = ((InternalEObject)valuePair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.NAME_VALUE__VALUE_PAIR, null, msgs);
      if (newValuePair != null)
        msgs = ((InternalEObject)newValuePair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.NAME_VALUE__VALUE_PAIR, null, msgs);
      msgs = basicSetValuePair(newValuePair, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.NAME_VALUE__VALUE_PAIR, newValuePair, newValuePair));
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
      case GraspDSLPackage.NAME_VALUE__VALUE_PAIR:
        return basicSetValuePair(null, msgs);
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
      case GraspDSLPackage.NAME_VALUE__NAME_PAIR:
        return getNamePair();
      case GraspDSLPackage.NAME_VALUE__VALUE_PAIR:
        return getValuePair();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraspDSLPackage.NAME_VALUE__NAME_PAIR:
        setNamePair((String)newValue);
        return;
      case GraspDSLPackage.NAME_VALUE__VALUE_PAIR:
        setValuePair((Expression)newValue);
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
      case GraspDSLPackage.NAME_VALUE__NAME_PAIR:
        setNamePair(NAME_PAIR_EDEFAULT);
        return;
      case GraspDSLPackage.NAME_VALUE__VALUE_PAIR:
        setValuePair((Expression)null);
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
      case GraspDSLPackage.NAME_VALUE__NAME_PAIR:
        return NAME_PAIR_EDEFAULT == null ? namePair != null : !NAME_PAIR_EDEFAULT.equals(namePair);
      case GraspDSLPackage.NAME_VALUE__VALUE_PAIR:
        return valuePair != null;
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
    result.append(" (namePair: ");
    result.append(namePair);
    result.append(')');
    return result.toString();
  }

} //NameValueImpl
