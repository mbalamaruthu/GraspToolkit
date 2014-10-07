/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MultiplicativeExpressionImpl#getUnary <em>Unary</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MultiplicativeExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicativeExpressionImpl extends MinimalEObjectImpl.Container implements MultiplicativeExpression
{
  /**
   * The cached value of the '{@link #getUnary() <em>Unary</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected EList<UnaryExpression> unary;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EList<String> op;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicativeExpressionImpl()
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
    return GraspDSLPackage.Literals.MULTIPLICATIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnaryExpression> getUnary()
  {
    if (unary == null)
    {
      unary = new EObjectContainmentEList<UnaryExpression>(UnaryExpression.class, this, GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__UNARY);
    }
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOp()
  {
    if (op == null)
    {
      op = new EDataTypeEList<String>(String.class, this, GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__OP);
    }
    return op;
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
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__UNARY:
        return ((InternalEList<?>)getUnary()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__UNARY:
        return getUnary();
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__OP:
        return getOp();
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
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__UNARY:
        getUnary().clear();
        getUnary().addAll((Collection<? extends UnaryExpression>)newValue);
        return;
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__OP:
        getOp().clear();
        getOp().addAll((Collection<? extends String>)newValue);
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
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__UNARY:
        getUnary().clear();
        return;
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__OP:
        getOp().clear();
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
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__UNARY:
        return unary != null && !unary.isEmpty();
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION__OP:
        return op != null && !op.isEmpty();
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //MultiplicativeExpressionImpl
