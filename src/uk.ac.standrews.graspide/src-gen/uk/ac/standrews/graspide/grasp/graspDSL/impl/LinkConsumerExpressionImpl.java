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
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Consumer Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerExpressionImpl#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerExpressionImpl#getRightConsumer <em>Right Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkConsumerExpressionImpl extends MinimalEObjectImpl.Container implements LinkConsumerExpression
{
  /**
   * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumer()
   * @generated
   * @ordered
   */
  protected LinkConsumerPart consumer;

  /**
   * The cached value of the '{@link #getRightConsumer() <em>Right Consumer</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightConsumer()
   * @generated
   * @ordered
   */
  protected EList<String> rightConsumer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkConsumerExpressionImpl()
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
    return GraspDSLPackage.Literals.LINK_CONSUMER_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkConsumerPart getConsumer()
  {
    if (consumer != null && consumer.eIsProxy())
    {
      InternalEObject oldConsumer = (InternalEObject)consumer;
      consumer = (LinkConsumerPart)eResolveProxy(oldConsumer);
      if (consumer != oldConsumer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraspDSLPackage.LINK_CONSUMER_EXPRESSION__CONSUMER, oldConsumer, consumer));
      }
    }
    return consumer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkConsumerPart basicGetConsumer()
  {
    return consumer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConsumer(LinkConsumerPart newConsumer)
  {
    LinkConsumerPart oldConsumer = consumer;
    consumer = newConsumer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LINK_CONSUMER_EXPRESSION__CONSUMER, oldConsumer, consumer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRightConsumer()
  {
    if (rightConsumer == null)
    {
      rightConsumer = new EDataTypeEList<String>(String.class, this, GraspDSLPackage.LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER);
    }
    return rightConsumer;
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
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__CONSUMER:
        if (resolve) return getConsumer();
        return basicGetConsumer();
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER:
        return getRightConsumer();
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
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__CONSUMER:
        setConsumer((LinkConsumerPart)newValue);
        return;
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER:
        getRightConsumer().clear();
        getRightConsumer().addAll((Collection<? extends String>)newValue);
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
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__CONSUMER:
        setConsumer((LinkConsumerPart)null);
        return;
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER:
        getRightConsumer().clear();
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
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__CONSUMER:
        return consumer != null;
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER:
        return rightConsumer != null && !rightConsumer.isEmpty();
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
    result.append(" (rightConsumer: ");
    result.append(rightConsumer);
    result.append(')');
    return result.toString();
  }

} //LinkConsumerExpressionImpl
