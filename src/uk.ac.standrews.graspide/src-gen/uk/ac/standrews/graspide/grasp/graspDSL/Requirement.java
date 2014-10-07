/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Requirement#getStringLiteral <em>String Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends RequirementOrQuality
{
  /**
   * Returns the value of the '<em><b>String Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Literal</em>' attribute.
   * @see #setStringLiteral(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRequirement_StringLiteral()
   * @model
   * @generated
   */
  String getStringLiteral();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requirement#getStringLiteral <em>String Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Literal</em>' attribute.
   * @see #getStringLiteral()
   * @generated
   */
  void setStringLiteral(String value);

} // Requirement
