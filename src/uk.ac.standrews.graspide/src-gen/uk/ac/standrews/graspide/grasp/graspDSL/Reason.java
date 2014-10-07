/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getReasonAnnotation <em>Reason Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getSupportsClause <em>Supports Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getInhibitsClause <em>Inhibits Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getReason()
 * @model
 * @generated
 */
public interface Reason extends EObject
{
  /**
   * Returns the value of the '<em><b>Reason Annotation</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reason Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reason Annotation</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getReason_ReasonAnnotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getReasonAnnotation();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getReason_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Supports Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supports Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supports Clause</em>' containment reference.
   * @see #setSupportsClause(SupportsClause)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getReason_SupportsClause()
   * @model containment="true"
   * @generated
   */
  SupportsClause getSupportsClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getSupportsClause <em>Supports Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supports Clause</em>' containment reference.
   * @see #getSupportsClause()
   * @generated
   */
  void setSupportsClause(SupportsClause value);

  /**
   * Returns the value of the '<em><b>Inhibits Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inhibits Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inhibits Clause</em>' containment reference.
   * @see #setInhibitsClause(InhibitsClause)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getReason_InhibitsClause()
   * @model containment="true"
   * @generated
   */
  InhibitsClause getInhibitsClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getInhibitsClause <em>Inhibits Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inhibits Clause</em>' containment reference.
   * @see #getInhibitsClause()
   * @generated
   */
  void setInhibitsClause(InhibitsClause value);

} // Reason
