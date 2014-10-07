/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Providers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersImpl#getRightProvider <em>Right Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkProvidersImpl extends MinimalEObjectImpl.Container implements LinkProviders
{
  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected LinkProviderPart provider;

  /**
   * The cached value of the '{@link #getRightProvider() <em>Right Provider</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightProvider()
   * @generated
   * @ordered
   */
  protected EList<String> rightProvider;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkProvidersImpl()
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
    return GraspDSLPackage.Literals.LINK_PROVIDERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProviderPart getProvider()
  {
    if (provider != null && provider.eIsProxy())
    {
      InternalEObject oldProvider = (InternalEObject)provider;
      provider = (LinkProviderPart)eResolveProxy(oldProvider);
      if (provider != oldProvider)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraspDSLPackage.LINK_PROVIDERS__PROVIDER, oldProvider, provider));
      }
    }
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProviderPart basicGetProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(LinkProviderPart newProvider)
  {
    LinkProviderPart oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_PROVIDERS__PROVIDER, oldProvider, provider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRightProvider()
  {
    if (rightProvider == null)
    {
      rightProvider = new EDataTypeEList<String>(String.class, this, GraspDSLPackage.LINK_PROVIDERS__RIGHT_PROVIDER);
    }
    return rightProvider;
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
      case GraspDSLPackage.LINK_PROVIDERS__PROVIDER:
        if (resolve) return getProvider();
        return basicGetProvider();
      case GraspDSLPackage.LINK_PROVIDERS__RIGHT_PROVIDER:
        return getRightProvider();
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
      case GraspDSLPackage.LINK_PROVIDERS__PROVIDER:
        setProvider((LinkProviderPart)newValue);
        return;
      case GraspDSLPackage.LINK_PROVIDERS__RIGHT_PROVIDER:
        getRightProvider().clear();
        getRightProvider().addAll((Collection<? extends String>)newValue);
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
      case GraspDSLPackage.LINK_PROVIDERS__PROVIDER:
        setProvider((LinkProviderPart)null);
        return;
      case GraspDSLPackage.LINK_PROVIDERS__RIGHT_PROVIDER:
        getRightProvider().clear();
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
      case GraspDSLPackage.LINK_PROVIDERS__PROVIDER:
        return provider != null;
      case GraspDSLPackage.LINK_PROVIDERS__RIGHT_PROVIDER:
        return rightProvider != null && !rightProvider.isEmpty();
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
    result.append(" (rightProvider: ");
    result.append(rightProvider);
    result.append(')');
    return result.toString();
  }

} //LinkProvidersImpl
