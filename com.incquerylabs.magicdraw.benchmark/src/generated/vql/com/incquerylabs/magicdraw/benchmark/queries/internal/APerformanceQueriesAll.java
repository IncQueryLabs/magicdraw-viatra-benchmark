/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

import com.incquerylabs.magicdraw.benchmark.queries.AchievedEffect_client;
import com.incquerylabs.magicdraw.benchmark.queries.AchievedEffect_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualCondition_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualEnduringTask_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualEnterprisePhase_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualEnvironment_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualLocation_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualMeasurementSet_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualMeasurementSet_slot;
import com.incquerylabs.magicdraw.benchmark.queries.ActualMeasurement_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualMeasurement_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganizationRole_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_slot;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPerson_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPost_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_value_instance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestone_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectRole_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectRole_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProjectRole_value_instance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProject_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualProject_slot;
import com.incquerylabs.magicdraw.benchmark.queries.ActualPropertySet_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResourceRelationship_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResourceRelationship_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResourceRelationship_realizes;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResourceRole_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResourceRole_owningInstance;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResource_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualResponsibility_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.ActualService_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.AffectsInContext_client;
import com.incquerylabs.magicdraw.benchmark.queries.AffectsInContext_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Affects_client;
import com.incquerylabs.magicdraw.benchmark.queries.Affects_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Alias_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ArbitraryConnector_client;
import com.incquerylabs.magicdraw.benchmark.queries.ArbitraryConnector_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ArchitecturalReference_client;
import com.incquerylabs.magicdraw.benchmark.queries.ArchitecturalReference_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ArchitectureMetadata_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityForTask_client;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityForTask_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.CapabilityProperty_type;
import com.incquerylabs.magicdraw.benchmark.queries.Command_conveyed;
import com.incquerylabs.magicdraw.benchmark.queries.Command_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.Command_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.CompetenceForRole_client;
import com.incquerylabs.magicdraw.benchmark.queries.CompetenceForRole_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.CompetenceToConduct_client;
import com.incquerylabs.magicdraw.benchmark.queries.CompetenceToConduct_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ConceptRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ConceptRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.Consumes_client;
import com.incquerylabs.magicdraw.benchmark.queries.Consumes_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Control_conveyed;
import com.incquerylabs.magicdraw.benchmark.queries.Control_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.Control_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.DataElement_owner;
import com.incquerylabs.magicdraw.benchmark.queries.Definition_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.DesiredEffect_client;
import com.incquerylabs.magicdraw.benchmark.queries.DesiredEffect_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Enhances_client;
import com.incquerylabs.magicdraw.benchmark.queries.Enhances_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.EnvironmentalProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.EnvironmentalProperty_type;
import com.incquerylabs.magicdraw.benchmark.queries.Exhibits_client;
import com.incquerylabs.magicdraw.benchmark.queries.Exhibits_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.FieldedCapability_classifier;
import com.incquerylabs.magicdraw.benchmark.queries.FillsPost_client;
import com.incquerylabs.magicdraw.benchmark.queries.FillsPost_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Forecast_client;
import com.incquerylabs.magicdraw.benchmark.queries.Forecast_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionControlFlow_source;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionControlFlow_target;
import com.incquerylabs.magicdraw.benchmark.queries.FunctionEdge_owner;
import com.incquerylabs.magicdraw.benchmark.queries.Function_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ActualEnduringTask_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_DataElement_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_Function_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_InformationElement_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalActivity_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalActivity_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalAgent_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalConnector_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalExchange_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalInterface_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_OperationalRole_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ResourceConnector_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ResourceConnector_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ResourceExchange_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ResourceInterface_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ResourcePerformer_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ResourceRole_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ServiceFunction_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_ServiceInterface_client;
import com.incquerylabs.magicdraw.benchmark.queries.Implements_client_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.InformationElement_owner;
import com.incquerylabs.magicdraw.benchmark.queries.Information_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_Function_client;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_OperationalActivity_client;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_OperationalAgent_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_ProjectActivity_client;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_Project_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_ResourcePerformer_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_ServiceFunction_client;
import com.incquerylabs.magicdraw.benchmark.queries.IsCapableOfPerforming_ServiceSpecification_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.MapsToCapability_client;
import com.incquerylabs.magicdraw.benchmark.queries.MapsToCapability_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Measurement_class;
import com.incquerylabs.magicdraw.benchmark.queries.Metadata_annotatedElement;
import com.incquerylabs.magicdraw.benchmark.queries.MilestoneDependency_client;
import com.incquerylabs.magicdraw.benchmark.queries.MilestoneSequence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Mitigates_client;
import com.incquerylabs.magicdraw.benchmark.queries.Mitigates_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivityAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivityAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivityEdge_owner;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalActivity_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalConnector_end;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalConstraint_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalControlFlow_source;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalControlFlow_target;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realizingActivityEdge;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realizingConnector;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalExchange_realizingMessage;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalInterface_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalMethod_method;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalMethod_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalParameter_type;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalPerformer_isCapableOfPerforming;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalPerformer_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalPerformer_ownedPort;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalPort_class;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalPort_type;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalSignalProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalSignalProperty_type;
import com.incquerylabs.magicdraw.benchmark.queries.OperationalStateDescription_owner;
import com.incquerylabs.magicdraw.benchmark.queries.OrganizationInEnterprise_client;
import com.incquerylabs.magicdraw.benchmark.queries.OrganizationInEnterprise_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsProcess_client;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsProcess_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsRiskInContext_client;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsRiskInContext_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsRisk_client;
import com.incquerylabs.magicdraw.benchmark.queries.OwnsRisk_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_FunctionAction_client;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_OperationalActivityAction_client;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_OperationalActivityAction_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_ProjectActivityAction_client;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_ResourceRole_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_ServiceFunctionAction_client;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_ServiceSpecificationRole_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_client_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ProblemDomain_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProblemDomain_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjecTheme_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProjecTheme_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectActivityAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectActivityAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectMilestoneRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectMilestoneRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectSequence_client;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectSequence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ProjectStatus_definingFeature;
import com.incquerylabs.magicdraw.benchmark.queries.ProtectsInContext_client;
import com.incquerylabs.magicdraw.benchmark.queries.ProtectsInContext_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.Protects_client;
import com.incquerylabs.magicdraw.benchmark.queries.Protects_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ProtocolLayer_class;
import com.incquerylabs.magicdraw.benchmark.queries.ProtocolLayer_type;
import com.incquerylabs.magicdraw.benchmark.queries.ProvidesCompetence_client;
import com.incquerylabs.magicdraw.benchmark.queries.ProvidesCompetence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.RequiresCompetence_client;
import com.incquerylabs.magicdraw.benchmark.queries.RequiresCompetence_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.ResoucePort_type;
import com.incquerylabs.magicdraw.benchmark.queries.ResouceRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceConnector_end;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceConstraint_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_informationSource;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_informationTarget;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_realizingActivityEdge;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_realizingConnector;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInteraction_realizingMessage;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceInterface_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceMethod_method;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceMethod_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ResourcePerformer_isCapableOfPerforming;
import com.incquerylabs.magicdraw.benchmark.queries.ResourcePerformer_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.ResourcePerformer_ownedPort;
import com.incquerylabs.magicdraw.benchmark.queries.ResourcePort_class;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceSignalProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceSignalProperty_type;
import com.incquerylabs.magicdraw.benchmark.queries.ResourceStateDescription_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ResponsibleFor_client;
import com.incquerylabs.magicdraw.benchmark.queries.ResponsibleFor_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.SameAs_client;
import com.incquerylabs.magicdraw.benchmark.queries.SameAs_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityControlAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityProperty_DataElement_type;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityProperty_InformationElement_type;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityProperty_OperationalAgent_type;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityProperty_ResourcePerformer_type;
import com.incquerylabs.magicdraw.benchmark.queries.SecurityProperty_class;
import com.incquerylabs.magicdraw.benchmark.queries.Security_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceConnector_end;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunctionAction_activity;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunctionAction_behavior;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceFunction_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceInterface_ownedOperation;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceMethod_method;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceMethod_ownedParameter;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceMethod_owner;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceParameter_type;
import com.incquerylabs.magicdraw.benchmark.queries.ServicePolicy_constrainedElement;
import com.incquerylabs.magicdraw.benchmark.queries.ServicePort_class;
import com.incquerylabs.magicdraw.benchmark.queries.ServicePort_type;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceSpecificationRole_class;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceSpecificationRole_type;
import com.incquerylabs.magicdraw.benchmark.queries.ServiceStateMachine_owner;
import com.incquerylabs.magicdraw.benchmark.queries.StructuralPart_class;
import com.incquerylabs.magicdraw.benchmark.queries.StructuralPart_type;
import com.incquerylabs.magicdraw.benchmark.queries.TemporalPart_class;
import com.incquerylabs.magicdraw.benchmark.queries.TemporalPart_type;
import com.incquerylabs.magicdraw.benchmark.queries.VersionOfConfiguration_class;
import com.incquerylabs.magicdraw.benchmark.queries.VersionOfConfiguration_type;
import com.incquerylabs.magicdraw.benchmark.queries.VersionSuccession_client;
import com.incquerylabs.magicdraw.benchmark.queries.VersionSuccession_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.VisionStatement_ownedAttribute;
import com.incquerylabs.magicdraw.benchmark.queries.internal.IsCapableOfPerforming_client_supplier;
import com.incquerylabs.magicdraw.benchmark.queries.internal.SecurityProperty_class_type;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in APerformanceQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.queries, the group contains the definition of the following patterns: <ul>
 * <li>OperationalRole_type</li>
 * <li>OperationalRole_class</li>
 * <li>OperationalPerformer_isCapableOfPerforming</li>
 * <li>OperationalPerformer_ownedPort</li>
 * <li>OperationalPerformer_ownedOperation</li>
 * <li>ProblemDomain_class</li>
 * <li>ProblemDomain_type</li>
 * <li>OperationalPort_class</li>
 * <li>OperationalPort_type</li>
 * <li>OperationalMethod_ownedParameter</li>
 * <li>OperationalMethod_method</li>
 * <li>OperationalParameter_type</li>
 * <li>ArbitraryConnector_client</li>
 * <li>ArbitraryConnector_supplier</li>
 * <li>ConceptRole_type</li>
 * <li>ConceptRole_class</li>
 * <li>OperationalConnector_end</li>
 * <li>OperationalInterface_ownedOperation</li>
 * <li>OperationalExchange_realizingConnector</li>
 * <li>OperationalExchange_realizingActivityEdge</li>
 * <li>OperationalExchange_informationSource</li>
 * <li>OperationalExchange_informationTarget</li>
 * <li>OperationalExchange_realizingMessage</li>
 * <li>OperationalSignalProperty_class</li>
 * <li>OperationalSignalProperty_type</li>
 * <li>OperationalConstraint_constrainedElement</li>
 * <li>InformationElement_owner</li>
 * <li>OperationalActivity_ownedParameter</li>
 * <li>OperationalActivityAction_behavior</li>
 * <li>OperationalActivityAction_activity</li>
 * <li>OperationalActivityEdge_owner</li>
 * <li>OperationalControlFlow_target</li>
 * <li>OperationalControlFlow_source</li>
 * <li>OperationalStateDescription_owner</li>
 * <li>Information_annotatedElement</li>
 * <li>Metadata_annotatedElement</li>
 * <li>ArchitectureMetadata_annotatedElement</li>
 * <li>IsCapableOfPerforming_client_supplier</li>
 * <li>IsCapableOfPerforming_OperationalActivity_client</li>
 * <li>IsCapableOfPerforming_ServiceFunction_client</li>
 * <li>IsCapableOfPerforming_Function_client</li>
 * <li>IsCapableOfPerforming_ProjectActivity_client</li>
 * <li>IsCapableOfPerforming_OperationalAgent_supplier</li>
 * <li>IsCapableOfPerforming_ServiceSpecification_supplier</li>
 * <li>IsCapableOfPerforming_ResourcePerformer_supplier</li>
 * <li>IsCapableOfPerforming_Project_supplier</li>
 * <li>PerformsInContext_client_supplier</li>
 * <li>PerformsInContext_OperationalActivityAction_client</li>
 * <li>PerformsInContext_ServiceFunctionAction_client</li>
 * <li>PerformsInContext_FunctionAction_client</li>
 * <li>PerformsInContext_ProjectActivityAction_client</li>
 * <li>PerformsInContext_OperationalActivityAction_supplier</li>
 * <li>PerformsInContext_ServiceSpecificationRole_supplier</li>
 * <li>PerformsInContext_ResourceRole_supplier</li>
 * <li>Implements_client_supplier</li>
 * <li>Implements_OperationalAgent_client</li>
 * <li>Implements_OperationalActivity_client</li>
 * <li>Implements_ServiceFunction_client</li>
 * <li>Implements_ServiceInterface_client</li>
 * <li>Implements_OperationalInterface_client</li>
 * <li>Implements_OperationalConnector_client</li>
 * <li>Implements_OperationalExchange_client</li>
 * <li>Implements_OperationalRole_client</li>
 * <li>Implements_ResourceConnector_client</li>
 * <li>Implements_ActualEnduringTask_client</li>
 * <li>Implements_InformationElement_client</li>
 * <li>Implements_ResourcePerformer_supplier</li>
 * <li>Implements_Function_supplier</li>
 * <li>Implements_ResourceInterface_supplier</li>
 * <li>Implements_ResourceConnector_supplier</li>
 * <li>Implements_ResourceExchange_supplier</li>
 * <li>Implements_ResourceRole_supplier</li>
 * <li>Implements_OperationalActivity_supplier</li>
 * <li>Implements_DataElement_supplier</li>
 * <li>ArchitecturalReference_client</li>
 * <li>ArchitecturalReference_supplier</li>
 * <li>ServicePort_type</li>
 * <li>ServicePort_class</li>
 * <li>ServiceSpecificationRole_type</li>
 * <li>ServiceSpecificationRole_class</li>
 * <li>ServiceMethod_ownedParameter</li>
 * <li>ServiceMethod_method</li>
 * <li>ServiceMethod_owner</li>
 * <li>ServiceParameter_type</li>
 * <li>ServiceConnector_end</li>
 * <li>ServiceInterface_ownedOperation</li>
 * <li>ServicePolicy_constrainedElement</li>
 * <li>ServiceFunction_ownedParameter</li>
 * <li>ServiceFunctionAction_behavior</li>
 * <li>ServiceFunctionAction_activity</li>
 * <li>ServiceStateMachine_owner</li>
 * <li>Consumes_client</li>
 * <li>Consumes_supplier</li>
 * <li>ResourceRole_class</li>
 * <li>ResouceRole_type</li>
 * <li>ResoucePort_type</li>
 * <li>ResourcePort_class</li>
 * <li>ResourceMethod_method</li>
 * <li>ResourceMethod_ownedParameter</li>
 * <li>ResourcePerformer_ownedOperation</li>
 * <li>ResourcePerformer_ownedPort</li>
 * <li>ResourcePerformer_isCapableOfPerforming</li>
 * <li>ResourceInteraction_realizingActivityEdge</li>
 * <li>ResourceInteraction_realizingConnector</li>
 * <li>ResourceInteraction_informationSource</li>
 * <li>ResourceInteraction_informationTarget</li>
 * <li>ResourceInteraction_realizingMessage</li>
 * <li>ResourceInterface_ownedOperation</li>
 * <li>ResourceConnector_end</li>
 * <li>ResourceSignalProperty_class</li>
 * <li>ResourceSignalProperty_type</li>
 * <li>ResourceConstraint_constrainedElement</li>
 * <li>DataElement_owner</li>
 * <li>Function_ownedParameter</li>
 * <li>FunctionAction_activity</li>
 * <li>FunctionAction_behavior</li>
 * <li>FunctionControlFlow_source</li>
 * <li>FunctionControlFlow_target</li>
 * <li>FunctionEdge_owner</li>
 * <li>Forecast_supplier</li>
 * <li>Forecast_client</li>
 * <li>VersionOfConfiguration_class</li>
 * <li>VersionOfConfiguration_type</li>
 * <li>VersionSuccession_client</li>
 * <li>VersionSuccession_supplier</li>
 * <li>ResourceStateDescription_owner</li>
 * <li>StructuralPart_class</li>
 * <li>StructuralPart_type</li>
 * <li>CapabilityProperty_class</li>
 * <li>CapabilityProperty_type</li>
 * <li>TemporalPart_class</li>
 * <li>TemporalPart_type</li>
 * <li>ActualEnterprisePhase_classifier</li>
 * <li>VisionStatement_ownedAttribute</li>
 * <li>ActualEnduringTask_classifier</li>
 * <li>CapabilityForTask_client</li>
 * <li>CapabilityForTask_supplier</li>
 * <li>AchievedEffect_client</li>
 * <li>AchievedEffect_supplier</li>
 * <li>DesiredEffect_client</li>
 * <li>DesiredEffect_supplier</li>
 * <li>Exhibits_client</li>
 * <li>Exhibits_supplier</li>
 * <li>MapsToCapability_client</li>
 * <li>MapsToCapability_supplier</li>
 * <li>OrganizationInEnterprise_supplier</li>
 * <li>OrganizationInEnterprise_client</li>
 * <li>ActualResponsibility_classifier</li>
 * <li>ActualPost_classifier</li>
 * <li>FieldedCapability_classifier</li>
 * <li>ActualOrganization_classifier</li>
 * <li>ActualOrganization_slot</li>
 * <li>ActualResource_classifier</li>
 * <li>ActualPerson_classifier</li>
 * <li>ActualResourceRole_definingFeature</li>
 * <li>ActualResourceRole_owningInstance</li>
 * <li>ActualOrganizationRole_owningInstance</li>
 * <li>ActualResourceRelationship_informationSource</li>
 * <li>ActualResourceRelationship_realizes</li>
 * <li>ActualResourceRelationship_informationTarget</li>
 * <li>FillsPost_client</li>
 * <li>FillsPost_supplier</li>
 * <li>ActualService_classifier</li>
 * <li>ProvidesCompetence_client</li>
 * <li>ProvidesCompetence_supplier</li>
 * <li>OwnsProcess_supplier</li>
 * <li>OwnsProcess_client</li>
 * <li>CompetenceForRole_client</li>
 * <li>CompetenceForRole_supplier</li>
 * <li>RequiresCompetence_client</li>
 * <li>RequiresCompetence_supplier</li>
 * <li>CompetenceToConduct_client</li>
 * <li>CompetenceToConduct_supplier</li>
 * <li>Control_conveyed</li>
 * <li>Control_informationTarget</li>
 * <li>Control_informationSource</li>
 * <li>Command_informationSource</li>
 * <li>Command_informationTarget</li>
 * <li>Command_conveyed</li>
 * <li>ResponsibleFor_client</li>
 * <li>ResponsibleFor_supplier</li>
 * <li>Security_constrainedElement</li>
 * <li>SecurityControlAction_behavior</li>
 * <li>Enhances_client</li>
 * <li>Enhances_supplier</li>
 * <li>Protects_client</li>
 * <li>Protects_supplier</li>
 * <li>ProtectsInContext_client</li>
 * <li>ProtectsInContext_supplier</li>
 * <li>SecurityProperty_class_type</li>
 * <li>SecurityProperty_OperationalAgent_type</li>
 * <li>SecurityProperty_ResourcePerformer_type</li>
 * <li>SecurityProperty_InformationElement_type</li>
 * <li>SecurityProperty_DataElement_type</li>
 * <li>SecurityProperty_class</li>
 * <li>Affects_client</li>
 * <li>Affects_supplier</li>
 * <li>Mitigates_client</li>
 * <li>Mitigates_supplier</li>
 * <li>OwnsRisk_client</li>
 * <li>OwnsRisk_supplier</li>
 * <li>OwnsRiskInContext_client</li>
 * <li>OwnsRiskInContext_supplier</li>
 * <li>AffectsInContext_client</li>
 * <li>AffectsInContext_supplier</li>
 * <li>ProtocolLayer_class</li>
 * <li>ProtocolLayer_type</li>
 * <li>ProjectSequence_client</li>
 * <li>ProjectSequence_supplier</li>
 * <li>MilestoneDependency_client</li>
 * <li>MilestoneSequence_supplier</li>
 * <li>ProjectActivityAction_activity</li>
 * <li>ProjectActivityAction_behavior</li>
 * <li>ActualProjectMilestoneRole_definingFeature</li>
 * <li>ActualProjectMilestoneRole_owningInstance</li>
 * <li>ActualProjectMilestoneRole_value_instance</li>
 * <li>ActualProjectRole_definingFeature</li>
 * <li>ActualProjectRole_owningInstance</li>
 * <li>ActualProjectRole_value_instance</li>
 * <li>ActualProject_classifier</li>
 * <li>ActualProject_slot</li>
 * <li>ActualProjectMilestone_classifier</li>
 * <li>ProjectRole_class</li>
 * <li>ProjectRole_type</li>
 * <li>ProjectMilestoneRole_class</li>
 * <li>ProjectMilestoneRole_type</li>
 * <li>ProjecTheme_type</li>
 * <li>ProjecTheme_class</li>
 * <li>ProjectStatus_definingFeature</li>
 * <li>Alias_annotatedElement</li>
 * <li>Definition_annotatedElement</li>
 * <li>SameAs_client</li>
 * <li>SameAs_supplier</li>
 * <li>EnvironmentalProperty_class</li>
 * <li>EnvironmentalProperty_type</li>
 * <li>ActualCondition_classifier</li>
 * <li>Measurement_class</li>
 * <li>ActualMeasurement_definingFeature</li>
 * <li>ActualMeasurement_owningInstance</li>
 * <li>ActualEnvironment_classifier</li>
 * <li>ActualMeasurementSet_classifier</li>
 * <li>ActualMeasurementSet_slot</li>
 * <li>ActualPropertySet_classifier</li>
 * <li>ActualLocation_classifier</li>
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
    querySpecifications.add(OperationalRole_type.instance());
    querySpecifications.add(OperationalRole_class.instance());
    querySpecifications.add(OperationalPerformer_isCapableOfPerforming.instance());
    querySpecifications.add(OperationalPerformer_ownedPort.instance());
    querySpecifications.add(OperationalPerformer_ownedOperation.instance());
    querySpecifications.add(ProblemDomain_class.instance());
    querySpecifications.add(ProblemDomain_type.instance());
    querySpecifications.add(OperationalPort_class.instance());
    querySpecifications.add(OperationalPort_type.instance());
    querySpecifications.add(OperationalMethod_ownedParameter.instance());
    querySpecifications.add(OperationalMethod_method.instance());
    querySpecifications.add(OperationalParameter_type.instance());
    querySpecifications.add(ArbitraryConnector_client.instance());
    querySpecifications.add(ArbitraryConnector_supplier.instance());
    querySpecifications.add(ConceptRole_type.instance());
    querySpecifications.add(ConceptRole_class.instance());
    querySpecifications.add(OperationalConnector_end.instance());
    querySpecifications.add(OperationalInterface_ownedOperation.instance());
    querySpecifications.add(OperationalExchange_realizingConnector.instance());
    querySpecifications.add(OperationalExchange_realizingActivityEdge.instance());
    querySpecifications.add(OperationalExchange_informationSource.instance());
    querySpecifications.add(OperationalExchange_informationTarget.instance());
    querySpecifications.add(OperationalExchange_realizingMessage.instance());
    querySpecifications.add(OperationalSignalProperty_class.instance());
    querySpecifications.add(OperationalSignalProperty_type.instance());
    querySpecifications.add(OperationalConstraint_constrainedElement.instance());
    querySpecifications.add(InformationElement_owner.instance());
    querySpecifications.add(OperationalActivity_ownedParameter.instance());
    querySpecifications.add(OperationalActivityAction_behavior.instance());
    querySpecifications.add(OperationalActivityAction_activity.instance());
    querySpecifications.add(OperationalActivityEdge_owner.instance());
    querySpecifications.add(OperationalControlFlow_target.instance());
    querySpecifications.add(OperationalControlFlow_source.instance());
    querySpecifications.add(OperationalStateDescription_owner.instance());
    querySpecifications.add(Information_annotatedElement.instance());
    querySpecifications.add(Metadata_annotatedElement.instance());
    querySpecifications.add(ArchitectureMetadata_annotatedElement.instance());
    querySpecifications.add(IsCapableOfPerforming_client_supplier.instance());
    querySpecifications.add(IsCapableOfPerforming_OperationalActivity_client.instance());
    querySpecifications.add(IsCapableOfPerforming_ServiceFunction_client.instance());
    querySpecifications.add(IsCapableOfPerforming_Function_client.instance());
    querySpecifications.add(IsCapableOfPerforming_ProjectActivity_client.instance());
    querySpecifications.add(IsCapableOfPerforming_OperationalAgent_supplier.instance());
    querySpecifications.add(IsCapableOfPerforming_ServiceSpecification_supplier.instance());
    querySpecifications.add(IsCapableOfPerforming_ResourcePerformer_supplier.instance());
    querySpecifications.add(IsCapableOfPerforming_Project_supplier.instance());
    querySpecifications.add(PerformsInContext_client_supplier.instance());
    querySpecifications.add(PerformsInContext_OperationalActivityAction_client.instance());
    querySpecifications.add(PerformsInContext_ServiceFunctionAction_client.instance());
    querySpecifications.add(PerformsInContext_FunctionAction_client.instance());
    querySpecifications.add(PerformsInContext_ProjectActivityAction_client.instance());
    querySpecifications.add(PerformsInContext_OperationalActivityAction_supplier.instance());
    querySpecifications.add(PerformsInContext_ServiceSpecificationRole_supplier.instance());
    querySpecifications.add(PerformsInContext_ResourceRole_supplier.instance());
    querySpecifications.add(Implements_client_supplier.instance());
    querySpecifications.add(Implements_OperationalAgent_client.instance());
    querySpecifications.add(Implements_OperationalActivity_client.instance());
    querySpecifications.add(Implements_ServiceFunction_client.instance());
    querySpecifications.add(Implements_ServiceInterface_client.instance());
    querySpecifications.add(Implements_OperationalInterface_client.instance());
    querySpecifications.add(Implements_OperationalConnector_client.instance());
    querySpecifications.add(Implements_OperationalExchange_client.instance());
    querySpecifications.add(Implements_OperationalRole_client.instance());
    querySpecifications.add(Implements_ResourceConnector_client.instance());
    querySpecifications.add(Implements_ActualEnduringTask_client.instance());
    querySpecifications.add(Implements_InformationElement_client.instance());
    querySpecifications.add(Implements_ResourcePerformer_supplier.instance());
    querySpecifications.add(Implements_Function_supplier.instance());
    querySpecifications.add(Implements_ResourceInterface_supplier.instance());
    querySpecifications.add(Implements_ResourceConnector_supplier.instance());
    querySpecifications.add(Implements_ResourceExchange_supplier.instance());
    querySpecifications.add(Implements_ResourceRole_supplier.instance());
    querySpecifications.add(Implements_OperationalActivity_supplier.instance());
    querySpecifications.add(Implements_DataElement_supplier.instance());
    querySpecifications.add(ArchitecturalReference_client.instance());
    querySpecifications.add(ArchitecturalReference_supplier.instance());
    querySpecifications.add(ServicePort_type.instance());
    querySpecifications.add(ServicePort_class.instance());
    querySpecifications.add(ServiceSpecificationRole_type.instance());
    querySpecifications.add(ServiceSpecificationRole_class.instance());
    querySpecifications.add(ServiceMethod_ownedParameter.instance());
    querySpecifications.add(ServiceMethod_method.instance());
    querySpecifications.add(ServiceMethod_owner.instance());
    querySpecifications.add(ServiceParameter_type.instance());
    querySpecifications.add(ServiceConnector_end.instance());
    querySpecifications.add(ServiceInterface_ownedOperation.instance());
    querySpecifications.add(ServicePolicy_constrainedElement.instance());
    querySpecifications.add(ServiceFunction_ownedParameter.instance());
    querySpecifications.add(ServiceFunctionAction_behavior.instance());
    querySpecifications.add(ServiceFunctionAction_activity.instance());
    querySpecifications.add(ServiceStateMachine_owner.instance());
    querySpecifications.add(Consumes_client.instance());
    querySpecifications.add(Consumes_supplier.instance());
    querySpecifications.add(ResourceRole_class.instance());
    querySpecifications.add(ResouceRole_type.instance());
    querySpecifications.add(ResoucePort_type.instance());
    querySpecifications.add(ResourcePort_class.instance());
    querySpecifications.add(ResourceMethod_method.instance());
    querySpecifications.add(ResourceMethod_ownedParameter.instance());
    querySpecifications.add(ResourcePerformer_ownedOperation.instance());
    querySpecifications.add(ResourcePerformer_ownedPort.instance());
    querySpecifications.add(ResourcePerformer_isCapableOfPerforming.instance());
    querySpecifications.add(ResourceInteraction_realizingActivityEdge.instance());
    querySpecifications.add(ResourceInteraction_realizingConnector.instance());
    querySpecifications.add(ResourceInteraction_informationSource.instance());
    querySpecifications.add(ResourceInteraction_informationTarget.instance());
    querySpecifications.add(ResourceInteraction_realizingMessage.instance());
    querySpecifications.add(ResourceInterface_ownedOperation.instance());
    querySpecifications.add(ResourceConnector_end.instance());
    querySpecifications.add(ResourceSignalProperty_class.instance());
    querySpecifications.add(ResourceSignalProperty_type.instance());
    querySpecifications.add(ResourceConstraint_constrainedElement.instance());
    querySpecifications.add(DataElement_owner.instance());
    querySpecifications.add(Function_ownedParameter.instance());
    querySpecifications.add(FunctionAction_activity.instance());
    querySpecifications.add(FunctionAction_behavior.instance());
    querySpecifications.add(FunctionControlFlow_source.instance());
    querySpecifications.add(FunctionControlFlow_target.instance());
    querySpecifications.add(FunctionEdge_owner.instance());
    querySpecifications.add(Forecast_supplier.instance());
    querySpecifications.add(Forecast_client.instance());
    querySpecifications.add(VersionOfConfiguration_class.instance());
    querySpecifications.add(VersionOfConfiguration_type.instance());
    querySpecifications.add(VersionSuccession_client.instance());
    querySpecifications.add(VersionSuccession_supplier.instance());
    querySpecifications.add(ResourceStateDescription_owner.instance());
    querySpecifications.add(StructuralPart_class.instance());
    querySpecifications.add(StructuralPart_type.instance());
    querySpecifications.add(CapabilityProperty_class.instance());
    querySpecifications.add(CapabilityProperty_type.instance());
    querySpecifications.add(TemporalPart_class.instance());
    querySpecifications.add(TemporalPart_type.instance());
    querySpecifications.add(ActualEnterprisePhase_classifier.instance());
    querySpecifications.add(VisionStatement_ownedAttribute.instance());
    querySpecifications.add(ActualEnduringTask_classifier.instance());
    querySpecifications.add(CapabilityForTask_client.instance());
    querySpecifications.add(CapabilityForTask_supplier.instance());
    querySpecifications.add(AchievedEffect_client.instance());
    querySpecifications.add(AchievedEffect_supplier.instance());
    querySpecifications.add(DesiredEffect_client.instance());
    querySpecifications.add(DesiredEffect_supplier.instance());
    querySpecifications.add(Exhibits_client.instance());
    querySpecifications.add(Exhibits_supplier.instance());
    querySpecifications.add(MapsToCapability_client.instance());
    querySpecifications.add(MapsToCapability_supplier.instance());
    querySpecifications.add(OrganizationInEnterprise_supplier.instance());
    querySpecifications.add(OrganizationInEnterprise_client.instance());
    querySpecifications.add(ActualResponsibility_classifier.instance());
    querySpecifications.add(ActualPost_classifier.instance());
    querySpecifications.add(FieldedCapability_classifier.instance());
    querySpecifications.add(ActualOrganization_classifier.instance());
    querySpecifications.add(ActualOrganization_slot.instance());
    querySpecifications.add(ActualResource_classifier.instance());
    querySpecifications.add(ActualPerson_classifier.instance());
    querySpecifications.add(ActualResourceRole_definingFeature.instance());
    querySpecifications.add(ActualResourceRole_owningInstance.instance());
    querySpecifications.add(ActualOrganizationRole_owningInstance.instance());
    querySpecifications.add(ActualResourceRelationship_informationSource.instance());
    querySpecifications.add(ActualResourceRelationship_realizes.instance());
    querySpecifications.add(ActualResourceRelationship_informationTarget.instance());
    querySpecifications.add(FillsPost_client.instance());
    querySpecifications.add(FillsPost_supplier.instance());
    querySpecifications.add(ActualService_classifier.instance());
    querySpecifications.add(ProvidesCompetence_client.instance());
    querySpecifications.add(ProvidesCompetence_supplier.instance());
    querySpecifications.add(OwnsProcess_supplier.instance());
    querySpecifications.add(OwnsProcess_client.instance());
    querySpecifications.add(CompetenceForRole_client.instance());
    querySpecifications.add(CompetenceForRole_supplier.instance());
    querySpecifications.add(RequiresCompetence_client.instance());
    querySpecifications.add(RequiresCompetence_supplier.instance());
    querySpecifications.add(CompetenceToConduct_client.instance());
    querySpecifications.add(CompetenceToConduct_supplier.instance());
    querySpecifications.add(Control_conveyed.instance());
    querySpecifications.add(Control_informationTarget.instance());
    querySpecifications.add(Control_informationSource.instance());
    querySpecifications.add(Command_informationSource.instance());
    querySpecifications.add(Command_informationTarget.instance());
    querySpecifications.add(Command_conveyed.instance());
    querySpecifications.add(ResponsibleFor_client.instance());
    querySpecifications.add(ResponsibleFor_supplier.instance());
    querySpecifications.add(Security_constrainedElement.instance());
    querySpecifications.add(SecurityControlAction_behavior.instance());
    querySpecifications.add(Enhances_client.instance());
    querySpecifications.add(Enhances_supplier.instance());
    querySpecifications.add(Protects_client.instance());
    querySpecifications.add(Protects_supplier.instance());
    querySpecifications.add(ProtectsInContext_client.instance());
    querySpecifications.add(ProtectsInContext_supplier.instance());
    querySpecifications.add(SecurityProperty_class_type.instance());
    querySpecifications.add(SecurityProperty_OperationalAgent_type.instance());
    querySpecifications.add(SecurityProperty_ResourcePerformer_type.instance());
    querySpecifications.add(SecurityProperty_InformationElement_type.instance());
    querySpecifications.add(SecurityProperty_DataElement_type.instance());
    querySpecifications.add(SecurityProperty_class.instance());
    querySpecifications.add(Affects_client.instance());
    querySpecifications.add(Affects_supplier.instance());
    querySpecifications.add(Mitigates_client.instance());
    querySpecifications.add(Mitigates_supplier.instance());
    querySpecifications.add(OwnsRisk_client.instance());
    querySpecifications.add(OwnsRisk_supplier.instance());
    querySpecifications.add(OwnsRiskInContext_client.instance());
    querySpecifications.add(OwnsRiskInContext_supplier.instance());
    querySpecifications.add(AffectsInContext_client.instance());
    querySpecifications.add(AffectsInContext_supplier.instance());
    querySpecifications.add(ProtocolLayer_class.instance());
    querySpecifications.add(ProtocolLayer_type.instance());
    querySpecifications.add(ProjectSequence_client.instance());
    querySpecifications.add(ProjectSequence_supplier.instance());
    querySpecifications.add(MilestoneDependency_client.instance());
    querySpecifications.add(MilestoneSequence_supplier.instance());
    querySpecifications.add(ProjectActivityAction_activity.instance());
    querySpecifications.add(ProjectActivityAction_behavior.instance());
    querySpecifications.add(ActualProjectMilestoneRole_definingFeature.instance());
    querySpecifications.add(ActualProjectMilestoneRole_owningInstance.instance());
    querySpecifications.add(ActualProjectMilestoneRole_value_instance.instance());
    querySpecifications.add(ActualProjectRole_definingFeature.instance());
    querySpecifications.add(ActualProjectRole_owningInstance.instance());
    querySpecifications.add(ActualProjectRole_value_instance.instance());
    querySpecifications.add(ActualProject_classifier.instance());
    querySpecifications.add(ActualProject_slot.instance());
    querySpecifications.add(ActualProjectMilestone_classifier.instance());
    querySpecifications.add(ProjectRole_class.instance());
    querySpecifications.add(ProjectRole_type.instance());
    querySpecifications.add(ProjectMilestoneRole_class.instance());
    querySpecifications.add(ProjectMilestoneRole_type.instance());
    querySpecifications.add(ProjecTheme_type.instance());
    querySpecifications.add(ProjecTheme_class.instance());
    querySpecifications.add(ProjectStatus_definingFeature.instance());
    querySpecifications.add(Alias_annotatedElement.instance());
    querySpecifications.add(Definition_annotatedElement.instance());
    querySpecifications.add(SameAs_client.instance());
    querySpecifications.add(SameAs_supplier.instance());
    querySpecifications.add(EnvironmentalProperty_class.instance());
    querySpecifications.add(EnvironmentalProperty_type.instance());
    querySpecifications.add(ActualCondition_classifier.instance());
    querySpecifications.add(Measurement_class.instance());
    querySpecifications.add(ActualMeasurement_definingFeature.instance());
    querySpecifications.add(ActualMeasurement_owningInstance.instance());
    querySpecifications.add(ActualEnvironment_classifier.instance());
    querySpecifications.add(ActualMeasurementSet_classifier.instance());
    querySpecifications.add(ActualMeasurementSet_slot.instance());
    querySpecifications.add(ActualPropertySet_classifier.instance());
    querySpecifications.add(ActualLocation_classifier.instance());
  }
}
