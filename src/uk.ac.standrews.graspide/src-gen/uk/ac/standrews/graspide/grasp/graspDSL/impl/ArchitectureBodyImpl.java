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
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl#getDeclarationStart <em>Declaration Start</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl#getSystem <em>System</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl#getDeclarationEnd <em>Declaration End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureBodyImpl extends MinimalEObjectImpl.Container implements ArchitectureBody
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
   * The cached value of the '{@link #getDeclarationStart() <em>Declaration Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarationStart()
   * @generated
   * @ordered
   */
  protected DeclarationStart declarationStart;

  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected uk.ac.standrews.graspide.grasp.graspDSL.System system;

  /**
   * The cached value of the '{@link #getDeclarationEnd() <em>Declaration End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarationEnd()
   * @generated
   * @ordered
   */
  protected DeclarationEnd declarationEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureBodyImpl()
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
    return GraspDSLPackage.Literals.ARCHITECTURE_BODY;
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.ARCHITECTURE_BODY__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationStart getDeclarationStart()
  {
    return declarationStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarationStart(DeclarationStart newDeclarationStart, NotificationChain msgs)
  {
    DeclarationStart oldDeclarationStart = declarationStart;
    declarationStart = newDeclarationStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START, oldDeclarationStart, newDeclarationStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarationStart(DeclarationStart newDeclarationStart)
  {
    if (newDeclarationStart != declarationStart)
    {
      NotificationChain msgs = null;
      if (declarationStart != null)
        msgs = ((InternalEObject)declarationStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START, null, msgs);
      if (newDeclarationStart != null)
        msgs = ((InternalEObject)newDeclarationStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START, null, msgs);
      msgs = basicSetDeclarationStart(newDeclarationStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START, newDeclarationStart, newDeclarationStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.standrews.graspide.grasp.graspDSL.System getSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(uk.ac.standrews.graspide.grasp.graspDSL.System newSystem, NotificationChain msgs)
  {
    uk.ac.standrews.graspide.grasp.graspDSL.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM, oldSystem, newSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(uk.ac.standrews.graspide.grasp.graspDSL.System newSystem)
  {
    if (newSystem != system)
    {
      NotificationChain msgs = null;
      if (system != null)
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationEnd getDeclarationEnd()
  {
    return declarationEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarationEnd(DeclarationEnd newDeclarationEnd, NotificationChain msgs)
  {
    DeclarationEnd oldDeclarationEnd = declarationEnd;
    declarationEnd = newDeclarationEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END, oldDeclarationEnd, newDeclarationEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarationEnd(DeclarationEnd newDeclarationEnd)
  {
    if (newDeclarationEnd != declarationEnd)
    {
      NotificationChain msgs = null;
      if (declarationEnd != null)
        msgs = ((InternalEObject)declarationEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END, null, msgs);
      if (newDeclarationEnd != null)
        msgs = ((InternalEObject)newDeclarationEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END, null, msgs);
      msgs = basicSetDeclarationEnd(newDeclarationEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END, newDeclarationEnd, newDeclarationEnd));
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
      case GraspDSLPackage.ARCHITECTURE_BODY__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START:
        return basicSetDeclarationStart(null, msgs);
      case GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM:
        return basicSetSystem(null, msgs);
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END:
        return basicSetDeclarationEnd(null, msgs);
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
      case GraspDSLPackage.ARCHITECTURE_BODY__ANNOTATION:
        return getAnnotation();
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START:
        return getDeclarationStart();
      case GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM:
        return getSystem();
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END:
        return getDeclarationEnd();
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
      case GraspDSLPackage.ARCHITECTURE_BODY__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START:
        setDeclarationStart((DeclarationStart)newValue);
        return;
      case GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM:
        setSystem((uk.ac.standrews.graspide.grasp.graspDSL.System)newValue);
        return;
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END:
        setDeclarationEnd((DeclarationEnd)newValue);
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
      case GraspDSLPackage.ARCHITECTURE_BODY__ANNOTATION:
        getAnnotation().clear();
        return;
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START:
        setDeclarationStart((DeclarationStart)null);
        return;
      case GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM:
        setSystem((uk.ac.standrews.graspide.grasp.graspDSL.System)null);
        return;
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END:
        setDeclarationEnd((DeclarationEnd)null);
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
      case GraspDSLPackage.ARCHITECTURE_BODY__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_START:
        return declarationStart != null;
      case GraspDSLPackage.ARCHITECTURE_BODY__SYSTEM:
        return system != null;
      case GraspDSLPackage.ARCHITECTURE_BODY__DECLARATION_END:
        return declarationEnd != null;
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureBodyImpl
