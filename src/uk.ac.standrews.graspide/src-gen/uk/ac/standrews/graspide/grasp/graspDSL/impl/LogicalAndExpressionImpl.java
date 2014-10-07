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

import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalAndExpressionImpl#getBitwiseOr <em>Bitwise Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalAndExpressionImpl extends MinimalEObjectImpl.Container implements LogicalAndExpression
{
  /**
   * The cached value of the '{@link #getBitwiseOr() <em>Bitwise Or</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitwiseOr()
   * @generated
   * @ordered
   */
  protected EList<BitwiseOrExpression> bitwiseOr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalAndExpressionImpl()
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
    return GraspDSLPackage.Literals.LOGICAL_AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BitwiseOrExpression> getBitwiseOr()
  {
    if (bitwiseOr == null)
    {
      bitwiseOr = new EObjectContainmentEList<BitwiseOrExpression>(BitwiseOrExpression.class, this, GraspDSLPackage.LOGICAL_AND_EXPRESSION__BITWISE_OR);
    }
    return bitwiseOr;
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
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION__BITWISE_OR:
        return ((InternalEList<?>)getBitwiseOr()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION__BITWISE_OR:
        return getBitwiseOr();
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
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION__BITWISE_OR:
        getBitwiseOr().clear();
        getBitwiseOr().addAll((Collection<? extends BitwiseOrExpression>)newValue);
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
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION__BITWISE_OR:
        getBitwiseOr().clear();
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
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION__BITWISE_OR:
        return bitwiseOr != null && !bitwiseOr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalAndExpressionImpl
