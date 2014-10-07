/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList;
import uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Check;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Compositional;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Expression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.graspDSL.Literal;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberPart;
import uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.NameValue;
import uk.ac.standrews.graspide.grasp.graspDSL.NameValues;
import uk.ac.standrews.graspide.grasp.graspDSL.ParameterList;
import uk.ac.standrews.graspide.grasp.graspDSL.PrimaryExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Property;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement;
import uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral;
import uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
 * @generated
 */
public class GraspDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GraspDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraspDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GraspDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GraspDSLPackage.GRASP_SPECIFICATION:
      {
        GraspSpecification graspSpecification = (GraspSpecification)theEObject;
        T result = caseGraspSpecification(graspSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.ARCHITECTURE:
      {
        Architecture architecture = (Architecture)theEObject;
        T result = caseArchitecture(architecture);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.ARCHITECTURE_BODY:
      {
        ArchitectureBody architectureBody = (ArchitectureBody)theEObject;
        T result = caseArchitectureBody(architectureBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.DECLARATION_START:
      {
        DeclarationStart declarationStart = (DeclarationStart)theEObject;
        T result = caseDeclarationStart(declarationStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.DECLARATION_END:
      {
        DeclarationEnd declarationEnd = (DeclarationEnd)theEObject;
        T result = caseDeclarationEnd(declarationEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.REQUIREMENT_OR_QUALITY:
      {
        RequirementOrQuality requirementOrQuality = (RequirementOrQuality)theEObject;
        T result = caseRequirementOrQuality(requirementOrQuality);
        if (result == null) result = caseDeclaration(requirementOrQuality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = caseRequirementOrQuality(requirement);
        if (result == null) result = caseDeclaration(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.QATTRIBUTE:
      {
        Qattribute qattribute = (Qattribute)theEObject;
        T result = caseQattribute(qattribute);
        if (result == null) result = caseRequirementOrQuality(qattribute);
        if (result == null) result = caseDeclaration(qattribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.RATIONALE:
      {
        Rationale rationale = (Rationale)theEObject;
        T result = caseRationale(rationale);
        if (result == null) result = caseDeclaration(rationale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.REASON:
      {
        Reason reason = (Reason)theEObject;
        T result = caseReason(reason);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = caseDeclaration(template);
        if (result == null) result = caseTemplateConstituent(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.TEMPLATE_CONSTITUENT:
      {
        TemplateConstituent templateConstituent = (TemplateConstituent)theEObject;
        T result = caseTemplateConstituent(templateConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.PROVIDES:
      {
        Provides provides = (Provides)theEObject;
        T result = caseProvides(provides);
        if (result == null) result = caseTemplateConstituent(provides);
        if (result == null) result = caseLinkProviderPart(provides);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.PROVIDES_CONSTITUENT:
      {
        ProvidesConstituent providesConstituent = (ProvidesConstituent)theEObject;
        T result = caseProvidesConstituent(providesConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.REQUIRES:
      {
        Requires requires = (Requires)theEObject;
        T result = caseRequires(requires);
        if (result == null) result = caseTemplateConstituent(requires);
        if (result == null) result = caseLinkConsumerPart(requires);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.REQUIRES_CONSTITUENT:
      {
        RequiresConstituent requiresConstituent = (RequiresConstituent)theEObject;
        T result = caseRequiresConstituent(requiresConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseTemplateConstituent(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = caseTemplateConstituent(check);
        if (result == null) result = caseSystemConstituent(check);
        if (result == null) result = caseLayerConstituent(check);
        if (result == null) result = caseInstantiableConstituent(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.SYSTEM:
      {
        uk.ac.standrews.graspide.grasp.graspDSL.System system = (uk.ac.standrews.graspide.grasp.graspDSL.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.SYSTEM_CONSTITUENT:
      {
        SystemConstituent systemConstituent = (SystemConstituent)theEObject;
        T result = caseSystemConstituent(systemConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.COMPOSITIONAL:
      {
        Compositional compositional = (Compositional)theEObject;
        T result = caseCompositional(compositional);
        if (result == null) result = caseSystemConstituent(compositional);
        if (result == null) result = caseLayerConstituent(compositional);
        if (result == null) result = caseInstantiableConstituent(compositional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LAYER:
      {
        Layer layer = (Layer)theEObject;
        T result = caseLayer(layer);
        if (result == null) result = caseCompositional(layer);
        if (result == null) result = caseLinkConsumerPart(layer);
        if (result == null) result = caseLinkProviderPart(layer);
        if (result == null) result = caseSystemConstituent(layer);
        if (result == null) result = caseLayerConstituent(layer);
        if (result == null) result = caseInstantiableConstituent(layer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LAYER_CONSTITUENT:
      {
        LayerConstituent layerConstituent = (LayerConstituent)theEObject;
        T result = caseLayerConstituent(layerConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseCompositional(component);
        if (result == null) result = caseLinkConsumerPart(component);
        if (result == null) result = caseLinkProviderPart(component);
        if (result == null) result = caseSystemConstituent(component);
        if (result == null) result = caseLayerConstituent(component);
        if (result == null) result = caseInstantiableConstituent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.CONNECTOR:
      {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = caseCompositional(connector);
        if (result == null) result = caseLinkConsumerPart(connector);
        if (result == null) result = caseLinkProviderPart(connector);
        if (result == null) result = caseSystemConstituent(connector);
        if (result == null) result = caseLayerConstituent(connector);
        if (result == null) result = caseInstantiableConstituent(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.INSTANTIABLE_CONSTITUENT:
      {
        InstantiableConstituent instantiableConstituent = (InstantiableConstituent)theEObject;
        T result = caseInstantiableConstituent(instantiableConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseCompositional(link);
        if (result == null) result = caseSystemConstituent(link);
        if (result == null) result = caseLayerConstituent(link);
        if (result == null) result = caseInstantiableConstituent(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK_CONSTITUENT:
      {
        LinkConstituent linkConstituent = (LinkConstituent)theEObject;
        T result = caseLinkConstituent(linkConstituent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION:
      {
        LinkConsumerExpression linkConsumerExpression = (LinkConsumerExpression)theEObject;
        T result = caseLinkConsumerExpression(linkConsumerExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK_CONSUMER_PART:
      {
        LinkConsumerPart linkConsumerPart = (LinkConsumerPart)theEObject;
        T result = caseLinkConsumerPart(linkConsumerPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK_PROVIDERS_LIST:
      {
        LinkProvidersList linkProvidersList = (LinkProvidersList)theEObject;
        T result = caseLinkProvidersList(linkProvidersList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK_PROVIDERS:
      {
        LinkProviders linkProviders = (LinkProviders)theEObject;
        T result = caseLinkProviders(linkProviders);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LINK_PROVIDER_PART:
      {
        LinkProviderPart linkProviderPart = (LinkProviderPart)theEObject;
        T result = caseLinkProviderPart(linkProviderPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.NAME_VALUE:
      {
        NameValue nameValue = (NameValue)theEObject;
        T result = caseNameValue(nameValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.NAME_VALUES:
      {
        NameValues nameValues = (NameValues)theEObject;
        T result = caseNameValues(nameValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.SUPPORTS_CLAUSE:
      {
        SupportsClause supportsClause = (SupportsClause)theEObject;
        T result = caseSupportsClause(supportsClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.INHIBITS_CLAUSE:
      {
        InhibitsClause inhibitsClause = (InhibitsClause)theEObject;
        T result = caseInhibitsClause(inhibitsClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.BECAUSE_CLAUSE:
      {
        BecauseClause becauseClause = (BecauseClause)theEObject;
        T result = caseBecauseClause(becauseClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.BECAUSE_CAUSALCONTEXT:
      {
        BecauseCausalcontext becauseCausalcontext = (BecauseCausalcontext)theEObject;
        T result = caseBecauseCausalcontext(becauseCausalcontext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.PARAMETER_LIST:
      {
        ParameterList parameterList = (ParameterList)theEObject;
        T result = caseParameterList(parameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.ARGUMENT_LIST:
      {
        ArgumentList argumentList = (ArgumentList)theEObject;
        T result = caseArgumentList(argumentList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = casePrimaryExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.SUBSETOF_EXPRESSION:
      {
        SubsetofExpression subsetofExpression = (SubsetofExpression)theEObject;
        T result = caseSubsetofExpression(subsetofExpression);
        if (result == null) result = caseExpression(subsetofExpression);
        if (result == null) result = casePrimaryExpression(subsetofExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION:
      {
        LogicalOrExpression logicalOrExpression = (LogicalOrExpression)theEObject;
        T result = caseLogicalOrExpression(logicalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION:
      {
        LogicalAndExpression logicalAndExpression = (LogicalAndExpression)theEObject;
        T result = caseLogicalAndExpression(logicalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.BITWISE_OR_EXPRESSION:
      {
        BitwiseOrExpression bitwiseOrExpression = (BitwiseOrExpression)theEObject;
        T result = caseBitwiseOrExpression(bitwiseOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION:
      {
        BitwiseXorExpression bitwiseXorExpression = (BitwiseXorExpression)theEObject;
        T result = caseBitwiseXorExpression(bitwiseXorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.BITWISE_AND_EXPRESSION:
      {
        BitwiseAndExpression bitwiseAndExpression = (BitwiseAndExpression)theEObject;
        T result = caseBitwiseAndExpression(bitwiseAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.EQUALITY_EXPRESSION:
      {
        EqualityExpression equalityExpression = (EqualityExpression)theEObject;
        T result = caseEqualityExpression(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.RELATIONAL_EXPRESSION:
      {
        RelationalExpression relationalExpression = (RelationalExpression)theEObject;
        T result = caseRelationalExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.ADDITIVE_EXPRESSION:
      {
        AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
        T result = caseAdditiveExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION:
      {
        MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
        T result = caseMultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.PRIMARY_EXPRESSION:
      {
        PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
        T result = casePrimaryExpression(primaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.MEMBER_EXPRESSION:
      {
        MemberExpression memberExpression = (MemberExpression)theEObject;
        T result = caseMemberExpression(memberExpression);
        if (result == null) result = casePrimaryExpression(memberExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.MEMBER_PART:
      {
        MemberPart memberPart = (MemberPart)theEObject;
        T result = caseMemberPart(memberPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.MEMBER_ARGUMENTS:
      {
        MemberArguments memberArguments = (MemberArguments)theEObject;
        T result = caseMemberArguments(memberArguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = casePrimaryExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.SET_LITERAL:
      {
        SetLiteral setLiteral = (SetLiteral)theEObject;
        T result = caseSetLiteral(setLiteral);
        if (result == null) result = caseLiteral(setLiteral);
        if (result == null) result = casePrimaryExpression(setLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraspDSLPackage.BOOLEAN_LITERAL:
      {
        BOOLEAN_LITERAL booleaN_LITERAL = (BOOLEAN_LITERAL)theEObject;
        T result = caseBOOLEAN_LITERAL(booleaN_LITERAL);
        if (result == null) result = caseLiteral(booleaN_LITERAL);
        if (result == null) result = casePrimaryExpression(booleaN_LITERAL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grasp Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grasp Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraspSpecification(GraspSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchitecture(Architecture object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Architecture Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Architecture Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArchitectureBody(ArchitectureBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarationStart(DeclarationStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarationEnd(DeclarationEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Or Quality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Or Quality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementOrQuality(RequirementOrQuality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qattribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qattribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQattribute(Qattribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRationale(Rationale object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reason</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reason</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReason(Reason object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplate(Template object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateConstituent(TemplateConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provides</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provides</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvides(Provides object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provides Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provides Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidesConstituent(ProvidesConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequires(Requires object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiresConstituent(RequiresConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(uk.ac.standrews.graspide.grasp.graspDSL.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemConstituent(SystemConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compositional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compositional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositional(Compositional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayer(Layer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layer Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layer Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayerConstituent(LayerConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instantiable Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instantiable Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstantiableConstituent(InstantiableConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Constituent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Constituent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkConstituent(LinkConstituent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Consumer Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Consumer Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkConsumerExpression(LinkConsumerExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Consumer Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Consumer Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkConsumerPart(LinkConsumerPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Providers List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Providers List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkProvidersList(LinkProvidersList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Providers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Providers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkProviders(LinkProviders object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Provider Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Provider Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkProviderPart(LinkProviderPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameValue(NameValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameValues(NameValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supports Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supports Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportsClause(SupportsClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inhibits Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inhibits Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInhibitsClause(InhibitsClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Because Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Because Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBecauseClause(BecauseClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Because Causalcontext</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Because Causalcontext</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBecauseCausalcontext(BecauseCausalcontext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterList(ParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentList(ArgumentList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsetof Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsetof Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsetofExpression(SubsetofExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalOrExpression(LogicalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalAndExpression(LogicalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseOrExpression(BitwiseOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise Xor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseXorExpression(BitwiseXorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseAndExpression(BitwiseAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualityExpression(EqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalExpression(RelationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpression(AdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpression(MultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpression(PrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberExpression(MemberExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberPart(MemberPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberArguments(MemberArguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetLiteral(SetLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOLEAN LITERAL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOLEAN LITERAL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOLEAN_LITERAL(BOOLEAN_LITERAL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GraspDSLSwitch
