/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitwise And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseAndExpressionImpl#getEquality <em>Equality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitwiseAndExpressionImpl extends MinimalEObjectImpl.Container implements BitwiseAndExpression
{
  /**
   * The cached value of the '{@link #getEquality() <em>Equality</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquality()
   * @generated
   * @ordered
   */
  protected EList<EqualityExpression> equality;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BitwiseAndExpressionImpl()
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
    return GraspDSLPackage.Literals.BITWISE_AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqualityExpression> getEquality()
  {
    if (equality == null)
    {
      equality = new EObjectContainmentEList<EqualityExpression>(EqualityExpression.class, this, GraspDSLPackage.BITWISE_AND_EXPRESSION__EQUALITY);
    }
    return equality;
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
      case GraspDSLPackage.BITWISE_AND_EXPRESSION__EQUALITY:
        return ((InternalEList<?>)getEquality()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.BITWISE_AND_EXPRESSION__EQUALITY:
        return getEquality();
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
      case GraspDSLPackage.BITWISE_AND_EXPRESSION__EQUALITY:
        getEquality().clear();
        getEquality().addAll((Collection<? extends EqualityExpression>)newValue);
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
      case GraspDSLPackage.BITWISE_AND_EXPRESSION__EQUALITY:
        getEquality().clear();
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
      case GraspDSLPackage.BITWISE_AND_EXPRESSION__EQUALITY:
        return equality != null && !equality.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BitwiseAndExpressionImpl
