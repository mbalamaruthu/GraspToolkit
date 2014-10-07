/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
 * @generated
 */
public class GraspDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GraspDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraspDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GraspDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraspDSLSwitch<Adapter> modelSwitch =
    new GraspDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseGraspSpecification(GraspSpecification object)
      {
        return createGraspSpecificationAdapter();
      }
      @Override
      public Adapter caseArchitecture(Architecture object)
      {
        return createArchitectureAdapter();
      }
      @Override
      public Adapter caseArchitectureBody(ArchitectureBody object)
      {
        return createArchitectureBodyAdapter();
      }
      @Override
      public Adapter caseDeclarationStart(DeclarationStart object)
      {
        return createDeclarationStartAdapter();
      }
      @Override
      public Adapter caseDeclarationEnd(DeclarationEnd object)
      {
        return createDeclarationEndAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseRequirementOrQuality(RequirementOrQuality object)
      {
        return createRequirementOrQualityAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseQattribute(Qattribute object)
      {
        return createQattributeAdapter();
      }
      @Override
      public Adapter caseRationale(Rationale object)
      {
        return createRationaleAdapter();
      }
      @Override
      public Adapter caseReason(Reason object)
      {
        return createReasonAdapter();
      }
      @Override
      public Adapter caseTemplate(Template object)
      {
        return createTemplateAdapter();
      }
      @Override
      public Adapter caseTemplateConstituent(TemplateConstituent object)
      {
        return createTemplateConstituentAdapter();
      }
      @Override
      public Adapter caseProvides(Provides object)
      {
        return createProvidesAdapter();
      }
      @Override
      public Adapter caseProvidesConstituent(ProvidesConstituent object)
      {
        return createProvidesConstituentAdapter();
      }
      @Override
      public Adapter caseRequires(Requires object)
      {
        return createRequiresAdapter();
      }
      @Override
      public Adapter caseRequiresConstituent(RequiresConstituent object)
      {
        return createRequiresConstituentAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseCheck(Check object)
      {
        return createCheckAdapter();
      }
      @Override
      public Adapter caseSystem(uk.ac.standrews.graspide.grasp.graspDSL.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseSystemConstituent(SystemConstituent object)
      {
        return createSystemConstituentAdapter();
      }
      @Override
      public Adapter caseCompositional(Compositional object)
      {
        return createCompositionalAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseLayerConstituent(LayerConstituent object)
      {
        return createLayerConstituentAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseInstantiableConstituent(InstantiableConstituent object)
      {
        return createInstantiableConstituentAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseLinkConstituent(LinkConstituent object)
      {
        return createLinkConstituentAdapter();
      }
      @Override
      public Adapter caseLinkConsumerExpression(LinkConsumerExpression object)
      {
        return createLinkConsumerExpressionAdapter();
      }
      @Override
      public Adapter caseLinkConsumerPart(LinkConsumerPart object)
      {
        return createLinkConsumerPartAdapter();
      }
      @Override
      public Adapter caseLinkProvidersList(LinkProvidersList object)
      {
        return createLinkProvidersListAdapter();
      }
      @Override
      public Adapter caseLinkProviders(LinkProviders object)
      {
        return createLinkProvidersAdapter();
      }
      @Override
      public Adapter caseLinkProviderPart(LinkProviderPart object)
      {
        return createLinkProviderPartAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseNameValue(NameValue object)
      {
        return createNameValueAdapter();
      }
      @Override
      public Adapter caseNameValues(NameValues object)
      {
        return createNameValuesAdapter();
      }
      @Override
      public Adapter caseSupportsClause(SupportsClause object)
      {
        return createSupportsClauseAdapter();
      }
      @Override
      public Adapter caseInhibitsClause(InhibitsClause object)
      {
        return createInhibitsClauseAdapter();
      }
      @Override
      public Adapter caseBecauseClause(BecauseClause object)
      {
        return createBecauseClauseAdapter();
      }
      @Override
      public Adapter caseBecauseCausalcontext(BecauseCausalcontext object)
      {
        return createBecauseCausalcontextAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseArgumentList(ArgumentList object)
      {
        return createArgumentListAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSubsetofExpression(SubsetofExpression object)
      {
        return createSubsetofExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalOrExpression(LogicalOrExpression object)
      {
        return createLogicalOrExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalAndExpression(LogicalAndExpression object)
      {
        return createLogicalAndExpressionAdapter();
      }
      @Override
      public Adapter caseBitwiseOrExpression(BitwiseOrExpression object)
      {
        return createBitwiseOrExpressionAdapter();
      }
      @Override
      public Adapter caseBitwiseXorExpression(BitwiseXorExpression object)
      {
        return createBitwiseXorExpressionAdapter();
      }
      @Override
      public Adapter caseBitwiseAndExpression(BitwiseAndExpression object)
      {
        return createBitwiseAndExpressionAdapter();
      }
      @Override
      public Adapter caseEqualityExpression(EqualityExpression object)
      {
        return createEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseMemberExpression(MemberExpression object)
      {
        return createMemberExpressionAdapter();
      }
      @Override
      public Adapter caseMemberPart(MemberPart object)
      {
        return createMemberPartAdapter();
      }
      @Override
      public Adapter caseMemberArguments(MemberArguments object)
      {
        return createMemberArgumentsAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseSetLiteral(SetLiteral object)
      {
        return createSetLiteralAdapter();
      }
      @Override
      public Adapter caseBOOLEAN_LITERAL(BOOLEAN_LITERAL object)
      {
        return createBOOLEAN_LITERALAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification <em>Grasp Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification
   * @generated
   */
  public Adapter createGraspSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture <em>Architecture</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Architecture
   * @generated
   */
  public Adapter createArchitectureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody <em>Architecture Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody
   * @generated
   */
  public Adapter createArchitectureBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart <em>Declaration Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart
   * @generated
   */
  public Adapter createDeclarationStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd <em>Declaration End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd
   * @generated
   */
  public Adapter createDeclarationEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality <em>Requirement Or Quality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality
   * @generated
   */
  public Adapter createRequirementOrQualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute <em>Qattribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Qattribute
   * @generated
   */
  public Adapter createQattributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Rationale
   * @generated
   */
  public Adapter createRationaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Reason <em>Reason</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Reason
   * @generated
   */
  public Adapter createReasonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Template
   * @generated
   */
  public Adapter createTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent <em>Template Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent
   * @generated
   */
  public Adapter createTemplateConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides <em>Provides</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Provides
   * @generated
   */
  public Adapter createProvidesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent <em>Provides Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent
   * @generated
   */
  public Adapter createProvidesConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Requires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Requires
   * @generated
   */
  public Adapter createRequiresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent <em>Requires Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent
   * @generated
   */
  public Adapter createRequiresConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Check
   * @generated
   */
  public Adapter createCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent <em>System Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent
   * @generated
   */
  public Adapter createSystemConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Compositional <em>Compositional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Compositional
   * @generated
   */
  public Adapter createCompositionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent <em>Layer Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent
   * @generated
   */
  public Adapter createLayerConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent <em>Instantiable Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent
   * @generated
   */
  public Adapter createInstantiableConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent <em>Link Constituent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent
   * @generated
   */
  public Adapter createLinkConstituentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression <em>Link Consumer Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression
   * @generated
   */
  public Adapter createLinkConsumerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart <em>Link Consumer Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart
   * @generated
   */
  public Adapter createLinkConsumerPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList <em>Link Providers List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList
   * @generated
   */
  public Adapter createLinkProvidersListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders <em>Link Providers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders
   * @generated
   */
  public Adapter createLinkProvidersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart <em>Link Provider Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart
   * @generated
   */
  public Adapter createLinkProviderPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue <em>Name Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValue
   * @generated
   */
  public Adapter createNameValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValues <em>Name Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.NameValues
   * @generated
   */
  public Adapter createNameValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause <em>Supports Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause
   * @generated
   */
  public Adapter createSupportsClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause <em>Inhibits Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause
   * @generated
   */
  public Adapter createInhibitsClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause <em>Because Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause
   * @generated
   */
  public Adapter createBecauseClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext <em>Because Causalcontext</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext
   * @generated
   */
  public Adapter createBecauseCausalcontextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList
   * @generated
   */
  public Adapter createArgumentListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression <em>Subsetof Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression
   * @generated
   */
  public Adapter createSubsetofExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression <em>Logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression
   * @generated
   */
  public Adapter createLogicalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression <em>Logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression
   * @generated
   */
  public Adapter createLogicalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression <em>Bitwise Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression
   * @generated
   */
  public Adapter createBitwiseOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression <em>Bitwise Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression
   * @generated
   */
  public Adapter createBitwiseXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression <em>Bitwise And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression
   * @generated
   */
  public Adapter createBitwiseAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression
   * @generated
   */
  public Adapter createEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression <em>Member Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression
   * @generated
   */
  public Adapter createMemberExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart <em>Member Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberPart
   * @generated
   */
  public Adapter createMemberPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments <em>Member Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments
   * @generated
   */
  public Adapter createMemberArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral <em>Set Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral
   * @generated
   */
  public Adapter createSetLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL
   * @generated
   */
  public Adapter createBOOLEAN_LITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GraspDSLAdapterFactory
