/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsetof Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SubsetofExpressionImpl#getLogicalOr <em>Logical Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubsetofExpressionImpl extends ExpressionImpl implements SubsetofExpression
{
  /**
   * The cached value of the '{@link #getLogicalOr() <em>Logical Or</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalOr()
   * @generated
   * @ordered
   */
  protected EList<LogicalOrExpression> logicalOr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubsetofExpressionImpl()
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
    return GraspDSLPackage.Literals.SUBSETOF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicalOrExpression> getLogicalOr()
  {
    if (logicalOr == null)
    {
      logicalOr = new EObjectContainmentEList<LogicalOrExpression>(LogicalOrExpression.class, this, GraspDSLPackage.SUBSETOF_EXPRESSION__LOGICAL_OR);
    }
    return logicalOr;
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
      case GraspDSLPackage.SUBSETOF_EXPRESSION__LOGICAL_OR:
        return ((InternalEList<?>)getLogicalOr()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.SUBSETOF_EXPRESSION__LOGICAL_OR:
        return getLogicalOr();
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
      case GraspDSLPackage.SUBSETOF_EXPRESSION__LOGICAL_OR:
        getLogicalOr().clear();
        getLogicalOr().addAll((Collection<? extends LogicalOrExpression>)newValue);
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
      case GraspDSLPackage.SUBSETOF_EXPRESSION__LOGICAL_OR:
        getLogicalOr().clear();
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
      case GraspDSLPackage.SUBSETOF_EXPRESSION__LOGICAL_OR:
        return logicalOr != null && !logicalOr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SubsetofExpressionImpl
