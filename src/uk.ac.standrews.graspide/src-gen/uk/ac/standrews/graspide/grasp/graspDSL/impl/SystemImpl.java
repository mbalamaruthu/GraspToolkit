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
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl#getBecauseClause <em>Because Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl#getSystemAnnotation <em>System Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl#getSystemConstituent <em>System Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements uk.ac.standrews.graspide.grasp.graspDSL.System
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBecauseClause() <em>Because Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecauseClause()
   * @generated
   * @ordered
   */
  protected BecauseClause becauseClause;

  /**
   * The cached value of the '{@link #getSystemAnnotation() <em>System Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> systemAnnotation;

  /**
   * The cached value of the '{@link #getSystemConstituent() <em>System Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemConstituent()
   * @generated
   * @ordered
   */
  protected EList<SystemConstituent> systemConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return GraspDSLPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecauseClause getBecauseClause()
  {
    return becauseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecauseClause(BecauseClause newBecauseClause, NotificationChain msgs)
  {
    BecauseClause oldBecauseClause = becauseClause;
    becauseClause = newBecauseClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE, oldBecauseClause, newBecauseClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecauseClause(BecauseClause newBecauseClause)
  {
    if (newBecauseClause != becauseClause)
    {
      NotificationChain msgs = null;
      if (becauseClause != null)
        msgs = ((InternalEObject)becauseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE, null, msgs);
      if (newBecauseClause != null)
        msgs = ((InternalEObject)newBecauseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE, null, msgs);
      msgs = basicSetBecauseClause(newBecauseClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE, newBecauseClause, newBecauseClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getSystemAnnotation()
  {
    if (systemAnnotation == null)
    {
      systemAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.SYSTEM__SYSTEM_ANNOTATION);
    }
    return systemAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemConstituent> getSystemConstituent()
  {
    if (systemConstituent == null)
    {
      systemConstituent = new EObjectContainmentEList<SystemConstituent>(SystemConstituent.class, this, GraspDSLPackage.SYSTEM__SYSTEM_CONSTITUENT);
    }
    return systemConstituent;
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
      case GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE:
        return basicSetBecauseClause(null, msgs);
      case GraspDSLPackage.SYSTEM__SYSTEM_ANNOTATION:
        return ((InternalEList<?>)getSystemAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.SYSTEM__SYSTEM_CONSTITUENT:
        return ((InternalEList<?>)getSystemConstituent()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.SYSTEM__NAME:
        return getName();
      case GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE:
        return getBecauseClause();
      case GraspDSLPackage.SYSTEM__SYSTEM_ANNOTATION:
        return getSystemAnnotation();
      case GraspDSLPackage.SYSTEM__SYSTEM_CONSTITUENT:
        return getSystemConstituent();
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
      case GraspDSLPackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)newValue);
        return;
      case GraspDSLPackage.SYSTEM__SYSTEM_ANNOTATION:
        getSystemAnnotation().clear();
        getSystemAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.SYSTEM__SYSTEM_CONSTITUENT:
        getSystemConstituent().clear();
        getSystemConstituent().addAll((Collection<? extends SystemConstituent>)newValue);
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
      case GraspDSLPackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)null);
        return;
      case GraspDSLPackage.SYSTEM__SYSTEM_ANNOTATION:
        getSystemAnnotation().clear();
        return;
      case GraspDSLPackage.SYSTEM__SYSTEM_CONSTITUENT:
        getSystemConstituent().clear();
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
      case GraspDSLPackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.SYSTEM__BECAUSE_CLAUSE:
        return becauseClause != null;
      case GraspDSLPackage.SYSTEM__SYSTEM_ANNOTATION:
        return systemAnnotation != null && !systemAnnotation.isEmpty();
      case GraspDSLPackage.SYSTEM__SYSTEM_CONSTITUENT:
        return systemConstituent != null && !systemConstituent.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SystemImpl
