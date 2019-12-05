/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.ActivityPartOfProject_client;
import com.incquerylabs.magicdraw.benchmark.queries.ActivityPartOfProject_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualLocation_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualMeasurement_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationPart_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationPart_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationRelationship_conveyed;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationRelationship_realization;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationRelationship_source;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationRelationship_target;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_slot;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPerson_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPost_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestone_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestone_slot;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProject_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPropertySet_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPropertySet_slot;
import com.incquerylabs.magicdraw.benchmark.queries.Allias_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ArbitraryConnector_client;
import com.incquerylabs.magicdraw.benchmark.queries.ArbitraryConnector_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ArchitecturalReference_client;
import com.incquerylabs.magicdraw.benchmark.queries.ArchitecturalReference_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ArchitectureMetadata_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityConfigurationNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityProperty_type;
import com.incquerylabs.magicdraw.benchmark.queries.Capability_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.ClimateNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.Command_conveyed;
import com.incquerylabs.magicdraw.benchmark.queries.Command_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.Command_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.CommandsNotItemFlow;
import com.incquerylabs.magicdraw.benchmark.queries.ConceptRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ConditionNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.ConditionProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.Condition_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.Contract_conveyed;
import com.incquerylabs.magicdraw.benchmark.queries.ControlNotItemFlow;
import com.incquerylabs.magicdraw.benchmark.queries.Control_conveyed;
import com.incquerylabs.magicdraw.benchmark.queries.Control_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.Control_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.DataModel_ownedElement;
import com.incquerylabs.magicdraw.benchmark.queries.Definition_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.DesiredEffect_client;
import com.incquerylabs.magicdraw.benchmark.queries.DesiredEffect_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Details_client;
import com.incquerylabs.magicdraw.benchmark.queries.Details_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.EnergyNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.EnterpriseGoalNotRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.EntityAttribute_canBeAppliedTo;
import com.incquerylabs.magicdraw.benchmark.queries.EntityItemNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.EntityItem_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.EntityRelationship_endType;
import com.incquerylabs.magicdraw.benchmark.queries.EnvironmentNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.Environment_ownedAttributes;
import com.incquerylabs.magicdraw.benchmark.queries.EnvironmentalProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.EnvironmentalProperty_type;
import com.incquerylabs.magicdraw.benchmark.queries.ExchangeElementNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.Exhibits_client;
import com.incquerylabs.magicdraw.benchmark.queries.Exhibits_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Expose_client;
import com.incquerylabs.magicdraw.benchmark.queries.Expose_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ExternalTypeNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.FieldedCapability_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.FillsPost_client;
import com.incquerylabs.magicdraw.benchmark.queries.FillsPost_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Forecast_client;
import com.incquerylabs.magicdraw.benchmark.queries.Forecast_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionEdge_owner;
import com.incquerylabs.magicdraw.benchmark.queries.Function_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.GeoPoliticalExtentTypeNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.GeoPoliticalExtent_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.HighLevelOperationalConceptNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.HighLevelOperationalConcept_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Information_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_client;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.KnownResrouce_type;
import com.incquerylabs.magicdraw.benchmark.queries.LightConditionNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.LocationTypeNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.LogicalArchitectureNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.MapsToCapability_client;
import com.incquerylabs.magicdraw.benchmark.queries.MapsToCapability_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.MaterielNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.MeasureTypeNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.MeasurementSetNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.MeasurementSet_ownedAttributes;
import com.incquerylabs.magicdraw.benchmark.queries.MilestoneSequence_client;
import com.incquerylabs.magicdraw.benchmark.queries.MilestoneSequence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Needline_end;
import com.incquerylabs.magicdraw.benchmark.queries.NodeNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.NodeOperation_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.NodePortNotFlowPort;
import com.incquerylabs.magicdraw.benchmark.queries.NodePort_type;
import com.incquerylabs.magicdraw.benchmark.queries.NodeRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.NodeRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.Node_isCapableOfPerforming;
import com.incquerylabs.magicdraw.benchmark.queries.Node_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.Node_ownedPort;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivityAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivityAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivityEdge_owner;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivity_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalConstraint_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalEventTrace_message;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalEventTrace_owner;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchangeNotItemFlow;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realization;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realizingActivityEdge;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realizingConnector;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realizingMessage;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalParameter_type;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalStateDescription_owner;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalStateDescription_region_state;
import com.incquerylabs.magicdraw.benchmark.queries.OrganizationNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.OrganizationTypeNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.OrganizationalProjectRelationship_client;
import com.incquerylabs.magicdraw.benchmark.queries.OrganizationalProjectRelationship_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Overlap_client;
import com.incquerylabs.magicdraw.benchmark.queries.Overlap_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsProcess_client;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsProcess_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Participant_ownedPort;
import com.incquerylabs.magicdraw.benchmark.queries.PerformerNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.PersonTypeNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.PhysicalArchitectureNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.PostNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ProblemDomain_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProblemDomain_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjecTheme_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectMilestoneRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectMilestoneRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectMilestone_ownedAttributes;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectSequence_client;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectSequence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectStatus_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.Project_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.PropertySet_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.PropertyValue_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.PropertyValue_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ProtocolLayer_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProtocolLayer_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProvidesCompetence_client;
import com.incquerylabs.magicdraw.benchmark.queries.ProvidesCompetence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.RequiresCompetence_client;
import com.incquerylabs.magicdraw.benchmark.queries.RequiresCompetence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ResouceRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceArtifactNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceConnector_end;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceConstraint_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceEventTrace_message;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceEventTrace_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteractionNotItemFlow;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_conveyedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_realization;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_realizingActivityEdge;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_realizingConnector;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInterface_end;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceOperation_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceParameter_type;
import com.incquerylabs.magicdraw.benchmark.queries.ResourcePortNotFlowPort;
import com.incquerylabs.magicdraw.benchmark.queries.ResourcePort_type;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceStateMachine_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceStateMachine_region_state;
import com.incquerylabs.magicdraw.benchmark.queries.Resource_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.Resource_ownedPort;
import com.incquerylabs.magicdraw.benchmark.queries.Resource_performs;
import com.incquerylabs.magicdraw.benchmark.queries.ResponsibilityNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.RoleTypeNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.SameAs_client;
import com.incquerylabs.magicdraw.benchmark.queries.SameAs_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityAttributesGroupNotValueType;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityDomainNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.Semantic_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceAccessNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFeature_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFeature_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunctionAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunctionAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunctionEdge_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunction_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceInteraction_message;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceInteraction_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceInterface_feature;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceInterface_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceLevelValueSet_slot;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceMessageHandler_signal;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceOperation_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceParameter_type;
import com.incquerylabs.magicdraw.benchmark.queries.ServicePolicy_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ServicePort_actualPropertySets;
import com.incquerylabs.magicdraw.benchmark.queries.ServicePort_type;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceStateMachine_owner;
import com.incquerylabs.magicdraw.benchmark.queries.SoftwareNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.StandardConfiguration_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.StereotypeExtension_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.StructuralPart_class;
import com.incquerylabs.magicdraw.benchmark.queries.StructuralPart_type;
import com.incquerylabs.magicdraw.benchmark.queries.SubjectOfOperationalStateMachine_ownedBehavior;
import com.incquerylabs.magicdraw.benchmark.queries.SystemNotBlock;
import com.incquerylabs.magicdraw.benchmark.queries.TemporalPart_class;
import com.incquerylabs.magicdraw.benchmark.queries.TemporalPart_type;
import com.incquerylabs.magicdraw.benchmark.queries.Transactional_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.Trustline_client;
import com.incquerylabs.magicdraw.benchmark.queries.Trustline_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.VersionOfConfiguration_class;
import com.incquerylabs.magicdraw.benchmark.queries.VersionOfConfiguration_type;
import com.incquerylabs.magicdraw.benchmark.queries.Wrapper_ownedAttribute;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in APerformanceQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file APerformanceQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.queries, the group contains the definition of the following patterns: <ul>
 * <li>softwareNotBlock</li>
 * <li>operationalExchangeNotItemFlow</li>
 * <li>nodePortNotFlowPort</li>
 * <li>lightConditionNotValueType</li>
 * <li>resourceInteractionNotItemFlow</li>
 * <li>highLevelOperationalConceptNotBlock</li>
 * <li>locationTypeNotValueType</li>
 * <li>resourcePortNotFlowPort</li>
 * <li>controlNotItemFlow</li>
 * <li>entityItemNotBlock</li>
 * <li>climateNotValueType</li>
 * <li>commandsNotItemFlow</li>
 * <li>capabilityConfigurationNotBlock</li>
 * <li>enterpriseGoalNotRequirement</li>
 * <li>nodeNotBlock</li>
 * <li>systemNotBlock</li>
 * <li>energyNotBlock</li>
 * <li>resourceArtifactNotBlock</li>
 * <li>environmentNotBlock</li>
 * <li>externalTypeNotBlock</li>
 * <li>capabilityNotBlock</li>
 * <li>measurementSetNotValueType</li>
 * <li>conditionNotValueType</li>
 * <li>exchangeElementNotBlock</li>
 * <li>geoPoliticalExtentTypeNotValueType</li>
 * <li>securityAttributesGroupNotValueType</li>
 * <li>logicalArchitectureNotBlock</li>
 * <li>materielNotBlock</li>
 * <li>measureTypeNotValueType</li>
 * <li>organizationNotBlock</li>
 * <li>organizationTypeNotBlock</li>
 * <li>performerNotBlock</li>
 * <li>personTypeNotBlock</li>
 * <li>physicalArchitectureNotBlock</li>
 * <li>postNotBlock</li>
 * <li>securityDomainNotBlock</li>
 * <li>serviceAccessNotBlock</li>
 * <li>responsibilityNotBlock</li>
 * <li>roleTypeNotBlock</li>
 * <li>ActualOrganization_classifier</li>
 * <li>ActualOrganization_slot</li>
 * <li>ActualPost_classifier</li>
 * <li>actualOrganizationRelationship_source</li>
 * <li>ActualOrganizationRelationship_realization</li>
 * <li>actualOrganizationRelationship_target</li>
 * <li>ActualOrganizationRelationship_conveyed</li>
 * <li>ActualPerson_classifier</li>
 * <li>ActualOrganizationPart_owningInstance</li>
 * <li>ActualOrganizationPart_definingFeature</li>
 * <li>FillsPost_client</li>
 * <li>FillsPost_supplier</li>
 * <li>ProvidesCompetence_client</li>
 * <li>ProvidesCompetence_supplier</li>
 * <li>RequiresCompetence_client</li>
 * <li>RequiresCompetence_supplier</li>
 * <li>ArbitraryConnector_client</li>
 * <li>ArbitraryConnector_supplier</li>
 * <li>NodeRole_type</li>
 * <li>nodeRole_class</li>
 * <li>HighLevelOperationalConcept_ownedAttribute</li>
 * <li>ConceptRole_type</li>
 * <li>needline_end</li>
 * <li>OperationalConstraint_constrainedElement</li>
 * <li>NodePort_type</li>
 * <li>KnownResrouce_type</li>
 * <li>node_isCapableOfPerforming</li>
 * <li>node_ownedPort</li>
 * <li>Node_ownedOperation</li>
 * <li>NodeOperation_ownedParameter</li>
 * <li>OperationalParameter_type</li>
 * <li>OperationalActivityAction_behavior</li>
 * <li>OperationalActivityAction_activity</li>
 * <li>OperationalActivity_ownedParameter</li>
 * <li>OperationalStateDescription_owner</li>
 * <li>OperationalStateDescription_region_state</li>
 * <li>OperationalActivityEdge_owner</li>
 * <li>SubjectOfOperationalStateMachine_ownedBehavior</li>
 * <li>OperationalEventTrace_owner</li>
 * <li>OperationalEventTrace_message</li>
 * <li>Command_informationSource</li>
 * <li>Command_informationTarget</li>
 * <li>Command_conveyed</li>
 * <li>OperationalExchange_realization</li>
 * <li>OperationalExchange_realizingConnector</li>
 * <li>OperationalExchange_realizingActivityEdge</li>
 * <li>OperationalExchange_informationSource</li>
 * <li>OperationalExchange_informationTarget</li>
 * <li>OperationalExchange_realizingMessage</li>
 * <li>ResourcePort_type</li>
 * <li>ResourceRole_class</li>
 * <li>ResouceRole_type</li>
 * <li>ResourceInterface_end</li>
 * <li>FieldedCapability_classifier</li>
 * <li>Forecast_supplier</li>
 * <li>Forecast_client</li>
 * <li>ResourceConnector_end</li>
 * <li>ResourceConstraint_constrainedElement</li>
 * <li>Resource_ownedOperation</li>
 * <li>Resource_performs</li>
 * <li>Resource_ownedPort</li>
 * <li>VersionOfConfiguration_class</li>
 * <li>VersionOfConfiguration_type</li>
 * <li>ResourceInteraction_conveyedElement</li>
 * <li>ResourceInteraction_realizingActivityEdge</li>
 * <li>ResourceInteraction_realizingConnector</li>
 * <li>ResourceInteraction_informationSource</li>
 * <li>ResourceInteraction_informationTarget</li>
 * <li>ResourceInteraction_realization</li>
 * <li>ResourceStateMachine_owner</li>
 * <li>ResourceStateMachine_region_state</li>
 * <li>ResourceParameter_type</li>
 * <li>FunctionEdge_owner</li>
 * <li>Function_ownedParameter</li>
 * <li>ResourceEventTrace_owner</li>
 * <li>ResourceEventTrace_message</li>
 * <li>ResourceOperation_ownedParameter</li>
 * <li>FunctionAction_activity</li>
 * <li>FunctionAction_behavior</li>
 * <li>DataModel_ownedElement</li>
 * <li>PropertySet_ownedAttribute</li>
 * <li>ActualPropertySet_classifier</li>
 * <li>ActualPropertySet_slot</li>
 * <li>MeasurementSet_ownedAttributes</li>
 * <li>PropertyValue_definingFeature</li>
 * <li>PropertyValue_owningInstance</li>
 * <li>ActualMeasurement_definingFeature</li>
 * <li>ActualLocation_classifier</li>
 * <li>Environment_ownedAttributes</li>
 * <li>EnvironmentalProperty_class</li>
 * <li>EnvironmentalProperty_type</li>
 * <li>ArchitecturalReference_client</li>
 * <li>ArchitecturalReference_supplier</li>
 * <li>ArchitectureMetadata_annotatedElement</li>
 * <li>Participant_ownedPort</li>
 * <li>IsCapableOfPerforming_client</li>
 * <li>IsCapableOfPerforming_supplier</li>
 * <li>Implements_client</li>
 * <li>Implements_supplier</li>
 * <li>StandardConfiguration_annotatedElement</li>
 * <li>Details_supplier</li>
 * <li>Details_client</li>
 * <li>EntityRelationship_endType</li>
 * <li>EntityAttribute_canBeAppliedTo</li>
 * <li>EntityItem_ownedAttribute</li>
 * <li>ServiceInterface_feature</li>
 * <li>ServiceInterface_ownedAttribute</li>
 * <li>ServicePort_type</li>
 * <li>ServicePort_actualPropertySets</li>
 * <li>ServiceLevelValueSet_slot</li>
 * <li>ServicePolicy_constrainedElement</li>
 * <li>ServiceMessageHandler_signal</li>
 * <li>ServiceOperation_ownedParameter</li>
 * <li>ServiceFeature_ownedParameter</li>
 * <li>ServiceFeature_owner</li>
 * <li>ServiceInteraction_owner</li>
 * <li>ServiceInteraction_message</li>
 * <li>ServiceFunctionEdge_owner</li>
 * <li>ServiceFunction_ownedParameter</li>
 * <li>ServiceStateMachine_owner</li>
 * <li>ServiceParameter_type</li>
 * <li>ServiceFunctionAction_behavior</li>
 * <li>ServiceFunctionAction_activity</li>
 * <li>Expose_client</li>
 * <li>Expose_supplier</li>
 * <li>MapsToCapability_client</li>
 * <li>MapsToCapability_supplier</li>
 * <li>TemporalPart_type</li>
 * <li>TemporalPart_class</li>
 * <li>Exhibits_client</li>
 * <li>Exhibits_supplier</li>
 * <li>CapabilityProperty_type</li>
 * <li>StructuralPart_class</li>
 * <li>StructuralPart_type</li>
 * <li>Capability_ownedAttribute</li>
 * <li>ActualProject_classifier</li>
 * <li>ActualProjectMilestoneRole_definingFeature</li>
 * <li>ActualProjectMilestoneRole_owningInstance</li>
 * <li>ProjectMilestoneRole_class</li>
 * <li>ProjectMilestoneRole_type</li>
 * <li>Project_ownedAttribute</li>
 * <li>OrganizationalProjectRelationship_client</li>
 * <li>OrganizationalProjectRelationship_supplier</li>
 * <li>Information_annotatedElement</li>
 * <li>ConditionProperty_class</li>
 * <li>Condition_ownedAttribute</li>
 * <li>GeoPoliticalExtent_classifier</li>
 * <li>ActivityPartOfProject_supplier</li>
 * <li>ActivityPartOfProject_client</li>
 * <li>DesiredEffect_client</li>
 * <li>DesiredEffect_supplier</li>
 * <li>Trustline_client</li>
 * <li>Trustline_supplier</li>
 * <li>ProblemDomain_class</li>
 * <li>ProblemDomain_type</li>
 * <li>OwnsProcess_supplier</li>
 * <li>OwnsProcess_client</li>
 * <li>Control_conveyed</li>
 * <li>Control_informationTarget</li>
 * <li>Control_informationSource</li>
 * <li>ProjectSequence_client</li>
 * <li>ProjectSequence_supplier</li>
 * <li>ActualProjectMilestone_classifier</li>
 * <li>ActualProjectMilestone_slot</li>
 * <li>MilestoneSequence_client</li>
 * <li>MilestoneSequence_supplier</li>
 * <li>ProjectMilestone_ownedAttributes</li>
 * <li>ProjectStatus_definingFeature</li>
 * <li>ProjecTheme_type</li>
 * <li>ProtocolLayer_class</li>
 * <li>ProtocolLayer_type</li>
 * <li>SameAs_client</li>
 * <li>SameAs_supplier</li>
 * <li>Definition_annotatedElement</li>
 * <li>Allias_annotatedElement</li>
 * <li>StereotypeExtension_annotatedElement</li>
 * <li>Overlap_client</li>
 * <li>Overlap_supplier</li>
 * <li>Transactional_ownedAttribute</li>
 * <li>Wrapper_ownedAttribute</li>
 * <li>Semantic_ownedAttribute</li>
 * <li>Contract_conveyed</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class APerformanceQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static APerformanceQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new APerformanceQueries();
    }
    return INSTANCE;
  }
  
  private static APerformanceQueries INSTANCE;
  
  private APerformanceQueries() {
    querySpecifications.add(SoftwareNotBlock.instance());
    querySpecifications.add(OperationalExchangeNotItemFlow.instance());
    querySpecifications.add(NodePortNotFlowPort.instance());
    querySpecifications.add(LightConditionNotValueType.instance());
    querySpecifications.add(ResourceInteractionNotItemFlow.instance());
    querySpecifications.add(HighLevelOperationalConceptNotBlock.instance());
    querySpecifications.add(LocationTypeNotValueType.instance());
    querySpecifications.add(ResourcePortNotFlowPort.instance());
    querySpecifications.add(ControlNotItemFlow.instance());
    querySpecifications.add(EntityItemNotBlock.instance());
    querySpecifications.add(ClimateNotValueType.instance());
    querySpecifications.add(CommandsNotItemFlow.instance());
    querySpecifications.add(CapabilityConfigurationNotBlock.instance());
    querySpecifications.add(EnterpriseGoalNotRequirement.instance());
    querySpecifications.add(NodeNotBlock.instance());
    querySpecifications.add(SystemNotBlock.instance());
    querySpecifications.add(EnergyNotBlock.instance());
    querySpecifications.add(ResourceArtifactNotBlock.instance());
    querySpecifications.add(EnvironmentNotBlock.instance());
    querySpecifications.add(ExternalTypeNotBlock.instance());
    querySpecifications.add(CapabilityNotBlock.instance());
    querySpecifications.add(MeasurementSetNotValueType.instance());
    querySpecifications.add(ConditionNotValueType.instance());
    querySpecifications.add(ExchangeElementNotBlock.instance());
    querySpecifications.add(GeoPoliticalExtentTypeNotValueType.instance());
    querySpecifications.add(SecurityAttributesGroupNotValueType.instance());
    querySpecifications.add(LogicalArchitectureNotBlock.instance());
    querySpecifications.add(MaterielNotBlock.instance());
    querySpecifications.add(MeasureTypeNotValueType.instance());
    querySpecifications.add(OrganizationNotBlock.instance());
    querySpecifications.add(OrganizationTypeNotBlock.instance());
    querySpecifications.add(PerformerNotBlock.instance());
    querySpecifications.add(PersonTypeNotBlock.instance());
    querySpecifications.add(PhysicalArchitectureNotBlock.instance());
    querySpecifications.add(PostNotBlock.instance());
    querySpecifications.add(SecurityDomainNotBlock.instance());
    querySpecifications.add(ServiceAccessNotBlock.instance());
    querySpecifications.add(ResponsibilityNotBlock.instance());
    querySpecifications.add(RoleTypeNotBlock.instance());
    querySpecifications.add(ActualOrganization_classifier.instance());
    querySpecifications.add(ActualOrganization_slot.instance());
    querySpecifications.add(ActualPost_classifier.instance());
    querySpecifications.add(ActualOrganizationRelationship_source.instance());
    querySpecifications.add(ActualOrganizationRelationship_realization.instance());
    querySpecifications.add(ActualOrganizationRelationship_target.instance());
    querySpecifications.add(ActualOrganizationRelationship_conveyed.instance());
    querySpecifications.add(ActualPerson_classifier.instance());
    querySpecifications.add(ActualOrganizationPart_owningInstance.instance());
    querySpecifications.add(ActualOrganizationPart_definingFeature.instance());
    querySpecifications.add(FillsPost_client.instance());
    querySpecifications.add(FillsPost_supplier.instance());
    querySpecifications.add(ProvidesCompetence_client.instance());
    querySpecifications.add(ProvidesCompetence_supplier.instance());
    querySpecifications.add(RequiresCompetence_client.instance());
    querySpecifications.add(RequiresCompetence_supplier.instance());
    querySpecifications.add(ArbitraryConnector_client.instance());
    querySpecifications.add(ArbitraryConnector_supplier.instance());
    querySpecifications.add(NodeRole_type.instance());
    querySpecifications.add(NodeRole_class.instance());
    querySpecifications.add(HighLevelOperationalConcept_ownedAttribute.instance());
    querySpecifications.add(ConceptRole_type.instance());
    querySpecifications.add(Needline_end.instance());
    querySpecifications.add(OperationalConstraint_constrainedElement.instance());
    querySpecifications.add(NodePort_type.instance());
    querySpecifications.add(KnownResrouce_type.instance());
    querySpecifications.add(Node_isCapableOfPerforming.instance());
    querySpecifications.add(Node_ownedPort.instance());
    querySpecifications.add(Node_ownedOperation.instance());
    querySpecifications.add(NodeOperation_ownedParameter.instance());
    querySpecifications.add(OperationalParameter_type.instance());
    querySpecifications.add(OperationalActivityAction_behavior.instance());
    querySpecifications.add(OperationalActivityAction_activity.instance());
    querySpecifications.add(OperationalActivity_ownedParameter.instance());
    querySpecifications.add(OperationalStateDescription_owner.instance());
    querySpecifications.add(OperationalStateDescription_region_state.instance());
    querySpecifications.add(OperationalActivityEdge_owner.instance());
    querySpecifications.add(SubjectOfOperationalStateMachine_ownedBehavior.instance());
    querySpecifications.add(OperationalEventTrace_owner.instance());
    querySpecifications.add(OperationalEventTrace_message.instance());
    querySpecifications.add(Command_informationSource.instance());
    querySpecifications.add(Command_informationTarget.instance());
    querySpecifications.add(Command_conveyed.instance());
    querySpecifications.add(OperationalExchange_realization.instance());
    querySpecifications.add(OperationalExchange_realizingConnector.instance());
    querySpecifications.add(OperationalExchange_realizingActivityEdge.instance());
    querySpecifications.add(OperationalExchange_informationSource.instance());
    querySpecifications.add(OperationalExchange_informationTarget.instance());
    querySpecifications.add(OperationalExchange_realizingMessage.instance());
    querySpecifications.add(ResourcePort_type.instance());
    querySpecifications.add(ResourceRole_class.instance());
    querySpecifications.add(ResouceRole_type.instance());
    querySpecifications.add(ResourceInterface_end.instance());
    querySpecifications.add(FieldedCapability_classifier.instance());
    querySpecifications.add(Forecast_supplier.instance());
    querySpecifications.add(Forecast_client.instance());
    querySpecifications.add(ResourceConnector_end.instance());
    querySpecifications.add(ResourceConstraint_constrainedElement.instance());
    querySpecifications.add(Resource_ownedOperation.instance());
    querySpecifications.add(Resource_performs.instance());
    querySpecifications.add(Resource_ownedPort.instance());
    querySpecifications.add(VersionOfConfiguration_class.instance());
    querySpecifications.add(VersionOfConfiguration_type.instance());
    querySpecifications.add(ResourceInteraction_conveyedElement.instance());
    querySpecifications.add(ResourceInteraction_realizingActivityEdge.instance());
    querySpecifications.add(ResourceInteraction_realizingConnector.instance());
    querySpecifications.add(ResourceInteraction_informationSource.instance());
    querySpecifications.add(ResourceInteraction_informationTarget.instance());
    querySpecifications.add(ResourceInteraction_realization.instance());
    querySpecifications.add(ResourceStateMachine_owner.instance());
    querySpecifications.add(ResourceStateMachine_region_state.instance());
    querySpecifications.add(ResourceParameter_type.instance());
    querySpecifications.add(FunctionEdge_owner.instance());
    querySpecifications.add(Function_ownedParameter.instance());
    querySpecifications.add(ResourceEventTrace_owner.instance());
    querySpecifications.add(ResourceEventTrace_message.instance());
    querySpecifications.add(ResourceOperation_ownedParameter.instance());
    querySpecifications.add(FunctionAction_activity.instance());
    querySpecifications.add(FunctionAction_behavior.instance());
    querySpecifications.add(DataModel_ownedElement.instance());
    querySpecifications.add(PropertySet_ownedAttribute.instance());
    querySpecifications.add(ActualPropertySet_classifier.instance());
    querySpecifications.add(ActualPropertySet_slot.instance());
    querySpecifications.add(MeasurementSet_ownedAttributes.instance());
    querySpecifications.add(PropertyValue_definingFeature.instance());
    querySpecifications.add(PropertyValue_owningInstance.instance());
    querySpecifications.add(ActualMeasurement_definingFeature.instance());
    querySpecifications.add(ActualLocation_classifier.instance());
    querySpecifications.add(Environment_ownedAttributes.instance());
    querySpecifications.add(EnvironmentalProperty_class.instance());
    querySpecifications.add(EnvironmentalProperty_type.instance());
    querySpecifications.add(ArchitecturalReference_client.instance());
    querySpecifications.add(ArchitecturalReference_supplier.instance());
    querySpecifications.add(ArchitectureMetadata_annotatedElement.instance());
    querySpecifications.add(Participant_ownedPort.instance());
    querySpecifications.add(IsCapableOfPerforming_client.instance());
    querySpecifications.add(IsCapableOfPerforming_supplier.instance());
    querySpecifications.add(Implements_client.instance());
    querySpecifications.add(Implements_supplier.instance());
    querySpecifications.add(StandardConfiguration_annotatedElement.instance());
    querySpecifications.add(Details_supplier.instance());
    querySpecifications.add(Details_client.instance());
    querySpecifications.add(EntityRelationship_endType.instance());
    querySpecifications.add(EntityAttribute_canBeAppliedTo.instance());
    querySpecifications.add(EntityItem_ownedAttribute.instance());
    querySpecifications.add(ServiceInterface_feature.instance());
    querySpecifications.add(ServiceInterface_ownedAttribute.instance());
    querySpecifications.add(ServicePort_type.instance());
    querySpecifications.add(ServicePort_actualPropertySets.instance());
    querySpecifications.add(ServiceLevelValueSet_slot.instance());
    querySpecifications.add(ServicePolicy_constrainedElement.instance());
    querySpecifications.add(ServiceMessageHandler_signal.instance());
    querySpecifications.add(ServiceOperation_ownedParameter.instance());
    querySpecifications.add(ServiceFeature_ownedParameter.instance());
    querySpecifications.add(ServiceFeature_owner.instance());
    querySpecifications.add(ServiceInteraction_owner.instance());
    querySpecifications.add(ServiceInteraction_message.instance());
    querySpecifications.add(ServiceFunctionEdge_owner.instance());
    querySpecifications.add(ServiceFunction_ownedParameter.instance());
    querySpecifications.add(ServiceStateMachine_owner.instance());
    querySpecifications.add(ServiceParameter_type.instance());
    querySpecifications.add(ServiceFunctionAction_behavior.instance());
    querySpecifications.add(ServiceFunctionAction_activity.instance());
    querySpecifications.add(Expose_client.instance());
    querySpecifications.add(Expose_supplier.instance());
    querySpecifications.add(MapsToCapability_client.instance());
    querySpecifications.add(MapsToCapability_supplier.instance());
    querySpecifications.add(TemporalPart_type.instance());
    querySpecifications.add(TemporalPart_class.instance());
    querySpecifications.add(Exhibits_client.instance());
    querySpecifications.add(Exhibits_supplier.instance());
    querySpecifications.add(CapabilityProperty_type.instance());
    querySpecifications.add(StructuralPart_class.instance());
    querySpecifications.add(StructuralPart_type.instance());
    querySpecifications.add(Capability_ownedAttribute.instance());
    querySpecifications.add(ActualProject_classifier.instance());
    querySpecifications.add(ActualProjectMilestoneRole_definingFeature.instance());
    querySpecifications.add(ActualProjectMilestoneRole_owningInstance.instance());
    querySpecifications.add(ProjectMilestoneRole_class.instance());
    querySpecifications.add(ProjectMilestoneRole_type.instance());
    querySpecifications.add(Project_ownedAttribute.instance());
    querySpecifications.add(OrganizationalProjectRelationship_client.instance());
    querySpecifications.add(OrganizationalProjectRelationship_supplier.instance());
    querySpecifications.add(Information_annotatedElement.instance());
    querySpecifications.add(ConditionProperty_class.instance());
    querySpecifications.add(Condition_ownedAttribute.instance());
    querySpecifications.add(GeoPoliticalExtent_classifier.instance());
    querySpecifications.add(ActivityPartOfProject_supplier.instance());
    querySpecifications.add(ActivityPartOfProject_client.instance());
    querySpecifications.add(DesiredEffect_client.instance());
    querySpecifications.add(DesiredEffect_supplier.instance());
    querySpecifications.add(Trustline_client.instance());
    querySpecifications.add(Trustline_supplier.instance());
    querySpecifications.add(ProblemDomain_class.instance());
    querySpecifications.add(ProblemDomain_type.instance());
    querySpecifications.add(OwnsProcess_supplier.instance());
    querySpecifications.add(OwnsProcess_client.instance());
    querySpecifications.add(Control_conveyed.instance());
    querySpecifications.add(Control_informationTarget.instance());
    querySpecifications.add(Control_informationSource.instance());
    querySpecifications.add(ProjectSequence_client.instance());
    querySpecifications.add(ProjectSequence_supplier.instance());
    querySpecifications.add(ActualProjectMilestone_classifier.instance());
    querySpecifications.add(ActualProjectMilestone_slot.instance());
    querySpecifications.add(MilestoneSequence_client.instance());
    querySpecifications.add(MilestoneSequence_supplier.instance());
    querySpecifications.add(ProjectMilestone_ownedAttributes.instance());
    querySpecifications.add(ProjectStatus_definingFeature.instance());
    querySpecifications.add(ProjecTheme_type.instance());
    querySpecifications.add(ProtocolLayer_class.instance());
    querySpecifications.add(ProtocolLayer_type.instance());
    querySpecifications.add(SameAs_client.instance());
    querySpecifications.add(SameAs_supplier.instance());
    querySpecifications.add(Definition_annotatedElement.instance());
    querySpecifications.add(Allias_annotatedElement.instance());
    querySpecifications.add(StereotypeExtension_annotatedElement.instance());
    querySpecifications.add(Overlap_client.instance());
    querySpecifications.add(Overlap_supplier.instance());
    querySpecifications.add(Transactional_ownedAttribute.instance());
    querySpecifications.add(Wrapper_ownedAttribute.instance());
    querySpecifications.add(Semantic_ownedAttribute.instance());
    querySpecifications.add(Contract_conveyed.instance());
  }
  
  public SoftwareNotBlock getSoftwareNotBlock() {
    return SoftwareNotBlock.instance();
  }
  
  public SoftwareNotBlock.Matcher getSoftwareNotBlock(final ViatraQueryEngine engine) {
    return SoftwareNotBlock.Matcher.on(engine);
  }
  
  public OperationalExchangeNotItemFlow getOperationalExchangeNotItemFlow() {
    return OperationalExchangeNotItemFlow.instance();
  }
  
  public OperationalExchangeNotItemFlow.Matcher getOperationalExchangeNotItemFlow(final ViatraQueryEngine engine) {
    return OperationalExchangeNotItemFlow.Matcher.on(engine);
  }
  
  public NodePortNotFlowPort getNodePortNotFlowPort() {
    return NodePortNotFlowPort.instance();
  }
  
  public NodePortNotFlowPort.Matcher getNodePortNotFlowPort(final ViatraQueryEngine engine) {
    return NodePortNotFlowPort.Matcher.on(engine);
  }
  
  public LightConditionNotValueType getLightConditionNotValueType() {
    return LightConditionNotValueType.instance();
  }
  
  public LightConditionNotValueType.Matcher getLightConditionNotValueType(final ViatraQueryEngine engine) {
    return LightConditionNotValueType.Matcher.on(engine);
  }
  
  public ResourceInteractionNotItemFlow getResourceInteractionNotItemFlow() {
    return ResourceInteractionNotItemFlow.instance();
  }
  
  public ResourceInteractionNotItemFlow.Matcher getResourceInteractionNotItemFlow(final ViatraQueryEngine engine) {
    return ResourceInteractionNotItemFlow.Matcher.on(engine);
  }
  
  public HighLevelOperationalConceptNotBlock getHighLevelOperationalConceptNotBlock() {
    return HighLevelOperationalConceptNotBlock.instance();
  }
  
  public HighLevelOperationalConceptNotBlock.Matcher getHighLevelOperationalConceptNotBlock(final ViatraQueryEngine engine) {
    return HighLevelOperationalConceptNotBlock.Matcher.on(engine);
  }
  
  public LocationTypeNotValueType getLocationTypeNotValueType() {
    return LocationTypeNotValueType.instance();
  }
  
  public LocationTypeNotValueType.Matcher getLocationTypeNotValueType(final ViatraQueryEngine engine) {
    return LocationTypeNotValueType.Matcher.on(engine);
  }
  
  public ResourcePortNotFlowPort getResourcePortNotFlowPort() {
    return ResourcePortNotFlowPort.instance();
  }
  
  public ResourcePortNotFlowPort.Matcher getResourcePortNotFlowPort(final ViatraQueryEngine engine) {
    return ResourcePortNotFlowPort.Matcher.on(engine);
  }
  
  public ControlNotItemFlow getControlNotItemFlow() {
    return ControlNotItemFlow.instance();
  }
  
  public ControlNotItemFlow.Matcher getControlNotItemFlow(final ViatraQueryEngine engine) {
    return ControlNotItemFlow.Matcher.on(engine);
  }
  
  public EntityItemNotBlock getEntityItemNotBlock() {
    return EntityItemNotBlock.instance();
  }
  
  public EntityItemNotBlock.Matcher getEntityItemNotBlock(final ViatraQueryEngine engine) {
    return EntityItemNotBlock.Matcher.on(engine);
  }
  
  public ClimateNotValueType getClimateNotValueType() {
    return ClimateNotValueType.instance();
  }
  
  public ClimateNotValueType.Matcher getClimateNotValueType(final ViatraQueryEngine engine) {
    return ClimateNotValueType.Matcher.on(engine);
  }
  
  public CommandsNotItemFlow getCommandsNotItemFlow() {
    return CommandsNotItemFlow.instance();
  }
  
  public CommandsNotItemFlow.Matcher getCommandsNotItemFlow(final ViatraQueryEngine engine) {
    return CommandsNotItemFlow.Matcher.on(engine);
  }
  
  public CapabilityConfigurationNotBlock getCapabilityConfigurationNotBlock() {
    return CapabilityConfigurationNotBlock.instance();
  }
  
  public CapabilityConfigurationNotBlock.Matcher getCapabilityConfigurationNotBlock(final ViatraQueryEngine engine) {
    return CapabilityConfigurationNotBlock.Matcher.on(engine);
  }
  
  public EnterpriseGoalNotRequirement getEnterpriseGoalNotRequirement() {
    return EnterpriseGoalNotRequirement.instance();
  }
  
  public EnterpriseGoalNotRequirement.Matcher getEnterpriseGoalNotRequirement(final ViatraQueryEngine engine) {
    return EnterpriseGoalNotRequirement.Matcher.on(engine);
  }
  
  public NodeNotBlock getNodeNotBlock() {
    return NodeNotBlock.instance();
  }
  
  public NodeNotBlock.Matcher getNodeNotBlock(final ViatraQueryEngine engine) {
    return NodeNotBlock.Matcher.on(engine);
  }
  
  public SystemNotBlock getSystemNotBlock() {
    return SystemNotBlock.instance();
  }
  
  public SystemNotBlock.Matcher getSystemNotBlock(final ViatraQueryEngine engine) {
    return SystemNotBlock.Matcher.on(engine);
  }
  
  public EnergyNotBlock getEnergyNotBlock() {
    return EnergyNotBlock.instance();
  }
  
  public EnergyNotBlock.Matcher getEnergyNotBlock(final ViatraQueryEngine engine) {
    return EnergyNotBlock.Matcher.on(engine);
  }
  
  public ResourceArtifactNotBlock getResourceArtifactNotBlock() {
    return ResourceArtifactNotBlock.instance();
  }
  
  public ResourceArtifactNotBlock.Matcher getResourceArtifactNotBlock(final ViatraQueryEngine engine) {
    return ResourceArtifactNotBlock.Matcher.on(engine);
  }
  
  public EnvironmentNotBlock getEnvironmentNotBlock() {
    return EnvironmentNotBlock.instance();
  }
  
  public EnvironmentNotBlock.Matcher getEnvironmentNotBlock(final ViatraQueryEngine engine) {
    return EnvironmentNotBlock.Matcher.on(engine);
  }
  
  public ExternalTypeNotBlock getExternalTypeNotBlock() {
    return ExternalTypeNotBlock.instance();
  }
  
  public ExternalTypeNotBlock.Matcher getExternalTypeNotBlock(final ViatraQueryEngine engine) {
    return ExternalTypeNotBlock.Matcher.on(engine);
  }
  
  public CapabilityNotBlock getCapabilityNotBlock() {
    return CapabilityNotBlock.instance();
  }
  
  public CapabilityNotBlock.Matcher getCapabilityNotBlock(final ViatraQueryEngine engine) {
    return CapabilityNotBlock.Matcher.on(engine);
  }
  
  public MeasurementSetNotValueType getMeasurementSetNotValueType() {
    return MeasurementSetNotValueType.instance();
  }
  
  public MeasurementSetNotValueType.Matcher getMeasurementSetNotValueType(final ViatraQueryEngine engine) {
    return MeasurementSetNotValueType.Matcher.on(engine);
  }
  
  public ConditionNotValueType getConditionNotValueType() {
    return ConditionNotValueType.instance();
  }
  
  public ConditionNotValueType.Matcher getConditionNotValueType(final ViatraQueryEngine engine) {
    return ConditionNotValueType.Matcher.on(engine);
  }
  
  public ExchangeElementNotBlock getExchangeElementNotBlock() {
    return ExchangeElementNotBlock.instance();
  }
  
  public ExchangeElementNotBlock.Matcher getExchangeElementNotBlock(final ViatraQueryEngine engine) {
    return ExchangeElementNotBlock.Matcher.on(engine);
  }
  
  public GeoPoliticalExtentTypeNotValueType getGeoPoliticalExtentTypeNotValueType() {
    return GeoPoliticalExtentTypeNotValueType.instance();
  }
  
  public GeoPoliticalExtentTypeNotValueType.Matcher getGeoPoliticalExtentTypeNotValueType(final ViatraQueryEngine engine) {
    return GeoPoliticalExtentTypeNotValueType.Matcher.on(engine);
  }
  
  public SecurityAttributesGroupNotValueType getSecurityAttributesGroupNotValueType() {
    return SecurityAttributesGroupNotValueType.instance();
  }
  
  public SecurityAttributesGroupNotValueType.Matcher getSecurityAttributesGroupNotValueType(final ViatraQueryEngine engine) {
    return SecurityAttributesGroupNotValueType.Matcher.on(engine);
  }
  
  public LogicalArchitectureNotBlock getLogicalArchitectureNotBlock() {
    return LogicalArchitectureNotBlock.instance();
  }
  
  public LogicalArchitectureNotBlock.Matcher getLogicalArchitectureNotBlock(final ViatraQueryEngine engine) {
    return LogicalArchitectureNotBlock.Matcher.on(engine);
  }
  
  public MaterielNotBlock getMaterielNotBlock() {
    return MaterielNotBlock.instance();
  }
  
  public MaterielNotBlock.Matcher getMaterielNotBlock(final ViatraQueryEngine engine) {
    return MaterielNotBlock.Matcher.on(engine);
  }
  
  public MeasureTypeNotValueType getMeasureTypeNotValueType() {
    return MeasureTypeNotValueType.instance();
  }
  
  public MeasureTypeNotValueType.Matcher getMeasureTypeNotValueType(final ViatraQueryEngine engine) {
    return MeasureTypeNotValueType.Matcher.on(engine);
  }
  
  public OrganizationNotBlock getOrganizationNotBlock() {
    return OrganizationNotBlock.instance();
  }
  
  public OrganizationNotBlock.Matcher getOrganizationNotBlock(final ViatraQueryEngine engine) {
    return OrganizationNotBlock.Matcher.on(engine);
  }
  
  public OrganizationTypeNotBlock getOrganizationTypeNotBlock() {
    return OrganizationTypeNotBlock.instance();
  }
  
  public OrganizationTypeNotBlock.Matcher getOrganizationTypeNotBlock(final ViatraQueryEngine engine) {
    return OrganizationTypeNotBlock.Matcher.on(engine);
  }
  
  public PerformerNotBlock getPerformerNotBlock() {
    return PerformerNotBlock.instance();
  }
  
  public PerformerNotBlock.Matcher getPerformerNotBlock(final ViatraQueryEngine engine) {
    return PerformerNotBlock.Matcher.on(engine);
  }
  
  public PersonTypeNotBlock getPersonTypeNotBlock() {
    return PersonTypeNotBlock.instance();
  }
  
  public PersonTypeNotBlock.Matcher getPersonTypeNotBlock(final ViatraQueryEngine engine) {
    return PersonTypeNotBlock.Matcher.on(engine);
  }
  
  public PhysicalArchitectureNotBlock getPhysicalArchitectureNotBlock() {
    return PhysicalArchitectureNotBlock.instance();
  }
  
  public PhysicalArchitectureNotBlock.Matcher getPhysicalArchitectureNotBlock(final ViatraQueryEngine engine) {
    return PhysicalArchitectureNotBlock.Matcher.on(engine);
  }
  
  public PostNotBlock getPostNotBlock() {
    return PostNotBlock.instance();
  }
  
  public PostNotBlock.Matcher getPostNotBlock(final ViatraQueryEngine engine) {
    return PostNotBlock.Matcher.on(engine);
  }
  
  public SecurityDomainNotBlock getSecurityDomainNotBlock() {
    return SecurityDomainNotBlock.instance();
  }
  
  public SecurityDomainNotBlock.Matcher getSecurityDomainNotBlock(final ViatraQueryEngine engine) {
    return SecurityDomainNotBlock.Matcher.on(engine);
  }
  
  public ServiceAccessNotBlock getServiceAccessNotBlock() {
    return ServiceAccessNotBlock.instance();
  }
  
  public ServiceAccessNotBlock.Matcher getServiceAccessNotBlock(final ViatraQueryEngine engine) {
    return ServiceAccessNotBlock.Matcher.on(engine);
  }
  
  public ResponsibilityNotBlock getResponsibilityNotBlock() {
    return ResponsibilityNotBlock.instance();
  }
  
  public ResponsibilityNotBlock.Matcher getResponsibilityNotBlock(final ViatraQueryEngine engine) {
    return ResponsibilityNotBlock.Matcher.on(engine);
  }
  
  public RoleTypeNotBlock getRoleTypeNotBlock() {
    return RoleTypeNotBlock.instance();
  }
  
  public RoleTypeNotBlock.Matcher getRoleTypeNotBlock(final ViatraQueryEngine engine) {
    return RoleTypeNotBlock.Matcher.on(engine);
  }
  
  public ActualOrganization_classifier getActualOrganization_classifier() {
    return ActualOrganization_classifier.instance();
  }
  
  public ActualOrganization_classifier.Matcher getActualOrganization_classifier(final ViatraQueryEngine engine) {
    return ActualOrganization_classifier.Matcher.on(engine);
  }
  
  public ActualOrganization_slot getActualOrganization_slot() {
    return ActualOrganization_slot.instance();
  }
  
  public ActualOrganization_slot.Matcher getActualOrganization_slot(final ViatraQueryEngine engine) {
    return ActualOrganization_slot.Matcher.on(engine);
  }
  
  public ActualPost_classifier getActualPost_classifier() {
    return ActualPost_classifier.instance();
  }
  
  public ActualPost_classifier.Matcher getActualPost_classifier(final ViatraQueryEngine engine) {
    return ActualPost_classifier.Matcher.on(engine);
  }
  
  public ActualOrganizationRelationship_source getActualOrganizationRelationship_source() {
    return ActualOrganizationRelationship_source.instance();
  }
  
  public ActualOrganizationRelationship_source.Matcher getActualOrganizationRelationship_source(final ViatraQueryEngine engine) {
    return ActualOrganizationRelationship_source.Matcher.on(engine);
  }
  
  public ActualOrganizationRelationship_realization getActualOrganizationRelationship_realization() {
    return ActualOrganizationRelationship_realization.instance();
  }
  
  public ActualOrganizationRelationship_realization.Matcher getActualOrganizationRelationship_realization(final ViatraQueryEngine engine) {
    return ActualOrganizationRelationship_realization.Matcher.on(engine);
  }
  
  public ActualOrganizationRelationship_target getActualOrganizationRelationship_target() {
    return ActualOrganizationRelationship_target.instance();
  }
  
  public ActualOrganizationRelationship_target.Matcher getActualOrganizationRelationship_target(final ViatraQueryEngine engine) {
    return ActualOrganizationRelationship_target.Matcher.on(engine);
  }
  
  public ActualOrganizationRelationship_conveyed getActualOrganizationRelationship_conveyed() {
    return ActualOrganizationRelationship_conveyed.instance();
  }
  
  public ActualOrganizationRelationship_conveyed.Matcher getActualOrganizationRelationship_conveyed(final ViatraQueryEngine engine) {
    return ActualOrganizationRelationship_conveyed.Matcher.on(engine);
  }
  
  public ActualPerson_classifier getActualPerson_classifier() {
    return ActualPerson_classifier.instance();
  }
  
  public ActualPerson_classifier.Matcher getActualPerson_classifier(final ViatraQueryEngine engine) {
    return ActualPerson_classifier.Matcher.on(engine);
  }
  
  public ActualOrganizationPart_owningInstance getActualOrganizationPart_owningInstance() {
    return ActualOrganizationPart_owningInstance.instance();
  }
  
  public ActualOrganizationPart_owningInstance.Matcher getActualOrganizationPart_owningInstance(final ViatraQueryEngine engine) {
    return ActualOrganizationPart_owningInstance.Matcher.on(engine);
  }
  
  public ActualOrganizationPart_definingFeature getActualOrganizationPart_definingFeature() {
    return ActualOrganizationPart_definingFeature.instance();
  }
  
  public ActualOrganizationPart_definingFeature.Matcher getActualOrganizationPart_definingFeature(final ViatraQueryEngine engine) {
    return ActualOrganizationPart_definingFeature.Matcher.on(engine);
  }
  
  public FillsPost_client getFillsPost_client() {
    return FillsPost_client.instance();
  }
  
  public FillsPost_client.Matcher getFillsPost_client(final ViatraQueryEngine engine) {
    return FillsPost_client.Matcher.on(engine);
  }
  
  public FillsPost_supplier getFillsPost_supplier() {
    return FillsPost_supplier.instance();
  }
  
  public FillsPost_supplier.Matcher getFillsPost_supplier(final ViatraQueryEngine engine) {
    return FillsPost_supplier.Matcher.on(engine);
  }
  
  public ProvidesCompetence_client getProvidesCompetence_client() {
    return ProvidesCompetence_client.instance();
  }
  
  public ProvidesCompetence_client.Matcher getProvidesCompetence_client(final ViatraQueryEngine engine) {
    return ProvidesCompetence_client.Matcher.on(engine);
  }
  
  public ProvidesCompetence_supplier getProvidesCompetence_supplier() {
    return ProvidesCompetence_supplier.instance();
  }
  
  public ProvidesCompetence_supplier.Matcher getProvidesCompetence_supplier(final ViatraQueryEngine engine) {
    return ProvidesCompetence_supplier.Matcher.on(engine);
  }
  
  public RequiresCompetence_client getRequiresCompetence_client() {
    return RequiresCompetence_client.instance();
  }
  
  public RequiresCompetence_client.Matcher getRequiresCompetence_client(final ViatraQueryEngine engine) {
    return RequiresCompetence_client.Matcher.on(engine);
  }
  
  public RequiresCompetence_supplier getRequiresCompetence_supplier() {
    return RequiresCompetence_supplier.instance();
  }
  
  public RequiresCompetence_supplier.Matcher getRequiresCompetence_supplier(final ViatraQueryEngine engine) {
    return RequiresCompetence_supplier.Matcher.on(engine);
  }
  
  public ArbitraryConnector_client getArbitraryConnector_client() {
    return ArbitraryConnector_client.instance();
  }
  
  public ArbitraryConnector_client.Matcher getArbitraryConnector_client(final ViatraQueryEngine engine) {
    return ArbitraryConnector_client.Matcher.on(engine);
  }
  
  public ArbitraryConnector_supplier getArbitraryConnector_supplier() {
    return ArbitraryConnector_supplier.instance();
  }
  
  public ArbitraryConnector_supplier.Matcher getArbitraryConnector_supplier(final ViatraQueryEngine engine) {
    return ArbitraryConnector_supplier.Matcher.on(engine);
  }
  
  public NodeRole_type getNodeRole_type() {
    return NodeRole_type.instance();
  }
  
  public NodeRole_type.Matcher getNodeRole_type(final ViatraQueryEngine engine) {
    return NodeRole_type.Matcher.on(engine);
  }
  
  public NodeRole_class getNodeRole_class() {
    return NodeRole_class.instance();
  }
  
  public NodeRole_class.Matcher getNodeRole_class(final ViatraQueryEngine engine) {
    return NodeRole_class.Matcher.on(engine);
  }
  
  public HighLevelOperationalConcept_ownedAttribute getHighLevelOperationalConcept_ownedAttribute() {
    return HighLevelOperationalConcept_ownedAttribute.instance();
  }
  
  public HighLevelOperationalConcept_ownedAttribute.Matcher getHighLevelOperationalConcept_ownedAttribute(final ViatraQueryEngine engine) {
    return HighLevelOperationalConcept_ownedAttribute.Matcher.on(engine);
  }
  
  public ConceptRole_type getConceptRole_type() {
    return ConceptRole_type.instance();
  }
  
  public ConceptRole_type.Matcher getConceptRole_type(final ViatraQueryEngine engine) {
    return ConceptRole_type.Matcher.on(engine);
  }
  
  public Needline_end getNeedline_end() {
    return Needline_end.instance();
  }
  
  public Needline_end.Matcher getNeedline_end(final ViatraQueryEngine engine) {
    return Needline_end.Matcher.on(engine);
  }
  
  public OperationalConstraint_constrainedElement getOperationalConstraint_constrainedElement() {
    return OperationalConstraint_constrainedElement.instance();
  }
  
  public OperationalConstraint_constrainedElement.Matcher getOperationalConstraint_constrainedElement(final ViatraQueryEngine engine) {
    return OperationalConstraint_constrainedElement.Matcher.on(engine);
  }
  
  public NodePort_type getNodePort_type() {
    return NodePort_type.instance();
  }
  
  public NodePort_type.Matcher getNodePort_type(final ViatraQueryEngine engine) {
    return NodePort_type.Matcher.on(engine);
  }
  
  public KnownResrouce_type getKnownResrouce_type() {
    return KnownResrouce_type.instance();
  }
  
  public KnownResrouce_type.Matcher getKnownResrouce_type(final ViatraQueryEngine engine) {
    return KnownResrouce_type.Matcher.on(engine);
  }
  
  public Node_isCapableOfPerforming getNode_isCapableOfPerforming() {
    return Node_isCapableOfPerforming.instance();
  }
  
  public Node_isCapableOfPerforming.Matcher getNode_isCapableOfPerforming(final ViatraQueryEngine engine) {
    return Node_isCapableOfPerforming.Matcher.on(engine);
  }
  
  public Node_ownedPort getNode_ownedPort() {
    return Node_ownedPort.instance();
  }
  
  public Node_ownedPort.Matcher getNode_ownedPort(final ViatraQueryEngine engine) {
    return Node_ownedPort.Matcher.on(engine);
  }
  
  public Node_ownedOperation getNode_ownedOperation() {
    return Node_ownedOperation.instance();
  }
  
  public Node_ownedOperation.Matcher getNode_ownedOperation(final ViatraQueryEngine engine) {
    return Node_ownedOperation.Matcher.on(engine);
  }
  
  public NodeOperation_ownedParameter getNodeOperation_ownedParameter() {
    return NodeOperation_ownedParameter.instance();
  }
  
  public NodeOperation_ownedParameter.Matcher getNodeOperation_ownedParameter(final ViatraQueryEngine engine) {
    return NodeOperation_ownedParameter.Matcher.on(engine);
  }
  
  public OperationalParameter_type getOperationalParameter_type() {
    return OperationalParameter_type.instance();
  }
  
  public OperationalParameter_type.Matcher getOperationalParameter_type(final ViatraQueryEngine engine) {
    return OperationalParameter_type.Matcher.on(engine);
  }
  
  public OperationalActivityAction_behavior getOperationalActivityAction_behavior() {
    return OperationalActivityAction_behavior.instance();
  }
  
  public OperationalActivityAction_behavior.Matcher getOperationalActivityAction_behavior(final ViatraQueryEngine engine) {
    return OperationalActivityAction_behavior.Matcher.on(engine);
  }
  
  public OperationalActivityAction_activity getOperationalActivityAction_activity() {
    return OperationalActivityAction_activity.instance();
  }
  
  public OperationalActivityAction_activity.Matcher getOperationalActivityAction_activity(final ViatraQueryEngine engine) {
    return OperationalActivityAction_activity.Matcher.on(engine);
  }
  
  public OperationalActivity_ownedParameter getOperationalActivity_ownedParameter() {
    return OperationalActivity_ownedParameter.instance();
  }
  
  public OperationalActivity_ownedParameter.Matcher getOperationalActivity_ownedParameter(final ViatraQueryEngine engine) {
    return OperationalActivity_ownedParameter.Matcher.on(engine);
  }
  
  public OperationalStateDescription_owner getOperationalStateDescription_owner() {
    return OperationalStateDescription_owner.instance();
  }
  
  public OperationalStateDescription_owner.Matcher getOperationalStateDescription_owner(final ViatraQueryEngine engine) {
    return OperationalStateDescription_owner.Matcher.on(engine);
  }
  
  public OperationalStateDescription_region_state getOperationalStateDescription_region_state() {
    return OperationalStateDescription_region_state.instance();
  }
  
  public OperationalStateDescription_region_state.Matcher getOperationalStateDescription_region_state(final ViatraQueryEngine engine) {
    return OperationalStateDescription_region_state.Matcher.on(engine);
  }
  
  public OperationalActivityEdge_owner getOperationalActivityEdge_owner() {
    return OperationalActivityEdge_owner.instance();
  }
  
  public OperationalActivityEdge_owner.Matcher getOperationalActivityEdge_owner(final ViatraQueryEngine engine) {
    return OperationalActivityEdge_owner.Matcher.on(engine);
  }
  
  public SubjectOfOperationalStateMachine_ownedBehavior getSubjectOfOperationalStateMachine_ownedBehavior() {
    return SubjectOfOperationalStateMachine_ownedBehavior.instance();
  }
  
  public SubjectOfOperationalStateMachine_ownedBehavior.Matcher getSubjectOfOperationalStateMachine_ownedBehavior(final ViatraQueryEngine engine) {
    return SubjectOfOperationalStateMachine_ownedBehavior.Matcher.on(engine);
  }
  
  public OperationalEventTrace_owner getOperationalEventTrace_owner() {
    return OperationalEventTrace_owner.instance();
  }
  
  public OperationalEventTrace_owner.Matcher getOperationalEventTrace_owner(final ViatraQueryEngine engine) {
    return OperationalEventTrace_owner.Matcher.on(engine);
  }
  
  public OperationalEventTrace_message getOperationalEventTrace_message() {
    return OperationalEventTrace_message.instance();
  }
  
  public OperationalEventTrace_message.Matcher getOperationalEventTrace_message(final ViatraQueryEngine engine) {
    return OperationalEventTrace_message.Matcher.on(engine);
  }
  
  public Command_informationSource getCommand_informationSource() {
    return Command_informationSource.instance();
  }
  
  public Command_informationSource.Matcher getCommand_informationSource(final ViatraQueryEngine engine) {
    return Command_informationSource.Matcher.on(engine);
  }
  
  public Command_informationTarget getCommand_informationTarget() {
    return Command_informationTarget.instance();
  }
  
  public Command_informationTarget.Matcher getCommand_informationTarget(final ViatraQueryEngine engine) {
    return Command_informationTarget.Matcher.on(engine);
  }
  
  public Command_conveyed getCommand_conveyed() {
    return Command_conveyed.instance();
  }
  
  public Command_conveyed.Matcher getCommand_conveyed(final ViatraQueryEngine engine) {
    return Command_conveyed.Matcher.on(engine);
  }
  
  public OperationalExchange_realization getOperationalExchange_realization() {
    return OperationalExchange_realization.instance();
  }
  
  public OperationalExchange_realization.Matcher getOperationalExchange_realization(final ViatraQueryEngine engine) {
    return OperationalExchange_realization.Matcher.on(engine);
  }
  
  public OperationalExchange_realizingConnector getOperationalExchange_realizingConnector() {
    return OperationalExchange_realizingConnector.instance();
  }
  
  public OperationalExchange_realizingConnector.Matcher getOperationalExchange_realizingConnector(final ViatraQueryEngine engine) {
    return OperationalExchange_realizingConnector.Matcher.on(engine);
  }
  
  public OperationalExchange_realizingActivityEdge getOperationalExchange_realizingActivityEdge() {
    return OperationalExchange_realizingActivityEdge.instance();
  }
  
  public OperationalExchange_realizingActivityEdge.Matcher getOperationalExchange_realizingActivityEdge(final ViatraQueryEngine engine) {
    return OperationalExchange_realizingActivityEdge.Matcher.on(engine);
  }
  
  public OperationalExchange_informationSource getOperationalExchange_informationSource() {
    return OperationalExchange_informationSource.instance();
  }
  
  public OperationalExchange_informationSource.Matcher getOperationalExchange_informationSource(final ViatraQueryEngine engine) {
    return OperationalExchange_informationSource.Matcher.on(engine);
  }
  
  public OperationalExchange_informationTarget getOperationalExchange_informationTarget() {
    return OperationalExchange_informationTarget.instance();
  }
  
  public OperationalExchange_informationTarget.Matcher getOperationalExchange_informationTarget(final ViatraQueryEngine engine) {
    return OperationalExchange_informationTarget.Matcher.on(engine);
  }
  
  public OperationalExchange_realizingMessage getOperationalExchange_realizingMessage() {
    return OperationalExchange_realizingMessage.instance();
  }
  
  public OperationalExchange_realizingMessage.Matcher getOperationalExchange_realizingMessage(final ViatraQueryEngine engine) {
    return OperationalExchange_realizingMessage.Matcher.on(engine);
  }
  
  public ResourcePort_type getResourcePort_type() {
    return ResourcePort_type.instance();
  }
  
  public ResourcePort_type.Matcher getResourcePort_type(final ViatraQueryEngine engine) {
    return ResourcePort_type.Matcher.on(engine);
  }
  
  public ResourceRole_class getResourceRole_class() {
    return ResourceRole_class.instance();
  }
  
  public ResourceRole_class.Matcher getResourceRole_class(final ViatraQueryEngine engine) {
    return ResourceRole_class.Matcher.on(engine);
  }
  
  public ResouceRole_type getResouceRole_type() {
    return ResouceRole_type.instance();
  }
  
  public ResouceRole_type.Matcher getResouceRole_type(final ViatraQueryEngine engine) {
    return ResouceRole_type.Matcher.on(engine);
  }
  
  public ResourceInterface_end getResourceInterface_end() {
    return ResourceInterface_end.instance();
  }
  
  public ResourceInterface_end.Matcher getResourceInterface_end(final ViatraQueryEngine engine) {
    return ResourceInterface_end.Matcher.on(engine);
  }
  
  public FieldedCapability_classifier getFieldedCapability_classifier() {
    return FieldedCapability_classifier.instance();
  }
  
  public FieldedCapability_classifier.Matcher getFieldedCapability_classifier(final ViatraQueryEngine engine) {
    return FieldedCapability_classifier.Matcher.on(engine);
  }
  
  public Forecast_supplier getForecast_supplier() {
    return Forecast_supplier.instance();
  }
  
  public Forecast_supplier.Matcher getForecast_supplier(final ViatraQueryEngine engine) {
    return Forecast_supplier.Matcher.on(engine);
  }
  
  public Forecast_client getForecast_client() {
    return Forecast_client.instance();
  }
  
  public Forecast_client.Matcher getForecast_client(final ViatraQueryEngine engine) {
    return Forecast_client.Matcher.on(engine);
  }
  
  public ResourceConnector_end getResourceConnector_end() {
    return ResourceConnector_end.instance();
  }
  
  public ResourceConnector_end.Matcher getResourceConnector_end(final ViatraQueryEngine engine) {
    return ResourceConnector_end.Matcher.on(engine);
  }
  
  public ResourceConstraint_constrainedElement getResourceConstraint_constrainedElement() {
    return ResourceConstraint_constrainedElement.instance();
  }
  
  public ResourceConstraint_constrainedElement.Matcher getResourceConstraint_constrainedElement(final ViatraQueryEngine engine) {
    return ResourceConstraint_constrainedElement.Matcher.on(engine);
  }
  
  public Resource_ownedOperation getResource_ownedOperation() {
    return Resource_ownedOperation.instance();
  }
  
  public Resource_ownedOperation.Matcher getResource_ownedOperation(final ViatraQueryEngine engine) {
    return Resource_ownedOperation.Matcher.on(engine);
  }
  
  public Resource_performs getResource_performs() {
    return Resource_performs.instance();
  }
  
  public Resource_performs.Matcher getResource_performs(final ViatraQueryEngine engine) {
    return Resource_performs.Matcher.on(engine);
  }
  
  public Resource_ownedPort getResource_ownedPort() {
    return Resource_ownedPort.instance();
  }
  
  public Resource_ownedPort.Matcher getResource_ownedPort(final ViatraQueryEngine engine) {
    return Resource_ownedPort.Matcher.on(engine);
  }
  
  public VersionOfConfiguration_class getVersionOfConfiguration_class() {
    return VersionOfConfiguration_class.instance();
  }
  
  public VersionOfConfiguration_class.Matcher getVersionOfConfiguration_class(final ViatraQueryEngine engine) {
    return VersionOfConfiguration_class.Matcher.on(engine);
  }
  
  public VersionOfConfiguration_type getVersionOfConfiguration_type() {
    return VersionOfConfiguration_type.instance();
  }
  
  public VersionOfConfiguration_type.Matcher getVersionOfConfiguration_type(final ViatraQueryEngine engine) {
    return VersionOfConfiguration_type.Matcher.on(engine);
  }
  
  public ResourceInteraction_conveyedElement getResourceInteraction_conveyedElement() {
    return ResourceInteraction_conveyedElement.instance();
  }
  
  public ResourceInteraction_conveyedElement.Matcher getResourceInteraction_conveyedElement(final ViatraQueryEngine engine) {
    return ResourceInteraction_conveyedElement.Matcher.on(engine);
  }
  
  public ResourceInteraction_realizingActivityEdge getResourceInteraction_realizingActivityEdge() {
    return ResourceInteraction_realizingActivityEdge.instance();
  }
  
  public ResourceInteraction_realizingActivityEdge.Matcher getResourceInteraction_realizingActivityEdge(final ViatraQueryEngine engine) {
    return ResourceInteraction_realizingActivityEdge.Matcher.on(engine);
  }
  
  public ResourceInteraction_realizingConnector getResourceInteraction_realizingConnector() {
    return ResourceInteraction_realizingConnector.instance();
  }
  
  public ResourceInteraction_realizingConnector.Matcher getResourceInteraction_realizingConnector(final ViatraQueryEngine engine) {
    return ResourceInteraction_realizingConnector.Matcher.on(engine);
  }
  
  public ResourceInteraction_informationSource getResourceInteraction_informationSource() {
    return ResourceInteraction_informationSource.instance();
  }
  
  public ResourceInteraction_informationSource.Matcher getResourceInteraction_informationSource(final ViatraQueryEngine engine) {
    return ResourceInteraction_informationSource.Matcher.on(engine);
  }
  
  public ResourceInteraction_informationTarget getResourceInteraction_informationTarget() {
    return ResourceInteraction_informationTarget.instance();
  }
  
  public ResourceInteraction_informationTarget.Matcher getResourceInteraction_informationTarget(final ViatraQueryEngine engine) {
    return ResourceInteraction_informationTarget.Matcher.on(engine);
  }
  
  public ResourceInteraction_realization getResourceInteraction_realization() {
    return ResourceInteraction_realization.instance();
  }
  
  public ResourceInteraction_realization.Matcher getResourceInteraction_realization(final ViatraQueryEngine engine) {
    return ResourceInteraction_realization.Matcher.on(engine);
  }
  
  public ResourceStateMachine_owner getResourceStateMachine_owner() {
    return ResourceStateMachine_owner.instance();
  }
  
  public ResourceStateMachine_owner.Matcher getResourceStateMachine_owner(final ViatraQueryEngine engine) {
    return ResourceStateMachine_owner.Matcher.on(engine);
  }
  
  public ResourceStateMachine_region_state getResourceStateMachine_region_state() {
    return ResourceStateMachine_region_state.instance();
  }
  
  public ResourceStateMachine_region_state.Matcher getResourceStateMachine_region_state(final ViatraQueryEngine engine) {
    return ResourceStateMachine_region_state.Matcher.on(engine);
  }
  
  public ResourceParameter_type getResourceParameter_type() {
    return ResourceParameter_type.instance();
  }
  
  public ResourceParameter_type.Matcher getResourceParameter_type(final ViatraQueryEngine engine) {
    return ResourceParameter_type.Matcher.on(engine);
  }
  
  public FunctionEdge_owner getFunctionEdge_owner() {
    return FunctionEdge_owner.instance();
  }
  
  public FunctionEdge_owner.Matcher getFunctionEdge_owner(final ViatraQueryEngine engine) {
    return FunctionEdge_owner.Matcher.on(engine);
  }
  
  public Function_ownedParameter getFunction_ownedParameter() {
    return Function_ownedParameter.instance();
  }
  
  public Function_ownedParameter.Matcher getFunction_ownedParameter(final ViatraQueryEngine engine) {
    return Function_ownedParameter.Matcher.on(engine);
  }
  
  public ResourceEventTrace_owner getResourceEventTrace_owner() {
    return ResourceEventTrace_owner.instance();
  }
  
  public ResourceEventTrace_owner.Matcher getResourceEventTrace_owner(final ViatraQueryEngine engine) {
    return ResourceEventTrace_owner.Matcher.on(engine);
  }
  
  public ResourceEventTrace_message getResourceEventTrace_message() {
    return ResourceEventTrace_message.instance();
  }
  
  public ResourceEventTrace_message.Matcher getResourceEventTrace_message(final ViatraQueryEngine engine) {
    return ResourceEventTrace_message.Matcher.on(engine);
  }
  
  public ResourceOperation_ownedParameter getResourceOperation_ownedParameter() {
    return ResourceOperation_ownedParameter.instance();
  }
  
  public ResourceOperation_ownedParameter.Matcher getResourceOperation_ownedParameter(final ViatraQueryEngine engine) {
    return ResourceOperation_ownedParameter.Matcher.on(engine);
  }
  
  public FunctionAction_activity getFunctionAction_activity() {
    return FunctionAction_activity.instance();
  }
  
  public FunctionAction_activity.Matcher getFunctionAction_activity(final ViatraQueryEngine engine) {
    return FunctionAction_activity.Matcher.on(engine);
  }
  
  public FunctionAction_behavior getFunctionAction_behavior() {
    return FunctionAction_behavior.instance();
  }
  
  public FunctionAction_behavior.Matcher getFunctionAction_behavior(final ViatraQueryEngine engine) {
    return FunctionAction_behavior.Matcher.on(engine);
  }
  
  public DataModel_ownedElement getDataModel_ownedElement() {
    return DataModel_ownedElement.instance();
  }
  
  public DataModel_ownedElement.Matcher getDataModel_ownedElement(final ViatraQueryEngine engine) {
    return DataModel_ownedElement.Matcher.on(engine);
  }
  
  public PropertySet_ownedAttribute getPropertySet_ownedAttribute() {
    return PropertySet_ownedAttribute.instance();
  }
  
  public PropertySet_ownedAttribute.Matcher getPropertySet_ownedAttribute(final ViatraQueryEngine engine) {
    return PropertySet_ownedAttribute.Matcher.on(engine);
  }
  
  public ActualPropertySet_classifier getActualPropertySet_classifier() {
    return ActualPropertySet_classifier.instance();
  }
  
  public ActualPropertySet_classifier.Matcher getActualPropertySet_classifier(final ViatraQueryEngine engine) {
    return ActualPropertySet_classifier.Matcher.on(engine);
  }
  
  public ActualPropertySet_slot getActualPropertySet_slot() {
    return ActualPropertySet_slot.instance();
  }
  
  public ActualPropertySet_slot.Matcher getActualPropertySet_slot(final ViatraQueryEngine engine) {
    return ActualPropertySet_slot.Matcher.on(engine);
  }
  
  public MeasurementSet_ownedAttributes getMeasurementSet_ownedAttributes() {
    return MeasurementSet_ownedAttributes.instance();
  }
  
  public MeasurementSet_ownedAttributes.Matcher getMeasurementSet_ownedAttributes(final ViatraQueryEngine engine) {
    return MeasurementSet_ownedAttributes.Matcher.on(engine);
  }
  
  public PropertyValue_definingFeature getPropertyValue_definingFeature() {
    return PropertyValue_definingFeature.instance();
  }
  
  public PropertyValue_definingFeature.Matcher getPropertyValue_definingFeature(final ViatraQueryEngine engine) {
    return PropertyValue_definingFeature.Matcher.on(engine);
  }
  
  public PropertyValue_owningInstance getPropertyValue_owningInstance() {
    return PropertyValue_owningInstance.instance();
  }
  
  public PropertyValue_owningInstance.Matcher getPropertyValue_owningInstance(final ViatraQueryEngine engine) {
    return PropertyValue_owningInstance.Matcher.on(engine);
  }
  
  public ActualMeasurement_definingFeature getActualMeasurement_definingFeature() {
    return ActualMeasurement_definingFeature.instance();
  }
  
  public ActualMeasurement_definingFeature.Matcher getActualMeasurement_definingFeature(final ViatraQueryEngine engine) {
    return ActualMeasurement_definingFeature.Matcher.on(engine);
  }
  
  public ActualLocation_classifier getActualLocation_classifier() {
    return ActualLocation_classifier.instance();
  }
  
  public ActualLocation_classifier.Matcher getActualLocation_classifier(final ViatraQueryEngine engine) {
    return ActualLocation_classifier.Matcher.on(engine);
  }
  
  public Environment_ownedAttributes getEnvironment_ownedAttributes() {
    return Environment_ownedAttributes.instance();
  }
  
  public Environment_ownedAttributes.Matcher getEnvironment_ownedAttributes(final ViatraQueryEngine engine) {
    return Environment_ownedAttributes.Matcher.on(engine);
  }
  
  public EnvironmentalProperty_class getEnvironmentalProperty_class() {
    return EnvironmentalProperty_class.instance();
  }
  
  public EnvironmentalProperty_class.Matcher getEnvironmentalProperty_class(final ViatraQueryEngine engine) {
    return EnvironmentalProperty_class.Matcher.on(engine);
  }
  
  public EnvironmentalProperty_type getEnvironmentalProperty_type() {
    return EnvironmentalProperty_type.instance();
  }
  
  public EnvironmentalProperty_type.Matcher getEnvironmentalProperty_type(final ViatraQueryEngine engine) {
    return EnvironmentalProperty_type.Matcher.on(engine);
  }
  
  public ArchitecturalReference_client getArchitecturalReference_client() {
    return ArchitecturalReference_client.instance();
  }
  
  public ArchitecturalReference_client.Matcher getArchitecturalReference_client(final ViatraQueryEngine engine) {
    return ArchitecturalReference_client.Matcher.on(engine);
  }
  
  public ArchitecturalReference_supplier getArchitecturalReference_supplier() {
    return ArchitecturalReference_supplier.instance();
  }
  
  public ArchitecturalReference_supplier.Matcher getArchitecturalReference_supplier(final ViatraQueryEngine engine) {
    return ArchitecturalReference_supplier.Matcher.on(engine);
  }
  
  public ArchitectureMetadata_annotatedElement getArchitectureMetadata_annotatedElement() {
    return ArchitectureMetadata_annotatedElement.instance();
  }
  
  public ArchitectureMetadata_annotatedElement.Matcher getArchitectureMetadata_annotatedElement(final ViatraQueryEngine engine) {
    return ArchitectureMetadata_annotatedElement.Matcher.on(engine);
  }
  
  public Participant_ownedPort getParticipant_ownedPort() {
    return Participant_ownedPort.instance();
  }
  
  public Participant_ownedPort.Matcher getParticipant_ownedPort(final ViatraQueryEngine engine) {
    return Participant_ownedPort.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_client getIsCapableOfPerforming_client() {
    return IsCapableOfPerforming_client.instance();
  }
  
  public IsCapableOfPerforming_client.Matcher getIsCapableOfPerforming_client(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_client.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_supplier getIsCapableOfPerforming_supplier() {
    return IsCapableOfPerforming_supplier.instance();
  }
  
  public IsCapableOfPerforming_supplier.Matcher getIsCapableOfPerforming_supplier(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_supplier.Matcher.on(engine);
  }
  
  public Implements_client getImplements_client() {
    return Implements_client.instance();
  }
  
  public Implements_client.Matcher getImplements_client(final ViatraQueryEngine engine) {
    return Implements_client.Matcher.on(engine);
  }
  
  public Implements_supplier getImplements_supplier() {
    return Implements_supplier.instance();
  }
  
  public Implements_supplier.Matcher getImplements_supplier(final ViatraQueryEngine engine) {
    return Implements_supplier.Matcher.on(engine);
  }
  
  public StandardConfiguration_annotatedElement getStandardConfiguration_annotatedElement() {
    return StandardConfiguration_annotatedElement.instance();
  }
  
  public StandardConfiguration_annotatedElement.Matcher getStandardConfiguration_annotatedElement(final ViatraQueryEngine engine) {
    return StandardConfiguration_annotatedElement.Matcher.on(engine);
  }
  
  public Details_supplier getDetails_supplier() {
    return Details_supplier.instance();
  }
  
  public Details_supplier.Matcher getDetails_supplier(final ViatraQueryEngine engine) {
    return Details_supplier.Matcher.on(engine);
  }
  
  public Details_client getDetails_client() {
    return Details_client.instance();
  }
  
  public Details_client.Matcher getDetails_client(final ViatraQueryEngine engine) {
    return Details_client.Matcher.on(engine);
  }
  
  public EntityRelationship_endType getEntityRelationship_endType() {
    return EntityRelationship_endType.instance();
  }
  
  public EntityRelationship_endType.Matcher getEntityRelationship_endType(final ViatraQueryEngine engine) {
    return EntityRelationship_endType.Matcher.on(engine);
  }
  
  public EntityAttribute_canBeAppliedTo getEntityAttribute_canBeAppliedTo() {
    return EntityAttribute_canBeAppliedTo.instance();
  }
  
  public EntityAttribute_canBeAppliedTo.Matcher getEntityAttribute_canBeAppliedTo(final ViatraQueryEngine engine) {
    return EntityAttribute_canBeAppliedTo.Matcher.on(engine);
  }
  
  public EntityItem_ownedAttribute getEntityItem_ownedAttribute() {
    return EntityItem_ownedAttribute.instance();
  }
  
  public EntityItem_ownedAttribute.Matcher getEntityItem_ownedAttribute(final ViatraQueryEngine engine) {
    return EntityItem_ownedAttribute.Matcher.on(engine);
  }
  
  public ServiceInterface_feature getServiceInterface_feature() {
    return ServiceInterface_feature.instance();
  }
  
  public ServiceInterface_feature.Matcher getServiceInterface_feature(final ViatraQueryEngine engine) {
    return ServiceInterface_feature.Matcher.on(engine);
  }
  
  public ServiceInterface_ownedAttribute getServiceInterface_ownedAttribute() {
    return ServiceInterface_ownedAttribute.instance();
  }
  
  public ServiceInterface_ownedAttribute.Matcher getServiceInterface_ownedAttribute(final ViatraQueryEngine engine) {
    return ServiceInterface_ownedAttribute.Matcher.on(engine);
  }
  
  public ServicePort_type getServicePort_type() {
    return ServicePort_type.instance();
  }
  
  public ServicePort_type.Matcher getServicePort_type(final ViatraQueryEngine engine) {
    return ServicePort_type.Matcher.on(engine);
  }
  
  public ServicePort_actualPropertySets getServicePort_actualPropertySets() {
    return ServicePort_actualPropertySets.instance();
  }
  
  public ServicePort_actualPropertySets.Matcher getServicePort_actualPropertySets(final ViatraQueryEngine engine) {
    return ServicePort_actualPropertySets.Matcher.on(engine);
  }
  
  public ServiceLevelValueSet_slot getServiceLevelValueSet_slot() {
    return ServiceLevelValueSet_slot.instance();
  }
  
  public ServiceLevelValueSet_slot.Matcher getServiceLevelValueSet_slot(final ViatraQueryEngine engine) {
    return ServiceLevelValueSet_slot.Matcher.on(engine);
  }
  
  public ServicePolicy_constrainedElement getServicePolicy_constrainedElement() {
    return ServicePolicy_constrainedElement.instance();
  }
  
  public ServicePolicy_constrainedElement.Matcher getServicePolicy_constrainedElement(final ViatraQueryEngine engine) {
    return ServicePolicy_constrainedElement.Matcher.on(engine);
  }
  
  public ServiceMessageHandler_signal getServiceMessageHandler_signal() {
    return ServiceMessageHandler_signal.instance();
  }
  
  public ServiceMessageHandler_signal.Matcher getServiceMessageHandler_signal(final ViatraQueryEngine engine) {
    return ServiceMessageHandler_signal.Matcher.on(engine);
  }
  
  public ServiceOperation_ownedParameter getServiceOperation_ownedParameter() {
    return ServiceOperation_ownedParameter.instance();
  }
  
  public ServiceOperation_ownedParameter.Matcher getServiceOperation_ownedParameter(final ViatraQueryEngine engine) {
    return ServiceOperation_ownedParameter.Matcher.on(engine);
  }
  
  public ServiceFeature_ownedParameter getServiceFeature_ownedParameter() {
    return ServiceFeature_ownedParameter.instance();
  }
  
  public ServiceFeature_ownedParameter.Matcher getServiceFeature_ownedParameter(final ViatraQueryEngine engine) {
    return ServiceFeature_ownedParameter.Matcher.on(engine);
  }
  
  public ServiceFeature_owner getServiceFeature_owner() {
    return ServiceFeature_owner.instance();
  }
  
  public ServiceFeature_owner.Matcher getServiceFeature_owner(final ViatraQueryEngine engine) {
    return ServiceFeature_owner.Matcher.on(engine);
  }
  
  public ServiceInteraction_owner getServiceInteraction_owner() {
    return ServiceInteraction_owner.instance();
  }
  
  public ServiceInteraction_owner.Matcher getServiceInteraction_owner(final ViatraQueryEngine engine) {
    return ServiceInteraction_owner.Matcher.on(engine);
  }
  
  public ServiceInteraction_message getServiceInteraction_message() {
    return ServiceInteraction_message.instance();
  }
  
  public ServiceInteraction_message.Matcher getServiceInteraction_message(final ViatraQueryEngine engine) {
    return ServiceInteraction_message.Matcher.on(engine);
  }
  
  public ServiceFunctionEdge_owner getServiceFunctionEdge_owner() {
    return ServiceFunctionEdge_owner.instance();
  }
  
  public ServiceFunctionEdge_owner.Matcher getServiceFunctionEdge_owner(final ViatraQueryEngine engine) {
    return ServiceFunctionEdge_owner.Matcher.on(engine);
  }
  
  public ServiceFunction_ownedParameter getServiceFunction_ownedParameter() {
    return ServiceFunction_ownedParameter.instance();
  }
  
  public ServiceFunction_ownedParameter.Matcher getServiceFunction_ownedParameter(final ViatraQueryEngine engine) {
    return ServiceFunction_ownedParameter.Matcher.on(engine);
  }
  
  public ServiceStateMachine_owner getServiceStateMachine_owner() {
    return ServiceStateMachine_owner.instance();
  }
  
  public ServiceStateMachine_owner.Matcher getServiceStateMachine_owner(final ViatraQueryEngine engine) {
    return ServiceStateMachine_owner.Matcher.on(engine);
  }
  
  public ServiceParameter_type getServiceParameter_type() {
    return ServiceParameter_type.instance();
  }
  
  public ServiceParameter_type.Matcher getServiceParameter_type(final ViatraQueryEngine engine) {
    return ServiceParameter_type.Matcher.on(engine);
  }
  
  public ServiceFunctionAction_behavior getServiceFunctionAction_behavior() {
    return ServiceFunctionAction_behavior.instance();
  }
  
  public ServiceFunctionAction_behavior.Matcher getServiceFunctionAction_behavior(final ViatraQueryEngine engine) {
    return ServiceFunctionAction_behavior.Matcher.on(engine);
  }
  
  public ServiceFunctionAction_activity getServiceFunctionAction_activity() {
    return ServiceFunctionAction_activity.instance();
  }
  
  public ServiceFunctionAction_activity.Matcher getServiceFunctionAction_activity(final ViatraQueryEngine engine) {
    return ServiceFunctionAction_activity.Matcher.on(engine);
  }
  
  public Expose_client getExpose_client() {
    return Expose_client.instance();
  }
  
  public Expose_client.Matcher getExpose_client(final ViatraQueryEngine engine) {
    return Expose_client.Matcher.on(engine);
  }
  
  public Expose_supplier getExpose_supplier() {
    return Expose_supplier.instance();
  }
  
  public Expose_supplier.Matcher getExpose_supplier(final ViatraQueryEngine engine) {
    return Expose_supplier.Matcher.on(engine);
  }
  
  public MapsToCapability_client getMapsToCapability_client() {
    return MapsToCapability_client.instance();
  }
  
  public MapsToCapability_client.Matcher getMapsToCapability_client(final ViatraQueryEngine engine) {
    return MapsToCapability_client.Matcher.on(engine);
  }
  
  public MapsToCapability_supplier getMapsToCapability_supplier() {
    return MapsToCapability_supplier.instance();
  }
  
  public MapsToCapability_supplier.Matcher getMapsToCapability_supplier(final ViatraQueryEngine engine) {
    return MapsToCapability_supplier.Matcher.on(engine);
  }
  
  public TemporalPart_type getTemporalPart_type() {
    return TemporalPart_type.instance();
  }
  
  public TemporalPart_type.Matcher getTemporalPart_type(final ViatraQueryEngine engine) {
    return TemporalPart_type.Matcher.on(engine);
  }
  
  public TemporalPart_class getTemporalPart_class() {
    return TemporalPart_class.instance();
  }
  
  public TemporalPart_class.Matcher getTemporalPart_class(final ViatraQueryEngine engine) {
    return TemporalPart_class.Matcher.on(engine);
  }
  
  public Exhibits_client getExhibits_client() {
    return Exhibits_client.instance();
  }
  
  public Exhibits_client.Matcher getExhibits_client(final ViatraQueryEngine engine) {
    return Exhibits_client.Matcher.on(engine);
  }
  
  public Exhibits_supplier getExhibits_supplier() {
    return Exhibits_supplier.instance();
  }
  
  public Exhibits_supplier.Matcher getExhibits_supplier(final ViatraQueryEngine engine) {
    return Exhibits_supplier.Matcher.on(engine);
  }
  
  public CapabilityProperty_type getCapabilityProperty_type() {
    return CapabilityProperty_type.instance();
  }
  
  public CapabilityProperty_type.Matcher getCapabilityProperty_type(final ViatraQueryEngine engine) {
    return CapabilityProperty_type.Matcher.on(engine);
  }
  
  public StructuralPart_class getStructuralPart_class() {
    return StructuralPart_class.instance();
  }
  
  public StructuralPart_class.Matcher getStructuralPart_class(final ViatraQueryEngine engine) {
    return StructuralPart_class.Matcher.on(engine);
  }
  
  public StructuralPart_type getStructuralPart_type() {
    return StructuralPart_type.instance();
  }
  
  public StructuralPart_type.Matcher getStructuralPart_type(final ViatraQueryEngine engine) {
    return StructuralPart_type.Matcher.on(engine);
  }
  
  public Capability_ownedAttribute getCapability_ownedAttribute() {
    return Capability_ownedAttribute.instance();
  }
  
  public Capability_ownedAttribute.Matcher getCapability_ownedAttribute(final ViatraQueryEngine engine) {
    return Capability_ownedAttribute.Matcher.on(engine);
  }
  
  public ActualProject_classifier getActualProject_classifier() {
    return ActualProject_classifier.instance();
  }
  
  public ActualProject_classifier.Matcher getActualProject_classifier(final ViatraQueryEngine engine) {
    return ActualProject_classifier.Matcher.on(engine);
  }
  
  public ActualProjectMilestoneRole_definingFeature getActualProjectMilestoneRole_definingFeature() {
    return ActualProjectMilestoneRole_definingFeature.instance();
  }
  
  public ActualProjectMilestoneRole_definingFeature.Matcher getActualProjectMilestoneRole_definingFeature(final ViatraQueryEngine engine) {
    return ActualProjectMilestoneRole_definingFeature.Matcher.on(engine);
  }
  
  public ActualProjectMilestoneRole_owningInstance getActualProjectMilestoneRole_owningInstance() {
    return ActualProjectMilestoneRole_owningInstance.instance();
  }
  
  public ActualProjectMilestoneRole_owningInstance.Matcher getActualProjectMilestoneRole_owningInstance(final ViatraQueryEngine engine) {
    return ActualProjectMilestoneRole_owningInstance.Matcher.on(engine);
  }
  
  public ProjectMilestoneRole_class getProjectMilestoneRole_class() {
    return ProjectMilestoneRole_class.instance();
  }
  
  public ProjectMilestoneRole_class.Matcher getProjectMilestoneRole_class(final ViatraQueryEngine engine) {
    return ProjectMilestoneRole_class.Matcher.on(engine);
  }
  
  public ProjectMilestoneRole_type getProjectMilestoneRole_type() {
    return ProjectMilestoneRole_type.instance();
  }
  
  public ProjectMilestoneRole_type.Matcher getProjectMilestoneRole_type(final ViatraQueryEngine engine) {
    return ProjectMilestoneRole_type.Matcher.on(engine);
  }
  
  public Project_ownedAttribute getProject_ownedAttribute() {
    return Project_ownedAttribute.instance();
  }
  
  public Project_ownedAttribute.Matcher getProject_ownedAttribute(final ViatraQueryEngine engine) {
    return Project_ownedAttribute.Matcher.on(engine);
  }
  
  public OrganizationalProjectRelationship_client getOrganizationalProjectRelationship_client() {
    return OrganizationalProjectRelationship_client.instance();
  }
  
  public OrganizationalProjectRelationship_client.Matcher getOrganizationalProjectRelationship_client(final ViatraQueryEngine engine) {
    return OrganizationalProjectRelationship_client.Matcher.on(engine);
  }
  
  public OrganizationalProjectRelationship_supplier getOrganizationalProjectRelationship_supplier() {
    return OrganizationalProjectRelationship_supplier.instance();
  }
  
  public OrganizationalProjectRelationship_supplier.Matcher getOrganizationalProjectRelationship_supplier(final ViatraQueryEngine engine) {
    return OrganizationalProjectRelationship_supplier.Matcher.on(engine);
  }
  
  public Information_annotatedElement getInformation_annotatedElement() {
    return Information_annotatedElement.instance();
  }
  
  public Information_annotatedElement.Matcher getInformation_annotatedElement(final ViatraQueryEngine engine) {
    return Information_annotatedElement.Matcher.on(engine);
  }
  
  public ConditionProperty_class getConditionProperty_class() {
    return ConditionProperty_class.instance();
  }
  
  public ConditionProperty_class.Matcher getConditionProperty_class(final ViatraQueryEngine engine) {
    return ConditionProperty_class.Matcher.on(engine);
  }
  
  public Condition_ownedAttribute getCondition_ownedAttribute() {
    return Condition_ownedAttribute.instance();
  }
  
  public Condition_ownedAttribute.Matcher getCondition_ownedAttribute(final ViatraQueryEngine engine) {
    return Condition_ownedAttribute.Matcher.on(engine);
  }
  
  public GeoPoliticalExtent_classifier getGeoPoliticalExtent_classifier() {
    return GeoPoliticalExtent_classifier.instance();
  }
  
  public GeoPoliticalExtent_classifier.Matcher getGeoPoliticalExtent_classifier(final ViatraQueryEngine engine) {
    return GeoPoliticalExtent_classifier.Matcher.on(engine);
  }
  
  public ActivityPartOfProject_supplier getActivityPartOfProject_supplier() {
    return ActivityPartOfProject_supplier.instance();
  }
  
  public ActivityPartOfProject_supplier.Matcher getActivityPartOfProject_supplier(final ViatraQueryEngine engine) {
    return ActivityPartOfProject_supplier.Matcher.on(engine);
  }
  
  public ActivityPartOfProject_client getActivityPartOfProject_client() {
    return ActivityPartOfProject_client.instance();
  }
  
  public ActivityPartOfProject_client.Matcher getActivityPartOfProject_client(final ViatraQueryEngine engine) {
    return ActivityPartOfProject_client.Matcher.on(engine);
  }
  
  public DesiredEffect_client getDesiredEffect_client() {
    return DesiredEffect_client.instance();
  }
  
  public DesiredEffect_client.Matcher getDesiredEffect_client(final ViatraQueryEngine engine) {
    return DesiredEffect_client.Matcher.on(engine);
  }
  
  public DesiredEffect_supplier getDesiredEffect_supplier() {
    return DesiredEffect_supplier.instance();
  }
  
  public DesiredEffect_supplier.Matcher getDesiredEffect_supplier(final ViatraQueryEngine engine) {
    return DesiredEffect_supplier.Matcher.on(engine);
  }
  
  public Trustline_client getTrustline_client() {
    return Trustline_client.instance();
  }
  
  public Trustline_client.Matcher getTrustline_client(final ViatraQueryEngine engine) {
    return Trustline_client.Matcher.on(engine);
  }
  
  public Trustline_supplier getTrustline_supplier() {
    return Trustline_supplier.instance();
  }
  
  public Trustline_supplier.Matcher getTrustline_supplier(final ViatraQueryEngine engine) {
    return Trustline_supplier.Matcher.on(engine);
  }
  
  public ProblemDomain_class getProblemDomain_class() {
    return ProblemDomain_class.instance();
  }
  
  public ProblemDomain_class.Matcher getProblemDomain_class(final ViatraQueryEngine engine) {
    return ProblemDomain_class.Matcher.on(engine);
  }
  
  public ProblemDomain_type getProblemDomain_type() {
    return ProblemDomain_type.instance();
  }
  
  public ProblemDomain_type.Matcher getProblemDomain_type(final ViatraQueryEngine engine) {
    return ProblemDomain_type.Matcher.on(engine);
  }
  
  public OwnsProcess_supplier getOwnsProcess_supplier() {
    return OwnsProcess_supplier.instance();
  }
  
  public OwnsProcess_supplier.Matcher getOwnsProcess_supplier(final ViatraQueryEngine engine) {
    return OwnsProcess_supplier.Matcher.on(engine);
  }
  
  public OwnsProcess_client getOwnsProcess_client() {
    return OwnsProcess_client.instance();
  }
  
  public OwnsProcess_client.Matcher getOwnsProcess_client(final ViatraQueryEngine engine) {
    return OwnsProcess_client.Matcher.on(engine);
  }
  
  public Control_conveyed getControl_conveyed() {
    return Control_conveyed.instance();
  }
  
  public Control_conveyed.Matcher getControl_conveyed(final ViatraQueryEngine engine) {
    return Control_conveyed.Matcher.on(engine);
  }
  
  public Control_informationTarget getControl_informationTarget() {
    return Control_informationTarget.instance();
  }
  
  public Control_informationTarget.Matcher getControl_informationTarget(final ViatraQueryEngine engine) {
    return Control_informationTarget.Matcher.on(engine);
  }
  
  public Control_informationSource getControl_informationSource() {
    return Control_informationSource.instance();
  }
  
  public Control_informationSource.Matcher getControl_informationSource(final ViatraQueryEngine engine) {
    return Control_informationSource.Matcher.on(engine);
  }
  
  public ProjectSequence_client getProjectSequence_client() {
    return ProjectSequence_client.instance();
  }
  
  public ProjectSequence_client.Matcher getProjectSequence_client(final ViatraQueryEngine engine) {
    return ProjectSequence_client.Matcher.on(engine);
  }
  
  public ProjectSequence_supplier getProjectSequence_supplier() {
    return ProjectSequence_supplier.instance();
  }
  
  public ProjectSequence_supplier.Matcher getProjectSequence_supplier(final ViatraQueryEngine engine) {
    return ProjectSequence_supplier.Matcher.on(engine);
  }
  
  public ActualProjectMilestone_classifier getActualProjectMilestone_classifier() {
    return ActualProjectMilestone_classifier.instance();
  }
  
  public ActualProjectMilestone_classifier.Matcher getActualProjectMilestone_classifier(final ViatraQueryEngine engine) {
    return ActualProjectMilestone_classifier.Matcher.on(engine);
  }
  
  public ActualProjectMilestone_slot getActualProjectMilestone_slot() {
    return ActualProjectMilestone_slot.instance();
  }
  
  public ActualProjectMilestone_slot.Matcher getActualProjectMilestone_slot(final ViatraQueryEngine engine) {
    return ActualProjectMilestone_slot.Matcher.on(engine);
  }
  
  public MilestoneSequence_client getMilestoneSequence_client() {
    return MilestoneSequence_client.instance();
  }
  
  public MilestoneSequence_client.Matcher getMilestoneSequence_client(final ViatraQueryEngine engine) {
    return MilestoneSequence_client.Matcher.on(engine);
  }
  
  public MilestoneSequence_supplier getMilestoneSequence_supplier() {
    return MilestoneSequence_supplier.instance();
  }
  
  public MilestoneSequence_supplier.Matcher getMilestoneSequence_supplier(final ViatraQueryEngine engine) {
    return MilestoneSequence_supplier.Matcher.on(engine);
  }
  
  public ProjectMilestone_ownedAttributes getProjectMilestone_ownedAttributes() {
    return ProjectMilestone_ownedAttributes.instance();
  }
  
  public ProjectMilestone_ownedAttributes.Matcher getProjectMilestone_ownedAttributes(final ViatraQueryEngine engine) {
    return ProjectMilestone_ownedAttributes.Matcher.on(engine);
  }
  
  public ProjectStatus_definingFeature getProjectStatus_definingFeature() {
    return ProjectStatus_definingFeature.instance();
  }
  
  public ProjectStatus_definingFeature.Matcher getProjectStatus_definingFeature(final ViatraQueryEngine engine) {
    return ProjectStatus_definingFeature.Matcher.on(engine);
  }
  
  public ProjecTheme_type getProjecTheme_type() {
    return ProjecTheme_type.instance();
  }
  
  public ProjecTheme_type.Matcher getProjecTheme_type(final ViatraQueryEngine engine) {
    return ProjecTheme_type.Matcher.on(engine);
  }
  
  public ProtocolLayer_class getProtocolLayer_class() {
    return ProtocolLayer_class.instance();
  }
  
  public ProtocolLayer_class.Matcher getProtocolLayer_class(final ViatraQueryEngine engine) {
    return ProtocolLayer_class.Matcher.on(engine);
  }
  
  public ProtocolLayer_type getProtocolLayer_type() {
    return ProtocolLayer_type.instance();
  }
  
  public ProtocolLayer_type.Matcher getProtocolLayer_type(final ViatraQueryEngine engine) {
    return ProtocolLayer_type.Matcher.on(engine);
  }
  
  public SameAs_client getSameAs_client() {
    return SameAs_client.instance();
  }
  
  public SameAs_client.Matcher getSameAs_client(final ViatraQueryEngine engine) {
    return SameAs_client.Matcher.on(engine);
  }
  
  public SameAs_supplier getSameAs_supplier() {
    return SameAs_supplier.instance();
  }
  
  public SameAs_supplier.Matcher getSameAs_supplier(final ViatraQueryEngine engine) {
    return SameAs_supplier.Matcher.on(engine);
  }
  
  public Definition_annotatedElement getDefinition_annotatedElement() {
    return Definition_annotatedElement.instance();
  }
  
  public Definition_annotatedElement.Matcher getDefinition_annotatedElement(final ViatraQueryEngine engine) {
    return Definition_annotatedElement.Matcher.on(engine);
  }
  
  public Allias_annotatedElement getAllias_annotatedElement() {
    return Allias_annotatedElement.instance();
  }
  
  public Allias_annotatedElement.Matcher getAllias_annotatedElement(final ViatraQueryEngine engine) {
    return Allias_annotatedElement.Matcher.on(engine);
  }
  
  public StereotypeExtension_annotatedElement getStereotypeExtension_annotatedElement() {
    return StereotypeExtension_annotatedElement.instance();
  }
  
  public StereotypeExtension_annotatedElement.Matcher getStereotypeExtension_annotatedElement(final ViatraQueryEngine engine) {
    return StereotypeExtension_annotatedElement.Matcher.on(engine);
  }
  
  public Overlap_client getOverlap_client() {
    return Overlap_client.instance();
  }
  
  public Overlap_client.Matcher getOverlap_client(final ViatraQueryEngine engine) {
    return Overlap_client.Matcher.on(engine);
  }
  
  public Overlap_supplier getOverlap_supplier() {
    return Overlap_supplier.instance();
  }
  
  public Overlap_supplier.Matcher getOverlap_supplier(final ViatraQueryEngine engine) {
    return Overlap_supplier.Matcher.on(engine);
  }
  
  public Transactional_ownedAttribute getTransactional_ownedAttribute() {
    return Transactional_ownedAttribute.instance();
  }
  
  public Transactional_ownedAttribute.Matcher getTransactional_ownedAttribute(final ViatraQueryEngine engine) {
    return Transactional_ownedAttribute.Matcher.on(engine);
  }
  
  public Wrapper_ownedAttribute getWrapper_ownedAttribute() {
    return Wrapper_ownedAttribute.instance();
  }
  
  public Wrapper_ownedAttribute.Matcher getWrapper_ownedAttribute(final ViatraQueryEngine engine) {
    return Wrapper_ownedAttribute.Matcher.on(engine);
  }
  
  public Semantic_ownedAttribute getSemantic_ownedAttribute() {
    return Semantic_ownedAttribute.instance();
  }
  
  public Semantic_ownedAttribute.Matcher getSemantic_ownedAttribute(final ViatraQueryEngine engine) {
    return Semantic_ownedAttribute.Matcher.on(engine);
  }
  
  public Contract_conveyed getContract_conveyed() {
    return Contract_conveyed.instance();
  }
  
  public Contract_conveyed.Matcher getContract_conveyed(final ViatraQueryEngine engine) {
    return Contract_conveyed.Matcher.on(engine);
  }
}
