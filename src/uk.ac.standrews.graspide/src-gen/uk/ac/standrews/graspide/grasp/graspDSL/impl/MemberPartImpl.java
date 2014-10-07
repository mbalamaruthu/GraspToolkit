/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberPartImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberPartImpl#getMemberArguments <em>Member Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberPartImpl extends MinimalEObjectImpl.Container implements MemberPart
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
   * The cached value of the '{@link #getMemberArguments() <em>Member Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberArguments()
   * @generated
   * @ordered
   */
  protected MemberArguments memberArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberPartImpl()
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
    return GraspDSLPackage.Literals.MEMBER_PART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.MEMBER_PART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberArguments getMemberArguments()
  {
    return memberArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMemberArguments(MemberArguments newMemberArguments, NotificationChain msgs)
  {
    MemberArguments oldMemberArguments = memberArguments;
    memberArguments = newMemberArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS, oldMemberArguments, newMemberArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemberArguments(MemberArguments newMemberArguments)
  {
    if (newMemberArguments != memberArguments)
    {
      NotificationChain msgs = null;
      if (memberArguments != null)
        msgs = ((InternalEObject)memberArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS, null, msgs);
      if (newMemberArguments != null)
        msgs = ((InternalEObject)newMemberArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS, null, msgs);
      msgs = basicSetMemberArguments(newMemberArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS, newMemberArguments, newMemberArguments));
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
      case GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS:
        return basicSetMemberArguments(null, msgs);
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
      case GraspDSLPackage.MEMBER_PART__NAME:
        return getName();
      case GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS:
        return getMemberArguments();
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
      case GraspDSLPackage.MEMBER_PART__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS:
        setMemberArguments((MemberArguments)newValue);
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
      case GraspDSLPackage.MEMBER_PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS:
        setMemberArguments((MemberArguments)null);
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
      case GraspDSLPackage.MEMBER_PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.MEMBER_PART__MEMBER_ARGUMENTS:
        return memberArguments != null;
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

} //MemberPartImpl
