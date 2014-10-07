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

import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl#getBecauseClause <em>Because Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl#getInstantiableConstituent <em>Instantiable Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends CompositionalImpl implements Component
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
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Template value;

  /**
   * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentList()
   * @generated
   * @ordered
   */
  protected ArgumentList argumentList;

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
   * The cached value of the '{@link #getInstantiableConstituent() <em>Instantiable Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstantiableConstituent()
   * @generated
   * @ordered
   */
  protected EList<InstantiableConstituent> instantiableConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return GraspDSLPackage.Literals.COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.COMPONENT__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE, oldBecauseClause, newBecauseClause);
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
        msgs = ((InternalEObject)becauseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE, null, msgs);
      if (newBecauseClause != null)
        msgs = ((InternalEObject)newBecauseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE, null, msgs);
      msgs = basicSetBecauseClause(newBecauseClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE, newBecauseClause, newBecauseClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (Template)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraspDSLPackage.COMPONENT__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Template newValue)
  {
    Template oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.COMPONENT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList getArgumentList()
  {
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgumentList(ArgumentList newArgumentList, NotificationChain msgs)
  {
    ArgumentList oldArgumentList = argumentList;
    argumentList = newArgumentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.COMPONENT__ARGUMENT_LIST, oldArgumentList, newArgumentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgumentList(ArgumentList newArgumentList)
  {
    if (newArgumentList != argumentList)
    {
      NotificationChain msgs = null;
      if (argumentList != null)
        msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.COMPONENT__ARGUMENT_LIST, null, msgs);
      if (newArgumentList != null)
        msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.COMPONENT__ARGUMENT_LIST, null, msgs);
      msgs = basicSetArgumentList(newArgumentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.COMPONENT__ARGUMENT_LIST, newArgumentList, newArgumentList));
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.COMPONENT__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstantiableConstituent> getInstantiableConstituent()
  {
    if (instantiableConstituent == null)
    {
      instantiableConstituent = new EObjectContainmentEList<InstantiableConstituent>(InstantiableConstituent.class, this, GraspDSLPackage.COMPONENT__INSTANTIABLE_CONSTITUENT);
    }
    return instantiableConstituent;
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
      case GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE:
        return basicSetBecauseClause(null, msgs);
      case GraspDSLPackage.COMPONENT__ARGUMENT_LIST:
        return basicSetArgumentList(null, msgs);
      case GraspDSLPackage.COMPONENT__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.COMPONENT__INSTANTIABLE_CONSTITUENT:
        return ((InternalEList<?>)getInstantiableConstituent()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.COMPONENT__NAME:
        return getName();
      case GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE:
        return getBecauseClause();
      case GraspDSLPackage.COMPONENT__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case GraspDSLPackage.COMPONENT__ARGUMENT_LIST:
        return getArgumentList();
      case GraspDSLPackage.COMPONENT__ANNOTATION:
        return getAnnotation();
      case GraspDSLPackage.COMPONENT__INSTANTIABLE_CONSTITUENT:
        return getInstantiableConstituent();
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
      case GraspDSLPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)newValue);
        return;
      case GraspDSLPackage.COMPONENT__VALUE:
        setValue((Template)newValue);
        return;
      case GraspDSLPackage.COMPONENT__ARGUMENT_LIST:
        setArgumentList((ArgumentList)newValue);
        return;
      case GraspDSLPackage.COMPONENT__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.COMPONENT__INSTANTIABLE_CONSTITUENT:
        getInstantiableConstituent().clear();
        getInstantiableConstituent().addAll((Collection<? extends InstantiableConstituent>)newValue);
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
      case GraspDSLPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)null);
        return;
      case GraspDSLPackage.COMPONENT__VALUE:
        setValue((Template)null);
        return;
      case GraspDSLPackage.COMPONENT__ARGUMENT_LIST:
        setArgumentList((ArgumentList)null);
        return;
      case GraspDSLPackage.COMPONENT__ANNOTATION:
        getAnnotation().clear();
        return;
      case GraspDSLPackage.COMPONENT__INSTANTIABLE_CONSTITUENT:
        getInstantiableConstituent().clear();
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
      case GraspDSLPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE:
        return becauseClause != null;
      case GraspDSLPackage.COMPONENT__VALUE:
        return value != null;
      case GraspDSLPackage.COMPONENT__ARGUMENT_LIST:
        return argumentList != null;
      case GraspDSLPackage.COMPONENT__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case GraspDSLPackage.COMPONENT__INSTANTIABLE_CONSTITUENT:
        return instantiableConstituent != null && !instantiableConstituent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == LinkConsumerPart.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == LinkProviderPart.class)
    {
      switch (derivedFeatureID)
      {
        case GraspDSLPackage.COMPONENT__NAME: return GraspDSLPackage.LINK_PROVIDER_PART__NAME;
        case GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE: return GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == LinkConsumerPart.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == LinkProviderPart.class)
    {
      switch (baseFeatureID)
      {
        case GraspDSLPackage.LINK_PROVIDER_PART__NAME: return GraspDSLPackage.COMPONENT__NAME;
        case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE: return GraspDSLPackage.COMPONENT__BECAUSE_CLAUSE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //ComponentImpl
