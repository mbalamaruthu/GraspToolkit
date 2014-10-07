/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Provider Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProviderPartImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProviderPartImpl#getBecauseClause <em>Because Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkProviderPartImpl extends MinimalEObjectImpl.Container implements LinkProviderPart
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkProviderPartImpl()
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
    return GraspDSLPackage.Literals.LINK_PROVIDER_PART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_PROVIDER_PART__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE, oldBecauseClause, newBecauseClause);
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
        msgs = ((InternalEObject)becauseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE, null, msgs);
      if (newBecauseClause != null)
        msgs = ((InternalEObject)newBecauseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE, null, msgs);
      msgs = basicSetBecauseClause(newBecauseClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE, newBecauseClause, newBecauseClause));
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
      case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE:
        return basicSetBecauseClause(null, msgs);
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
      case GraspDSLPackage.LINK_PROVIDER_PART__NAME:
        return getName();
      case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE:
        return getBecauseClause();
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
      case GraspDSLPackage.LINK_PROVIDER_PART__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)newValue);
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
      case GraspDSLPackage.LINK_PROVIDER_PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)null);
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
      case GraspDSLPackage.LINK_PROVIDER_PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE:
        return becauseClause != null;
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

} //LinkProviderPartImpl
