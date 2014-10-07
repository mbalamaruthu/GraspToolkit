/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grasp Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspSpecificationImpl#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraspSpecificationImpl extends MinimalEObjectImpl.Container implements GraspSpecification
{
  /**
   * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitecture()
   * @generated
   * @ordered
   */
  protected Architecture architecture;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraspSpecificationImpl()
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
    return GraspDSLPackage.Literals.GRASP_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Architecture getArchitecture()
  {
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArchitecture(Architecture newArchitecture, NotificationChain msgs)
  {
    Architecture oldArchitecture = architecture;
    architecture = newArchitecture;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE, oldArchitecture, newArchitecture);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchitecture(Architecture newArchitecture)
  {
    if (newArchitecture != architecture)
    {
      NotificationChain msgs = null;
      if (architecture != null)
        msgs = ((InternalEObject)architecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE, null, msgs);
      if (newArchitecture != null)
        msgs = ((InternalEObject)newArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE, null, msgs);
      msgs = basicSetArchitecture(newArchitecture, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE, newArchitecture, newArchitecture));
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
      case GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE:
        return basicSetArchitecture(null, msgs);
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
      case GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE:
        return getArchitecture();
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
      case GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE:
        setArchitecture((Architecture)newValue);
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
      case GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE:
        setArchitecture((Architecture)null);
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
      case GraspDSLPackage.GRASP_SPECIFICATION__ARCHITECTURE:
        return architecture != null;
    }
    return super.eIsSet(featureID);
  }

} //GraspSpecificationImpl
