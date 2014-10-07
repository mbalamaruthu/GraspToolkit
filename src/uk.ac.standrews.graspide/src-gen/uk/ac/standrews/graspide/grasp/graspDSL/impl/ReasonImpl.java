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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.Expression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl#getReasonAnnotation <em>Reason Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl#getSupportsClause <em>Supports Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl#getInhibitsClause <em>Inhibits Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonImpl extends MinimalEObjectImpl.Container implements Reason
{
  /**
   * The cached value of the '{@link #getReasonAnnotation() <em>Reason Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReasonAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> reasonAnnotation;

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
   * The cached value of the '{@link #getInhibitsClause() <em>Inhibits Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInhibitsClause()
   * @generated
   * @ordered
   */
  protected InhibitsClause inhibitsClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReasonImpl()
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
    return GraspDSLPackage.Literals.REASON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getReasonAnnotation()
  {
    if (reasonAnnotation == null)
    {
      reasonAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.REASON__REASON_ANNOTATION);
    }
    return reasonAnnotation;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REASON__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REASON__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REASON__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REASON__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REASON__SUPPORTS_CLAUSE, oldSupportsClause, newSupportsClause);
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
        msgs = ((InternalEObject)supportsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REASON__SUPPORTS_CLAUSE, null, msgs);
      if (newSupportsClause != null)
        msgs = ((InternalEObject)newSupportsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REASON__SUPPORTS_CLAUSE, null, msgs);
      msgs = basicSetSupportsClause(newSupportsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REASON__SUPPORTS_CLAUSE, newSupportsClause, newSupportsClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InhibitsClause getInhibitsClause()
  {
    return inhibitsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInhibitsClause(InhibitsClause newInhibitsClause, NotificationChain msgs)
  {
    InhibitsClause oldInhibitsClause = inhibitsClause;
    inhibitsClause = newInhibitsClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REASON__INHIBITS_CLAUSE, oldInhibitsClause, newInhibitsClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInhibitsClause(InhibitsClause newInhibitsClause)
  {
    if (newInhibitsClause != inhibitsClause)
    {
      NotificationChain msgs = null;
      if (inhibitsClause != null)
        msgs = ((InternalEObject)inhibitsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REASON__INHIBITS_CLAUSE, null, msgs);
      if (newInhibitsClause != null)
        msgs = ((InternalEObject)newInhibitsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.REASON__INHIBITS_CLAUSE, null, msgs);
      msgs = basicSetInhibitsClause(newInhibitsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.REASON__INHIBITS_CLAUSE, newInhibitsClause, newInhibitsClause));
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
      case GraspDSLPackage.REASON__REASON_ANNOTATION:
        return ((InternalEList<?>)getReasonAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.REASON__EXPRESSION:
        return basicSetExpression(null, msgs);
      case GraspDSLPackage.REASON__SUPPORTS_CLAUSE:
        return basicSetSupportsClause(null, msgs);
      case GraspDSLPackage.REASON__INHIBITS_CLAUSE:
        return basicSetInhibitsClause(null, msgs);
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
      case GraspDSLPackage.REASON__REASON_ANNOTATION:
        return getReasonAnnotation();
      case GraspDSLPackage.REASON__EXPRESSION:
        return getExpression();
      case GraspDSLPackage.REASON__SUPPORTS_CLAUSE:
        return getSupportsClause();
      case GraspDSLPackage.REASON__INHIBITS_CLAUSE:
        return getInhibitsClause();
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
      case GraspDSLPackage.REASON__REASON_ANNOTATION:
        getReasonAnnotation().clear();
        getReasonAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.REASON__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case GraspDSLPackage.REASON__SUPPORTS_CLAUSE:
        setSupportsClause((SupportsClause)newValue);
        return;
      case GraspDSLPackage.REASON__INHIBITS_CLAUSE:
        setInhibitsClause((InhibitsClause)newValue);
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
      case GraspDSLPackage.REASON__REASON_ANNOTATION:
        getReasonAnnotation().clear();
        return;
      case GraspDSLPackage.REASON__EXPRESSION:
        setExpression((Expression)null);
        return;
      case GraspDSLPackage.REASON__SUPPORTS_CLAUSE:
        setSupportsClause((SupportsClause)null);
        return;
      case GraspDSLPackage.REASON__INHIBITS_CLAUSE:
        setInhibitsClause((InhibitsClause)null);
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
      case GraspDSLPackage.REASON__REASON_ANNOTATION:
        return reasonAnnotation != null && !reasonAnnotation.isEmpty();
      case GraspDSLPackage.REASON__EXPRESSION:
        return expression != null;
      case GraspDSLPackage.REASON__SUPPORTS_CLAUSE:
        return supportsClause != null;
      case GraspDSLPackage.REASON__INHIBITS_CLAUSE:
        return inhibitsClause != null;
    }
    return super.eIsSet(featureID);
  }

} //ReasonImpl
