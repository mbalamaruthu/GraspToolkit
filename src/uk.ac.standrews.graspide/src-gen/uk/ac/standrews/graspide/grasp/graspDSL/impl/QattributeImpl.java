/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.standrews.graspide.grasp.graspDSL.Expression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qattribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.QattributeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.QattributeImpl#getSupportsClause <em>Supports Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QattributeImpl extends RequirementOrQualityImpl implements Qattribute
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getSupportsClause() <em>Supports Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupportsClause()
   * @generated
   * @ordered
   */
  protected SupportsClause supportsClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QattributeImpl()
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
    return GraspDSLPackage.Literals.QATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.QATTRIBUTE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.QATTRIBUTE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.QATTRIBUTE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.QATTRIBUTE__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportsClause getSupportsClause()
  {
    return supportsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSupportsClause(SupportsClause newSupportsClause, NotificationChain msgs)
  {
    SupportsClause oldSupportsClause = supportsClause;
    supportsClause = newSupportsClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE, oldSupportsClause, newSupportsClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupportsClause(SupportsClause newSupportsClause)
  {
    if (newSupportsClause != supportsClause)
    {
      NotificationChain msgs = null;
      if (supportsClause != null)
        msgs = ((InternalEObject)supportsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE, null, msgs);
      if (newSupportsClause != null)
        msgs = ((InternalEObject)newSupportsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE, null, msgs);
      msgs = basicSetSupportsClause(newSupportsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE, newSupportsClause, newSupportsClause));
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
      case GraspDSLPackage.QATTRIBUTE__EXPRESSION:
        return basicSetExpression(null, msgs);
      case GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE:
        return basicSetSupportsClause(null, msgs);
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
      case GraspDSLPackage.QATTRIBUTE__EXPRESSION:
        return getExpression();
      case GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE:
        return getSupportsClause();
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
      case GraspDSLPackage.QATTRIBUTE__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE:
        setSupportsClause((SupportsClause)newValue);
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
      case GraspDSLPackage.QATTRIBUTE__EXPRESSION:
        setExpression((Expression)null);
        return;
      case GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE:
        setSupportsClause((SupportsClause)null);
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
      case GraspDSLPackage.QATTRIBUTE__EXPRESSION:
        return expression != null;
      case GraspDSLPackage.QATTRIBUTE__SUPPORTS_CLAUSE:
        return supportsClause != null;
    }
    return super.eIsSet(featureID);
  }

} //QattributeImpl
