/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Providers List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersListImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkProvidersListImpl extends MinimalEObjectImpl.Container implements LinkProvidersList
{
  /**
   * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviders()
   * @generated
   * @ordered
   */
  protected EList<LinkProviders> providers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkProvidersListImpl()
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
    return GraspDSLPackage.Literals.LINK_PROVIDERS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkProviders> getProviders()
  {
    if (providers == null)
    {
      providers = new EObjectContainmentEList<LinkProviders>(LinkProviders.class, this, GraspDSLPackage.LINK_PROVIDERS_LIST__PROVIDERS);
    }
    return providers;
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
      case GraspDSLPackage.LINK_PROVIDERS_LIST__PROVIDERS:
        return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.LINK_PROVIDERS_LIST__PROVIDERS:
        return getProviders();
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
      case GraspDSLPackage.LINK_PROVIDERS_LIST__PROVIDERS:
        getProviders().clear();
        getProviders().addAll((Collection<? extends LinkProviders>)newValue);
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
      case GraspDSLPackage.LINK_PROVIDERS_LIST__PROVIDERS:
        getProviders().clear();
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
      case GraspDSLPackage.LINK_PROVIDERS_LIST__PROVIDERS:
        return providers != null && !providers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LinkProvidersListImpl
