/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

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
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in sysml_validation_queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file sysml_validation_queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
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
 * <li>connectionPropertyDifferentName</li>
 * <li>connectionPropertyNotTypedByAssociationBlock</li>
 * <li>connectorPropertyNotBlock</li>
 * <li>connectorPropertyNotComposite</li>
 * <li>connectorPropertyNotOwnedOrInherited</li>
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
 * <li>endPathMiultiplicityNotRedefiniton</li>
 * <li>endPathMiultiplicityNegative</li>
 * <li>participantPropertyEndOwner</li>
 * <li>participantPropertyMultiplicity</li>
 * <li>propertySpecificTypeNotOneProperty</li>
 * <li>adjunctPropertyCallActionInconsistent</li>
 * <li>adjunctPropertyConnectorNotAssociationBlock</li>
 * <li>adjunctPropertyConnectorPropertyInconsistent</li>
 * <li>adjunctPropertyIncompatibleType</li>
 * <li>adjunctPropertyInvalidPrincipalKind</li>
 * <li>adjunctPropertyNotComposite</li>
 * <li>adjunctPropertyWrongName</li>
 * <li>blockAssociationNotBinary</li>
 * <li>blockSpecializationNotBlock</li>
 * <li>classifierBehaviorPropertyInvalidOwner</li>
 * <li>classifierBehaviorPropertyInvalidType</li>
 * <li>viewNotSingleViewpoint</li>
 * <li>viewStakeholderNotDerivedFromConform</li>
 * <li>viewViewpointNotDerivedFromConform</li>
 * <li>classifierBehaviorPropertyNotComposite</li>
 * <li>requirementNestedClassifierNotRequirement</li>
 * <li>constraintBlockSpecializationNotConstraintBlock</li>
 * <li>distributedPropertyNotBlockOrValueType</li>
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
 * <li>acsfeActionNotTwoResultpins</li>
 * <li>adjunctPropertyMultiplicityRestrictive</li>
 * <li>adjunctPropertySubmachineOrInteraction</li>
 * <li>allocateActivityPartitionActionsOnClientEnds</li>
 * <li>boundReferenceOpposite</li>
 * <li>boundReferenceNotReferenceOrValueProperty</li>
 * <li>boundReferenceNotOrdered</li>
 * <li>boundReferenceUnique</li>
 * <li>boundReferenceRedefined</li>
 * <li>constraintBlockPropertyNotComposite</li>
 * <li>controlOperatorOperationMethod</li>
 * <li>deriveReqtSupplierNotReqt</li>
 * <li>deriveReqtClientNotReqt</li>
 * <li>direcredFeatureInvalidStereotype</li>
 * <li>optionalLowerNotZero</li>
 * <li>optionalLowerZero</li>
 * <li>adjunctPropertyIncorrectMultiplicity</li>
 * <li>traceNotSingleSupplier</li>
 * <li>acsfeActionIncorrectResultpins</li>
 * <li>viewpointNoCreate</li>
 * <li>changeStructuralFeatureEventStatic</li>
 * <li>changeStructuralFeatureEventFeatureMultiplicity</li>
 * <li>copyMultipleCopies</li>
 * <li>copyCycle</li>
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
public final class Sysml_validation_queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Sysml_validation_queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Sysml_validation_queries();
    }
    return INSTANCE;
  }
  
  private static Sysml_validation_queries INSTANCE;
  
  private Sysml_validation_queries() {
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
    querySpecifications.add(ConnectionPropertyDifferentName.instance());
    querySpecifications.add(ConnectionPropertyNotTypedByAssociationBlock.instance());
    querySpecifications.add(ConnectorPropertyNotBlock.instance());
    querySpecifications.add(ConnectorPropertyNotComposite.instance());
    querySpecifications.add(ConnectorPropertyNotOwnedOrInherited.instance());
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
    querySpecifications.add(EndPathMiultiplicityNotRedefiniton.instance());
    querySpecifications.add(EndPathMiultiplicityNegative.instance());
    querySpecifications.add(ParticipantPropertyEndOwner.instance());
    querySpecifications.add(ParticipantPropertyMultiplicity.instance());
    querySpecifications.add(PropertySpecificTypeNotOneProperty.instance());
    querySpecifications.add(AdjunctPropertyCallActionInconsistent.instance());
    querySpecifications.add(AdjunctPropertyConnectorNotAssociationBlock.instance());
    querySpecifications.add(AdjunctPropertyConnectorPropertyInconsistent.instance());
    querySpecifications.add(AdjunctPropertyIncompatibleType.instance());
    querySpecifications.add(AdjunctPropertyInvalidPrincipalKind.instance());
    querySpecifications.add(AdjunctPropertyNotComposite.instance());
    querySpecifications.add(AdjunctPropertyWrongName.instance());
    querySpecifications.add(BlockAssociationNotBinary.instance());
    querySpecifications.add(BlockSpecializationNotBlock.instance());
    querySpecifications.add(ClassifierBehaviorPropertyInvalidOwner.instance());
    querySpecifications.add(ClassifierBehaviorPropertyInvalidType.instance());
    querySpecifications.add(ViewNotSingleViewpoint.instance());
    querySpecifications.add(ViewStakeholderNotDerivedFromConform.instance());
    querySpecifications.add(ViewViewpointNotDerivedFromConform.instance());
    querySpecifications.add(ClassifierBehaviorPropertyNotComposite.instance());
    querySpecifications.add(RequirementNestedClassifierNotRequirement.instance());
    querySpecifications.add(ConstraintBlockSpecializationNotConstraintBlock.instance());
    querySpecifications.add(DistributedPropertyNotBlockOrValueType.instance());
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
    querySpecifications.add(AcsfeActionNotTwoResultpins.instance());
    querySpecifications.add(AdjunctPropertyMultiplicityRestrictive.instance());
    querySpecifications.add(AdjunctPropertySubmachineOrInteraction.instance());
    querySpecifications.add(AllocateActivityPartitionActionsOnClientEnds.instance());
    querySpecifications.add(BoundReferenceOpposite.instance());
    querySpecifications.add(BoundReferenceNotReferenceOrValueProperty.instance());
    querySpecifications.add(BoundReferenceNotOrdered.instance());
    querySpecifications.add(BoundReferenceUnique.instance());
    querySpecifications.add(BoundReferenceRedefined.instance());
    querySpecifications.add(ConstraintBlockPropertyNotComposite.instance());
    querySpecifications.add(ControlOperatorOperationMethod.instance());
    querySpecifications.add(DeriveReqtSupplierNotReqt.instance());
    querySpecifications.add(DeriveReqtClientNotReqt.instance());
    querySpecifications.add(DirecredFeatureInvalidStereotype.instance());
    querySpecifications.add(OptionalLowerNotZero.instance());
    querySpecifications.add(OptionalLowerZero.instance());
    querySpecifications.add(AdjunctPropertyIncorrectMultiplicity.instance());
    querySpecifications.add(TraceNotSingleSupplier.instance());
    querySpecifications.add(AcsfeActionIncorrectResultpins.instance());
    querySpecifications.add(ViewpointNoCreate.instance());
    querySpecifications.add(ChangeStructuralFeatureEventStatic.instance());
    querySpecifications.add(ChangeStructuralFeatureEventFeatureMultiplicity.instance());
    querySpecifications.add(CopyMultipleCopies.instance());
    querySpecifications.add(CopyCycle.instance());
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
  
  public ParticipantPropertyDifferentType getParticipantPropertyDifferentType() {
    return ParticipantPropertyDifferentType.instance();
  }
  
  public ParticipantPropertyDifferentType.Matcher getParticipantPropertyDifferentType(final ViatraQueryEngine engine) {
    return ParticipantPropertyDifferentType.Matcher.on(engine);
  }
  
  public RefineNotSingleClient getRefineNotSingleClient() {
    return RefineNotSingleClient.instance();
  }
  
  public RefineNotSingleClient.Matcher getRefineNotSingleClient(final ViatraQueryEngine engine) {
    return RefineNotSingleClient.Matcher.on(engine);
  }
  
  public RequirementHasOperation getRequirementHasOperation() {
    return RequirementHasOperation.instance();
  }
  
  public RequirementHasOperation.Matcher getRequirementHasOperation(final ViatraQueryEngine engine) {
    return RequirementHasOperation.Matcher.on(engine);
  }
  
  public RequirementHasAttribute getRequirementHasAttribute() {
    return RequirementHasAttribute.instance();
  }
  
  public RequirementHasAttribute.Matcher getRequirementHasAttribute(final ViatraQueryEngine engine) {
    return RequirementHasAttribute.Matcher.on(engine);
  }
  
  public RequirementInAssociation getRequirementInAssociation() {
    return RequirementInAssociation.instance();
  }
  
  public RequirementInAssociation.Matcher getRequirementInAssociation(final ViatraQueryEngine engine) {
    return RequirementInAssociation.Matcher.on(engine);
  }
  
  public RequirementInGeneralization getRequirementInGeneralization() {
    return RequirementInGeneralization.instance();
  }
  
  public RequirementInGeneralization.Matcher getRequirementInGeneralization(final ViatraQueryEngine engine) {
    return RequirementInGeneralization.Matcher.on(engine);
  }
  
  public ActivityEdgeDiscreteAndContinuous getActivityEdgeDiscreteAndContinuous() {
    return ActivityEdgeDiscreteAndContinuous.instance();
  }
  
  public ActivityEdgeDiscreteAndContinuous.Matcher getActivityEdgeDiscreteAndContinuous(final ViatraQueryEngine engine) {
    return ActivityEdgeDiscreteAndContinuous.Matcher.on(engine);
  }
  
  public RequirementAsType getRequirementAsType() {
    return RequirementAsType.instance();
  }
  
  public RequirementAsType.Matcher getRequirementAsType(final ViatraQueryEngine engine) {
    return RequirementAsType.Matcher.on(engine);
  }
  
  public FlowPropertyInvalidType getFlowPropertyInvalidType() {
    return FlowPropertyInvalidType.instance();
  }
  
  public FlowPropertyInvalidType.Matcher getFlowPropertyInvalidType(final ViatraQueryEngine engine) {
    return FlowPropertyInvalidType.Matcher.on(engine);
  }
  
  public InterfaceBlockIsConjugated getInterfaceBlockIsConjugated() {
    return InterfaceBlockIsConjugated.instance();
  }
  
  public InterfaceBlockIsConjugated.Matcher getInterfaceBlockIsConjugated(final ViatraQueryEngine engine) {
    return InterfaceBlockIsConjugated.Matcher.on(engine);
  }
  
  public NoBufferAndOverwrite getNoBufferAndOverwrite() {
    return NoBufferAndOverwrite.instance();
  }
  
  public NoBufferAndOverwrite.Matcher getNoBufferAndOverwrite(final ViatraQueryEngine engine) {
    return NoBufferAndOverwrite.Matcher.on(engine);
  }
  
  public NotBinaryConnector getNotBinaryConnector() {
    return NotBinaryConnector.instance();
  }
  
  public NotBinaryConnector.Matcher getNotBinaryConnector(final ViatraQueryEngine engine) {
    return NotBinaryConnector.Matcher.on(engine);
  }
  
  public AllocateNotSingleClient getAllocateNotSingleClient() {
    return AllocateNotSingleClient.instance();
  }
  
  public AllocateNotSingleClient.Matcher getAllocateNotSingleClient(final ViatraQueryEngine engine) {
    return AllocateNotSingleClient.Matcher.on(engine);
  }
  
  public AllocateNotSingleSupplier getAllocateNotSingleSupplier() {
    return AllocateNotSingleSupplier.instance();
  }
  
  public AllocateNotSingleSupplier.Matcher getAllocateNotSingleSupplier(final ViatraQueryEngine engine) {
    return AllocateNotSingleSupplier.Matcher.on(engine);
  }
  
  public ParticipantPropertyNotBlock getParticipantPropertyNotBlock() {
    return ParticipantPropertyNotBlock.instance();
  }
  
  public ParticipantPropertyNotBlock.Matcher getParticipantPropertyNotBlock(final ViatraQueryEngine engine) {
    return ParticipantPropertyNotBlock.Matcher.on(engine);
  }
  
  public ParticipationPropertyNotAssociation getParticipationPropertyNotAssociation() {
    return ParticipationPropertyNotAssociation.instance();
  }
  
  public ParticipationPropertyNotAssociation.Matcher getParticipationPropertyNotAssociation(final ViatraQueryEngine engine) {
    return ParticipationPropertyNotAssociation.Matcher.on(engine);
  }
  
  public ParticipantPropertyIsMemberEndOfAssociation getParticipantPropertyIsMemberEndOfAssociation() {
    return ParticipantPropertyIsMemberEndOfAssociation.instance();
  }
  
  public ParticipantPropertyIsMemberEndOfAssociation.Matcher getParticipantPropertyIsMemberEndOfAssociation(final ViatraQueryEngine engine) {
    return ParticipantPropertyIsMemberEndOfAssociation.Matcher.on(engine);
  }
  
  public RefineNotSingleSupplier getRefineNotSingleSupplier() {
    return RefineNotSingleSupplier.instance();
  }
  
  public RefineNotSingleSupplier.Matcher getRefineNotSingleSupplier(final ViatraQueryEngine engine) {
    return RefineNotSingleSupplier.Matcher.on(engine);
  }
  
  public ParticipantPropertyAggregationKindNotNone getParticipantPropertyAggregationKindNotNone() {
    return ParticipantPropertyAggregationKindNotNone.instance();
  }
  
  public ParticipantPropertyAggregationKindNotNone.Matcher getParticipantPropertyAggregationKindNotNone(final ViatraQueryEngine engine) {
    return ParticipantPropertyAggregationKindNotNone.Matcher.on(engine);
  }
  
  public FullPortIsBehavioral getFullPortIsBehavioral() {
    return FullPortIsBehavioral.instance();
  }
  
  public FullPortIsBehavioral.Matcher getFullPortIsBehavioral(final ViatraQueryEngine engine) {
    return FullPortIsBehavioral.Matcher.on(engine);
  }
  
  public InterfaceBlockPortInvalidType getInterfaceBlockPortInvalidType() {
    return InterfaceBlockPortInvalidType.instance();
  }
  
  public InterfaceBlockPortInvalidType.Matcher getInterfaceBlockPortInvalidType(final ViatraQueryEngine engine) {
    return InterfaceBlockPortInvalidType.Matcher.on(engine);
  }
  
  public ConformGeneralNotViewpoint getConformGeneralNotViewpoint() {
    return ConformGeneralNotViewpoint.instance();
  }
  
  public ConformGeneralNotViewpoint.Matcher getConformGeneralNotViewpoint(final ViatraQueryEngine engine) {
    return ConformGeneralNotViewpoint.Matcher.on(engine);
  }
  
  public ConformSpecificNotView getConformSpecificNotView() {
    return ConformSpecificNotView.instance();
  }
  
  public ConformSpecificNotView.Matcher getConformSpecificNotView(final ViatraQueryEngine engine) {
    return ConformSpecificNotView.Matcher.on(engine);
  }
  
  public BoundReferenceNotConnectorEnd getBoundReferenceNotConnectorEnd() {
    return BoundReferenceNotConnectorEnd.instance();
  }
  
  public BoundReferenceNotConnectorEnd.Matcher getBoundReferenceNotConnectorEnd(final ViatraQueryEngine engine) {
    return BoundReferenceNotConnectorEnd.Matcher.on(engine);
  }
  
  public ConnectionPropertyDifferentName getConnectionPropertyDifferentName() {
    return ConnectionPropertyDifferentName.instance();
  }
  
  public ConnectionPropertyDifferentName.Matcher getConnectionPropertyDifferentName(final ViatraQueryEngine engine) {
    return ConnectionPropertyDifferentName.Matcher.on(engine);
  }
  
  public ConnectionPropertyNotTypedByAssociationBlock getConnectionPropertyNotTypedByAssociationBlock() {
    return ConnectionPropertyNotTypedByAssociationBlock.instance();
  }
  
  public ConnectionPropertyNotTypedByAssociationBlock.Matcher getConnectionPropertyNotTypedByAssociationBlock(final ViatraQueryEngine engine) {
    return ConnectionPropertyNotTypedByAssociationBlock.Matcher.on(engine);
  }
  
  public ConnectorPropertyNotBlock getConnectorPropertyNotBlock() {
    return ConnectorPropertyNotBlock.instance();
  }
  
  public ConnectorPropertyNotBlock.Matcher getConnectorPropertyNotBlock(final ViatraQueryEngine engine) {
    return ConnectorPropertyNotBlock.Matcher.on(engine);
  }
  
  public ConnectorPropertyNotComposite getConnectorPropertyNotComposite() {
    return ConnectorPropertyNotComposite.instance();
  }
  
  public ConnectorPropertyNotComposite.Matcher getConnectorPropertyNotComposite(final ViatraQueryEngine engine) {
    return ConnectorPropertyNotComposite.Matcher.on(engine);
  }
  
  public ConnectorPropertyNotOwnedOrInherited getConnectorPropertyNotOwnedOrInherited() {
    return ConnectorPropertyNotOwnedOrInherited.instance();
  }
  
  public ConnectorPropertyNotOwnedOrInherited.Matcher getConnectorPropertyNotOwnedOrInherited(final ViatraQueryEngine engine) {
    return ConnectorPropertyNotOwnedOrInherited.Matcher.on(engine);
  }
  
  public ValueTypeSpecializatonNotValueType getValueTypeSpecializatonNotValueType() {
    return ValueTypeSpecializatonNotValueType.instance();
  }
  
  public ValueTypeSpecializatonNotValueType.Matcher getValueTypeSpecializatonNotValueType(final ViatraQueryEngine engine) {
    return ValueTypeSpecializatonNotValueType.Matcher.on(engine);
  }
  
  public BlockValuePropertyNotComposite getBlockValuePropertyNotComposite() {
    return BlockValuePropertyNotComposite.instance();
  }
  
  public BlockValuePropertyNotComposite.Matcher getBlockValuePropertyNotComposite(final ViatraQueryEngine engine) {
    return BlockValuePropertyNotComposite.Matcher.on(engine);
  }
  
  public ValueTypeValuePropertyNotComposite getValueTypeValuePropertyNotComposite() {
    return ValueTypeValuePropertyNotComposite.instance();
  }
  
  public ValueTypeValuePropertyNotComposite.Matcher getValueTypeValuePropertyNotComposite(final ViatraQueryEngine engine) {
    return ValueTypeValuePropertyNotComposite.Matcher.on(engine);
  }
  
  public ParameterDiscreteAndContinuous getParameterDiscreteAndContinuous() {
    return ParameterDiscreteAndContinuous.instance();
  }
  
  public ParameterDiscreteAndContinuous.Matcher getParameterDiscreteAndContinuous(final ViatraQueryEngine engine) {
    return ParameterDiscreteAndContinuous.Matcher.on(engine);
  }
  
  public ProbabilityInvalidStereotype getProbabilityInvalidStereotype() {
    return ProbabilityInvalidStereotype.instance();
  }
  
  public ProbabilityInvalidStereotype.Matcher getProbabilityInvalidStereotype(final ViatraQueryEngine engine) {
    return ProbabilityInvalidStereotype.Matcher.on(engine);
  }
  
  public ProbabilityAllOutgoingEdges getProbabilityAllOutgoingEdges() {
    return ProbabilityAllOutgoingEdges.instance();
  }
  
  public ProbabilityAllOutgoingEdges.Matcher getProbabilityAllOutgoingEdges(final ViatraQueryEngine engine) {
    return ProbabilityAllOutgoingEdges.Matcher.on(engine);
  }
  
  public RateNotStreaming getRateNotStreaming() {
    return RateNotStreaming.instance();
  }
  
  public RateNotStreaming.Matcher getRateNotStreaming(final ViatraQueryEngine engine) {
    return RateNotStreaming.Matcher.on(engine);
  }
  
  public CopyClientNotRequirement getCopyClientNotRequirement() {
    return CopyClientNotRequirement.instance();
  }
  
  public CopyClientNotRequirement.Matcher getCopyClientNotRequirement(final ViatraQueryEngine engine) {
    return CopyClientNotRequirement.Matcher.on(engine);
  }
  
  public CopySupplierNotRequirement getCopySupplierNotRequirement() {
    return CopySupplierNotRequirement.instance();
  }
  
  public CopySupplierNotRequirement.Matcher getCopySupplierNotRequirement(final ViatraQueryEngine engine) {
    return CopySupplierNotRequirement.Matcher.on(engine);
  }
  
  public SatisfySupplierNotRequirement getSatisfySupplierNotRequirement() {
    return SatisfySupplierNotRequirement.instance();
  }
  
  public SatisfySupplierNotRequirement.Matcher getSatisfySupplierNotRequirement(final ViatraQueryEngine engine) {
    return SatisfySupplierNotRequirement.Matcher.on(engine);
  }
  
  public StakeHolderInvalidStereotype getStakeHolderInvalidStereotype() {
    return StakeHolderInvalidStereotype.instance();
  }
  
  public StakeHolderInvalidStereotype.Matcher getStakeHolderInvalidStereotype(final ViatraQueryEngine engine) {
    return StakeHolderInvalidStereotype.Matcher.on(engine);
  }
  
  public EndPathMiultiplicityNotRedefiniton getEndPathMiultiplicityNotRedefiniton() {
    return EndPathMiultiplicityNotRedefiniton.instance();
  }
  
  public EndPathMiultiplicityNotRedefiniton.Matcher getEndPathMiultiplicityNotRedefiniton(final ViatraQueryEngine engine) {
    return EndPathMiultiplicityNotRedefiniton.Matcher.on(engine);
  }
  
  public EndPathMiultiplicityNegative getEndPathMiultiplicityNegative() {
    return EndPathMiultiplicityNegative.instance();
  }
  
  public EndPathMiultiplicityNegative.Matcher getEndPathMiultiplicityNegative(final ViatraQueryEngine engine) {
    return EndPathMiultiplicityNegative.Matcher.on(engine);
  }
  
  public ParticipantPropertyEndOwner getParticipantPropertyEndOwner() {
    return ParticipantPropertyEndOwner.instance();
  }
  
  public ParticipantPropertyEndOwner.Matcher getParticipantPropertyEndOwner(final ViatraQueryEngine engine) {
    return ParticipantPropertyEndOwner.Matcher.on(engine);
  }
  
  public ParticipantPropertyMultiplicity getParticipantPropertyMultiplicity() {
    return ParticipantPropertyMultiplicity.instance();
  }
  
  public ParticipantPropertyMultiplicity.Matcher getParticipantPropertyMultiplicity(final ViatraQueryEngine engine) {
    return ParticipantPropertyMultiplicity.Matcher.on(engine);
  }
  
  public PropertySpecificTypeNotOneProperty getPropertySpecificTypeNotOneProperty() {
    return PropertySpecificTypeNotOneProperty.instance();
  }
  
  public PropertySpecificTypeNotOneProperty.Matcher getPropertySpecificTypeNotOneProperty(final ViatraQueryEngine engine) {
    return PropertySpecificTypeNotOneProperty.Matcher.on(engine);
  }
  
  public AdjunctPropertyCallActionInconsistent getAdjunctPropertyCallActionInconsistent() {
    return AdjunctPropertyCallActionInconsistent.instance();
  }
  
  public AdjunctPropertyCallActionInconsistent.Matcher getAdjunctPropertyCallActionInconsistent(final ViatraQueryEngine engine) {
    return AdjunctPropertyCallActionInconsistent.Matcher.on(engine);
  }
  
  public AdjunctPropertyConnectorNotAssociationBlock getAdjunctPropertyConnectorNotAssociationBlock() {
    return AdjunctPropertyConnectorNotAssociationBlock.instance();
  }
  
  public AdjunctPropertyConnectorNotAssociationBlock.Matcher getAdjunctPropertyConnectorNotAssociationBlock(final ViatraQueryEngine engine) {
    return AdjunctPropertyConnectorNotAssociationBlock.Matcher.on(engine);
  }
  
  public AdjunctPropertyConnectorPropertyInconsistent getAdjunctPropertyConnectorPropertyInconsistent() {
    return AdjunctPropertyConnectorPropertyInconsistent.instance();
  }
  
  public AdjunctPropertyConnectorPropertyInconsistent.Matcher getAdjunctPropertyConnectorPropertyInconsistent(final ViatraQueryEngine engine) {
    return AdjunctPropertyConnectorPropertyInconsistent.Matcher.on(engine);
  }
  
  public AdjunctPropertyIncompatibleType getAdjunctPropertyIncompatibleType() {
    return AdjunctPropertyIncompatibleType.instance();
  }
  
  public AdjunctPropertyIncompatibleType.Matcher getAdjunctPropertyIncompatibleType(final ViatraQueryEngine engine) {
    return AdjunctPropertyIncompatibleType.Matcher.on(engine);
  }
  
  public AdjunctPropertyInvalidPrincipalKind getAdjunctPropertyInvalidPrincipalKind() {
    return AdjunctPropertyInvalidPrincipalKind.instance();
  }
  
  public AdjunctPropertyInvalidPrincipalKind.Matcher getAdjunctPropertyInvalidPrincipalKind(final ViatraQueryEngine engine) {
    return AdjunctPropertyInvalidPrincipalKind.Matcher.on(engine);
  }
  
  public AdjunctPropertyNotComposite getAdjunctPropertyNotComposite() {
    return AdjunctPropertyNotComposite.instance();
  }
  
  public AdjunctPropertyNotComposite.Matcher getAdjunctPropertyNotComposite(final ViatraQueryEngine engine) {
    return AdjunctPropertyNotComposite.Matcher.on(engine);
  }
  
  public AdjunctPropertyWrongName getAdjunctPropertyWrongName() {
    return AdjunctPropertyWrongName.instance();
  }
  
  public AdjunctPropertyWrongName.Matcher getAdjunctPropertyWrongName(final ViatraQueryEngine engine) {
    return AdjunctPropertyWrongName.Matcher.on(engine);
  }
  
  public BlockAssociationNotBinary getBlockAssociationNotBinary() {
    return BlockAssociationNotBinary.instance();
  }
  
  public BlockAssociationNotBinary.Matcher getBlockAssociationNotBinary(final ViatraQueryEngine engine) {
    return BlockAssociationNotBinary.Matcher.on(engine);
  }
  
  public BlockSpecializationNotBlock getBlockSpecializationNotBlock() {
    return BlockSpecializationNotBlock.instance();
  }
  
  public BlockSpecializationNotBlock.Matcher getBlockSpecializationNotBlock(final ViatraQueryEngine engine) {
    return BlockSpecializationNotBlock.Matcher.on(engine);
  }
  
  public ClassifierBehaviorPropertyInvalidOwner getClassifierBehaviorPropertyInvalidOwner() {
    return ClassifierBehaviorPropertyInvalidOwner.instance();
  }
  
  public ClassifierBehaviorPropertyInvalidOwner.Matcher getClassifierBehaviorPropertyInvalidOwner(final ViatraQueryEngine engine) {
    return ClassifierBehaviorPropertyInvalidOwner.Matcher.on(engine);
  }
  
  public ClassifierBehaviorPropertyInvalidType getClassifierBehaviorPropertyInvalidType() {
    return ClassifierBehaviorPropertyInvalidType.instance();
  }
  
  public ClassifierBehaviorPropertyInvalidType.Matcher getClassifierBehaviorPropertyInvalidType(final ViatraQueryEngine engine) {
    return ClassifierBehaviorPropertyInvalidType.Matcher.on(engine);
  }
  
  public ViewNotSingleViewpoint getViewNotSingleViewpoint() {
    return ViewNotSingleViewpoint.instance();
  }
  
  public ViewNotSingleViewpoint.Matcher getViewNotSingleViewpoint(final ViatraQueryEngine engine) {
    return ViewNotSingleViewpoint.Matcher.on(engine);
  }
  
  public ViewStakeholderNotDerivedFromConform getViewStakeholderNotDerivedFromConform() {
    return ViewStakeholderNotDerivedFromConform.instance();
  }
  
  public ViewStakeholderNotDerivedFromConform.Matcher getViewStakeholderNotDerivedFromConform(final ViatraQueryEngine engine) {
    return ViewStakeholderNotDerivedFromConform.Matcher.on(engine);
  }
  
  public ViewViewpointNotDerivedFromConform getViewViewpointNotDerivedFromConform() {
    return ViewViewpointNotDerivedFromConform.instance();
  }
  
  public ViewViewpointNotDerivedFromConform.Matcher getViewViewpointNotDerivedFromConform(final ViatraQueryEngine engine) {
    return ViewViewpointNotDerivedFromConform.Matcher.on(engine);
  }
  
  public ClassifierBehaviorPropertyNotComposite getClassifierBehaviorPropertyNotComposite() {
    return ClassifierBehaviorPropertyNotComposite.instance();
  }
  
  public ClassifierBehaviorPropertyNotComposite.Matcher getClassifierBehaviorPropertyNotComposite(final ViatraQueryEngine engine) {
    return ClassifierBehaviorPropertyNotComposite.Matcher.on(engine);
  }
  
  public RequirementNestedClassifierNotRequirement getRequirementNestedClassifierNotRequirement() {
    return RequirementNestedClassifierNotRequirement.instance();
  }
  
  public RequirementNestedClassifierNotRequirement.Matcher getRequirementNestedClassifierNotRequirement(final ViatraQueryEngine engine) {
    return RequirementNestedClassifierNotRequirement.Matcher.on(engine);
  }
  
  public ConstraintBlockSpecializationNotConstraintBlock getConstraintBlockSpecializationNotConstraintBlock() {
    return ConstraintBlockSpecializationNotConstraintBlock.instance();
  }
  
  public ConstraintBlockSpecializationNotConstraintBlock.Matcher getConstraintBlockSpecializationNotConstraintBlock(final ViatraQueryEngine engine) {
    return ConstraintBlockSpecializationNotConstraintBlock.Matcher.on(engine);
  }
  
  public DistributedPropertyNotBlockOrValueType getDistributedPropertyNotBlockOrValueType() {
    return DistributedPropertyNotBlockOrValueType.instance();
  }
  
  public DistributedPropertyNotBlockOrValueType.Matcher getDistributedPropertyNotBlockOrValueType(final ViatraQueryEngine engine) {
    return DistributedPropertyNotBlockOrValueType.Matcher.on(engine);
  }
  
  public ExposeClientNotView getExposeClientNotView() {
    return ExposeClientNotView.instance();
  }
  
  public ExposeClientNotView.Matcher getExposeClientNotView(final ViatraQueryEngine engine) {
    return ExposeClientNotView.Matcher.on(engine);
  }
  
  public FullPortBoundToFullPort getFullPortBoundToFullPort() {
    return FullPortBoundToFullPort.instance();
  }
  
  public FullPortBoundToFullPort.Matcher getFullPortBoundToFullPort(final ViatraQueryEngine engine) {
    return FullPortBoundToFullPort.Matcher.on(engine);
  }
  
  public InvocationOnNestedPortActionOnPortUndefined getInvocationOnNestedPortActionOnPortUndefined() {
    return InvocationOnNestedPortActionOnPortUndefined.instance();
  }
  
  public InvocationOnNestedPortActionOnPortUndefined.Matcher getInvocationOnNestedPortActionOnPortUndefined(final ViatraQueryEngine engine) {
    return InvocationOnNestedPortActionOnPortUndefined.Matcher.on(engine);
  }
  
  public ItemFlowAssociationHasItemProperty getItemFlowAssociationHasItemProperty() {
    return ItemFlowAssociationHasItemProperty.instance();
  }
  
  public ItemFlowAssociationHasItemProperty.Matcher getItemFlowAssociationHasItemProperty(final ViatraQueryEngine engine) {
    return ItemFlowAssociationHasItemProperty.Matcher.on(engine);
  }
  
  public ItemFlowDifferentType getItemFlowDifferentType() {
    return ItemFlowDifferentType.instance();
  }
  
  public ItemFlowDifferentType.Matcher getItemFlowDifferentType(final ViatraQueryEngine engine) {
    return ItemFlowDifferentType.Matcher.on(engine);
  }
  
  public ItemFlowInvalidType getItemFlowInvalidType() {
    return ItemFlowInvalidType.instance();
  }
  
  public ItemFlowInvalidType.Matcher getItemFlowInvalidType(final ViatraQueryEngine engine) {
    return ItemFlowInvalidType.Matcher.on(engine);
  }
  
  public ItemFlowItemPropertyDifferentName getItemFlowItemPropertyDifferentName() {
    return ItemFlowItemPropertyDifferentName.instance();
  }
  
  public ItemFlowItemPropertyDifferentName.Matcher getItemFlowItemPropertyDifferentName(final ViatraQueryEngine engine) {
    return ItemFlowItemPropertyDifferentName.Matcher.on(engine);
  }
  
  public ProxyPortFullPort getProxyPortFullPort() {
    return ProxyPortFullPort.instance();
  }
  
  public ProxyPortFullPort.Matcher getProxyPortFullPort(final ViatraQueryEngine engine) {
    return ProxyPortFullPort.Matcher.on(engine);
  }
  
  public ProxyPortSubportNotProxyPort getProxyPortSubportNotProxyPort() {
    return ProxyPortSubportNotProxyPort.instance();
  }
  
  public ProxyPortSubportNotProxyPort.Matcher getProxyPortSubportNotProxyPort(final ViatraQueryEngine engine) {
    return ProxyPortSubportNotProxyPort.Matcher.on(engine);
  }
  
  public ProxyPortTypeNotInterfaceBlock getProxyPortTypeNotInterfaceBlock() {
    return ProxyPortTypeNotInterfaceBlock.instance();
  }
  
  public ProxyPortTypeNotInterfaceBlock.Matcher getProxyPortTypeNotInterfaceBlock(final ViatraQueryEngine engine) {
    return ProxyPortTypeNotInterfaceBlock.Matcher.on(engine);
  }
  
  public TraceNotSingleClient getTraceNotSingleClient() {
    return TraceNotSingleClient.instance();
  }
  
  public TraceNotSingleClient.Matcher getTraceNotSingleClient(final ViatraQueryEngine engine) {
    return TraceNotSingleClient.Matcher.on(engine);
  }
  
  public TriggerOnNestedPortBaseFullPort getTriggerOnNestedPortBaseFullPort() {
    return TriggerOnNestedPortBaseFullPort.instance();
  }
  
  public TriggerOnNestedPortBaseFullPort.Matcher getTriggerOnNestedPortBaseFullPort(final ViatraQueryEngine engine) {
    return TriggerOnNestedPortBaseFullPort.Matcher.on(engine);
  }
  
  public TriggerOnNestedPortFullPort getTriggerOnNestedPortFullPort() {
    return TriggerOnNestedPortFullPort.instance();
  }
  
  public TriggerOnNestedPortFullPort.Matcher getTriggerOnNestedPortFullPort(final ViatraQueryEngine engine) {
    return TriggerOnNestedPortFullPort.Matcher.on(engine);
  }
  
  public TriggerOnNestedPortNotSinglePort getTriggerOnNestedPortNotSinglePort() {
    return TriggerOnNestedPortNotSinglePort.instance();
  }
  
  public TriggerOnNestedPortNotSinglePort.Matcher getTriggerOnNestedPortNotSinglePort(final ViatraQueryEngine engine) {
    return TriggerOnNestedPortNotSinglePort.Matcher.on(engine);
  }
  
  public VerifySupplierNotRequirement getVerifySupplierNotRequirement() {
    return VerifySupplierNotRequirement.instance();
  }
  
  public VerifySupplierNotRequirement.Matcher getVerifySupplierNotRequirement(final ViatraQueryEngine engine) {
    return VerifySupplierNotRequirement.Matcher.on(engine);
  }
  
  public AcsfeActionOneTrigger getAcsfeActionOneTrigger() {
    return AcsfeActionOneTrigger.instance();
  }
  
  public AcsfeActionOneTrigger.Matcher getAcsfeActionOneTrigger(final ViatraQueryEngine engine) {
    return AcsfeActionOneTrigger.Matcher.on(engine);
  }
  
  public AcsfeActionInvalidTrigger getAcsfeActionInvalidTrigger() {
    return AcsfeActionInvalidTrigger.instance();
  }
  
  public AcsfeActionInvalidTrigger.Matcher getAcsfeActionInvalidTrigger(final ViatraQueryEngine engine) {
    return AcsfeActionInvalidTrigger.Matcher.on(engine);
  }
  
  public AcsfeActionNotTwoResultpins getAcsfeActionNotTwoResultpins() {
    return AcsfeActionNotTwoResultpins.instance();
  }
  
  public AcsfeActionNotTwoResultpins.Matcher getAcsfeActionNotTwoResultpins(final ViatraQueryEngine engine) {
    return AcsfeActionNotTwoResultpins.Matcher.on(engine);
  }
  
  public AdjunctPropertyMultiplicityRestrictive getAdjunctPropertyMultiplicityRestrictive() {
    return AdjunctPropertyMultiplicityRestrictive.instance();
  }
  
  public AdjunctPropertyMultiplicityRestrictive.Matcher getAdjunctPropertyMultiplicityRestrictive(final ViatraQueryEngine engine) {
    return AdjunctPropertyMultiplicityRestrictive.Matcher.on(engine);
  }
  
  public AdjunctPropertySubmachineOrInteraction getAdjunctPropertySubmachineOrInteraction() {
    return AdjunctPropertySubmachineOrInteraction.instance();
  }
  
  public AdjunctPropertySubmachineOrInteraction.Matcher getAdjunctPropertySubmachineOrInteraction(final ViatraQueryEngine engine) {
    return AdjunctPropertySubmachineOrInteraction.Matcher.on(engine);
  }
  
  public AllocateActivityPartitionActionsOnClientEnds getAllocateActivityPartitionActionsOnClientEnds() {
    return AllocateActivityPartitionActionsOnClientEnds.instance();
  }
  
  public AllocateActivityPartitionActionsOnClientEnds.Matcher getAllocateActivityPartitionActionsOnClientEnds(final ViatraQueryEngine engine) {
    return AllocateActivityPartitionActionsOnClientEnds.Matcher.on(engine);
  }
  
  public BoundReferenceOpposite getBoundReferenceOpposite() {
    return BoundReferenceOpposite.instance();
  }
  
  public BoundReferenceOpposite.Matcher getBoundReferenceOpposite(final ViatraQueryEngine engine) {
    return BoundReferenceOpposite.Matcher.on(engine);
  }
  
  public BoundReferenceNotReferenceOrValueProperty getBoundReferenceNotReferenceOrValueProperty() {
    return BoundReferenceNotReferenceOrValueProperty.instance();
  }
  
  public BoundReferenceNotReferenceOrValueProperty.Matcher getBoundReferenceNotReferenceOrValueProperty(final ViatraQueryEngine engine) {
    return BoundReferenceNotReferenceOrValueProperty.Matcher.on(engine);
  }
  
  public BoundReferenceNotOrdered getBoundReferenceNotOrdered() {
    return BoundReferenceNotOrdered.instance();
  }
  
  public BoundReferenceNotOrdered.Matcher getBoundReferenceNotOrdered(final ViatraQueryEngine engine) {
    return BoundReferenceNotOrdered.Matcher.on(engine);
  }
  
  public BoundReferenceUnique getBoundReferenceUnique() {
    return BoundReferenceUnique.instance();
  }
  
  public BoundReferenceUnique.Matcher getBoundReferenceUnique(final ViatraQueryEngine engine) {
    return BoundReferenceUnique.Matcher.on(engine);
  }
  
  public BoundReferenceRedefined getBoundReferenceRedefined() {
    return BoundReferenceRedefined.instance();
  }
  
  public BoundReferenceRedefined.Matcher getBoundReferenceRedefined(final ViatraQueryEngine engine) {
    return BoundReferenceRedefined.Matcher.on(engine);
  }
  
  public ConstraintBlockPropertyNotComposite getConstraintBlockPropertyNotComposite() {
    return ConstraintBlockPropertyNotComposite.instance();
  }
  
  public ConstraintBlockPropertyNotComposite.Matcher getConstraintBlockPropertyNotComposite(final ViatraQueryEngine engine) {
    return ConstraintBlockPropertyNotComposite.Matcher.on(engine);
  }
  
  public ControlOperatorOperationMethod getControlOperatorOperationMethod() {
    return ControlOperatorOperationMethod.instance();
  }
  
  public ControlOperatorOperationMethod.Matcher getControlOperatorOperationMethod(final ViatraQueryEngine engine) {
    return ControlOperatorOperationMethod.Matcher.on(engine);
  }
  
  public DeriveReqtSupplierNotReqt getDeriveReqtSupplierNotReqt() {
    return DeriveReqtSupplierNotReqt.instance();
  }
  
  public DeriveReqtSupplierNotReqt.Matcher getDeriveReqtSupplierNotReqt(final ViatraQueryEngine engine) {
    return DeriveReqtSupplierNotReqt.Matcher.on(engine);
  }
  
  public DeriveReqtClientNotReqt getDeriveReqtClientNotReqt() {
    return DeriveReqtClientNotReqt.instance();
  }
  
  public DeriveReqtClientNotReqt.Matcher getDeriveReqtClientNotReqt(final ViatraQueryEngine engine) {
    return DeriveReqtClientNotReqt.Matcher.on(engine);
  }
  
  public DirecredFeatureInvalidStereotype getDirecredFeatureInvalidStereotype() {
    return DirecredFeatureInvalidStereotype.instance();
  }
  
  public DirecredFeatureInvalidStereotype.Matcher getDirecredFeatureInvalidStereotype(final ViatraQueryEngine engine) {
    return DirecredFeatureInvalidStereotype.Matcher.on(engine);
  }
  
  public OptionalLowerNotZero getOptionalLowerNotZero() {
    return OptionalLowerNotZero.instance();
  }
  
  public OptionalLowerNotZero.Matcher getOptionalLowerNotZero(final ViatraQueryEngine engine) {
    return OptionalLowerNotZero.Matcher.on(engine);
  }
  
  public OptionalLowerZero getOptionalLowerZero() {
    return OptionalLowerZero.instance();
  }
  
  public OptionalLowerZero.Matcher getOptionalLowerZero(final ViatraQueryEngine engine) {
    return OptionalLowerZero.Matcher.on(engine);
  }
  
  public AdjunctPropertyIncorrectMultiplicity getAdjunctPropertyIncorrectMultiplicity() {
    return AdjunctPropertyIncorrectMultiplicity.instance();
  }
  
  public AdjunctPropertyIncorrectMultiplicity.Matcher getAdjunctPropertyIncorrectMultiplicity(final ViatraQueryEngine engine) {
    return AdjunctPropertyIncorrectMultiplicity.Matcher.on(engine);
  }
  
  public TraceNotSingleSupplier getTraceNotSingleSupplier() {
    return TraceNotSingleSupplier.instance();
  }
  
  public TraceNotSingleSupplier.Matcher getTraceNotSingleSupplier(final ViatraQueryEngine engine) {
    return TraceNotSingleSupplier.Matcher.on(engine);
  }
  
  public AcsfeActionIncorrectResultpins getAcsfeActionIncorrectResultpins() {
    return AcsfeActionIncorrectResultpins.instance();
  }
  
  public AcsfeActionIncorrectResultpins.Matcher getAcsfeActionIncorrectResultpins(final ViatraQueryEngine engine) {
    return AcsfeActionIncorrectResultpins.Matcher.on(engine);
  }
  
  public ViewpointNoCreate getViewpointNoCreate() {
    return ViewpointNoCreate.instance();
  }
  
  public ViewpointNoCreate.Matcher getViewpointNoCreate(final ViatraQueryEngine engine) {
    return ViewpointNoCreate.Matcher.on(engine);
  }
  
  public ChangeStructuralFeatureEventStatic getChangeStructuralFeatureEventStatic() {
    return ChangeStructuralFeatureEventStatic.instance();
  }
  
  public ChangeStructuralFeatureEventStatic.Matcher getChangeStructuralFeatureEventStatic(final ViatraQueryEngine engine) {
    return ChangeStructuralFeatureEventStatic.Matcher.on(engine);
  }
  
  public ChangeStructuralFeatureEventFeatureMultiplicity getChangeStructuralFeatureEventFeatureMultiplicity() {
    return ChangeStructuralFeatureEventFeatureMultiplicity.instance();
  }
  
  public ChangeStructuralFeatureEventFeatureMultiplicity.Matcher getChangeStructuralFeatureEventFeatureMultiplicity(final ViatraQueryEngine engine) {
    return ChangeStructuralFeatureEventFeatureMultiplicity.Matcher.on(engine);
  }
  
  public CopyMultipleCopies getCopyMultipleCopies() {
    return CopyMultipleCopies.instance();
  }
  
  public CopyMultipleCopies.Matcher getCopyMultipleCopies(final ViatraQueryEngine engine) {
    return CopyMultipleCopies.Matcher.on(engine);
  }
  
  public CopyCycle getCopyCycle() {
    return CopyCycle.instance();
  }
  
  public CopyCycle.Matcher getCopyCycle(final ViatraQueryEngine engine) {
    return CopyCycle.Matcher.on(engine);
  }
  
  public RequirementIdNotUnique getRequirementIdNotUnique() {
    return RequirementIdNotUnique.instance();
  }
  
  public RequirementIdNotUnique.Matcher getRequirementIdNotUnique(final ViatraQueryEngine engine) {
    return RequirementIdNotUnique.Matcher.on(engine);
  }
  
  public PropertySpecificTypeNotOwnedByBlock getPropertySpecificTypeNotOwnedByBlock() {
    return PropertySpecificTypeNotOwnedByBlock.instance();
  }
  
  public PropertySpecificTypeNotOwnedByBlock.Matcher getPropertySpecificTypeNotOwnedByBlock(final ViatraQueryEngine engine) {
    return PropertySpecificTypeNotOwnedByBlock.Matcher.on(engine);
  }
  
  public ValuePropertyNotValueType getValuePropertyNotValueType() {
    return ValuePropertyNotValueType.instance();
  }
  
  public ValuePropertyNotValueType.Matcher getValuePropertyNotValueType(final ViatraQueryEngine engine) {
    return ValuePropertyNotValueType.Matcher.on(engine);
  }
  
  public FlowPortOwnerNotBlock getFlowPortOwnerNotBlock() {
    return FlowPortOwnerNotBlock.instance();
  }
  
  public FlowPortOwnerNotBlock.Matcher getFlowPortOwnerNotBlock(final ViatraQueryEngine engine) {
    return FlowPortOwnerNotBlock.Matcher.on(engine);
  }
  
  public FlowSpecificationInvalidApplication getFlowSpecificationInvalidApplication() {
    return FlowSpecificationInvalidApplication.instance();
  }
  
  public FlowSpecificationInvalidApplication.Matcher getFlowSpecificationInvalidApplication(final ViatraQueryEngine engine) {
    return FlowSpecificationInvalidApplication.Matcher.on(engine);
  }
  
  public FlowPortDeprecated getFlowPortDeprecated() {
    return FlowPortDeprecated.instance();
  }
  
  public FlowPortDeprecated.Matcher getFlowPortDeprecated(final ViatraQueryEngine engine) {
    return FlowPortDeprecated.Matcher.on(engine);
  }
  
  public FlowSpecificationDeprecated getFlowSpecificationDeprecated() {
    return FlowSpecificationDeprecated.instance();
  }
  
  public FlowSpecificationDeprecated.Matcher getFlowSpecificationDeprecated(final ViatraQueryEngine engine) {
    return FlowSpecificationDeprecated.Matcher.on(engine);
  }
  
  public InterfaceBlockInvalidInheritance getInterfaceBlockInvalidInheritance() {
    return InterfaceBlockInvalidInheritance.instance();
  }
  
  public InterfaceBlockInvalidInheritance.Matcher getInterfaceBlockInvalidInheritance(final ViatraQueryEngine engine) {
    return InterfaceBlockInvalidInheritance.Matcher.on(engine);
  }
  
  public PartPropertyInvalidType getPartPropertyInvalidType() {
    return PartPropertyInvalidType.instance();
  }
  
  public PartPropertyInvalidType.Matcher getPartPropertyInvalidType(final ViatraQueryEngine engine) {
    return PartPropertyInvalidType.Matcher.on(engine);
  }
  
  public ReferencePropertyInvalidType getReferencePropertyInvalidType() {
    return ReferencePropertyInvalidType.instance();
  }
  
  public ReferencePropertyInvalidType.Matcher getReferencePropertyInvalidType(final ViatraQueryEngine engine) {
    return ReferencePropertyInvalidType.Matcher.on(engine);
  }
  
  public SharedPropertyInvalidType getSharedPropertyInvalidType() {
    return SharedPropertyInvalidType.instance();
  }
  
  public SharedPropertyInvalidType.Matcher getSharedPropertyInvalidType(final ViatraQueryEngine engine) {
    return SharedPropertyInvalidType.Matcher.on(engine);
  }
  
  public ActivityStreamingNoNStreaming getActivityStreamingNoNStreaming() {
    return ActivityStreamingNoNStreaming.instance();
  }
  
  public ActivityStreamingNoNStreaming.Matcher getActivityStreamingNoNStreaming(final ViatraQueryEngine engine) {
    return ActivityStreamingNoNStreaming.Matcher.on(engine);
  }
}
