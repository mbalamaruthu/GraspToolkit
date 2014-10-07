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

import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl#getLinkConsumer <em>Link Consumer</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl#getLinkProviders <em>Link Providers</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl#getBecauseClause <em>Because Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl#getLinkConstituent <em>Link Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends CompositionalImpl implements Link
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLinkConsumer() <em>Link Consumer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkConsumer()
   * @generated
   * @ordered
   */
  protected LinkConsumerExpression linkConsumer;

  /**
   * The cached value of the '{@link #getLinkProviders() <em>Link Providers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkProviders()
   * @generated
   * @ordered
   */
  protected LinkProvidersList linkProviders;

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
   * The cached value of the '{@link #getLinkConstituent() <em>Link Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkConstituent()
   * @generated
   * @ordered
   */
  protected EList<LinkConstituent> linkConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl()
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
    return GraspDSLPackage.Literals.LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkConsumerExpression getLinkConsumer()
  {
    return linkConsumer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkConsumer(LinkConsumerExpression newLinkConsumer, NotificationChain msgs)
  {
    LinkConsumerExpression oldLinkConsumer = linkConsumer;
    linkConsumer = newLinkConsumer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__LINK_CONSUMER, oldLinkConsumer, newLinkConsumer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkConsumer(LinkConsumerExpression newLinkConsumer)
  {
    if (newLinkConsumer != linkConsumer)
    {
      NotificationChain msgs = null;
      if (linkConsumer != null)
        msgs = ((InternalEObject)linkConsumer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK__LINK_CONSUMER, null, msgs);
      if (newLinkConsumer != null)
        msgs = ((InternalEObject)newLinkConsumer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK__LINK_CONSUMER, null, msgs);
      msgs = basicSetLinkConsumer(newLinkConsumer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__LINK_CONSUMER, newLinkConsumer, newLinkConsumer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProvidersList getLinkProviders()
  {
    return linkProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkProviders(LinkProvidersList newLinkProviders, NotificationChain msgs)
  {
    LinkProvidersList oldLinkProviders = linkProviders;
    linkProviders = newLinkProviders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__LINK_PROVIDERS, oldLinkProviders, newLinkProviders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkProviders(LinkProvidersList newLinkProviders)
  {
    if (newLinkProviders != linkProviders)
    {
      NotificationChain msgs = null;
      if (linkProviders != null)
        msgs = ((InternalEObject)linkProviders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK__LINK_PROVIDERS, null, msgs);
      if (newLinkProviders != null)
        msgs = ((InternalEObject)newLinkProviders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK__LINK_PROVIDERS, null, msgs);
      msgs = basicSetLinkProviders(newLinkProviders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__LINK_PROVIDERS, newLinkProviders, newLinkProviders));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__BECAUSE_CLAUSE, oldBecauseClause, newBecauseClause);
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
        msgs = ((InternalEObject)becauseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK__BECAUSE_CLAUSE, null, msgs);
      if (newBecauseClause != null)
        msgs = ((InternalEObject)newBecauseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LINK__BECAUSE_CLAUSE, null, msgs);
      msgs = basicSetBecauseClause(newBecauseClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK__BECAUSE_CLAUSE, newBecauseClause, newBecauseClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkConstituent> getLinkConstituent()
  {
    if (linkConstituent == null)
    {
      linkConstituent = new EObjectContainmentEList<LinkConstituent>(LinkConstituent.class, this, GraspDSLPackage.LINK__LINK_CONSTITUENT);
    }
    return linkConstituent;
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
      case GraspDSLPackage.LINK__LINK_CONSUMER:
        return basicSetLinkConsumer(null, msgs);
      case GraspDSLPackage.LINK__LINK_PROVIDERS:
        return basicSetLinkProviders(null, msgs);
      case GraspDSLPackage.LINK__BECAUSE_CLAUSE:
        return basicSetBecauseClause(null, msgs);
      case GraspDSLPackage.LINK__LINK_CONSTITUENT:
        return ((InternalEList<?>)getLinkConstituent()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.LINK__TYPE:
        return getType();
      case GraspDSLPackage.LINK__LINK_CONSUMER:
        return getLinkConsumer();
      case GraspDSLPackage.LINK__LINK_PROVIDERS:
        return getLinkProviders();
      case GraspDSLPackage.LINK__BECAUSE_CLAUSE:
        return getBecauseClause();
      case GraspDSLPackage.LINK__LINK_CONSTITUENT:
        return getLinkConstituent();
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
      case GraspDSLPackage.LINK__TYPE:
        setType((String)newValue);
        return;
      case GraspDSLPackage.LINK__LINK_CONSUMER:
        setLinkConsumer((LinkConsumerExpression)newValue);
        return;
      case GraspDSLPackage.LINK__LINK_PROVIDERS:
        setLinkProviders((LinkProvidersList)newValue);
        return;
      case GraspDSLPackage.LINK__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)newValue);
        return;
      case GraspDSLPackage.LINK__LINK_CONSTITUENT:
        getLinkConstituent().clear();
        getLinkConstituent().addAll((Collection<? extends LinkConstituent>)newValue);
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
      case GraspDSLPackage.LINK__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case GraspDSLPackage.LINK__LINK_CONSUMER:
        setLinkConsumer((LinkConsumerExpression)null);
        return;
      case GraspDSLPackage.LINK__LINK_PROVIDERS:
        setLinkProviders((LinkProvidersList)null);
        return;
      case GraspDSLPackage.LINK__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)null);
        return;
      case GraspDSLPackage.LINK__LINK_CONSTITUENT:
        getLinkConstituent().clear();
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
      case GraspDSLPackage.LINK__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case GraspDSLPackage.LINK__LINK_CONSUMER:
        return linkConsumer != null;
      case GraspDSLPackage.LINK__LINK_PROVIDERS:
        return linkProviders != null;
      case GraspDSLPackage.LINK__BECAUSE_CLAUSE:
        return becauseClause != null;
      case GraspDSLPackage.LINK__LINK_CONSTITUENT:
        return linkConstituent != null && !linkConstituent.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
