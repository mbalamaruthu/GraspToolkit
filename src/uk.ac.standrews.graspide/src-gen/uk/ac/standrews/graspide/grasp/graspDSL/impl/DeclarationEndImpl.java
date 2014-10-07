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

import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationEndImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationEndImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationEndImpl extends MinimalEObjectImpl.Container implements DeclarationEnd
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
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationEndImpl()
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
    return GraspDSLPackage.Literals.DECLARATION_END;
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.DECLARATION_END__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclaration()
  {
    if (declaration == null)
    {
      declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this, GraspDSLPackage.DECLARATION_END__DECLARATION);
    }
    return declaration;
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
      case GraspDSLPackage.DECLARATION_END__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.DECLARATION_END__DECLARATION:
        return ((InternalEList<?>)getDeclaration()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.DECLARATION_END__ANNOTATION:
        return getAnnotation();
      case GraspDSLPackage.DECLARATION_END__DECLARATION:
        return getDeclaration();
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
      case GraspDSLPackage.DECLARATION_END__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.DECLARATION_END__DECLARATION:
        getDeclaration().clear();
        getDeclaration().addAll((Collection<? extends Declaration>)newValue);
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
      case GraspDSLPackage.DECLARATION_END__ANNOTATION:
        getAnnotation().clear();
        return;
      case GraspDSLPackage.DECLARATION_END__DECLARATION:
        getDeclaration().clear();
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
      case GraspDSLPackage.DECLARATION_END__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case GraspDSLPackage.DECLARATION_END__DECLARATION:
        return declaration != null && !declaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeclarationEndImpl
