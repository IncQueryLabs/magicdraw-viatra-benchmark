/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

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
  
  public OperationalRole_type getOperationalRole_type() {
    return OperationalRole_type.instance();
  }
  
  public OperationalRole_type.Matcher getOperationalRole_type(final ViatraQueryEngine engine) {
    return OperationalRole_type.Matcher.on(engine);
  }
  
  public OperationalRole_class getOperationalRole_class() {
    return OperationalRole_class.instance();
  }
  
  public OperationalRole_class.Matcher getOperationalRole_class(final ViatraQueryEngine engine) {
    return OperationalRole_class.Matcher.on(engine);
  }
  
  public OperationalPerformer_isCapableOfPerforming getOperationalPerformer_isCapableOfPerforming() {
    return OperationalPerformer_isCapableOfPerforming.instance();
  }
  
  public OperationalPerformer_isCapableOfPerforming.Matcher getOperationalPerformer_isCapableOfPerforming(final ViatraQueryEngine engine) {
    return OperationalPerformer_isCapableOfPerforming.Matcher.on(engine);
  }
  
  public OperationalPerformer_ownedPort getOperationalPerformer_ownedPort() {
    return OperationalPerformer_ownedPort.instance();
  }
  
  public OperationalPerformer_ownedPort.Matcher getOperationalPerformer_ownedPort(final ViatraQueryEngine engine) {
    return OperationalPerformer_ownedPort.Matcher.on(engine);
  }
  
  public OperationalPerformer_ownedOperation getOperationalPerformer_ownedOperation() {
    return OperationalPerformer_ownedOperation.instance();
  }
  
  public OperationalPerformer_ownedOperation.Matcher getOperationalPerformer_ownedOperation(final ViatraQueryEngine engine) {
    return OperationalPerformer_ownedOperation.Matcher.on(engine);
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
  
  public OperationalPort_class getOperationalPort_class() {
    return OperationalPort_class.instance();
  }
  
  public OperationalPort_class.Matcher getOperationalPort_class(final ViatraQueryEngine engine) {
    return OperationalPort_class.Matcher.on(engine);
  }
  
  public OperationalPort_type getOperationalPort_type() {
    return OperationalPort_type.instance();
  }
  
  public OperationalPort_type.Matcher getOperationalPort_type(final ViatraQueryEngine engine) {
    return OperationalPort_type.Matcher.on(engine);
  }
  
  public OperationalMethod_ownedParameter getOperationalMethod_ownedParameter() {
    return OperationalMethod_ownedParameter.instance();
  }
  
  public OperationalMethod_ownedParameter.Matcher getOperationalMethod_ownedParameter(final ViatraQueryEngine engine) {
    return OperationalMethod_ownedParameter.Matcher.on(engine);
  }
  
  public OperationalMethod_method getOperationalMethod_method() {
    return OperationalMethod_method.instance();
  }
  
  public OperationalMethod_method.Matcher getOperationalMethod_method(final ViatraQueryEngine engine) {
    return OperationalMethod_method.Matcher.on(engine);
  }
  
  public OperationalParameter_type getOperationalParameter_type() {
    return OperationalParameter_type.instance();
  }
  
  public OperationalParameter_type.Matcher getOperationalParameter_type(final ViatraQueryEngine engine) {
    return OperationalParameter_type.Matcher.on(engine);
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
  
  public ConceptRole_type getConceptRole_type() {
    return ConceptRole_type.instance();
  }
  
  public ConceptRole_type.Matcher getConceptRole_type(final ViatraQueryEngine engine) {
    return ConceptRole_type.Matcher.on(engine);
  }
  
  public ConceptRole_class getConceptRole_class() {
    return ConceptRole_class.instance();
  }
  
  public ConceptRole_class.Matcher getConceptRole_class(final ViatraQueryEngine engine) {
    return ConceptRole_class.Matcher.on(engine);
  }
  
  public OperationalConnector_end getOperationalConnector_end() {
    return OperationalConnector_end.instance();
  }
  
  public OperationalConnector_end.Matcher getOperationalConnector_end(final ViatraQueryEngine engine) {
    return OperationalConnector_end.Matcher.on(engine);
  }
  
  public OperationalInterface_ownedOperation getOperationalInterface_ownedOperation() {
    return OperationalInterface_ownedOperation.instance();
  }
  
  public OperationalInterface_ownedOperation.Matcher getOperationalInterface_ownedOperation(final ViatraQueryEngine engine) {
    return OperationalInterface_ownedOperation.Matcher.on(engine);
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
  
  public OperationalSignalProperty_class getOperationalSignalProperty_class() {
    return OperationalSignalProperty_class.instance();
  }
  
  public OperationalSignalProperty_class.Matcher getOperationalSignalProperty_class(final ViatraQueryEngine engine) {
    return OperationalSignalProperty_class.Matcher.on(engine);
  }
  
  public OperationalSignalProperty_type getOperationalSignalProperty_type() {
    return OperationalSignalProperty_type.instance();
  }
  
  public OperationalSignalProperty_type.Matcher getOperationalSignalProperty_type(final ViatraQueryEngine engine) {
    return OperationalSignalProperty_type.Matcher.on(engine);
  }
  
  public OperationalConstraint_constrainedElement getOperationalConstraint_constrainedElement() {
    return OperationalConstraint_constrainedElement.instance();
  }
  
  public OperationalConstraint_constrainedElement.Matcher getOperationalConstraint_constrainedElement(final ViatraQueryEngine engine) {
    return OperationalConstraint_constrainedElement.Matcher.on(engine);
  }
  
  public InformationElement_owner getInformationElement_owner() {
    return InformationElement_owner.instance();
  }
  
  public InformationElement_owner.Matcher getInformationElement_owner(final ViatraQueryEngine engine) {
    return InformationElement_owner.Matcher.on(engine);
  }
  
  public OperationalActivity_ownedParameter getOperationalActivity_ownedParameter() {
    return OperationalActivity_ownedParameter.instance();
  }
  
  public OperationalActivity_ownedParameter.Matcher getOperationalActivity_ownedParameter(final ViatraQueryEngine engine) {
    return OperationalActivity_ownedParameter.Matcher.on(engine);
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
  
  public OperationalActivityEdge_owner getOperationalActivityEdge_owner() {
    return OperationalActivityEdge_owner.instance();
  }
  
  public OperationalActivityEdge_owner.Matcher getOperationalActivityEdge_owner(final ViatraQueryEngine engine) {
    return OperationalActivityEdge_owner.Matcher.on(engine);
  }
  
  public OperationalControlFlow_target getOperationalControlFlow_target() {
    return OperationalControlFlow_target.instance();
  }
  
  public OperationalControlFlow_target.Matcher getOperationalControlFlow_target(final ViatraQueryEngine engine) {
    return OperationalControlFlow_target.Matcher.on(engine);
  }
  
  public OperationalControlFlow_source getOperationalControlFlow_source() {
    return OperationalControlFlow_source.instance();
  }
  
  public OperationalControlFlow_source.Matcher getOperationalControlFlow_source(final ViatraQueryEngine engine) {
    return OperationalControlFlow_source.Matcher.on(engine);
  }
  
  public OperationalStateDescription_owner getOperationalStateDescription_owner() {
    return OperationalStateDescription_owner.instance();
  }
  
  public OperationalStateDescription_owner.Matcher getOperationalStateDescription_owner(final ViatraQueryEngine engine) {
    return OperationalStateDescription_owner.Matcher.on(engine);
  }
  
  public Information_annotatedElement getInformation_annotatedElement() {
    return Information_annotatedElement.instance();
  }
  
  public Information_annotatedElement.Matcher getInformation_annotatedElement(final ViatraQueryEngine engine) {
    return Information_annotatedElement.Matcher.on(engine);
  }
  
  public Metadata_annotatedElement getMetadata_annotatedElement() {
    return Metadata_annotatedElement.instance();
  }
  
  public Metadata_annotatedElement.Matcher getMetadata_annotatedElement(final ViatraQueryEngine engine) {
    return Metadata_annotatedElement.Matcher.on(engine);
  }
  
  public ArchitectureMetadata_annotatedElement getArchitectureMetadata_annotatedElement() {
    return ArchitectureMetadata_annotatedElement.instance();
  }
  
  public ArchitectureMetadata_annotatedElement.Matcher getArchitectureMetadata_annotatedElement(final ViatraQueryEngine engine) {
    return ArchitectureMetadata_annotatedElement.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_OperationalActivity_client getIsCapableOfPerforming_OperationalActivity_client() {
    return IsCapableOfPerforming_OperationalActivity_client.instance();
  }
  
  public IsCapableOfPerforming_OperationalActivity_client.Matcher getIsCapableOfPerforming_OperationalActivity_client(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_OperationalActivity_client.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_ServiceFunction_client getIsCapableOfPerforming_ServiceFunction_client() {
    return IsCapableOfPerforming_ServiceFunction_client.instance();
  }
  
  public IsCapableOfPerforming_ServiceFunction_client.Matcher getIsCapableOfPerforming_ServiceFunction_client(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_ServiceFunction_client.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_Function_client getIsCapableOfPerforming_Function_client() {
    return IsCapableOfPerforming_Function_client.instance();
  }
  
  public IsCapableOfPerforming_Function_client.Matcher getIsCapableOfPerforming_Function_client(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_Function_client.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_ProjectActivity_client getIsCapableOfPerforming_ProjectActivity_client() {
    return IsCapableOfPerforming_ProjectActivity_client.instance();
  }
  
  public IsCapableOfPerforming_ProjectActivity_client.Matcher getIsCapableOfPerforming_ProjectActivity_client(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_ProjectActivity_client.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_OperationalAgent_supplier getIsCapableOfPerforming_OperationalAgent_supplier() {
    return IsCapableOfPerforming_OperationalAgent_supplier.instance();
  }
  
  public IsCapableOfPerforming_OperationalAgent_supplier.Matcher getIsCapableOfPerforming_OperationalAgent_supplier(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_OperationalAgent_supplier.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_ServiceSpecification_supplier getIsCapableOfPerforming_ServiceSpecification_supplier() {
    return IsCapableOfPerforming_ServiceSpecification_supplier.instance();
  }
  
  public IsCapableOfPerforming_ServiceSpecification_supplier.Matcher getIsCapableOfPerforming_ServiceSpecification_supplier(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_ServiceSpecification_supplier.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_ResourcePerformer_supplier getIsCapableOfPerforming_ResourcePerformer_supplier() {
    return IsCapableOfPerforming_ResourcePerformer_supplier.instance();
  }
  
  public IsCapableOfPerforming_ResourcePerformer_supplier.Matcher getIsCapableOfPerforming_ResourcePerformer_supplier(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_ResourcePerformer_supplier.Matcher.on(engine);
  }
  
  public IsCapableOfPerforming_Project_supplier getIsCapableOfPerforming_Project_supplier() {
    return IsCapableOfPerforming_Project_supplier.instance();
  }
  
  public IsCapableOfPerforming_Project_supplier.Matcher getIsCapableOfPerforming_Project_supplier(final ViatraQueryEngine engine) {
    return IsCapableOfPerforming_Project_supplier.Matcher.on(engine);
  }
  
  public PerformsInContext_client_supplier getPerformsInContext_client_supplier() {
    return PerformsInContext_client_supplier.instance();
  }
  
  public PerformsInContext_client_supplier.Matcher getPerformsInContext_client_supplier(final ViatraQueryEngine engine) {
    return PerformsInContext_client_supplier.Matcher.on(engine);
  }
  
  public PerformsInContext_OperationalActivityAction_client getPerformsInContext_OperationalActivityAction_client() {
    return PerformsInContext_OperationalActivityAction_client.instance();
  }
  
  public PerformsInContext_OperationalActivityAction_client.Matcher getPerformsInContext_OperationalActivityAction_client(final ViatraQueryEngine engine) {
    return PerformsInContext_OperationalActivityAction_client.Matcher.on(engine);
  }
  
  public PerformsInContext_ServiceFunctionAction_client getPerformsInContext_ServiceFunctionAction_client() {
    return PerformsInContext_ServiceFunctionAction_client.instance();
  }
  
  public PerformsInContext_ServiceFunctionAction_client.Matcher getPerformsInContext_ServiceFunctionAction_client(final ViatraQueryEngine engine) {
    return PerformsInContext_ServiceFunctionAction_client.Matcher.on(engine);
  }
  
  public PerformsInContext_FunctionAction_client getPerformsInContext_FunctionAction_client() {
    return PerformsInContext_FunctionAction_client.instance();
  }
  
  public PerformsInContext_FunctionAction_client.Matcher getPerformsInContext_FunctionAction_client(final ViatraQueryEngine engine) {
    return PerformsInContext_FunctionAction_client.Matcher.on(engine);
  }
  
  public PerformsInContext_ProjectActivityAction_client getPerformsInContext_ProjectActivityAction_client() {
    return PerformsInContext_ProjectActivityAction_client.instance();
  }
  
  public PerformsInContext_ProjectActivityAction_client.Matcher getPerformsInContext_ProjectActivityAction_client(final ViatraQueryEngine engine) {
    return PerformsInContext_ProjectActivityAction_client.Matcher.on(engine);
  }
  
  public PerformsInContext_OperationalActivityAction_supplier getPerformsInContext_OperationalActivityAction_supplier() {
    return PerformsInContext_OperationalActivityAction_supplier.instance();
  }
  
  public PerformsInContext_OperationalActivityAction_supplier.Matcher getPerformsInContext_OperationalActivityAction_supplier(final ViatraQueryEngine engine) {
    return PerformsInContext_OperationalActivityAction_supplier.Matcher.on(engine);
  }
  
  public PerformsInContext_ServiceSpecificationRole_supplier getPerformsInContext_ServiceSpecificationRole_supplier() {
    return PerformsInContext_ServiceSpecificationRole_supplier.instance();
  }
  
  public PerformsInContext_ServiceSpecificationRole_supplier.Matcher getPerformsInContext_ServiceSpecificationRole_supplier(final ViatraQueryEngine engine) {
    return PerformsInContext_ServiceSpecificationRole_supplier.Matcher.on(engine);
  }
  
  public PerformsInContext_ResourceRole_supplier getPerformsInContext_ResourceRole_supplier() {
    return PerformsInContext_ResourceRole_supplier.instance();
  }
  
  public PerformsInContext_ResourceRole_supplier.Matcher getPerformsInContext_ResourceRole_supplier(final ViatraQueryEngine engine) {
    return PerformsInContext_ResourceRole_supplier.Matcher.on(engine);
  }
  
  public Implements_client_supplier getImplements_client_supplier() {
    return Implements_client_supplier.instance();
  }
  
  public Implements_client_supplier.Matcher getImplements_client_supplier(final ViatraQueryEngine engine) {
    return Implements_client_supplier.Matcher.on(engine);
  }
  
  public Implements_OperationalAgent_client getImplements_OperationalAgent_client() {
    return Implements_OperationalAgent_client.instance();
  }
  
  public Implements_OperationalAgent_client.Matcher getImplements_OperationalAgent_client(final ViatraQueryEngine engine) {
    return Implements_OperationalAgent_client.Matcher.on(engine);
  }
  
  public Implements_OperationalActivity_client getImplements_OperationalActivity_client() {
    return Implements_OperationalActivity_client.instance();
  }
  
  public Implements_OperationalActivity_client.Matcher getImplements_OperationalActivity_client(final ViatraQueryEngine engine) {
    return Implements_OperationalActivity_client.Matcher.on(engine);
  }
  
  public Implements_ServiceFunction_client getImplements_ServiceFunction_client() {
    return Implements_ServiceFunction_client.instance();
  }
  
  public Implements_ServiceFunction_client.Matcher getImplements_ServiceFunction_client(final ViatraQueryEngine engine) {
    return Implements_ServiceFunction_client.Matcher.on(engine);
  }
  
  public Implements_ServiceInterface_client getImplements_ServiceInterface_client() {
    return Implements_ServiceInterface_client.instance();
  }
  
  public Implements_ServiceInterface_client.Matcher getImplements_ServiceInterface_client(final ViatraQueryEngine engine) {
    return Implements_ServiceInterface_client.Matcher.on(engine);
  }
  
  public Implements_OperationalInterface_client getImplements_OperationalInterface_client() {
    return Implements_OperationalInterface_client.instance();
  }
  
  public Implements_OperationalInterface_client.Matcher getImplements_OperationalInterface_client(final ViatraQueryEngine engine) {
    return Implements_OperationalInterface_client.Matcher.on(engine);
  }
  
  public Implements_OperationalConnector_client getImplements_OperationalConnector_client() {
    return Implements_OperationalConnector_client.instance();
  }
  
  public Implements_OperationalConnector_client.Matcher getImplements_OperationalConnector_client(final ViatraQueryEngine engine) {
    return Implements_OperationalConnector_client.Matcher.on(engine);
  }
  
  public Implements_OperationalExchange_client getImplements_OperationalExchange_client() {
    return Implements_OperationalExchange_client.instance();
  }
  
  public Implements_OperationalExchange_client.Matcher getImplements_OperationalExchange_client(final ViatraQueryEngine engine) {
    return Implements_OperationalExchange_client.Matcher.on(engine);
  }
  
  public Implements_OperationalRole_client getImplements_OperationalRole_client() {
    return Implements_OperationalRole_client.instance();
  }
  
  public Implements_OperationalRole_client.Matcher getImplements_OperationalRole_client(final ViatraQueryEngine engine) {
    return Implements_OperationalRole_client.Matcher.on(engine);
  }
  
  public Implements_ResourceConnector_client getImplements_ResourceConnector_client() {
    return Implements_ResourceConnector_client.instance();
  }
  
  public Implements_ResourceConnector_client.Matcher getImplements_ResourceConnector_client(final ViatraQueryEngine engine) {
    return Implements_ResourceConnector_client.Matcher.on(engine);
  }
  
  public Implements_ActualEnduringTask_client getImplements_ActualEnduringTask_client() {
    return Implements_ActualEnduringTask_client.instance();
  }
  
  public Implements_ActualEnduringTask_client.Matcher getImplements_ActualEnduringTask_client(final ViatraQueryEngine engine) {
    return Implements_ActualEnduringTask_client.Matcher.on(engine);
  }
  
  public Implements_InformationElement_client getImplements_InformationElement_client() {
    return Implements_InformationElement_client.instance();
  }
  
  public Implements_InformationElement_client.Matcher getImplements_InformationElement_client(final ViatraQueryEngine engine) {
    return Implements_InformationElement_client.Matcher.on(engine);
  }
  
  public Implements_ResourcePerformer_supplier getImplements_ResourcePerformer_supplier() {
    return Implements_ResourcePerformer_supplier.instance();
  }
  
  public Implements_ResourcePerformer_supplier.Matcher getImplements_ResourcePerformer_supplier(final ViatraQueryEngine engine) {
    return Implements_ResourcePerformer_supplier.Matcher.on(engine);
  }
  
  public Implements_Function_supplier getImplements_Function_supplier() {
    return Implements_Function_supplier.instance();
  }
  
  public Implements_Function_supplier.Matcher getImplements_Function_supplier(final ViatraQueryEngine engine) {
    return Implements_Function_supplier.Matcher.on(engine);
  }
  
  public Implements_ResourceInterface_supplier getImplements_ResourceInterface_supplier() {
    return Implements_ResourceInterface_supplier.instance();
  }
  
  public Implements_ResourceInterface_supplier.Matcher getImplements_ResourceInterface_supplier(final ViatraQueryEngine engine) {
    return Implements_ResourceInterface_supplier.Matcher.on(engine);
  }
  
  public Implements_ResourceConnector_supplier getImplements_ResourceConnector_supplier() {
    return Implements_ResourceConnector_supplier.instance();
  }
  
  public Implements_ResourceConnector_supplier.Matcher getImplements_ResourceConnector_supplier(final ViatraQueryEngine engine) {
    return Implements_ResourceConnector_supplier.Matcher.on(engine);
  }
  
  public Implements_ResourceExchange_supplier getImplements_ResourceExchange_supplier() {
    return Implements_ResourceExchange_supplier.instance();
  }
  
  public Implements_ResourceExchange_supplier.Matcher getImplements_ResourceExchange_supplier(final ViatraQueryEngine engine) {
    return Implements_ResourceExchange_supplier.Matcher.on(engine);
  }
  
  public Implements_ResourceRole_supplier getImplements_ResourceRole_supplier() {
    return Implements_ResourceRole_supplier.instance();
  }
  
  public Implements_ResourceRole_supplier.Matcher getImplements_ResourceRole_supplier(final ViatraQueryEngine engine) {
    return Implements_ResourceRole_supplier.Matcher.on(engine);
  }
  
  public Implements_OperationalActivity_supplier getImplements_OperationalActivity_supplier() {
    return Implements_OperationalActivity_supplier.instance();
  }
  
  public Implements_OperationalActivity_supplier.Matcher getImplements_OperationalActivity_supplier(final ViatraQueryEngine engine) {
    return Implements_OperationalActivity_supplier.Matcher.on(engine);
  }
  
  public Implements_DataElement_supplier getImplements_DataElement_supplier() {
    return Implements_DataElement_supplier.instance();
  }
  
  public Implements_DataElement_supplier.Matcher getImplements_DataElement_supplier(final ViatraQueryEngine engine) {
    return Implements_DataElement_supplier.Matcher.on(engine);
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
  
  public ServicePort_type getServicePort_type() {
    return ServicePort_type.instance();
  }
  
  public ServicePort_type.Matcher getServicePort_type(final ViatraQueryEngine engine) {
    return ServicePort_type.Matcher.on(engine);
  }
  
  public ServicePort_class getServicePort_class() {
    return ServicePort_class.instance();
  }
  
  public ServicePort_class.Matcher getServicePort_class(final ViatraQueryEngine engine) {
    return ServicePort_class.Matcher.on(engine);
  }
  
  public ServiceSpecificationRole_type getServiceSpecificationRole_type() {
    return ServiceSpecificationRole_type.instance();
  }
  
  public ServiceSpecificationRole_type.Matcher getServiceSpecificationRole_type(final ViatraQueryEngine engine) {
    return ServiceSpecificationRole_type.Matcher.on(engine);
  }
  
  public ServiceSpecificationRole_class getServiceSpecificationRole_class() {
    return ServiceSpecificationRole_class.instance();
  }
  
  public ServiceSpecificationRole_class.Matcher getServiceSpecificationRole_class(final ViatraQueryEngine engine) {
    return ServiceSpecificationRole_class.Matcher.on(engine);
  }
  
  public ServiceMethod_ownedParameter getServiceMethod_ownedParameter() {
    return ServiceMethod_ownedParameter.instance();
  }
  
  public ServiceMethod_ownedParameter.Matcher getServiceMethod_ownedParameter(final ViatraQueryEngine engine) {
    return ServiceMethod_ownedParameter.Matcher.on(engine);
  }
  
  public ServiceMethod_method getServiceMethod_method() {
    return ServiceMethod_method.instance();
  }
  
  public ServiceMethod_method.Matcher getServiceMethod_method(final ViatraQueryEngine engine) {
    return ServiceMethod_method.Matcher.on(engine);
  }
  
  public ServiceMethod_owner getServiceMethod_owner() {
    return ServiceMethod_owner.instance();
  }
  
  public ServiceMethod_owner.Matcher getServiceMethod_owner(final ViatraQueryEngine engine) {
    return ServiceMethod_owner.Matcher.on(engine);
  }
  
  public ServiceParameter_type getServiceParameter_type() {
    return ServiceParameter_type.instance();
  }
  
  public ServiceParameter_type.Matcher getServiceParameter_type(final ViatraQueryEngine engine) {
    return ServiceParameter_type.Matcher.on(engine);
  }
  
  public ServiceConnector_end getServiceConnector_end() {
    return ServiceConnector_end.instance();
  }
  
  public ServiceConnector_end.Matcher getServiceConnector_end(final ViatraQueryEngine engine) {
    return ServiceConnector_end.Matcher.on(engine);
  }
  
  public ServiceInterface_ownedOperation getServiceInterface_ownedOperation() {
    return ServiceInterface_ownedOperation.instance();
  }
  
  public ServiceInterface_ownedOperation.Matcher getServiceInterface_ownedOperation(final ViatraQueryEngine engine) {
    return ServiceInterface_ownedOperation.Matcher.on(engine);
  }
  
  public ServicePolicy_constrainedElement getServicePolicy_constrainedElement() {
    return ServicePolicy_constrainedElement.instance();
  }
  
  public ServicePolicy_constrainedElement.Matcher getServicePolicy_constrainedElement(final ViatraQueryEngine engine) {
    return ServicePolicy_constrainedElement.Matcher.on(engine);
  }
  
  public ServiceFunction_ownedParameter getServiceFunction_ownedParameter() {
    return ServiceFunction_ownedParameter.instance();
  }
  
  public ServiceFunction_ownedParameter.Matcher getServiceFunction_ownedParameter(final ViatraQueryEngine engine) {
    return ServiceFunction_ownedParameter.Matcher.on(engine);
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
  
  public ServiceStateMachine_owner getServiceStateMachine_owner() {
    return ServiceStateMachine_owner.instance();
  }
  
  public ServiceStateMachine_owner.Matcher getServiceStateMachine_owner(final ViatraQueryEngine engine) {
    return ServiceStateMachine_owner.Matcher.on(engine);
  }
  
  public Consumes_client getConsumes_client() {
    return Consumes_client.instance();
  }
  
  public Consumes_client.Matcher getConsumes_client(final ViatraQueryEngine engine) {
    return Consumes_client.Matcher.on(engine);
  }
  
  public Consumes_supplier getConsumes_supplier() {
    return Consumes_supplier.instance();
  }
  
  public Consumes_supplier.Matcher getConsumes_supplier(final ViatraQueryEngine engine) {
    return Consumes_supplier.Matcher.on(engine);
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
  
  public ResoucePort_type getResoucePort_type() {
    return ResoucePort_type.instance();
  }
  
  public ResoucePort_type.Matcher getResoucePort_type(final ViatraQueryEngine engine) {
    return ResoucePort_type.Matcher.on(engine);
  }
  
  public ResourcePort_class getResourcePort_class() {
    return ResourcePort_class.instance();
  }
  
  public ResourcePort_class.Matcher getResourcePort_class(final ViatraQueryEngine engine) {
    return ResourcePort_class.Matcher.on(engine);
  }
  
  public ResourceMethod_method getResourceMethod_method() {
    return ResourceMethod_method.instance();
  }
  
  public ResourceMethod_method.Matcher getResourceMethod_method(final ViatraQueryEngine engine) {
    return ResourceMethod_method.Matcher.on(engine);
  }
  
  public ResourceMethod_ownedParameter getResourceMethod_ownedParameter() {
    return ResourceMethod_ownedParameter.instance();
  }
  
  public ResourceMethod_ownedParameter.Matcher getResourceMethod_ownedParameter(final ViatraQueryEngine engine) {
    return ResourceMethod_ownedParameter.Matcher.on(engine);
  }
  
  public ResourcePerformer_ownedOperation getResourcePerformer_ownedOperation() {
    return ResourcePerformer_ownedOperation.instance();
  }
  
  public ResourcePerformer_ownedOperation.Matcher getResourcePerformer_ownedOperation(final ViatraQueryEngine engine) {
    return ResourcePerformer_ownedOperation.Matcher.on(engine);
  }
  
  public ResourcePerformer_ownedPort getResourcePerformer_ownedPort() {
    return ResourcePerformer_ownedPort.instance();
  }
  
  public ResourcePerformer_ownedPort.Matcher getResourcePerformer_ownedPort(final ViatraQueryEngine engine) {
    return ResourcePerformer_ownedPort.Matcher.on(engine);
  }
  
  public ResourcePerformer_isCapableOfPerforming getResourcePerformer_isCapableOfPerforming() {
    return ResourcePerformer_isCapableOfPerforming.instance();
  }
  
  public ResourcePerformer_isCapableOfPerforming.Matcher getResourcePerformer_isCapableOfPerforming(final ViatraQueryEngine engine) {
    return ResourcePerformer_isCapableOfPerforming.Matcher.on(engine);
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
  
  public ResourceInteraction_realizingMessage getResourceInteraction_realizingMessage() {
    return ResourceInteraction_realizingMessage.instance();
  }
  
  public ResourceInteraction_realizingMessage.Matcher getResourceInteraction_realizingMessage(final ViatraQueryEngine engine) {
    return ResourceInteraction_realizingMessage.Matcher.on(engine);
  }
  
  public ResourceInterface_ownedOperation getResourceInterface_ownedOperation() {
    return ResourceInterface_ownedOperation.instance();
  }
  
  public ResourceInterface_ownedOperation.Matcher getResourceInterface_ownedOperation(final ViatraQueryEngine engine) {
    return ResourceInterface_ownedOperation.Matcher.on(engine);
  }
  
  public ResourceConnector_end getResourceConnector_end() {
    return ResourceConnector_end.instance();
  }
  
  public ResourceConnector_end.Matcher getResourceConnector_end(final ViatraQueryEngine engine) {
    return ResourceConnector_end.Matcher.on(engine);
  }
  
  public ResourceSignalProperty_class getResourceSignalProperty_class() {
    return ResourceSignalProperty_class.instance();
  }
  
  public ResourceSignalProperty_class.Matcher getResourceSignalProperty_class(final ViatraQueryEngine engine) {
    return ResourceSignalProperty_class.Matcher.on(engine);
  }
  
  public ResourceSignalProperty_type getResourceSignalProperty_type() {
    return ResourceSignalProperty_type.instance();
  }
  
  public ResourceSignalProperty_type.Matcher getResourceSignalProperty_type(final ViatraQueryEngine engine) {
    return ResourceSignalProperty_type.Matcher.on(engine);
  }
  
  public ResourceConstraint_constrainedElement getResourceConstraint_constrainedElement() {
    return ResourceConstraint_constrainedElement.instance();
  }
  
  public ResourceConstraint_constrainedElement.Matcher getResourceConstraint_constrainedElement(final ViatraQueryEngine engine) {
    return ResourceConstraint_constrainedElement.Matcher.on(engine);
  }
  
  public DataElement_owner getDataElement_owner() {
    return DataElement_owner.instance();
  }
  
  public DataElement_owner.Matcher getDataElement_owner(final ViatraQueryEngine engine) {
    return DataElement_owner.Matcher.on(engine);
  }
  
  public Function_ownedParameter getFunction_ownedParameter() {
    return Function_ownedParameter.instance();
  }
  
  public Function_ownedParameter.Matcher getFunction_ownedParameter(final ViatraQueryEngine engine) {
    return Function_ownedParameter.Matcher.on(engine);
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
  
  public FunctionControlFlow_source getFunctionControlFlow_source() {
    return FunctionControlFlow_source.instance();
  }
  
  public FunctionControlFlow_source.Matcher getFunctionControlFlow_source(final ViatraQueryEngine engine) {
    return FunctionControlFlow_source.Matcher.on(engine);
  }
  
  public FunctionControlFlow_target getFunctionControlFlow_target() {
    return FunctionControlFlow_target.instance();
  }
  
  public FunctionControlFlow_target.Matcher getFunctionControlFlow_target(final ViatraQueryEngine engine) {
    return FunctionControlFlow_target.Matcher.on(engine);
  }
  
  public FunctionEdge_owner getFunctionEdge_owner() {
    return FunctionEdge_owner.instance();
  }
  
  public FunctionEdge_owner.Matcher getFunctionEdge_owner(final ViatraQueryEngine engine) {
    return FunctionEdge_owner.Matcher.on(engine);
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
  
  public VersionSuccession_client getVersionSuccession_client() {
    return VersionSuccession_client.instance();
  }
  
  public VersionSuccession_client.Matcher getVersionSuccession_client(final ViatraQueryEngine engine) {
    return VersionSuccession_client.Matcher.on(engine);
  }
  
  public VersionSuccession_supplier getVersionSuccession_supplier() {
    return VersionSuccession_supplier.instance();
  }
  
  public VersionSuccession_supplier.Matcher getVersionSuccession_supplier(final ViatraQueryEngine engine) {
    return VersionSuccession_supplier.Matcher.on(engine);
  }
  
  public ResourceStateDescription_owner getResourceStateDescription_owner() {
    return ResourceStateDescription_owner.instance();
  }
  
  public ResourceStateDescription_owner.Matcher getResourceStateDescription_owner(final ViatraQueryEngine engine) {
    return ResourceStateDescription_owner.Matcher.on(engine);
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
  
  public CapabilityProperty_class getCapabilityProperty_class() {
    return CapabilityProperty_class.instance();
  }
  
  public CapabilityProperty_class.Matcher getCapabilityProperty_class(final ViatraQueryEngine engine) {
    return CapabilityProperty_class.Matcher.on(engine);
  }
  
  public CapabilityProperty_type getCapabilityProperty_type() {
    return CapabilityProperty_type.instance();
  }
  
  public CapabilityProperty_type.Matcher getCapabilityProperty_type(final ViatraQueryEngine engine) {
    return CapabilityProperty_type.Matcher.on(engine);
  }
  
  public TemporalPart_class getTemporalPart_class() {
    return TemporalPart_class.instance();
  }
  
  public TemporalPart_class.Matcher getTemporalPart_class(final ViatraQueryEngine engine) {
    return TemporalPart_class.Matcher.on(engine);
  }
  
  public TemporalPart_type getTemporalPart_type() {
    return TemporalPart_type.instance();
  }
  
  public TemporalPart_type.Matcher getTemporalPart_type(final ViatraQueryEngine engine) {
    return TemporalPart_type.Matcher.on(engine);
  }
  
  public ActualEnterprisePhase_classifier getActualEnterprisePhase_classifier() {
    return ActualEnterprisePhase_classifier.instance();
  }
  
  public ActualEnterprisePhase_classifier.Matcher getActualEnterprisePhase_classifier(final ViatraQueryEngine engine) {
    return ActualEnterprisePhase_classifier.Matcher.on(engine);
  }
  
  public VisionStatement_ownedAttribute getVisionStatement_ownedAttribute() {
    return VisionStatement_ownedAttribute.instance();
  }
  
  public VisionStatement_ownedAttribute.Matcher getVisionStatement_ownedAttribute(final ViatraQueryEngine engine) {
    return VisionStatement_ownedAttribute.Matcher.on(engine);
  }
  
  public ActualEnduringTask_classifier getActualEnduringTask_classifier() {
    return ActualEnduringTask_classifier.instance();
  }
  
  public ActualEnduringTask_classifier.Matcher getActualEnduringTask_classifier(final ViatraQueryEngine engine) {
    return ActualEnduringTask_classifier.Matcher.on(engine);
  }
  
  public CapabilityForTask_client getCapabilityForTask_client() {
    return CapabilityForTask_client.instance();
  }
  
  public CapabilityForTask_client.Matcher getCapabilityForTask_client(final ViatraQueryEngine engine) {
    return CapabilityForTask_client.Matcher.on(engine);
  }
  
  public CapabilityForTask_supplier getCapabilityForTask_supplier() {
    return CapabilityForTask_supplier.instance();
  }
  
  public CapabilityForTask_supplier.Matcher getCapabilityForTask_supplier(final ViatraQueryEngine engine) {
    return CapabilityForTask_supplier.Matcher.on(engine);
  }
  
  public AchievedEffect_client getAchievedEffect_client() {
    return AchievedEffect_client.instance();
  }
  
  public AchievedEffect_client.Matcher getAchievedEffect_client(final ViatraQueryEngine engine) {
    return AchievedEffect_client.Matcher.on(engine);
  }
  
  public AchievedEffect_supplier getAchievedEffect_supplier() {
    return AchievedEffect_supplier.instance();
  }
  
  public AchievedEffect_supplier.Matcher getAchievedEffect_supplier(final ViatraQueryEngine engine) {
    return AchievedEffect_supplier.Matcher.on(engine);
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
  
  public OrganizationInEnterprise_supplier getOrganizationInEnterprise_supplier() {
    return OrganizationInEnterprise_supplier.instance();
  }
  
  public OrganizationInEnterprise_supplier.Matcher getOrganizationInEnterprise_supplier(final ViatraQueryEngine engine) {
    return OrganizationInEnterprise_supplier.Matcher.on(engine);
  }
  
  public OrganizationInEnterprise_client getOrganizationInEnterprise_client() {
    return OrganizationInEnterprise_client.instance();
  }
  
  public OrganizationInEnterprise_client.Matcher getOrganizationInEnterprise_client(final ViatraQueryEngine engine) {
    return OrganizationInEnterprise_client.Matcher.on(engine);
  }
  
  public ActualResponsibility_classifier getActualResponsibility_classifier() {
    return ActualResponsibility_classifier.instance();
  }
  
  public ActualResponsibility_classifier.Matcher getActualResponsibility_classifier(final ViatraQueryEngine engine) {
    return ActualResponsibility_classifier.Matcher.on(engine);
  }
  
  public ActualPost_classifier getActualPost_classifier() {
    return ActualPost_classifier.instance();
  }
  
  public ActualPost_classifier.Matcher getActualPost_classifier(final ViatraQueryEngine engine) {
    return ActualPost_classifier.Matcher.on(engine);
  }
  
  public FieldedCapability_classifier getFieldedCapability_classifier() {
    return FieldedCapability_classifier.instance();
  }
  
  public FieldedCapability_classifier.Matcher getFieldedCapability_classifier(final ViatraQueryEngine engine) {
    return FieldedCapability_classifier.Matcher.on(engine);
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
  
  public ActualResource_classifier getActualResource_classifier() {
    return ActualResource_classifier.instance();
  }
  
  public ActualResource_classifier.Matcher getActualResource_classifier(final ViatraQueryEngine engine) {
    return ActualResource_classifier.Matcher.on(engine);
  }
  
  public ActualPerson_classifier getActualPerson_classifier() {
    return ActualPerson_classifier.instance();
  }
  
  public ActualPerson_classifier.Matcher getActualPerson_classifier(final ViatraQueryEngine engine) {
    return ActualPerson_classifier.Matcher.on(engine);
  }
  
  public ActualResourceRole_definingFeature getActualResourceRole_definingFeature() {
    return ActualResourceRole_definingFeature.instance();
  }
  
  public ActualResourceRole_definingFeature.Matcher getActualResourceRole_definingFeature(final ViatraQueryEngine engine) {
    return ActualResourceRole_definingFeature.Matcher.on(engine);
  }
  
  public ActualResourceRole_owningInstance getActualResourceRole_owningInstance() {
    return ActualResourceRole_owningInstance.instance();
  }
  
  public ActualResourceRole_owningInstance.Matcher getActualResourceRole_owningInstance(final ViatraQueryEngine engine) {
    return ActualResourceRole_owningInstance.Matcher.on(engine);
  }
  
  public ActualOrganizationRole_owningInstance getActualOrganizationRole_owningInstance() {
    return ActualOrganizationRole_owningInstance.instance();
  }
  
  public ActualOrganizationRole_owningInstance.Matcher getActualOrganizationRole_owningInstance(final ViatraQueryEngine engine) {
    return ActualOrganizationRole_owningInstance.Matcher.on(engine);
  }
  
  public ActualResourceRelationship_informationSource getActualResourceRelationship_informationSource() {
    return ActualResourceRelationship_informationSource.instance();
  }
  
  public ActualResourceRelationship_informationSource.Matcher getActualResourceRelationship_informationSource(final ViatraQueryEngine engine) {
    return ActualResourceRelationship_informationSource.Matcher.on(engine);
  }
  
  public ActualResourceRelationship_realizes getActualResourceRelationship_realizes() {
    return ActualResourceRelationship_realizes.instance();
  }
  
  public ActualResourceRelationship_realizes.Matcher getActualResourceRelationship_realizes(final ViatraQueryEngine engine) {
    return ActualResourceRelationship_realizes.Matcher.on(engine);
  }
  
  public ActualResourceRelationship_informationTarget getActualResourceRelationship_informationTarget() {
    return ActualResourceRelationship_informationTarget.instance();
  }
  
  public ActualResourceRelationship_informationTarget.Matcher getActualResourceRelationship_informationTarget(final ViatraQueryEngine engine) {
    return ActualResourceRelationship_informationTarget.Matcher.on(engine);
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
  
  public ActualService_classifier getActualService_classifier() {
    return ActualService_classifier.instance();
  }
  
  public ActualService_classifier.Matcher getActualService_classifier(final ViatraQueryEngine engine) {
    return ActualService_classifier.Matcher.on(engine);
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
  
  public CompetenceForRole_client getCompetenceForRole_client() {
    return CompetenceForRole_client.instance();
  }
  
  public CompetenceForRole_client.Matcher getCompetenceForRole_client(final ViatraQueryEngine engine) {
    return CompetenceForRole_client.Matcher.on(engine);
  }
  
  public CompetenceForRole_supplier getCompetenceForRole_supplier() {
    return CompetenceForRole_supplier.instance();
  }
  
  public CompetenceForRole_supplier.Matcher getCompetenceForRole_supplier(final ViatraQueryEngine engine) {
    return CompetenceForRole_supplier.Matcher.on(engine);
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
  
  public CompetenceToConduct_client getCompetenceToConduct_client() {
    return CompetenceToConduct_client.instance();
  }
  
  public CompetenceToConduct_client.Matcher getCompetenceToConduct_client(final ViatraQueryEngine engine) {
    return CompetenceToConduct_client.Matcher.on(engine);
  }
  
  public CompetenceToConduct_supplier getCompetenceToConduct_supplier() {
    return CompetenceToConduct_supplier.instance();
  }
  
  public CompetenceToConduct_supplier.Matcher getCompetenceToConduct_supplier(final ViatraQueryEngine engine) {
    return CompetenceToConduct_supplier.Matcher.on(engine);
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
  
  public ResponsibleFor_client getResponsibleFor_client() {
    return ResponsibleFor_client.instance();
  }
  
  public ResponsibleFor_client.Matcher getResponsibleFor_client(final ViatraQueryEngine engine) {
    return ResponsibleFor_client.Matcher.on(engine);
  }
  
  public ResponsibleFor_supplier getResponsibleFor_supplier() {
    return ResponsibleFor_supplier.instance();
  }
  
  public ResponsibleFor_supplier.Matcher getResponsibleFor_supplier(final ViatraQueryEngine engine) {
    return ResponsibleFor_supplier.Matcher.on(engine);
  }
  
  public Security_constrainedElement getSecurity_constrainedElement() {
    return Security_constrainedElement.instance();
  }
  
  public Security_constrainedElement.Matcher getSecurity_constrainedElement(final ViatraQueryEngine engine) {
    return Security_constrainedElement.Matcher.on(engine);
  }
  
  public SecurityControlAction_behavior getSecurityControlAction_behavior() {
    return SecurityControlAction_behavior.instance();
  }
  
  public SecurityControlAction_behavior.Matcher getSecurityControlAction_behavior(final ViatraQueryEngine engine) {
    return SecurityControlAction_behavior.Matcher.on(engine);
  }
  
  public Enhances_client getEnhances_client() {
    return Enhances_client.instance();
  }
  
  public Enhances_client.Matcher getEnhances_client(final ViatraQueryEngine engine) {
    return Enhances_client.Matcher.on(engine);
  }
  
  public Enhances_supplier getEnhances_supplier() {
    return Enhances_supplier.instance();
  }
  
  public Enhances_supplier.Matcher getEnhances_supplier(final ViatraQueryEngine engine) {
    return Enhances_supplier.Matcher.on(engine);
  }
  
  public Protects_client getProtects_client() {
    return Protects_client.instance();
  }
  
  public Protects_client.Matcher getProtects_client(final ViatraQueryEngine engine) {
    return Protects_client.Matcher.on(engine);
  }
  
  public Protects_supplier getProtects_supplier() {
    return Protects_supplier.instance();
  }
  
  public Protects_supplier.Matcher getProtects_supplier(final ViatraQueryEngine engine) {
    return Protects_supplier.Matcher.on(engine);
  }
  
  public ProtectsInContext_client getProtectsInContext_client() {
    return ProtectsInContext_client.instance();
  }
  
  public ProtectsInContext_client.Matcher getProtectsInContext_client(final ViatraQueryEngine engine) {
    return ProtectsInContext_client.Matcher.on(engine);
  }
  
  public ProtectsInContext_supplier getProtectsInContext_supplier() {
    return ProtectsInContext_supplier.instance();
  }
  
  public ProtectsInContext_supplier.Matcher getProtectsInContext_supplier(final ViatraQueryEngine engine) {
    return ProtectsInContext_supplier.Matcher.on(engine);
  }
  
  public SecurityProperty_OperationalAgent_type getSecurityProperty_OperationalAgent_type() {
    return SecurityProperty_OperationalAgent_type.instance();
  }
  
  public SecurityProperty_OperationalAgent_type.Matcher getSecurityProperty_OperationalAgent_type(final ViatraQueryEngine engine) {
    return SecurityProperty_OperationalAgent_type.Matcher.on(engine);
  }
  
  public SecurityProperty_ResourcePerformer_type getSecurityProperty_ResourcePerformer_type() {
    return SecurityProperty_ResourcePerformer_type.instance();
  }
  
  public SecurityProperty_ResourcePerformer_type.Matcher getSecurityProperty_ResourcePerformer_type(final ViatraQueryEngine engine) {
    return SecurityProperty_ResourcePerformer_type.Matcher.on(engine);
  }
  
  public SecurityProperty_InformationElement_type getSecurityProperty_InformationElement_type() {
    return SecurityProperty_InformationElement_type.instance();
  }
  
  public SecurityProperty_InformationElement_type.Matcher getSecurityProperty_InformationElement_type(final ViatraQueryEngine engine) {
    return SecurityProperty_InformationElement_type.Matcher.on(engine);
  }
  
  public SecurityProperty_DataElement_type getSecurityProperty_DataElement_type() {
    return SecurityProperty_DataElement_type.instance();
  }
  
  public SecurityProperty_DataElement_type.Matcher getSecurityProperty_DataElement_type(final ViatraQueryEngine engine) {
    return SecurityProperty_DataElement_type.Matcher.on(engine);
  }
  
  public SecurityProperty_class getSecurityProperty_class() {
    return SecurityProperty_class.instance();
  }
  
  public SecurityProperty_class.Matcher getSecurityProperty_class(final ViatraQueryEngine engine) {
    return SecurityProperty_class.Matcher.on(engine);
  }
  
  public Affects_client getAffects_client() {
    return Affects_client.instance();
  }
  
  public Affects_client.Matcher getAffects_client(final ViatraQueryEngine engine) {
    return Affects_client.Matcher.on(engine);
  }
  
  public Affects_supplier getAffects_supplier() {
    return Affects_supplier.instance();
  }
  
  public Affects_supplier.Matcher getAffects_supplier(final ViatraQueryEngine engine) {
    return Affects_supplier.Matcher.on(engine);
  }
  
  public Mitigates_client getMitigates_client() {
    return Mitigates_client.instance();
  }
  
  public Mitigates_client.Matcher getMitigates_client(final ViatraQueryEngine engine) {
    return Mitigates_client.Matcher.on(engine);
  }
  
  public Mitigates_supplier getMitigates_supplier() {
    return Mitigates_supplier.instance();
  }
  
  public Mitigates_supplier.Matcher getMitigates_supplier(final ViatraQueryEngine engine) {
    return Mitigates_supplier.Matcher.on(engine);
  }
  
  public OwnsRisk_client getOwnsRisk_client() {
    return OwnsRisk_client.instance();
  }
  
  public OwnsRisk_client.Matcher getOwnsRisk_client(final ViatraQueryEngine engine) {
    return OwnsRisk_client.Matcher.on(engine);
  }
  
  public OwnsRisk_supplier getOwnsRisk_supplier() {
    return OwnsRisk_supplier.instance();
  }
  
  public OwnsRisk_supplier.Matcher getOwnsRisk_supplier(final ViatraQueryEngine engine) {
    return OwnsRisk_supplier.Matcher.on(engine);
  }
  
  public OwnsRiskInContext_client getOwnsRiskInContext_client() {
    return OwnsRiskInContext_client.instance();
  }
  
  public OwnsRiskInContext_client.Matcher getOwnsRiskInContext_client(final ViatraQueryEngine engine) {
    return OwnsRiskInContext_client.Matcher.on(engine);
  }
  
  public OwnsRiskInContext_supplier getOwnsRiskInContext_supplier() {
    return OwnsRiskInContext_supplier.instance();
  }
  
  public OwnsRiskInContext_supplier.Matcher getOwnsRiskInContext_supplier(final ViatraQueryEngine engine) {
    return OwnsRiskInContext_supplier.Matcher.on(engine);
  }
  
  public AffectsInContext_client getAffectsInContext_client() {
    return AffectsInContext_client.instance();
  }
  
  public AffectsInContext_client.Matcher getAffectsInContext_client(final ViatraQueryEngine engine) {
    return AffectsInContext_client.Matcher.on(engine);
  }
  
  public AffectsInContext_supplier getAffectsInContext_supplier() {
    return AffectsInContext_supplier.instance();
  }
  
  public AffectsInContext_supplier.Matcher getAffectsInContext_supplier(final ViatraQueryEngine engine) {
    return AffectsInContext_supplier.Matcher.on(engine);
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
  
  public MilestoneDependency_client getMilestoneDependency_client() {
    return MilestoneDependency_client.instance();
  }
  
  public MilestoneDependency_client.Matcher getMilestoneDependency_client(final ViatraQueryEngine engine) {
    return MilestoneDependency_client.Matcher.on(engine);
  }
  
  public MilestoneSequence_supplier getMilestoneSequence_supplier() {
    return MilestoneSequence_supplier.instance();
  }
  
  public MilestoneSequence_supplier.Matcher getMilestoneSequence_supplier(final ViatraQueryEngine engine) {
    return MilestoneSequence_supplier.Matcher.on(engine);
  }
  
  public ProjectActivityAction_activity getProjectActivityAction_activity() {
    return ProjectActivityAction_activity.instance();
  }
  
  public ProjectActivityAction_activity.Matcher getProjectActivityAction_activity(final ViatraQueryEngine engine) {
    return ProjectActivityAction_activity.Matcher.on(engine);
  }
  
  public ProjectActivityAction_behavior getProjectActivityAction_behavior() {
    return ProjectActivityAction_behavior.instance();
  }
  
  public ProjectActivityAction_behavior.Matcher getProjectActivityAction_behavior(final ViatraQueryEngine engine) {
    return ProjectActivityAction_behavior.Matcher.on(engine);
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
  
  public ActualProjectMilestoneRole_value_instance getActualProjectMilestoneRole_value_instance() {
    return ActualProjectMilestoneRole_value_instance.instance();
  }
  
  public ActualProjectMilestoneRole_value_instance.Matcher getActualProjectMilestoneRole_value_instance(final ViatraQueryEngine engine) {
    return ActualProjectMilestoneRole_value_instance.Matcher.on(engine);
  }
  
  public ActualProjectRole_definingFeature getActualProjectRole_definingFeature() {
    return ActualProjectRole_definingFeature.instance();
  }
  
  public ActualProjectRole_definingFeature.Matcher getActualProjectRole_definingFeature(final ViatraQueryEngine engine) {
    return ActualProjectRole_definingFeature.Matcher.on(engine);
  }
  
  public ActualProjectRole_owningInstance getActualProjectRole_owningInstance() {
    return ActualProjectRole_owningInstance.instance();
  }
  
  public ActualProjectRole_owningInstance.Matcher getActualProjectRole_owningInstance(final ViatraQueryEngine engine) {
    return ActualProjectRole_owningInstance.Matcher.on(engine);
  }
  
  public ActualProjectRole_value_instance getActualProjectRole_value_instance() {
    return ActualProjectRole_value_instance.instance();
  }
  
  public ActualProjectRole_value_instance.Matcher getActualProjectRole_value_instance(final ViatraQueryEngine engine) {
    return ActualProjectRole_value_instance.Matcher.on(engine);
  }
  
  public ActualProject_classifier getActualProject_classifier() {
    return ActualProject_classifier.instance();
  }
  
  public ActualProject_classifier.Matcher getActualProject_classifier(final ViatraQueryEngine engine) {
    return ActualProject_classifier.Matcher.on(engine);
  }
  
  public ActualProject_slot getActualProject_slot() {
    return ActualProject_slot.instance();
  }
  
  public ActualProject_slot.Matcher getActualProject_slot(final ViatraQueryEngine engine) {
    return ActualProject_slot.Matcher.on(engine);
  }
  
  public ActualProjectMilestone_classifier getActualProjectMilestone_classifier() {
    return ActualProjectMilestone_classifier.instance();
  }
  
  public ActualProjectMilestone_classifier.Matcher getActualProjectMilestone_classifier(final ViatraQueryEngine engine) {
    return ActualProjectMilestone_classifier.Matcher.on(engine);
  }
  
  public ProjectRole_class getProjectRole_class() {
    return ProjectRole_class.instance();
  }
  
  public ProjectRole_class.Matcher getProjectRole_class(final ViatraQueryEngine engine) {
    return ProjectRole_class.Matcher.on(engine);
  }
  
  public ProjectRole_type getProjectRole_type() {
    return ProjectRole_type.instance();
  }
  
  public ProjectRole_type.Matcher getProjectRole_type(final ViatraQueryEngine engine) {
    return ProjectRole_type.Matcher.on(engine);
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
  
  public ProjecTheme_type getProjecTheme_type() {
    return ProjecTheme_type.instance();
  }
  
  public ProjecTheme_type.Matcher getProjecTheme_type(final ViatraQueryEngine engine) {
    return ProjecTheme_type.Matcher.on(engine);
  }
  
  public ProjecTheme_class getProjecTheme_class() {
    return ProjecTheme_class.instance();
  }
  
  public ProjecTheme_class.Matcher getProjecTheme_class(final ViatraQueryEngine engine) {
    return ProjecTheme_class.Matcher.on(engine);
  }
  
  public ProjectStatus_definingFeature getProjectStatus_definingFeature() {
    return ProjectStatus_definingFeature.instance();
  }
  
  public ProjectStatus_definingFeature.Matcher getProjectStatus_definingFeature(final ViatraQueryEngine engine) {
    return ProjectStatus_definingFeature.Matcher.on(engine);
  }
  
  public Alias_annotatedElement getAlias_annotatedElement() {
    return Alias_annotatedElement.instance();
  }
  
  public Alias_annotatedElement.Matcher getAlias_annotatedElement(final ViatraQueryEngine engine) {
    return Alias_annotatedElement.Matcher.on(engine);
  }
  
  public Definition_annotatedElement getDefinition_annotatedElement() {
    return Definition_annotatedElement.instance();
  }
  
  public Definition_annotatedElement.Matcher getDefinition_annotatedElement(final ViatraQueryEngine engine) {
    return Definition_annotatedElement.Matcher.on(engine);
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
  
  public ActualCondition_classifier getActualCondition_classifier() {
    return ActualCondition_classifier.instance();
  }
  
  public ActualCondition_classifier.Matcher getActualCondition_classifier(final ViatraQueryEngine engine) {
    return ActualCondition_classifier.Matcher.on(engine);
  }
  
  public Measurement_class getMeasurement_class() {
    return Measurement_class.instance();
  }
  
  public Measurement_class.Matcher getMeasurement_class(final ViatraQueryEngine engine) {
    return Measurement_class.Matcher.on(engine);
  }
  
  public ActualMeasurement_definingFeature getActualMeasurement_definingFeature() {
    return ActualMeasurement_definingFeature.instance();
  }
  
  public ActualMeasurement_definingFeature.Matcher getActualMeasurement_definingFeature(final ViatraQueryEngine engine) {
    return ActualMeasurement_definingFeature.Matcher.on(engine);
  }
  
  public ActualMeasurement_owningInstance getActualMeasurement_owningInstance() {
    return ActualMeasurement_owningInstance.instance();
  }
  
  public ActualMeasurement_owningInstance.Matcher getActualMeasurement_owningInstance(final ViatraQueryEngine engine) {
    return ActualMeasurement_owningInstance.Matcher.on(engine);
  }
  
  public ActualEnvironment_classifier getActualEnvironment_classifier() {
    return ActualEnvironment_classifier.instance();
  }
  
  public ActualEnvironment_classifier.Matcher getActualEnvironment_classifier(final ViatraQueryEngine engine) {
    return ActualEnvironment_classifier.Matcher.on(engine);
  }
  
  public ActualMeasurementSet_classifier getActualMeasurementSet_classifier() {
    return ActualMeasurementSet_classifier.instance();
  }
  
  public ActualMeasurementSet_classifier.Matcher getActualMeasurementSet_classifier(final ViatraQueryEngine engine) {
    return ActualMeasurementSet_classifier.Matcher.on(engine);
  }
  
  public ActualMeasurementSet_slot getActualMeasurementSet_slot() {
    return ActualMeasurementSet_slot.instance();
  }
  
  public ActualMeasurementSet_slot.Matcher getActualMeasurementSet_slot(final ViatraQueryEngine engine) {
    return ActualMeasurementSet_slot.Matcher.on(engine);
  }
  
  public ActualPropertySet_classifier getActualPropertySet_classifier() {
    return ActualPropertySet_classifier.instance();
  }
  
  public ActualPropertySet_classifier.Matcher getActualPropertySet_classifier(final ViatraQueryEngine engine) {
    return ActualPropertySet_classifier.Matcher.on(engine);
  }
  
  public ActualLocation_classifier getActualLocation_classifier() {
    return ActualLocation_classifier.instance();
  }
  
  public ActualLocation_classifier.Matcher getActualLocation_classifier(final ViatraQueryEngine engine) {
    return ActualLocation_classifier.Matcher.on(engine);
  }
}
