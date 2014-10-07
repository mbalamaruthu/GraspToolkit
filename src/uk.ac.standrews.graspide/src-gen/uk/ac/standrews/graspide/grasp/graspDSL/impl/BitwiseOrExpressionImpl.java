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
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitwise Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseOrExpressionImpl#getBitwiseXor <em>Bitwise Xor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitwiseOrExpressionImpl extends MinimalEObjectImpl.Container implements BitwiseOrExpression
{
  /**
   * The cached value of the '{@link #getBitwiseXor() <em>Bitwise Xor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitwiseXor()
   * @generated
   * @ordered
   */
  protected EList<BitwiseXorExpression> bitwiseXor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BitwiseOrExpressionImpl()
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
    return GraspDSLPackage.Literals.BITWISE_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BitwiseXorExpression> getBitwiseXor()
  {
    if (bitwiseXor == null)
    {
      bitwiseXor = new EObjectContainmentEList<BitwiseXorExpression>(BitwiseXorExpression.class, this, GraspDSLPackage.BITWISE_OR_EXPRESSION__BITWISE_XOR);
    }
    return bitwiseXor;
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
      case GraspDSLPackage.BITWISE_OR_EXPRESSION__BITWISE_XOR:
        return ((InternalEList<?>)getBitwiseXor()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.BITWISE_OR_EXPRESSION__BITWISE_XOR:
        return getBitwiseXor();
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
      case GraspDSLPackage.BITWISE_OR_EXPRESSION__BITWISE_XOR:
        getBitwiseXor().clear();
        getBitwiseXor().addAll((Collection<? extends BitwiseXorExpression>)newValue);
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
      case GraspDSLPackage.BITWISE_OR_EXPRESSION__BITWISE_XOR:
        getBitwiseXor().clear();
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
      case GraspDSLPackage.BITWISE_OR_EXPRESSION__BITWISE_XOR:
        return bitwiseXor != null && !bitwiseXor.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BitwiseOrExpressionImpl
