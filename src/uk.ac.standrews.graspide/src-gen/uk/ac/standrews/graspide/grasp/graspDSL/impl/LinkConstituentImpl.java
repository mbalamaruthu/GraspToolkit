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
import uk.ac.standrews.graspide.grasp.graspDSL.Check;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Constituent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConstituentImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConstituentImpl#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkConstituentImpl extends MinimalEObjectImpl.Container implements LinkConstituent
{
  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotation;

  /**
   * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheck()
   * @generated
   * @ordered
   */
  protected Check check;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkConstituentImpl()
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
    return GraspDSLPackage.Literals.LINK_CONSTITUENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotation()
  {
    if (annotation == null)
    {
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.LINK_CONSTITUENT__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check getCheck()
  {
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheck(Check newCheck, NotificationChain msgs)
  {
    Check oldCheck = check;
    check = newCheck;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_CONSTITUENT__CHECK, oldCheck, newCheck);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheck(Check newCheck)
  {
    if (newCheck != check)
    {
      NotificationChain msgs = null;
      if (check != null)
        msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK_CONSTITUENT__CHECK, null, msgs);
      if (newCheck != null)
        msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK_CONSTITUENT__CHECK, null, msgs);
      msgs = basicSetCheck(newCheck, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_CONSTITUENT__CHECK, newCheck, newCheck));
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
      case GraspDSLPackage.LINK_CONSTITUENT__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.LINK_CONSTITUENT__CHECK:
        return basicSetCheck(null, msgs);
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
      case GraspDSLPackage.LINK_CONSTITUENT__ANNOTATION:
        return getAnnotation();
      case GraspDSLPackage.LINK_CONSTITUENT__CHECK:
        return getCheck();
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
      case GraspDSLPackage.LINK_CONSTITUENT__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.LINK_CONSTITUENT__CHECK:
        setCheck((Check)newValue);
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
      case GraspDSLPackage.LINK_CONSTITUENT__ANNOTATION:
        getAnnotation().clear();
        return;
      case GraspDSLPackage.LINK_CONSTITUENT__CHECK:
        setCheck((Check)null);
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
      case GraspDSLPackage.LINK_CONSTITUENT__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case GraspDSLPackage.LINK_CONSTITUENT__CHECK:
        return check != null;
    }
    return super.eIsSet(featureID);
  }

} //LinkConstituentImpl
