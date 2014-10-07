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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.ParameterList;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl#getSuperRationale <em>Super Rationale</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RationaleImpl extends DeclarationImpl implements Rationale
{
  /**
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected ParameterList parameterList;

  /**
   * The cached value of the '{@link #getSuperRationale() <em>Super Rationale</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperRationale()
   * @generated
   * @ordered
   */
  protected Rationale superRationale;

  /**
   * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReason()
   * @generated
   * @ordered
   */
  protected EList<Reason> reason;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RationaleImpl()
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
    return GraspDSLPackage.Literals.RATIONALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getParameterList()
  {
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs)
  {
    ParameterList oldParameterList = parameterList;
    parameterList = newParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.RATIONALE__PARAMETER_LIST, oldParameterList, newParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterList(ParameterList newParameterList)
  {
    if (newParameterList != parameterList)
    {
      NotificationChain msgs = null;
      if (parameterList != null)
        msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.RATIONALE__PARAMETER_LIST, null, msgs);
      if (newParameterList != null)
        msgs = ((InternalEObject)newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.RATIONALE__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameterList(newParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.RATIONALE__PARAMETER_LIST, newParameterList, newParameterList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale getSuperRationale()
  {
    if (superRationale != null && superRationale.eIsProxy())
    {
      InternalEObject oldSuperRationale = (InternalEObject)superRationale;
      superRationale = (Rationale)eResolveProxy(oldSuperRationale);
      if (superRationale != oldSuperRationale)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraspDSLPackage.RATIONALE__SUPER_RATIONALE, oldSuperRationale, superRationale));
      }
    }
    return superRationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale basicGetSuperRationale()
  {
    return superRationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperRationale(Rationale newSuperRationale)
  {
    Rationale oldSuperRationale = superRationale;
    superRationale = newSuperRationale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.RATIONALE__SUPER_RATIONALE, oldSuperRationale, superRationale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reason> getReason()
  {
    if (reason == null)
    {
      reason = new EObjectContainmentEList<Reason>(Reason.class, this, GraspDSLPackage.RATIONALE__REASON);
    }
    return reason;
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
      case GraspDSLPackage.RATIONALE__PARAMETER_LIST:
        return basicSetParameterList(null, msgs);
      case GraspDSLPackage.RATIONALE__REASON:
        return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.RATIONALE__PARAMETER_LIST:
        return getParameterList();
      case GraspDSLPackage.RATIONALE__SUPER_RATIONALE:
        if (resolve) return getSuperRationale();
        return basicGetSuperRationale();
      case GraspDSLPackage.RATIONALE__REASON:
        return getReason();
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
      case GraspDSLPackage.RATIONALE__PARAMETER_LIST:
        setParameterList((ParameterList)newValue);
        return;
      case GraspDSLPackage.RATIONALE__SUPER_RATIONALE:
        setSuperRationale((Rationale)newValue);
        return;
      case GraspDSLPackage.RATIONALE__REASON:
        getReason().clear();
        getReason().addAll((Collection<? extends Reason>)newValue);
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
      case GraspDSLPackage.RATIONALE__PARAMETER_LIST:
        setParameterList((ParameterList)null);
        return;
      case GraspDSLPackage.RATIONALE__SUPER_RATIONALE:
        setSuperRationale((Rationale)null);
        return;
      case GraspDSLPackage.RATIONALE__REASON:
        getReason().clear();
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
      case GraspDSLPackage.RATIONALE__PARAMETER_LIST:
        return parameterList != null;
      case GraspDSLPackage.RATIONALE__SUPER_RATIONALE:
        return superRationale != null;
      case GraspDSLPackage.RATIONALE__REASON:
        return reason != null && !reason.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RationaleImpl
