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
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.ParameterList;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl#getSuperTemplate <em>Super Template</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl#getTemplateAnnotation <em>Template Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl#getTemplateConstituent <em>Template Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends DeclarationImpl implements Template
{
  /**
   * The default value of the '{@link #getIntegerLiteral() <em>Integer Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerLiteral()
   * @generated
   * @ordered
   */
  protected static final String INTEGER_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntegerLiteral() <em>Integer Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerLiteral()
   * @generated
   * @ordered
   */
  protected String integerLiteral = INTEGER_LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected ParameterList parameterList;

  /**
   * The cached value of the '{@link #getSuperTemplate() <em>Super Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperTemplate()
   * @generated
   * @ordered
   */
  protected Template superTemplate;

  /**
   * The cached value of the '{@link #getTemplateAnnotation() <em>Template Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> templateAnnotation;

  /**
   * The cached value of the '{@link #getTemplateConstituent() <em>Template Constituent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateConstituent()
   * @generated
   * @ordered
   */
  protected EList<TemplateConstituent> templateConstituent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateImpl()
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
    return GraspDSLPackage.Literals.TEMPLATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntegerLiteral()
  {
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerLiteral(String newIntegerLiteral)
  {
    String oldIntegerLiteral = integerLiteral;
    integerLiteral = newIntegerLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.TEMPLATE__INTEGER_LITERAL, oldIntegerLiteral, integerLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getParameterList()
  {
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs)
  {
    ParameterList oldParameterList = parameterList;
    parameterList = newParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraspDSLPackage.TEMPLATE__PARAMETER_LIST, oldParameterList, newParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterList(ParameterList newParameterList)
  {
    if (newParameterList != parameterList)
    {
      NotificationChain msgs = null;
      if (parameterList != null)
        msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.TEMPLATE__PARAMETER_LIST, null, msgs);
      if (newParameterList != null)
        msgs = ((InternalEObject)newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraspDSLPackage.TEMPLATE__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameterList(newParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.TEMPLATE__PARAMETER_LIST, newParameterList, newParameterList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template getSuperTemplate()
  {
    if (superTemplate != null && superTemplate.eIsProxy())
    {
      InternalEObject oldSuperTemplate = (InternalEObject)superTemplate;
      superTemplate = (Template)eResolveProxy(oldSuperTemplate);
      if (superTemplate != oldSuperTemplate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraspDSLPackage.TEMPLATE__SUPER_TEMPLATE, oldSuperTemplate, superTemplate));
      }
    }
    return superTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template basicGetSuperTemplate()
  {
    return superTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperTemplate(Template newSuperTemplate)
  {
    Template oldSuperTemplate = superTemplate;
    superTemplate = newSuperTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraspDSLPackage.TEMPLATE__SUPER_TEMPLATE, oldSuperTemplate, superTemplate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getTemplateAnnotation()
  {
    if (templateAnnotation == null)
    {
      templateAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, GraspDSLPackage.TEMPLATE__TEMPLATE_ANNOTATION);
    }
    return templateAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateConstituent> getTemplateConstituent()
  {
    if (templateConstituent == null)
    {
      templateConstituent = new EObjectContainmentEList<TemplateConstituent>(TemplateConstituent.class, this, GraspDSLPackage.TEMPLATE__TEMPLATE_CONSTITUENT);
    }
    return templateConstituent;
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
      case GraspDSLPackage.TEMPLATE__PARAMETER_LIST:
        return basicSetParameterList(null, msgs);
      case GraspDSLPackage.TEMPLATE__TEMPLATE_ANNOTATION:
        return ((InternalEList<?>)getTemplateAnnotation()).basicRemove(otherEnd, msgs);
      case GraspDSLPackage.TEMPLATE__TEMPLATE_CONSTITUENT:
        return ((InternalEList<?>)getTemplateConstituent()).basicRemove(otherEnd, msgs);
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
      case GraspDSLPackage.TEMPLATE__INTEGER_LITERAL:
        return getIntegerLiteral();
      case GraspDSLPackage.TEMPLATE__PARAMETER_LIST:
        return getParameterList();
      case GraspDSLPackage.TEMPLATE__SUPER_TEMPLATE:
        if (resolve) return getSuperTemplate();
        return basicGetSuperTemplate();
      case GraspDSLPackage.TEMPLATE__TEMPLATE_ANNOTATION:
        return getTemplateAnnotation();
      case GraspDSLPackage.TEMPLATE__TEMPLATE_CONSTITUENT:
        return getTemplateConstituent();
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
      case GraspDSLPackage.TEMPLATE__INTEGER_LITERAL:
        setIntegerLiteral((String)newValue);
        return;
      case GraspDSLPackage.TEMPLATE__PARAMETER_LIST:
        setParameterList((ParameterList)newValue);
        return;
      case GraspDSLPackage.TEMPLATE__SUPER_TEMPLATE:
        setSuperTemplate((Template)newValue);
        return;
      case GraspDSLPackage.TEMPLATE__TEMPLATE_ANNOTATION:
        getTemplateAnnotation().clear();
        getTemplateAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case GraspDSLPackage.TEMPLATE__TEMPLATE_CONSTITUENT:
        getTemplateConstituent().clear();
        getTemplateConstituent().addAll((Collection<? extends TemplateConstituent>)newValue);
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
      case GraspDSLPackage.TEMPLATE__INTEGER_LITERAL:
        setIntegerLiteral(INTEGER_LITERAL_EDEFAULT);
        return;
      case GraspDSLPackage.TEMPLATE__PARAMETER_LIST:
        setParameterList((ParameterList)null);
        return;
      case GraspDSLPackage.TEMPLATE__SUPER_TEMPLATE:
        setSuperTemplate((Template)null);
        return;
      case GraspDSLPackage.TEMPLATE__TEMPLATE_ANNOTATION:
        getTemplateAnnotation().clear();
        return;
      case GraspDSLPackage.TEMPLATE__TEMPLATE_CONSTITUENT:
        getTemplateConstituent().clear();
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
      case GraspDSLPackage.TEMPLATE__INTEGER_LITERAL:
        return INTEGER_LITERAL_EDEFAULT == null ? integerLiteral != null : !INTEGER_LITERAL_EDEFAULT.equals(integerLiteral);
      case GraspDSLPackage.TEMPLATE__PARAMETER_LIST:
        return parameterList != null;
      case GraspDSLPackage.TEMPLATE__SUPER_TEMPLATE:
        return superTemplate != null;
      case GraspDSLPackage.TEMPLATE__TEMPLATE_ANNOTATION:
        return templateAnnotation != null && !templateAnnotation.isEmpty();
      case GraspDSLPackage.TEMPLATE__TEMPLATE_CONSTITUENT:
        return templateConstituent != null && !templateConstituent.isEmpty();
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
    result.append(" (integerLiteral: ");
    result.append(integerLiteral);
    result.append(')');
    return result.toString();
  }

} //TemplateImpl
