/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getBecauseRequiresClause <em>Because Requires Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getRequiresConstituent <em>Requires Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequires()
 * @model
 * @generated
 */
public interface Requires extends TemplateConstituent, LinkConsumerPart
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequires_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequires_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Because Requires Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Because Requires Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Because Requires Clause</em>' containment reference.
   * @see #setBecauseRequiresClause(BecauseClause)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequires_BecauseRequiresClause()
   * @model containment="true"
   * @generated
   */
  BecauseClause getBecauseRequiresClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getBecauseRequiresClause <em>Because Requires Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Because Requires Clause</em>' containment reference.
   * @see #getBecauseRequiresClause()
   * @generated
   */
  void setBecauseRequiresClause(BecauseClause value);

  /**
   * Returns the value of the '<em><b>Requires Constituent</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires Constituent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires Constituent</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequires_RequiresConstituent()
   * @model containment="true"
   * @generated
   */
  EList<RequiresConstituent> getRequiresConstituent();

} // Requires
