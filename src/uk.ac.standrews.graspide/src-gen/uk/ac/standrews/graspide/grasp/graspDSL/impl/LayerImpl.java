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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl#getBecauseClause <em>Because Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl#getSuperLayer <em>Super Layer</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl#getLayerAnnotation <em>Layer Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl#getLayerConstituent <em>Layer Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayerImpl extends CompositionalImpl implements Layer
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
   * The cached value of the '{@link #getSuperLayer() <em>Super Layer</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperLayer()
   * @generated
   * @ordered
   */
  protected EList<Layer> superLayer;

  /**
   * The cached value of the '{@link #getLayerAnnotation() <em>Layer Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayerAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> layerAnnotation;

  /**
   * The cached value of the '{@link #getLayerConstituent() <em>Layer Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayerConstituent()
   * @generated
   * @ordered
   */
  protected EList<LayerConstituent> layerConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerImpl()
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
    return GraspDSLPackage.Literals.LAYER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LAYER__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LAYER__BECAUSE_CLAUSE, oldBecauseClause, newBecauseClause);
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
        msgs = ((InternalEObject)becauseClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LAYER__BECAUSE_CLAUSE, null, msgs);
      if (newBecauseClause != null)
        msgs = ((InternalEObject)newBecauseClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.LAYER__BECAUSE_CLAUSE, null, msgs);
      msgs = basicSetBecauseClause(newBecauseClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.LAYER__BECAUSE_CLAUSE, newBecauseClause, newBecauseClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Layer> getSuperLayer()
  {
    if (superLayer == null)
    {
      superLayer = new EObjectResolvingEList<Layer>(Layer.class, this, GraspDSLPackage.LAYER__SUPER_LAYER);
    }
    return superLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getLayerAnnotation()
  {
    if (layerAnnotation == null)
    {
      layerAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.LAYER__LAYER_ANNOTATION);
    }
    return layerAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LayerConstituent> getLayerConstituent()
  {
    if (layerConstituent == null)
    {
      layerConstituent = new EObjectContainmentEList<LayerConstituent>(LayerConstituent.class, this, GraspDSLPackage.LAYER__LAYER_CONSTITUENT);
    }
    return layerConstituent;
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
      case GraspDSLPackage.LAYER__BECAUSE_CLAUSE:
        return basicSetBecauseClause(null, msgs);
      case GraspDSLPackage.LAYER__LAYER_ANNOTATION:
        return ((InternalEList<?>)getLayerAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.LAYER__LAYER_CONSTITUENT:
        return ((InternalEList<?>)getLayerConstituent()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.LAYER__NAME:
        return getName();
      case GraspDSLPackage.LAYER__BECAUSE_CLAUSE:
        return getBecauseClause();
      case GraspDSLPackage.LAYER__SUPER_LAYER:
        return getSuperLayer();
      case GraspDSLPackage.LAYER__LAYER_ANNOTATION:
        return getLayerAnnotation();
      case GraspDSLPackage.LAYER__LAYER_CONSTITUENT:
        return getLayerConstituent();
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
      case GraspDSLPackage.LAYER__NAME:
        setName((String)newValue);
        return;
      case GraspDSLPackage.LAYER__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)newValue);
        return;
      case GraspDSLPackage.LAYER__SUPER_LAYER:
        getSuperLayer().clear();
        getSuperLayer().addAll((Collection<? extends Layer>)newValue);
        return;
      case GraspDSLPackage.LAYER__LAYER_ANNOTATION:
        getLayerAnnotation().clear();
        getLayerAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.LAYER__LAYER_CONSTITUENT:
        getLayerConstituent().clear();
        getLayerConstituent().addAll((Collection<? extends LayerConstituent>)newValue);
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
      case GraspDSLPackage.LAYER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraspDSLPackage.LAYER__BECAUSE_CLAUSE:
        setBecauseClause((BecauseClause)null);
        return;
      case GraspDSLPackage.LAYER__SUPER_LAYER:
        getSuperLayer().clear();
        return;
      case GraspDSLPackage.LAYER__LAYER_ANNOTATION:
        getLayerAnnotation().clear();
        return;
      case GraspDSLPackage.LAYER__LAYER_CONSTITUENT:
        getLayerConstituent().clear();
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
      case GraspDSLPackage.LAYER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraspDSLPackage.LAYER__BECAUSE_CLAUSE:
        return becauseClause != null;
      case GraspDSLPackage.LAYER__SUPER_LAYER:
        return superLayer != null && !superLayer.isEmpty();
      case GraspDSLPackage.LAYER__LAYER_ANNOTATION:
        return layerAnnotation != null && !layerAnnotation.isEmpty();
      case GraspDSLPackage.LAYER__LAYER_CONSTITUENT:
        return layerConstituent != null && !layerConstituent.isEmpty();
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
        case GraspDSLPackage.LAYER__NAME: return GraspDSLPackage.LINK_PROVIDER_PART__NAME;
        case GraspDSLPackage.LAYER__BECAUSE_CLAUSE: return GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE;
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
        case GraspDSLPackage.LINK_PROVIDER_PART__NAME: return GraspDSLPackage.LAYER__NAME;
        case GraspDSLPackage.LINK_PROVIDER_PART__BECAUSE_CLAUSE: return GraspDSLPackage.LAYER__BECAUSE_CLAUSE;
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

} //LayerImpl
