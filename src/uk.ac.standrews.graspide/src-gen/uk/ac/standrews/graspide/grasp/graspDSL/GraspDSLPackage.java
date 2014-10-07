/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GraspDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "graspDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/standrews/graspide/grasp/GraspDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "graspDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GraspDSLPackage eINSTANCE = uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspSpecificationImpl <em>Grasp Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspSpecificationImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getGraspSpecification()
   * @generated
   */
  int GRASP_SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Architecture</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRASP_SPECIFICATION__ARCHITECTURE = 0;

  /**
   * The number of structural features of the '<em>Grasp Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRASP_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl <em>Architecture</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getArchitecture()
   * @generated
   */
  int ARCHITECTURE = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Architecutrebody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE__ARCHITECUTREBODY = 2;

  /**
   * The number of structural features of the '<em>Architecture</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl <em>Architecture Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getArchitectureBody()
   * @generated
   */
  int ARCHITECTURE_BODY = 2;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_BODY__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Declaration Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_BODY__DECLARATION_START = 1;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_BODY__SYSTEM = 2;

  /**
   * The feature id for the '<em><b>Declaration End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_BODY__DECLARATION_END = 3;

  /**
   * The number of structural features of the '<em>Architecture Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_BODY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationStartImpl <em>Declaration Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationStartImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getDeclarationStart()
   * @generated
   */
  int DECLARATION_START = 3;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_START__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_START__ANNOTATION = 1;

  /**
   * The number of structural features of the '<em>Declaration Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_START_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationEndImpl <em>Declaration End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationEndImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getDeclarationEnd()
   * @generated
   */
  int DECLARATION_END = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_END__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_END__DECLARATION = 1;

  /**
   * The number of structural features of the '<em>Declaration End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_END_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementOrQualityImpl <em>Requirement Or Quality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementOrQualityImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequirementOrQuality()
   * @generated
   */
  int REQUIREMENT_OR_QUALITY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_OR_QUALITY__NAME = DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Requirement Or Quality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_OR_QUALITY_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = REQUIREMENT_OR_QUALITY__NAME;

  /**
   * The feature id for the '<em><b>String Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STRING_LITERAL = REQUIREMENT_OR_QUALITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = REQUIREMENT_OR_QUALITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.QattributeImpl <em>Qattribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.QattributeImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getQattribute()
   * @generated
   */
  int QATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QATTRIBUTE__NAME = REQUIREMENT_OR_QUALITY__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QATTRIBUTE__EXPRESSION = REQUIREMENT_OR_QUALITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Supports Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QATTRIBUTE__SUPPORTS_CLAUSE = REQUIREMENT_OR_QUALITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Qattribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QATTRIBUTE_FEATURE_COUNT = REQUIREMENT_OR_QUALITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl <em>Rationale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRationale()
   * @generated
   */
  int RATIONALE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE__PARAMETER_LIST = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Rationale</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE__SUPER_RATIONALE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reason</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE__REASON = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rationale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIONALE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl <em>Reason</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getReason()
   * @generated
   */
  int REASON = 10;

  /**
   * The feature id for the '<em><b>Reason Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASON__REASON_ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASON__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Supports Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASON__SUPPORTS_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Inhibits Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASON__INHIBITS_CLAUSE = 3;

  /**
   * The number of structural features of the '<em>Reason</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__INTEGER_LITERAL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__PARAMETER_LIST = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__SUPER_TEMPLATE = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Template Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__TEMPLATE_ANNOTATION = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Template Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__TEMPLATE_CONSTITUENT = DECLARATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateConstituentImpl <em>Template Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getTemplateConstituent()
   * @generated
   */
  int TEMPLATE_CONSTITUENT = 12;

  /**
   * The number of structural features of the '<em>Template Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_CONSTITUENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl <em>Provides</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getProvides()
   * @generated
   */
  int PROVIDES = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__NAME = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__BECAUSE_CLAUSE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__VALUE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__TYPE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Provides Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES__PROVIDES_CONSTITUENT = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Provides</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES_FEATURE_COUNT = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesConstituentImpl <em>Provides Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getProvidesConstituent()
   * @generated
   */
  int PROVIDES_CONSTITUENT = 14;

  /**
   * The feature id for the '<em><b>Provides Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES_CONSTITUENT__PROVIDES_ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES_CONSTITUENT__CHECK = 1;

  /**
   * The number of structural features of the '<em>Provides Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDES_CONSTITUENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl <em>Requires</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequires()
   * @generated
   */
  int REQUIRES = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__TYPE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__VALUE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Because Requires Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__BECAUSE_REQUIRES_CLAUSE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Requires Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__REQUIRES_CONSTITUENT = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Requires</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_FEATURE_COUNT = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresConstituentImpl <em>Requires Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequiresConstituent()
   * @generated
   */
  int REQUIRES_CONSTITUENT = 16;

  /**
   * The feature id for the '<em><b>Requires Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_CONSTITUENT__REQUIRES_ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_CONSTITUENT__CHECK = 1;

  /**
   * The number of structural features of the '<em>Requires Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_CONSTITUENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.PropertyImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__EXPRESSION = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__BECAUSE_CLAUSE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.CheckImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 18;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__EXPRESSION = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__BECAUSE_CLAUSE = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = TEMPLATE_CONSTITUENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__BECAUSE_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>System Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SYSTEM_ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>System Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SYSTEM_CONSTITUENT = 3;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemConstituentImpl <em>System Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSystemConstituent()
   * @generated
   */
  int SYSTEM_CONSTITUENT = 20;

  /**
   * The number of structural features of the '<em>System Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_CONSTITUENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.CompositionalImpl <em>Compositional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.CompositionalImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getCompositional()
   * @generated
   */
  int COMPOSITIONAL = 21;

  /**
   * The number of structural features of the '<em>Compositional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITIONAL_FEATURE_COUNT = SYSTEM_CONSTITUENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLayer()
   * @generated
   */
  int LAYER = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NAME = COMPOSITIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__BECAUSE_CLAUSE = COMPOSITIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Layer</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__SUPER_LAYER = COMPOSITIONAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Layer Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__LAYER_ANNOTATION = COMPOSITIONAL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Layer Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__LAYER_CONSTITUENT = COMPOSITIONAL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = COMPOSITIONAL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerConstituentImpl <em>Layer Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLayerConstituent()
   * @generated
   */
  int LAYER_CONSTITUENT = 23;

  /**
   * The number of structural features of the '<em>Layer Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_CONSTITUENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = COMPOSITIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__BECAUSE_CLAUSE = COMPOSITIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VALUE = COMPOSITIONAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ARGUMENT_LIST = COMPOSITIONAL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ANNOTATION = COMPOSITIONAL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Instantiable Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INSTANTIABLE_CONSTITUENT = COMPOSITIONAL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = COMPOSITIONAL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ConnectorImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = COMPOSITIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__BECAUSE_CLAUSE = COMPOSITIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__VALUE = COMPOSITIONAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__ARGUMENT_LIST = COMPOSITIONAL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__ANNOTATION = COMPOSITIONAL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Instantiable Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__INSTANTIABLE_CONSTITUENT = COMPOSITIONAL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = COMPOSITIONAL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.InstantiableConstituentImpl <em>Instantiable Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.InstantiableConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getInstantiableConstituent()
   * @generated
   */
  int INSTANTIABLE_CONSTITUENT = 26;

  /**
   * The number of structural features of the '<em>Instantiable Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIABLE_CONSTITUENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLink()
   * @generated
   */
  int LINK = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TYPE = COMPOSITIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Link Consumer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINK_CONSUMER = COMPOSITIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Link Providers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINK_PROVIDERS = COMPOSITIONAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__BECAUSE_CLAUSE = COMPOSITIONAL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Link Constituent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINK_CONSTITUENT = COMPOSITIONAL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = COMPOSITIONAL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConstituentImpl <em>Link Constituent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConstituentImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkConstituent()
   * @generated
   */
  int LINK_CONSTITUENT = 28;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSTITUENT__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSTITUENT__CHECK = 1;

  /**
   * The number of structural features of the '<em>Link Constituent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSTITUENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerExpressionImpl <em>Link Consumer Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkConsumerExpression()
   * @generated
   */
  int LINK_CONSUMER_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Consumer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSUMER_EXPRESSION__CONSUMER = 0;

  /**
   * The feature id for the '<em><b>Right Consumer</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER = 1;

  /**
   * The number of structural features of the '<em>Link Consumer Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSUMER_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerPartImpl <em>Link Consumer Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerPartImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkConsumerPart()
   * @generated
   */
  int LINK_CONSUMER_PART = 30;

  /**
   * The number of structural features of the '<em>Link Consumer Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_CONSUMER_PART_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersListImpl <em>Link Providers List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersListImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkProvidersList()
   * @generated
   */
  int LINK_PROVIDERS_LIST = 31;

  /**
   * The feature id for the '<em><b>Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDERS_LIST__PROVIDERS = 0;

  /**
   * The number of structural features of the '<em>Link Providers List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDERS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersImpl <em>Link Providers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkProviders()
   * @generated
   */
  int LINK_PROVIDERS = 32;

  /**
   * The feature id for the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDERS__PROVIDER = 0;

  /**
   * The feature id for the '<em><b>Right Provider</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDERS__RIGHT_PROVIDER = 1;

  /**
   * The number of structural features of the '<em>Link Providers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProviderPartImpl <em>Link Provider Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProviderPartImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkProviderPart()
   * @generated
   */
  int LINK_PROVIDER_PART = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDER_PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDER_PART__BECAUSE_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Link Provider Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_PROVIDER_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.AnnotationImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 34;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValueImpl <em>Name Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValueImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getNameValue()
   * @generated
   */
  int NAME_VALUE = 35;

  /**
   * The feature id for the '<em><b>Name Pair</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VALUE__NAME_PAIR = 0;

  /**
   * The feature id for the '<em><b>Value Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VALUE__VALUE_PAIR = 1;

  /**
   * The number of structural features of the '<em>Name Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValuesImpl <em>Name Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValuesImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getNameValues()
   * @generated
   */
  int NAME_VALUES = 36;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VALUES__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Name Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VALUES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SupportsClauseImpl <em>Supports Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SupportsClauseImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSupportsClause()
   * @generated
   */
  int SUPPORTS_CLAUSE = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTS_CLAUSE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Supports Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTS_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.InhibitsClauseImpl <em>Inhibits Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.InhibitsClauseImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getInhibitsClause()
   * @generated
   */
  int INHIBITS_CLAUSE = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHIBITS_CLAUSE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Inhibits Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHIBITS_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseClauseImpl <em>Because Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseClauseImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBecauseClause()
   * @generated
   */
  int BECAUSE_CLAUSE = 39;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECAUSE_CLAUSE__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Because Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECAUSE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseCausalcontextImpl <em>Because Causalcontext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseCausalcontextImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBecauseCausalcontext()
   * @generated
   */
  int BECAUSE_CAUSALCONTEXT = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECAUSE_CAUSALCONTEXT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECAUSE_CAUSALCONTEXT__ARGUMENT_LIST = 1;

  /**
   * The number of structural features of the '<em>Because Causalcontext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECAUSE_CAUSALCONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ParameterListImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 41;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__NAMES = 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArgumentListImpl <em>Argument List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ArgumentListImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getArgumentList()
   * @generated
   */
  int ARGUMENT_LIST = 42;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_LIST__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Argument List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.PrimaryExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 55;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 43;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SubsetofExpressionImpl <em>Subsetof Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SubsetofExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSubsetofExpression()
   * @generated
   */
  int SUBSETOF_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Logical Or</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSETOF_EXPRESSION__LOGICAL_OR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subsetof Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSETOF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalOrExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLogicalOrExpression()
   * @generated
   */
  int LOGICAL_OR_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Logical And</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION__LOGICAL_AND = 0;

  /**
   * The number of structural features of the '<em>Logical Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalAndExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLogicalAndExpression()
   * @generated
   */
  int LOGICAL_AND_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Bitwise Or</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION__BITWISE_OR = 0;

  /**
   * The number of structural features of the '<em>Logical And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseOrExpressionImpl <em>Bitwise Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseOrExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBitwiseOrExpression()
   * @generated
   */
  int BITWISE_OR_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Bitwise Xor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPRESSION__BITWISE_XOR = 0;

  /**
   * The number of structural features of the '<em>Bitwise Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseXorExpressionImpl <em>Bitwise Xor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseXorExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBitwiseXorExpression()
   * @generated
   */
  int BITWISE_XOR_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Bitwise And</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_XOR_EXPRESSION__BITWISE_AND = 0;

  /**
   * The number of structural features of the '<em>Bitwise Xor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_XOR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseAndExpressionImpl <em>Bitwise And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseAndExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBitwiseAndExpression()
   * @generated
   */
  int BITWISE_AND_EXPRESSION = 49;

  /**
   * The feature id for the '<em><b>Equality</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPRESSION__EQUALITY = 0;

  /**
   * The number of structural features of the '<em>Bitwise And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.EqualityExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 50;

  /**
   * The feature id for the '<em><b>Relational</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__RELATIONAL = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RelationalExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 51;

  /**
   * The feature id for the '<em><b>Additive</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__ADDITIVE = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.AdditiveExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 52;

  /**
   * The feature id for the '<em><b>Multiplicative</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__MULTIPLICATIVE = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MultiplicativeExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Unary</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__UNARY = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__OP = 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.UnaryExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OP = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberExpressionImpl <em>Member Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberExpressionImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMemberExpression()
   * @generated
   */
  int MEMBER_EXPRESSION = 56;

  /**
   * The feature id for the '<em><b>Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_EXPRESSION__MEMBER = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Member Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberPartImpl <em>Member Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberPartImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMemberPart()
   * @generated
   */
  int MEMBER_PART = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Member Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_PART__MEMBER_ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Member Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberArgumentsImpl <em>Member Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberArgumentsImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMemberArguments()
   * @generated
   */
  int MEMBER_ARGUMENTS = 58;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_ARGUMENTS__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Member Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LiteralImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 59;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SetLiteralImpl <em>Set Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SetLiteralImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSetLiteral()
   * @generated
   */
  int SET_LITERAL = 60;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BOOLEAN_LITERALImpl
   * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBOOLEAN_LITERAL()
   * @generated
   */
  int BOOLEAN_LITERAL = 61;

  /**
   * The number of structural features of the '<em>BOOLEAN LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification <em>Grasp Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grasp Specification</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification
   * @generated
   */
  EClass getGraspSpecification();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification#getArchitecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Architecture</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification#getArchitecture()
   * @see #getGraspSpecification()
   * @generated
   */
  EReference getGraspSpecification_Architecture();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Architecture
   * @generated
   */
  EClass getArchitecture();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getAnnotation()
   * @see #getArchitecture()
   * @generated
   */
  EReference getArchitecture_Annotation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getName()
   * @see #getArchitecture()
   * @generated
   */
  EAttribute getArchitecture_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getArchitecutrebody <em>Architecutrebody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Architecutrebody</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getArchitecutrebody()
   * @see #getArchitecture()
   * @generated
   */
  EReference getArchitecture_Architecutrebody();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody <em>Architecture Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Body</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
   * @generated
   */
  EClass getArchitectureBody();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getAnnotation()
   * @see #getArchitectureBody()
   * @generated
   */
  EReference getArchitectureBody_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationStart <em>Declaration Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration Start</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationStart()
   * @see #getArchitectureBody()
   * @generated
   */
  EReference getArchitectureBody_DeclarationStart();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getSystem()
   * @see #getArchitectureBody()
   * @generated
   */
  EReference getArchitectureBody_System();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationEnd <em>Declaration End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration End</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationEnd()
   * @see #getArchitectureBody()
   * @generated
   */
  EReference getArchitectureBody_DeclarationEnd();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart <em>Declaration Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Start</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart
   * @generated
   */
  EClass getDeclarationStart();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart#getDeclaration()
   * @see #getDeclarationStart()
   * @generated
   */
  EReference getDeclarationStart_Declaration();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart#getAnnotation()
   * @see #getDeclarationStart()
   * @generated
   */
  EReference getDeclarationStart_Annotation();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd <em>Declaration End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration End</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd
   * @generated
   */
  EClass getDeclarationEnd();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd#getAnnotation()
   * @see #getDeclarationEnd()
   * @generated
   */
  EReference getDeclarationEnd_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd#getDeclaration()
   * @see #getDeclarationEnd()
   * @generated
   */
  EReference getDeclarationEnd_Declaration();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality <em>Requirement Or Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Or Quality</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality
   * @generated
   */
  EClass getRequirementOrQuality();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requirement#getStringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Literal</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requirement#getStringLiteral()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_StringLiteral();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute <em>Qattribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qattribute</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Qattribute
   * @generated
   */
  EClass getQattribute();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getExpression()
   * @see #getQattribute()
   * @generated
   */
  EReference getQattribute_Expression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getSupportsClause <em>Supports Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Supports Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getSupportsClause()
   * @see #getQattribute()
   * @generated
   */
  EReference getQattribute_SupportsClause();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rationale</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Rationale
   * @generated
   */
  EClass getRationale();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getParameterList()
   * @see #getRationale()
   * @generated
   */
  EReference getRationale_ParameterList();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getSuperRationale <em>Super Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Rationale</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getSuperRationale()
   * @see #getRationale()
   * @generated
   */
  EReference getRationale_SuperRationale();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getReason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reason</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getReason()
   * @see #getRationale()
   * @generated
   */
  EReference getRationale_Reason();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reason</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Reason
   * @generated
   */
  EClass getReason();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getReasonAnnotation <em>Reason Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reason Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Reason#getReasonAnnotation()
   * @see #getReason()
   * @generated
   */
  EReference getReason_ReasonAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Reason#getExpression()
   * @see #getReason()
   * @generated
   */
  EReference getReason_Expression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getSupportsClause <em>Supports Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Supports Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Reason#getSupportsClause()
   * @see #getReason()
   * @generated
   */
  EReference getReason_SupportsClause();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason#getInhibitsClause <em>Inhibits Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inhibits Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Reason#getInhibitsClause()
   * @see #getReason()
   * @generated
   */
  EReference getReason_InhibitsClause();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer Literal</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template#getIntegerLiteral()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template#getParameterList()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_ParameterList();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getSuperTemplate <em>Super Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Template</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template#getSuperTemplate()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_SuperTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getTemplateAnnotation <em>Template Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template#getTemplateAnnotation()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_TemplateAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template#getTemplateConstituent <em>Template Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template#getTemplateConstituent()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_TemplateConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent <em>Template Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent
   * @generated
   */
  EClass getTemplateConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides <em>Provides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provides</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Provides
   * @generated
   */
  EClass getProvides();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Provides#getValue()
   * @see #getProvides()
   * @generated
   */
  EAttribute getProvides_Value();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Provides#getType()
   * @see #getProvides()
   * @generated
   */
  EAttribute getProvides_Type();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getProvidesConstituent <em>Provides Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provides Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Provides#getProvidesConstituent()
   * @see #getProvides()
   * @generated
   */
  EReference getProvides_ProvidesConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent <em>Provides Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provides Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent
   * @generated
   */
  EClass getProvidesConstituent();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getProvidesAnnotation <em>Provides Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provides Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getProvidesAnnotation()
   * @see #getProvidesConstituent()
   * @generated
   */
  EReference getProvidesConstituent_ProvidesAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getCheck()
   * @see #getProvidesConstituent()
   * @generated
   */
  EReference getProvidesConstituent_Check();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requires</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requires
   * @generated
   */
  EClass getRequires();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requires#getType()
   * @see #getRequires()
   * @generated
   */
  EAttribute getRequires_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requires#getValue()
   * @see #getRequires()
   * @generated
   */
  EAttribute getRequires_Value();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getBecauseRequiresClause <em>Because Requires Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Because Requires Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requires#getBecauseRequiresClause()
   * @see #getRequires()
   * @generated
   */
  EReference getRequires_BecauseRequiresClause();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires#getRequiresConstituent <em>Requires Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requires#getRequiresConstituent()
   * @see #getRequires()
   * @generated
   */
  EReference getRequires_RequiresConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent <em>Requires Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requires Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent
   * @generated
   */
  EClass getRequiresConstituent();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent#getRequiresAnnotation <em>Requires Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent#getRequiresAnnotation()
   * @see #getRequiresConstituent()
   * @generated
   */
  EReference getRequiresConstituent_RequiresAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent#getCheck()
   * @see #getRequiresConstituent()
   * @generated
   */
  EReference getRequiresConstituent_Check();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Property#getExpression()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Expression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getBecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Because Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Property#getBecauseClause()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_BecauseClause();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Check#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Check#getExpression()
   * @see #getCheck()
   * @generated
   */
  EReference getCheck_Expression();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Check#getBecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Because Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Check#getBecauseClause()
   * @see #getCheck()
   * @generated
   */
  EReference getCheck_BecauseClause();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.System#getBecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Because Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.System#getBecauseClause()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_BecauseClause();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.System#getSystemAnnotation <em>System Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>System Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.System#getSystemAnnotation()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_SystemAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.System#getSystemConstituent <em>System Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>System Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.System#getSystemConstituent()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_SystemConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent <em>System Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent
   * @generated
   */
  EClass getSystemConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Compositional <em>Compositional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compositional</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Compositional
   * @generated
   */
  EClass getCompositional();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Layer
   * @generated
   */
  EClass getLayer();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer#getSuperLayer <em>Super Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Layer</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Layer#getSuperLayer()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_SuperLayer();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer#getLayerAnnotation <em>Layer Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layer Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Layer#getLayerAnnotation()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_LayerAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer#getLayerConstituent <em>Layer Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layer Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Layer#getLayerConstituent()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_LayerConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent <em>Layer Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent
   * @generated
   */
  EClass getLayerConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Component#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Component#getValue()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Value();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Component#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Component#getArgumentList()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_ArgumentList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Component#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Component#getAnnotation()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Component#getInstantiableConstituent <em>Instantiable Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instantiable Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Component#getInstantiableConstituent()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_InstantiableConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Connector#getValue()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Value();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Connector#getArgumentList()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_ArgumentList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Connector#getAnnotation()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getInstantiableConstituent <em>Instantiable Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instantiable Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Connector#getInstantiableConstituent()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_InstantiableConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent <em>Instantiable Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiable Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent
   * @generated
   */
  EClass getInstantiableConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link#getType()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Type();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConsumer <em>Link Consumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Consumer</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConsumer()
   * @see #getLink()
   * @generated
   */
  EReference getLink_LinkConsumer();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkProviders <em>Link Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Providers</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkProviders()
   * @see #getLink()
   * @generated
   */
  EReference getLink_LinkProviders();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getBecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Because Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link#getBecauseClause()
   * @see #getLink()
   * @generated
   */
  EReference getLink_BecauseClause();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConstituent <em>Link Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Link Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConstituent()
   * @see #getLink()
   * @generated
   */
  EReference getLink_LinkConstituent();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent <em>Link Constituent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Constituent</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent
   * @generated
   */
  EClass getLinkConstituent();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent#getAnnotation()
   * @see #getLinkConstituent()
   * @generated
   */
  EReference getLinkConstituent_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent#getCheck()
   * @see #getLinkConstituent()
   * @generated
   */
  EReference getLinkConstituent_Check();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression <em>Link Consumer Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Consumer Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression
   * @generated
   */
  EClass getLinkConsumerExpression();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getConsumer <em>Consumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Consumer</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getConsumer()
   * @see #getLinkConsumerExpression()
   * @generated
   */
  EReference getLinkConsumerExpression_Consumer();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getRightConsumer <em>Right Consumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Right Consumer</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getRightConsumer()
   * @see #getLinkConsumerExpression()
   * @generated
   */
  EAttribute getLinkConsumerExpression_RightConsumer();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart <em>Link Consumer Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Consumer Part</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart
   * @generated
   */
  EClass getLinkConsumerPart();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList <em>Link Providers List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Providers List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList
   * @generated
   */
  EClass getLinkProvidersList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList#getProviders <em>Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Providers</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList#getProviders()
   * @see #getLinkProvidersList()
   * @generated
   */
  EReference getLinkProvidersList_Providers();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders <em>Link Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Providers</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders
   * @generated
   */
  EClass getLinkProviders();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provider</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getProvider()
   * @see #getLinkProviders()
   * @generated
   */
  EReference getLinkProviders_Provider();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getRightProvider <em>Right Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Right Provider</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getRightProvider()
   * @see #getLinkProviders()
   * @generated
   */
  EAttribute getLinkProviders_RightProvider();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart <em>Link Provider Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Provider Part</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
   * @generated
   */
  EClass getLinkProviderPart();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getName()
   * @see #getLinkProviderPart()
   * @generated
   */
  EAttribute getLinkProviderPart_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getBecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Because Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getBecauseClause()
   * @see #getLinkProviderPart()
   * @generated
   */
  EReference getLinkProviderPart_BecauseClause();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Annotation</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getAnnotation()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue <em>Name Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValue
   * @generated
   */
  EClass getNameValue();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getNamePair <em>Name Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Pair</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getNamePair()
   * @see #getNameValue()
   * @generated
   */
  EAttribute getNameValue_NamePair();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getValuePair <em>Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Pair</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getValuePair()
   * @see #getNameValue()
   * @generated
   */
  EReference getNameValue_ValuePair();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValues <em>Name Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Values</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValues
   * @generated
   */
  EClass getNameValues();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValues#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValues#getMembers()
   * @see #getNameValues()
   * @generated
   */
  EReference getNameValues_Members();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause <em>Supports Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supports Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause
   * @generated
   */
  EClass getSupportsClause();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause#getValue()
   * @see #getSupportsClause()
   * @generated
   */
  EReference getSupportsClause_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause <em>Inhibits Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inhibits Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause
   * @generated
   */
  EClass getInhibitsClause();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause#getValue()
   * @see #getInhibitsClause()
   * @generated
   */
  EReference getInhibitsClause_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Because Clause</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause
   * @generated
   */
  EClass getBecauseClause();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause#getMembers()
   * @see #getBecauseClause()
   * @generated
   */
  EReference getBecauseClause_Members();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext <em>Because Causalcontext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Because Causalcontext</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext
   * @generated
   */
  EClass getBecauseCausalcontext();

  /**
   * Returns the meta object for the reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getValue()
   * @see #getBecauseCausalcontext()
   * @generated
   */
  EReference getBecauseCausalcontext_Value();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getArgumentList()
   * @see #getBecauseCausalcontext()
   * @generated
   */
  EReference getBecauseCausalcontext_ArgumentList();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.ParameterList#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ParameterList#getNames()
   * @see #getParameterList()
   * @generated
   */
  EAttribute getParameterList_Names();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument List</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList
   * @generated
   */
  EClass getArgumentList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList#getMembers()
   * @see #getArgumentList()
   * @generated
   */
  EReference getArgumentList_Members();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression <em>Subsetof Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsetof Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression
   * @generated
   */
  EClass getSubsetofExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression#getLogicalOr <em>Logical Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logical Or</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression#getLogicalOr()
   * @see #getSubsetofExpression()
   * @generated
   */
  EReference getSubsetofExpression_LogicalOr();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression <em>Logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Or Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression
   * @generated
   */
  EClass getLogicalOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression#getLogicalAnd <em>Logical And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logical And</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression#getLogicalAnd()
   * @see #getLogicalOrExpression()
   * @generated
   */
  EReference getLogicalOrExpression_LogicalAnd();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression <em>Logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical And Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression
   * @generated
   */
  EClass getLogicalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression#getBitwiseOr <em>Bitwise Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bitwise Or</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression#getBitwiseOr()
   * @see #getLogicalAndExpression()
   * @generated
   */
  EReference getLogicalAndExpression_BitwiseOr();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression <em>Bitwise Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Or Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression
   * @generated
   */
  EClass getBitwiseOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression#getBitwiseXor <em>Bitwise Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bitwise Xor</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression#getBitwiseXor()
   * @see #getBitwiseOrExpression()
   * @generated
   */
  EReference getBitwiseOrExpression_BitwiseXor();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression <em>Bitwise Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Xor Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression
   * @generated
   */
  EClass getBitwiseXorExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression#getBitwiseAnd <em>Bitwise And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bitwise And</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression#getBitwiseAnd()
   * @see #getBitwiseXorExpression()
   * @generated
   */
  EReference getBitwiseXorExpression_BitwiseAnd();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression <em>Bitwise And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise And Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression
   * @generated
   */
  EClass getBitwiseAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression#getEquality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equality</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression#getEquality()
   * @see #getBitwiseAndExpression()
   * @generated
   */
  EReference getBitwiseAndExpression_Equality();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression#getRelational <em>Relational</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relational</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression#getRelational()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Relational();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression#getOp()
   * @see #getEqualityExpression()
   * @generated
   */
  EAttribute getEqualityExpression_Op();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression#getAdditive <em>Additive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additive</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression#getAdditive()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Additive();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression#getOp()
   * @see #getRelationalExpression()
   * @generated
   */
  EAttribute getRelationalExpression_Op();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression#getMultiplicative <em>Multiplicative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multiplicative</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression#getMultiplicative()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Multiplicative();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression#getOp()
   * @see #getAdditiveExpression()
   * @generated
   */
  EAttribute getAdditiveExpression_Op();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression#getUnary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression#getUnary()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Unary();

  /**
   * Returns the meta object for the attribute list '{@link uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression#getOp()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EAttribute getMultiplicativeExpression_Op();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression#getOp()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression#getRight()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Right();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression <em>Member Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression
   * @generated
   */
  EClass getMemberExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Member</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression#getMember()
   * @see #getMemberExpression()
   * @generated
   */
  EReference getMemberExpression_Member();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart <em>Member Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Part</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberPart
   * @generated
   */
  EClass getMemberPart();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getName()
   * @see #getMemberPart()
   * @generated
   */
  EAttribute getMemberPart_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getMemberArguments <em>Member Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member Arguments</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getMemberArguments()
   * @see #getMemberPart()
   * @generated
   */
  EReference getMemberPart_MemberArguments();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments <em>Member Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Arguments</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments
   * @generated
   */
  EClass getMemberArguments();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments#getExpression()
   * @see #getMemberArguments()
   * @generated
   */
  EReference getMemberArguments_Expression();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral <em>Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Literal</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral
   * @generated
   */
  EClass getSetLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral#getLiteral()
   * @see #getSetLiteral()
   * @generated
   */
  EReference getSetLiteral_Literal();

  /**
   * Returns the meta object for class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN LITERAL</em>'.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL
   * @generated
   */
  EClass getBOOLEAN_LITERAL();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GraspDSLFactory getGraspDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspSpecificationImpl <em>Grasp Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspSpecificationImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getGraspSpecification()
     * @generated
     */
    EClass GRASP_SPECIFICATION = eINSTANCE.getGraspSpecification();

    /**
     * The meta object literal for the '<em><b>Architecture</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRASP_SPECIFICATION__ARCHITECTURE = eINSTANCE.getGraspSpecification_Architecture();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl <em>Architecture</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getArchitecture()
     * @generated
     */
    EClass ARCHITECTURE = eINSTANCE.getArchitecture();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE__ANNOTATION = eINSTANCE.getArchitecture_Annotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

    /**
     * The meta object literal for the '<em><b>Architecutrebody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE__ARCHITECUTREBODY = eINSTANCE.getArchitecture_Architecutrebody();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl <em>Architecture Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ArchitectureBodyImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getArchitectureBody()
     * @generated
     */
    EClass ARCHITECTURE_BODY = eINSTANCE.getArchitectureBody();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_BODY__ANNOTATION = eINSTANCE.getArchitectureBody_Annotation();

    /**
     * The meta object literal for the '<em><b>Declaration Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_BODY__DECLARATION_START = eINSTANCE.getArchitectureBody_DeclarationStart();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_BODY__SYSTEM = eINSTANCE.getArchitectureBody_System();

    /**
     * The meta object literal for the '<em><b>Declaration End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_BODY__DECLARATION_END = eINSTANCE.getArchitectureBody_DeclarationEnd();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationStartImpl <em>Declaration Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationStartImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getDeclarationStart()
     * @generated
     */
    EClass DECLARATION_START = eINSTANCE.getDeclarationStart();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_START__DECLARATION = eINSTANCE.getDeclarationStart_Declaration();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_START__ANNOTATION = eINSTANCE.getDeclarationStart_Annotation();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationEndImpl <em>Declaration End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationEndImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getDeclarationEnd()
     * @generated
     */
    EClass DECLARATION_END = eINSTANCE.getDeclarationEnd();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_END__ANNOTATION = eINSTANCE.getDeclarationEnd_Annotation();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_END__DECLARATION = eINSTANCE.getDeclarationEnd_Declaration();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.DeclarationImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementOrQualityImpl <em>Requirement Or Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementOrQualityImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequirementOrQuality()
     * @generated
     */
    EClass REQUIREMENT_OR_QUALITY = eINSTANCE.getRequirementOrQuality();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequirementImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>String Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__STRING_LITERAL = eINSTANCE.getRequirement_StringLiteral();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.QattributeImpl <em>Qattribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.QattributeImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getQattribute()
     * @generated
     */
    EClass QATTRIBUTE = eINSTANCE.getQattribute();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QATTRIBUTE__EXPRESSION = eINSTANCE.getQattribute_Expression();

    /**
     * The meta object literal for the '<em><b>Supports Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QATTRIBUTE__SUPPORTS_CLAUSE = eINSTANCE.getQattribute_SupportsClause();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl <em>Rationale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RationaleImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRationale()
     * @generated
     */
    EClass RATIONALE = eINSTANCE.getRationale();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RATIONALE__PARAMETER_LIST = eINSTANCE.getRationale_ParameterList();

    /**
     * The meta object literal for the '<em><b>Super Rationale</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RATIONALE__SUPER_RATIONALE = eINSTANCE.getRationale_SuperRationale();

    /**
     * The meta object literal for the '<em><b>Reason</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RATIONALE__REASON = eINSTANCE.getRationale_Reason();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl <em>Reason</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ReasonImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getReason()
     * @generated
     */
    EClass REASON = eINSTANCE.getReason();

    /**
     * The meta object literal for the '<em><b>Reason Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REASON__REASON_ANNOTATION = eINSTANCE.getReason_ReasonAnnotation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REASON__EXPRESSION = eINSTANCE.getReason_Expression();

    /**
     * The meta object literal for the '<em><b>Supports Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REASON__SUPPORTS_CLAUSE = eINSTANCE.getReason_SupportsClause();

    /**
     * The meta object literal for the '<em><b>Inhibits Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REASON__INHIBITS_CLAUSE = eINSTANCE.getReason_InhibitsClause();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Integer Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__INTEGER_LITERAL = eINSTANCE.getTemplate_IntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__PARAMETER_LIST = eINSTANCE.getTemplate_ParameterList();

    /**
     * The meta object literal for the '<em><b>Super Template</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__SUPER_TEMPLATE = eINSTANCE.getTemplate_SuperTemplate();

    /**
     * The meta object literal for the '<em><b>Template Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__TEMPLATE_ANNOTATION = eINSTANCE.getTemplate_TemplateAnnotation();

    /**
     * The meta object literal for the '<em><b>Template Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__TEMPLATE_CONSTITUENT = eINSTANCE.getTemplate_TemplateConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateConstituentImpl <em>Template Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.TemplateConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getTemplateConstituent()
     * @generated
     */
    EClass TEMPLATE_CONSTITUENT = eINSTANCE.getTemplateConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl <em>Provides</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getProvides()
     * @generated
     */
    EClass PROVIDES = eINSTANCE.getProvides();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDES__VALUE = eINSTANCE.getProvides_Value();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDES__TYPE = eINSTANCE.getProvides_Type();

    /**
     * The meta object literal for the '<em><b>Provides Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDES__PROVIDES_CONSTITUENT = eINSTANCE.getProvides_ProvidesConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesConstituentImpl <em>Provides Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ProvidesConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getProvidesConstituent()
     * @generated
     */
    EClass PROVIDES_CONSTITUENT = eINSTANCE.getProvidesConstituent();

    /**
     * The meta object literal for the '<em><b>Provides Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDES_CONSTITUENT__PROVIDES_ANNOTATION = eINSTANCE.getProvidesConstituent_ProvidesAnnotation();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDES_CONSTITUENT__CHECK = eINSTANCE.getProvidesConstituent_Check();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl <em>Requires</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequires()
     * @generated
     */
    EClass REQUIRES = eINSTANCE.getRequires();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRES__TYPE = eINSTANCE.getRequires_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRES__VALUE = eINSTANCE.getRequires_Value();

    /**
     * The meta object literal for the '<em><b>Because Requires Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES__BECAUSE_REQUIRES_CLAUSE = eINSTANCE.getRequires_BecauseRequiresClause();

    /**
     * The meta object literal for the '<em><b>Requires Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES__REQUIRES_CONSTITUENT = eINSTANCE.getRequires_RequiresConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresConstituentImpl <em>Requires Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RequiresConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRequiresConstituent()
     * @generated
     */
    EClass REQUIRES_CONSTITUENT = eINSTANCE.getRequiresConstituent();

    /**
     * The meta object literal for the '<em><b>Requires Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES_CONSTITUENT__REQUIRES_ANNOTATION = eINSTANCE.getRequiresConstituent_RequiresAnnotation();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES_CONSTITUENT__CHECK = eINSTANCE.getRequiresConstituent_Check();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.PropertyImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__EXPRESSION = eINSTANCE.getProperty_Expression();

    /**
     * The meta object literal for the '<em><b>Because Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__BECAUSE_CLAUSE = eINSTANCE.getProperty_BecauseClause();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.CheckImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK__EXPRESSION = eINSTANCE.getCheck_Expression();

    /**
     * The meta object literal for the '<em><b>Because Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK__BECAUSE_CLAUSE = eINSTANCE.getCheck_BecauseClause();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Because Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__BECAUSE_CLAUSE = eINSTANCE.getSystem_BecauseClause();

    /**
     * The meta object literal for the '<em><b>System Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__SYSTEM_ANNOTATION = eINSTANCE.getSystem_SystemAnnotation();

    /**
     * The meta object literal for the '<em><b>System Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__SYSTEM_CONSTITUENT = eINSTANCE.getSystem_SystemConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemConstituentImpl <em>System Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SystemConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSystemConstituent()
     * @generated
     */
    EClass SYSTEM_CONSTITUENT = eINSTANCE.getSystemConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.CompositionalImpl <em>Compositional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.CompositionalImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getCompositional()
     * @generated
     */
    EClass COMPOSITIONAL = eINSTANCE.getCompositional();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLayer()
     * @generated
     */
    EClass LAYER = eINSTANCE.getLayer();

    /**
     * The meta object literal for the '<em><b>Super Layer</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__SUPER_LAYER = eINSTANCE.getLayer_SuperLayer();

    /**
     * The meta object literal for the '<em><b>Layer Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__LAYER_ANNOTATION = eINSTANCE.getLayer_LayerAnnotation();

    /**
     * The meta object literal for the '<em><b>Layer Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__LAYER_CONSTITUENT = eINSTANCE.getLayer_LayerConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerConstituentImpl <em>Layer Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LayerConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLayerConstituent()
     * @generated
     */
    EClass LAYER_CONSTITUENT = eINSTANCE.getLayerConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ComponentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__VALUE = eINSTANCE.getComponent_Value();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ARGUMENT_LIST = eINSTANCE.getComponent_ArgumentList();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ANNOTATION = eINSTANCE.getComponent_Annotation();

    /**
     * The meta object literal for the '<em><b>Instantiable Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INSTANTIABLE_CONSTITUENT = eINSTANCE.getComponent_InstantiableConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ConnectorImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__VALUE = eINSTANCE.getConnector_Value();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__ARGUMENT_LIST = eINSTANCE.getConnector_ArgumentList();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__ANNOTATION = eINSTANCE.getConnector_Annotation();

    /**
     * The meta object literal for the '<em><b>Instantiable Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__INSTANTIABLE_CONSTITUENT = eINSTANCE.getConnector_InstantiableConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.InstantiableConstituentImpl <em>Instantiable Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.InstantiableConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getInstantiableConstituent()
     * @generated
     */
    EClass INSTANTIABLE_CONSTITUENT = eINSTANCE.getInstantiableConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

    /**
     * The meta object literal for the '<em><b>Link Consumer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__LINK_CONSUMER = eINSTANCE.getLink_LinkConsumer();

    /**
     * The meta object literal for the '<em><b>Link Providers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__LINK_PROVIDERS = eINSTANCE.getLink_LinkProviders();

    /**
     * The meta object literal for the '<em><b>Because Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__BECAUSE_CLAUSE = eINSTANCE.getLink_BecauseClause();

    /**
     * The meta object literal for the '<em><b>Link Constituent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__LINK_CONSTITUENT = eINSTANCE.getLink_LinkConstituent();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConstituentImpl <em>Link Constituent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConstituentImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkConstituent()
     * @generated
     */
    EClass LINK_CONSTITUENT = eINSTANCE.getLinkConstituent();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_CONSTITUENT__ANNOTATION = eINSTANCE.getLinkConstituent_Annotation();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_CONSTITUENT__CHECK = eINSTANCE.getLinkConstituent_Check();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerExpressionImpl <em>Link Consumer Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkConsumerExpression()
     * @generated
     */
    EClass LINK_CONSUMER_EXPRESSION = eINSTANCE.getLinkConsumerExpression();

    /**
     * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_CONSUMER_EXPRESSION__CONSUMER = eINSTANCE.getLinkConsumerExpression_Consumer();

    /**
     * The meta object literal for the '<em><b>Right Consumer</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER = eINSTANCE.getLinkConsumerExpression_RightConsumer();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerPartImpl <em>Link Consumer Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkConsumerPartImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkConsumerPart()
     * @generated
     */
    EClass LINK_CONSUMER_PART = eINSTANCE.getLinkConsumerPart();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersListImpl <em>Link Providers List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersListImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkProvidersList()
     * @generated
     */
    EClass LINK_PROVIDERS_LIST = eINSTANCE.getLinkProvidersList();

    /**
     * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_PROVIDERS_LIST__PROVIDERS = eINSTANCE.getLinkProvidersList_Providers();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersImpl <em>Link Providers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProvidersImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkProviders()
     * @generated
     */
    EClass LINK_PROVIDERS = eINSTANCE.getLinkProviders();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_PROVIDERS__PROVIDER = eINSTANCE.getLinkProviders_Provider();

    /**
     * The meta object literal for the '<em><b>Right Provider</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROVIDERS__RIGHT_PROVIDER = eINSTANCE.getLinkProviders_RightProvider();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProviderPartImpl <em>Link Provider Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LinkProviderPartImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLinkProviderPart()
     * @generated
     */
    EClass LINK_PROVIDER_PART = eINSTANCE.getLinkProviderPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_PROVIDER_PART__NAME = eINSTANCE.getLinkProviderPart_Name();

    /**
     * The meta object literal for the '<em><b>Because Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_PROVIDER_PART__BECAUSE_CLAUSE = eINSTANCE.getLinkProviderPart_BecauseClause();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.AnnotationImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__ANNOTATION = eINSTANCE.getAnnotation_Annotation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValueImpl <em>Name Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValueImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getNameValue()
     * @generated
     */
    EClass NAME_VALUE = eINSTANCE.getNameValue();

    /**
     * The meta object literal for the '<em><b>Name Pair</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_VALUE__NAME_PAIR = eINSTANCE.getNameValue_NamePair();

    /**
     * The meta object literal for the '<em><b>Value Pair</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_VALUE__VALUE_PAIR = eINSTANCE.getNameValue_ValuePair();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValuesImpl <em>Name Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.NameValuesImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getNameValues()
     * @generated
     */
    EClass NAME_VALUES = eINSTANCE.getNameValues();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_VALUES__MEMBERS = eINSTANCE.getNameValues_Members();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SupportsClauseImpl <em>Supports Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SupportsClauseImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSupportsClause()
     * @generated
     */
    EClass SUPPORTS_CLAUSE = eINSTANCE.getSupportsClause();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPPORTS_CLAUSE__VALUE = eINSTANCE.getSupportsClause_Value();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.InhibitsClauseImpl <em>Inhibits Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.InhibitsClauseImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getInhibitsClause()
     * @generated
     */
    EClass INHIBITS_CLAUSE = eINSTANCE.getInhibitsClause();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INHIBITS_CLAUSE__VALUE = eINSTANCE.getInhibitsClause_Value();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseClauseImpl <em>Because Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseClauseImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBecauseClause()
     * @generated
     */
    EClass BECAUSE_CLAUSE = eINSTANCE.getBecauseClause();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BECAUSE_CLAUSE__MEMBERS = eINSTANCE.getBecauseClause_Members();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseCausalcontextImpl <em>Because Causalcontext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BecauseCausalcontextImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBecauseCausalcontext()
     * @generated
     */
    EClass BECAUSE_CAUSALCONTEXT = eINSTANCE.getBecauseCausalcontext();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BECAUSE_CAUSALCONTEXT__VALUE = eINSTANCE.getBecauseCausalcontext_Value();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BECAUSE_CAUSALCONTEXT__ARGUMENT_LIST = eINSTANCE.getBecauseCausalcontext_ArgumentList();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ParameterListImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_LIST__NAMES = eINSTANCE.getParameterList_Names();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ArgumentListImpl <em>Argument List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ArgumentListImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getArgumentList()
     * @generated
     */
    EClass ARGUMENT_LIST = eINSTANCE.getArgumentList();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_LIST__MEMBERS = eINSTANCE.getArgumentList_Members();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.ExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SubsetofExpressionImpl <em>Subsetof Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SubsetofExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSubsetofExpression()
     * @generated
     */
    EClass SUBSETOF_EXPRESSION = eINSTANCE.getSubsetofExpression();

    /**
     * The meta object literal for the '<em><b>Logical Or</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSETOF_EXPRESSION__LOGICAL_OR = eINSTANCE.getSubsetofExpression_LogicalOr();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalOrExpressionImpl <em>Logical Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalOrExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLogicalOrExpression()
     * @generated
     */
    EClass LOGICAL_OR_EXPRESSION = eINSTANCE.getLogicalOrExpression();

    /**
     * The meta object literal for the '<em><b>Logical And</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR_EXPRESSION__LOGICAL_AND = eINSTANCE.getLogicalOrExpression_LogicalAnd();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalAndExpressionImpl <em>Logical And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LogicalAndExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLogicalAndExpression()
     * @generated
     */
    EClass LOGICAL_AND_EXPRESSION = eINSTANCE.getLogicalAndExpression();

    /**
     * The meta object literal for the '<em><b>Bitwise Or</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND_EXPRESSION__BITWISE_OR = eINSTANCE.getLogicalAndExpression_BitwiseOr();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseOrExpressionImpl <em>Bitwise Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseOrExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBitwiseOrExpression()
     * @generated
     */
    EClass BITWISE_OR_EXPRESSION = eINSTANCE.getBitwiseOrExpression();

    /**
     * The meta object literal for the '<em><b>Bitwise Xor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_OR_EXPRESSION__BITWISE_XOR = eINSTANCE.getBitwiseOrExpression_BitwiseXor();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseXorExpressionImpl <em>Bitwise Xor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseXorExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBitwiseXorExpression()
     * @generated
     */
    EClass BITWISE_XOR_EXPRESSION = eINSTANCE.getBitwiseXorExpression();

    /**
     * The meta object literal for the '<em><b>Bitwise And</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_XOR_EXPRESSION__BITWISE_AND = eINSTANCE.getBitwiseXorExpression_BitwiseAnd();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseAndExpressionImpl <em>Bitwise And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BitwiseAndExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBitwiseAndExpression()
     * @generated
     */
    EClass BITWISE_AND_EXPRESSION = eINSTANCE.getBitwiseAndExpression();

    /**
     * The meta object literal for the '<em><b>Equality</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_AND_EXPRESSION__EQUALITY = eINSTANCE.getBitwiseAndExpression_Equality();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.EqualityExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Relational</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__RELATIONAL = eINSTANCE.getEqualityExpression_Relational();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.RelationalExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getRelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

    /**
     * The meta object literal for the '<em><b>Additive</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__ADDITIVE = eINSTANCE.getRelationalExpression_Additive();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_EXPRESSION__OP = eINSTANCE.getRelationalExpression_Op();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.AdditiveExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Multiplicative</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__MULTIPLICATIVE = eINSTANCE.getAdditiveExpression_Multiplicative();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPRESSION__OP = eINSTANCE.getAdditiveExpression_Op();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MultiplicativeExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Unary</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__UNARY = eINSTANCE.getMultiplicativeExpression_Unary();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPRESSION__OP = eINSTANCE.getMultiplicativeExpression_Op();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.UnaryExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__RIGHT = eINSTANCE.getUnaryExpression_Right();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.PrimaryExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberExpressionImpl <em>Member Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberExpressionImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMemberExpression()
     * @generated
     */
    EClass MEMBER_EXPRESSION = eINSTANCE.getMemberExpression();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_EXPRESSION__MEMBER = eINSTANCE.getMemberExpression_Member();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberPartImpl <em>Member Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberPartImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMemberPart()
     * @generated
     */
    EClass MEMBER_PART = eINSTANCE.getMemberPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER_PART__NAME = eINSTANCE.getMemberPart_Name();

    /**
     * The meta object literal for the '<em><b>Member Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_PART__MEMBER_ARGUMENTS = eINSTANCE.getMemberPart_MemberArguments();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberArgumentsImpl <em>Member Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.MemberArgumentsImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getMemberArguments()
     * @generated
     */
    EClass MEMBER_ARGUMENTS = eINSTANCE.getMemberArguments();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_ARGUMENTS__EXPRESSION = eINSTANCE.getMemberArguments_Expression();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.LiteralImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.SetLiteralImpl <em>Set Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.SetLiteralImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getSetLiteral()
     * @generated
     */
    EClass SET_LITERAL = eINSTANCE.getSetLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_LITERAL__LITERAL = eINSTANCE.getSetLiteral_Literal();

    /**
     * The meta object literal for the '{@link uk.ac.standrews.graspide.grasp.graspDSL.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.BOOLEAN_LITERALImpl
     * @see uk.ac.standrews.graspide.grasp.graspDSL.impl.GraspDSLPackageImpl#getBOOLEAN_LITERAL()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBOOLEAN_LITERAL();

  }

} //GraspDSLPackage
