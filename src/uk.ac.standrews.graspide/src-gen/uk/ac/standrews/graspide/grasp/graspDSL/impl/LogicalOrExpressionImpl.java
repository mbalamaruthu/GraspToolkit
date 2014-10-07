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

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalOrExpressionImpl#getLogicalAnd <em>Logical And</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalOrExpressionImpl extends MinimalEObjectImpl.Container implements LogicalOrExpression
{
  /**
   * The cached value of the '{@link #getLogicalAnd() <em>Logical And</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalAnd()
   * @generated
   * @ordered
   */
  protected EList<LogicalAndExpression> logicalAnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalOrExpressionImpl()
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
    return GraspDSLPackage.Literals.LOGICAL_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicalAndExpression> getLogicalAnd()
  {
    if (logicalAnd == null)
    {
      logicalAnd = new EObjectContainmentEList<LogicalAndExpression>(LogicalAndExpression.class, this, GraspDSLPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND);
    }
    return logicalAnd;
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
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND:
        return ((InternalEList<?>)getLogicalAnd()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND:
        return getLogicalAnd();
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
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND:
        getLogicalAnd().clear();
        getLogicalAnd().addAll((Collection<? extends LogicalAndExpression>)newValue);
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
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND:
        getLogicalAnd().clear();
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
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION__LOGICAL_AND:
        return logicalAnd != null && !logicalAnd.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalOrExpressionImpl
