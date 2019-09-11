/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

import com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionIncorrectResultpins;
import com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionInvalidTrigger;
import com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionNotTwoResultpins;
import com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionOneTrigger;
import com.incquerylabs.magicdraw.benchmark.queries.ActivityEdgeDiscreteAndContinuous;
import com.incquerylabs.magicdraw.benchmark.queries.ActivityStreamingNoNStreaming;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyCallActionInconsistent;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyConnectorNotAssociationBlock;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyConnectorPropertyInconsistent;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyIncompatibleType;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyIncorrectMultiplicity;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyInvalidPrincipalKind;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyMultiplicityRestrictive;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyNotComposite;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertySubmachineOrInteraction;
import com.incquerylabs.magicdraw.benchmark.queries.AdjunctPropertyWrongName;
import com.incquerylabs.magicdraw.benchmark.queries.AllocateActivityPartitionActionsOnClientEnds;
import com.incquerylabs.magicdraw.benchmark.queries.AllocateNotSingleClient;
import com.incquerylabs.magicdraw.benchmark.queries.AllocateNotSingleSupplier;
import com.incquerylabs.magicdraw.benchmark.queries.BlockAssociationNotBinary;
import com.incquerylabs.magicdraw.benchmark.queries.BlockSpecializationNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.BlockValuePropertyNotComposite;
import com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotConnectorEnd;
import com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotOrdered;
import com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotReferenceOrValueProperty;
import com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceOpposite;
import com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceRedefined;
import com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceUnique;
import com.incquerylabs.magicdraw.benchmark.queries.ChangeStructuralFeatureEventFeatureMultiplicity;
import com.incquerylabs.magicdraw.benchmark.queries.ChangeStructuralFeatureEventStatic;
import com.incquerylabs.magicdraw.benchmark.queries.ClassifierBehaviorPropertyInvalidOwner;
import com.incquerylabs.magicdraw.benchmark.queries.ClassifierBehaviorPropertyInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.ClassifierBehaviorPropertyNotComposite;
import com.incquerylabs.magicdraw.benchmark.queries.ConformGeneralNotViewpoint;
import com.incquerylabs.magicdraw.benchmark.queries.ConformSpecificNotView;
import com.incquerylabs.magicdraw.benchmark.queries.ConnectionPropertyDifferentName;
import com.incquerylabs.magicdraw.benchmark.queries.ConnectionPropertyNotTypedByAssociationBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ConnectorPropertyNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ConnectorPropertyNotComposite;
import com.incquerylabs.magicdraw.benchmark.queries.ConnectorPropertyNotOwnedOrInherited;
import com.incquerylabs.magicdraw.benchmark.queries.ConstraintBlockPropertyNotComposite;
import com.incquerylabs.magicdraw.benchmark.queries.ConstraintBlockSpecializationNotConstraintBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ControlOperatorOperationMethod;
import com.incquerylabs.magicdraw.benchmark.queries.CopyClientNotRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.CopyCycle;
import com.incquerylabs.magicdraw.benchmark.queries.CopyMultipleCopies;
import com.incquerylabs.magicdraw.benchmark.queries.CopySupplierNotRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.DeriveReqtClientNotReqt;
import com.incquerylabs.magicdraw.benchmark.queries.DeriveReqtSupplierNotReqt;
import com.incquerylabs.magicdraw.benchmark.queries.DirecredFeatureInvalidStereotype;
import com.incquerylabs.magicdraw.benchmark.queries.DistributedPropertyNotBlockOrValueType;
import com.incquerylabs.magicdraw.benchmark.queries.EndPathMiultiplicityNegative;
import com.incquerylabs.magicdraw.benchmark.queries.EndPathMiultiplicityNotRedefiniton;
import com.incquerylabs.magicdraw.benchmark.queries.ExposeClientNotView;
import com.incquerylabs.magicdraw.benchmark.queries.FlowPortDeprecated;
import com.incquerylabs.magicdraw.benchmark.queries.FlowPortOwnerNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.FlowPropertyInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.FlowSpecificationDeprecated;
import com.incquerylabs.magicdraw.benchmark.queries.FlowSpecificationInvalidApplication;
import com.incquerylabs.magicdraw.benchmark.queries.FullPortBoundToFullPort;
import com.incquerylabs.magicdraw.benchmark.queries.FullPortIsBehavioral;
import com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockInvalidInheritance;
import com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockIsConjugated;
import com.incquerylabs.magicdraw.benchmark.queries.InterfaceBlockPortInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.InvocationOnNestedPortActionOnPortUndefined;
import com.incquerylabs.magicdraw.benchmark.queries.ItemFlowAssociationHasItemProperty;
import com.incquerylabs.magicdraw.benchmark.queries.ItemFlowDifferentType;
import com.incquerylabs.magicdraw.benchmark.queries.ItemFlowInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.ItemFlowItemPropertyDifferentName;
import com.incquerylabs.magicdraw.benchmark.queries.NoBufferAndOverwrite;
import com.incquerylabs.magicdraw.benchmark.queries.NotBinaryConnector;
import com.incquerylabs.magicdraw.benchmark.queries.OptionalLowerNotZero;
import com.incquerylabs.magicdraw.benchmark.queries.OptionalLowerZero;
import com.incquerylabs.magicdraw.benchmark.queries.ParameterDiscreteAndContinuous;
import com.incquerylabs.magicdraw.benchmark.queries.PartPropertyInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipantPropertyAggregationKindNotNone;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipantPropertyDifferentType;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipantPropertyEndOwner;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipantPropertyIsMemberEndOfAssociation;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipantPropertyMultiplicity;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipantPropertyNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ParticipationPropertyNotAssociation;
import com.incquerylabs.magicdraw.benchmark.queries.ProbabilityAllOutgoingEdges;
import com.incquerylabs.magicdraw.benchmark.queries.ProbabilityInvalidStereotype;
import com.incquerylabs.magicdraw.benchmark.queries.PropertySpecificTypeNotOneProperty;
import com.incquerylabs.magicdraw.benchmark.queries.PropertySpecificTypeNotOwnedByBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ProxyPortFullPort;
import com.incquerylabs.magicdraw.benchmark.queries.ProxyPortSubportNotProxyPort;
import com.incquerylabs.magicdraw.benchmark.queries.ProxyPortTypeNotInterfaceBlock;
import com.incquerylabs.magicdraw.benchmark.queries.RateNotStreaming;
import com.incquerylabs.magicdraw.benchmark.queries.ReferencePropertyInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.RefineNotSingleClient;
import com.incquerylabs.magicdraw.benchmark.queries.RefineNotSingleSupplier;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementAsType;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementHasAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementHasOperation;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementIdNotUnique;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementInAssociation;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementInGeneralization;
import com.incquerylabs.magicdraw.benchmark.queries.RequirementNestedClassifierNotRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.SatisfySupplierNotRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.SharedPropertyInvalidType;
import com.incquerylabs.magicdraw.benchmark.queries.StakeHolderInvalidStereotype;
import com.incquerylabs.magicdraw.benchmark.queries.TraceNotSingleClient;
import com.incquerylabs.magicdraw.benchmark.queries.TraceNotSingleSupplier;
import com.incquerylabs.magicdraw.benchmark.queries.TriggerOnNestedPortBaseFullPort;
import com.incquerylabs.magicdraw.benchmark.queries.TriggerOnNestedPortFullPort;
import com.incquerylabs.magicdraw.benchmark.queries.TriggerOnNestedPortNotSinglePort;
import com.incquerylabs.magicdraw.benchmark.queries.ValuePropertyNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.ValueTypeSpecializatonNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.ValueTypeValuePropertyNotComposite;
import com.incquerylabs.magicdraw.benchmark.queries.VerifySupplierNotRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.ViewNotSingleViewpoint;
import com.incquerylabs.magicdraw.benchmark.queries.ViewStakeholderNotDerivedFromConform;
import com.incquerylabs.magicdraw.benchmark.queries.ViewViewpointNotDerivedFromConform;
import com.incquerylabs.magicdraw.benchmark.queries.ViewpointNoCreate;
import com.incquerylabs.magicdraw.benchmark.queries.internal.AssociationBlock;
import com.incquerylabs.magicdraw.benchmark.queries.internal.AssociationBlockOfConnector;
import com.incquerylabs.magicdraw.benchmark.queries.internal.AssociationEnd;
import com.incquerylabs.magicdraw.benchmark.queries.internal.BoundReference_1_bindingconnector_end;
import com.incquerylabs.magicdraw.benchmark.queries.internal.BoundReference_2_opposite_bindingconnector_end;
import com.incquerylabs.magicdraw.benchmark.queries.internal.CalledBehavior;
import com.incquerylabs.magicdraw.benchmark.queries.internal.CheckEmptiness;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ClassNotAssociation;
import com.incquerylabs.magicdraw.benchmark.queries.internal.CompositeAndConsistent;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ConnOrVarOrParam;
import com.incquerylabs.magicdraw.benchmark.queries.internal.Correct;
import com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectActPartNode;
import com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectTypeAndOrdering;
import com.incquerylabs.magicdraw.benchmark.queries.internal.General;
import com.incquerylabs.magicdraw.benchmark.queries.internal.GeneralClosure;
import com.incquerylabs.magicdraw.benchmark.queries.internal.GreaterThanOne;
import com.incquerylabs.magicdraw.benchmark.queries.internal.HasCreateOperationamedView;
import com.incquerylabs.magicdraw.benchmark.queries.internal.InteractionUseOrState;
import com.incquerylabs.magicdraw.benchmark.queries.internal.MoreRestrictive;
import com.incquerylabs.magicdraw.benchmark.queries.internal.NotAllEndsAreBlocks;
import com.incquerylabs.magicdraw.benchmark.queries.internal.NotFlowProperty;
import com.incquerylabs.magicdraw.benchmark.queries.internal.OwningBlock;
import com.incquerylabs.magicdraw.benchmark.queries.internal.OwningBlockTransitive;
import com.incquerylabs.magicdraw.benchmark.queries.internal.PrincipalBehavior;
import com.incquerylabs.magicdraw.benchmark.queries.internal.PrincipalType;
import com.incquerylabs.magicdraw.benchmark.queries.internal.PropertyOwnedByBlock;
import com.incquerylabs.magicdraw.benchmark.queries.internal.PropertyOwnedByValueType;
import com.incquerylabs.magicdraw.benchmark.queries.internal.RedefinedBoundReferenceProperty;
import com.incquerylabs.magicdraw.benchmark.queries.internal.RepresentsSupplier;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ResultToCheck;
import com.incquerylabs.magicdraw.benchmark.queries.internal.StakeholderDerivedFromConform;
import com.incquerylabs.magicdraw.benchmark.queries.internal.StartObjectBehaviorActionBehavior;
import com.incquerylabs.magicdraw.benchmark.queries.internal.SubmachineState;
import com.incquerylabs.magicdraw.benchmark.queries.internal.SupplierCopy;
import com.incquerylabs.magicdraw.benchmark.queries.internal.TriggerEventIsChangeStructuralFeatureEvent;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ValidOwner;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ValidType;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ViewConforms;
import com.incquerylabs.magicdraw.benchmark.queries.internal.ViewpointDerivedFromConform;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in sysml_validation_queries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.queries, the group contains the definition of the following patterns: <ul>
 * <li>participantPropertyDifferentType</li>
 * <li>refineNotSingleClient</li>
 * <li>requirementHasOperation</li>
 * <li>requirementHasAttribute</li>
 * <li>requirementInAssociation</li>
 * <li>requirementInGeneralization</li>
 * <li>activityEdgeDiscreteAndContinuous</li>
 * <li>requirementAsType</li>
 * <li>flowPropertyInvalidType</li>
 * <li>interfaceBlockIsConjugated</li>
 * <li>noBufferAndOverwrite</li>
 * <li>notBinaryConnector</li>
 * <li>allocateNotSingleClient</li>
 * <li>allocateNotSingleSupplier</li>
 * <li>participantPropertyNotBlock</li>
 * <li>participationPropertyNotAssociation</li>
 * <li>participantPropertyIsMemberEndOfAssociation</li>
 * <li>refineNotSingleSupplier</li>
 * <li>participantPropertyAggregationKindNotNone</li>
 * <li>fullPortIsBehavioral</li>
 * <li>interfaceBlockPortInvalidType</li>
 * <li>conformGeneralNotViewpoint</li>
 * <li>conformSpecificNotView</li>
 * <li>boundReferenceNotConnectorEnd</li>
 * <li>BoundReference_1_bindingconnector_end</li>
 * <li>connectionPropertyDifferentName</li>
 * <li>connectionPropertyNotTypedByAssociationBlock</li>
 * <li>associationBlock</li>
 * <li>connectorPropertyNotBlock</li>
 * <li>owningBlock</li>
 * <li>connectorPropertyNotComposite</li>
 * <li>connectorPropertyNotOwnedOrInherited</li>
 * <li>general</li>
 * <li>owningBlockTransitive</li>
 * <li>valueTypeSpecializatonNotValueType</li>
 * <li>blockValuePropertyNotComposite</li>
 * <li>valueTypeValuePropertyNotComposite</li>
 * <li>parameterDiscreteAndContinuous</li>
 * <li>probabilityInvalidStereotype</li>
 * <li>probabilityAllOutgoingEdges</li>
 * <li>rateNotStreaming</li>
 * <li>copyClientNotRequirement</li>
 * <li>copySupplierNotRequirement</li>
 * <li>satisfySupplierNotRequirement</li>
 * <li>stakeHolderInvalidStereotype</li>
 * <li>classNotAssociation</li>
 * <li>endPathMiultiplicityNotRedefiniton</li>
 * <li>redefinedBoundReferenceProperty</li>
 * <li>endPathMiultiplicityNegative</li>
 * <li>participantPropertyEndOwner</li>
 * <li>associationEnd</li>
 * <li>participantPropertyMultiplicity</li>
 * <li>propertySpecificTypeNotOneProperty</li>
 * <li>adjunctPropertyCallActionInconsistent</li>
 * <li>compositeAndConsistent</li>
 * <li>checkEmptiness</li>
 * <li>calledBehavior</li>
 * <li>StartObjectBehaviorActionBehavior</li>
 * <li>adjunctPropertyConnectorNotAssociationBlock</li>
 * <li>associationBlockOfConnector</li>
 * <li>adjunctPropertyConnectorPropertyInconsistent</li>
 * <li>adjunctPropertyIncompatibleType</li>
 * <li>connOrVarOrParam</li>
 * <li>principalType</li>
 * <li>generalClosure</li>
 * <li>adjunctPropertyInvalidPrincipalKind</li>
 * <li>submachineState</li>
 * <li>adjunctPropertyNotComposite</li>
 * <li>adjunctPropertyWrongName</li>
 * <li>blockAssociationNotBinary</li>
 * <li>notAllEndsAreBlocks</li>
 * <li>blockSpecializationNotBlock</li>
 * <li>classifierBehaviorPropertyInvalidOwner</li>
 * <li>validOwner</li>
 * <li>classifierBehaviorPropertyInvalidType</li>
 * <li>validType</li>
 * <li>viewNotSingleViewpoint</li>
 * <li>viewConforms</li>
 * <li>viewStakeholderNotDerivedFromConform</li>
 * <li>stakeholderDerivedFromConform</li>
 * <li>viewViewpointNotDerivedFromConform</li>
 * <li>viewpointDerivedFromConform</li>
 * <li>classifierBehaviorPropertyNotComposite</li>
 * <li>requirementNestedClassifierNotRequirement</li>
 * <li>constraintBlockSpecializationNotConstraintBlock</li>
 * <li>distributedPropertyNotBlockOrValueType</li>
 * <li>propertyOwnedByBlock</li>
 * <li>propertyOwnedByValueType</li>
 * <li>exposeClientNotView</li>
 * <li>fullPortBoundToFullPort</li>
 * <li>invocationOnNestedPortActionOnPortUndefined</li>
 * <li>itemFlowAssociationHasItemProperty</li>
 * <li>itemFlowDifferentType</li>
 * <li>itemFlowInvalidType</li>
 * <li>itemFlowItemPropertyDifferentName</li>
 * <li>proxyPortFullPort</li>
 * <li>proxyPortSubportNotProxyPort</li>
 * <li>proxyPortTypeNotInterfaceBlock</li>
 * <li>traceNotSingleClient</li>
 * <li>triggerOnNestedPortBaseFullPort</li>
 * <li>triggerOnNestedPortFullPort</li>
 * <li>triggerOnNestedPortNotSinglePort</li>
 * <li>verifySupplierNotRequirement</li>
 * <li>acsfeActionOneTrigger</li>
 * <li>acsfeActionInvalidTrigger</li>
 * <li>triggerEventIsChangeStructuralFeatureEvent</li>
 * <li>acsfeActionNotTwoResultpins</li>
 * <li>adjunctPropertyMultiplicityRestrictive</li>
 * <li>moreRestrictive</li>
 * <li>adjunctPropertySubmachineOrInteraction</li>
 * <li>interactionUseOrState</li>
 * <li>correct</li>
 * <li>principalBehavior</li>
 * <li>allocateActivityPartitionActionsOnClientEnds</li>
 * <li>correctActPartNode</li>
 * <li>representsSupplier</li>
 * <li>boundReferenceOpposite</li>
 * <li>BoundReference_2_opposite_bindingconnector_end</li>
 * <li>boundReferenceNotReferenceOrValueProperty</li>
 * <li>boundReferenceNotOrdered</li>
 * <li>greaterThanOne</li>
 * <li>boundReferenceUnique</li>
 * <li>boundReferenceRedefined</li>
 * <li>constraintBlockPropertyNotComposite</li>
 * <li>controlOperatorOperationMethod</li>
 * <li>deriveReqtSupplierNotReqt</li>
 * <li>deriveReqtClientNotReqt</li>
 * <li>direcredFeatureInvalidStereotype</li>
 * <li>notFlowProperty</li>
 * <li>optionalLowerNotZero</li>
 * <li>optionalLowerZero</li>
 * <li>adjunctPropertyIncorrectMultiplicity</li>
 * <li>traceNotSingleSupplier</li>
 * <li>acsfeActionIncorrectResultpins</li>
 * <li>resultToCheck</li>
 * <li>correctTypeAndOrdering</li>
 * <li>viewpointNoCreate</li>
 * <li>hasCreateOperationamedView</li>
 * <li>changeStructuralFeatureEventStatic</li>
 * <li>changeStructuralFeatureEventFeatureMultiplicity</li>
 * <li>copyMultipleCopies</li>
 * <li>copyCycle</li>
 * <li>supplierCopy</li>
 * <li>requirementIdNotUnique</li>
 * <li>propertySpecificTypeNotOwnedByBlock</li>
 * <li>valuePropertyNotValueType</li>
 * <li>flowPortOwnerNotBlock</li>
 * <li>flowSpecificationInvalidApplication</li>
 * <li>flowPortDeprecated</li>
 * <li>flowSpecificationDeprecated</li>
 * <li>interfaceBlockInvalidInheritance</li>
 * <li>partPropertyInvalidType</li>
 * <li>referencePropertyInvalidType</li>
 * <li>sharedPropertyInvalidType</li>
 * <li>activityStreamingNoNStreaming</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Sysml_validation_queriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Sysml_validation_queriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new Sysml_validation_queriesAll();
    }
    return INSTANCE;
  }
  
  private static Sysml_validation_queriesAll INSTANCE;
  
  private Sysml_validation_queriesAll() {
    querySpecifications.add(ParticipantPropertyDifferentType.instance());
    querySpecifications.add(RefineNotSingleClient.instance());
    querySpecifications.add(RequirementHasOperation.instance());
    querySpecifications.add(RequirementHasAttribute.instance());
    querySpecifications.add(RequirementInAssociation.instance());
    querySpecifications.add(RequirementInGeneralization.instance());
    querySpecifications.add(ActivityEdgeDiscreteAndContinuous.instance());
    querySpecifications.add(RequirementAsType.instance());
    querySpecifications.add(FlowPropertyInvalidType.instance());
    querySpecifications.add(InterfaceBlockIsConjugated.instance());
    querySpecifications.add(NoBufferAndOverwrite.instance());
    querySpecifications.add(NotBinaryConnector.instance());
    querySpecifications.add(AllocateNotSingleClient.instance());
    querySpecifications.add(AllocateNotSingleSupplier.instance());
    querySpecifications.add(ParticipantPropertyNotBlock.instance());
    querySpecifications.add(ParticipationPropertyNotAssociation.instance());
    querySpecifications.add(ParticipantPropertyIsMemberEndOfAssociation.instance());
    querySpecifications.add(RefineNotSingleSupplier.instance());
    querySpecifications.add(ParticipantPropertyAggregationKindNotNone.instance());
    querySpecifications.add(FullPortIsBehavioral.instance());
    querySpecifications.add(InterfaceBlockPortInvalidType.instance());
    querySpecifications.add(ConformGeneralNotViewpoint.instance());
    querySpecifications.add(ConformSpecificNotView.instance());
    querySpecifications.add(BoundReferenceNotConnectorEnd.instance());
    querySpecifications.add(BoundReference_1_bindingconnector_end.instance());
    querySpecifications.add(ConnectionPropertyDifferentName.instance());
    querySpecifications.add(ConnectionPropertyNotTypedByAssociationBlock.instance());
    querySpecifications.add(AssociationBlock.instance());
    querySpecifications.add(ConnectorPropertyNotBlock.instance());
    querySpecifications.add(OwningBlock.instance());
    querySpecifications.add(ConnectorPropertyNotComposite.instance());
    querySpecifications.add(ConnectorPropertyNotOwnedOrInherited.instance());
    querySpecifications.add(General.instance());
    querySpecifications.add(OwningBlockTransitive.instance());
    querySpecifications.add(ValueTypeSpecializatonNotValueType.instance());
    querySpecifications.add(BlockValuePropertyNotComposite.instance());
    querySpecifications.add(ValueTypeValuePropertyNotComposite.instance());
    querySpecifications.add(ParameterDiscreteAndContinuous.instance());
    querySpecifications.add(ProbabilityInvalidStereotype.instance());
    querySpecifications.add(ProbabilityAllOutgoingEdges.instance());
    querySpecifications.add(RateNotStreaming.instance());
    querySpecifications.add(CopyClientNotRequirement.instance());
    querySpecifications.add(CopySupplierNotRequirement.instance());
    querySpecifications.add(SatisfySupplierNotRequirement.instance());
    querySpecifications.add(StakeHolderInvalidStereotype.instance());
    querySpecifications.add(ClassNotAssociation.instance());
    querySpecifications.add(EndPathMiultiplicityNotRedefiniton.instance());
    querySpecifications.add(RedefinedBoundReferenceProperty.instance());
    querySpecifications.add(EndPathMiultiplicityNegative.instance());
    querySpecifications.add(ParticipantPropertyEndOwner.instance());
    querySpecifications.add(AssociationEnd.instance());
    querySpecifications.add(ParticipantPropertyMultiplicity.instance());
    querySpecifications.add(PropertySpecificTypeNotOneProperty.instance());
    querySpecifications.add(AdjunctPropertyCallActionInconsistent.instance());
    querySpecifications.add(CompositeAndConsistent.instance());
    querySpecifications.add(CheckEmptiness.instance());
    querySpecifications.add(CalledBehavior.instance());
    querySpecifications.add(StartObjectBehaviorActionBehavior.instance());
    querySpecifications.add(AdjunctPropertyConnectorNotAssociationBlock.instance());
    querySpecifications.add(AssociationBlockOfConnector.instance());
    querySpecifications.add(AdjunctPropertyConnectorPropertyInconsistent.instance());
    querySpecifications.add(AdjunctPropertyIncompatibleType.instance());
    querySpecifications.add(ConnOrVarOrParam.instance());
    querySpecifications.add(PrincipalType.instance());
    querySpecifications.add(GeneralClosure.instance());
    querySpecifications.add(AdjunctPropertyInvalidPrincipalKind.instance());
    querySpecifications.add(SubmachineState.instance());
    querySpecifications.add(AdjunctPropertyNotComposite.instance());
    querySpecifications.add(AdjunctPropertyWrongName.instance());
    querySpecifications.add(BlockAssociationNotBinary.instance());
    querySpecifications.add(NotAllEndsAreBlocks.instance());
    querySpecifications.add(BlockSpecializationNotBlock.instance());
    querySpecifications.add(ClassifierBehaviorPropertyInvalidOwner.instance());
    querySpecifications.add(ValidOwner.instance());
    querySpecifications.add(ClassifierBehaviorPropertyInvalidType.instance());
    querySpecifications.add(ValidType.instance());
    querySpecifications.add(ViewNotSingleViewpoint.instance());
    querySpecifications.add(ViewConforms.instance());
    querySpecifications.add(ViewStakeholderNotDerivedFromConform.instance());
    querySpecifications.add(StakeholderDerivedFromConform.instance());
    querySpecifications.add(ViewViewpointNotDerivedFromConform.instance());
    querySpecifications.add(ViewpointDerivedFromConform.instance());
    querySpecifications.add(ClassifierBehaviorPropertyNotComposite.instance());
    querySpecifications.add(RequirementNestedClassifierNotRequirement.instance());
    querySpecifications.add(ConstraintBlockSpecializationNotConstraintBlock.instance());
    querySpecifications.add(DistributedPropertyNotBlockOrValueType.instance());
    querySpecifications.add(PropertyOwnedByBlock.instance());
    querySpecifications.add(PropertyOwnedByValueType.instance());
    querySpecifications.add(ExposeClientNotView.instance());
    querySpecifications.add(FullPortBoundToFullPort.instance());
    querySpecifications.add(InvocationOnNestedPortActionOnPortUndefined.instance());
    querySpecifications.add(ItemFlowAssociationHasItemProperty.instance());
    querySpecifications.add(ItemFlowDifferentType.instance());
    querySpecifications.add(ItemFlowInvalidType.instance());
    querySpecifications.add(ItemFlowItemPropertyDifferentName.instance());
    querySpecifications.add(ProxyPortFullPort.instance());
    querySpecifications.add(ProxyPortSubportNotProxyPort.instance());
    querySpecifications.add(ProxyPortTypeNotInterfaceBlock.instance());
    querySpecifications.add(TraceNotSingleClient.instance());
    querySpecifications.add(TriggerOnNestedPortBaseFullPort.instance());
    querySpecifications.add(TriggerOnNestedPortFullPort.instance());
    querySpecifications.add(TriggerOnNestedPortNotSinglePort.instance());
    querySpecifications.add(VerifySupplierNotRequirement.instance());
    querySpecifications.add(AcsfeActionOneTrigger.instance());
    querySpecifications.add(AcsfeActionInvalidTrigger.instance());
    querySpecifications.add(TriggerEventIsChangeStructuralFeatureEvent.instance());
    querySpecifications.add(AcsfeActionNotTwoResultpins.instance());
    querySpecifications.add(AdjunctPropertyMultiplicityRestrictive.instance());
    querySpecifications.add(MoreRestrictive.instance());
    querySpecifications.add(AdjunctPropertySubmachineOrInteraction.instance());
    querySpecifications.add(InteractionUseOrState.instance());
    querySpecifications.add(Correct.instance());
    querySpecifications.add(PrincipalBehavior.instance());
    querySpecifications.add(AllocateActivityPartitionActionsOnClientEnds.instance());
    querySpecifications.add(CorrectActPartNode.instance());
    querySpecifications.add(RepresentsSupplier.instance());
    querySpecifications.add(BoundReferenceOpposite.instance());
    querySpecifications.add(BoundReference_2_opposite_bindingconnector_end.instance());
    querySpecifications.add(BoundReferenceNotReferenceOrValueProperty.instance());
    querySpecifications.add(BoundReferenceNotOrdered.instance());
    querySpecifications.add(GreaterThanOne.instance());
    querySpecifications.add(BoundReferenceUnique.instance());
    querySpecifications.add(BoundReferenceRedefined.instance());
    querySpecifications.add(ConstraintBlockPropertyNotComposite.instance());
    querySpecifications.add(ControlOperatorOperationMethod.instance());
    querySpecifications.add(DeriveReqtSupplierNotReqt.instance());
    querySpecifications.add(DeriveReqtClientNotReqt.instance());
    querySpecifications.add(DirecredFeatureInvalidStereotype.instance());
    querySpecifications.add(NotFlowProperty.instance());
    querySpecifications.add(OptionalLowerNotZero.instance());
    querySpecifications.add(OptionalLowerZero.instance());
    querySpecifications.add(AdjunctPropertyIncorrectMultiplicity.instance());
    querySpecifications.add(TraceNotSingleSupplier.instance());
    querySpecifications.add(AcsfeActionIncorrectResultpins.instance());
    querySpecifications.add(ResultToCheck.instance());
    querySpecifications.add(CorrectTypeAndOrdering.instance());
    querySpecifications.add(ViewpointNoCreate.instance());
    querySpecifications.add(HasCreateOperationamedView.instance());
    querySpecifications.add(ChangeStructuralFeatureEventStatic.instance());
    querySpecifications.add(ChangeStructuralFeatureEventFeatureMultiplicity.instance());
    querySpecifications.add(CopyMultipleCopies.instance());
    querySpecifications.add(CopyCycle.instance());
    querySpecifications.add(SupplierCopy.instance());
    querySpecifications.add(RequirementIdNotUnique.instance());
    querySpecifications.add(PropertySpecificTypeNotOwnedByBlock.instance());
    querySpecifications.add(ValuePropertyNotValueType.instance());
    querySpecifications.add(FlowPortOwnerNotBlock.instance());
    querySpecifications.add(FlowSpecificationInvalidApplication.instance());
    querySpecifications.add(FlowPortDeprecated.instance());
    querySpecifications.add(FlowSpecificationDeprecated.instance());
    querySpecifications.add(InterfaceBlockInvalidInheritance.instance());
    querySpecifications.add(PartPropertyInvalidType.instance());
    querySpecifications.add(ReferencePropertyInvalidType.instance());
    querySpecifications.add(SharedPropertyInvalidType.instance());
    querySpecifications.add(ActivityStreamingNoNStreaming.instance());
  }
}
