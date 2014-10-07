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
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl#getArchitecutrebody <em>Architecutrebody</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureImpl extends MinimalEObjectImpl.Container implements Architecture
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
   * The cached value of the '{@link #getArchitecutrebody() <em>Architecutrebody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitecutrebody()
   * @generated
   * @ordered
   */
  protected ArchitectureBody architecutrebody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureImpl()
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
    return GraspDSLPackage.Literals.ARCHITECTURE;
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.ARCHITECTURE__ANNOTATION);
    }
    return annotation;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureBody getArchitecutrebody()
  {
    return architecutrebody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArchitecutrebody(ArchitectureBody newArchitecutrebody, NotificationChain msgs)
  {
    ArchitectureBody oldArchitecutrebody = architecutrebody;
    architecutrebody = newArchitecutrebody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY, oldArchitecutrebody, newArchitecutrebody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchitecutrebody(ArchitectureBody newArchitecutrebody)
  {
    if (newArchitecutrebody != architecutrebody)
    {
      NotificationChain msgs = null;
      if (architecutrebody != null)
        msgs = ((InternalEObject)architecutrebody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY, null, msgs);
      if (newArchitecutrebody != null)
        msgs = ((InternalEObject)newArchitecutrebody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY, null, msgs);
      msgs = basicSetArchitecutrebody(newArchitecutrebody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY, newArchitecutrebody, newArchitecutrebody));
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
      case GraspDSLPackage.ARCHITECTURE__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY:
        return basicSetArchitecutrebody(null, msgs);
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
      case GraspDSLPackage.ARCHITECTURE__ANNOTATION:
        return getAnnotation();
      case GraspDSLPackage.ARCHITECTURE__NAME:
        return getName();
      case GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY:
        return getArchitecutrebody();
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
      case GraspDSLPackage.ARCHITECTURE__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.ARCHITECTURE__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY:
        setArchitecutrebody((ArchitectureBody)newValue);
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
      case GraspDSLPackage.ARCHITECTURE__ANNOTATION:
        getAnnotation().clear();
        return;
      case GraspDSLPackage.ARCHITECTURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY:
        setArchitecutrebody((ArchitectureBody)null);
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
      case GraspDSLPackage.ARCHITECTURE__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case GraspDSLPackage.ARCHITECTURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.ARCHITECTURE__ARCHITECUTREBODY:
        return architecutrebody != null;
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

} //ArchitectureImpl
