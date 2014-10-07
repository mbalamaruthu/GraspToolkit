/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
 * @generated
 */
public interface GraspDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraspDSLFactory eINSTANCE = uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Grasp Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grasp Specification</em>'.
   * @generated
   */
  GraspSpecification createGraspSpecification();

  /**
   * Returns a new object of class '<em>Architecture</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture</em>'.
   * @generated
   */
  Architecture createArchitecture();

  /**
   * Returns a new object of class '<em>Architecture Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture Body</em>'.
   * @generated
   */
  ArchitectureBody createArchitectureBody();

  /**
   * Returns a new object of class '<em>Declaration Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration Start</em>'.
   * @generated
   */
  DeclarationStart createDeclarationStart();

  /**
   * Returns a new object of class '<em>Declaration End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration End</em>'.
   * @generated
   */
  DeclarationEnd createDeclarationEnd();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Requirement Or Quality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement Or Quality</em>'.
   * @generated
   */
  RequirementOrQuality createRequirementOrQuality();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>Qattribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qattribute</em>'.
   * @generated
   */
  Qattribute createQattribute();

  /**
   * Returns a new object of class '<em>Rationale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rationale</em>'.
   * @generated
   */
  Rationale createRationale();

  /**
   * Returns a new object of class '<em>Reason</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reason</em>'.
   * @generated
   */
  Reason createReason();

  /**
   * Returns a new object of class '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template</em>'.
   * @generated
   */
  Template createTemplate();

  /**
   * Returns a new object of class '<em>Template Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Constituent</em>'.
   * @generated
   */
  TemplateConstituent createTemplateConstituent();

  /**
   * Returns a new object of class '<em>Provides</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provides</em>'.
   * @generated
   */
  Provides createProvides();

  /**
   * Returns a new object of class '<em>Provides Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provides Constituent</em>'.
   * @generated
   */
  ProvidesConstituent createProvidesConstituent();

  /**
   * Returns a new object of class '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requires</em>'.
   * @generated
   */
  Requires createRequires();

  /**
   * Returns a new object of class '<em>Requires Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requires Constituent</em>'.
   * @generated
   */
  RequiresConstituent createRequiresConstituent();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check</em>'.
   * @generated
   */
  Check createCheck();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>System Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Constituent</em>'.
   * @generated
   */
  SystemConstituent createSystemConstituent();

  /**
   * Returns a new object of class '<em>Compositional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compositional</em>'.
   * @generated
   */
  Compositional createCompositional();

  /**
   * Returns a new object of class '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layer</em>'.
   * @generated
   */
  Layer createLayer();

  /**
   * Returns a new object of class '<em>Layer Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layer Constituent</em>'.
   * @generated
   */
  LayerConstituent createLayerConstituent();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>Instantiable Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instantiable Constituent</em>'.
   * @generated
   */
  InstantiableConstituent createInstantiableConstituent();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Link Constituent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Constituent</em>'.
   * @generated
   */
  LinkConstituent createLinkConstituent();

  /**
   * Returns a new object of class '<em>Link Consumer Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Consumer Expression</em>'.
   * @generated
   */
  LinkConsumerExpression createLinkConsumerExpression();

  /**
   * Returns a new object of class '<em>Link Consumer Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Consumer Part</em>'.
   * @generated
   */
  LinkConsumerPart createLinkConsumerPart();

  /**
   * Returns a new object of class '<em>Link Providers List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Providers List</em>'.
   * @generated
   */
  LinkProvidersList createLinkProvidersList();

  /**
   * Returns a new object of class '<em>Link Providers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Providers</em>'.
   * @generated
   */
  LinkProviders createLinkProviders();

  /**
   * Returns a new object of class '<em>Link Provider Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Provider Part</em>'.
   * @generated
   */
  LinkProviderPart createLinkProviderPart();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Name Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Value</em>'.
   * @generated
   */
  NameValue createNameValue();

  /**
   * Returns a new object of class '<em>Name Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Values</em>'.
   * @generated
   */
  NameValues createNameValues();

  /**
   * Returns a new object of class '<em>Supports Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supports Clause</em>'.
   * @generated
   */
  SupportsClause createSupportsClause();

  /**
   * Returns a new object of class '<em>Inhibits Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inhibits Clause</em>'.
   * @generated
   */
  InhibitsClause createInhibitsClause();

  /**
   * Returns a new object of class '<em>Because Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Because Clause</em>'.
   * @generated
   */
  BecauseClause createBecauseClause();

  /**
   * Returns a new object of class '<em>Because Causalcontext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Because Causalcontext</em>'.
   * @generated
   */
  BecauseCausalcontext createBecauseCausalcontext();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Argument List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument List</em>'.
   * @generated
   */
  ArgumentList createArgumentList();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Subsetof Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsetof Expression</em>'.
   * @generated
   */
  SubsetofExpression createSubsetofExpression();

  /**
   * Returns a new object of class '<em>Logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Or Expression</em>'.
   * @generated
   */
  LogicalOrExpression createLogicalOrExpression();

  /**
   * Returns a new object of class '<em>Logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical And Expression</em>'.
   * @generated
   */
  LogicalAndExpression createLogicalAndExpression();

  /**
   * Returns a new object of class '<em>Bitwise Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise Or Expression</em>'.
   * @generated
   */
  BitwiseOrExpression createBitwiseOrExpression();

  /**
   * Returns a new object of class '<em>Bitwise Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise Xor Expression</em>'.
   * @generated
   */
  BitwiseXorExpression createBitwiseXorExpression();

  /**
   * Returns a new object of class '<em>Bitwise And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise And Expression</em>'.
   * @generated
   */
  BitwiseAndExpression createBitwiseAndExpression();

  /**
   * Returns a new object of class '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality Expression</em>'.
   * @generated
   */
  EqualityExpression createEqualityExpression();

  /**
   * Returns a new object of class '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational Expression</em>'.
   * @generated
   */
  RelationalExpression createRelationalExpression();

  /**
   * Returns a new object of class '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expression</em>'.
   * @generated
   */
  AdditiveExpression createAdditiveExpression();

  /**
   * Returns a new object of class '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expression</em>'.
   * @generated
   */
  MultiplicativeExpression createMultiplicativeExpression();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Member Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Expression</em>'.
   * @generated
   */
  MemberExpression createMemberExpression();

  /**
   * Returns a new object of class '<em>Member Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Part</em>'.
   * @generated
   */
  MemberPart createMemberPart();

  /**
   * Returns a new object of class '<em>Member Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Arguments</em>'.
   * @generated
   */
  MemberArguments createMemberArguments();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Literal</em>'.
   * @generated
   */
  SetLiteral createSetLiteral();

  /**
   * Returns a new object of class '<em>BOOLEAN LITERAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOLEAN LITERAL</em>'.
   * @generated
   */
  BOOLEAN_LITERAL createBOOLEAN_LITERAL();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GraspDSLPackage getGraspDSLPackage();

} //GraspDSLFactory
