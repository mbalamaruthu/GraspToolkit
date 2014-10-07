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
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitwise Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseXorExpressionImpl#getBitwiseAnd <em>Bitwise And</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitwiseXorExpressionImpl extends MinimalEObjectImpl.Container implements BitwiseXorExpression
{
  /**
   * The cached value of the '{@link #getBitwiseAnd() <em>Bitwise And</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitwiseAnd()
   * @generated
   * @ordered
   */
  protected EList<BitwiseAndExpression> bitwiseAnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BitwiseXorExpressionImpl()
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
    return GraspDSLPackage.Literals.BITWISE_XOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BitwiseAndExpression> getBitwiseAnd()
  {
    if (bitwiseAnd == null)
    {
      bitwiseAnd = new EObjectContainmentEList<BitwiseAndExpression>(BitwiseAndExpression.class, this, GraspDSLPackage.BITWISE_XOR_EXPRESSION__BITWISE_AND);
    }
    return bitwiseAnd;
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
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION__BITWISE_AND:
        return ((InternalEList<?>)getBitwiseAnd()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION__BITWISE_AND:
        return getBitwiseAnd();
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
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION__BITWISE_AND:
        getBitwiseAnd().clear();
        getBitwiseAnd().addAll((Collection<? extends BitwiseAndExpression>)newValue);
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
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION__BITWISE_AND:
        getBitwiseAnd().clear();
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
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION__BITWISE_AND:
        return bitwiseAnd != null && !bitwiseAnd.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BitwiseXorExpressionImpl
