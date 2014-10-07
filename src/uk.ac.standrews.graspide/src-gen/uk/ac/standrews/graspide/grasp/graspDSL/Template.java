/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getSuperTemplate <em>Super Template</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getTemplateAnnotation <em>Template Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getTemplateConstituent <em>Template Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends Declaration, TemplateConstituent
{
  /**
   * Returns the value of the '<em><b>Integer Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal</em>' attribute.
   * @see #setIntegerLiteral(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getTemplate_IntegerLiteral()
   * @model
   * @generated
   */
  String getIntegerLiteral();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getIntegerLiteral <em>Integer Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Literal</em>' attribute.
   * @see #getIntegerLiteral()
   * @generated
   */
  void setIntegerLiteral(String value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference.
   * @see #setParameterList(ParameterList)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getTemplate_ParameterList()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterList();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(ParameterList value);

  /**
   * Returns the value of the '<em><b>Super Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Template</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Template</em>' reference.
   * @see #setSuperTemplate(Template)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getTemplate_SuperTemplate()
   * @model
   * @generated
   */
  Template getSuperTemplate();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getSuperTemplate <em>Super Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Template</em>' reference.
   * @see #getSuperTemplate()
   * @generated
   */
  void setSuperTemplate(Template value);

  /**
   * Returns the value of the '<em><b>Template Annotation</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Annotation</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getTemplate_TemplateAnnotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getTemplateAnnotation();

  /**
   * Returns the value of the '<em><b>Template Constituent</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Constituent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Constituent</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getTemplate_TemplateConstituent()
   * @model containment="true"
   * @generated
   */
  EList<TemplateConstituent> getTemplateConstituent();

} // Template
