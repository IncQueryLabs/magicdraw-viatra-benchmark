/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

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
import com.incquerylabs.magicdraw.benchmark.queries.internal.ServicePort;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in APerformanceQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
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
 * <li>ServicePort</li>
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
public final class APerformanceQueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static APerformanceQueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new APerformanceQueriesAll();
    }
    return INSTANCE;
  }
  
  private static APerformanceQueriesAll INSTANCE;
  
  private APerformanceQueriesAll() {
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
    querySpecifications.add(ServicePort.instance());
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
}
