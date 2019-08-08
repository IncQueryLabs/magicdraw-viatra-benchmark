package com.incquerylabs.instaschema.generator;

import com.nomagic.annotation.InternalApi;
import com.nomagic.magicdraw.foundation.MDFoundationPackage;
import com.nomagic.magicdraw.foundation.diagram.DiagramPackage;
import com.nomagic.magicdraw.uml2.util.UML2ModelUtil;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.Action;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallBehaviorAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.InputPin;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.InvocationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.OpaqueAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.OutputPin;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.Pin;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.ValuePin;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptCallAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.CreateLinkObjectAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.QualifierValue;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReadExtentAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReadIsClassifiedObjectAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReadLinkObjectEndAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReadLinkObjectEndQualifierAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReclassifyObjectAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReduceAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.ReplyAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.StartClassifierBehaviorAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.StartObjectBehaviorAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.UnmarshallAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.AddStructuralFeatureValueAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.BroadcastSignalAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ClearAssociationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ClearStructuralFeatureAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.CreateLinkAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.CreateObjectAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.DestroyLinkAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.DestroyObjectAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.LinkAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.LinkEndCreationData;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.LinkEndData;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.LinkEndDestructionData;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ReadLinkAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ReadSelfAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ReadStructuralFeatureAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.RemoveStructuralFeatureValueAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.SendObjectAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.StructuralFeatureAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.TestIdentityAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.ValueSpecificationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.WriteLinkAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.WriteStructuralFeatureAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.ActionInputPin;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.AddVariableValueAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.ClearVariableAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.RaiseExceptionAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.ReadVariableAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.RemoveVariableValueAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.VariableAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdstructuredactions.WriteVariableAction;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityFinalNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityParameterNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ControlFlow;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ControlNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.InitialNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectFlow;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.DataStoreNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.InterruptibleActivityRegion;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ObjectNodeOrderingKind;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ObjectNodeOrderingKindEnum;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ParameterEffectKind;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ParameterEffectKindEnum;
import com.nomagic.uml2.ext.magicdraw.activities.mdcompleteactivities.ParameterSet;
import com.nomagic.uml2.ext.magicdraw.activities.mdextrastructuredactivities.ExceptionHandler;
import com.nomagic.uml2.ext.magicdraw.activities.mdextrastructuredactivities.ExpansionKind;
import com.nomagic.uml2.ext.magicdraw.activities.mdextrastructuredactivities.ExpansionKindEnum;
import com.nomagic.uml2.ext.magicdraw.activities.mdextrastructuredactivities.ExpansionNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdextrastructuredactivities.ExpansionRegion;
import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity;
import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.ActivityGroup;
import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.ActivityNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.ActivityPartition;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.CentralBufferNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.DecisionNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.FinalNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.FlowFinalNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.ForkNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.JoinNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.MergeNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.Clause;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.ConditionalNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.ExecutableNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.LoopNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.SequenceNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.StructuredActivityNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.Variable;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationItem;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.ClassifierTemplateParameter;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.ConnectableElementTemplateParameter;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.OperationTemplateParameter;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.ParameterableElement;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.RedefinableTemplateSignature;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.StringExpression;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateBinding;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateParameter;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateParameterSubstitution;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateSignature;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdtemplates.TemplateableElement;
import com.nomagic.uml2.ext.magicdraw.base.ModelObject;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Substitution;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.InterfaceRealization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.BehavioralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Expression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralNull;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralReal;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageMerge;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.RedefinableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdpowertypes.GeneralizationSet;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.Behavior;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.BehavioredClassifier;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.FunctionBehavior;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.OpaqueBehavior;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.AnyReceiveEvent;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.CallConcurrencyKind;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.CallConcurrencyKindEnum;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.CallEvent;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.ChangeEvent;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.MessageEvent;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Reception;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Signal;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.SignalEvent;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.TimeEvent;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.Duration;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.DurationConstraint;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.DurationInterval;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.DurationObservation;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.Interval;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.IntervalConstraint;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.Observation;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.TimeConstraint;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.TimeExpression;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.TimeInterval;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdsimpletime.TimeObservation;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.ComponentRealization;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.ConnectorKind;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.ConnectorKindEnum;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdcollaborations.Collaboration;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdcollaborations.CollaborationUse;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectableElement;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.StructuredClassifier;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.EncapsulatedClassifier;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Manifestation;
import com.nomagic.uml2.ext.magicdraw.deployments.mdcomponentdeployments.DeploymentSpecification;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.CommunicationPath;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.DeployedArtifact;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.Deployment;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.DeploymentTarget;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.Device;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.ExecutionEnvironment;
import com.nomagic.uml2.ext.magicdraw.deployments.mdnodes.Node;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.ActionExecutionSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.BehaviorExecutionSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.DestructionOccurrenceSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.ExecutionOccurrenceSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.ExecutionSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.GeneralOrdering;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.Interaction;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.InteractionFragment;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.Lifeline;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.Message;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.MessageEnd;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.MessageKind;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.MessageKindEnum;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.MessageOccurrenceSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.MessageSort;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.MessageSortEnum;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.OccurrenceSpecification;
import com.nomagic.uml2.ext.magicdraw.interactions.mdbasicinteractions.StateInvariant;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.CombinedFragment;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.ConsiderIgnoreFragment;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.Continuation;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.Gate;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.InteractionConstraint;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.InteractionOperand;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.InteractionOperatorKind;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.InteractionOperatorKindEnum;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.InteractionUse;
import com.nomagic.uml2.ext.magicdraw.interactions.mdfragments.PartDecomposition;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Extension;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ExtensionEnd;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Image;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.mdusecases.Actor;
import com.nomagic.uml2.ext.magicdraw.mdusecases.Extend;
import com.nomagic.uml2.ext.magicdraw.mdusecases.ExtensionPoint;
import com.nomagic.uml2.ext.magicdraw.mdusecases.Include;
import com.nomagic.uml2.ext.magicdraw.mdusecases.UseCase;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLPackage;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.ConnectionPointReference;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.FinalState;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Pseudostate;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.PseudostateKind;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.PseudostateKindEnum;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Region;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.StateMachine;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.TransitionKind;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.TransitionKindEnum;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Vertex;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdprotocolstatemachines.ProtocolConformance;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdprotocolstatemachines.ProtocolStateMachine;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdprotocolstatemachines.ProtocolTransition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageImpl;

@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
@Deprecated
public class FixedNSURIUMLPackage extends EPackageImpl implements UMLPackage {
	private Map<EClass, Map<String, String>> publicToPrivate;
	private List<EStructuralFeature> mdTransientStructuralFeatures;
	private EClass sendSignalActionEClass = null;
	private EClass invocationActionEClass = null;
	private EClass actionEClass = null;
	private EClass executableNodeEClass = null;
	private EClass activityNodeEClass = null;
	private EClass redefinableElementEClass = null;
	private EClass namedElementEClass = null;
	private EClass elementEClass = null;
	private EClass commentEClass = null;
	private EClass instanceSpecificationEClass = null;
	private EClass packageableElementEClass = null;
	private EClass parameterableElementEClass = null;
	private EClass templateParameterEClass = null;
	private EClass templateSignatureEClass = null;
	private EClass templateableElementEClass = null;
	private EClass templateBindingEClass = null;
	private EClass directedRelationshipEClass = null;
	private EClass relationshipEClass = null;
	private EClass informationFlowEClass = null;
	private EClass classifierEClass = null;
	private EClass namespaceEClass = null;
	private EClass elementImportEClass = null;
	private EClass profileEClass = null;
	private EClass packageEClass = null;
	private EClass stereotypeEClass = null;
	private EClass classEClass = null;
	private EClass behavioredClassifierEClass = null;
	private EClass behaviorEClass = null;
	private EClass parameterEClass = null;
	private EClass multiplicityElementEClass = null;
	private EClass valueSpecificationEClass = null;
	private EClass typedElementEClass = null;
	private EClass typeEClass = null;
	private EClass associationEClass = null;
	private EClass propertyEClass = null;
	private EClass structuralFeatureEClass = null;
	private EClass featureEClass = null;
	private EClass slotEClass = null;
	private EClass structuralFeatureActionEClass = null;
	private EClass inputPinEClass = null;
	private EClass pinEClass = null;
	private EClass objectNodeEClass = null;
	private EClass stateEClass = null;
	private EClass vertexEClass = null;
	private EClass regionEClass = null;
	private EClass stateMachineEClass = null;
	private EClass pseudostateEClass = null;
	private EClass connectionPointReferenceEClass = null;
	private EClass transitionEClass = null;
	private EClass constraintEClass = null;
	private EClass operationEClass = null;
	private EClass behavioralFeatureEClass = null;
	private EClass parameterSetEClass = null;
	private EClass dataTypeEClass = null;
	private EClass interfaceEClass = null;
	private EClass receptionEClass = null;
	private EClass signalEClass = null;
	private EClass broadcastSignalActionEClass = null;
	private EClass signalEventEClass = null;
	private EClass messageEventEClass = null;
	private EClass eventEClass = null;
	private EClass triggerEClass = null;
	private EClass portEClass = null;
	private EClass protocolStateMachineEClass = null;
	private EClass protocolConformanceEClass = null;
	private EClass encapsulatedClassifierEClass = null;
	private EClass structuredClassifierEClass = null;
	private EClass connectorEClass = null;
	private EClass connectorEndEClass = null;
	private EClass connectableElementEClass = null;
	private EClass connectableElementTemplateParameterEClass = null;
	private EClass collaborationEClass = null;
	private EClass collaborationUseEClass = null;
	private EClass dependencyEClass = null;
	private EClass lifelineEClass = null;
	private EClass interactionFragmentEClass = null;
	private EClass interactionEClass = null;
	private EClass gateEClass = null;
	private EClass messageEndEClass = null;
	private EClass messageEClass = null;
	private EClass interactionUseEClass = null;
	private EClass combinedFragmentEClass = null;
	private EClass interactionOperandEClass = null;
	private EClass interactionConstraintEClass = null;
	private EClass generalOrderingEClass = null;
	private EClass occurrenceSpecificationEClass = null;
	private EClass executionSpecificationEClass = null;
	private EClass executionOccurrenceSpecificationEClass = null;
	private EClass partDecompositionEClass = null;
	private EClass stateInvariantEClass = null;
	private EClass replyActionEClass = null;
	private EClass acceptEventActionEClass = null;
	private EClass outputPinEClass = null;
	private EClass clauseEClass = null;
	private EClass conditionalNodeEClass = null;
	private EClass structuredActivityNodeEClass = null;
	private EClass activityGroupEClass = null;
	private EClass activityEdgeEClass = null;
	private EClass activityEClass = null;
	private EClass activityPartitionEClass = null;
	private EClass variableEClass = null;
	private EClass variableActionEClass = null;
	private EClass interruptibleActivityRegionEClass = null;
	private EClass loopNodeEClass = null;
	private EClass opaqueActionEClass = null;
	private EClass callActionEClass = null;
	private EClass clearStructuralFeatureActionEClass = null;
	private EClass createLinkObjectActionEClass = null;
	private EClass createLinkActionEClass = null;
	private EClass writeLinkActionEClass = null;
	private EClass linkActionEClass = null;
	private EClass linkEndDataEClass = null;
	private EClass qualifierValueEClass = null;
	private EClass linkEndCreationDataEClass = null;
	private EClass createObjectActionEClass = null;
	private EClass readExtentActionEClass = null;
	private EClass readIsClassifiedObjectActionEClass = null;
	private EClass readLinkActionEClass = null;
	private EClass readLinkObjectEndActionEClass = null;
	private EClass readLinkObjectEndQualifierActionEClass = null;
	private EClass readSelfActionEClass = null;
	private EClass readStructuralFeatureActionEClass = null;
	private EClass readVariableActionEClass = null;
	private EClass reduceActionEClass = null;
	private EClass testIdentityActionEClass = null;
	private EClass unmarshallActionEClass = null;
	private EClass valueSpecificationActionEClass = null;
	private EClass writeStructuralFeatureActionEClass = null;
	private EClass acceptCallActionEClass = null;
	private EClass interfaceRealizationEClass = null;
	private EClass realizationEClass = null;
	private EClass abstractionEClass = null;
	private EClass opaqueExpressionEClass = null;
	private EClass componentEClass = null;
	private EClass componentRealizationEClass = null;
	private EClass operationTemplateParameterEClass = null;
	private EClass callEventEClass = null;
	private EClass callOperationActionEClass = null;
	private EClass artifactEClass = null;
	private EClass deployedArtifactEClass = null;
	private EClass deploymentEClass = null;
	private EClass deploymentSpecificationEClass = null;
	private EClass deploymentTargetEClass = null;
	private EClass manifestationEClass = null;
	private EClass protocolTransitionEClass = null;
	private EClass extendEClass = null;
	private EClass useCaseEClass = null;
	private EClass extensionPointEClass = null;
	private EClass includeEClass = null;
	private EClass exceptionHandlerEClass = null;
	private EClass linkEndDestructionDataEClass = null;
	private EClass destroyLinkActionEClass = null;
	private EClass raiseExceptionActionEClass = null;
	private EClass addStructuralFeatureValueActionEClass = null;
	private EClass addVariableValueActionEClass = null;
	private EClass writeVariableActionEClass = null;
	private EClass clearAssociationActionEClass = null;
	private EClass reclassifyObjectActionEClass = null;
	private EClass startClassifierBehaviorActionEClass = null;
	private EClass startObjectBehaviorActionEClass = null;
	private EClass removeStructuralFeatureValueActionEClass = null;
	private EClass removeVariableValueActionEClass = null;
	private EClass sendObjectActionEClass = null;
	private EClass destroyObjectActionEClass = null;
	private EClass changeEventEClass = null;
	private EClass durationEClass = null;
	private EClass observationEClass = null;
	private EClass timeExpressionEClass = null;
	private EClass timeIntervalEClass = null;
	private EClass intervalEClass = null;
	private EClass intervalConstraintEClass = null;
	private EClass timeConstraintEClass = null;
	private EClass timeEventEClass = null;
	private EClass durationIntervalEClass = null;
	private EClass durationConstraintEClass = null;
	private EClass joinNodeEClass = null;
	private EClass controlNodeEClass = null;
	private EClass expressionEClass = null;
	private EClass valuePinEClass = null;
	private EClass activityParameterNodeEClass = null;
	private EClass behaviorExecutionSpecificationEClass = null;
	private EClass callBehaviorActionEClass = null;
	private EClass decisionNodeEClass = null;
	private EClass objectFlowEClass = null;
	private EClass extensionEClass = null;
	private EClass extensionEndEClass = null;
	private EClass imageEClass = null;
	private EClass packageMergeEClass = null;
	private EClass profileApplicationEClass = null;
	private EClass packageImportEClass = null;
	private EClass diagramEClass = null;
	private EClass generalizationEClass = null;
	private EClass generalizationSetEClass = null;
	private EClass redefinableTemplateSignatureEClass = null;
	private EClass substitutionEClass = null;
	private EClass classifierTemplateParameterEClass = null;
	private EClass informationItemEClass = null;
	private EClass templateParameterSubstitutionEClass = null;
	private EClass instanceValueEClass = null;
	private EClass elementValueEClass = null;
	private EClass stringExpressionEClass = null;
	private EClass durationObservationEClass = null;
	private EClass timeObservationEClass = null;
	private EClass considerIgnoreFragmentEClass = null;
	private EClass sequenceNodeEClass = null;
	private EClass actionExecutionSpecificationEClass = null;
	private EClass actionInputPinEClass = null;
	private EClass literalStringEClass = null;
	private EClass literalSpecificationEClass = null;
	private EClass dataStoreNodeEClass = null;
	private EClass centralBufferNodeEClass = null;
	private EClass initialNodeEClass = null;
	private EClass deviceEClass = null;
	private EClass nodeEClass = null;
	private EClass associationClassEClass = null;
	private EClass actorEClass = null;
	private EClass executionEnvironmentEClass = null;
	private EClass functionBehaviorEClass = null;
	private EClass opaqueBehaviorEClass = null;
	private EClass finalNodeEClass = null;
	private EClass activityFinalNodeEClass = null;
	private EClass flowFinalNodeEClass = null;
	private EClass literalRealEClass = null;
	private EClass forkNodeEClass = null;
	private EClass controlFlowEClass = null;
	private EClass usageEClass = null;
	private EClass literalUnlimitedNaturalEClass = null;
	private EClass literalIntegerEClass = null;
	private EClass enumerationEClass = null;
	private EClass enumerationLiteralEClass = null;
	private EClass expansionNodeEClass = null;
	private EClass expansionRegionEClass = null;
	private EClass communicationPathEClass = null;
	private EClass primitiveTypeEClass = null;
	private EClass finalStateEClass = null;
	private EClass anyReceiveEventEClass = null;
	private EClass mergeNodeEClass = null;
	private EClass continuationEClass = null;
	private EClass literalNullEClass = null;
	private EClass messageOccurrenceSpecificationEClass = null;
	private EClass literalBooleanEClass = null;
	private EClass destructionOccurrenceSpecificationEClass = null;
	private EClass modelEClass = null;
	private EClass clearVariableActionEClass = null;
	private EClass modelObjectEClass = null;
	private EEnum visibilityKindEEnum = null;
	private EEnum pseudostateKindEEnum = null;
	private EEnum callConcurrencyKindEEnum = null;
	private EEnum messageKindEEnum = null;
	private EEnum messageSortEEnum = null;
	private EEnum interactionOperatorKindEEnum = null;
	private EEnum connectorKindEEnum = null;
	private EEnum transitionKindEEnum = null;
	private EEnum objectNodeOrderingKindEEnum = null;
	private EEnum aggregationKindEEnum = null;
	private EEnum parameterDirectionKindEEnum = null;
	private EEnum parameterEffectKindEEnum = null;
	private EEnum expansionKindEEnum = null;
	private EDataType stringEDataType = null;
	private EDataType booleanEDataType = null;
	private EDataType integerEDataType = null;
	private EDataType unlimitedNaturalEDataType = null;
	private EDataType realEDataType = null;
	private EDataType namedElementVisibilityKindEDataType = null;
	private EDataType parameterParameterEffectKindEDataType = null;
	private static boolean isInited = false;
	private boolean isCreated = false;
	private boolean isInitialized = false;

	public final static FixedNSURIUMLPackage eINSTANCE = init();

	private FixedNSURIUMLPackage() {
		super("http://www.nomagic.com/magicdraw/UML/2.5.1", UMLFactory.eINSTANCE);
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	public static FixedNSURIUMLPackage init() {
		if (isInited) {
			return (FixedNSURIUMLPackage) Registry.INSTANCE.getEPackage("http://www.nomagic.com/magicdraw/UML/2.5.1");
		} else {
			FixedNSURIUMLPackage theUMLPackage = (FixedNSURIUMLPackage) (Registry.INSTANCE
					.get("http://www.nomagic.com/magicdraw/UML/2.5.1") instanceof FixedNSURIUMLPackage
							? Registry.INSTANCE.get("http://www.nomagic.com/magicdraw/UML/2.5.1")
							: new FixedNSURIUMLPackage());
			isInited = true;
			MDFoundationPackage.eINSTANCE.eClass();
			DiagramPackage.eINSTANCE.eClass();
			theUMLPackage.createPackageContents();
			theUMLPackage.initializePackageContents();
			theUMLPackage.initPublicToPrivate();
			theUMLPackage.initMDTransientStructuralFeatures();
			theUMLPackage.freeze();
			Registry.INSTANCE.put("http://www.nomagic.com/magicdraw/UML/2.5.1", theUMLPackage);
			return theUMLPackage;
		}
	}

	public EClass getSendSignalAction() {
		return this.sendSignalActionEClass;
	}

	public EReference getSendSignalAction_Signal() {
		return (EReference) this.sendSignalActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getSendSignalAction_Target() {
		return (EReference) this.sendSignalActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getInvocationAction() {
		return this.invocationActionEClass;
	}

	public EReference getInvocationAction_OnPort() {
		return (EReference) this.invocationActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInvocationAction_Argument() {
		return (EReference) this.invocationActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getAction() {
		return this.actionEClass;
	}

	public EReference getAction__interactionOfAction() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(8);
	}

	public EReference getAction_Output() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getAction_LocalPostcondition() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getAction_LocalPrecondition() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getAction_Input() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getAction_Context() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(4);
	}

	public EAttribute getAction_LocallyReentrant() {
		return (EAttribute) this.actionEClass.getEStructuralFeatures().get(5);
	}

	public EReference getAction__actionExecutionSpecificationOfAction() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(7);
	}

	public EReference getAction__actionInputPinOfFromAction() {
		return (EReference) this.actionEClass.getEStructuralFeatures().get(6);
	}

	public EClass getExecutableNode() {
		return this.executableNodeEClass;
	}

	public EReference getExecutableNode__clauseOfBody() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExecutableNode__clauseOfTest() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExecutableNode__loopNodeOfBodyPart() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getExecutableNode__loopNodeOfSetupPart() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getExecutableNode__loopNodeOfTest() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getExecutableNode__exceptionHandlerOfHandlerBody() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(5);
	}

	public EReference getExecutableNode_Handler() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(6);
	}

	public EReference getExecutableNode__sequenceNodeOfExecutableNode() {
		return (EReference) this.executableNodeEClass.getEStructuralFeatures().get(7);
	}

	public EClass getActivityNode() {
		return this.activityNodeEClass;
	}

	public EReference getActivityNode_Activity() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getActivityNode_InPartition() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getActivityNode_InInterruptibleRegion() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getActivityNode_Outgoing() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(5);
	}

	public EReference getActivityNode_Incoming() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(6);
	}

	public EReference getActivityNode_InGroup() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getActivityNode_InStructuredNode() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getActivityNode_RedefinedNode() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(7);
	}

	public EReference getActivityNode__activityNodeOfRedefinedNode() {
		return (EReference) this.activityNodeEClass.getEStructuralFeatures().get(8);
	}

	public EClass getRedefinableElement() {
		return this.redefinableElementEClass;
	}

	public EReference getRedefinableElement_RedefinitionContext() {
		return (EReference) this.redefinableElementEClass.getEStructuralFeatures().get(3);
	}

	public EAttribute getRedefinableElement_Leaf() {
		return (EAttribute) this.redefinableElementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getRedefinableElement_RedefinedElement() {
		return (EReference) this.redefinableElementEClass.getEStructuralFeatures().get(1);
	}

	public EReference getRedefinableElement__redefinableElementOfRedefinedElement() {
		return (EReference) this.redefinableElementEClass.getEStructuralFeatures().get(2);
	}

	public EClass getNamedElement() {
		return this.namedElementEClass;
	}

	public EReference getNamedElement_ClientDependency() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(1);
	}

	public EReference getNamedElement_SupplierDependency() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(2);
	}

	public EReference getNamedElement__messageOfSignature() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getNamedElement__namespaceOfMember() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(3);
	}

	public EReference getNamedElement_Namespace() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(4);
	}

	public EReference getNamedElement__classifierOfInheritedMember() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(5);
	}

	public EReference getNamedElement__informationFlowOfInformationSource() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(6);
	}

	public EReference getNamedElement__informationFlowOfInformationTarget() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(7);
	}

	public EAttribute getNamedElement_Name() {
		return (EAttribute) this.namedElementEClass.getEStructuralFeatures().get(8);
	}

	public EReference getNamedElement_NameExpression() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(9);
	}

	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute) this.namedElementEClass.getEStructuralFeatures().get(10);
	}

	public EAttribute getNamedElement_Visibility() {
		return (EAttribute) this.namedElementEClass.getEStructuralFeatures().get(11);
	}

	public EReference getNamedElement__durationObservationOfEvent() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(14);
	}

	public EReference getNamedElement__timeObservationOfEvent() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(13);
	}

	public EReference getNamedElement__considerIgnoreFragmentOfMessage() {
		return (EReference) this.namedElementEClass.getEStructuralFeatures().get(12);
	}

	public EClass getElement() {
		return this.elementEClass;
	}

	public EReference getElement_OwnedComment() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getElement__commentOfAnnotatedElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(1);
	}

	public EReference getElement_OwnedElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(2);
	}

	public EReference getElement_Owner() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(3);
	}

	public EReference getElement_SyncElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(4);
	}

	public EReference getElement__elementOfSyncElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(5);
	}

	public EReference getElement_AppliedStereotypeInstance() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(6);
	}

	public EReference getElement__relationshipOfRelatedElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(7);
	}

	public EReference getElement__constraintOfConstrainedElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(9);
	}

	public EReference getElement__activityPartitionOfRepresents() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(8);
	}

	public EReference getElement__diagramOfContext() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(10);
	}

	public EReference getElement__directedRelationshipOfSource() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(11);
	}

	public EReference getElement__directedRelationshipOfTarget() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(12);
	}

	public EReference getElement__elementValueOfElement() {
		return (EReference) this.elementEClass.getEStructuralFeatures().get(13);
	}

	public EClass getComment() {
		return this.commentEClass;
	}

	public EReference getComment_AnnotatedElement() {
		return (EReference) this.commentEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getComment_Body() {
		return (EAttribute) this.commentEClass.getEStructuralFeatures().get(1);
	}

	public EReference getComment_OwningElement() {
		return (EReference) this.commentEClass.getEStructuralFeatures().get(2);
	}

	public EClass getInstanceSpecification() {
		return this.instanceSpecificationEClass;
	}

	public EReference getInstanceSpecification_Slot() {
		return (EReference) this.instanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInstanceSpecification_Specification() {
		return (EReference) this.instanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInstanceSpecification_Classifier() {
		return (EReference) this.instanceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInstanceSpecification__instanceValueOfInstance() {
		return (EReference) this.instanceSpecificationEClass.getEStructuralFeatures().get(3);
	}

	public EReference getInstanceSpecification_StereotypedElement() {
		return (EReference) this.instanceSpecificationEClass.getEStructuralFeatures().get(4);
	}

	public EClass getPackageableElement() {
		return this.packageableElementEClass;
	}

	public EReference getPackageableElement__elementImportOfImportedElement() {
		return (EReference) this.packageableElementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getPackageableElement__componentOfPackagedElement() {
		return (EReference) this.packageableElementEClass.getEStructuralFeatures().get(1);
	}

	public EReference getPackageableElement__deploymentTargetOfDeployedElement() {
		return (EReference) this.packageableElementEClass.getEStructuralFeatures().get(5);
	}

	public EReference getPackageableElement__manifestationOfUtilizedElement() {
		return (EReference) this.packageableElementEClass.getEStructuralFeatures().get(2);
	}

	public EReference getPackageableElement_OwningPackage() {
		return (EReference) this.packageableElementEClass.getEStructuralFeatures().get(3);
	}

	public EReference getPackageableElement__namespaceOfImportedMember() {
		return (EReference) this.packageableElementEClass.getEStructuralFeatures().get(4);
	}

	public EAttribute getPackageableElement_Visibility() {
		return (EAttribute) this.packageableElementEClass.getEStructuralFeatures().get(6);
	}

	public EClass getParameterableElement() {
		return this.parameterableElementEClass;
	}

	public EReference getParameterableElement_OwningTemplateParameter() {
		return (EReference) this.parameterableElementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getParameterableElement__templateParameterOfDefault() {
		return (EReference) this.parameterableElementEClass.getEStructuralFeatures().get(1);
	}

	public EReference getParameterableElement__templateParameterOfOwnedDefault() {
		return (EReference) this.parameterableElementEClass.getEStructuralFeatures().get(2);
	}

	public EReference getParameterableElement_TemplateParameter() {
		return (EReference) this.parameterableElementEClass.getEStructuralFeatures().get(3);
	}

	public EReference getParameterableElement__templateParameterSubstitutionOfActual() {
		return (EReference) this.parameterableElementEClass.getEStructuralFeatures().get(4);
	}

	public EReference getParameterableElement__templateParameterSubstitutionOfOwnedActual() {
		return (EReference) this.parameterableElementEClass.getEStructuralFeatures().get(5);
	}

	public EClass getTemplateParameter() {
		return this.templateParameterEClass;
	}

	public EReference getTemplateParameter_Default() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTemplateParameter_OwnedDefault() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTemplateParameter_ParameteredElement() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(2);
	}

	public EReference getTemplateParameter_Signature() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(3);
	}

	public EReference getTemplateParameter__templateSignatureOfParameter() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(4);
	}

	public EReference getTemplateParameter__redefinableTemplateSignatureOfInheritedParameter() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(5);
	}

	public EReference getTemplateParameter__templateParameterSubstitutionOfFormal() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(6);
	}

	public EReference getTemplateParameter_OwnedParameteredElement() {
		return (EReference) this.templateParameterEClass.getEStructuralFeatures().get(7);
	}

	public EClass getTemplateSignature() {
		return this.templateSignatureEClass;
	}

	public EReference getTemplateSignature_Parameter() {
		return (EReference) this.templateSignatureEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTemplateSignature_Template() {
		return (EReference) this.templateSignatureEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTemplateSignature__templateBindingOfSignature() {
		return (EReference) this.templateSignatureEClass.getEStructuralFeatures().get(2);
	}

	public EReference getTemplateSignature_OwnedParameter() {
		return (EReference) this.templateSignatureEClass.getEStructuralFeatures().get(3);
	}

	public EClass getTemplateableElement() {
		return this.templateableElementEClass;
	}

	public EReference getTemplateableElement_TemplateBinding() {
		return (EReference) this.templateableElementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTemplateableElement_OwnedTemplateSignature() {
		return (EReference) this.templateableElementEClass.getEStructuralFeatures().get(1);
	}

	public EClass getTemplateBinding() {
		return this.templateBindingEClass;
	}

	public EReference getTemplateBinding_ParameterSubstitution() {
		return (EReference) this.templateBindingEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTemplateBinding_Signature() {
		return (EReference) this.templateBindingEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTemplateBinding_BoundElement() {
		return (EReference) this.templateBindingEClass.getEStructuralFeatures().get(2);
	}

	public EClass getDirectedRelationship() {
		return this.directedRelationshipEClass;
	}

	public EReference getDirectedRelationship_Source() {
		return (EReference) this.directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDirectedRelationship_Target() {
		return (EReference) this.directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	public EClass getRelationship() {
		return this.relationshipEClass;
	}

	public EReference getRelationship_RelatedElement() {
		return (EReference) this.relationshipEClass.getEStructuralFeatures().get(0);
	}

	public EReference getRelationship__abstraction() {
		return (EReference) this.relationshipEClass.getEStructuralFeatures().get(1);
	}

	public EClass getInformationFlow() {
		return this.informationFlowEClass;
	}

	public EReference getInformationFlow_Conveyed() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInformationFlow_RealizingMessage() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInformationFlow_RealizingConnector() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInformationFlow_RealizingActivityEdge() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(3);
	}

	public EReference getInformationFlow_InformationSource() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(4);
	}

	public EReference getInformationFlow_InformationTarget() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(5);
	}

	public EReference getInformationFlow_Realization() {
		return (EReference) this.informationFlowEClass.getEStructuralFeatures().get(6);
	}

	public EClass getClassifier() {
		return this.classifierEClass;
	}

	public EReference getClassifier_Feature() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(4);
	}

	public EReference getClassifier__regionOfRedefinitionContext() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(1);
	}

	public EReference getClassifier__interfaceOfNestedClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(5);
	}

	public EReference getClassifier_CollaborationUse() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(11);
	}

	public EReference getClassifier_Representation() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(10);
	}

	public EReference getClassifier__createObjectActionOfClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(7);
	}

	public EReference getClassifier__readExtentActionOfClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(6);
	}

	public EReference getClassifier__readIsClassifiedObjectActionOfClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(9);
	}

	public EReference getClassifier__unmarshallActionOfUnmarshallType() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(8);
	}

	public EReference getClassifier__componentRealizationOfRealizingClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(12);
	}

	public EReference getClassifier_UseCase() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(2);
	}

	public EReference getClassifier_OwnedUseCase() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(3);
	}

	public EReference getClassifier__transitionOfRedefinitionContext() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(14);
	}

	public EReference getClassifier__vertexOfRedefinitionContext() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(15);
	}

	public EReference getClassifier__exceptionHandlerOfExceptionType() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(16);
	}

	public EReference getClassifier__reclassifyObjectActionOfNewClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(17);
	}

	public EReference getClassifier__reclassifyObjectActionOfOldClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(18);
	}

	public EReference getClassifier_Attribute() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(13);
	}

	public EReference getClassifier_UMLClass() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(20);
	}

	public EReference getClassifier_General() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(21);
	}

	public EReference getClassifier__classifierOfGeneral() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(22);
	}

	public EReference getClassifier_Generalization() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(23);
	}

	public EReference getClassifier__generalizationOfGeneral() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(24);
	}

	public EReference getClassifier_PowertypeExtent() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(25);
	}

	public EReference getClassifier_InheritedMember() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(26);
	}

	public EAttribute getClassifier_Abstract() {
		return (EAttribute) this.classifierEClass.getEStructuralFeatures().get(27);
	}

	public EAttribute getClassifier_FinalSpecialization() {
		return (EAttribute) this.classifierEClass.getEStructuralFeatures().get(28);
	}

	public EReference getClassifier_RedefinedClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(29);
	}

	public EReference getClassifier__classifierOfRedefinedClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(30);
	}

	public EReference getClassifier_Substitution() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(31);
	}

	public EReference getClassifier__substitutionOfContract() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(32);
	}

	public EReference getClassifier__classifierTemplateParameterOfConstrainingClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(33);
	}

	public EReference getClassifier__instanceSpecificationOfClassifier() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(35);
	}

	public EReference getClassifier__actionOfContext() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(19);
	}

	public EReference getClassifier__redefinableElementOfRedefinitionContext() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(0);
	}

	public EReference getClassifier__informationItemOfRepresented() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(34);
	}

	public EReference getClassifier__informationFlowOfConveyed() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(36);
	}

	public EReference getClassifier_OwnedTemplateSignature() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(37);
	}

	public EReference getClassifier_TemplateParameter() {
		return (EReference) this.classifierEClass.getEStructuralFeatures().get(38);
	}

	public EClass getNamespace() {
		return this.namespaceEClass;
	}

	public EReference getNamespace_ElementImport() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(0);
	}

	public EReference getNamespace_OwnedRule() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(1);
	}

	public EReference getNamespace_PackageImport() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(2);
	}

	public EReference getNamespace_ImportedMember() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(3);
	}

	public EReference getNamespace_Member() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(4);
	}

	public EReference getNamespace_OwnedMember() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(5);
	}

	public EReference getNamespace_OwnedDiagram() {
		return (EReference) this.namespaceEClass.getEStructuralFeatures().get(6);
	}

	public EClass getElementImport() {
		return this.elementImportEClass;
	}

	public EAttribute getElementImport_Alias() {
		return (EAttribute) this.elementImportEClass.getEStructuralFeatures().get(0);
	}

	public EReference getElementImport_ImportedElement() {
		return (EReference) this.elementImportEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getElementImport_Visibility() {
		return (EAttribute) this.elementImportEClass.getEStructuralFeatures().get(2);
	}

	public EReference getElementImport__profileOfMetaclassReference() {
		return (EReference) this.elementImportEClass.getEStructuralFeatures().get(3);
	}

	public EReference getElementImport_ImportingNamespace() {
		return (EReference) this.elementImportEClass.getEStructuralFeatures().get(4);
	}

	public EClass getProfile() {
		return this.profileEClass;
	}

	public EReference getProfile__stereotypeOfProfile() {
		return (EReference) this.profileEClass.getEStructuralFeatures().get(0);
	}

	public EReference getProfile__profileApplicationOfAppliedProfile() {
		return (EReference) this.profileEClass.getEStructuralFeatures().get(1);
	}

	public EReference getProfile_MetamodelReference() {
		return (EReference) this.profileEClass.getEStructuralFeatures().get(2);
	}

	public EReference getProfile_MetaclassReference() {
		return (EReference) this.profileEClass.getEStructuralFeatures().get(3);
	}

	public EClass getPackage() {
		return this.packageEClass;
	}

	public EAttribute getPackage_URI() {
		return (EAttribute) this.packageEClass.getEStructuralFeatures().get(0);
	}

	public EReference getPackage_NestedPackage() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(1);
	}

	public EReference getPackage_NestingPackage() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(2);
	}

	public EReference getPackage_OwnedStereotype() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(3);
	}

	public EReference getPackage_OwnedType() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(4);
	}

	public EReference getPackage_PackageMerge() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(5);
	}

	public EReference getPackage__packageMergeOfMergedPackage() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(6);
	}

	public EReference getPackage_PackagedElement() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(7);
	}

	public EReference getPackage_ProfileApplication() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(8);
	}

	public EReference getPackage__packageImportOfImportedPackage() {
		return (EReference) this.packageEClass.getEStructuralFeatures().get(9);
	}

	public EClass getStereotype() {
		return this.stereotypeEClass;
	}

	public EReference getStereotype__extensionEndOfType() {
		return (EReference) this.stereotypeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStereotype_Icon() {
		return (EReference) this.stereotypeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getStereotype_Profile() {
		return (EReference) this.stereotypeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getStereotype__packageOfOwnedStereotype() {
		return (EReference) this.stereotypeEClass.getEStructuralFeatures().get(3);
	}

	public EClass getClass_() {
		return this.classEClass;
	}

	public EReference getClass_OwnedOperation() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(1);
	}

	public EReference getClass_OwnedReception() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(0);
	}

	public EReference getClass_Extension() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getClass_Active() {
		return (EAttribute) this.classEClass.getEStructuralFeatures().get(3);
	}

	public EReference getClass_NestedClassifier() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(4);
	}

	public EReference getClass_SuperClass() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(5);
	}

	public EReference getClass__classOfSuperClass() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(6);
	}

	public EReference getClass_OwnedAttribute() {
		return (EReference) this.classEClass.getEStructuralFeatures().get(7);
	}

	public EAttribute getClass_Abstract() {
		return (EAttribute) this.classEClass.getEStructuralFeatures().get(8);
	}

	public EClass getBehavioredClassifier() {
		return this.behavioredClassifierEClass;
	}

	public EReference getBehavioredClassifier_ClassifierBehavior() {
		return (EReference) this.behavioredClassifierEClass.getEStructuralFeatures().get(0);
	}

	public EReference getBehavioredClassifier__behaviorOfContext() {
		return (EReference) this.behavioredClassifierEClass.getEStructuralFeatures().get(1);
	}

	public EReference getBehavioredClassifier_InterfaceRealization() {
		return (EReference) this.behavioredClassifierEClass.getEStructuralFeatures().get(2);
	}

	public EReference getBehavioredClassifier_OwnedBehavior() {
		return (EReference) this.behavioredClassifierEClass.getEStructuralFeatures().get(3);
	}

	public EClass getBehavior() {
		return this.behaviorEClass;
	}

	public EReference getBehavior_Context() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getBehavior_Reentrant() {
		return (EAttribute) this.behaviorEClass.getEStructuralFeatures().get(1);
	}

	public EReference getBehavior_OwnedParameter() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(2);
	}

	public EReference getBehavior__transitionOfEffect() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(3);
	}

	public EReference getBehavior_Specification() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(4);
	}

	public EReference getBehavior_OwnedParameterSet() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(5);
	}

	public EReference getBehavior__connectorOfContract() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(6);
	}

	public EReference getBehavior__reduceActionOfReducer() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(7);
	}

	public EReference getBehavior_Event() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(8);
	}

	public EReference getBehavior__opaqueExpressionOfBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(9);
	}

	public EReference getBehavior_Postcondition() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(10);
	}

	public EReference getBehavior_Precondition() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(11);
	}

	public EReference getBehavior__stateOfDoActivity() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(12);
	}

	public EReference getBehavior__stateOfEntry() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(13);
	}

	public EReference getBehavior__stateOfExit() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(14);
	}

	public EReference getBehavior__objectNodeOfSelection() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(15);
	}

	public EReference getBehavior_Observation() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(16);
	}

	public EReference getBehavior_RedefinedBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(17);
	}

	public EReference getBehavior__behaviorOfRedefinedBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(18);
	}

	public EReference getBehavior__behaviorExecutionSpecificationOfBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(22);
	}

	public EReference getBehavior__callBehaviorActionOfBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(24);
	}

	public EReference getBehavior__decisionNodeOfDecisionInput() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(21);
	}

	public EReference getBehavior__objectFlowOfSelection() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(20);
	}

	public EReference getBehavior__objectFlowOfTransformation() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(19);
	}

	public EReference getBehavior__behavioredClassifierOfOwnedBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(23);
	}

	public EReference getBehavior__behavioredClassifierOfClassifierBehavior() {
		return (EReference) this.behaviorEClass.getEStructuralFeatures().get(25);
	}

	public EClass getParameter() {
		return this.parameterEClass;
	}

	public EReference getParameter_OwnerFormalParam() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(0);
	}

	public EReference getParameter_ParameterSet() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(1);
	}

	public EReference getParameter__opaqueExpressionOfResult() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(2);
	}

	public EReference getParameter_Operation() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(3);
	}

	public EReference getParameter_DefaultValue() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(4);
	}

	public EAttribute getParameter_Default() {
		return (EAttribute) this.parameterEClass.getEStructuralFeatures().get(5);
	}

	public EAttribute getParameter_Direction() {
		return (EAttribute) this.parameterEClass.getEStructuralFeatures().get(6);
	}

	public EAttribute getParameter_Effect() {
		return (EAttribute) this.parameterEClass.getEStructuralFeatures().get(7);
	}

	public EAttribute getParameter_Exception() {
		return (EAttribute) this.parameterEClass.getEStructuralFeatures().get(8);
	}

	public EAttribute getParameter_Stream() {
		return (EAttribute) this.parameterEClass.getEStructuralFeatures().get(9);
	}

	public EReference getParameter__activityParameterNodeOfParameter() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(10);
	}

	public EReference getParameter__behaviorOfOwnedParameter() {
		return (EReference) this.parameterEClass.getEStructuralFeatures().get(11);
	}

	public EClass getMultiplicityElement() {
		return this.multiplicityElementEClass;
	}

	public EAttribute getMultiplicityElement_Ordered() {
		return (EAttribute) this.multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getMultiplicityElement_Unique() {
		return (EAttribute) this.multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute) this.multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	public EReference getMultiplicityElement_LowerValue() {
		return (EReference) this.multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	public EReference getMultiplicityElement_UpperValue() {
		return (EReference) this.multiplicityElementEClass.getEStructuralFeatures().get(4);
	}

	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute) this.multiplicityElementEClass.getEStructuralFeatures().get(5);
	}

	public EClass getValueSpecification() {
		return this.valueSpecificationEClass;
	}

	public EReference getValueSpecification_OwningSlot() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(3);
	}

	public EReference getValueSpecification_OwningConstraint() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getValueSpecification__messageOfArgument() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(5);
	}

	public EReference getValueSpecification__messageOfTarget() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(6);
	}

	public EReference getValueSpecification__interactionUseOfArgument() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(10);
	}

	public EReference getValueSpecification__interactionUseOfReturnValue() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(11);
	}

	public EReference getValueSpecification__interactionConstraintOfMaxint() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(8);
	}

	public EReference getValueSpecification__interactionConstraintOfMinint() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(9);
	}

	public EReference getValueSpecification__lifelineOfSelector() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getValueSpecification__activityEdgeOfGuard() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getValueSpecification__activityEdgeOfWeight() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(13);
	}

	public EReference getValueSpecification__valueSpecificationActionOfValue() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(7);
	}

	public EReference getValueSpecification__objectNodeOfUpperBound() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(12);
	}

	public EReference getValueSpecification_OwningProperty() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(4);
	}

	public EReference getValueSpecification__changeEventOfChangeExpression() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(18);
	}

	public EReference getValueSpecification_OwningParameter() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(17);
	}

	public EReference getValueSpecification__durationOfExpr() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(22);
	}

	public EReference getValueSpecification__timeExpressionOfExpr() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(23);
	}

	public EReference getValueSpecification__intervalOfMax() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(15);
	}

	public EReference getValueSpecification__intervalOfMin() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(16);
	}

	public EReference getValueSpecification__joinNodeOfJoinSpec() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(19);
	}

	public EReference getValueSpecification_Expression() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(24);
	}

	public EReference getValueSpecification_OwningInstanceSpec() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(20);
	}

	public EReference getValueSpecification_OwningUpper() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(21);
	}

	public EReference getValueSpecification__valuePinOfValue() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(14);
	}

	public EReference getValueSpecification_OwningLower() {
		return (EReference) this.valueSpecificationEClass.getEStructuralFeatures().get(25);
	}

	public EClass getTypedElement() {
		return this.typedElementEClass;
	}

	public EReference getTypedElement_Type() {
		return (EReference) this.typedElementEClass.getEStructuralFeatures().get(0);
	}

	public EClass getType() {
		return this.typeEClass;
	}

	public EReference getType_Package() {
		return (EReference) this.typeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getType__associationOfEndType() {
		return (EReference) this.typeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getType__behavioralFeatureOfRaisedException() {
		return (EReference) this.typeEClass.getEStructuralFeatures().get(5);
	}

	public EReference getType__operationOfRaisedException() {
		return (EReference) this.typeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getType__operationOfType() {
		return (EReference) this.typeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getType__typedElementOfType() {
		return (EReference) this.typeEClass.getEStructuralFeatures().get(2);
	}

	public EClass getAssociation() {
		return this.associationEClass;
	}

	public EAttribute getAssociation_Derived() {
		return (EAttribute) this.associationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getAssociation_MemberEnd() {
		return (EReference) this.associationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getAssociation__connectorOfType() {
		return (EReference) this.associationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getAssociation__clearAssociationActionOfAssociation() {
		return (EReference) this.associationEClass.getEStructuralFeatures().get(5);
	}

	public EReference getAssociation_OwnedEnd() {
		return (EReference) this.associationEClass.getEStructuralFeatures().get(3);
	}

	public EReference getAssociation_NavigableOwnedEnd() {
		return (EReference) this.associationEClass.getEStructuralFeatures().get(4);
	}

	public EReference getAssociation_EndType() {
		return (EReference) this.associationEClass.getEStructuralFeatures().get(6);
	}

	public EClass getProperty() {
		return this.propertyEClass;
	}

	public EReference getProperty_Datatype() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(4);
	}

	public EReference getProperty_Interface() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(6);
	}

	public EReference getProperty_OwningSignal() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(7);
	}

	public EReference getProperty__structuredClassifierOfOwnedAttribute() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(8);
	}

	public EReference getProperty__connectorEndOfDefiningEnd() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(9);
	}

	public EReference getProperty__connectorEndOfPartWithPort() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(10);
	}

	public EReference getProperty__interactionUseOfReturnValueRecipient() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(30);
	}

	public EReference getProperty__structuredClassifierOfPart() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(11);
	}

	public EReference getProperty__linkEndDataOfEnd() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(12);
	}

	public EReference getProperty__qualifierValueOfQualifier() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(13);
	}

	public EReference getProperty__readLinkObjectEndActionOfEnd() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(14);
	}

	public EReference getProperty__readLinkObjectEndQualifierActionOfQualifier() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(15);
	}

	public EReference getProperty__artifactOfOwnedAttribute() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(28);
	}

	public EAttribute getProperty_Aggregation() {
		return (EAttribute) this.propertyEClass.getEStructuralFeatures().get(0);
	}

	public EReference getProperty_AssociationEnd() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(1);
	}

	public EReference getProperty_Qualifier() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(2);
	}

	public EReference getProperty_UMLClass() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(3);
	}

	public EReference getProperty_DefaultValue() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(5);
	}

	public EAttribute getProperty_Composite() {
		return (EAttribute) this.propertyEClass.getEStructuralFeatures().get(16);
	}

	public EAttribute getProperty_Derived() {
		return (EAttribute) this.propertyEClass.getEStructuralFeatures().get(17);
	}

	public EAttribute getProperty_DerivedUnion() {
		return (EAttribute) this.propertyEClass.getEStructuralFeatures().get(18);
	}

	public EAttribute getProperty_ID() {
		return (EAttribute) this.propertyEClass.getEStructuralFeatures().get(19);
	}

	public EReference getProperty_Opposite() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(20);
	}

	public EReference getProperty__propertyOfOpposite() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(21);
	}

	public EReference getProperty_OwningAssociation() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(22);
	}

	public EReference getProperty_RedefinedProperty() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(23);
	}

	public EReference getProperty__propertyOfRedefinedProperty() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(24);
	}

	public EReference getProperty_SubsettedProperty() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(25);
	}

	public EReference getProperty__propertyOfSubsettedProperty() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(26);
	}

	public EReference getProperty_Classifier() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(29);
	}

	public EReference getProperty__associationOfNavigableOwnedEnd() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(27);
	}

	public EReference getProperty_Association() {
		return (EReference) this.propertyEClass.getEStructuralFeatures().get(31);
	}

	public EClass getStructuralFeature() {
		return this.structuralFeatureEClass;
	}

	public EAttribute getStructuralFeature_ReadOnly() {
		return (EAttribute) this.structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStructuralFeature__slotOfDefiningFeature() {
		return (EReference) this.structuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	public EReference getStructuralFeature__structuralFeatureActionOfStructuralFeature() {
		return (EReference) this.structuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	public EClass getFeature() {
		return this.featureEClass;
	}

	public EReference getFeature_FeaturingClassifier() {
		return (EReference) this.featureEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getFeature_Static() {
		return (EAttribute) this.featureEClass.getEStructuralFeatures().get(1);
	}

	public EClass getSlot() {
		return this.slotEClass;
	}

	public EReference getSlot_OwningInstance() {
		return (EReference) this.slotEClass.getEStructuralFeatures().get(0);
	}

	public EReference getSlot_Value() {
		return (EReference) this.slotEClass.getEStructuralFeatures().get(1);
	}

	public EReference getSlot_DefiningFeature() {
		return (EReference) this.slotEClass.getEStructuralFeatures().get(2);
	}

	public EClass getStructuralFeatureAction() {
		return this.structuralFeatureActionEClass;
	}

	public EReference getStructuralFeatureAction_Object() {
		return (EReference) this.structuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference) this.structuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getInputPin() {
		return this.inputPinEClass;
	}

	public EReference getInputPin__replyActionOfReplyValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(16);
	}

	public EReference getInputPin__replyActionOfReturnInformation() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(17);
	}

	public EReference getInputPin__structuredActivityNodeOfStructuredNodeInput() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(35);
	}

	public EReference getInputPin__loopNodeOfLoopVariableInput() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInputPin__opaqueActionOfInputValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(5);
	}

	public EReference getInputPin__qualifierValueOfValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(6);
	}

	public EReference getInputPin__linkEndDataOfValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(7);
	}

	public EReference getInputPin__linkActionOfInputValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(8);
	}

	public EReference getInputPin__linkEndCreationDataOfInsertAt() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(11);
	}

	public EReference getInputPin__readIsClassifiedObjectActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(14);
	}

	public EReference getInputPin__readLinkObjectEndActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(9);
	}

	public EReference getInputPin__readLinkObjectEndQualifierActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(15);
	}

	public EReference getInputPin__reduceActionOfCollection() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(3);
	}

	public EReference getInputPin__testIdentityActionOfFirst() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(12);
	}

	public EReference getInputPin__testIdentityActionOfSecond() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(13);
	}

	public EReference getInputPin__unmarshallActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(4);
	}

	public EReference getInputPin__writeStructuralFeatureActionOfValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(10);
	}

	public EReference getInputPin__callOperationActionOfTarget() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(20);
	}

	public EReference getInputPin__invocationActionOfArgument() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInputPin__linkEndDestructionDataOfDestroyAt() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(32);
	}

	public EReference getInputPin__raiseExceptionActionOfException() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(31);
	}

	public EReference getInputPin__actionOfInput() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(24);
	}

	public EReference getInputPin__addStructuralFeatureValueActionOfInsertAt() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(23);
	}

	public EReference getInputPin__addVariableValueActionOfInsertAt() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(33);
	}

	public EReference getInputPin__writeVariableActionOfValue() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(28);
	}

	public EReference getInputPin__clearAssociationActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(19);
	}

	public EReference getInputPin__reclassifyObjectActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(30);
	}

	public EReference getInputPin__startClassifierBehaviorActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(34);
	}

	public EReference getInputPin__startObjectBehaviorActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(26);
	}

	public EReference getInputPin__removeStructuralFeatureValueActionOfRemoveAt() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(25);
	}

	public EReference getInputPin__removeVariableValueActionOfRemoveAt() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(27);
	}

	public EReference getInputPin__sendObjectActionOfRequest() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(22);
	}

	public EReference getInputPin__sendObjectActionOfTarget() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(21);
	}

	public EReference getInputPin__destroyObjectActionOfTarget() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(29);
	}

	public EReference getInputPin__sendSignalActionOfTarget() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(18);
	}

	public EReference getInputPin__structuralFeatureActionOfObject() {
		return (EReference) this.inputPinEClass.getEStructuralFeatures().get(0);
	}

	public EClass getPin() {
		return this.pinEClass;
	}

	public EAttribute getPin_Control() {
		return (EAttribute) this.pinEClass.getEStructuralFeatures().get(0);
	}

	public EClass getObjectNode() {
		return this.objectNodeEClass;
	}

	public EReference getObjectNode_InState() {
		return (EReference) this.objectNodeEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getObjectNode_ControlType() {
		return (EAttribute) this.objectNodeEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getObjectNode_Ordering() {
		return (EAttribute) this.objectNodeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getObjectNode_Selection() {
		return (EReference) this.objectNodeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getObjectNode_UpperBound() {
		return (EReference) this.objectNodeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getObjectNode__exceptionHandlerOfExceptionInput() {
		return (EReference) this.objectNodeEClass.getEStructuralFeatures().get(5);
	}

	public EClass getState() {
		return this.stateEClass;
	}

	public EReference getState_Region() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(0);
	}

	public EReference getState_ConnectionPoint() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(1);
	}

	public EReference getState_Connection() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(2);
	}

	public EReference getState_Submachine() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(3);
	}

	public EReference getState_DeferrableTrigger() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(5);
	}

	public EReference getState_StateInvariant() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(4);
	}

	public EReference getState_DoActivity() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(6);
	}

	public EReference getState_Entry() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(7);
	}

	public EReference getState_Exit() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(8);
	}

	public EAttribute getState_Composite() {
		return (EAttribute) this.stateEClass.getEStructuralFeatures().get(9);
	}

	public EAttribute getState_Orthogonal() {
		return (EAttribute) this.stateEClass.getEStructuralFeatures().get(10);
	}

	public EAttribute getState_Simple() {
		return (EAttribute) this.stateEClass.getEStructuralFeatures().get(11);
	}

	public EAttribute getState_SubmachineState() {
		return (EAttribute) this.stateEClass.getEStructuralFeatures().get(12);
	}

	public EReference getState__objectNodeOfInState() {
		return (EReference) this.stateEClass.getEStructuralFeatures().get(13);
	}

	public EClass getVertex() {
		return this.vertexEClass;
	}

	public EReference getVertex_Container() {
		return (EReference) this.vertexEClass.getEStructuralFeatures().get(0);
	}

	public EReference getVertex_Outgoing() {
		return (EReference) this.vertexEClass.getEStructuralFeatures().get(1);
	}

	public EReference getVertex_Incoming() {
		return (EReference) this.vertexEClass.getEStructuralFeatures().get(2);
	}

	public EReference getVertex_RedefinedVertex() {
		return (EReference) this.vertexEClass.getEStructuralFeatures().get(3);
	}

	public EReference getVertex___vertexOfRedefinedVertex() {
		return (EReference) this.vertexEClass.getEStructuralFeatures().get(4);
	}

	public EReference getVertex_RedefinitionContext() {
		return (EReference) this.vertexEClass.getEStructuralFeatures().get(5);
	}

	public EClass getRegion() {
		return this.regionEClass;
	}

	public EReference getRegion_ExtendedRegion() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getRegion__regionOfExtendedRegion() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getRegion_State() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getRegion_StateMachine() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getRegion_Transition() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(4);
	}

	public EReference getRegion_Subvertex() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(5);
	}

	public EReference getRegion_RedefinitionContext() {
		return (EReference) this.regionEClass.getEStructuralFeatures().get(6);
	}

	public EClass getStateMachine() {
		return this.stateMachineEClass;
	}

	public EReference getStateMachine_ConnectionPoint() {
		return (EReference) this.stateMachineEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStateMachine_ExtendedStateMachine() {
		return (EReference) this.stateMachineEClass.getEStructuralFeatures().get(1);
	}

	public EReference getStateMachine__stateMachineOfExtendedStateMachine() {
		return (EReference) this.stateMachineEClass.getEStructuralFeatures().get(2);
	}

	public EReference getStateMachine_SubmachineState() {
		return (EReference) this.stateMachineEClass.getEStructuralFeatures().get(3);
	}

	public EReference getStateMachine_Region() {
		return (EReference) this.stateMachineEClass.getEStructuralFeatures().get(4);
	}

	public EClass getPseudostate() {
		return this.pseudostateEClass;
	}

	public EAttribute getPseudostate_Kind() {
		return (EAttribute) this.pseudostateEClass.getEStructuralFeatures().get(0);
	}

	public EReference getPseudostate_State() {
		return (EReference) this.pseudostateEClass.getEStructuralFeatures().get(1);
	}

	public EReference getPseudostate__connectionPointReferenceOfEntry() {
		return (EReference) this.pseudostateEClass.getEStructuralFeatures().get(3);
	}

	public EReference getPseudostate__connectionPointReferenceOfExit() {
		return (EReference) this.pseudostateEClass.getEStructuralFeatures().get(2);
	}

	public EReference getPseudostate_StateMachine() {
		return (EReference) this.pseudostateEClass.getEStructuralFeatures().get(4);
	}

	public EClass getConnectionPointReference() {
		return this.connectionPointReferenceEClass;
	}

	public EReference getConnectionPointReference_Exit() {
		return (EReference) this.connectionPointReferenceEClass.getEStructuralFeatures().get(2);
	}

	public EReference getConnectionPointReference_State() {
		return (EReference) this.connectionPointReferenceEClass.getEStructuralFeatures().get(1);
	}

	public EReference getConnectionPointReference_Entry() {
		return (EReference) this.connectionPointReferenceEClass.getEStructuralFeatures().get(0);
	}

	public EClass getTransition() {
		return this.transitionEClass;
	}

	public EReference getTransition_Effect() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTransition_Guard() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTransition_Trigger() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getTransition_Kind() {
		return (EAttribute) this.transitionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getTransition_RedefinedTransition() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(4);
	}

	public EReference getTransition__transitionOfRedefinedTransition() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(5);
	}

	public EReference getTransition_Source() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(6);
	}

	public EReference getTransition_Target() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(7);
	}

	public EReference getTransition_Container() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(8);
	}

	public EReference getTransition_RedefinitionContext() {
		return (EReference) this.transitionEClass.getEStructuralFeatures().get(9);
	}

	public EClass getConstraint() {
		return this.constraintEClass;
	}

	public EReference getConstraint_ConstrainedElement() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(0);
	}

	public EReference getConstraint_Context() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(1);
	}

	public EReference getConstraint_Specification() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(2);
	}

	public EReference getConstraint_BodyContext() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(10);
	}

	public EReference getConstraint__parameterSetOfCondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(8);
	}

	public EReference getConstraint__messageOfGuard() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(9);
	}

	public EReference getConstraint__stateInvariantOfInvariant() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(15);
	}

	public EReference getConstraint_PostContext() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(11);
	}

	public EReference getConstraint_PreContext() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(12);
	}

	public EReference getConstraint_OwningTransition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(6);
	}

	public EReference getConstraint__protocolTransitionOfPreCondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(7);
	}

	public EReference getConstraint__extendOfCondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(5);
	}

	public EReference getConstraint__actionOfLocalPostcondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(4);
	}

	public EReference getConstraint__actionOfLocalPrecondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(16);
	}

	public EReference getConstraint__behaviorOfPostcondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(13);
	}

	public EReference getConstraint__behaviorOfPrecondition() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(14);
	}

	public EReference getConstraint_OwningState() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(3);
	}

	public EReference getConstraint__transitionOfGuard() {
		return (EReference) this.constraintEClass.getEStructuralFeatures().get(17);
	}

	public EClass getOperation() {
		return this.operationEClass;
	}

	public EReference getOperation_UMLClass() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(5);
	}

	public EReference getOperation_Datatype() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getOperation_Interface() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getOperation_Ordered() {
		return (EAttribute) this.operationEClass.getEStructuralFeatures().get(6);
	}

	public EAttribute getOperation_Query() {
		return (EAttribute) this.operationEClass.getEStructuralFeatures().get(7);
	}

	public EAttribute getOperation_Unique() {
		return (EAttribute) this.operationEClass.getEStructuralFeatures().get(8);
	}

	public EAttribute getOperation_Lower() {
		return (EAttribute) this.operationEClass.getEStructuralFeatures().get(9);
	}

	public EReference getOperation_Postcondition() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(10);
	}

	public EReference getOperation_Precondition() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(11);
	}

	public EReference getOperation_RedefinedOperation() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(12);
	}

	public EReference getOperation__operationOfRedefinedOperation() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(13);
	}

	public EReference getOperation_Type() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getOperation_Upper() {
		return (EAttribute) this.operationEClass.getEStructuralFeatures().get(14);
	}

	public EReference getOperation__callEventOfOperation() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(16);
	}

	public EReference getOperation__callOperationActionOfOperation() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(15);
	}

	public EReference getOperation__artifactOfOwnedOperation() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(3);
	}

	public EReference getOperation__protocolTransitionOfReferred() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(17);
	}

	public EReference getOperation_BodyCondition() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(4);
	}

	public EReference getOperation_OwnedParameter() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(19);
	}

	public EReference getOperation_RaisedException() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(18);
	}

	public EReference getOperation_TemplateParameter() {
		return (EReference) this.operationEClass.getEStructuralFeatures().get(20);
	}

	public EClass getBehavioralFeature() {
		return this.behavioralFeatureEClass;
	}

	public EAttribute getBehavioralFeature_Concurrency() {
		return (EAttribute) this.behavioralFeatureEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getBehavioralFeature_Abstract() {
		return (EAttribute) this.behavioralFeatureEClass.getEStructuralFeatures().get(1);
	}

	public EReference getBehavioralFeature_Method() {
		return (EReference) this.behavioralFeatureEClass.getEStructuralFeatures().get(2);
	}

	public EReference getBehavioralFeature_OwnedParameter() {
		return (EReference) this.behavioralFeatureEClass.getEStructuralFeatures().get(3);
	}

	public EReference getBehavioralFeature_OwnedParameterSet() {
		return (EReference) this.behavioralFeatureEClass.getEStructuralFeatures().get(4);
	}

	public EReference getBehavioralFeature_RaisedException() {
		return (EReference) this.behavioralFeatureEClass.getEStructuralFeatures().get(5);
	}

	public EClass getParameterSet() {
		return this.parameterSetEClass;
	}

	public EReference getParameterSet_Condition() {
		return (EReference) this.parameterSetEClass.getEStructuralFeatures().get(0);
	}

	public EReference getParameterSet_Parameter() {
		return (EReference) this.parameterSetEClass.getEStructuralFeatures().get(1);
	}

	public EReference getParameterSet__behaviorOfOwnedParameterSet() {
		return (EReference) this.parameterSetEClass.getEStructuralFeatures().get(2);
	}

	public EReference getParameterSet__behavioralFeatureOfOwnedParameterSet() {
		return (EReference) this.parameterSetEClass.getEStructuralFeatures().get(3);
	}

	public EClass getDataType() {
		return this.dataTypeEClass;
	}

	public EReference getDataType_OwnedAttribute() {
		return (EReference) this.dataTypeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDataType_OwnedOperation() {
		return (EReference) this.dataTypeEClass.getEStructuralFeatures().get(0);
	}

	public EClass getInterface() {
		return this.interfaceEClass;
	}

	public EReference getInterface_NestedClassifier() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInterface_OwnedAttribute() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(11);
	}

	public EReference getInterface_OwnedReception() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInterface_Protocol() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(3);
	}

	public EReference getInterface__portOfProvided() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(4);
	}

	public EReference getInterface__portOfRequired() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(5);
	}

	public EReference getInterface_RedefinedInterface() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(6);
	}

	public EReference getInterface__interfaceOfRedefinedInterface() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(7);
	}

	public EReference getInterface__interfaceRealizationOfContract() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(8);
	}

	public EReference getInterface__componentOfProvided() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(9);
	}

	public EReference getInterface__componentOfRequired() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(10);
	}

	public EReference getInterface_OwnedOperation() {
		return (EReference) this.interfaceEClass.getEStructuralFeatures().get(1);
	}

	public EClass getReception() {
		return this.receptionEClass;
	}

	public EReference getReception_Signal() {
		return (EReference) this.receptionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getReception__classOfOwnedReception() {
		return (EReference) this.receptionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReception__interfaceOfOwnedReception() {
		return (EReference) this.receptionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getSignal() {
		return this.signalEClass;
	}

	public EReference getSignal_OwnedAttribute() {
		return (EReference) this.signalEClass.getEStructuralFeatures().get(0);
	}

	public EReference getSignal__broadcastSignalActionOfSignal() {
		return (EReference) this.signalEClass.getEStructuralFeatures().get(3);
	}

	public EReference getSignal__sendSignalActionOfSignal() {
		return (EReference) this.signalEClass.getEStructuralFeatures().get(2);
	}

	public EReference getSignal__signalEventOfSignal() {
		return (EReference) this.signalEClass.getEStructuralFeatures().get(1);
	}

	public EReference getSignal__receptionOfSignal() {
		return (EReference) this.signalEClass.getEStructuralFeatures().get(4);
	}

	public EClass getBroadcastSignalAction() {
		return this.broadcastSignalActionEClass;
	}

	public EReference getBroadcastSignalAction_Signal() {
		return (EReference) this.broadcastSignalActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getSignalEvent() {
		return this.signalEventEClass;
	}

	public EReference getSignalEvent_Signal() {
		return (EReference) this.signalEventEClass.getEStructuralFeatures().get(0);
	}

	public EClass getMessageEvent() {
		return this.messageEventEClass;
	}

	public EClass getEvent() {
		return this.eventEClass;
	}

	public EReference getEvent__triggerOfEvent() {
		return (EReference) this.eventEClass.getEStructuralFeatures().get(0);
	}

	public EReference getEvent_Behavior() {
		return (EReference) this.eventEClass.getEStructuralFeatures().get(1);
	}

	public EClass getTrigger() {
		return this.triggerEClass;
	}

	public EReference getTrigger_Port() {
		return (EReference) this.triggerEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTrigger__stateOfDeferrableTrigger() {
		return (EReference) this.triggerEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTrigger__replyActionOfReplyToCall() {
		return (EReference) this.triggerEClass.getEStructuralFeatures().get(4);
	}

	public EReference getTrigger__acceptEventActionOfTrigger() {
		return (EReference) this.triggerEClass.getEStructuralFeatures().get(3);
	}

	public EReference getTrigger__transitionOfTrigger() {
		return (EReference) this.triggerEClass.getEStructuralFeatures().get(2);
	}

	public EReference getTrigger_Event() {
		return (EReference) this.triggerEClass.getEStructuralFeatures().get(5);
	}

	public EClass getPort() {
		return this.portEClass;
	}

	public EAttribute getPort_Behavior() {
		return (EAttribute) this.portEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getPort_Conjugated() {
		return (EAttribute) this.portEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getPort_Service() {
		return (EAttribute) this.portEClass.getEStructuralFeatures().get(2);
	}

	public EReference getPort_Protocol() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(3);
	}

	public EReference getPort_Provided() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(4);
	}

	public EReference getPort_RedefinedPort() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(5);
	}

	public EReference getPort__portOfRedefinedPort() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(6);
	}

	public EReference getPort_Required() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(7);
	}

	public EReference getPort__invocationActionOfOnPort() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(9);
	}

	public EReference getPort__encapsulatedClassifierOfOwnedPort() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(8);
	}

	public EReference getPort__triggerOfPort() {
		return (EReference) this.portEClass.getEStructuralFeatures().get(10);
	}

	public EClass getProtocolStateMachine() {
		return this.protocolStateMachineEClass;
	}

	public EReference getProtocolStateMachine_Conformance() {
		return (EReference) this.protocolStateMachineEClass.getEStructuralFeatures().get(0);
	}

	public EReference getProtocolStateMachine__protocolConformanceOfGeneralMachine() {
		return (EReference) this.protocolStateMachineEClass.getEStructuralFeatures().get(1);
	}

	public EReference getProtocolStateMachine_Interface() {
		return (EReference) this.protocolStateMachineEClass.getEStructuralFeatures().get(2);
	}

	public EReference getProtocolStateMachine__portOfProtocol() {
		return (EReference) this.protocolStateMachineEClass.getEStructuralFeatures().get(3);
	}

	public EClass getProtocolConformance() {
		return this.protocolConformanceEClass;
	}

	public EReference getProtocolConformance_GeneralMachine() {
		return (EReference) this.protocolConformanceEClass.getEStructuralFeatures().get(0);
	}

	public EReference getProtocolConformance_SpecificMachine() {
		return (EReference) this.protocolConformanceEClass.getEStructuralFeatures().get(1);
	}

	public EClass getEncapsulatedClassifier() {
		return this.encapsulatedClassifierEClass;
	}

	public EReference getEncapsulatedClassifier_OwnedPort() {
		return (EReference) this.encapsulatedClassifierEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStructuredClassifier() {
		return this.structuredClassifierEClass;
	}

	public EReference getStructuredClassifier_OwnedAttribute() {
		return (EReference) this.structuredClassifierEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStructuredClassifier_OwnedConnector() {
		return (EReference) this.structuredClassifierEClass.getEStructuralFeatures().get(1);
	}

	public EReference getStructuredClassifier_Role() {
		return (EReference) this.structuredClassifierEClass.getEStructuralFeatures().get(3);
	}

	public EReference getStructuredClassifier_Part() {
		return (EReference) this.structuredClassifierEClass.getEStructuralFeatures().get(2);
	}

	public EClass getConnector() {
		return this.connectorEClass;
	}

	public EReference getConnector_Contract() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(0);
	}

	public EReference getConnector_End() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(1);
	}

	public EReference getConnector__messageOfConnector() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(6);
	}

	public EAttribute getConnector_Kind() {
		return (EAttribute) this.connectorEClass.getEStructuralFeatures().get(2);
	}

	public EReference getConnector_RedefinedConnector() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(3);
	}

	public EReference getConnector__connectorOfRedefinedConnector() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(4);
	}

	public EReference getConnector_Type() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(5);
	}

	public EReference getConnector__informationFlowOfRealizingConnector() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(7);
	}

	public EReference getConnector__structuredClassifierOfOwnedConnector() {
		return (EReference) this.connectorEClass.getEStructuralFeatures().get(8);
	}

	public EClass getConnectorEnd() {
		return this.connectorEndEClass;
	}

	public EReference getConnectorEnd_DefiningEnd() {
		return (EReference) this.connectorEndEClass.getEStructuralFeatures().get(0);
	}

	public EReference getConnectorEnd_PartWithPort() {
		return (EReference) this.connectorEndEClass.getEStructuralFeatures().get(1);
	}

	public EReference getConnectorEnd_Role() {
		return (EReference) this.connectorEndEClass.getEStructuralFeatures().get(2);
	}

	public EReference getConnectorEnd__connectorOfEnd() {
		return (EReference) this.connectorEndEClass.getEStructuralFeatures().get(3);
	}

	public EClass getConnectableElement() {
		return this.connectableElementEClass;
	}

	public EReference getConnectableElement__collaborationOfCollaborationRole() {
		return (EReference) this.connectableElementEClass.getEStructuralFeatures().get(2);
	}

	public EReference getConnectableElement__lifelineOfRepresents() {
		return (EReference) this.connectableElementEClass.getEStructuralFeatures().get(3);
	}

	public EReference getConnectableElement__structuredClassifierOfRole() {
		return (EReference) this.connectableElementEClass.getEStructuralFeatures().get(1);
	}

	public EReference getConnectableElement_End() {
		return (EReference) this.connectableElementEClass.getEStructuralFeatures().get(0);
	}

	public EReference getConnectableElement_TemplateParameter() {
		return (EReference) this.connectableElementEClass.getEStructuralFeatures().get(4);
	}

	public EClass getConnectableElementTemplateParameter() {
		return this.connectableElementTemplateParameterEClass;
	}

	public EReference getConnectableElementTemplateParameter_ParameteredElement() {
		return (EReference) this.connectableElementTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCollaboration() {
		return this.collaborationEClass;
	}

	public EReference getCollaboration__collaborationUseOfType() {
		return (EReference) this.collaborationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getCollaboration_CollaborationRole() {
		return (EReference) this.collaborationEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCollaborationUse() {
		return this.collaborationUseEClass;
	}

	public EReference getCollaborationUse_RoleBinding() {
		return (EReference) this.collaborationUseEClass.getEStructuralFeatures().get(3);
	}

	public EReference getCollaborationUse__classifierOfCollaborationUse() {
		return (EReference) this.collaborationUseEClass.getEStructuralFeatures().get(2);
	}

	public EReference getCollaborationUse__classifierOfRepresentation() {
		return (EReference) this.collaborationUseEClass.getEStructuralFeatures().get(1);
	}

	public EReference getCollaborationUse_Type() {
		return (EReference) this.collaborationUseEClass.getEStructuralFeatures().get(0);
	}

	public EClass getDependency() {
		return this.dependencyEClass;
	}

	public EReference getDependency_Client() {
		return (EReference) this.dependencyEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDependency_Supplier() {
		return (EReference) this.dependencyEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDependency__collaborationUseOfRoleBinding() {
		return (EReference) this.dependencyEClass.getEStructuralFeatures().get(2);
	}

	public EClass getLifeline() {
		return this.lifelineEClass;
	}

	public EReference getLifeline_CoveredBy() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(0);
	}

	public EReference getLifeline_Interaction() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(3);
	}

	public EReference getLifeline__occurrenceSpecificationOfCovered() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(2);
	}

	public EReference getLifeline_DecomposedAs() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(4);
	}

	public EReference getLifeline_Selector() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(6);
	}

	public EReference getLifeline__stateInvariantOfCovered() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(1);
	}

	public EReference getLifeline_Represents() {
		return (EReference) this.lifelineEClass.getEStructuralFeatures().get(5);
	}

	public EClass getInteractionFragment() {
		return this.interactionFragmentEClass;
	}

	public EReference getInteractionFragment_EnclosingInteraction() {
		return (EReference) this.interactionFragmentEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInteractionFragment_EnclosingOperand() {
		return (EReference) this.interactionFragmentEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInteractionFragment_GeneralOrdering() {
		return (EReference) this.interactionFragmentEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInteractionFragment_Covered() {
		return (EReference) this.interactionFragmentEClass.getEStructuralFeatures().get(3);
	}

	public EClass getInteraction() {
		return this.interactionEClass;
	}

	public EReference getInteraction_Action() {
		return (EReference) this.interactionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInteraction_FormalGate() {
		return (EReference) this.interactionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInteraction_Message() {
		return (EReference) this.interactionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInteraction__interactionUseOfRefersTo() {
		return (EReference) this.interactionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getInteraction_Lifeline() {
		return (EReference) this.interactionEClass.getEStructuralFeatures().get(4);
	}

	public EReference getInteraction_Fragment() {
		return (EReference) this.interactionEClass.getEStructuralFeatures().get(5);
	}

	public EClass getGate() {
		return this.gateEClass;
	}

	public EReference getGate_FormalGate() {
		return (EReference) this.gateEClass.getEStructuralFeatures().get(0);
	}

	public EReference getGate__gateOfFormalGate() {
		return (EReference) this.gateEClass.getEStructuralFeatures().get(1);
	}

	public EReference getGate__interactionUseOfActualGate() {
		return (EReference) this.gateEClass.getEStructuralFeatures().get(4);
	}

	public EReference getGate__combinedFragmentOfCfragmentGate() {
		return (EReference) this.gateEClass.getEStructuralFeatures().get(2);
	}

	public EReference getGate__interactionOfFormalGate() {
		return (EReference) this.gateEClass.getEStructuralFeatures().get(3);
	}

	public EClass getMessageEnd() {
		return this.messageEndEClass;
	}

	public EReference getMessageEnd_Message() {
		return (EReference) this.messageEndEClass.getEStructuralFeatures().get(0);
	}

	public EReference getMessageEnd__messageOfReceiveEvent() {
		return (EReference) this.messageEndEClass.getEStructuralFeatures().get(2);
	}

	public EReference getMessageEnd__messageOfSendEvent() {
		return (EReference) this.messageEndEClass.getEStructuralFeatures().get(1);
	}

	public EClass getMessage() {
		return this.messageEClass;
	}

	public EReference getMessage_Argument() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(0);
	}

	public EReference getMessage_Connector() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(13);
	}

	public EReference getMessage_Interaction() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getMessage_MessageKind() {
		return (EAttribute) this.messageEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getMessage_MessageSort() {
		return (EAttribute) this.messageEClass.getEStructuralFeatures().get(3);
	}

	public EReference getMessage_ReceiveEvent() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(4);
	}

	public EReference getMessage_SendEvent() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(6);
	}

	public EReference getMessage_Signature() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(7);
	}

	public EReference getMessage_Guard() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(8);
	}

	public EReference getMessage_Target() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(9);
	}

	public EReference getMessage_ReplyMessage() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(10);
	}

	public EReference getMessage__messageOfReplyMessage() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(11);
	}

	public EReference getMessage__informationFlowOfRealizingMessage() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(12);
	}

	public EReference getMessage__messageEndOfMessage() {
		return (EReference) this.messageEClass.getEStructuralFeatures().get(5);
	}

	public EClass getInteractionUse() {
		return this.interactionUseEClass;
	}

	public EReference getInteractionUse_Argument() {
		return (EReference) this.interactionUseEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInteractionUse_RefersTo() {
		return (EReference) this.interactionUseEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInteractionUse_ReturnValue() {
		return (EReference) this.interactionUseEClass.getEStructuralFeatures().get(3);
	}

	public EReference getInteractionUse_ReturnValueRecipient() {
		return (EReference) this.interactionUseEClass.getEStructuralFeatures().get(4);
	}

	public EReference getInteractionUse_ActualGate() {
		return (EReference) this.interactionUseEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCombinedFragment() {
		return this.combinedFragmentEClass;
	}

	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute) this.combinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	public EReference getCombinedFragment_Operand() {
		return (EReference) this.combinedFragmentEClass.getEStructuralFeatures().get(1);
	}

	public EReference getCombinedFragment_CfragmentGate() {
		return (EReference) this.combinedFragmentEClass.getEStructuralFeatures().get(2);
	}

	public EClass getInteractionOperand() {
		return this.interactionOperandEClass;
	}

	public EReference getInteractionOperand_Fragment() {
		return (EReference) this.interactionOperandEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInteractionOperand_Guard() {
		return (EReference) this.interactionOperandEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInteractionOperand__combinedFragmentOfOperand() {
		return (EReference) this.interactionOperandEClass.getEStructuralFeatures().get(2);
	}

	public EClass getInteractionConstraint() {
		return this.interactionConstraintEClass;
	}

	public EReference getInteractionConstraint_Maxint() {
		return (EReference) this.interactionConstraintEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInteractionConstraint_Minint() {
		return (EReference) this.interactionConstraintEClass.getEStructuralFeatures().get(1);
	}

	public EReference getInteractionConstraint__interactionOperandOfGuard() {
		return (EReference) this.interactionConstraintEClass.getEStructuralFeatures().get(2);
	}

	public EClass getGeneralOrdering() {
		return this.generalOrderingEClass;
	}

	public EReference getGeneralOrdering_After() {
		return (EReference) this.generalOrderingEClass.getEStructuralFeatures().get(0);
	}

	public EReference getGeneralOrdering_Before() {
		return (EReference) this.generalOrderingEClass.getEStructuralFeatures().get(2);
	}

	public EReference getGeneralOrdering__interactionFragmentOfGeneralOrdering() {
		return (EReference) this.generalOrderingEClass.getEStructuralFeatures().get(1);
	}

	public EClass getOccurrenceSpecification() {
		return this.occurrenceSpecificationEClass;
	}

	public EReference getOccurrenceSpecification_ToAfter() {
		return (EReference) this.occurrenceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getOccurrenceSpecification__executionSpecificationOfFinish() {
		return (EReference) this.occurrenceSpecificationEClass.getEStructuralFeatures().get(3);
	}

	public EReference getOccurrenceSpecification__executionSpecificationOfStart() {
		return (EReference) this.occurrenceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getOccurrenceSpecification_ToBefore() {
		return (EReference) this.occurrenceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getOccurrenceSpecification_Covered() {
		return (EReference) this.occurrenceSpecificationEClass.getEStructuralFeatures().get(4);
	}

	public EClass getExecutionSpecification() {
		return this.executionSpecificationEClass;
	}

	public EReference getExecutionSpecification_Start() {
		return (EReference) this.executionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExecutionSpecification__executionOccurrenceSpecificationOfExecution() {
		return (EReference) this.executionSpecificationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getExecutionSpecification_Finish() {
		return (EReference) this.executionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EClass getExecutionOccurrenceSpecification() {
		return this.executionOccurrenceSpecificationEClass;
	}

	public EReference getExecutionOccurrenceSpecification_Execution() {
		return (EReference) this.executionOccurrenceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EClass getPartDecomposition() {
		return this.partDecompositionEClass;
	}

	public EReference getPartDecomposition__lifelineOfDecomposedAs() {
		return (EReference) this.partDecompositionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStateInvariant() {
		return this.stateInvariantEClass;
	}

	public EReference getStateInvariant_Invariant() {
		return (EReference) this.stateInvariantEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStateInvariant_Covered() {
		return (EReference) this.stateInvariantEClass.getEStructuralFeatures().get(1);
	}

	public EClass getReplyAction() {
		return this.replyActionEClass;
	}

	public EReference getReplyAction_ReplyValue() {
		return (EReference) this.replyActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getReplyAction_ReturnInformation() {
		return (EReference) this.replyActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReplyAction_ReplyToCall() {
		return (EReference) this.replyActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getAcceptEventAction() {
		return this.acceptEventActionEClass;
	}

	public EAttribute getAcceptEventAction_Unmarshall() {
		return (EAttribute) this.acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getAcceptEventAction_Result() {
		return (EReference) this.acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getAcceptEventAction_Trigger() {
		return (EReference) this.acceptEventActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getOutputPin() {
		return this.outputPinEClass;
	}

	public EReference getOutputPin__clauseOfBodyOutput() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(3);
	}

	public EReference getOutputPin__clauseOfDecider() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(4);
	}

	public EReference getOutputPin__structuredActivityNodeOfStructuredNodeOutput() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(0);
	}

	public EReference getOutputPin__conditionalNodeOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(2);
	}

	public EReference getOutputPin__loopNodeOfBodyOutput() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(6);
	}

	public EReference getOutputPin__loopNodeOfDecider() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(7);
	}

	public EReference getOutputPin__loopNodeOfLoopVariable() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(5);
	}

	public EReference getOutputPin__loopNodeOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(8);
	}

	public EReference getOutputPin__opaqueActionOfOutputValue() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(13);
	}

	public EReference getOutputPin__actionOfOutput() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(10);
	}

	public EReference getOutputPin__callActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(24);
	}

	public EReference getOutputPin__clearStructuralFeatureActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(20);
	}

	public EReference getOutputPin__createLinkObjectActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(18);
	}

	public EReference getOutputPin__createObjectActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(11);
	}

	public EReference getOutputPin__readExtentActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(1);
	}

	public EReference getOutputPin__readIsClassifiedObjectActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(23);
	}

	public EReference getOutputPin__readLinkActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(14);
	}

	public EReference getOutputPin__readLinkObjectEndActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(15);
	}

	public EReference getOutputPin__readLinkObjectEndQualifierActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(27);
	}

	public EReference getOutputPin__readSelfActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(25);
	}

	public EReference getOutputPin__readStructuralFeatureActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(19);
	}

	public EReference getOutputPin__readVariableActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(26);
	}

	public EReference getOutputPin__reduceActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(9);
	}

	public EReference getOutputPin__testIdentityActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(22);
	}

	public EReference getOutputPin__unmarshallActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(12);
	}

	public EReference getOutputPin__valueSpecificationActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(21);
	}

	public EReference getOutputPin__writeStructuralFeatureActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(17);
	}

	public EReference getOutputPin__acceptCallActionOfReturnInformation() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(16);
	}

	public EReference getOutputPin__acceptEventActionOfResult() {
		return (EReference) this.outputPinEClass.getEStructuralFeatures().get(28);
	}

	public EClass getClause() {
		return this.clauseEClass;
	}

	public EReference getClause_Body() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(0);
	}

	public EReference getClause_Decider() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(2);
	}

	public EReference getClause_PredecessorClause() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(3);
	}

	public EReference getClause_SuccessorClause() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(4);
	}

	public EReference getClause_Test() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(5);
	}

	public EReference getClause__conditionalNodeOfClause() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(6);
	}

	public EReference getClause_BodyOutput() {
		return (EReference) this.clauseEClass.getEStructuralFeatures().get(1);
	}

	public EClass getConditionalNode() {
		return this.conditionalNodeEClass;
	}

	public EAttribute getConditionalNode_Assured() {
		return (EAttribute) this.conditionalNodeEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getConditionalNode_Determinate() {
		return (EAttribute) this.conditionalNodeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getConditionalNode_Result() {
		return (EReference) this.conditionalNodeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getConditionalNode_Clause() {
		return (EReference) this.conditionalNodeEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStructuredActivityNode() {
		return this.structuredActivityNodeEClass;
	}

	public EReference getStructuredActivityNode_Variable() {
		return (EReference) this.structuredActivityNodeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getStructuredActivityNode_Edge() {
		return (EReference) this.structuredActivityNodeEClass.getEStructuralFeatures().get(5);
	}

	public EAttribute getStructuredActivityNode_MustIsolate() {
		return (EAttribute) this.structuredActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStructuredActivityNode_Node() {
		return (EReference) this.structuredActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getStructuredActivityNode_StructuredNodeInput() {
		return (EReference) this.structuredActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getStructuredActivityNode_StructuredNodeOutput() {
		return (EReference) this.structuredActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getStructuredActivityNode_Activity() {
		return (EReference) this.structuredActivityNodeEClass.getEStructuralFeatures().get(6);
	}

	public EClass getActivityGroup() {
		return this.activityGroupEClass;
	}

	public EReference getActivityGroup_ContainedEdge() {
		return (EReference) this.activityGroupEClass.getEStructuralFeatures().get(4);
	}

	public EReference getActivityGroup_InActivity() {
		return (EReference) this.activityGroupEClass.getEStructuralFeatures().get(1);
	}

	public EReference getActivityGroup_ContainedNode() {
		return (EReference) this.activityGroupEClass.getEStructuralFeatures().get(0);
	}

	public EReference getActivityGroup_Subgroup() {
		return (EReference) this.activityGroupEClass.getEStructuralFeatures().get(2);
	}

	public EReference getActivityGroup_SuperGroup() {
		return (EReference) this.activityGroupEClass.getEStructuralFeatures().get(3);
	}

	public EClass getActivityEdge() {
		return this.activityEdgeEClass;
	}

	public EReference getActivityEdge_Activity() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(11);
	}

	public EReference getActivityEdge_InPartition() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	public EReference getActivityEdge_Guard() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getActivityEdge_InStructuredNode() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getActivityEdge_Interrupts() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getActivityEdge_RedefinedEdge() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	public EReference getActivityEdge__activityEdgeOfRedefinedEdge() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(6);
	}

	public EReference getActivityEdge_Source() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(7);
	}

	public EReference getActivityEdge_Target() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(8);
	}

	public EReference getActivityEdge_Weight() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(9);
	}

	public EReference getActivityEdge__informationFlowOfRealizingActivityEdge() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(10);
	}

	public EReference getActivityEdge_InGroup() {
		return (EReference) this.activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	public EClass getActivity() {
		return this.activityEClass;
	}

	public EReference getActivity_Group() {
		return (EReference) this.activityEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getActivity_ReadOnly() {
		return (EAttribute) this.activityEClass.getEStructuralFeatures().get(4);
	}

	public EAttribute getActivity_SingleExecution() {
		return (EAttribute) this.activityEClass.getEStructuralFeatures().get(5);
	}

	public EReference getActivity_Node() {
		return (EReference) this.activityEClass.getEStructuralFeatures().get(7);
	}

	public EReference getActivity_Partition() {
		return (EReference) this.activityEClass.getEStructuralFeatures().get(2);
	}

	public EReference getActivity_StructuredNode() {
		return (EReference) this.activityEClass.getEStructuralFeatures().get(3);
	}

	public EReference getActivity_Variable() {
		return (EReference) this.activityEClass.getEStructuralFeatures().get(6);
	}

	public EReference getActivity_Edge() {
		return (EReference) this.activityEClass.getEStructuralFeatures().get(0);
	}

	public EClass getActivityPartition() {
		return this.activityPartitionEClass;
	}

	public EReference getActivityPartition_Edge() {
		return (EReference) this.activityPartitionEClass.getEStructuralFeatures().get(7);
	}

	public EAttribute getActivityPartition_Dimension() {
		return (EAttribute) this.activityPartitionEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getActivityPartition_External() {
		return (EAttribute) this.activityPartitionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getActivityPartition_Node() {
		return (EReference) this.activityPartitionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getActivityPartition_Represents() {
		return (EReference) this.activityPartitionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getActivityPartition_Subpartition() {
		return (EReference) this.activityPartitionEClass.getEStructuralFeatures().get(4);
	}

	public EReference getActivityPartition_SuperPartition() {
		return (EReference) this.activityPartitionEClass.getEStructuralFeatures().get(5);
	}

	public EReference getActivityPartition__activityOfPartition() {
		return (EReference) this.activityPartitionEClass.getEStructuralFeatures().get(6);
	}

	public EClass getVariable() {
		return this.variableEClass;
	}

	public EReference getVariable_Scope() {
		return (EReference) this.variableEClass.getEStructuralFeatures().get(1);
	}

	public EReference getVariable__variableActionOfVariable() {
		return (EReference) this.variableEClass.getEStructuralFeatures().get(0);
	}

	public EReference getVariable_ActivityScope() {
		return (EReference) this.variableEClass.getEStructuralFeatures().get(2);
	}

	public EClass getVariableAction() {
		return this.variableActionEClass;
	}

	public EReference getVariableAction_Variable() {
		return (EReference) this.variableActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getInterruptibleActivityRegion() {
		return this.interruptibleActivityRegionEClass;
	}

	public EReference getInterruptibleActivityRegion_Node() {
		return (EReference) this.interruptibleActivityRegionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInterruptibleActivityRegion_InterruptingEdge() {
		return (EReference) this.interruptibleActivityRegionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getLoopNode() {
		return this.loopNodeEClass;
	}

	public EReference getLoopNode_BodyPart() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getLoopNode_Decider() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(2);
	}

	public EAttribute getLoopNode_TestedFirst() {
		return (EAttribute) this.loopNodeEClass.getEStructuralFeatures().get(3);
	}

	public EReference getLoopNode_LoopVariable() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(8);
	}

	public EReference getLoopNode_LoopVariableInput() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(4);
	}

	public EReference getLoopNode_Result() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(5);
	}

	public EReference getLoopNode_SetupPart() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(6);
	}

	public EReference getLoopNode_Test() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(7);
	}

	public EReference getLoopNode_BodyOutput() {
		return (EReference) this.loopNodeEClass.getEStructuralFeatures().get(0);
	}

	public EClass getOpaqueAction() {
		return this.opaqueActionEClass;
	}

	public EAttribute getOpaqueAction_Body() {
		return (EAttribute) this.opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getOpaqueAction_InputValue() {
		return (EReference) this.opaqueActionEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getOpaqueAction_Language() {
		return (EAttribute) this.opaqueActionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getOpaqueAction_OutputValue() {
		return (EReference) this.opaqueActionEClass.getEStructuralFeatures().get(3);
	}

	public EClass getCallAction() {
		return this.callActionEClass;
	}

	public EAttribute getCallAction_Synchronous() {
		return (EAttribute) this.callActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getCallAction_Result() {
		return (EReference) this.callActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getClearStructuralFeatureAction() {
		return this.clearStructuralFeatureActionEClass;
	}

	public EReference getClearStructuralFeatureAction_Result() {
		return (EReference) this.clearStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCreateLinkObjectAction() {
		return this.createLinkObjectActionEClass;
	}

	public EReference getCreateLinkObjectAction_Result() {
		return (EReference) this.createLinkObjectActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCreateLinkAction() {
		return this.createLinkActionEClass;
	}

	public EReference getCreateLinkAction_EndData() {
		return (EReference) this.createLinkActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getWriteLinkAction() {
		return this.writeLinkActionEClass;
	}

	public EClass getLinkAction() {
		return this.linkActionEClass;
	}

	public EReference getLinkAction_EndData() {
		return (EReference) this.linkActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getLinkAction_InputValue() {
		return (EReference) this.linkActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getLinkEndData() {
		return this.linkEndDataEClass;
	}

	public EReference getLinkEndData_End() {
		return (EReference) this.linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	public EReference getLinkEndData_Qualifier() {
		return (EReference) this.linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	public EReference getLinkEndData_Value() {
		return (EReference) this.linkEndDataEClass.getEStructuralFeatures().get(2);
	}

	public EReference getLinkEndData__linkActionOfEndData() {
		return (EReference) this.linkEndDataEClass.getEStructuralFeatures().get(3);
	}

	public EClass getQualifierValue() {
		return this.qualifierValueEClass;
	}

	public EReference getQualifierValue_Qualifier() {
		return (EReference) this.qualifierValueEClass.getEStructuralFeatures().get(0);
	}

	public EReference getQualifierValue_Value() {
		return (EReference) this.qualifierValueEClass.getEStructuralFeatures().get(1);
	}

	public EReference getQualifierValue__linkEndDataOfQualifier() {
		return (EReference) this.qualifierValueEClass.getEStructuralFeatures().get(2);
	}

	public EClass getLinkEndCreationData() {
		return this.linkEndCreationDataEClass;
	}

	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference) this.linkEndCreationDataEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getLinkEndCreationData_ReplaceAll() {
		return (EAttribute) this.linkEndCreationDataEClass.getEStructuralFeatures().get(1);
	}

	public EReference getLinkEndCreationData__createLinkActionOfEndData() {
		return (EReference) this.linkEndCreationDataEClass.getEStructuralFeatures().get(2);
	}

	public EClass getCreateObjectAction() {
		return this.createObjectActionEClass;
	}

	public EReference getCreateObjectAction_Classifier() {
		return (EReference) this.createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getCreateObjectAction_Result() {
		return (EReference) this.createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getReadExtentAction() {
		return this.readExtentActionEClass;
	}

	public EReference getReadExtentAction_Classifier() {
		return (EReference) this.readExtentActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getReadExtentAction_Result() {
		return (EReference) this.readExtentActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getReadIsClassifiedObjectAction() {
		return this.readIsClassifiedObjectActionEClass;
	}

	public EReference getReadIsClassifiedObjectAction_Classifier() {
		return (EReference) this.readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getReadIsClassifiedObjectAction_Direct() {
		return (EAttribute) this.readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReadIsClassifiedObjectAction_Object() {
		return (EReference) this.readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getReadIsClassifiedObjectAction_Result() {
		return (EReference) this.readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(3);
	}

	public EClass getReadLinkAction() {
		return this.readLinkActionEClass;
	}

	public EReference getReadLinkAction_Result() {
		return (EReference) this.readLinkActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getReadLinkObjectEndAction() {
		return this.readLinkObjectEndActionEClass;
	}

	public EReference getReadLinkObjectEndAction_End() {
		return (EReference) this.readLinkObjectEndActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getReadLinkObjectEndAction_Object() {
		return (EReference) this.readLinkObjectEndActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReadLinkObjectEndAction_Result() {
		return (EReference) this.readLinkObjectEndActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getReadLinkObjectEndQualifierAction() {
		return this.readLinkObjectEndQualifierActionEClass;
	}

	public EReference getReadLinkObjectEndQualifierAction_Object() {
		return (EReference) this.readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getReadLinkObjectEndQualifierAction_Qualifier() {
		return (EReference) this.readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReadLinkObjectEndQualifierAction_Result() {
		return (EReference) this.readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getReadSelfAction() {
		return this.readSelfActionEClass;
	}

	public EReference getReadSelfAction_Result() {
		return (EReference) this.readSelfActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getReadStructuralFeatureAction() {
		return this.readStructuralFeatureActionEClass;
	}

	public EReference getReadStructuralFeatureAction_Result() {
		return (EReference) this.readStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getReadVariableAction() {
		return this.readVariableActionEClass;
	}

	public EReference getReadVariableAction_Result() {
		return (EReference) this.readVariableActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getReduceAction() {
		return this.reduceActionEClass;
	}

	public EReference getReduceAction_Collection() {
		return (EReference) this.reduceActionEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getReduceAction_Ordered() {
		return (EAttribute) this.reduceActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReduceAction_Reducer() {
		return (EReference) this.reduceActionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getReduceAction_Result() {
		return (EReference) this.reduceActionEClass.getEStructuralFeatures().get(3);
	}

	public EClass getTestIdentityAction() {
		return this.testIdentityActionEClass;
	}

	public EReference getTestIdentityAction_First() {
		return (EReference) this.testIdentityActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTestIdentityAction_Second() {
		return (EReference) this.testIdentityActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTestIdentityAction_Result() {
		return (EReference) this.testIdentityActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getUnmarshallAction() {
		return this.unmarshallActionEClass;
	}

	public EReference getUnmarshallAction_Object() {
		return (EReference) this.unmarshallActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getUnmarshallAction_UnmarshallType() {
		return (EReference) this.unmarshallActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getUnmarshallAction_Result() {
		return (EReference) this.unmarshallActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getValueSpecificationAction() {
		return this.valueSpecificationActionEClass;
	}

	public EReference getValueSpecificationAction_Value() {
		return (EReference) this.valueSpecificationActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getValueSpecificationAction_Result() {
		return (EReference) this.valueSpecificationActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getWriteStructuralFeatureAction() {
		return this.writeStructuralFeatureActionEClass;
	}

	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference) this.writeStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getWriteStructuralFeatureAction_Result() {
		return (EReference) this.writeStructuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getAcceptCallAction() {
		return this.acceptCallActionEClass;
	}

	public EReference getAcceptCallAction_ReturnInformation() {
		return (EReference) this.acceptCallActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getInterfaceRealization() {
		return this.interfaceRealizationEClass;
	}

	public EReference getInterfaceRealization_ImplementingClassifier() {
		return (EReference) this.interfaceRealizationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInterfaceRealization_Contract() {
		return (EReference) this.interfaceRealizationEClass.getEStructuralFeatures().get(1);
	}

	public EClass getRealization() {
		return this.realizationEClass;
	}

	public EClass getAbstraction() {
		return this.abstractionEClass;
	}

	public EReference getAbstraction_Mapping() {
		return (EReference) this.abstractionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getOpaqueExpression() {
		return this.opaqueExpressionEClass;
	}

	public EReference getOpaqueExpression_Behavior() {
		return (EReference) this.opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute) this.opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute) this.opaqueExpressionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getOpaqueExpression_Result() {
		return (EReference) this.opaqueExpressionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getOpaqueExpression__abstractionOfMapping() {
		return (EReference) this.opaqueExpressionEClass.getEStructuralFeatures().get(4);
	}

	public EClass getComponent() {
		return this.componentEClass;
	}

	public EAttribute getComponent_IndirectlyInstantiated() {
		return (EAttribute) this.componentEClass.getEStructuralFeatures().get(0);
	}

	public EReference getComponent_PackagedElement() {
		return (EReference) this.componentEClass.getEStructuralFeatures().get(1);
	}

	public EReference getComponent_Realization() {
		return (EReference) this.componentEClass.getEStructuralFeatures().get(2);
	}

	public EReference getComponent_Required() {
		return (EReference) this.componentEClass.getEStructuralFeatures().get(3);
	}

	public EReference getComponent_Provided() {
		return (EReference) this.componentEClass.getEStructuralFeatures().get(4);
	}

	public EClass getComponentRealization() {
		return this.componentRealizationEClass;
	}

	public EReference getComponentRealization_RealizingClassifier() {
		return (EReference) this.componentRealizationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getComponentRealization_Abstraction() {
		return (EReference) this.componentRealizationEClass.getEStructuralFeatures().get(1);
	}

	public EClass getOperationTemplateParameter() {
		return this.operationTemplateParameterEClass;
	}

	public EReference getOperationTemplateParameter_ParameteredElement() {
		return (EReference) this.operationTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCallEvent() {
		return this.callEventEClass;
	}

	public EReference getCallEvent_Operation() {
		return (EReference) this.callEventEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCallOperationAction() {
		return this.callOperationActionEClass;
	}

	public EReference getCallOperationAction_Target() {
		return (EReference) this.callOperationActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getCallOperationAction_Operation() {
		return (EReference) this.callOperationActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getArtifact() {
		return this.artifactEClass;
	}

	public EAttribute getArtifact_FileName() {
		return (EAttribute) this.artifactEClass.getEStructuralFeatures().get(0);
	}

	public EReference getArtifact_Manifestation() {
		return (EReference) this.artifactEClass.getEStructuralFeatures().get(1);
	}

	public EReference getArtifact_NestedArtifact() {
		return (EReference) this.artifactEClass.getEStructuralFeatures().get(2);
	}

	public EReference getArtifact__artifactOfNestedArtifact() {
		return (EReference) this.artifactEClass.getEStructuralFeatures().get(3);
	}

	public EReference getArtifact_OwnedAttribute() {
		return (EReference) this.artifactEClass.getEStructuralFeatures().get(5);
	}

	public EReference getArtifact_OwnedOperation() {
		return (EReference) this.artifactEClass.getEStructuralFeatures().get(4);
	}

	public EClass getDeployedArtifact() {
		return this.deployedArtifactEClass;
	}

	public EReference getDeployedArtifact__deploymentOfDeployedArtifact() {
		return (EReference) this.deployedArtifactEClass.getEStructuralFeatures().get(0);
	}

	public EClass getDeployment() {
		return this.deploymentEClass;
	}

	public EReference getDeployment_Configuration() {
		return (EReference) this.deploymentEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDeployment_Location() {
		return (EReference) this.deploymentEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDeployment_DeployedArtifact() {
		return (EReference) this.deploymentEClass.getEStructuralFeatures().get(2);
	}

	public EClass getDeploymentSpecification() {
		return this.deploymentSpecificationEClass;
	}

	public EAttribute getDeploymentSpecification_DeploymentLocation() {
		return (EAttribute) this.deploymentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getDeploymentSpecification_ExecutionLocation() {
		return (EAttribute) this.deploymentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDeploymentSpecification_Deployment() {
		return (EReference) this.deploymentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	public EClass getDeploymentTarget() {
		return this.deploymentTargetEClass;
	}

	public EReference getDeploymentTarget_DeployedElement() {
		return (EReference) this.deploymentTargetEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDeploymentTarget_Deployment() {
		return (EReference) this.deploymentTargetEClass.getEStructuralFeatures().get(1);
	}

	public EClass getManifestation() {
		return this.manifestationEClass;
	}

	public EReference getManifestation_UtilizedElement() {
		return (EReference) this.manifestationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getManifestation__artifactOfManifestation() {
		return (EReference) this.manifestationEClass.getEStructuralFeatures().get(1);
	}

	public EClass getProtocolTransition() {
		return this.protocolTransitionEClass;
	}

	public EReference getProtocolTransition_PostCondition() {
		return (EReference) this.protocolTransitionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getProtocolTransition_PreCondition() {
		return (EReference) this.protocolTransitionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getProtocolTransition_Referred() {
		return (EReference) this.protocolTransitionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getExtend() {
		return this.extendEClass;
	}

	public EReference getExtend_ExtendedCase() {
		return (EReference) this.extendEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExtend_Extension() {
		return (EReference) this.extendEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExtend_ExtensionLocation() {
		return (EReference) this.extendEClass.getEStructuralFeatures().get(2);
	}

	public EReference getExtend_Condition() {
		return (EReference) this.extendEClass.getEStructuralFeatures().get(3);
	}

	public EClass getUseCase() {
		return this.useCaseEClass;
	}

	public EReference getUseCase_Extend() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(0);
	}

	public EReference getUseCase_ExtensionPoint() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(1);
	}

	public EReference getUseCase_Include() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(2);
	}

	public EReference getUseCase__includeOfAddition() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(3);
	}

	public EReference getUseCase_Subject() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(4);
	}

	public EReference getUseCase__classifierOfOwnedUseCase() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(5);
	}

	public EReference getUseCase__extendOfExtendedCase() {
		return (EReference) this.useCaseEClass.getEStructuralFeatures().get(6);
	}

	public EClass getExtensionPoint() {
		return this.extensionPointEClass;
	}

	public EReference getExtensionPoint_Extension() {
		return (EReference) this.extensionPointEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExtensionPoint_UseCase() {
		return (EReference) this.extensionPointEClass.getEStructuralFeatures().get(1);
	}

	public EClass getInclude() {
		return this.includeEClass;
	}

	public EReference getInclude_Addition() {
		return (EReference) this.includeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInclude_IncludingCase() {
		return (EReference) this.includeEClass.getEStructuralFeatures().get(1);
	}

	public EClass getExceptionHandler() {
		return this.exceptionHandlerEClass;
	}

	public EReference getExceptionHandler_ExceptionType() {
		return (EReference) this.exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExceptionHandler_HandlerBody() {
		return (EReference) this.exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference) this.exceptionHandlerEClass.getEStructuralFeatures().get(2);
	}

	public EReference getExceptionHandler_ExceptionInput() {
		return (EReference) this.exceptionHandlerEClass.getEStructuralFeatures().get(3);
	}

	public EClass getLinkEndDestructionData() {
		return this.linkEndDestructionDataEClass;
	}

	public EAttribute getLinkEndDestructionData_DestroyDuplicates() {
		return (EAttribute) this.linkEndDestructionDataEClass.getEStructuralFeatures().get(0);
	}

	public EReference getLinkEndDestructionData__destroyLinkActionOfEndData() {
		return (EReference) this.linkEndDestructionDataEClass.getEStructuralFeatures().get(1);
	}

	public EReference getLinkEndDestructionData_DestroyAt() {
		return (EReference) this.linkEndDestructionDataEClass.getEStructuralFeatures().get(2);
	}

	public EClass getDestroyLinkAction() {
		return this.destroyLinkActionEClass;
	}

	public EReference getDestroyLinkAction_EndData() {
		return (EReference) this.destroyLinkActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getRaiseExceptionAction() {
		return this.raiseExceptionActionEClass;
	}

	public EReference getRaiseExceptionAction_Exception() {
		return (EReference) this.raiseExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getAddStructuralFeatureValueAction() {
		return this.addStructuralFeatureValueActionEClass;
	}

	public EAttribute getAddStructuralFeatureValueAction_ReplaceAll() {
		return (EAttribute) this.addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference) this.addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getAddVariableValueAction() {
		return this.addVariableValueActionEClass;
	}

	public EAttribute getAddVariableValueAction_ReplaceAll() {
		return (EAttribute) this.addVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getAddVariableValueAction_InsertAt() {
		return (EReference) this.addVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getWriteVariableAction() {
		return this.writeVariableActionEClass;
	}

	public EReference getWriteVariableAction_Value() {
		return (EReference) this.writeVariableActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getClearAssociationAction() {
		return this.clearAssociationActionEClass;
	}

	public EReference getClearAssociationAction_Association() {
		return (EReference) this.clearAssociationActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getClearAssociationAction_Object() {
		return (EReference) this.clearAssociationActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getReclassifyObjectAction() {
		return this.reclassifyObjectActionEClass;
	}

	public EAttribute getReclassifyObjectAction_ReplaceAll() {
		return (EAttribute) this.reclassifyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference) this.reclassifyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference) this.reclassifyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getReclassifyObjectAction_Object() {
		return (EReference) this.reclassifyObjectActionEClass.getEStructuralFeatures().get(3);
	}

	public EClass getStartClassifierBehaviorAction() {
		return this.startClassifierBehaviorActionEClass;
	}

	public EReference getStartClassifierBehaviorAction_Object() {
		return (EReference) this.startClassifierBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStartObjectBehaviorAction() {
		return this.startObjectBehaviorActionEClass;
	}

	public EReference getStartObjectBehaviorAction_Object() {
		return (EReference) this.startObjectBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getRemoveStructuralFeatureValueAction() {
		return this.removeStructuralFeatureValueActionEClass;
	}

	public EAttribute getRemoveStructuralFeatureValueAction_RemoveDuplicates() {
		return (EAttribute) this.removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
		return (EReference) this.removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getRemoveVariableValueAction() {
		return this.removeVariableValueActionEClass;
	}

	public EAttribute getRemoveVariableValueAction_RemoveDuplicates() {
		return (EAttribute) this.removeVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getRemoveVariableValueAction_RemoveAt() {
		return (EReference) this.removeVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getSendObjectAction() {
		return this.sendObjectActionEClass;
	}

	public EReference getSendObjectAction_Target() {
		return (EReference) this.sendObjectActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getSendObjectAction_Request() {
		return (EReference) this.sendObjectActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getDestroyObjectAction() {
		return this.destroyObjectActionEClass;
	}

	public EAttribute getDestroyObjectAction_DestroyLinks() {
		return (EAttribute) this.destroyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getDestroyObjectAction_DestroyOwnedObjects() {
		return (EAttribute) this.destroyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDestroyObjectAction_Target() {
		return (EReference) this.destroyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getChangeEvent() {
		return this.changeEventEClass;
	}

	public EReference getChangeEvent_ChangeExpression() {
		return (EReference) this.changeEventEClass.getEStructuralFeatures().get(0);
	}

	public EClass getDuration() {
		return this.durationEClass;
	}

	public EReference getDuration_Observation() {
		return (EReference) this.durationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDuration__durationIntervalOfMax() {
		return (EReference) this.durationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getDuration__durationIntervalOfMin() {
		return (EReference) this.durationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDuration_Expr() {
		return (EReference) this.durationEClass.getEStructuralFeatures().get(3);
	}

	public EClass getObservation() {
		return this.observationEClass;
	}

	public EReference getObservation__timeExpressionOfObservation() {
		return (EReference) this.observationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getObservation_Behavior() {
		return (EReference) this.observationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getObservation__durationOfObservation() {
		return (EReference) this.observationEClass.getEStructuralFeatures().get(2);
	}

	public EClass getTimeExpression() {
		return this.timeExpressionEClass;
	}

	public EReference getTimeExpression_Expr() {
		return (EReference) this.timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTimeExpression__timeIntervalOfMax() {
		return (EReference) this.timeExpressionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getTimeExpression__timeIntervalOfMin() {
		return (EReference) this.timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTimeExpression__timeEventOfWhen() {
		return (EReference) this.timeExpressionEClass.getEStructuralFeatures().get(3);
	}

	public EReference getTimeExpression_Observation() {
		return (EReference) this.timeExpressionEClass.getEStructuralFeatures().get(4);
	}

	public EClass getTimeInterval() {
		return this.timeIntervalEClass;
	}

	public EReference getTimeInterval__timeConstraintOfSpecification() {
		return (EReference) this.timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTimeInterval_Min() {
		return (EReference) this.timeIntervalEClass.getEStructuralFeatures().get(2);
	}

	public EReference getTimeInterval_Max() {
		return (EReference) this.timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	public EClass getInterval() {
		return this.intervalEClass;
	}

	public EReference getInterval_Max() {
		return (EReference) this.intervalEClass.getEStructuralFeatures().get(2);
	}

	public EReference getInterval_Min() {
		return (EReference) this.intervalEClass.getEStructuralFeatures().get(0);
	}

	public EReference getInterval__intervalConstraintOfSpecification() {
		return (EReference) this.intervalEClass.getEStructuralFeatures().get(1);
	}

	public EClass getIntervalConstraint() {
		return this.intervalConstraintEClass;
	}

	public EReference getIntervalConstraint_Specification() {
		return (EReference) this.intervalConstraintEClass.getEStructuralFeatures().get(0);
	}

	public EClass getTimeConstraint() {
		return this.timeConstraintEClass;
	}

	public EAttribute getTimeConstraint_FirstEvent() {
		return (EAttribute) this.timeConstraintEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTimeConstraint_Specification() {
		return (EReference) this.timeConstraintEClass.getEStructuralFeatures().get(1);
	}

	public EClass getTimeEvent() {
		return this.timeEventEClass;
	}

	public EAttribute getTimeEvent_Relative() {
		return (EAttribute) this.timeEventEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTimeEvent_When() {
		return (EReference) this.timeEventEClass.getEStructuralFeatures().get(1);
	}

	public EClass getDurationInterval() {
		return this.durationIntervalEClass;
	}

	public EReference getDurationInterval__durationConstraintOfSpecification() {
		return (EReference) this.durationIntervalEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDurationInterval_Min() {
		return (EReference) this.durationIntervalEClass.getEStructuralFeatures().get(2);
	}

	public EReference getDurationInterval_Max() {
		return (EReference) this.durationIntervalEClass.getEStructuralFeatures().get(1);
	}

	public EClass getDurationConstraint() {
		return this.durationConstraintEClass;
	}

	public EAttribute getDurationConstraint_FirstEvent() {
		return (EAttribute) this.durationConstraintEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDurationConstraint_Specification() {
		return (EReference) this.durationConstraintEClass.getEStructuralFeatures().get(1);
	}

	public EClass getJoinNode() {
		return this.joinNodeEClass;
	}

	public EAttribute getJoinNode_CombineDuplicate() {
		return (EAttribute) this.joinNodeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getJoinNode_JoinSpec() {
		return (EReference) this.joinNodeEClass.getEStructuralFeatures().get(1);
	}

	public EClass getControlNode() {
		return this.controlNodeEClass;
	}

	public EClass getExpression() {
		return this.expressionEClass;
	}

	public EAttribute getExpression_Symbol() {
		return (EAttribute) this.expressionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExpression_Operand() {
		return (EReference) this.expressionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getValuePin() {
		return this.valuePinEClass;
	}

	public EReference getValuePin_Value() {
		return (EReference) this.valuePinEClass.getEStructuralFeatures().get(0);
	}

	public EClass getActivityParameterNode() {
		return this.activityParameterNodeEClass;
	}

	public EReference getActivityParameterNode_Parameter() {
		return (EReference) this.activityParameterNodeEClass.getEStructuralFeatures().get(0);
	}

	public EClass getBehaviorExecutionSpecification() {
		return this.behaviorExecutionSpecificationEClass;
	}

	public EReference getBehaviorExecutionSpecification_Behavior() {
		return (EReference) this.behaviorExecutionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EClass getCallBehaviorAction() {
		return this.callBehaviorActionEClass;
	}

	public EReference getCallBehaviorAction_Behavior() {
		return (EReference) this.callBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	public EClass getDecisionNode() {
		return this.decisionNodeEClass;
	}

	public EReference getDecisionNode_DecisionInputFlow() {
		return (EReference) this.decisionNodeEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDecisionNode_DecisionInput() {
		return (EReference) this.decisionNodeEClass.getEStructuralFeatures().get(0);
	}

	public EClass getObjectFlow() {
		return this.objectFlowEClass;
	}

	public EAttribute getObjectFlow_Multicast() {
		return (EAttribute) this.objectFlowEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getObjectFlow_Multireceive() {
		return (EAttribute) this.objectFlowEClass.getEStructuralFeatures().get(1);
	}

	public EReference getObjectFlow_Selection() {
		return (EReference) this.objectFlowEClass.getEStructuralFeatures().get(2);
	}

	public EReference getObjectFlow_Transformation() {
		return (EReference) this.objectFlowEClass.getEStructuralFeatures().get(4);
	}

	public EReference getObjectFlow__decisionNodeOfDecisionInputFlow() {
		return (EReference) this.objectFlowEClass.getEStructuralFeatures().get(3);
	}

	public EClass getExtension() {
		return this.extensionEClass;
	}

	public EAttribute getExtension_Required() {
		return (EAttribute) this.extensionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExtension_Metaclass() {
		return (EReference) this.extensionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExtension_OwnedEnd() {
		return (EReference) this.extensionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getExtensionEnd() {
		return this.extensionEndEClass;
	}

	public EReference getExtensionEnd__extensionOfOwnedEnd() {
		return (EReference) this.extensionEndEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getExtensionEnd_Lower() {
		return (EAttribute) this.extensionEndEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExtensionEnd_Type() {
		return (EReference) this.extensionEndEClass.getEStructuralFeatures().get(2);
	}

	public EClass getImage() {
		return this.imageEClass;
	}

	public EAttribute getImage_Content() {
		return (EAttribute) this.imageEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getImage_Format() {
		return (EAttribute) this.imageEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getImage_Location() {
		return (EAttribute) this.imageEClass.getEStructuralFeatures().get(2);
	}

	public EReference getImage__stereotypeOfIcon() {
		return (EReference) this.imageEClass.getEStructuralFeatures().get(3);
	}

	public EClass getPackageMerge() {
		return this.packageMergeEClass;
	}

	public EReference getPackageMerge_MergedPackage() {
		return (EReference) this.packageMergeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getPackageMerge_ReceivingPackage() {
		return (EReference) this.packageMergeEClass.getEStructuralFeatures().get(1);
	}

	public EClass getProfileApplication() {
		return this.profileApplicationEClass;
	}

	public EReference getProfileApplication_AppliedProfile() {
		return (EReference) this.profileApplicationEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getProfileApplication_Strict() {
		return (EAttribute) this.profileApplicationEClass.getEStructuralFeatures().get(1);
	}

	public EReference getProfileApplication_ApplyingPackage() {
		return (EReference) this.profileApplicationEClass.getEStructuralFeatures().get(2);
	}

	public EClass getPackageImport() {
		return this.packageImportEClass;
	}

	public EReference getPackageImport_ImportingNamespace() {
		return (EReference) this.packageImportEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getPackageImport_Visibility() {
		return (EAttribute) this.packageImportEClass.getEStructuralFeatures().get(1);
	}

	public EReference getPackageImport__profileOfMetamodelReference() {
		return (EReference) this.packageImportEClass.getEStructuralFeatures().get(2);
	}

	public EReference getPackageImport_ImportedPackage() {
		return (EReference) this.packageImportEClass.getEStructuralFeatures().get(3);
	}

	public EClass getDiagram() {
		return this.diagramEClass;
	}

	public EReference getDiagram_Context() {
		return (EReference) this.diagramEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDiagram_OwnerOfDiagram() {
		return (EReference) this.diagramEClass.getEStructuralFeatures().get(1);
	}

	public EReference getDiagram__representation() {
		return (EReference) this.diagramEClass.getEStructuralFeatures().get(2);
	}

	public EClass getGeneralization() {
		return this.generalizationEClass;
	}

	public EReference getGeneralization_General() {
		return (EReference) this.generalizationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getGeneralization_GeneralizationSet() {
		return (EReference) this.generalizationEClass.getEStructuralFeatures().get(1);
	}

	public EAttribute getGeneralization_Substitutable() {
		return (EAttribute) this.generalizationEClass.getEStructuralFeatures().get(2);
	}

	public EReference getGeneralization_Specific() {
		return (EReference) this.generalizationEClass.getEStructuralFeatures().get(3);
	}

	public EClass getGeneralizationSet() {
		return this.generalizationSetEClass;
	}

	public EAttribute getGeneralizationSet_Covering() {
		return (EAttribute) this.generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getGeneralizationSet_Disjoint() {
		return (EAttribute) this.generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	public EReference getGeneralizationSet_Powertype() {
		return (EReference) this.generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	public EReference getGeneralizationSet_Generalization() {
		return (EReference) this.generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	public EClass getRedefinableTemplateSignature() {
		return this.redefinableTemplateSignatureEClass;
	}

	public EReference getRedefinableTemplateSignature_ExtendedSignature() {
		return (EReference) this.redefinableTemplateSignatureEClass.getEStructuralFeatures().get(0);
	}

	public EReference getRedefinableTemplateSignature__redefinableTemplateSignatureOfExtendedSignature() {
		return (EReference) this.redefinableTemplateSignatureEClass.getEStructuralFeatures().get(1);
	}

	public EReference getRedefinableTemplateSignature_InheritedParameter() {
		return (EReference) this.redefinableTemplateSignatureEClass.getEStructuralFeatures().get(2);
	}

	public EReference getRedefinableTemplateSignature_Classifier() {
		return (EReference) this.redefinableTemplateSignatureEClass.getEStructuralFeatures().get(3);
	}

	public EClass getSubstitution() {
		return this.substitutionEClass;
	}

	public EReference getSubstitution_Contract() {
		return (EReference) this.substitutionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getSubstitution_SubstitutingClassifier() {
		return (EReference) this.substitutionEClass.getEStructuralFeatures().get(1);
	}

	public EClass getClassifierTemplateParameter() {
		return this.classifierTemplateParameterEClass;
	}

	public EAttribute getClassifierTemplateParameter_AllowSubstitutable() {
		return (EAttribute) this.classifierTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	public EReference getClassifierTemplateParameter_ConstrainingClassifier() {
		return (EReference) this.classifierTemplateParameterEClass.getEStructuralFeatures().get(1);
	}

	public EReference getClassifierTemplateParameter_ParameteredElement() {
		return (EReference) this.classifierTemplateParameterEClass.getEStructuralFeatures().get(2);
	}

	public EClass getInformationItem() {
		return this.informationItemEClass;
	}

	public EReference getInformationItem_Represented() {
		return (EReference) this.informationItemEClass.getEStructuralFeatures().get(0);
	}

	public EClass getTemplateParameterSubstitution() {
		return this.templateParameterSubstitutionEClass;
	}

	public EReference getTemplateParameterSubstitution_Actual() {
		return (EReference) this.templateParameterSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTemplateParameterSubstitution_Formal() {
		return (EReference) this.templateParameterSubstitutionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getTemplateParameterSubstitution_OwnedActual() {
		return (EReference) this.templateParameterSubstitutionEClass.getEStructuralFeatures().get(2);
	}

	public EReference getTemplateParameterSubstitution_TemplateBinding() {
		return (EReference) this.templateParameterSubstitutionEClass.getEStructuralFeatures().get(3);
	}

	public EClass getInstanceValue() {
		return this.instanceValueEClass;
	}

	public EReference getInstanceValue_Instance() {
		return (EReference) this.instanceValueEClass.getEStructuralFeatures().get(0);
	}

	public EClass getElementValue() {
		return this.elementValueEClass;
	}

	public EReference getElementValue_Element() {
		return (EReference) this.elementValueEClass.getEStructuralFeatures().get(0);
	}

	public EClass getStringExpression() {
		return this.stringExpressionEClass;
	}

	public EReference getStringExpression_OwningExpression() {
		return (EReference) this.stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getStringExpression_SubExpression() {
		return (EReference) this.stringExpressionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getStringExpression__namedElementOfNameExpression() {
		return (EReference) this.stringExpressionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getDurationObservation() {
		return this.durationObservationEClass;
	}

	public EAttribute getDurationObservation_FirstEvent() {
		return (EAttribute) this.durationObservationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getDurationObservation_Event() {
		return (EReference) this.durationObservationEClass.getEStructuralFeatures().get(1);
	}

	public EClass getTimeObservation() {
		return this.timeObservationEClass;
	}

	public EAttribute getTimeObservation_FirstEvent() {
		return (EAttribute) this.timeObservationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getTimeObservation_Event() {
		return (EReference) this.timeObservationEClass.getEStructuralFeatures().get(1);
	}

	public EClass getConsiderIgnoreFragment() {
		return this.considerIgnoreFragmentEClass;
	}

	public EReference getConsiderIgnoreFragment_Message() {
		return (EReference) this.considerIgnoreFragmentEClass.getEStructuralFeatures().get(0);
	}

	public EClass getSequenceNode() {
		return this.sequenceNodeEClass;
	}

	public EReference getSequenceNode_ExecutableNode() {
		return (EReference) this.sequenceNodeEClass.getEStructuralFeatures().get(0);
	}

	public EClass getActionExecutionSpecification() {
		return this.actionExecutionSpecificationEClass;
	}

	public EReference getActionExecutionSpecification_Action() {
		return (EReference) this.actionExecutionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	public EClass getActionInputPin() {
		return this.actionInputPinEClass;
	}

	public EReference getActionInputPin_FromAction() {
		return (EReference) this.actionInputPinEClass.getEStructuralFeatures().get(0);
	}

	public EClass getLiteralString() {
		return this.literalStringEClass;
	}

	public EAttribute getLiteralString_Value() {
		return (EAttribute) this.literalStringEClass.getEStructuralFeatures().get(0);
	}

	public EClass getLiteralSpecification() {
		return this.literalSpecificationEClass;
	}

	public EClass getDataStoreNode() {
		return this.dataStoreNodeEClass;
	}

	public EClass getCentralBufferNode() {
		return this.centralBufferNodeEClass;
	}

	public EClass getInitialNode() {
		return this.initialNodeEClass;
	}

	public EClass getDevice() {
		return this.deviceEClass;
	}

	public EClass getNode() {
		return this.nodeEClass;
	}

	public EReference getNode_NestedNode() {
		return (EReference) this.nodeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getNode__nodeOfNestedNode() {
		return (EReference) this.nodeEClass.getEStructuralFeatures().get(1);
	}

	public EClass getAssociationClass() {
		return this.associationClassEClass;
	}

	public EClass getActor() {
		return this.actorEClass;
	}

	public EClass getExecutionEnvironment() {
		return this.executionEnvironmentEClass;
	}

	public EClass getFunctionBehavior() {
		return this.functionBehaviorEClass;
	}

	public EClass getOpaqueBehavior() {
		return this.opaqueBehaviorEClass;
	}

	public EAttribute getOpaqueBehavior_Body() {
		return (EAttribute) this.opaqueBehaviorEClass.getEStructuralFeatures().get(0);
	}

	public EAttribute getOpaqueBehavior_Language() {
		return (EAttribute) this.opaqueBehaviorEClass.getEStructuralFeatures().get(1);
	}

	public EClass getFinalNode() {
		return this.finalNodeEClass;
	}

	public EClass getActivityFinalNode() {
		return this.activityFinalNodeEClass;
	}

	public EClass getFlowFinalNode() {
		return this.flowFinalNodeEClass;
	}

	public EClass getLiteralReal() {
		return this.literalRealEClass;
	}

	public EAttribute getLiteralReal_Value() {
		return (EAttribute) this.literalRealEClass.getEStructuralFeatures().get(0);
	}

	public EClass getForkNode() {
		return this.forkNodeEClass;
	}

	public EClass getControlFlow() {
		return this.controlFlowEClass;
	}

	public EClass getUsage() {
		return this.usageEClass;
	}

	public EClass getLiteralUnlimitedNatural() {
		return this.literalUnlimitedNaturalEClass;
	}

	public EAttribute getLiteralUnlimitedNatural_Value() {
		return (EAttribute) this.literalUnlimitedNaturalEClass.getEStructuralFeatures().get(0);
	}

	public EClass getLiteralInteger() {
		return this.literalIntegerEClass;
	}

	public EAttribute getLiteralInteger_Value() {
		return (EAttribute) this.literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	public EClass getEnumeration() {
		return this.enumerationEClass;
	}

	public EReference getEnumeration_OwnedLiteral() {
		return (EReference) this.enumerationEClass.getEStructuralFeatures().get(0);
	}

	public EReference getEnumeration__enumerationLiteralOfClassifier() {
		return (EReference) this.enumerationEClass.getEStructuralFeatures().get(1);
	}

	public EClass getEnumerationLiteral() {
		return this.enumerationLiteralEClass;
	}

	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference) this.enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	public EReference getEnumerationLiteral_Classifier() {
		return (EReference) this.enumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	public EClass getExpansionNode() {
		return this.expansionNodeEClass;
	}

	public EReference getExpansionNode_RegionAsInput() {
		return (EReference) this.expansionNodeEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExpansionNode_RegionAsOutput() {
		return (EReference) this.expansionNodeEClass.getEStructuralFeatures().get(1);
	}

	public EClass getExpansionRegion() {
		return this.expansionRegionEClass;
	}

	public EAttribute getExpansionRegion_Mode() {
		return (EAttribute) this.expansionRegionEClass.getEStructuralFeatures().get(0);
	}

	public EReference getExpansionRegion_OutputElement() {
		return (EReference) this.expansionRegionEClass.getEStructuralFeatures().get(1);
	}

	public EReference getExpansionRegion_InputElement() {
		return (EReference) this.expansionRegionEClass.getEStructuralFeatures().get(2);
	}

	public EClass getCommunicationPath() {
		return this.communicationPathEClass;
	}

	public EClass getPrimitiveType() {
		return this.primitiveTypeEClass;
	}

	public EClass getFinalState() {
		return this.finalStateEClass;
	}

	public EClass getAnyReceiveEvent() {
		return this.anyReceiveEventEClass;
	}

	public EClass getMergeNode() {
		return this.mergeNodeEClass;
	}

	public EClass getContinuation() {
		return this.continuationEClass;
	}

	public EAttribute getContinuation_Setting() {
		return (EAttribute) this.continuationEClass.getEStructuralFeatures().get(0);
	}

	public EClass getLiteralNull() {
		return this.literalNullEClass;
	}

	public EClass getMessageOccurrenceSpecification() {
		return this.messageOccurrenceSpecificationEClass;
	}

	public EClass getLiteralBoolean() {
		return this.literalBooleanEClass;
	}

	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute) this.literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	public EClass getDestructionOccurrenceSpecification() {
		return this.destructionOccurrenceSpecificationEClass;
	}

	public EClass getModel() {
		return this.modelEClass;
	}

	public EAttribute getModel_Viewpoint() {
		return (EAttribute) this.modelEClass.getEStructuralFeatures().get(0);
	}

	public EClass getClearVariableAction() {
		return this.clearVariableActionEClass;
	}

	public EClass getModelObject() {
		return this.modelObjectEClass;
	}

	public EAttribute getModelObject__representationText() {
		return (EAttribute) this.modelObjectEClass.getEStructuralFeatures().get(0);
	}

	public EEnum getVisibilityKind() {
		return this.visibilityKindEEnum;
	}

	public EEnum getPseudostateKind() {
		return this.pseudostateKindEEnum;
	}

	public EEnum getCallConcurrencyKind() {
		return this.callConcurrencyKindEEnum;
	}

	public EEnum getMessageKind() {
		return this.messageKindEEnum;
	}

	public EEnum getMessageSort() {
		return this.messageSortEEnum;
	}

	public EEnum getInteractionOperatorKind() {
		return this.interactionOperatorKindEEnum;
	}

	public EEnum getConnectorKind() {
		return this.connectorKindEEnum;
	}

	public EEnum getTransitionKind() {
		return this.transitionKindEEnum;
	}

	public EEnum getObjectNodeOrderingKind() {
		return this.objectNodeOrderingKindEEnum;
	}

	public EEnum getAggregationKind() {
		return this.aggregationKindEEnum;
	}

	public EEnum getParameterDirectionKind() {
		return this.parameterDirectionKindEEnum;
	}

	public EEnum getParameterEffectKind() {
		return this.parameterEffectKindEEnum;
	}

	public EEnum getExpansionKind() {
		return this.expansionKindEEnum;
	}

	public EDataType getString() {
		return this.stringEDataType;
	}

	public EDataType getBoolean() {
		return this.booleanEDataType;
	}

	public EDataType getInteger() {
		return this.integerEDataType;
	}

	public EDataType getUnlimitedNatural() {
		return this.unlimitedNaturalEDataType;
	}

	public EDataType getReal() {
		return this.realEDataType;
	}

	public EDataType getNamedElementVisibilityKind() {
		return this.namedElementVisibilityKindEDataType;
	}

	public EDataType getParameterParameterEffectKind() {
		return this.parameterParameterEffectKindEDataType;
	}

	public UMLFactory getUMLFactory() {
		return (UMLFactory) this.getEFactoryInstance();
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	public void createPackageContents() {
		if (!this.isCreated) {
			this.isCreated = true;
			this.variableEClass = this.createEClass(0);
			this.createEReference(this.variableEClass, 50);
			this.createEReference(this.variableEClass, 51);
			this.createEReference(this.variableEClass, 52);
			this.connectableElementEClass = this.createEClass(1);
			this.createEReference(this.connectableElementEClass, 39);
			this.createEReference(this.connectableElementEClass, 40);
			this.createEReference(this.connectableElementEClass, 41);
			this.createEReference(this.connectableElementEClass, 42);
			this.createEReference(this.connectableElementEClass, 43);
			this.typedElementEClass = this.createEClass(2);
			this.createEReference(this.typedElementEClass, 32);
			this.namedElementEClass = this.createEClass(3);
			this.createEReference(this.namedElementEClass, 17);
			this.createEReference(this.namedElementEClass, 18);
			this.createEReference(this.namedElementEClass, 19);
			this.createEReference(this.namedElementEClass, 20);
			this.createEReference(this.namedElementEClass, 21);
			this.createEReference(this.namedElementEClass, 22);
			this.createEReference(this.namedElementEClass, 23);
			this.createEReference(this.namedElementEClass, 24);
			this.createEAttribute(this.namedElementEClass, 25);
			this.createEReference(this.namedElementEClass, 26);
			this.createEAttribute(this.namedElementEClass, 27);
			this.createEAttribute(this.namedElementEClass, 28);
			this.createEReference(this.namedElementEClass, 29);
			this.createEReference(this.namedElementEClass, 30);
			this.createEReference(this.namedElementEClass, 31);
			this.elementEClass = this.createEClass(4);
			this.createEReference(this.elementEClass, 3);
			this.createEReference(this.elementEClass, 4);
			this.createEReference(this.elementEClass, 5);
			this.createEReference(this.elementEClass, 6);
			this.createEReference(this.elementEClass, 7);
			this.createEReference(this.elementEClass, 8);
			this.createEReference(this.elementEClass, 9);
			this.createEReference(this.elementEClass, 10);
			this.createEReference(this.elementEClass, 11);
			this.createEReference(this.elementEClass, 12);
			this.createEReference(this.elementEClass, 13);
			this.createEReference(this.elementEClass, 14);
			this.createEReference(this.elementEClass, 15);
			this.createEReference(this.elementEClass, 16);
			this.commentEClass = this.createEClass(5);
			this.createEReference(this.commentEClass, 17);
			this.createEAttribute(this.commentEClass, 18);
			this.createEReference(this.commentEClass, 19);
			this.instanceSpecificationEClass = this.createEClass(6);
			this.createEReference(this.instanceSpecificationEClass, 48);
			this.createEReference(this.instanceSpecificationEClass, 49);
			this.createEReference(this.instanceSpecificationEClass, 50);
			this.createEReference(this.instanceSpecificationEClass, 51);
			this.createEReference(this.instanceSpecificationEClass, 52);
			this.deploymentTargetEClass = this.createEClass(7);
			this.createEReference(this.deploymentTargetEClass, 32);
			this.createEReference(this.deploymentTargetEClass, 33);
			this.packageableElementEClass = this.createEClass(8);
			this.createEReference(this.packageableElementEClass, 38);
			this.createEReference(this.packageableElementEClass, 39);
			this.createEReference(this.packageableElementEClass, 40);
			this.createEReference(this.packageableElementEClass, 41);
			this.createEReference(this.packageableElementEClass, 42);
			this.createEReference(this.packageableElementEClass, 43);
			this.createEAttribute(this.packageableElementEClass, 44);
			this.parameterableElementEClass = this.createEClass(9);
			this.createEReference(this.parameterableElementEClass, 17);
			this.createEReference(this.parameterableElementEClass, 18);
			this.createEReference(this.parameterableElementEClass, 19);
			this.createEReference(this.parameterableElementEClass, 20);
			this.createEReference(this.parameterableElementEClass, 21);
			this.createEReference(this.parameterableElementEClass, 22);
			this.templateParameterEClass = this.createEClass(10);
			this.createEReference(this.templateParameterEClass, 17);
			this.createEReference(this.templateParameterEClass, 18);
			this.createEReference(this.templateParameterEClass, 19);
			this.createEReference(this.templateParameterEClass, 20);
			this.createEReference(this.templateParameterEClass, 21);
			this.createEReference(this.templateParameterEClass, 22);
			this.createEReference(this.templateParameterEClass, 23);
			this.createEReference(this.templateParameterEClass, 24);
			this.templateSignatureEClass = this.createEClass(11);
			this.createEReference(this.templateSignatureEClass, 17);
			this.createEReference(this.templateSignatureEClass, 18);
			this.createEReference(this.templateSignatureEClass, 19);
			this.createEReference(this.templateSignatureEClass, 20);
			this.templateableElementEClass = this.createEClass(12);
			this.createEReference(this.templateableElementEClass, 17);
			this.createEReference(this.templateableElementEClass, 18);
			this.templateBindingEClass = this.createEClass(13);
			this.createEReference(this.templateBindingEClass, 21);
			this.createEReference(this.templateBindingEClass, 22);
			this.createEReference(this.templateBindingEClass, 23);
			this.directedRelationshipEClass = this.createEClass(14);
			this.createEReference(this.directedRelationshipEClass, 19);
			this.createEReference(this.directedRelationshipEClass, 20);
			this.relationshipEClass = this.createEClass(15);
			this.createEReference(this.relationshipEClass, 17);
			this.createEReference(this.relationshipEClass, 18);
			this.informationFlowEClass = this.createEClass(16);
			this.createEReference(this.informationFlowEClass, 49);
			this.createEReference(this.informationFlowEClass, 50);
			this.createEReference(this.informationFlowEClass, 51);
			this.createEReference(this.informationFlowEClass, 52);
			this.createEReference(this.informationFlowEClass, 53);
			this.createEReference(this.informationFlowEClass, 54);
			this.createEReference(this.informationFlowEClass, 55);
			this.classifierEClass = this.createEClass(17);
			this.createEReference(this.classifierEClass, 64);
			this.createEReference(this.classifierEClass, 65);
			this.createEReference(this.classifierEClass, 66);
			this.createEReference(this.classifierEClass, 67);
			this.createEReference(this.classifierEClass, 68);
			this.createEReference(this.classifierEClass, 69);
			this.createEReference(this.classifierEClass, 70);
			this.createEReference(this.classifierEClass, 71);
			this.createEReference(this.classifierEClass, 72);
			this.createEReference(this.classifierEClass, 73);
			this.createEReference(this.classifierEClass, 74);
			this.createEReference(this.classifierEClass, 75);
			this.createEReference(this.classifierEClass, 76);
			this.createEReference(this.classifierEClass, 77);
			this.createEReference(this.classifierEClass, 78);
			this.createEReference(this.classifierEClass, 79);
			this.createEReference(this.classifierEClass, 80);
			this.createEReference(this.classifierEClass, 81);
			this.createEReference(this.classifierEClass, 82);
			this.createEReference(this.classifierEClass, 83);
			this.createEReference(this.classifierEClass, 84);
			this.createEReference(this.classifierEClass, 85);
			this.createEReference(this.classifierEClass, 86);
			this.createEReference(this.classifierEClass, 87);
			this.createEReference(this.classifierEClass, 88);
			this.createEReference(this.classifierEClass, 89);
			this.createEReference(this.classifierEClass, 90);
			this.createEAttribute(this.classifierEClass, 91);
			this.createEAttribute(this.classifierEClass, 92);
			this.createEReference(this.classifierEClass, 93);
			this.createEReference(this.classifierEClass, 94);
			this.createEReference(this.classifierEClass, 95);
			this.createEReference(this.classifierEClass, 96);
			this.createEReference(this.classifierEClass, 97);
			this.createEReference(this.classifierEClass, 98);
			this.createEReference(this.classifierEClass, 99);
			this.createEReference(this.classifierEClass, 100);
			this.createEReference(this.classifierEClass, 101);
			this.createEReference(this.classifierEClass, 102);
			this.namespaceEClass = this.createEClass(18);
			this.createEReference(this.namespaceEClass, 32);
			this.createEReference(this.namespaceEClass, 33);
			this.createEReference(this.namespaceEClass, 34);
			this.createEReference(this.namespaceEClass, 35);
			this.createEReference(this.namespaceEClass, 36);
			this.createEReference(this.namespaceEClass, 37);
			this.createEReference(this.namespaceEClass, 38);
			this.elementImportEClass = this.createEClass(19);
			this.createEAttribute(this.elementImportEClass, 21);
			this.createEReference(this.elementImportEClass, 22);
			this.createEAttribute(this.elementImportEClass, 23);
			this.createEReference(this.elementImportEClass, 24);
			this.createEReference(this.elementImportEClass, 25);
			this.profileEClass = this.createEClass(20);
			this.createEReference(this.profileEClass, 64);
			this.createEReference(this.profileEClass, 65);
			this.createEReference(this.profileEClass, 66);
			this.createEReference(this.profileEClass, 67);
			this.packageEClass = this.createEClass(21);
			this.createEAttribute(this.packageEClass, 54);
			this.createEReference(this.packageEClass, 55);
			this.createEReference(this.packageEClass, 56);
			this.createEReference(this.packageEClass, 57);
			this.createEReference(this.packageEClass, 58);
			this.createEReference(this.packageEClass, 59);
			this.createEReference(this.packageEClass, 60);
			this.createEReference(this.packageEClass, 61);
			this.createEReference(this.packageEClass, 62);
			this.createEReference(this.packageEClass, 63);
			this.stereotypeEClass = this.createEClass(22);
			this.createEReference(this.stereotypeEClass, 121);
			this.createEReference(this.stereotypeEClass, 122);
			this.createEReference(this.stereotypeEClass, 123);
			this.createEReference(this.stereotypeEClass, 124);
			this.classEClass = this.createEClass(23);
			this.createEReference(this.classEClass, 112);
			this.createEReference(this.classEClass, 113);
			this.createEReference(this.classEClass, 114);
			this.createEAttribute(this.classEClass, 115);
			this.createEReference(this.classEClass, 116);
			this.createEReference(this.classEClass, 117);
			this.createEReference(this.classEClass, 118);
			this.createEReference(this.classEClass, 119);
			this.createEAttribute(this.classEClass, 120);
			this.behavioredClassifierEClass = this.createEClass(24);
			this.createEReference(this.behavioredClassifierEClass, 103);
			this.createEReference(this.behavioredClassifierEClass, 104);
			this.createEReference(this.behavioredClassifierEClass, 105);
			this.createEReference(this.behavioredClassifierEClass, 106);
			this.behaviorEClass = this.createEClass(25);
			this.createEReference(this.behaviorEClass, 121);
			this.createEAttribute(this.behaviorEClass, 122);
			this.createEReference(this.behaviorEClass, 123);
			this.createEReference(this.behaviorEClass, 124);
			this.createEReference(this.behaviorEClass, 125);
			this.createEReference(this.behaviorEClass, 126);
			this.createEReference(this.behaviorEClass, 127);
			this.createEReference(this.behaviorEClass, 128);
			this.createEReference(this.behaviorEClass, 129);
			this.createEReference(this.behaviorEClass, 130);
			this.createEReference(this.behaviorEClass, 131);
			this.createEReference(this.behaviorEClass, 132);
			this.createEReference(this.behaviorEClass, 133);
			this.createEReference(this.behaviorEClass, 134);
			this.createEReference(this.behaviorEClass, 135);
			this.createEReference(this.behaviorEClass, 136);
			this.createEReference(this.behaviorEClass, 137);
			this.createEReference(this.behaviorEClass, 138);
			this.createEReference(this.behaviorEClass, 139);
			this.createEReference(this.behaviorEClass, 140);
			this.createEReference(this.behaviorEClass, 141);
			this.createEReference(this.behaviorEClass, 142);
			this.createEReference(this.behaviorEClass, 143);
			this.createEReference(this.behaviorEClass, 144);
			this.createEReference(this.behaviorEClass, 145);
			this.createEReference(this.behaviorEClass, 146);
			this.parameterEClass = this.createEClass(26);
			this.createEReference(this.parameterEClass, 50);
			this.createEReference(this.parameterEClass, 51);
			this.createEReference(this.parameterEClass, 52);
			this.createEReference(this.parameterEClass, 53);
			this.createEReference(this.parameterEClass, 54);
			this.createEAttribute(this.parameterEClass, 55);
			this.createEAttribute(this.parameterEClass, 56);
			this.createEAttribute(this.parameterEClass, 57);
			this.createEAttribute(this.parameterEClass, 58);
			this.createEAttribute(this.parameterEClass, 59);
			this.createEReference(this.parameterEClass, 60);
			this.createEReference(this.parameterEClass, 61);
			this.multiplicityElementEClass = this.createEClass(27);
			this.createEAttribute(this.multiplicityElementEClass, 17);
			this.createEAttribute(this.multiplicityElementEClass, 18);
			this.createEAttribute(this.multiplicityElementEClass, 19);
			this.createEReference(this.multiplicityElementEClass, 20);
			this.createEReference(this.multiplicityElementEClass, 21);
			this.createEAttribute(this.multiplicityElementEClass, 22);
			this.valueSpecificationEClass = this.createEClass(28);
			this.createEReference(this.valueSpecificationEClass, 46);
			this.createEReference(this.valueSpecificationEClass, 47);
			this.createEReference(this.valueSpecificationEClass, 48);
			this.createEReference(this.valueSpecificationEClass, 49);
			this.createEReference(this.valueSpecificationEClass, 50);
			this.createEReference(this.valueSpecificationEClass, 51);
			this.createEReference(this.valueSpecificationEClass, 52);
			this.createEReference(this.valueSpecificationEClass, 53);
			this.createEReference(this.valueSpecificationEClass, 54);
			this.createEReference(this.valueSpecificationEClass, 55);
			this.createEReference(this.valueSpecificationEClass, 56);
			this.createEReference(this.valueSpecificationEClass, 57);
			this.createEReference(this.valueSpecificationEClass, 58);
			this.createEReference(this.valueSpecificationEClass, 59);
			this.createEReference(this.valueSpecificationEClass, 60);
			this.createEReference(this.valueSpecificationEClass, 61);
			this.createEReference(this.valueSpecificationEClass, 62);
			this.createEReference(this.valueSpecificationEClass, 63);
			this.createEReference(this.valueSpecificationEClass, 64);
			this.createEReference(this.valueSpecificationEClass, 65);
			this.createEReference(this.valueSpecificationEClass, 66);
			this.createEReference(this.valueSpecificationEClass, 67);
			this.createEReference(this.valueSpecificationEClass, 68);
			this.createEReference(this.valueSpecificationEClass, 69);
			this.createEReference(this.valueSpecificationEClass, 70);
			this.createEReference(this.valueSpecificationEClass, 71);
			this.lifelineEClass = this.createEClass(29);
			this.createEReference(this.lifelineEClass, 32);
			this.createEReference(this.lifelineEClass, 33);
			this.createEReference(this.lifelineEClass, 34);
			this.createEReference(this.lifelineEClass, 35);
			this.createEReference(this.lifelineEClass, 36);
			this.createEReference(this.lifelineEClass, 37);
			this.createEReference(this.lifelineEClass, 38);
			this.interactionFragmentEClass = this.createEClass(30);
			this.createEReference(this.interactionFragmentEClass, 32);
			this.createEReference(this.interactionFragmentEClass, 33);
			this.createEReference(this.interactionFragmentEClass, 34);
			this.createEReference(this.interactionFragmentEClass, 35);
			this.interactionEClass = this.createEClass(31);
			this.createEReference(this.interactionEClass, 151);
			this.createEReference(this.interactionEClass, 152);
			this.createEReference(this.interactionEClass, 153);
			this.createEReference(this.interactionEClass, 154);
			this.createEReference(this.interactionEClass, 155);
			this.createEReference(this.interactionEClass, 156);
			this.actionEClass = this.createEClass(32);
			this.createEReference(this.actionEClass, 53);
			this.createEReference(this.actionEClass, 54);
			this.createEReference(this.actionEClass, 55);
			this.createEReference(this.actionEClass, 56);
			this.createEReference(this.actionEClass, 57);
			this.createEAttribute(this.actionEClass, 58);
			this.createEReference(this.actionEClass, 59);
			this.createEReference(this.actionEClass, 60);
			this.createEReference(this.actionEClass, 61);
			this.executableNodeEClass = this.createEClass(33);
			this.createEReference(this.executableNodeEClass, 45);
			this.createEReference(this.executableNodeEClass, 46);
			this.createEReference(this.executableNodeEClass, 47);
			this.createEReference(this.executableNodeEClass, 48);
			this.createEReference(this.executableNodeEClass, 49);
			this.createEReference(this.executableNodeEClass, 50);
			this.createEReference(this.executableNodeEClass, 51);
			this.createEReference(this.executableNodeEClass, 52);
			this.activityNodeEClass = this.createEClass(34);
			this.createEReference(this.activityNodeEClass, 36);
			this.createEReference(this.activityNodeEClass, 37);
			this.createEReference(this.activityNodeEClass, 38);
			this.createEReference(this.activityNodeEClass, 39);
			this.createEReference(this.activityNodeEClass, 40);
			this.createEReference(this.activityNodeEClass, 41);
			this.createEReference(this.activityNodeEClass, 42);
			this.createEReference(this.activityNodeEClass, 43);
			this.createEReference(this.activityNodeEClass, 44);
			this.redefinableElementEClass = this.createEClass(35);
			this.createEAttribute(this.redefinableElementEClass, 32);
			this.createEReference(this.redefinableElementEClass, 33);
			this.createEReference(this.redefinableElementEClass, 34);
			this.createEReference(this.redefinableElementEClass, 35);
			this.activityEClass = this.createEClass(36);
			this.createEReference(this.activityEClass, 147);
			this.createEReference(this.activityEClass, 148);
			this.createEReference(this.activityEClass, 149);
			this.createEReference(this.activityEClass, 150);
			this.createEAttribute(this.activityEClass, 151);
			this.createEAttribute(this.activityEClass, 152);
			this.createEReference(this.activityEClass, 153);
			this.createEReference(this.activityEClass, 154);
			this.activityEdgeEClass = this.createEClass(37);
			this.createEReference(this.activityEdgeEClass, 36);
			this.createEReference(this.activityEdgeEClass, 37);
			this.createEReference(this.activityEdgeEClass, 38);
			this.createEReference(this.activityEdgeEClass, 39);
			this.createEReference(this.activityEdgeEClass, 40);
			this.createEReference(this.activityEdgeEClass, 41);
			this.createEReference(this.activityEdgeEClass, 42);
			this.createEReference(this.activityEdgeEClass, 43);
			this.createEReference(this.activityEdgeEClass, 44);
			this.createEReference(this.activityEdgeEClass, 45);
			this.createEReference(this.activityEdgeEClass, 46);
			this.createEReference(this.activityEdgeEClass, 47);
			this.activityGroupEClass = this.createEClass(38);
			this.createEReference(this.activityGroupEClass, 32);
			this.createEReference(this.activityGroupEClass, 33);
			this.createEReference(this.activityGroupEClass, 34);
			this.createEReference(this.activityGroupEClass, 35);
			this.createEReference(this.activityGroupEClass, 36);
			this.activityPartitionEClass = this.createEClass(39);
			this.createEAttribute(this.activityPartitionEClass, 37);
			this.createEAttribute(this.activityPartitionEClass, 38);
			this.createEReference(this.activityPartitionEClass, 39);
			this.createEReference(this.activityPartitionEClass, 40);
			this.createEReference(this.activityPartitionEClass, 41);
			this.createEReference(this.activityPartitionEClass, 42);
			this.createEReference(this.activityPartitionEClass, 43);
			this.createEReference(this.activityPartitionEClass, 44);
			this.structuredActivityNodeEClass = this.createEClass(40);
			this.createEAttribute(this.structuredActivityNodeEClass, 74);
			this.createEReference(this.structuredActivityNodeEClass, 75);
			this.createEReference(this.structuredActivityNodeEClass, 76);
			this.createEReference(this.structuredActivityNodeEClass, 77);
			this.createEReference(this.structuredActivityNodeEClass, 78);
			this.createEReference(this.structuredActivityNodeEClass, 79);
			this.createEReference(this.structuredActivityNodeEClass, 80);
			this.inputPinEClass = this.createEClass(41);
			this.createEReference(this.inputPinEClass, 59);
			this.createEReference(this.inputPinEClass, 60);
			this.createEReference(this.inputPinEClass, 61);
			this.createEReference(this.inputPinEClass, 62);
			this.createEReference(this.inputPinEClass, 63);
			this.createEReference(this.inputPinEClass, 64);
			this.createEReference(this.inputPinEClass, 65);
			this.createEReference(this.inputPinEClass, 66);
			this.createEReference(this.inputPinEClass, 67);
			this.createEReference(this.inputPinEClass, 68);
			this.createEReference(this.inputPinEClass, 69);
			this.createEReference(this.inputPinEClass, 70);
			this.createEReference(this.inputPinEClass, 71);
			this.createEReference(this.inputPinEClass, 72);
			this.createEReference(this.inputPinEClass, 73);
			this.createEReference(this.inputPinEClass, 74);
			this.createEReference(this.inputPinEClass, 75);
			this.createEReference(this.inputPinEClass, 76);
			this.createEReference(this.inputPinEClass, 77);
			this.createEReference(this.inputPinEClass, 78);
			this.createEReference(this.inputPinEClass, 79);
			this.createEReference(this.inputPinEClass, 80);
			this.createEReference(this.inputPinEClass, 81);
			this.createEReference(this.inputPinEClass, 82);
			this.createEReference(this.inputPinEClass, 83);
			this.createEReference(this.inputPinEClass, 84);
			this.createEReference(this.inputPinEClass, 85);
			this.createEReference(this.inputPinEClass, 86);
			this.createEReference(this.inputPinEClass, 87);
			this.createEReference(this.inputPinEClass, 88);
			this.createEReference(this.inputPinEClass, 89);
			this.createEReference(this.inputPinEClass, 90);
			this.createEReference(this.inputPinEClass, 91);
			this.createEReference(this.inputPinEClass, 92);
			this.createEReference(this.inputPinEClass, 93);
			this.createEReference(this.inputPinEClass, 94);
			this.pinEClass = this.createEClass(42);
			this.createEAttribute(this.pinEClass, 58);
			this.objectNodeEClass = this.createEClass(43);
			this.createEReference(this.objectNodeEClass, 46);
			this.createEAttribute(this.objectNodeEClass, 47);
			this.createEAttribute(this.objectNodeEClass, 48);
			this.createEReference(this.objectNodeEClass, 49);
			this.createEReference(this.objectNodeEClass, 50);
			this.createEReference(this.objectNodeEClass, 51);
			this.stateEClass = this.createEClass(44);
			this.createEReference(this.stateEClass, 49);
			this.createEReference(this.stateEClass, 50);
			this.createEReference(this.stateEClass, 51);
			this.createEReference(this.stateEClass, 52);
			this.createEReference(this.stateEClass, 53);
			this.createEReference(this.stateEClass, 54);
			this.createEReference(this.stateEClass, 55);
			this.createEReference(this.stateEClass, 56);
			this.createEReference(this.stateEClass, 57);
			this.createEAttribute(this.stateEClass, 58);
			this.createEAttribute(this.stateEClass, 59);
			this.createEAttribute(this.stateEClass, 60);
			this.createEAttribute(this.stateEClass, 61);
			this.createEReference(this.stateEClass, 62);
			this.vertexEClass = this.createEClass(45);
			this.createEReference(this.vertexEClass, 36);
			this.createEReference(this.vertexEClass, 37);
			this.createEReference(this.vertexEClass, 38);
			this.createEReference(this.vertexEClass, 39);
			this.createEReference(this.vertexEClass, 40);
			this.createEReference(this.vertexEClass, 41);
			this.regionEClass = this.createEClass(46);
			this.createEReference(this.regionEClass, 43);
			this.createEReference(this.regionEClass, 44);
			this.createEReference(this.regionEClass, 45);
			this.createEReference(this.regionEClass, 46);
			this.createEReference(this.regionEClass, 47);
			this.createEReference(this.regionEClass, 48);
			this.createEReference(this.regionEClass, 49);
			this.stateMachineEClass = this.createEClass(47);
			this.createEReference(this.stateMachineEClass, 147);
			this.createEReference(this.stateMachineEClass, 148);
			this.createEReference(this.stateMachineEClass, 149);
			this.createEReference(this.stateMachineEClass, 150);
			this.createEReference(this.stateMachineEClass, 151);
			this.pseudostateEClass = this.createEClass(48);
			this.createEAttribute(this.pseudostateEClass, 42);
			this.createEReference(this.pseudostateEClass, 43);
			this.createEReference(this.pseudostateEClass, 44);
			this.createEReference(this.pseudostateEClass, 45);
			this.createEReference(this.pseudostateEClass, 46);
			this.connectionPointReferenceEClass = this.createEClass(49);
			this.createEReference(this.connectionPointReferenceEClass, 42);
			this.createEReference(this.connectionPointReferenceEClass, 43);
			this.createEReference(this.connectionPointReferenceEClass, 44);
			this.transitionEClass = this.createEClass(50);
			this.createEReference(this.transitionEClass, 43);
			this.createEReference(this.transitionEClass, 44);
			this.createEReference(this.transitionEClass, 45);
			this.createEAttribute(this.transitionEClass, 46);
			this.createEReference(this.transitionEClass, 47);
			this.createEReference(this.transitionEClass, 48);
			this.createEReference(this.transitionEClass, 49);
			this.createEReference(this.transitionEClass, 50);
			this.createEReference(this.transitionEClass, 51);
			this.createEReference(this.transitionEClass, 52);
			this.constraintEClass = this.createEClass(51);
			this.createEReference(this.constraintEClass, 45);
			this.createEReference(this.constraintEClass, 46);
			this.createEReference(this.constraintEClass, 47);
			this.createEReference(this.constraintEClass, 48);
			this.createEReference(this.constraintEClass, 49);
			this.createEReference(this.constraintEClass, 50);
			this.createEReference(this.constraintEClass, 51);
			this.createEReference(this.constraintEClass, 52);
			this.createEReference(this.constraintEClass, 53);
			this.createEReference(this.constraintEClass, 54);
			this.createEReference(this.constraintEClass, 55);
			this.createEReference(this.constraintEClass, 56);
			this.createEReference(this.constraintEClass, 57);
			this.createEReference(this.constraintEClass, 58);
			this.createEReference(this.constraintEClass, 59);
			this.createEReference(this.constraintEClass, 60);
			this.createEReference(this.constraintEClass, 61);
			this.createEReference(this.constraintEClass, 62);
			this.extendEClass = this.createEClass(52);
			this.createEReference(this.extendEClass, 36);
			this.createEReference(this.extendEClass, 37);
			this.createEReference(this.extendEClass, 38);
			this.createEReference(this.extendEClass, 39);
			this.useCaseEClass = this.createEClass(53);
			this.createEReference(this.useCaseEClass, 107);
			this.createEReference(this.useCaseEClass, 108);
			this.createEReference(this.useCaseEClass, 109);
			this.createEReference(this.useCaseEClass, 110);
			this.createEReference(this.useCaseEClass, 111);
			this.createEReference(this.useCaseEClass, 112);
			this.createEReference(this.useCaseEClass, 113);
			this.extensionPointEClass = this.createEClass(54);
			this.createEReference(this.extensionPointEClass, 36);
			this.createEReference(this.extensionPointEClass, 37);
			this.includeEClass = this.createEClass(55);
			this.createEReference(this.includeEClass, 36);
			this.createEReference(this.includeEClass, 37);
			this.protocolTransitionEClass = this.createEClass(56);
			this.createEReference(this.protocolTransitionEClass, 53);
			this.createEReference(this.protocolTransitionEClass, 54);
			this.createEReference(this.protocolTransitionEClass, 55);
			this.operationEClass = this.createEClass(57);
			this.createEReference(this.operationEClass, 59);
			this.createEReference(this.operationEClass, 60);
			this.createEReference(this.operationEClass, 61);
			this.createEReference(this.operationEClass, 62);
			this.createEReference(this.operationEClass, 63);
			this.createEReference(this.operationEClass, 64);
			this.createEAttribute(this.operationEClass, 65);
			this.createEAttribute(this.operationEClass, 66);
			this.createEAttribute(this.operationEClass, 67);
			this.createEAttribute(this.operationEClass, 68);
			this.createEReference(this.operationEClass, 69);
			this.createEReference(this.operationEClass, 70);
			this.createEReference(this.operationEClass, 71);
			this.createEReference(this.operationEClass, 72);
			this.createEAttribute(this.operationEClass, 73);
			this.createEReference(this.operationEClass, 74);
			this.createEReference(this.operationEClass, 75);
			this.createEReference(this.operationEClass, 76);
			this.createEReference(this.operationEClass, 77);
			this.createEReference(this.operationEClass, 78);
			this.createEReference(this.operationEClass, 79);
			this.behavioralFeatureEClass = this.createEClass(58);
			this.createEAttribute(this.behavioralFeatureEClass, 45);
			this.createEAttribute(this.behavioralFeatureEClass, 46);
			this.createEReference(this.behavioralFeatureEClass, 47);
			this.createEReference(this.behavioralFeatureEClass, 48);
			this.createEReference(this.behavioralFeatureEClass, 49);
			this.createEReference(this.behavioralFeatureEClass, 50);
			this.featureEClass = this.createEClass(59);
			this.createEReference(this.featureEClass, 36);
			this.createEAttribute(this.featureEClass, 37);
			this.parameterSetEClass = this.createEClass(60);
			this.createEReference(this.parameterSetEClass, 32);
			this.createEReference(this.parameterSetEClass, 33);
			this.createEReference(this.parameterSetEClass, 34);
			this.createEReference(this.parameterSetEClass, 35);
			this.typeEClass = this.createEClass(61);
			this.createEReference(this.typeEClass, 45);
			this.createEReference(this.typeEClass, 46);
			this.createEReference(this.typeEClass, 47);
			this.createEReference(this.typeEClass, 48);
			this.createEReference(this.typeEClass, 49);
			this.createEReference(this.typeEClass, 50);
			this.associationEClass = this.createEClass(62);
			this.createEAttribute(this.associationEClass, 105);
			this.createEReference(this.associationEClass, 106);
			this.createEReference(this.associationEClass, 107);
			this.createEReference(this.associationEClass, 108);
			this.createEReference(this.associationEClass, 109);
			this.createEReference(this.associationEClass, 110);
			this.createEReference(this.associationEClass, 111);
			this.propertyEClass = this.createEClass(63);
			this.createEAttribute(this.propertyEClass, 61);
			this.createEReference(this.propertyEClass, 62);
			this.createEReference(this.propertyEClass, 63);
			this.createEReference(this.propertyEClass, 64);
			this.createEReference(this.propertyEClass, 65);
			this.createEReference(this.propertyEClass, 66);
			this.createEReference(this.propertyEClass, 67);
			this.createEReference(this.propertyEClass, 68);
			this.createEReference(this.propertyEClass, 69);
			this.createEReference(this.propertyEClass, 70);
			this.createEReference(this.propertyEClass, 71);
			this.createEReference(this.propertyEClass, 72);
			this.createEReference(this.propertyEClass, 73);
			this.createEReference(this.propertyEClass, 74);
			this.createEReference(this.propertyEClass, 75);
			this.createEReference(this.propertyEClass, 76);
			this.createEAttribute(this.propertyEClass, 77);
			this.createEAttribute(this.propertyEClass, 78);
			this.createEAttribute(this.propertyEClass, 79);
			this.createEAttribute(this.propertyEClass, 80);
			this.createEReference(this.propertyEClass, 81);
			this.createEReference(this.propertyEClass, 82);
			this.createEReference(this.propertyEClass, 83);
			this.createEReference(this.propertyEClass, 84);
			this.createEReference(this.propertyEClass, 85);
			this.createEReference(this.propertyEClass, 86);
			this.createEReference(this.propertyEClass, 87);
			this.createEReference(this.propertyEClass, 88);
			this.createEReference(this.propertyEClass, 89);
			this.createEReference(this.propertyEClass, 90);
			this.createEReference(this.propertyEClass, 91);
			this.createEReference(this.propertyEClass, 92);
			this.structuralFeatureEClass = this.createEClass(64);
			this.createEAttribute(this.structuralFeatureEClass, 45);
			this.createEReference(this.structuralFeatureEClass, 46);
			this.createEReference(this.structuralFeatureEClass, 47);
			this.slotEClass = this.createEClass(65);
			this.createEReference(this.slotEClass, 17);
			this.createEReference(this.slotEClass, 18);
			this.createEReference(this.slotEClass, 19);
			this.structuralFeatureActionEClass = this.createEClass(66);
			this.createEReference(this.structuralFeatureActionEClass, 62);
			this.createEReference(this.structuralFeatureActionEClass, 63);
			this.dataTypeEClass = this.createEClass(67);
			this.createEReference(this.dataTypeEClass, 103);
			this.createEReference(this.dataTypeEClass, 104);
			this.interfaceEClass = this.createEClass(68);
			this.createEReference(this.interfaceEClass, 103);
			this.createEReference(this.interfaceEClass, 104);
			this.createEReference(this.interfaceEClass, 105);
			this.createEReference(this.interfaceEClass, 106);
			this.createEReference(this.interfaceEClass, 107);
			this.createEReference(this.interfaceEClass, 108);
			this.createEReference(this.interfaceEClass, 109);
			this.createEReference(this.interfaceEClass, 110);
			this.createEReference(this.interfaceEClass, 111);
			this.createEReference(this.interfaceEClass, 112);
			this.createEReference(this.interfaceEClass, 113);
			this.createEReference(this.interfaceEClass, 114);
			this.receptionEClass = this.createEClass(69);
			this.createEReference(this.receptionEClass, 51);
			this.createEReference(this.receptionEClass, 52);
			this.createEReference(this.receptionEClass, 53);
			this.signalEClass = this.createEClass(70);
			this.createEReference(this.signalEClass, 103);
			this.createEReference(this.signalEClass, 104);
			this.createEReference(this.signalEClass, 105);
			this.createEReference(this.signalEClass, 106);
			this.createEReference(this.signalEClass, 107);
			this.signalEventEClass = this.createEClass(71);
			this.createEReference(this.signalEventEClass, 47);
			this.messageEventEClass = this.createEClass(72);
			this.eventEClass = this.createEClass(73);
			this.createEReference(this.eventEClass, 45);
			this.createEReference(this.eventEClass, 46);
			this.triggerEClass = this.createEClass(74);
			this.createEReference(this.triggerEClass, 32);
			this.createEReference(this.triggerEClass, 33);
			this.createEReference(this.triggerEClass, 34);
			this.createEReference(this.triggerEClass, 35);
			this.createEReference(this.triggerEClass, 36);
			this.createEReference(this.triggerEClass, 37);
			this.portEClass = this.createEClass(75);
			this.createEAttribute(this.portEClass, 93);
			this.createEAttribute(this.portEClass, 94);
			this.createEAttribute(this.portEClass, 95);
			this.createEReference(this.portEClass, 96);
			this.createEReference(this.portEClass, 97);
			this.createEReference(this.portEClass, 98);
			this.createEReference(this.portEClass, 99);
			this.createEReference(this.portEClass, 100);
			this.createEReference(this.portEClass, 101);
			this.createEReference(this.portEClass, 102);
			this.createEReference(this.portEClass, 103);
			this.protocolStateMachineEClass = this.createEClass(76);
			this.createEReference(this.protocolStateMachineEClass, 152);
			this.createEReference(this.protocolStateMachineEClass, 153);
			this.createEReference(this.protocolStateMachineEClass, 154);
			this.createEReference(this.protocolStateMachineEClass, 155);
			this.protocolConformanceEClass = this.createEClass(77);
			this.createEReference(this.protocolConformanceEClass, 21);
			this.createEReference(this.protocolConformanceEClass, 22);
			this.encapsulatedClassifierEClass = this.createEClass(78);
			this.createEReference(this.encapsulatedClassifierEClass, 107);
			this.structuredClassifierEClass = this.createEClass(79);
			this.createEReference(this.structuredClassifierEClass, 103);
			this.createEReference(this.structuredClassifierEClass, 104);
			this.createEReference(this.structuredClassifierEClass, 105);
			this.createEReference(this.structuredClassifierEClass, 106);
			this.connectorEClass = this.createEClass(80);
			this.createEReference(this.connectorEClass, 38);
			this.createEReference(this.connectorEClass, 39);
			this.createEAttribute(this.connectorEClass, 40);
			this.createEReference(this.connectorEClass, 41);
			this.createEReference(this.connectorEClass, 42);
			this.createEReference(this.connectorEClass, 43);
			this.createEReference(this.connectorEClass, 44);
			this.createEReference(this.connectorEClass, 45);
			this.createEReference(this.connectorEClass, 46);
			this.connectorEndEClass = this.createEClass(81);
			this.createEReference(this.connectorEndEClass, 23);
			this.createEReference(this.connectorEndEClass, 24);
			this.createEReference(this.connectorEndEClass, 25);
			this.createEReference(this.connectorEndEClass, 26);
			this.messageEClass = this.createEClass(82);
			this.createEReference(this.messageEClass, 32);
			this.createEReference(this.messageEClass, 33);
			this.createEAttribute(this.messageEClass, 34);
			this.createEAttribute(this.messageEClass, 35);
			this.createEReference(this.messageEClass, 36);
			this.createEReference(this.messageEClass, 37);
			this.createEReference(this.messageEClass, 38);
			this.createEReference(this.messageEClass, 39);
			this.createEReference(this.messageEClass, 40);
			this.createEReference(this.messageEClass, 41);
			this.createEReference(this.messageEClass, 42);
			this.createEReference(this.messageEClass, 43);
			this.createEReference(this.messageEClass, 44);
			this.createEReference(this.messageEClass, 45);
			this.messageEndEClass = this.createEClass(83);
			this.createEReference(this.messageEndEClass, 32);
			this.createEReference(this.messageEndEClass, 33);
			this.createEReference(this.messageEndEClass, 34);
			this.invocationActionEClass = this.createEClass(84);
			this.createEReference(this.invocationActionEClass, 62);
			this.createEReference(this.invocationActionEClass, 63);
			this.acceptEventActionEClass = this.createEClass(85);
			this.createEAttribute(this.acceptEventActionEClass, 62);
			this.createEReference(this.acceptEventActionEClass, 63);
			this.createEReference(this.acceptEventActionEClass, 64);
			this.outputPinEClass = this.createEClass(86);
			this.createEReference(this.outputPinEClass, 59);
			this.createEReference(this.outputPinEClass, 60);
			this.createEReference(this.outputPinEClass, 61);
			this.createEReference(this.outputPinEClass, 62);
			this.createEReference(this.outputPinEClass, 63);
			this.createEReference(this.outputPinEClass, 64);
			this.createEReference(this.outputPinEClass, 65);
			this.createEReference(this.outputPinEClass, 66);
			this.createEReference(this.outputPinEClass, 67);
			this.createEReference(this.outputPinEClass, 68);
			this.createEReference(this.outputPinEClass, 69);
			this.createEReference(this.outputPinEClass, 70);
			this.createEReference(this.outputPinEClass, 71);
			this.createEReference(this.outputPinEClass, 72);
			this.createEReference(this.outputPinEClass, 73);
			this.createEReference(this.outputPinEClass, 74);
			this.createEReference(this.outputPinEClass, 75);
			this.createEReference(this.outputPinEClass, 76);
			this.createEReference(this.outputPinEClass, 77);
			this.createEReference(this.outputPinEClass, 78);
			this.createEReference(this.outputPinEClass, 79);
			this.createEReference(this.outputPinEClass, 80);
			this.createEReference(this.outputPinEClass, 81);
			this.createEReference(this.outputPinEClass, 82);
			this.createEReference(this.outputPinEClass, 83);
			this.createEReference(this.outputPinEClass, 84);
			this.createEReference(this.outputPinEClass, 85);
			this.createEReference(this.outputPinEClass, 86);
			this.createEReference(this.outputPinEClass, 87);
			this.readExtentActionEClass = this.createEClass(87);
			this.createEReference(this.readExtentActionEClass, 62);
			this.createEReference(this.readExtentActionEClass, 63);
			this.conditionalNodeEClass = this.createEClass(88);
			this.createEReference(this.conditionalNodeEClass, 81);
			this.createEAttribute(this.conditionalNodeEClass, 82);
			this.createEAttribute(this.conditionalNodeEClass, 83);
			this.createEReference(this.conditionalNodeEClass, 84);
			this.clauseEClass = this.createEClass(89);
			this.createEReference(this.clauseEClass, 17);
			this.createEReference(this.clauseEClass, 18);
			this.createEReference(this.clauseEClass, 19);
			this.createEReference(this.clauseEClass, 20);
			this.createEReference(this.clauseEClass, 21);
			this.createEReference(this.clauseEClass, 22);
			this.createEReference(this.clauseEClass, 23);
			this.loopNodeEClass = this.createEClass(90);
			this.createEReference(this.loopNodeEClass, 81);
			this.createEReference(this.loopNodeEClass, 82);
			this.createEReference(this.loopNodeEClass, 83);
			this.createEAttribute(this.loopNodeEClass, 84);
			this.createEReference(this.loopNodeEClass, 85);
			this.createEReference(this.loopNodeEClass, 86);
			this.createEReference(this.loopNodeEClass, 87);
			this.createEReference(this.loopNodeEClass, 88);
			this.createEReference(this.loopNodeEClass, 89);
			this.reduceActionEClass = this.createEClass(91);
			this.createEReference(this.reduceActionEClass, 62);
			this.createEAttribute(this.reduceActionEClass, 63);
			this.createEReference(this.reduceActionEClass, 64);
			this.createEReference(this.reduceActionEClass, 65);
			this.createObjectActionEClass = this.createEClass(92);
			this.createEReference(this.createObjectActionEClass, 62);
			this.createEReference(this.createObjectActionEClass, 63);
			this.unmarshallActionEClass = this.createEClass(93);
			this.createEReference(this.unmarshallActionEClass, 62);
			this.createEReference(this.unmarshallActionEClass, 63);
			this.createEReference(this.unmarshallActionEClass, 64);
			this.opaqueActionEClass = this.createEClass(94);
			this.createEAttribute(this.opaqueActionEClass, 62);
			this.createEReference(this.opaqueActionEClass, 63);
			this.createEAttribute(this.opaqueActionEClass, 64);
			this.createEReference(this.opaqueActionEClass, 65);
			this.readLinkActionEClass = this.createEClass(95);
			this.createEReference(this.readLinkActionEClass, 64);
			this.linkActionEClass = this.createEClass(96);
			this.createEReference(this.linkActionEClass, 62);
			this.createEReference(this.linkActionEClass, 63);
			this.linkEndDataEClass = this.createEClass(97);
			this.createEReference(this.linkEndDataEClass, 17);
			this.createEReference(this.linkEndDataEClass, 18);
			this.createEReference(this.linkEndDataEClass, 19);
			this.createEReference(this.linkEndDataEClass, 20);
			this.qualifierValueEClass = this.createEClass(98);
			this.createEReference(this.qualifierValueEClass, 17);
			this.createEReference(this.qualifierValueEClass, 18);
			this.createEReference(this.qualifierValueEClass, 19);
			this.readLinkObjectEndActionEClass = this.createEClass(99);
			this.createEReference(this.readLinkObjectEndActionEClass, 62);
			this.createEReference(this.readLinkObjectEndActionEClass, 63);
			this.createEReference(this.readLinkObjectEndActionEClass, 64);
			this.acceptCallActionEClass = this.createEClass(100);
			this.createEReference(this.acceptCallActionEClass, 65);
			this.writeStructuralFeatureActionEClass = this.createEClass(101);
			this.createEReference(this.writeStructuralFeatureActionEClass, 64);
			this.createEReference(this.writeStructuralFeatureActionEClass, 65);
			this.createLinkObjectActionEClass = this.createEClass(102);
			this.createEReference(this.createLinkObjectActionEClass, 65);
			this.createLinkActionEClass = this.createEClass(103);
			this.createEReference(this.createLinkActionEClass, 64);
			this.writeLinkActionEClass = this.createEClass(104);
			this.linkEndCreationDataEClass = this.createEClass(105);
			this.createEReference(this.linkEndCreationDataEClass, 21);
			this.createEAttribute(this.linkEndCreationDataEClass, 22);
			this.createEReference(this.linkEndCreationDataEClass, 23);
			this.readStructuralFeatureActionEClass = this.createEClass(106);
			this.createEReference(this.readStructuralFeatureActionEClass, 64);
			this.clearStructuralFeatureActionEClass = this.createEClass(107);
			this.createEReference(this.clearStructuralFeatureActionEClass, 64);
			this.valueSpecificationActionEClass = this.createEClass(108);
			this.createEReference(this.valueSpecificationActionEClass, 62);
			this.createEReference(this.valueSpecificationActionEClass, 63);
			this.testIdentityActionEClass = this.createEClass(109);
			this.createEReference(this.testIdentityActionEClass, 62);
			this.createEReference(this.testIdentityActionEClass, 63);
			this.createEReference(this.testIdentityActionEClass, 64);
			this.readIsClassifiedObjectActionEClass = this.createEClass(110);
			this.createEReference(this.readIsClassifiedObjectActionEClass, 62);
			this.createEAttribute(this.readIsClassifiedObjectActionEClass, 63);
			this.createEReference(this.readIsClassifiedObjectActionEClass, 64);
			this.createEReference(this.readIsClassifiedObjectActionEClass, 65);
			this.callActionEClass = this.createEClass(111);
			this.createEAttribute(this.callActionEClass, 64);
			this.createEReference(this.callActionEClass, 65);
			this.readSelfActionEClass = this.createEClass(112);
			this.createEReference(this.readSelfActionEClass, 62);
			this.readVariableActionEClass = this.createEClass(113);
			this.createEReference(this.readVariableActionEClass, 63);
			this.variableActionEClass = this.createEClass(114);
			this.createEReference(this.variableActionEClass, 62);
			this.readLinkObjectEndQualifierActionEClass = this.createEClass(115);
			this.createEReference(this.readLinkObjectEndQualifierActionEClass, 62);
			this.createEReference(this.readLinkObjectEndQualifierActionEClass, 63);
			this.createEReference(this.readLinkObjectEndQualifierActionEClass, 64);
			this.replyActionEClass = this.createEClass(116);
			this.createEReference(this.replyActionEClass, 62);
			this.createEReference(this.replyActionEClass, 63);
			this.createEReference(this.replyActionEClass, 64);
			this.sendSignalActionEClass = this.createEClass(117);
			this.createEReference(this.sendSignalActionEClass, 64);
			this.createEReference(this.sendSignalActionEClass, 65);
			this.broadcastSignalActionEClass = this.createEClass(118);
			this.createEReference(this.broadcastSignalActionEClass, 64);
			this.interfaceRealizationEClass = this.createEClass(119);
			this.createEReference(this.interfaceRealizationEClass, 53);
			this.createEReference(this.interfaceRealizationEClass, 54);
			this.realizationEClass = this.createEClass(120);
			this.abstractionEClass = this.createEClass(121);
			this.createEReference(this.abstractionEClass, 52);
			this.dependencyEClass = this.createEClass(122);
			this.createEReference(this.dependencyEClass, 49);
			this.createEReference(this.dependencyEClass, 50);
			this.createEReference(this.dependencyEClass, 51);
			this.collaborationUseEClass = this.createEClass(123);
			this.createEReference(this.collaborationUseEClass, 32);
			this.createEReference(this.collaborationUseEClass, 33);
			this.createEReference(this.collaborationUseEClass, 34);
			this.createEReference(this.collaborationUseEClass, 35);
			this.collaborationEClass = this.createEClass(124);
			this.createEReference(this.collaborationEClass, 111);
			this.createEReference(this.collaborationEClass, 112);
			this.opaqueExpressionEClass = this.createEClass(125);
			this.createEReference(this.opaqueExpressionEClass, 72);
			this.createEAttribute(this.opaqueExpressionEClass, 73);
			this.createEAttribute(this.opaqueExpressionEClass, 74);
			this.createEReference(this.opaqueExpressionEClass, 75);
			this.createEReference(this.opaqueExpressionEClass, 76);
			this.componentEClass = this.createEClass(126);
			this.createEAttribute(this.componentEClass, 121);
			this.createEReference(this.componentEClass, 122);
			this.createEReference(this.componentEClass, 123);
			this.createEReference(this.componentEClass, 124);
			this.createEReference(this.componentEClass, 125);
			this.componentRealizationEClass = this.createEClass(127);
			this.createEReference(this.componentRealizationEClass, 53);
			this.createEReference(this.componentRealizationEClass, 54);
			this.artifactEClass = this.createEClass(128);
			this.createEAttribute(this.artifactEClass, 104);
			this.createEReference(this.artifactEClass, 105);
			this.createEReference(this.artifactEClass, 106);
			this.createEReference(this.artifactEClass, 107);
			this.createEReference(this.artifactEClass, 108);
			this.createEReference(this.artifactEClass, 109);
			this.deployedArtifactEClass = this.createEClass(129);
			this.createEReference(this.deployedArtifactEClass, 32);
			this.deploymentEClass = this.createEClass(130);
			this.createEReference(this.deploymentEClass, 52);
			this.createEReference(this.deploymentEClass, 53);
			this.createEReference(this.deploymentEClass, 54);
			this.deploymentSpecificationEClass = this.createEClass(131);
			this.createEAttribute(this.deploymentSpecificationEClass, 110);
			this.createEAttribute(this.deploymentSpecificationEClass, 111);
			this.createEReference(this.deploymentSpecificationEClass, 112);
			this.manifestationEClass = this.createEClass(132);
			this.createEReference(this.manifestationEClass, 53);
			this.createEReference(this.manifestationEClass, 54);
			this.interactionUseEClass = this.createEClass(133);
			this.createEReference(this.interactionUseEClass, 36);
			this.createEReference(this.interactionUseEClass, 37);
			this.createEReference(this.interactionUseEClass, 38);
			this.createEReference(this.interactionUseEClass, 39);
			this.createEReference(this.interactionUseEClass, 40);
			this.gateEClass = this.createEClass(134);
			this.createEReference(this.gateEClass, 35);
			this.createEReference(this.gateEClass, 36);
			this.createEReference(this.gateEClass, 37);
			this.createEReference(this.gateEClass, 38);
			this.createEReference(this.gateEClass, 39);
			this.combinedFragmentEClass = this.createEClass(135);
			this.createEAttribute(this.combinedFragmentEClass, 36);
			this.createEReference(this.combinedFragmentEClass, 37);
			this.createEReference(this.combinedFragmentEClass, 38);
			this.interactionOperandEClass = this.createEClass(136);
			this.createEReference(this.interactionOperandEClass, 43);
			this.createEReference(this.interactionOperandEClass, 44);
			this.createEReference(this.interactionOperandEClass, 45);
			this.interactionConstraintEClass = this.createEClass(137);
			this.createEReference(this.interactionConstraintEClass, 63);
			this.createEReference(this.interactionConstraintEClass, 64);
			this.createEReference(this.interactionConstraintEClass, 65);
			this.clearAssociationActionEClass = this.createEClass(138);
			this.createEReference(this.clearAssociationActionEClass, 62);
			this.createEReference(this.clearAssociationActionEClass, 63);
			this.operationTemplateParameterEClass = this.createEClass(139);
			this.createEReference(this.operationTemplateParameterEClass, 25);
			this.callOperationActionEClass = this.createEClass(140);
			this.createEReference(this.callOperationActionEClass, 66);
			this.createEReference(this.callOperationActionEClass, 67);
			this.callEventEClass = this.createEClass(141);
			this.createEReference(this.callEventEClass, 47);
			this.stateInvariantEClass = this.createEClass(142);
			this.createEReference(this.stateInvariantEClass, 36);
			this.createEReference(this.stateInvariantEClass, 37);
			this.exceptionHandlerEClass = this.createEClass(143);
			this.createEReference(this.exceptionHandlerEClass, 17);
			this.createEReference(this.exceptionHandlerEClass, 18);
			this.createEReference(this.exceptionHandlerEClass, 19);
			this.createEReference(this.exceptionHandlerEClass, 20);
			this.sendObjectActionEClass = this.createEClass(144);
			this.createEReference(this.sendObjectActionEClass, 64);
			this.createEReference(this.sendObjectActionEClass, 65);
			this.addStructuralFeatureValueActionEClass = this.createEClass(145);
			this.createEAttribute(this.addStructuralFeatureValueActionEClass, 66);
			this.createEReference(this.addStructuralFeatureValueActionEClass, 67);
			this.removeStructuralFeatureValueActionEClass = this.createEClass(146);
			this.createEAttribute(this.removeStructuralFeatureValueActionEClass, 66);
			this.createEReference(this.removeStructuralFeatureValueActionEClass, 67);
			this.startObjectBehaviorActionEClass = this.createEClass(147);
			this.createEReference(this.startObjectBehaviorActionEClass, 66);
			this.removeVariableValueActionEClass = this.createEClass(148);
			this.createEAttribute(this.removeVariableValueActionEClass, 64);
			this.createEReference(this.removeVariableValueActionEClass, 65);
			this.writeVariableActionEClass = this.createEClass(149);
			this.createEReference(this.writeVariableActionEClass, 63);
			this.destroyObjectActionEClass = this.createEClass(150);
			this.createEAttribute(this.destroyObjectActionEClass, 62);
			this.createEAttribute(this.destroyObjectActionEClass, 63);
			this.createEReference(this.destroyObjectActionEClass, 64);
			this.reclassifyObjectActionEClass = this.createEClass(151);
			this.createEAttribute(this.reclassifyObjectActionEClass, 62);
			this.createEReference(this.reclassifyObjectActionEClass, 63);
			this.createEReference(this.reclassifyObjectActionEClass, 64);
			this.createEReference(this.reclassifyObjectActionEClass, 65);
			this.raiseExceptionActionEClass = this.createEClass(152);
			this.createEReference(this.raiseExceptionActionEClass, 62);
			this.linkEndDestructionDataEClass = this.createEClass(153);
			this.createEAttribute(this.linkEndDestructionDataEClass, 21);
			this.createEReference(this.linkEndDestructionDataEClass, 22);
			this.createEReference(this.linkEndDestructionDataEClass, 23);
			this.destroyLinkActionEClass = this.createEClass(154);
			this.createEReference(this.destroyLinkActionEClass, 64);
			this.addVariableValueActionEClass = this.createEClass(155);
			this.createEAttribute(this.addVariableValueActionEClass, 64);
			this.createEReference(this.addVariableValueActionEClass, 65);
			this.startClassifierBehaviorActionEClass = this.createEClass(156);
			this.createEReference(this.startClassifierBehaviorActionEClass, 62);
			this.interruptibleActivityRegionEClass = this.createEClass(157);
			this.createEReference(this.interruptibleActivityRegionEClass, 37);
			this.createEReference(this.interruptibleActivityRegionEClass, 38);
			this.sequenceNodeEClass = this.createEClass(158);
			this.createEReference(this.sequenceNodeEClass, 81);
			this.actionInputPinEClass = this.createEClass(159);
			this.createEReference(this.actionInputPinEClass, 95);
			this.actionExecutionSpecificationEClass = this.createEClass(160);
			this.createEReference(this.actionExecutionSpecificationEClass, 39);
			this.executionSpecificationEClass = this.createEClass(161);
			this.createEReference(this.executionSpecificationEClass, 36);
			this.createEReference(this.executionSpecificationEClass, 37);
			this.createEReference(this.executionSpecificationEClass, 38);
			this.occurrenceSpecificationEClass = this.createEClass(162);
			this.createEReference(this.occurrenceSpecificationEClass, 36);
			this.createEReference(this.occurrenceSpecificationEClass, 37);
			this.createEReference(this.occurrenceSpecificationEClass, 38);
			this.createEReference(this.occurrenceSpecificationEClass, 39);
			this.createEReference(this.occurrenceSpecificationEClass, 40);
			this.generalOrderingEClass = this.createEClass(163);
			this.createEReference(this.generalOrderingEClass, 32);
			this.createEReference(this.generalOrderingEClass, 33);
			this.createEReference(this.generalOrderingEClass, 34);
			this.executionOccurrenceSpecificationEClass = this.createEClass(164);
			this.createEReference(this.executionOccurrenceSpecificationEClass, 41);
			this.partDecompositionEClass = this.createEClass(165);
			this.createEReference(this.partDecompositionEClass, 41);
			this.valuePinEClass = this.createEClass(166);
			this.createEReference(this.valuePinEClass, 95);
			this.intervalEClass = this.createEClass(167);
			this.createEReference(this.intervalEClass, 72);
			this.createEReference(this.intervalEClass, 73);
			this.createEReference(this.intervalEClass, 74);
			this.intervalConstraintEClass = this.createEClass(168);
			this.createEReference(this.intervalConstraintEClass, 63);
			this.changeEventEClass = this.createEClass(169);
			this.createEReference(this.changeEventEClass, 47);
			this.joinNodeEClass = this.createEClass(170);
			this.createEAttribute(this.joinNodeEClass, 45);
			this.createEReference(this.joinNodeEClass, 46);
			this.controlNodeEClass = this.createEClass(171);
			this.durationEClass = this.createEClass(172);
			this.createEReference(this.durationEClass, 72);
			this.createEReference(this.durationEClass, 73);
			this.createEReference(this.durationEClass, 74);
			this.createEReference(this.durationEClass, 75);
			this.observationEClass = this.createEClass(173);
			this.createEReference(this.observationEClass, 45);
			this.createEReference(this.observationEClass, 46);
			this.createEReference(this.observationEClass, 47);
			this.timeExpressionEClass = this.createEClass(174);
			this.createEReference(this.timeExpressionEClass, 72);
			this.createEReference(this.timeExpressionEClass, 73);
			this.createEReference(this.timeExpressionEClass, 74);
			this.createEReference(this.timeExpressionEClass, 75);
			this.createEReference(this.timeExpressionEClass, 76);
			this.timeIntervalEClass = this.createEClass(175);
			this.createEReference(this.timeIntervalEClass, 75);
			this.createEReference(this.timeIntervalEClass, 76);
			this.createEReference(this.timeIntervalEClass, 77);
			this.timeConstraintEClass = this.createEClass(176);
			this.createEAttribute(this.timeConstraintEClass, 64);
			this.createEReference(this.timeConstraintEClass, 65);
			this.timeEventEClass = this.createEClass(177);
			this.createEAttribute(this.timeEventEClass, 47);
			this.createEReference(this.timeEventEClass, 48);
			this.durationIntervalEClass = this.createEClass(178);
			this.createEReference(this.durationIntervalEClass, 75);
			this.createEReference(this.durationIntervalEClass, 76);
			this.createEReference(this.durationIntervalEClass, 77);
			this.durationConstraintEClass = this.createEClass(179);
			this.createEAttribute(this.durationConstraintEClass, 64);
			this.createEReference(this.durationConstraintEClass, 65);
			this.expressionEClass = this.createEClass(180);
			this.createEAttribute(this.expressionEClass, 72);
			this.createEReference(this.expressionEClass, 73);
			this.activityParameterNodeEClass = this.createEClass(181);
			this.createEReference(this.activityParameterNodeEClass, 52);
			this.objectFlowEClass = this.createEClass(182);
			this.createEAttribute(this.objectFlowEClass, 48);
			this.createEAttribute(this.objectFlowEClass, 49);
			this.createEReference(this.objectFlowEClass, 50);
			this.createEReference(this.objectFlowEClass, 51);
			this.createEReference(this.objectFlowEClass, 52);
			this.decisionNodeEClass = this.createEClass(183);
			this.createEReference(this.decisionNodeEClass, 45);
			this.createEReference(this.decisionNodeEClass, 46);
			this.behaviorExecutionSpecificationEClass = this.createEClass(184);
			this.createEReference(this.behaviorExecutionSpecificationEClass, 39);
			this.callBehaviorActionEClass = this.createEClass(185);
			this.createEReference(this.callBehaviorActionEClass, 66);
			this.extensionEClass = this.createEClass(186);
			this.createEAttribute(this.extensionEClass, 112);
			this.createEReference(this.extensionEClass, 113);
			this.createEReference(this.extensionEClass, 114);
			this.extensionEndEClass = this.createEClass(187);
			this.createEReference(this.extensionEndEClass, 93);
			this.createEAttribute(this.extensionEndEClass, 94);
			this.createEReference(this.extensionEndEClass, 95);
			this.imageEClass = this.createEClass(188);
			this.createEAttribute(this.imageEClass, 17);
			this.createEAttribute(this.imageEClass, 18);
			this.createEAttribute(this.imageEClass, 19);
			this.createEReference(this.imageEClass, 20);
			this.packageMergeEClass = this.createEClass(189);
			this.createEReference(this.packageMergeEClass, 21);
			this.createEReference(this.packageMergeEClass, 22);
			this.profileApplicationEClass = this.createEClass(190);
			this.createEReference(this.profileApplicationEClass, 21);
			this.createEAttribute(this.profileApplicationEClass, 22);
			this.createEReference(this.profileApplicationEClass, 23);
			this.packageImportEClass = this.createEClass(191);
			this.createEReference(this.packageImportEClass, 21);
			this.createEAttribute(this.packageImportEClass, 22);
			this.createEReference(this.packageImportEClass, 23);
			this.createEReference(this.packageImportEClass, 24);
			this.diagramEClass = this.createEClass(192);
			this.createEReference(this.diagramEClass, 32);
			this.createEReference(this.diagramEClass, 33);
			this.createEReference(this.diagramEClass, 34);
			this.generalizationEClass = this.createEClass(193);
			this.createEReference(this.generalizationEClass, 21);
			this.createEReference(this.generalizationEClass, 22);
			this.createEAttribute(this.generalizationEClass, 23);
			this.createEReference(this.generalizationEClass, 24);
			this.generalizationSetEClass = this.createEClass(194);
			this.createEAttribute(this.generalizationSetEClass, 45);
			this.createEAttribute(this.generalizationSetEClass, 46);
			this.createEReference(this.generalizationSetEClass, 47);
			this.createEReference(this.generalizationSetEClass, 48);
			this.redefinableTemplateSignatureEClass = this.createEClass(195);
			this.createEReference(this.redefinableTemplateSignatureEClass, 40);
			this.createEReference(this.redefinableTemplateSignatureEClass, 41);
			this.createEReference(this.redefinableTemplateSignatureEClass, 42);
			this.createEReference(this.redefinableTemplateSignatureEClass, 43);
			this.substitutionEClass = this.createEClass(196);
			this.createEReference(this.substitutionEClass, 53);
			this.createEReference(this.substitutionEClass, 54);
			this.classifierTemplateParameterEClass = this.createEClass(197);
			this.createEAttribute(this.classifierTemplateParameterEClass, 25);
			this.createEReference(this.classifierTemplateParameterEClass, 26);
			this.createEReference(this.classifierTemplateParameterEClass, 27);
			this.informationItemEClass = this.createEClass(198);
			this.createEReference(this.informationItemEClass, 103);
			this.templateParameterSubstitutionEClass = this.createEClass(199);
			this.createEReference(this.templateParameterSubstitutionEClass, 17);
			this.createEReference(this.templateParameterSubstitutionEClass, 18);
			this.createEReference(this.templateParameterSubstitutionEClass, 19);
			this.createEReference(this.templateParameterSubstitutionEClass, 20);
			this.instanceValueEClass = this.createEClass(200);
			this.createEReference(this.instanceValueEClass, 72);
			this.elementValueEClass = this.createEClass(201);
			this.createEReference(this.elementValueEClass, 72);
			this.stringExpressionEClass = this.createEClass(202);
			this.createEReference(this.stringExpressionEClass, 76);
			this.createEReference(this.stringExpressionEClass, 77);
			this.createEReference(this.stringExpressionEClass, 78);
			this.considerIgnoreFragmentEClass = this.createEClass(203);
			this.createEReference(this.considerIgnoreFragmentEClass, 39);
			this.timeObservationEClass = this.createEClass(204);
			this.createEAttribute(this.timeObservationEClass, 48);
			this.createEReference(this.timeObservationEClass, 49);
			this.durationObservationEClass = this.createEClass(205);
			this.createEAttribute(this.durationObservationEClass, 48);
			this.createEReference(this.durationObservationEClass, 49);
			this.connectableElementTemplateParameterEClass = this.createEClass(206);
			this.createEReference(this.connectableElementTemplateParameterEClass, 25);
			this.literalIntegerEClass = this.createEClass(207);
			this.createEAttribute(this.literalIntegerEClass, 72);
			this.literalSpecificationEClass = this.createEClass(208);
			this.enumerationLiteralEClass = this.createEClass(209);
			this.createEReference(this.enumerationLiteralEClass, 53);
			this.createEReference(this.enumerationLiteralEClass, 54);
			this.enumerationEClass = this.createEClass(210);
			this.createEReference(this.enumerationEClass, 105);
			this.createEReference(this.enumerationEClass, 106);
			this.finalStateEClass = this.createEClass(211);
			this.initialNodeEClass = this.createEClass(212);
			this.functionBehaviorEClass = this.createEClass(213);
			this.opaqueBehaviorEClass = this.createEClass(214);
			this.createEAttribute(this.opaqueBehaviorEClass, 147);
			this.createEAttribute(this.opaqueBehaviorEClass, 148);
			this.destructionOccurrenceSpecificationEClass = this.createEClass(215);
			this.messageOccurrenceSpecificationEClass = this.createEClass(216);
			this.literalStringEClass = this.createEClass(217);
			this.createEAttribute(this.literalStringEClass, 72);
			this.finalNodeEClass = this.createEClass(218);
			this.executionEnvironmentEClass = this.createEClass(219);
			this.nodeEClass = this.createEClass(220);
			this.createEReference(this.nodeEClass, 123);
			this.createEReference(this.nodeEClass, 124);
			this.dataStoreNodeEClass = this.createEClass(221);
			this.centralBufferNodeEClass = this.createEClass(222);
			this.activityFinalNodeEClass = this.createEClass(223);
			this.literalBooleanEClass = this.createEClass(224);
			this.createEAttribute(this.literalBooleanEClass, 72);
			this.modelEClass = this.createEClass(225);
			this.createEAttribute(this.modelEClass, 64);
			this.communicationPathEClass = this.createEClass(226);
			this.continuationEClass = this.createEClass(227);
			this.createEAttribute(this.continuationEClass, 36);
			this.expansionNodeEClass = this.createEClass(228);
			this.createEReference(this.expansionNodeEClass, 52);
			this.createEReference(this.expansionNodeEClass, 53);
			this.expansionRegionEClass = this.createEClass(229);
			this.createEAttribute(this.expansionRegionEClass, 81);
			this.createEReference(this.expansionRegionEClass, 82);
			this.createEReference(this.expansionRegionEClass, 83);
			this.literalNullEClass = this.createEClass(230);
			this.literalUnlimitedNaturalEClass = this.createEClass(231);
			this.createEAttribute(this.literalUnlimitedNaturalEClass, 72);
			this.literalRealEClass = this.createEClass(232);
			this.createEAttribute(this.literalRealEClass, 72);
			this.anyReceiveEventEClass = this.createEClass(233);
			this.forkNodeEClass = this.createEClass(234);
			this.controlFlowEClass = this.createEClass(235);
			this.primitiveTypeEClass = this.createEClass(236);
			this.usageEClass = this.createEClass(237);
			this.flowFinalNodeEClass = this.createEClass(238);
			this.actorEClass = this.createEClass(239);
			this.associationClassEClass = this.createEClass(240);
			this.deviceEClass = this.createEClass(241);
			this.mergeNodeEClass = this.createEClass(242);
			this.clearVariableActionEClass = this.createEClass(243);
			this.modelObjectEClass = this.createEClass(244);
			this.createEAttribute(this.modelObjectEClass, 2);
			this.visibilityKindEEnum = this.createEEnum(245);
			this.pseudostateKindEEnum = this.createEEnum(246);
			this.callConcurrencyKindEEnum = this.createEEnum(247);
			this.aggregationKindEEnum = this.createEEnum(248);
			this.connectorKindEEnum = this.createEEnum(249);
			this.messageKindEEnum = this.createEEnum(250);
			this.messageSortEEnum = this.createEEnum(251);
			this.interactionOperatorKindEEnum = this.createEEnum(252);
			this.transitionKindEEnum = this.createEEnum(253);
			this.objectNodeOrderingKindEEnum = this.createEEnum(254);
			this.parameterDirectionKindEEnum = this.createEEnum(255);
			this.parameterEffectKindEEnum = this.createEEnum(256);
			this.expansionKindEEnum = this.createEEnum(257);
			this.stringEDataType = this.createEDataType(258);
			this.booleanEDataType = this.createEDataType(259);
			this.integerEDataType = this.createEDataType(260);
			this.unlimitedNaturalEDataType = this.createEDataType(261);
			this.realEDataType = this.createEDataType(262);
			this.parameterParameterEffectKindEDataType = this.createEDataType(263);
			this.namedElementVisibilityKindEDataType = this.createEDataType(264);
		}
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	public void initializePackageContents() {
		if (!this.isInitialized) {
			this.isInitialized = true;
			this.setName("uml");
			this.setNsPrefix("uml");
			this.setNsURI("http://www.nomagic.com/magicdraw/UML/2.5.1");
			DiagramPackage theDiagramPackage = (DiagramPackage) Registry.INSTANCE
					.getEPackage("http://www.nomagic.com/magicdraw/diagramext/1");
			MDFoundationPackage theMDFoundationPackage = (MDFoundationPackage) Registry.INSTANCE
					.getEPackage("http://www.nomagic.com/magicdraw/foundation");
			this.variableEClass.getESuperTypes().add(this.getConnectableElement());
			this.variableEClass.getESuperTypes().add(this.getMultiplicityElement());
			this.connectableElementEClass.getESuperTypes().add(this.getTypedElement());
			this.connectableElementEClass.getESuperTypes().add(this.getParameterableElement());
			this.typedElementEClass.getESuperTypes().add(this.getNamedElement());
			this.namedElementEClass.getESuperTypes().add(this.getElement());
			this.elementEClass.getESuperTypes().add(this.getModelObject());
			this.commentEClass.getESuperTypes().add(this.getElement());
			this.instanceSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
			this.instanceSpecificationEClass.getESuperTypes().add(this.getDeploymentTarget());
			this.instanceSpecificationEClass.getESuperTypes().add(this.getDeployedArtifact());
			this.deploymentTargetEClass.getESuperTypes().add(this.getNamedElement());
			this.packageableElementEClass.getESuperTypes().add(this.getNamedElement());
			this.packageableElementEClass.getESuperTypes().add(this.getParameterableElement());
			this.parameterableElementEClass.getESuperTypes().add(this.getElement());
			this.templateParameterEClass.getESuperTypes().add(this.getElement());
			this.templateSignatureEClass.getESuperTypes().add(this.getElement());
			this.templateableElementEClass.getESuperTypes().add(this.getElement());
			this.templateBindingEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
			this.relationshipEClass.getESuperTypes().add(this.getElement());
			this.informationFlowEClass.getESuperTypes().add(this.getPackageableElement());
			this.informationFlowEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.classifierEClass.getESuperTypes().add(this.getType());
			this.classifierEClass.getESuperTypes().add(this.getNamespace());
			this.classifierEClass.getESuperTypes().add(this.getRedefinableElement());
			this.classifierEClass.getESuperTypes().add(this.getTemplateableElement());
			this.namespaceEClass.getESuperTypes().add(this.getNamedElement());
			this.elementImportEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.profileEClass.getESuperTypes().add(this.getPackage());
			this.packageEClass.getESuperTypes().add(this.getPackageableElement());
			this.packageEClass.getESuperTypes().add(this.getNamespace());
			this.packageEClass.getESuperTypes().add(this.getTemplateableElement());
			this.stereotypeEClass.getESuperTypes().add(this.getClass_());
			this.classEClass.getESuperTypes().add(this.getEncapsulatedClassifier());
			this.classEClass.getESuperTypes().add(this.getBehavioredClassifier());
			this.behavioredClassifierEClass.getESuperTypes().add(this.getClassifier());
			this.behaviorEClass.getESuperTypes().add(this.getClass_());
			this.parameterEClass.getESuperTypes().add(this.getConnectableElement());
			this.parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
			this.multiplicityElementEClass.getESuperTypes().add(this.getElement());
			this.valueSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
			this.valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
			this.lifelineEClass.getESuperTypes().add(this.getNamedElement());
			this.interactionFragmentEClass.getESuperTypes().add(this.getNamedElement());
			this.interactionEClass.getESuperTypes().add(this.getBehavior());
			this.interactionEClass.getESuperTypes().add(this.getInteractionFragment());
			this.actionEClass.getESuperTypes().add(this.getExecutableNode());
			this.executableNodeEClass.getESuperTypes().add(this.getActivityNode());
			this.activityNodeEClass.getESuperTypes().add(this.getRedefinableElement());
			this.redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
			this.activityEClass.getESuperTypes().add(this.getBehavior());
			this.activityEdgeEClass.getESuperTypes().add(this.getRedefinableElement());
			this.activityGroupEClass.getESuperTypes().add(this.getNamedElement());
			this.activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
			this.structuredActivityNodeEClass.getESuperTypes().add(this.getAction());
			this.structuredActivityNodeEClass.getESuperTypes().add(this.getNamespace());
			this.structuredActivityNodeEClass.getESuperTypes().add(this.getActivityGroup());
			this.inputPinEClass.getESuperTypes().add(this.getPin());
			this.pinEClass.getESuperTypes().add(this.getObjectNode());
			this.pinEClass.getESuperTypes().add(this.getMultiplicityElement());
			this.objectNodeEClass.getESuperTypes().add(this.getActivityNode());
			this.objectNodeEClass.getESuperTypes().add(this.getTypedElement());
			this.stateEClass.getESuperTypes().add(this.getNamespace());
			this.stateEClass.getESuperTypes().add(this.getVertex());
			this.vertexEClass.getESuperTypes().add(this.getRedefinableElement());
			this.regionEClass.getESuperTypes().add(this.getNamespace());
			this.regionEClass.getESuperTypes().add(this.getRedefinableElement());
			this.stateMachineEClass.getESuperTypes().add(this.getBehavior());
			this.pseudostateEClass.getESuperTypes().add(this.getVertex());
			this.connectionPointReferenceEClass.getESuperTypes().add(this.getVertex());
			this.transitionEClass.getESuperTypes().add(this.getNamespace());
			this.transitionEClass.getESuperTypes().add(this.getRedefinableElement());
			this.constraintEClass.getESuperTypes().add(this.getPackageableElement());
			this.extendEClass.getESuperTypes().add(this.getNamedElement());
			this.extendEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.useCaseEClass.getESuperTypes().add(this.getBehavioredClassifier());
			this.extensionPointEClass.getESuperTypes().add(this.getRedefinableElement());
			this.includeEClass.getESuperTypes().add(this.getNamedElement());
			this.includeEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.protocolTransitionEClass.getESuperTypes().add(this.getTransition());
			this.operationEClass.getESuperTypes().add(this.getBehavioralFeature());
			this.operationEClass.getESuperTypes().add(this.getParameterableElement());
			this.operationEClass.getESuperTypes().add(this.getTemplateableElement());
			this.behavioralFeatureEClass.getESuperTypes().add(this.getNamespace());
			this.behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
			this.featureEClass.getESuperTypes().add(this.getRedefinableElement());
			this.parameterSetEClass.getESuperTypes().add(this.getNamedElement());
			this.typeEClass.getESuperTypes().add(this.getPackageableElement());
			this.associationEClass.getESuperTypes().add(this.getClassifier());
			this.associationEClass.getESuperTypes().add(this.getRelationship());
			this.propertyEClass.getESuperTypes().add(this.getStructuralFeature());
			this.propertyEClass.getESuperTypes().add(this.getConnectableElement());
			this.propertyEClass.getESuperTypes().add(this.getDeploymentTarget());
			this.structuralFeatureEClass.getESuperTypes().add(this.getFeature());
			this.structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
			this.structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
			this.slotEClass.getESuperTypes().add(this.getElement());
			this.structuralFeatureActionEClass.getESuperTypes().add(this.getAction());
			this.dataTypeEClass.getESuperTypes().add(this.getClassifier());
			this.interfaceEClass.getESuperTypes().add(this.getClassifier());
			this.receptionEClass.getESuperTypes().add(this.getBehavioralFeature());
			this.signalEClass.getESuperTypes().add(this.getClassifier());
			this.signalEventEClass.getESuperTypes().add(this.getMessageEvent());
			this.messageEventEClass.getESuperTypes().add(this.getEvent());
			this.eventEClass.getESuperTypes().add(this.getPackageableElement());
			this.triggerEClass.getESuperTypes().add(this.getNamedElement());
			this.portEClass.getESuperTypes().add(this.getProperty());
			this.protocolStateMachineEClass.getESuperTypes().add(this.getStateMachine());
			this.protocolConformanceEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.encapsulatedClassifierEClass.getESuperTypes().add(this.getStructuredClassifier());
			this.structuredClassifierEClass.getESuperTypes().add(this.getClassifier());
			this.connectorEClass.getESuperTypes().add(this.getFeature());
			this.connectorEndEClass.getESuperTypes().add(this.getMultiplicityElement());
			this.messageEClass.getESuperTypes().add(this.getNamedElement());
			this.messageEndEClass.getESuperTypes().add(this.getNamedElement());
			this.invocationActionEClass.getESuperTypes().add(this.getAction());
			this.acceptEventActionEClass.getESuperTypes().add(this.getAction());
			this.outputPinEClass.getESuperTypes().add(this.getPin());
			this.readExtentActionEClass.getESuperTypes().add(this.getAction());
			this.conditionalNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
			this.clauseEClass.getESuperTypes().add(this.getElement());
			this.loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
			this.reduceActionEClass.getESuperTypes().add(this.getAction());
			this.createObjectActionEClass.getESuperTypes().add(this.getAction());
			this.unmarshallActionEClass.getESuperTypes().add(this.getAction());
			this.opaqueActionEClass.getESuperTypes().add(this.getAction());
			this.readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
			this.linkActionEClass.getESuperTypes().add(this.getAction());
			this.linkEndDataEClass.getESuperTypes().add(this.getElement());
			this.qualifierValueEClass.getESuperTypes().add(this.getElement());
			this.readLinkObjectEndActionEClass.getESuperTypes().add(this.getAction());
			this.acceptCallActionEClass.getESuperTypes().add(this.getAcceptEventAction());
			this.writeStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
			this.createLinkObjectActionEClass.getESuperTypes().add(this.getCreateLinkAction());
			this.createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
			this.writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
			this.linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
			this.readStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
			this.clearStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
			this.valueSpecificationActionEClass.getESuperTypes().add(this.getAction());
			this.testIdentityActionEClass.getESuperTypes().add(this.getAction());
			this.readIsClassifiedObjectActionEClass.getESuperTypes().add(this.getAction());
			this.callActionEClass.getESuperTypes().add(this.getInvocationAction());
			this.readSelfActionEClass.getESuperTypes().add(this.getAction());
			this.readVariableActionEClass.getESuperTypes().add(this.getVariableAction());
			this.variableActionEClass.getESuperTypes().add(this.getAction());
			this.readLinkObjectEndQualifierActionEClass.getESuperTypes().add(this.getAction());
			this.replyActionEClass.getESuperTypes().add(this.getAction());
			this.sendSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
			this.broadcastSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
			this.interfaceRealizationEClass.getESuperTypes().add(this.getRealization());
			this.realizationEClass.getESuperTypes().add(this.getAbstraction());
			this.abstractionEClass.getESuperTypes().add(this.getDependency());
			this.dependencyEClass.getESuperTypes().add(this.getPackageableElement());
			this.dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.collaborationUseEClass.getESuperTypes().add(this.getNamedElement());
			this.collaborationEClass.getESuperTypes().add(this.getBehavioredClassifier());
			this.collaborationEClass.getESuperTypes().add(this.getStructuredClassifier());
			this.opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
			this.componentEClass.getESuperTypes().add(this.getClass_());
			this.componentRealizationEClass.getESuperTypes().add(this.getRealization());
			this.artifactEClass.getESuperTypes().add(this.getClassifier());
			this.artifactEClass.getESuperTypes().add(this.getDeployedArtifact());
			this.deployedArtifactEClass.getESuperTypes().add(this.getNamedElement());
			this.deploymentEClass.getESuperTypes().add(this.getDependency());
			this.deploymentSpecificationEClass.getESuperTypes().add(this.getArtifact());
			this.manifestationEClass.getESuperTypes().add(this.getAbstraction());
			this.interactionUseEClass.getESuperTypes().add(this.getInteractionFragment());
			this.gateEClass.getESuperTypes().add(this.getMessageEnd());
			this.combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
			this.interactionOperandEClass.getESuperTypes().add(this.getNamespace());
			this.interactionOperandEClass.getESuperTypes().add(this.getInteractionFragment());
			this.interactionConstraintEClass.getESuperTypes().add(this.getConstraint());
			this.clearAssociationActionEClass.getESuperTypes().add(this.getAction());
			this.operationTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
			this.callOperationActionEClass.getESuperTypes().add(this.getCallAction());
			this.callEventEClass.getESuperTypes().add(this.getMessageEvent());
			this.stateInvariantEClass.getESuperTypes().add(this.getInteractionFragment());
			this.exceptionHandlerEClass.getESuperTypes().add(this.getElement());
			this.sendObjectActionEClass.getESuperTypes().add(this.getInvocationAction());
			this.addStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
			this.removeStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
			this.startObjectBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
			this.removeVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
			this.writeVariableActionEClass.getESuperTypes().add(this.getVariableAction());
			this.destroyObjectActionEClass.getESuperTypes().add(this.getAction());
			this.reclassifyObjectActionEClass.getESuperTypes().add(this.getAction());
			this.raiseExceptionActionEClass.getESuperTypes().add(this.getAction());
			this.linkEndDestructionDataEClass.getESuperTypes().add(this.getLinkEndData());
			this.destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
			this.addVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
			this.startClassifierBehaviorActionEClass.getESuperTypes().add(this.getAction());
			this.interruptibleActivityRegionEClass.getESuperTypes().add(this.getActivityGroup());
			this.sequenceNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
			this.actionInputPinEClass.getESuperTypes().add(this.getInputPin());
			this.actionExecutionSpecificationEClass.getESuperTypes().add(this.getExecutionSpecification());
			this.executionSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
			this.occurrenceSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
			this.generalOrderingEClass.getESuperTypes().add(this.getNamedElement());
			this.executionOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
			this.partDecompositionEClass.getESuperTypes().add(this.getInteractionUse());
			this.valuePinEClass.getESuperTypes().add(this.getInputPin());
			this.intervalEClass.getESuperTypes().add(this.getValueSpecification());
			this.intervalConstraintEClass.getESuperTypes().add(this.getConstraint());
			this.changeEventEClass.getESuperTypes().add(this.getEvent());
			this.joinNodeEClass.getESuperTypes().add(this.getControlNode());
			this.controlNodeEClass.getESuperTypes().add(this.getActivityNode());
			this.durationEClass.getESuperTypes().add(this.getValueSpecification());
			this.observationEClass.getESuperTypes().add(this.getPackageableElement());
			this.timeExpressionEClass.getESuperTypes().add(this.getValueSpecification());
			this.timeIntervalEClass.getESuperTypes().add(this.getInterval());
			this.timeConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
			this.timeEventEClass.getESuperTypes().add(this.getEvent());
			this.durationIntervalEClass.getESuperTypes().add(this.getInterval());
			this.durationConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
			this.expressionEClass.getESuperTypes().add(this.getValueSpecification());
			this.activityParameterNodeEClass.getESuperTypes().add(this.getObjectNode());
			this.objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
			this.decisionNodeEClass.getESuperTypes().add(this.getControlNode());
			this.behaviorExecutionSpecificationEClass.getESuperTypes().add(this.getExecutionSpecification());
			this.callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
			this.extensionEClass.getESuperTypes().add(this.getAssociation());
			this.extensionEndEClass.getESuperTypes().add(this.getProperty());
			this.imageEClass.getESuperTypes().add(this.getElement());
			this.packageMergeEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.profileApplicationEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.packageImportEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.diagramEClass.getESuperTypes().add(this.getNamedElement());
			this.generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
			this.generalizationSetEClass.getESuperTypes().add(this.getPackageableElement());
			this.redefinableTemplateSignatureEClass.getESuperTypes().add(this.getRedefinableElement());
			this.redefinableTemplateSignatureEClass.getESuperTypes().add(this.getTemplateSignature());
			this.substitutionEClass.getESuperTypes().add(this.getRealization());
			this.classifierTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
			this.informationItemEClass.getESuperTypes().add(this.getClassifier());
			this.templateParameterSubstitutionEClass.getESuperTypes().add(this.getElement());
			this.instanceValueEClass.getESuperTypes().add(this.getValueSpecification());
			this.elementValueEClass.getESuperTypes().add(this.getValueSpecification());
			this.stringExpressionEClass.getESuperTypes().add(this.getExpression());
			this.stringExpressionEClass.getESuperTypes().add(this.getTemplateableElement());
			this.considerIgnoreFragmentEClass.getESuperTypes().add(this.getCombinedFragment());
			this.timeObservationEClass.getESuperTypes().add(this.getObservation());
			this.durationObservationEClass.getESuperTypes().add(this.getObservation());
			this.connectableElementTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
			this.literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
			this.literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
			this.enumerationLiteralEClass.getESuperTypes().add(this.getInstanceSpecification());
			this.enumerationEClass.getESuperTypes().add(this.getDataType());
			this.finalStateEClass.getESuperTypes().add(this.getState());
			this.initialNodeEClass.getESuperTypes().add(this.getControlNode());
			this.functionBehaviorEClass.getESuperTypes().add(this.getOpaqueBehavior());
			this.opaqueBehaviorEClass.getESuperTypes().add(this.getBehavior());
			this.destructionOccurrenceSpecificationEClass.getESuperTypes()
					.add(this.getMessageOccurrenceSpecification());
			this.messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
			this.messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageEnd());
			this.literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
			this.finalNodeEClass.getESuperTypes().add(this.getControlNode());
			this.executionEnvironmentEClass.getESuperTypes().add(this.getNode());
			this.nodeEClass.getESuperTypes().add(this.getClass_());
			this.nodeEClass.getESuperTypes().add(this.getDeploymentTarget());
			this.dataStoreNodeEClass.getESuperTypes().add(this.getCentralBufferNode());
			this.centralBufferNodeEClass.getESuperTypes().add(this.getObjectNode());
			this.activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
			this.literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
			this.modelEClass.getESuperTypes().add(this.getPackage());
			this.communicationPathEClass.getESuperTypes().add(this.getAssociation());
			this.continuationEClass.getESuperTypes().add(this.getInteractionFragment());
			this.expansionNodeEClass.getESuperTypes().add(this.getObjectNode());
			this.expansionRegionEClass.getESuperTypes().add(this.getStructuredActivityNode());
			this.literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
			this.literalUnlimitedNaturalEClass.getESuperTypes().add(this.getLiteralSpecification());
			this.literalRealEClass.getESuperTypes().add(this.getLiteralSpecification());
			this.anyReceiveEventEClass.getESuperTypes().add(this.getMessageEvent());
			this.forkNodeEClass.getESuperTypes().add(this.getControlNode());
			this.controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
			this.primitiveTypeEClass.getESuperTypes().add(this.getDataType());
			this.usageEClass.getESuperTypes().add(this.getDependency());
			this.flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
			this.actorEClass.getESuperTypes().add(this.getBehavioredClassifier());
			this.associationClassEClass.getESuperTypes().add(this.getClass_());
			this.associationClassEClass.getESuperTypes().add(this.getAssociation());
			this.deviceEClass.getESuperTypes().add(this.getNode());
			this.mergeNodeEClass.getESuperTypes().add(this.getControlNode());
			this.clearVariableActionEClass.getESuperTypes().add(this.getVariableAction());
			this.modelObjectEClass.getESuperTypes().add(theMDFoundationPackage.getMDObject());
			this.initEClass(this.variableEClass, Variable.class, "Variable", false, false, true);
			this.initEReference(this.getVariable__variableActionOfVariable(), this.getVariableAction(),
					this.getVariableAction_Variable(), "_variableActionOfVariable", (String) null, 0, -1,
					Variable.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getVariable_Scope(), this.getStructuredActivityNode(),
					this.getStructuredActivityNode_Variable(), "scope", (String) null, 0, 1, Variable.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getVariable_ActivityScope(), this.getActivity(), this.getActivity_Variable(),
					"activityScope", (String) null, 0, 1, Variable.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.connectableElementEClass, ConnectableElement.class, "ConnectableElement", true, false,
					true);
			this.initEReference(this.getConnectableElement_End(), this.getConnectorEnd(), this.getConnectorEnd_Role(),
					"end", (String) null, 0, -1, ConnectableElement.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getConnectableElement__structuredClassifierOfRole(),
					this.getStructuredClassifier(), this.getStructuredClassifier_Role(), "_structuredClassifierOfRole",
					(String) null, 0, -1, ConnectableElement.class, true, true, true, false, true, false, true, true,
					false);
			this.initEReference(this.getConnectableElement__collaborationOfCollaborationRole(), this.getCollaboration(),
					this.getCollaboration_CollaborationRole(), "_collaborationOfCollaborationRole", (String) null, 0,
					-1, ConnectableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnectableElement__lifelineOfRepresents(), this.getLifeline(),
					this.getLifeline_Represents(), "_lifelineOfRepresents", (String) null, 0, -1,
					ConnectableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnectableElement_TemplateParameter(),
					this.getConnectableElementTemplateParameter(),
					this.getConnectableElementTemplateParameter_ParameteredElement(),
					"templateParameter__from_ConnectableElement", (String) null, 0, 1, ConnectableElement.class, true,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.typedElementEClass, TypedElement.class, "TypedElement", true, false, true);
			this.initEReference(this.getTypedElement_Type(), this.getType(), this.getType__typedElementOfType(), "type",
					(String) null, 0, 1, TypedElement.class, false, false, true, false, true, false, true, false,
					false);
			this.initEClass(this.namedElementEClass, NamedElement.class, "NamedElement", true, false, true);
			this.initEReference(this.getNamedElement__messageOfSignature(), this.getMessage(),
					this.getMessage_Signature(), "_messageOfSignature", (String) null, 0, -1, NamedElement.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getNamedElement_ClientDependency(), this.getDependency(),
					this.getDependency_Client(), "clientDependency", (String) null, 0, -1, NamedElement.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getNamedElement_SupplierDependency(), this.getDependency(),
					this.getDependency_Supplier(), "supplierDependency", (String) null, 0, -1, NamedElement.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getNamedElement__namespaceOfMember(), this.getNamespace(),
					this.getNamespace_Member(), "_namespaceOfMember", (String) null, 0, -1, NamedElement.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getNamedElement_Namespace(), this.getNamespace(), this.getNamespace_OwnedMember(),
					"namespace", (String) null, 0, 1, NamedElement.class, true, true, true, false, true, false, true,
					true, false);
			this.initEReference(this.getNamedElement__classifierOfInheritedMember(), this.getClassifier(),
					this.getClassifier_InheritedMember(), "_classifierOfInheritedMember", (String) null, 0, -1,
					NamedElement.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getNamedElement__informationFlowOfInformationSource(), this.getInformationFlow(),
					this.getInformationFlow_InformationSource(), "_informationFlowOfInformationSource", (String) null,
					0, -1, NamedElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getNamedElement__informationFlowOfInformationTarget(), this.getInformationFlow(),
					this.getInformationFlow_InformationTarget(), "_informationFlowOfInformationTarget", (String) null,
					0, -1, NamedElement.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getNamedElement_Name(), this.getString(), "name", "", 0, 1, NamedElement.class,
					false, false, true, false, false, true, false, false);
			this.initEReference(this.getNamedElement_NameExpression(), this.getStringExpression(),
					this.getStringExpression__namedElementOfNameExpression(), "nameExpression", (String) null, 0, 1,
					NamedElement.class, false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getNamedElement_QualifiedName(), this.getString(), "qualifiedName", "", 0, 1,
					NamedElement.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getNamedElement_Visibility(), this.getNamedElementVisibilityKind(), "visibility",
					(String) null, 0, 1, NamedElement.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getNamedElement__considerIgnoreFragmentOfMessage(),
					this.getConsiderIgnoreFragment(), this.getConsiderIgnoreFragment_Message(),
					"_considerIgnoreFragmentOfMessage", (String) null, 0, -1, NamedElement.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getNamedElement__timeObservationOfEvent(), this.getTimeObservation(),
					this.getTimeObservation_Event(), "_timeObservationOfEvent", (String) null, 0, -1,
					NamedElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getNamedElement__durationObservationOfEvent(), this.getDurationObservation(),
					this.getDurationObservation_Event(), "_durationObservationOfEvent", (String) null, 0, -1,
					NamedElement.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.elementEClass, Element.class, "Element", true, false, true);
			this.initEReference(this.getElement_OwnedComment(), this.getComment(), this.getComment_OwningElement(),
					"ownedComment", (String) null, 0, -1, Element.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getElement__commentOfAnnotatedElement(), this.getComment(),
					this.getComment_AnnotatedElement(), "_commentOfAnnotatedElement", (String) null, 0, -1,
					Element.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getElement_OwnedElement(), this.getElement(), this.getElement_Owner(),
					"ownedElement", (String) null, 0, -1, Element.class, true, true, true, false, true, false, true,
					true, false);
			this.initEReference(this.getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner",
					(String) null, 0, 1, Element.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getElement_SyncElement(), this.getElement(),
					this.getElement__elementOfSyncElement(), "syncElement", (String) null, 0, 1, Element.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getElement__elementOfSyncElement(), this.getElement(),
					this.getElement_SyncElement(), "_elementOfSyncElement", (String) null, 0, -1, Element.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getElement_AppliedStereotypeInstance(), this.getInstanceSpecification(),
					this.getInstanceSpecification_StereotypedElement(), "appliedStereotypeInstance", (String) null, 0,
					1, Element.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getElement__relationshipOfRelatedElement(), this.getRelationship(),
					this.getRelationship_RelatedElement(), "_relationshipOfRelatedElement", (String) null, 0, -1,
					Element.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getElement__activityPartitionOfRepresents(), this.getActivityPartition(),
					this.getActivityPartition_Represents(), "_activityPartitionOfRepresents", (String) null, 0, -1,
					Element.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getElement__constraintOfConstrainedElement(), this.getConstraint(),
					this.getConstraint_ConstrainedElement(), "_constraintOfConstrainedElement", (String) null, 0, -1,
					Element.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getElement__diagramOfContext(), this.getDiagram(), this.getDiagram_Context(),
					"_diagramOfContext", (String) null, 0, -1, Element.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getElement__directedRelationshipOfSource(), this.getDirectedRelationship(),
					this.getDirectedRelationship_Source(), "_directedRelationshipOfSource", (String) null, 0, -1,
					Element.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getElement__directedRelationshipOfTarget(), this.getDirectedRelationship(),
					this.getDirectedRelationship_Target(), "_directedRelationshipOfTarget", (String) null, 0, -1,
					Element.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getElement__elementValueOfElement(), this.getElementValue(),
					this.getElementValue_Element(), "_elementValueOfElement", (String) null, 0, -1, Element.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.commentEClass, Comment.class, "Comment", false, false, true);
			this.initEReference(this.getComment_AnnotatedElement(), this.getElement(),
					this.getElement__commentOfAnnotatedElement(), "annotatedElement", (String) null, 0, -1,
					Comment.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getComment_Body(), this.getString(), "body", "", 0, 1, Comment.class, false, false,
					true, false, false, true, false, false);
			this.initEReference(this.getComment_OwningElement(), this.getElement(), this.getElement_OwnedComment(),
					"owningElement", (String) null, 0, 1, Comment.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.instanceSpecificationEClass, InstanceSpecification.class, "InstanceSpecification",
					false, false, true);
			this.initEReference(this.getInstanceSpecification_Slot(), this.getSlot(), this.getSlot_OwningInstance(),
					"slot", (String) null, 0, -1, InstanceSpecification.class, false, false, true, true, true, false,
					true, false, false);
			this.initEReference(this.getInstanceSpecification_Specification(), this.getValueSpecification(),
					this.getValueSpecification_OwningInstanceSpec(), "specification", (String) null, 0, 1,
					InstanceSpecification.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInstanceSpecification_Classifier(), this.getClassifier(),
					this.getClassifier__instanceSpecificationOfClassifier(), "classifier", (String) null, 0, -1,
					InstanceSpecification.class, false, false, true, false, true, false, true, false, true);
			this.initEReference(this.getInstanceSpecification__instanceValueOfInstance(), this.getInstanceValue(),
					this.getInstanceValue_Instance(), "_instanceValueOfInstance", (String) null, 0, -1,
					InstanceSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInstanceSpecification_StereotypedElement(), this.getElement(),
					this.getElement_AppliedStereotypeInstance(), "stereotypedElement", (String) null, 0, 1,
					InstanceSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.deploymentTargetEClass, DeploymentTarget.class, "DeploymentTarget", true, false, true);
			this.initEReference(this.getDeploymentTarget_DeployedElement(), this.getPackageableElement(),
					this.getPackageableElement__deploymentTargetOfDeployedElement(), "deployedElement", (String) null,
					0, -1, DeploymentTarget.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getDeploymentTarget_Deployment(), this.getDeployment(),
					this.getDeployment_Location(), "deployment", (String) null, 0, -1, DeploymentTarget.class, false,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.packageableElementEClass, PackageableElement.class, "PackageableElement", true, false,
					true);
			this.initEReference(this.getPackageableElement__elementImportOfImportedElement(), this.getElementImport(),
					this.getElementImport_ImportedElement(), "_elementImportOfImportedElement", (String) null, 0, -1,
					PackageableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackageableElement__componentOfPackagedElement(), this.getComponent(),
					this.getComponent_PackagedElement(), "_componentOfPackagedElement", (String) null, 0, 1,
					PackageableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackageableElement__manifestationOfUtilizedElement(), this.getManifestation(),
					this.getManifestation_UtilizedElement(), "_manifestationOfUtilizedElement", (String) null, 0, -1,
					PackageableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackageableElement_OwningPackage(), this.getPackage(),
					this.getPackage_PackagedElement(), "owningPackage", (String) null, 0, 1, PackageableElement.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackageableElement__namespaceOfImportedMember(), this.getNamespace(),
					this.getNamespace_ImportedMember(), "_namespaceOfImportedMember", (String) null, 0, -1,
					PackageableElement.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getPackageableElement__deploymentTargetOfDeployedElement(),
					this.getDeploymentTarget(), this.getDeploymentTarget_DeployedElement(),
					"_deploymentTargetOfDeployedElement", (String) null, 0, -1, PackageableElement.class, true, true,
					false, false, true, false, true, true, false);
			this.initEAttribute(this.getPackageableElement_Visibility(), this.getVisibilityKind(),
					"visibility__from_PackageableElement", "public", 0, 1, PackageableElement.class, true, false, true,
					false, false, true, false, false);
			this.initEClass(this.parameterableElementEClass, ParameterableElement.class, "ParameterableElement", true,
					false, true);
			this.initEReference(this.getParameterableElement_OwningTemplateParameter(), this.getTemplateParameter(),
					this.getTemplateParameter_OwnedParameteredElement(), "owningTemplateParameter", (String) null, 0, 1,
					ParameterableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameterableElement__templateParameterOfDefault(), this.getTemplateParameter(),
					this.getTemplateParameter_Default(), "_templateParameterOfDefault", (String) null, 0, -1,
					ParameterableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameterableElement__templateParameterOfOwnedDefault(),
					this.getTemplateParameter(), this.getTemplateParameter_OwnedDefault(),
					"_templateParameterOfOwnedDefault", (String) null, 0, 1, ParameterableElement.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getParameterableElement_TemplateParameter(), this.getTemplateParameter(),
					this.getTemplateParameter_ParameteredElement(), "templateParameter", (String) null, 0, 1,
					ParameterableElement.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameterableElement__templateParameterSubstitutionOfActual(),
					this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_Actual(),
					"_templateParameterSubstitutionOfActual", (String) null, 0, -1, ParameterableElement.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameterableElement__templateParameterSubstitutionOfOwnedActual(),
					this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_OwnedActual(),
					"_templateParameterSubstitutionOfOwnedActual", (String) null, 0, 1, ParameterableElement.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.templateParameterEClass, TemplateParameter.class, "TemplateParameter", false, false,
					true);
			this.initEReference(this.getTemplateParameter_Default(), this.getParameterableElement(),
					this.getParameterableElement__templateParameterOfDefault(), "default", (String) null, 0, 1,
					TemplateParameter.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameter_OwnedDefault(), this.getParameterableElement(),
					this.getParameterableElement__templateParameterOfOwnedDefault(), "ownedDefault", (String) null, 0,
					1, TemplateParameter.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getTemplateParameter_ParameteredElement(), this.getParameterableElement(),
					this.getParameterableElement_TemplateParameter(), "parameteredElement", (String) null, 1, 1,
					TemplateParameter.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameter_Signature(), this.getTemplateSignature(),
					this.getTemplateSignature_OwnedParameter(), "signature", (String) null, 1, 1,
					TemplateParameter.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameter__templateSignatureOfParameter(), this.getTemplateSignature(),
					this.getTemplateSignature_Parameter(), "_templateSignatureOfParameter", (String) null, 0, -1,
					TemplateParameter.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameter__redefinableTemplateSignatureOfInheritedParameter(),
					this.getRedefinableTemplateSignature(), this.getRedefinableTemplateSignature_InheritedParameter(),
					"_redefinableTemplateSignatureOfInheritedParameter", (String) null, 0, -1, TemplateParameter.class,
					true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getTemplateParameter__templateParameterSubstitutionOfFormal(),
					this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_Formal(),
					"_templateParameterSubstitutionOfFormal", (String) null, 0, -1, TemplateParameter.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameter_OwnedParameteredElement(), this.getParameterableElement(),
					this.getParameterableElement_OwningTemplateParameter(), "ownedParameteredElement", (String) null, 0,
					1, TemplateParameter.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.templateSignatureEClass, TemplateSignature.class, "TemplateSignature", false, false,
					true);
			this.initEReference(this.getTemplateSignature_Parameter(), this.getTemplateParameter(),
					this.getTemplateParameter__templateSignatureOfParameter(), "parameter", (String) null, 1, -1,
					TemplateSignature.class, false, false, true, false, true, false, true, false, true);
			this.initEReference(this.getTemplateSignature_Template(), this.getTemplateableElement(),
					this.getTemplateableElement_OwnedTemplateSignature(), "template", (String) null, 1, 1,
					TemplateSignature.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateSignature__templateBindingOfSignature(), this.getTemplateBinding(),
					this.getTemplateBinding_Signature(), "_templateBindingOfSignature", (String) null, 0, -1,
					TemplateSignature.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateSignature_OwnedParameter(), this.getTemplateParameter(),
					this.getTemplateParameter_Signature(), "ownedParameter", (String) null, 0, -1,
					TemplateSignature.class, false, false, true, true, true, false, true, false, true);
			this.initEClass(this.templateableElementEClass, TemplateableElement.class, "TemplateableElement", true,
					false, true);
			this.initEReference(this.getTemplateableElement_TemplateBinding(), this.getTemplateBinding(),
					this.getTemplateBinding_BoundElement(), "templateBinding", (String) null, 0, -1,
					TemplateableElement.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(),
					this.getTemplateSignature_Template(), "ownedTemplateSignature", (String) null, 0, 1,
					TemplateableElement.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.templateBindingEClass, TemplateBinding.class, "TemplateBinding", false, false, true);
			this.initEReference(this.getTemplateBinding_ParameterSubstitution(),
					this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(),
					"parameterSubstitution", (String) null, 0, -1, TemplateBinding.class, false, false, true, true,
					true, false, true, false, false);
			this.initEReference(this.getTemplateBinding_Signature(), this.getTemplateSignature(),
					this.getTemplateSignature__templateBindingOfSignature(), "signature", (String) null, 1, 1,
					TemplateBinding.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateBinding_BoundElement(), this.getTemplateableElement(),
					this.getTemplateableElement_TemplateBinding(), "boundElement", (String) null, 1, 1,
					TemplateBinding.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", true,
					false, true);
			this.initEReference(this.getDirectedRelationship_Source(), this.getElement(),
					this.getElement__directedRelationshipOfSource(), "source", (String) null, 1, -1,
					DirectedRelationship.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getDirectedRelationship_Target(), this.getElement(),
					this.getElement__directedRelationshipOfTarget(), "target", (String) null, 1, -1,
					DirectedRelationship.class, true, true, true, false, true, false, true, true, false);
			this.initEClass(this.relationshipEClass, Relationship.class, "Relationship", true, false, true);
			this.initEReference(this.getRelationship_RelatedElement(), this.getElement(),
					this.getElement__relationshipOfRelatedElement(), "relatedElement", (String) null, 1, -1,
					Relationship.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getRelationship__abstraction(), this.getInformationFlow(),
					this.getInformationFlow_Realization(), "_abstraction", (String) null, 0, -1, Relationship.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.informationFlowEClass, InformationFlow.class, "InformationFlow", false, false, true);
			this.initEReference(this.getInformationFlow_Conveyed(), this.getClassifier(),
					this.getClassifier__informationFlowOfConveyed(), "conveyed", (String) null, 1, -1,
					InformationFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInformationFlow_RealizingMessage(), this.getMessage(),
					this.getMessage__informationFlowOfRealizingMessage(), "realizingMessage", (String) null, 0, -1,
					InformationFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInformationFlow_RealizingConnector(), this.getConnector(),
					this.getConnector__informationFlowOfRealizingConnector(), "realizingConnector", (String) null, 0,
					-1, InformationFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInformationFlow_RealizingActivityEdge(), this.getActivityEdge(),
					this.getActivityEdge__informationFlowOfRealizingActivityEdge(), "realizingActivityEdge",
					(String) null, 0, -1, InformationFlow.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getInformationFlow_InformationSource(), this.getNamedElement(),
					this.getNamedElement__informationFlowOfInformationSource(), "informationSource", (String) null, 1,
					-1, InformationFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInformationFlow_InformationTarget(), this.getNamedElement(),
					this.getNamedElement__informationFlowOfInformationTarget(), "informationTarget", (String) null, 1,
					-1, InformationFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInformationFlow_Realization(), this.getRelationship(),
					this.getRelationship__abstraction(), "realization", (String) null, 0, -1, InformationFlow.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.classifierEClass, Classifier.class, "Classifier", true, false, true);
			this.initEReference(this.getClassifier__redefinableElementOfRedefinitionContext(),
					this.getRedefinableElement(), this.getRedefinableElement_RedefinitionContext(),
					"_redefinableElementOfRedefinitionContext", (String) null, 0, -1, Classifier.class, true, true,
					true, false, true, false, true, true, false);
			this.initEReference(this.getClassifier__regionOfRedefinitionContext(), this.getRegion(),
					this.getRegion_RedefinitionContext(), "_regionOfRedefinitionContext", (String) null, 0, -1,
					Classifier.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getClassifier_UseCase(), this.getUseCase(), this.getUseCase_Subject(), "useCase",
					(String) null, 0, -1, Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_OwnedUseCase(), this.getUseCase(),
					this.getUseCase__classifierOfOwnedUseCase(), "ownedUseCase", (String) null, 0, -1, Classifier.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(),
					"feature", (String) null, 0, -1, Classifier.class, true, true, true, false, true, false, true, true,
					false);
			this.initEReference(this.getClassifier__interfaceOfNestedClassifier(), this.getInterface(),
					this.getInterface_NestedClassifier(), "_interfaceOfNestedClassifier", (String) null, 0, 1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__readExtentActionOfClassifier(), this.getReadExtentAction(),
					this.getReadExtentAction_Classifier(), "_readExtentActionOfClassifier", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__createObjectActionOfClassifier(), this.getCreateObjectAction(),
					this.getCreateObjectAction_Classifier(), "_createObjectActionOfClassifier", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__unmarshallActionOfUnmarshallType(), this.getUnmarshallAction(),
					this.getUnmarshallAction_UnmarshallType(), "_unmarshallActionOfUnmarshallType", (String) null, 0,
					-1, Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__readIsClassifiedObjectActionOfClassifier(),
					this.getReadIsClassifiedObjectAction(), this.getReadIsClassifiedObjectAction_Classifier(),
					"_readIsClassifiedObjectActionOfClassifier", (String) null, 0, -1, Classifier.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_Representation(), this.getCollaborationUse(),
					this.getCollaborationUse__classifierOfRepresentation(), "representation", (String) null, 0, 1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_CollaborationUse(), this.getCollaborationUse(),
					this.getCollaborationUse__classifierOfCollaborationUse(), "collaborationUse", (String) null, 0, -1,
					Classifier.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getClassifier__componentRealizationOfRealizingClassifier(),
					this.getComponentRealization(), this.getComponentRealization_RealizingClassifier(),
					"_componentRealizationOfRealizingClassifier", (String) null, 0, -1, Classifier.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_Attribute(), this.getProperty(), this.getProperty_Classifier(),
					"attribute", (String) null, 0, -1, Classifier.class, true, true, true, false, true, false, true,
					true, true);
			this.initEReference(this.getClassifier__transitionOfRedefinitionContext(), this.getTransition(),
					this.getTransition_RedefinitionContext(), "_transitionOfRedefinitionContext", (String) null, 0, -1,
					Classifier.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getClassifier__vertexOfRedefinitionContext(), this.getVertex(),
					this.getVertex_RedefinitionContext(), "_vertexOfRedefinitionContext", (String) null, 0, -1,
					Classifier.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getClassifier__exceptionHandlerOfExceptionType(), this.getExceptionHandler(),
					this.getExceptionHandler_ExceptionType(), "_exceptionHandlerOfExceptionType", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__reclassifyObjectActionOfNewClassifier(),
					this.getReclassifyObjectAction(), this.getReclassifyObjectAction_NewClassifier(),
					"_reclassifyObjectActionOfNewClassifier", (String) null, 0, -1, Classifier.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__reclassifyObjectActionOfOldClassifier(),
					this.getReclassifyObjectAction(), this.getReclassifyObjectAction_OldClassifier(),
					"_reclassifyObjectActionOfOldClassifier", (String) null, 0, -1, Classifier.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__actionOfContext(), this.getAction(), this.getAction_Context(),
					"_actionOfContext", (String) null, 0, -1, Classifier.class, true, true, false, false, true, false,
					true, true, false);
			this.initEReference(this.getClassifier_UMLClass(), this.getClass_(), this.getClass_NestedClassifier(),
					"UMLClass", (String) null, 0, 1, Classifier.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getClassifier_General(), this.getClassifier(),
					this.getClassifier__classifierOfGeneral(), "general", (String) null, 0, -1, Classifier.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getClassifier__classifierOfGeneral(), this.getClassifier(),
					this.getClassifier_General(), "_classifierOfGeneral", (String) null, 0, -1, Classifier.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getClassifier_Generalization(), this.getGeneralization(),
					this.getGeneralization_Specific(), "generalization", (String) null, 0, -1, Classifier.class, false,
					false, true, true, true, false, true, false, false);
			this.initEReference(this.getClassifier__generalizationOfGeneral(), this.getGeneralization(),
					this.getGeneralization_General(), "_generalizationOfGeneral", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_PowertypeExtent(), this.getGeneralizationSet(),
					this.getGeneralizationSet_Powertype(), "powertypeExtent", (String) null, 0, -1, Classifier.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_InheritedMember(), this.getNamedElement(),
					this.getNamedElement__classifierOfInheritedMember(), "inheritedMember", (String) null, 0, -1,
					Classifier.class, true, true, false, false, true, false, true, true, false);
			this.initEAttribute(this.getClassifier_Abstract(), this.getBoolean(), "isAbstract", "false", 1, 1,
					Classifier.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getClassifier_FinalSpecialization(), this.getBoolean(), "isFinalSpecialization",
					"false", 1, 1, Classifier.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getClassifier_RedefinedClassifier(), this.getClassifier(),
					this.getClassifier__classifierOfRedefinedClassifier(), "redefinedClassifier", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__classifierOfRedefinedClassifier(), this.getClassifier(),
					this.getClassifier_RedefinedClassifier(), "_classifierOfRedefinedClassifier", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_Substitution(), this.getSubstitution(),
					this.getSubstitution_SubstitutingClassifier(), "substitution", (String) null, 0, -1,
					Classifier.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getClassifier__substitutionOfContract(), this.getSubstitution(),
					this.getSubstitution_Contract(), "_substitutionOfContract", (String) null, 0, -1, Classifier.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__classifierTemplateParameterOfConstrainingClassifier(),
					this.getClassifierTemplateParameter(), this.getClassifierTemplateParameter_ConstrainingClassifier(),
					"_classifierTemplateParameterOfConstrainingClassifier", (String) null, 0, -1, Classifier.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__informationItemOfRepresented(), this.getInformationItem(),
					this.getInformationItem_Represented(), "_informationItemOfRepresented", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier__instanceSpecificationOfClassifier(),
					this.getInstanceSpecification(), this.getInstanceSpecification_Classifier(),
					"_instanceSpecificationOfClassifier", (String) null, 0, -1, Classifier.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getClassifier__informationFlowOfConveyed(), this.getInformationFlow(),
					this.getInformationFlow_Conveyed(), "_informationFlowOfConveyed", (String) null, 0, -1,
					Classifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getClassifier_OwnedTemplateSignature(), this.getRedefinableTemplateSignature(),
					this.getRedefinableTemplateSignature_Classifier(), "ownedTemplateSignature__from_Classifier",
					(String) null, 0, 1, Classifier.class, true, false, true, true, true, false, true, false, false);
			this.initEReference(this.getClassifier_TemplateParameter(), this.getClassifierTemplateParameter(),
					this.getClassifierTemplateParameter_ParameteredElement(), "templateParameter__from_Classifier",
					(String) null, 0, 1, Classifier.class, true, false, true, false, true, false, true, false, false);
			this.initEClass(this.namespaceEClass, Namespace.class, "Namespace", true, false, true);
			this.initEReference(this.getNamespace_ElementImport(), this.getElementImport(),
					this.getElementImport_ImportingNamespace(), "elementImport", (String) null, 0, -1, Namespace.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getNamespace_OwnedRule(), this.getConstraint(), this.getConstraint_Context(),
					"ownedRule", (String) null, 0, -1, Namespace.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getNamespace_PackageImport(), this.getPackageImport(),
					this.getPackageImport_ImportingNamespace(), "packageImport", (String) null, 0, -1, Namespace.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getNamespace_ImportedMember(), this.getPackageableElement(),
					this.getPackageableElement__namespaceOfImportedMember(), "importedMember", (String) null, 0, -1,
					Namespace.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getNamespace_Member(), this.getNamedElement(),
					this.getNamedElement__namespaceOfMember(), "member", (String) null, 0, -1, Namespace.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getNamespace_OwnedMember(), this.getNamedElement(),
					this.getNamedElement_Namespace(), "ownedMember", (String) null, 0, -1, Namespace.class, true, true,
					true, false, true, false, true, true, false);
			this.initEReference(this.getNamespace_OwnedDiagram(), this.getDiagram(), this.getDiagram_OwnerOfDiagram(),
					"ownedDiagram", (String) null, 0, -1, Namespace.class, false, false, true, true, true, false, true,
					false, false);
			this.initEClass(this.elementImportEClass, ElementImport.class, "ElementImport", false, false, true);
			this.initEAttribute(this.getElementImport_Alias(), this.getString(), "alias", "", 0, 1, ElementImport.class,
					false, false, true, false, false, true, false, false);
			this.initEReference(this.getElementImport_ImportedElement(), this.getPackageableElement(),
					this.getPackageableElement__elementImportOfImportedElement(), "importedElement", (String) null, 1,
					1, ElementImport.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getElementImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1,
					1, ElementImport.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getElementImport__profileOfMetaclassReference(), this.getProfile(),
					this.getProfile_MetaclassReference(), "_profileOfMetaclassReference", (String) null, 0, 1,
					ElementImport.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getElementImport_ImportingNamespace(), this.getNamespace(),
					this.getNamespace_ElementImport(), "importingNamespace", (String) null, 1, 1, ElementImport.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.profileEClass, Profile.class, "Profile", false, false, true);
			this.initEReference(this.getProfile__stereotypeOfProfile(), this.getStereotype(),
					this.getStereotype_Profile(), "_stereotypeOfProfile", (String) null, 0, -1, Profile.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getProfile__profileApplicationOfAppliedProfile(), this.getProfileApplication(),
					this.getProfileApplication_AppliedProfile(), "_profileApplicationOfAppliedProfile", (String) null,
					0, -1, Profile.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProfile_MetamodelReference(), this.getPackageImport(),
					this.getPackageImport__profileOfMetamodelReference(), "metamodelReference", (String) null, 0, -1,
					Profile.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProfile_MetaclassReference(), this.getElementImport(),
					this.getElementImport__profileOfMetaclassReference(), "metaclassReference", (String) null, 0, -1,
					Profile.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.packageEClass, Package.class, "Package", false, false, true);
			this.initEAttribute(this.getPackage_URI(), this.getString(), "URI", "", 0, 1, Package.class, false, false,
					true, false, false, true, false, false);
			this.initEReference(this.getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(),
					"nestedPackage", (String) null, 0, -1, Package.class, true, true, false, false, true, false, true,
					true, false);
			this.initEReference(this.getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(),
					"nestingPackage", (String) null, 0, 1, Package.class, true, true, false, false, true, false, true,
					true, false);
			this.initEReference(this.getPackage_OwnedStereotype(), this.getStereotype(),
					this.getStereotype__packageOfOwnedStereotype(), "ownedStereotype", (String) null, 0, -1,
					Package.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getPackage_OwnedType(), this.getType(), this.getType_Package(), "ownedType",
					(String) null, 0, -1, Package.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getPackage_PackageMerge(), this.getPackageMerge(),
					this.getPackageMerge_ReceivingPackage(), "packageMerge", (String) null, 0, -1, Package.class, false,
					false, true, true, true, false, true, false, false);
			this.initEReference(this.getPackage__packageMergeOfMergedPackage(), this.getPackageMerge(),
					this.getPackageMerge_MergedPackage(), "_packageMergeOfMergedPackage", (String) null, 0, -1,
					Package.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackage_PackagedElement(), this.getPackageableElement(),
					this.getPackageableElement_OwningPackage(), "packagedElement", (String) null, 0, -1, Package.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getPackage_ProfileApplication(), this.getProfileApplication(),
					this.getProfileApplication_ApplyingPackage(), "profileApplication", (String) null, 0, -1,
					Package.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getPackage__packageImportOfImportedPackage(), this.getPackageImport(),
					this.getPackageImport_ImportedPackage(), "_packageImportOfImportedPackage", (String) null, 0, -1,
					Package.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.stereotypeEClass, Stereotype.class, "Stereotype", false, false, true);
			this.initEReference(this.getStereotype__extensionEndOfType(), this.getExtensionEnd(),
					this.getExtensionEnd_Type(), "_extensionEndOfType", (String) null, 0, -1, Stereotype.class, false,
					true, true, false, true, false, true, false, false);
			this.initEReference(this.getStereotype_Icon(), this.getImage(), this.getImage__stereotypeOfIcon(), "icon",
					(String) null, 0, -1, Stereotype.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStereotype_Profile(), this.getProfile(), this.getProfile__stereotypeOfProfile(),
					"profile", (String) null, 1, 1, Stereotype.class, true, true, false, false, true, false, true, true,
					false);
			this.initEReference(this.getStereotype__packageOfOwnedStereotype(), this.getPackage(),
					this.getPackage_OwnedStereotype(), "_packageOfOwnedStereotype", (String) null, 1, 1,
					Stereotype.class, true, true, false, false, true, false, true, true, false);
			this.initEClass(this.classEClass, Class.class, "Class", false, false, true);
			this.initEReference(this.getClass_OwnedReception(), this.getReception(),
					this.getReception__classOfOwnedReception(), "ownedReception", (String) null, 0, -1, Class.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getClass_OwnedOperation(), this.getOperation(), this.getOperation_UMLClass(),
					"ownedOperation", (String) null, 0, -1, Class.class, false, false, true, true, true, false, true,
					false, true);
			this.initEReference(this.getClass_Extension(), this.getExtension(), this.getExtension_Metaclass(),
					"extension", (String) null, 0, -1, Class.class, true, true, false, false, true, false, true, true,
					false);
			this.initEAttribute(this.getClass_Active(), this.getBoolean(), "isActive", "false", 1, 1, Class.class,
					false, false, true, false, false, true, false, false);
			this.initEReference(this.getClass_NestedClassifier(), this.getClassifier(), this.getClassifier_UMLClass(),
					"nestedClassifier", (String) null, 0, -1, Class.class, false, false, true, true, true, false, true,
					false, true);
			this.initEReference(this.getClass_SuperClass(), this.getClass_(), this.getClass__classOfSuperClass(),
					"superClass", (String) null, 0, -1, Class.class, true, true, false, false, true, false, true, true,
					false);
			this.initEReference(this.getClass__classOfSuperClass(), this.getClass_(), this.getClass_SuperClass(),
					"_classOfSuperClass", (String) null, 0, -1, Class.class, true, true, false, false, true, false,
					true, true, false);
			this.initEReference(this.getClass_OwnedAttribute(), this.getProperty(), this.getProperty_UMLClass(),
					"ownedAttribute__from_Class", (String) null, 0, -1, Class.class, true, false, true, true, true,
					false, true, false, true);
			this.initEAttribute(this.getClass_Abstract(), this.getBoolean(), "isAbstract__from_Class", "false", 1, 1,
					Class.class, true, false, true, false, false, true, false, false);
			this.initEClass(this.behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", true,
					false, true);
			this.initEReference(this.getBehavioredClassifier_ClassifierBehavior(), this.getBehavior(),
					this.getBehavior__behavioredClassifierOfClassifierBehavior(), "classifierBehavior", (String) null,
					0, 1, BehavioredClassifier.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavioredClassifier__behaviorOfContext(), this.getBehavior(),
					this.getBehavior_Context(), "_behaviorOfContext", (String) null, 0, -1, BehavioredClassifier.class,
					true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getBehavioredClassifier_InterfaceRealization(), this.getInterfaceRealization(),
					this.getInterfaceRealization_ImplementingClassifier(), "interfaceRealization", (String) null, 0, -1,
					BehavioredClassifier.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getBehavioredClassifier_OwnedBehavior(), this.getBehavior(),
					this.getBehavior__behavioredClassifierOfOwnedBehavior(), "ownedBehavior", (String) null, 0, -1,
					BehavioredClassifier.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.behaviorEClass, Behavior.class, "Behavior", true, false, true);
			this.initEReference(this.getBehavior_Context(), this.getBehavioredClassifier(),
					this.getBehavioredClassifier__behaviorOfContext(), "context", (String) null, 0, 1, Behavior.class,
					true, true, false, false, true, false, true, true, false);
			this.initEAttribute(this.getBehavior_Reentrant(), this.getBoolean(), "isReentrant", "true", 1, 1,
					Behavior.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getBehavior_OwnedParameter(), this.getParameter(),
					this.getParameter__behaviorOfOwnedParameter(), "ownedParameter", (String) null, 0, -1,
					Behavior.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getBehavior__transitionOfEffect(), this.getTransition(),
					this.getTransition_Effect(), "_transitionOfEffect", (String) null, 0, 1, Behavior.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior_Specification(), this.getBehavioralFeature(),
					this.getBehavioralFeature_Method(), "specification", (String) null, 0, 1, Behavior.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior_OwnedParameterSet(), this.getParameterSet(),
					this.getParameterSet__behaviorOfOwnedParameterSet(), "ownedParameterSet", (String) null, 0, -1,
					Behavior.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getBehavior__connectorOfContract(), this.getConnector(),
					this.getConnector_Contract(), "_connectorOfContract", (String) null, 0, -1, Behavior.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__reduceActionOfReducer(), this.getReduceAction(),
					this.getReduceAction_Reducer(), "_reduceActionOfReducer", (String) null, 0, -1, Behavior.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior_Event(), this.getEvent(), this.getEvent_Behavior(), "event",
					(String) null, 0, -1, Behavior.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getBehavior__opaqueExpressionOfBehavior(), this.getOpaqueExpression(),
					this.getOpaqueExpression_Behavior(), "_opaqueExpressionOfBehavior", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior_Postcondition(), this.getConstraint(),
					this.getConstraint__behaviorOfPostcondition(), "postcondition", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior_Precondition(), this.getConstraint(),
					this.getConstraint__behaviorOfPrecondition(), "precondition", (String) null, 0, -1, Behavior.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__stateOfDoActivity(), this.getState(), this.getState_DoActivity(),
					"_stateOfDoActivity", (String) null, 0, 1, Behavior.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getBehavior__stateOfEntry(), this.getState(), this.getState_Entry(),
					"_stateOfEntry", (String) null, 0, 1, Behavior.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getBehavior__stateOfExit(), this.getState(), this.getState_Exit(), "_stateOfExit",
					(String) null, 0, 1, Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__objectNodeOfSelection(), this.getObjectNode(),
					this.getObjectNode_Selection(), "_objectNodeOfSelection", (String) null, 0, -1, Behavior.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior_Observation(), this.getObservation(), this.getObservation_Behavior(),
					"observation", (String) null, 0, -1, Behavior.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getBehavior_RedefinedBehavior(), this.getBehavior(),
					this.getBehavior__behaviorOfRedefinedBehavior(), "redefinedBehavior", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__behaviorOfRedefinedBehavior(), this.getBehavior(),
					this.getBehavior_RedefinedBehavior(), "_behaviorOfRedefinedBehavior", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__objectFlowOfTransformation(), this.getObjectFlow(),
					this.getObjectFlow_Transformation(), "_objectFlowOfTransformation", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__objectFlowOfSelection(), this.getObjectFlow(),
					this.getObjectFlow_Selection(), "_objectFlowOfSelection", (String) null, 0, -1, Behavior.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__decisionNodeOfDecisionInput(), this.getDecisionNode(),
					this.getDecisionNode_DecisionInput(), "_decisionNodeOfDecisionInput", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__behaviorExecutionSpecificationOfBehavior(),
					this.getBehaviorExecutionSpecification(), this.getBehaviorExecutionSpecification_Behavior(),
					"_behaviorExecutionSpecificationOfBehavior", (String) null, 0, -1, Behavior.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__behavioredClassifierOfOwnedBehavior(), this.getBehavioredClassifier(),
					this.getBehavioredClassifier_OwnedBehavior(), "_behavioredClassifierOfOwnedBehavior", (String) null,
					0, 1, Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__callBehaviorActionOfBehavior(), this.getCallBehaviorAction(),
					this.getCallBehaviorAction_Behavior(), "_callBehaviorActionOfBehavior", (String) null, 0, -1,
					Behavior.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavior__behavioredClassifierOfClassifierBehavior(),
					this.getBehavioredClassifier(), this.getBehavioredClassifier_ClassifierBehavior(),
					"_behavioredClassifierOfClassifierBehavior", (String) null, 0, 1, Behavior.class, false, false,
					true, false, true, false, true, false, false);
			this.initEClass(this.parameterEClass, Parameter.class, "Parameter", false, false, true);
			this.initEReference(this.getParameter_OwnerFormalParam(), this.getBehavioralFeature(),
					this.getBehavioralFeature_OwnedParameter(), "ownerFormalParam", (String) null, 0, 1,
					Parameter.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameter_ParameterSet(), this.getParameterSet(),
					this.getParameterSet_Parameter(), "parameterSet", (String) null, 0, -1, Parameter.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameter__opaqueExpressionOfResult(), this.getOpaqueExpression(),
					this.getOpaqueExpression_Result(), "_opaqueExpressionOfResult", (String) null, 0, -1,
					Parameter.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getParameter_Operation(), this.getOperation(), this.getOperation_OwnedParameter(),
					"operation", (String) null, 0, 1, Parameter.class, true, true, true, false, true, false, true,
					false, false);
			this.initEReference(this.getParameter_DefaultValue(), this.getValueSpecification(),
					this.getValueSpecification_OwningParameter(), "defaultValue", (String) null, 0, 1, Parameter.class,
					false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getParameter_Default(), this.getString(), "default", "", 0, 1, Parameter.class,
					true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getParameter_Direction(), this.getParameterDirectionKind(), "direction", "in", 1,
					1, Parameter.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getParameter_Effect(), this.getParameterParameterEffectKind(), "effect",
					(String) null, 0, 1, Parameter.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getParameter_Exception(), this.getBoolean(), "isException", "false", 1, 1,
					Parameter.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getParameter_Stream(), this.getBoolean(), "isStream", "false", 1, 1,
					Parameter.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getParameter__activityParameterNodeOfParameter(), this.getActivityParameterNode(),
					this.getActivityParameterNode_Parameter(), "_activityParameterNodeOfParameter", (String) null, 0,
					-1, Parameter.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameter__behaviorOfOwnedParameter(), this.getBehavior(),
					this.getBehavior_OwnedParameter(), "_behaviorOfOwnedParameter", (String) null, 0, 1,
					Parameter.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", true,
					false, true);
			this.initEAttribute(this.getMultiplicityElement_Ordered(), this.getBoolean(), "isOrdered", "false", 1, 1,
					MultiplicityElement.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getMultiplicityElement_Unique(), this.getBoolean(), "isUnique", "true", 1, 1,
					MultiplicityElement.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getMultiplicityElement_Lower(), this.getInteger(), "lower", (String) null, 0, 1,
					MultiplicityElement.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getMultiplicityElement_LowerValue(), this.getValueSpecification(),
					this.getValueSpecification_OwningLower(), "lowerValue", (String) null, 0, 1,
					MultiplicityElement.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getMultiplicityElement_UpperValue(), this.getValueSpecification(),
					this.getValueSpecification_OwningUpper(), "upperValue", (String) null, 0, 1,
					MultiplicityElement.class, false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getMultiplicityElement_Upper(), this.getUnlimitedNatural(), "upper", (String) null,
					1, 1, MultiplicityElement.class, true, true, false, false, false, true, true, false);
			this.initEClass(this.valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", true, false,
					true);
			this.initEReference(this.getValueSpecification__lifelineOfSelector(), this.getLifeline(),
					this.getLifeline_Selector(), "_lifelineOfSelector", (String) null, 0, 1, ValueSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__activityEdgeOfGuard(), this.getActivityEdge(),
					this.getActivityEdge_Guard(), "_activityEdgeOfGuard", (String) null, 0, 1, ValueSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification_OwningConstraint(), this.getConstraint(),
					this.getConstraint_Specification(), "owningConstraint", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification_OwningSlot(), this.getSlot(), this.getSlot_Value(),
					"owningSlot", (String) null, 0, 1, ValueSpecification.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getValueSpecification_OwningProperty(), this.getProperty(),
					this.getProperty_DefaultValue(), "owningProperty", (String) null, 0, 1, ValueSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__messageOfArgument(), this.getMessage(),
					this.getMessage_Argument(), "_messageOfArgument", (String) null, 0, 1, ValueSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__messageOfTarget(), this.getMessage(),
					this.getMessage_Target(), "_messageOfTarget", (String) null, 0, 1, ValueSpecification.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__valueSpecificationActionOfValue(),
					this.getValueSpecificationAction(), this.getValueSpecificationAction_Value(),
					"_valueSpecificationActionOfValue", (String) null, 0, 1, ValueSpecification.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__interactionConstraintOfMaxint(),
					this.getInteractionConstraint(), this.getInteractionConstraint_Maxint(),
					"_interactionConstraintOfMaxint", (String) null, 0, 1, ValueSpecification.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__interactionConstraintOfMinint(),
					this.getInteractionConstraint(), this.getInteractionConstraint_Minint(),
					"_interactionConstraintOfMinint", (String) null, 0, 1, ValueSpecification.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__interactionUseOfArgument(), this.getInteractionUse(),
					this.getInteractionUse_Argument(), "_interactionUseOfArgument", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__interactionUseOfReturnValue(), this.getInteractionUse(),
					this.getInteractionUse_ReturnValue(), "_interactionUseOfReturnValue", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__objectNodeOfUpperBound(), this.getObjectNode(),
					this.getObjectNode_UpperBound(), "_objectNodeOfUpperBound", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__activityEdgeOfWeight(), this.getActivityEdge(),
					this.getActivityEdge_Weight(), "_activityEdgeOfWeight", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__valuePinOfValue(), this.getValuePin(),
					this.getValuePin_Value(), "_valuePinOfValue", (String) null, 0, 1, ValueSpecification.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__intervalOfMax(), this.getInterval(), this.getInterval_Max(),
					"_intervalOfMax", (String) null, 0, -1, ValueSpecification.class, false, false, true, false, true,
					false, true, false, false);
			this.initEReference(this.getValueSpecification__intervalOfMin(), this.getInterval(), this.getInterval_Min(),
					"_intervalOfMin", (String) null, 0, -1, ValueSpecification.class, false, false, true, false, true,
					false, true, false, false);
			this.initEReference(this.getValueSpecification_OwningParameter(), this.getParameter(),
					this.getParameter_DefaultValue(), "owningParameter", (String) null, 0, 1, ValueSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__changeEventOfChangeExpression(), this.getChangeEvent(),
					this.getChangeEvent_ChangeExpression(), "_changeEventOfChangeExpression", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__joinNodeOfJoinSpec(), this.getJoinNode(),
					this.getJoinNode_JoinSpec(), "_joinNodeOfJoinSpec", (String) null, 0, 1, ValueSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification_OwningInstanceSpec(), this.getInstanceSpecification(),
					this.getInstanceSpecification_Specification(), "owningInstanceSpec", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification_OwningUpper(), this.getMultiplicityElement(),
					this.getMultiplicityElement_UpperValue(), "owningUpper", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__durationOfExpr(), this.getDuration(),
					this.getDuration_Expr(), "_durationOfExpr", (String) null, 0, 1, ValueSpecification.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification__timeExpressionOfExpr(), this.getTimeExpression(),
					this.getTimeExpression_Expr(), "_timeExpressionOfExpr", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification_Expression(), this.getExpression(),
					this.getExpression_Operand(), "expression", (String) null, 0, 1, ValueSpecification.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getValueSpecification_OwningLower(), this.getMultiplicityElement(),
					this.getMultiplicityElement_LowerValue(), "owningLower", (String) null, 0, 1,
					ValueSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.lifelineEClass, Lifeline.class, "Lifeline", false, false, true);
			this.initEReference(this.getLifeline_CoveredBy(), this.getInteractionFragment(),
					this.getInteractionFragment_Covered(), "coveredBy", (String) null, 0, -1, Lifeline.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getLifeline__stateInvariantOfCovered(), this.getStateInvariant(),
					this.getStateInvariant_Covered(), "_stateInvariantOfCovered", (String) null, 0, -1, Lifeline.class,
					false, true, true, false, true, false, true, false, false);
			this.initEReference(this.getLifeline__occurrenceSpecificationOfCovered(), this.getOccurrenceSpecification(),
					this.getOccurrenceSpecification_Covered(), "_occurrenceSpecificationOfCovered", (String) null, 0,
					-1, Lifeline.class, false, true, true, false, true, false, true, false, true);
			this.initEReference(this.getLifeline_Interaction(), this.getInteraction(), this.getInteraction_Lifeline(),
					"interaction", (String) null, 1, 1, Lifeline.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getLifeline_DecomposedAs(), this.getPartDecomposition(),
					this.getPartDecomposition__lifelineOfDecomposedAs(), "decomposedAs", (String) null, 0, 1,
					Lifeline.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getLifeline_Represents(), this.getConnectableElement(),
					this.getConnectableElement__lifelineOfRepresents(), "represents", (String) null, 0, 1,
					Lifeline.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getLifeline_Selector(), this.getValueSpecification(),
					this.getValueSpecification__lifelineOfSelector(), "selector", (String) null, 0, 1, Lifeline.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", true,
					false, true);
			this.initEReference(this.getInteractionFragment_EnclosingInteraction(), this.getInteraction(),
					this.getInteraction_Fragment(), "enclosingInteraction", (String) null, 0, 1,
					InteractionFragment.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInteractionFragment_EnclosingOperand(), this.getInteractionOperand(),
					this.getInteractionOperand_Fragment(), "enclosingOperand", (String) null, 0, 1,
					InteractionFragment.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInteractionFragment_GeneralOrdering(), this.getGeneralOrdering(),
					this.getGeneralOrdering__interactionFragmentOfGeneralOrdering(), "generalOrdering", (String) null,
					0, -1, InteractionFragment.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(),
					"covered", (String) null, 0, -1, InteractionFragment.class, false, false, true, false, true, false,
					true, false, false);
			this.initEClass(this.interactionEClass, Interaction.class, "Interaction", false, false, true);
			this.initEReference(this.getInteraction_Action(), this.getAction(), this.getAction__interactionOfAction(),
					"action", (String) null, 0, -1, Interaction.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getInteraction_Message(), this.getMessage(), this.getMessage_Interaction(),
					"message", (String) null, 0, -1, Interaction.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getInteraction_FormalGate(), this.getGate(),
					this.getGate__interactionOfFormalGate(), "formalGate", (String) null, 0, -1, Interaction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteraction__interactionUseOfRefersTo(), this.getInteractionUse(),
					this.getInteractionUse_RefersTo(), "_interactionUseOfRefersTo", (String) null, 0, -1,
					Interaction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInteraction_Lifeline(), this.getLifeline(), this.getLifeline_Interaction(),
					"lifeline", (String) null, 0, -1, Interaction.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getInteraction_Fragment(), this.getInteractionFragment(),
					this.getInteractionFragment_EnclosingInteraction(), "fragment", (String) null, 0, -1,
					Interaction.class, false, false, true, true, true, false, true, false, true);
			this.initEClass(this.actionEClass, Action.class, "Action", true, false, true);
			this.initEReference(this.getAction_LocalPostcondition(), this.getConstraint(),
					this.getConstraint__actionOfLocalPostcondition(), "localPostcondition", (String) null, 0, -1,
					Action.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getAction_Output(), this.getOutputPin(), this.getOutputPin__actionOfOutput(),
					"output", (String) null, 0, -1, Action.class, true, true, true, false, true, false, true, true,
					true);
			this.initEReference(this.getAction_LocalPrecondition(), this.getConstraint(),
					this.getConstraint__actionOfLocalPrecondition(), "localPrecondition", (String) null, 0, -1,
					Action.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getAction_Input(), this.getInputPin(), this.getInputPin__actionOfInput(), "input",
					(String) null, 0, -1, Action.class, true, true, true, false, true, false, true, true, true);
			this.initEReference(this.getAction_Context(), this.getClassifier(), this.getClassifier__actionOfContext(),
					"context", (String) null, 0, 1, Action.class, true, true, false, false, true, false, true, true,
					false);
			this.initEAttribute(this.getAction_LocallyReentrant(), this.getBoolean(), "isLocallyReentrant", "false", 1,
					1, Action.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getAction__actionInputPinOfFromAction(), this.getActionInputPin(),
					this.getActionInputPin_FromAction(), "_actionInputPinOfFromAction", (String) null, 0, 1,
					Action.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getAction__actionExecutionSpecificationOfAction(),
					this.getActionExecutionSpecification(), this.getActionExecutionSpecification_Action(),
					"_actionExecutionSpecificationOfAction", (String) null, 0, -1, Action.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getAction__interactionOfAction(), this.getInteraction(),
					this.getInteraction_Action(), "_interactionOfAction", (String) null, 0, 1, Action.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.executableNodeEClass, ExecutableNode.class, "ExecutableNode", true, false, true);
			this.initEReference(this.getExecutableNode__clauseOfBody(), this.getClause(), this.getClause_Body(),
					"_clauseOfBody", (String) null, 0, 1, ExecutableNode.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getExecutableNode__clauseOfTest(), this.getClause(), this.getClause_Test(),
					"_clauseOfTest", (String) null, 0, 1, ExecutableNode.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getExecutableNode__loopNodeOfBodyPart(), this.getLoopNode(),
					this.getLoopNode_BodyPart(), "_loopNodeOfBodyPart", (String) null, 0, 1, ExecutableNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExecutableNode__loopNodeOfSetupPart(), this.getLoopNode(),
					this.getLoopNode_SetupPart(), "_loopNodeOfSetupPart", (String) null, 0, 1, ExecutableNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExecutableNode__loopNodeOfTest(), this.getLoopNode(), this.getLoopNode_Test(),
					"_loopNodeOfTest", (String) null, 0, 1, ExecutableNode.class, false, false, true, false, true,
					false, true, false, false);
			this.initEReference(this.getExecutableNode__exceptionHandlerOfHandlerBody(), this.getExceptionHandler(),
					this.getExceptionHandler_HandlerBody(), "_exceptionHandlerOfHandlerBody", (String) null, 0, -1,
					ExecutableNode.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExecutableNode_Handler(), this.getExceptionHandler(),
					this.getExceptionHandler_ProtectedNode(), "handler", (String) null, 0, -1, ExecutableNode.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getExecutableNode__sequenceNodeOfExecutableNode(), this.getSequenceNode(),
					this.getSequenceNode_ExecutableNode(), "_sequenceNodeOfExecutableNode", (String) null, 0, 1,
					ExecutableNode.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.activityNodeEClass, ActivityNode.class, "ActivityNode", true, false, true);
			this.initEReference(this.getActivityNode_Activity(), this.getActivity(), this.getActivity_Node(),
					"activity", (String) null, 0, 1, ActivityNode.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getActivityNode_InGroup(), this.getActivityGroup(),
					this.getActivityGroup_ContainedNode(), "inGroup", (String) null, 0, -1, ActivityNode.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getActivityNode_InPartition(), this.getActivityPartition(),
					this.getActivityPartition_Node(), "inPartition", (String) null, 0, -1, ActivityNode.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityNode_InStructuredNode(), this.getStructuredActivityNode(),
					this.getStructuredActivityNode_Node(), "inStructuredNode", (String) null, 0, 1, ActivityNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityNode_InInterruptibleRegion(), this.getInterruptibleActivityRegion(),
					this.getInterruptibleActivityRegion_Node(), "inInterruptibleRegion", (String) null, 0, -1,
					ActivityNode.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(),
					"outgoing", (String) null, 0, -1, ActivityNode.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(),
					"incoming", (String) null, 0, -1, ActivityNode.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getActivityNode_RedefinedNode(), this.getActivityNode(),
					this.getActivityNode__activityNodeOfRedefinedNode(), "redefinedNode", (String) null, 0, -1,
					ActivityNode.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityNode__activityNodeOfRedefinedNode(), this.getActivityNode(),
					this.getActivityNode_RedefinedNode(), "_activityNodeOfRedefinedNode", (String) null, 0, -1,
					ActivityNode.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.redefinableElementEClass, RedefinableElement.class, "RedefinableElement", true, false,
					true);
			this.initEAttribute(this.getRedefinableElement_Leaf(), this.getBoolean(), "isLeaf", "false", 1, 1,
					RedefinableElement.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getRedefinableElement_RedefinedElement(), this.getRedefinableElement(),
					this.getRedefinableElement__redefinableElementOfRedefinedElement(), "redefinedElement",
					(String) null, 0, -1, RedefinableElement.class, true, true, true, false, true, false, true, true,
					false);
			this.initEReference(this.getRedefinableElement__redefinableElementOfRedefinedElement(),
					this.getRedefinableElement(), this.getRedefinableElement_RedefinedElement(),
					"_redefinableElementOfRedefinedElement", (String) null, 0, -1, RedefinableElement.class, true, true,
					true, false, true, false, true, true, false);
			this.initEReference(this.getRedefinableElement_RedefinitionContext(), this.getClassifier(),
					this.getClassifier__redefinableElementOfRedefinitionContext(), "redefinitionContext", (String) null,
					0, -1, RedefinableElement.class, true, true, true, false, true, false, true, true, false);
			this.initEClass(this.activityEClass, Activity.class, "Activity", false, false, true);
			this.initEReference(this.getActivity_Edge(), this.getActivityEdge(), this.getActivityEdge_Activity(),
					"edge", (String) null, 0, -1, Activity.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getActivity_Group(), this.getActivityGroup(), this.getActivityGroup_InActivity(),
					"group", (String) null, 0, -1, Activity.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getActivity_Partition(), this.getActivityPartition(),
					this.getActivityPartition__activityOfPartition(), "partition", (String) null, 0, -1, Activity.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivity_StructuredNode(), this.getStructuredActivityNode(),
					this.getStructuredActivityNode_Activity(), "structuredNode", (String) null, 0, -1, Activity.class,
					true, true, false, false, true, false, true, true, false);
			this.initEAttribute(this.getActivity_ReadOnly(), this.getBoolean(), "isReadOnly", "false", 1, 1,
					Activity.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getActivity_SingleExecution(), this.getBoolean(), "isSingleExecution", "false", 1,
					1, Activity.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getActivity_Variable(), this.getVariable(), this.getVariable_ActivityScope(),
					"variable", (String) null, 0, -1, Activity.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getActivity_Node(), this.getActivityNode(), this.getActivityNode_Activity(),
					"node", (String) null, 0, -1, Activity.class, false, false, true, true, true, false, true, false,
					false);
			this.initEClass(this.activityEdgeEClass, ActivityEdge.class, "ActivityEdge", true, false, true);
			this.initEReference(this.getActivityEdge_Guard(), this.getValueSpecification(),
					this.getValueSpecification__activityEdgeOfGuard(), "guard", (String) null, 0, 1, ActivityEdge.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getActivityEdge_InGroup(), this.getActivityGroup(),
					this.getActivityGroup_ContainedEdge(), "inGroup", (String) null, 0, -1, ActivityEdge.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getActivityEdge_InPartition(), this.getActivityPartition(),
					this.getActivityPartition_Edge(), "inPartition", (String) null, 0, -1, ActivityEdge.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityEdge_InStructuredNode(), this.getStructuredActivityNode(),
					this.getStructuredActivityNode_Edge(), "inStructuredNode", (String) null, 0, 1, ActivityEdge.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityEdge_Interrupts(), this.getInterruptibleActivityRegion(),
					this.getInterruptibleActivityRegion_InterruptingEdge(), "interrupts", (String) null, 0, 1,
					ActivityEdge.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityEdge_RedefinedEdge(), this.getActivityEdge(),
					this.getActivityEdge__activityEdgeOfRedefinedEdge(), "redefinedEdge", (String) null, 0, -1,
					ActivityEdge.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityEdge__activityEdgeOfRedefinedEdge(), this.getActivityEdge(),
					this.getActivityEdge_RedefinedEdge(), "_activityEdgeOfRedefinedEdge", (String) null, 0, -1,
					ActivityEdge.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(),
					"source", (String) null, 1, 1, ActivityEdge.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(),
					"target", (String) null, 1, 1, ActivityEdge.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getActivityEdge_Weight(), this.getValueSpecification(),
					this.getValueSpecification__activityEdgeOfWeight(), "weight", (String) null, 0, 1,
					ActivityEdge.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getActivityEdge__informationFlowOfRealizingActivityEdge(),
					this.getInformationFlow(), this.getInformationFlow_RealizingActivityEdge(),
					"_informationFlowOfRealizingActivityEdge", (String) null, 0, -1, ActivityEdge.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getActivityEdge_Activity(), this.getActivity(), this.getActivity_Edge(),
					"activity", (String) null, 0, 1, ActivityEdge.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.activityGroupEClass, ActivityGroup.class, "ActivityGroup", true, false, true);
			this.initEReference(this.getActivityGroup_ContainedNode(), this.getActivityNode(),
					this.getActivityNode_InGroup(), "containedNode", (String) null, 0, -1, ActivityGroup.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getActivityGroup_InActivity(), this.getActivity(), this.getActivity_Group(),
					"inActivity", (String) null, 0, 1, ActivityGroup.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getActivityGroup_Subgroup(), this.getActivityGroup(),
					this.getActivityGroup_SuperGroup(), "subgroup", (String) null, 0, -1, ActivityGroup.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getActivityGroup_SuperGroup(), this.getActivityGroup(),
					this.getActivityGroup_Subgroup(), "superGroup", (String) null, 0, 1, ActivityGroup.class, true,
					true, true, false, true, false, true, true, false);
			this.initEReference(this.getActivityGroup_ContainedEdge(), this.getActivityEdge(),
					this.getActivityEdge_InGroup(), "containedEdge", (String) null, 0, -1, ActivityGroup.class, true,
					true, true, false, true, false, true, true, false);
			this.initEClass(this.activityPartitionEClass, ActivityPartition.class, "ActivityPartition", false, false,
					true);
			this.initEAttribute(this.getActivityPartition_Dimension(), this.getBoolean(), "isDimension", "false", 1, 1,
					ActivityPartition.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getActivityPartition_External(), this.getBoolean(), "isExternal", "false", 1, 1,
					ActivityPartition.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getActivityPartition_Node(), this.getActivityNode(),
					this.getActivityNode_InPartition(), "node", (String) null, 0, -1, ActivityPartition.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityPartition_Represents(), this.getElement(),
					this.getElement__activityPartitionOfRepresents(), "represents", (String) null, 0, 1,
					ActivityPartition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityPartition_Subpartition(), this.getActivityPartition(),
					this.getActivityPartition_SuperPartition(), "subpartition", (String) null, 0, -1,
					ActivityPartition.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getActivityPartition_SuperPartition(), this.getActivityPartition(),
					this.getActivityPartition_Subpartition(), "superPartition", (String) null, 0, 1,
					ActivityPartition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityPartition__activityOfPartition(), this.getActivity(),
					this.getActivity_Partition(), "_activityOfPartition", (String) null, 0, 1, ActivityPartition.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getActivityPartition_Edge(), this.getActivityEdge(),
					this.getActivityEdge_InPartition(), "edge", (String) null, 0, -1, ActivityPartition.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode",
					false, false, true);
			this.initEAttribute(this.getStructuredActivityNode_MustIsolate(), this.getBoolean(), "mustIsolate", "false",
					1, 1, StructuredActivityNode.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getStructuredActivityNode_Node(), this.getActivityNode(),
					this.getActivityNode_InStructuredNode(), "node", (String) null, 0, -1, StructuredActivityNode.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStructuredActivityNode_StructuredNodeInput(), this.getInputPin(),
					this.getInputPin__structuredActivityNodeOfStructuredNodeInput(), "structuredNodeInput",
					(String) null, 0, -1, StructuredActivityNode.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getStructuredActivityNode_StructuredNodeOutput(), this.getOutputPin(),
					this.getOutputPin__structuredActivityNodeOfStructuredNodeOutput(), "structuredNodeOutput",
					(String) null, 0, -1, StructuredActivityNode.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getStructuredActivityNode_Variable(), this.getVariable(), this.getVariable_Scope(),
					"variable", (String) null, 0, -1, StructuredActivityNode.class, false, false, true, true, true,
					false, true, false, false);
			this.initEReference(this.getStructuredActivityNode_Edge(), this.getActivityEdge(),
					this.getActivityEdge_InStructuredNode(), "edge", (String) null, 0, -1, StructuredActivityNode.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStructuredActivityNode_Activity(), this.getActivity(),
					this.getActivity_StructuredNode(), "activity__from_StructuredActivityNode", (String) null, 0, 1,
					StructuredActivityNode.class, true, true, true, false, true, false, true, true, false);
			this.initEClass(this.inputPinEClass, InputPin.class, "InputPin", false, false, true);
			this.initEReference(this.getInputPin__structuralFeatureActionOfObject(), this.getStructuralFeatureAction(),
					this.getStructuralFeatureAction_Object(), "_structuralFeatureActionOfObject", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__invocationActionOfArgument(), this.getInvocationAction(),
					this.getInvocationAction_Argument(), "_invocationActionOfArgument", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__loopNodeOfLoopVariableInput(), this.getLoopNode(),
					this.getLoopNode_LoopVariableInput(), "_loopNodeOfLoopVariableInput", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__reduceActionOfCollection(), this.getReduceAction(),
					this.getReduceAction_Collection(), "_reduceActionOfCollection", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__unmarshallActionOfObject(), this.getUnmarshallAction(),
					this.getUnmarshallAction_Object(), "_unmarshallActionOfObject", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__opaqueActionOfInputValue(), this.getOpaqueAction(),
					this.getOpaqueAction_InputValue(), "_opaqueActionOfInputValue", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__qualifierValueOfValue(), this.getQualifierValue(),
					this.getQualifierValue_Value(), "_qualifierValueOfValue", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__linkEndDataOfValue(), this.getLinkEndData(),
					this.getLinkEndData_Value(), "_linkEndDataOfValue", (String) null, 0, 1, InputPin.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__linkActionOfInputValue(), this.getLinkAction(),
					this.getLinkAction_InputValue(), "_linkActionOfInputValue", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__readLinkObjectEndActionOfObject(), this.getReadLinkObjectEndAction(),
					this.getReadLinkObjectEndAction_Object(), "_readLinkObjectEndActionOfObject", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__writeStructuralFeatureActionOfValue(),
					this.getWriteStructuralFeatureAction(), this.getWriteStructuralFeatureAction_Value(),
					"_writeStructuralFeatureActionOfValue", (String) null, 0, 1, InputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getInputPin__linkEndCreationDataOfInsertAt(), this.getLinkEndCreationData(),
					this.getLinkEndCreationData_InsertAt(), "_linkEndCreationDataOfInsertAt", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__testIdentityActionOfFirst(), this.getTestIdentityAction(),
					this.getTestIdentityAction_First(), "_testIdentityActionOfFirst", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__testIdentityActionOfSecond(), this.getTestIdentityAction(),
					this.getTestIdentityAction_Second(), "_testIdentityActionOfSecond", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__readIsClassifiedObjectActionOfObject(),
					this.getReadIsClassifiedObjectAction(), this.getReadIsClassifiedObjectAction_Object(),
					"_readIsClassifiedObjectActionOfObject", (String) null, 0, 1, InputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getInputPin__readLinkObjectEndQualifierActionOfObject(),
					this.getReadLinkObjectEndQualifierAction(), this.getReadLinkObjectEndQualifierAction_Object(),
					"_readLinkObjectEndQualifierActionOfObject", (String) null, 0, 1, InputPin.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__replyActionOfReplyValue(), this.getReplyAction(),
					this.getReplyAction_ReplyValue(), "_replyActionOfReplyValue", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__replyActionOfReturnInformation(), this.getReplyAction(),
					this.getReplyAction_ReturnInformation(), "_replyActionOfReturnInformation", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__sendSignalActionOfTarget(), this.getSendSignalAction(),
					this.getSendSignalAction_Target(), "_sendSignalActionOfTarget", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__clearAssociationActionOfObject(), this.getClearAssociationAction(),
					this.getClearAssociationAction_Object(), "_clearAssociationActionOfObject", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__callOperationActionOfTarget(), this.getCallOperationAction(),
					this.getCallOperationAction_Target(), "_callOperationActionOfTarget", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__sendObjectActionOfTarget(), this.getSendObjectAction(),
					this.getSendObjectAction_Target(), "_sendObjectActionOfTarget", (String) null, 0, 1, InputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__sendObjectActionOfRequest(), this.getSendObjectAction(),
					this.getSendObjectAction_Request(), "_sendObjectActionOfRequest", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__addStructuralFeatureValueActionOfInsertAt(),
					this.getAddStructuralFeatureValueAction(), this.getAddStructuralFeatureValueAction_InsertAt(),
					"_addStructuralFeatureValueActionOfInsertAt", (String) null, 0, 1, InputPin.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__actionOfInput(), this.getAction(), this.getAction_Input(),
					"_actionOfInput", (String) null, 0, 1, InputPin.class, true, true, true, false, true, false, true,
					true, false);
			this.initEReference(this.getInputPin__removeStructuralFeatureValueActionOfRemoveAt(),
					this.getRemoveStructuralFeatureValueAction(), this.getRemoveStructuralFeatureValueAction_RemoveAt(),
					"_removeStructuralFeatureValueActionOfRemoveAt", (String) null, 0, 1, InputPin.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__startObjectBehaviorActionOfObject(),
					this.getStartObjectBehaviorAction(), this.getStartObjectBehaviorAction_Object(),
					"_startObjectBehaviorActionOfObject", (String) null, 0, 1, InputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getInputPin__removeVariableValueActionOfRemoveAt(),
					this.getRemoveVariableValueAction(), this.getRemoveVariableValueAction_RemoveAt(),
					"_removeVariableValueActionOfRemoveAt", (String) null, 0, 1, InputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getInputPin__writeVariableActionOfValue(), this.getWriteVariableAction(),
					this.getWriteVariableAction_Value(), "_writeVariableActionOfValue", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__destroyObjectActionOfTarget(), this.getDestroyObjectAction(),
					this.getDestroyObjectAction_Target(), "_destroyObjectActionOfTarget", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__reclassifyObjectActionOfObject(), this.getReclassifyObjectAction(),
					this.getReclassifyObjectAction_Object(), "_reclassifyObjectActionOfObject", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__raiseExceptionActionOfException(), this.getRaiseExceptionAction(),
					this.getRaiseExceptionAction_Exception(), "_raiseExceptionActionOfException", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__linkEndDestructionDataOfDestroyAt(), this.getLinkEndDestructionData(),
					this.getLinkEndDestructionData_DestroyAt(), "_linkEndDestructionDataOfDestroyAt", (String) null, 0,
					1, InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__addVariableValueActionOfInsertAt(), this.getAddVariableValueAction(),
					this.getAddVariableValueAction_InsertAt(), "_addVariableValueActionOfInsertAt", (String) null, 0, 1,
					InputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInputPin__startClassifierBehaviorActionOfObject(),
					this.getStartClassifierBehaviorAction(), this.getStartClassifierBehaviorAction_Object(),
					"_startClassifierBehaviorActionOfObject", (String) null, 0, 1, InputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getInputPin__structuredActivityNodeOfStructuredNodeInput(),
					this.getStructuredActivityNode(), this.getStructuredActivityNode_StructuredNodeInput(),
					"_structuredActivityNodeOfStructuredNodeInput", (String) null, 0, 1, InputPin.class, false, false,
					true, false, true, false, true, false, false);
			this.initEClass(this.pinEClass, Pin.class, "Pin", true, false, true);
			this.initEAttribute(this.getPin_Control(), this.getBoolean(), "isControl", "false", 1, 1, Pin.class, false,
					false, true, false, false, true, false, false);
			this.initEClass(this.objectNodeEClass, ObjectNode.class, "ObjectNode", true, false, true);
			this.initEReference(this.getObjectNode_InState(), this.getState(), this.getState__objectNodeOfInState(),
					"inState", (String) null, 0, -1, ObjectNode.class, false, false, true, false, true, false, true,
					false, false);
			this.initEAttribute(this.getObjectNode_ControlType(), this.getBoolean(), "isControlType", "false", 1, 1,
					ObjectNode.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getObjectNode_Ordering(), this.getObjectNodeOrderingKind(), "ordering", "FIFO", 1,
					1, ObjectNode.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getObjectNode_Selection(), this.getBehavior(),
					this.getBehavior__objectNodeOfSelection(), "selection", (String) null, 0, 1, ObjectNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getObjectNode_UpperBound(), this.getValueSpecification(),
					this.getValueSpecification__objectNodeOfUpperBound(), "upperBound", (String) null, 0, 1,
					ObjectNode.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getObjectNode__exceptionHandlerOfExceptionInput(), this.getExceptionHandler(),
					this.getExceptionHandler_ExceptionInput(), "_exceptionHandlerOfExceptionInput", (String) null, 0,
					-1, ObjectNode.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.stateEClass, State.class, "State", false, false, true);
			this.initEReference(this.getState_Region(), this.getRegion(), this.getRegion_State(), "region",
					(String) null, 0, -1, State.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getState_ConnectionPoint(), this.getPseudostate(), this.getPseudostate_State(),
					"connectionPoint", (String) null, 0, -1, State.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getState_Connection(), this.getConnectionPointReference(),
					this.getConnectionPointReference_State(), "connection", (String) null, 0, -1, State.class, false,
					false, true, true, true, false, true, false, false);
			this.initEReference(this.getState_Submachine(), this.getStateMachine(),
					this.getStateMachine_SubmachineState(), "submachine", (String) null, 0, 1, State.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getState_StateInvariant(), this.getConstraint(), this.getConstraint_OwningState(),
					"stateInvariant", (String) null, 0, 1, State.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getState_DeferrableTrigger(), this.getTrigger(),
					this.getTrigger__stateOfDeferrableTrigger(), "deferrableTrigger", (String) null, 0, -1, State.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getState_DoActivity(), this.getBehavior(), this.getBehavior__stateOfDoActivity(),
					"doActivity", (String) null, 0, 1, State.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getState_Entry(), this.getBehavior(), this.getBehavior__stateOfEntry(), "entry",
					(String) null, 0, 1, State.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getState_Exit(), this.getBehavior(), this.getBehavior__stateOfExit(), "exit",
					(String) null, 0, 1, State.class, false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getState_Composite(), this.getBoolean(), "isComposite", (String) null, 1, 1,
					State.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getState_Orthogonal(), this.getBoolean(), "isOrthogonal", (String) null, 1, 1,
					State.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getState_Simple(), this.getBoolean(), "isSimple", (String) null, 1, 1, State.class,
					true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getState_SubmachineState(), this.getBoolean(), "isSubmachineState", (String) null,
					1, 1, State.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getState__objectNodeOfInState(), this.getObjectNode(),
					this.getObjectNode_InState(), "_objectNodeOfInState", (String) null, 0, -1, State.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.vertexEClass, Vertex.class, "Vertex", true, false, true);
			this.initEReference(this.getVertex_Container(), this.getRegion(), this.getRegion_Subvertex(), "container",
					(String) null, 0, 1, Vertex.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getVertex_Outgoing(), this.getTransition(), this.getTransition_Source(),
					"outgoing", (String) null, 0, -1, Vertex.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getVertex_Incoming(), this.getTransition(), this.getTransition_Target(),
					"incoming", (String) null, 0, -1, Vertex.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getVertex_RedefinedVertex(), this.getVertex(),
					this.getVertex___vertexOfRedefinedVertex(), "redefinedVertex", (String) null, 0, 1, Vertex.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getVertex___vertexOfRedefinedVertex(), this.getVertex(),
					this.getVertex_RedefinedVertex(), "_vertexOfRedefinedVertex", (String) null, 0, -1, Vertex.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getVertex_RedefinitionContext(), this.getClassifier(),
					this.getClassifier__vertexOfRedefinitionContext(), "redefinitionContext__from_Vertex",
					(String) null, 0, -1, Classifier.class, true, true, false, false, true, false, true, true, false);
			this.initEClass(this.regionEClass, Region.class, "Region", false, false, true);
			this.initEReference(this.getRegion_ExtendedRegion(), this.getRegion(),
					this.getRegion__regionOfExtendedRegion(), "extendedRegion", (String) null, 0, 1, Region.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getRegion__regionOfExtendedRegion(), this.getRegion(),
					this.getRegion_ExtendedRegion(), "_regionOfExtendedRegion", (String) null, 0, -1, Region.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getRegion_State(), this.getState(), this.getState_Region(), "state", (String) null,
					0, 1, Region.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getRegion_StateMachine(), this.getStateMachine(), this.getStateMachine_Region(),
					"stateMachine", (String) null, 0, 1, Region.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getRegion_Transition(), this.getTransition(), this.getTransition_Container(),
					"transition", (String) null, 0, -1, Region.class, false, false, true, true, true, false, true,
					false, false);
			this.initEReference(this.getRegion_Subvertex(), this.getVertex(), this.getVertex_Container(), "subvertex",
					(String) null, 0, -1, Region.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getRegion_RedefinitionContext(), this.getClassifier(),
					this.getClassifier__regionOfRedefinitionContext(), "redefinitionContext__from_Region",
					(String) null, 0, -1, Region.class, true, true, false, false, true, false, true, true, false);
			this.initEClass(this.stateMachineEClass, StateMachine.class, "StateMachine", false, false, true);
			this.initEReference(this.getStateMachine_ConnectionPoint(), this.getPseudostate(),
					this.getPseudostate_StateMachine(), "connectionPoint", (String) null, 0, -1, StateMachine.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStateMachine_ExtendedStateMachine(), this.getStateMachine(),
					this.getStateMachine__stateMachineOfExtendedStateMachine(), "extendedStateMachine", (String) null,
					0, -1, StateMachine.class, true, false, true, false, true, false, true, false, false);
			this.initEReference(this.getStateMachine__stateMachineOfExtendedStateMachine(), this.getStateMachine(),
					this.getStateMachine_ExtendedStateMachine(), "_stateMachineOfExtendedStateMachine", (String) null,
					0, -1, StateMachine.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getStateMachine_SubmachineState(), this.getState(), this.getState_Submachine(),
					"submachineState", (String) null, 0, -1, StateMachine.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getStateMachine_Region(), this.getRegion(), this.getRegion_StateMachine(),
					"region", (String) null, 1, -1, StateMachine.class, false, false, true, true, true, false, true,
					false, false);
			this.initEClass(this.pseudostateEClass, Pseudostate.class, "Pseudostate", false, false, true);
			this.initEAttribute(this.getPseudostate_Kind(), this.getPseudostateKind(), "kind", "initial", 1, 1,
					Pseudostate.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getPseudostate_State(), this.getState(), this.getState_ConnectionPoint(), "state",
					(String) null, 0, 1, Pseudostate.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPseudostate__connectionPointReferenceOfExit(),
					this.getConnectionPointReference(), this.getConnectionPointReference_Exit(),
					"_connectionPointReferenceOfExit", (String) null, 0, -1, Pseudostate.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getPseudostate__connectionPointReferenceOfEntry(),
					this.getConnectionPointReference(), this.getConnectionPointReference_Entry(),
					"_connectionPointReferenceOfEntry", (String) null, 0, -1, Pseudostate.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getPseudostate_StateMachine(), this.getStateMachine(),
					this.getStateMachine_ConnectionPoint(), "stateMachine", (String) null, 0, 1, Pseudostate.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.connectionPointReferenceEClass, ConnectionPointReference.class,
					"ConnectionPointReference", false, false, true);
			this.initEReference(this.getConnectionPointReference_Entry(), this.getPseudostate(),
					this.getPseudostate__connectionPointReferenceOfEntry(), "entry", (String) null, 0, -1,
					ConnectionPointReference.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnectionPointReference_State(), this.getState(), this.getState_Connection(),
					"state", (String) null, 0, 1, ConnectionPointReference.class, false, false, true, false, true,
					false, true, false, false);
			this.initEReference(this.getConnectionPointReference_Exit(), this.getPseudostate(),
					this.getPseudostate__connectionPointReferenceOfExit(), "exit", (String) null, 0, -1,
					ConnectionPointReference.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.transitionEClass, Transition.class, "Transition", false, false, true);
			this.initEReference(this.getTransition_Effect(), this.getBehavior(), this.getBehavior__transitionOfEffect(),
					"effect", (String) null, 0, 1, Transition.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getTransition_Guard(), this.getConstraint(),
					this.getConstraint__transitionOfGuard(), "guard", (String) null, 0, 1, Transition.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getTransition_Trigger(), this.getTrigger(), this.getTrigger__transitionOfTrigger(),
					"trigger", (String) null, 0, -1, Transition.class, false, false, true, true, true, false, true,
					false, false);
			this.initEAttribute(this.getTransition_Kind(), this.getTransitionKind(), "kind", "external", 1, 1,
					Transition.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getTransition_RedefinedTransition(), this.getTransition(),
					this.getTransition__transitionOfRedefinedTransition(), "redefinedTransition", (String) null, 0, 1,
					Transition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTransition__transitionOfRedefinedTransition(), this.getTransition(),
					this.getTransition_RedefinedTransition(), "_transitionOfRedefinedTransition", (String) null, 0, -1,
					Transition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTransition_Source(), this.getVertex(), this.getVertex_Outgoing(), "source",
					(String) null, 1, 1, Transition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTransition_Target(), this.getVertex(), this.getVertex_Incoming(), "target",
					(String) null, 1, 1, Transition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTransition_Container(), this.getRegion(), this.getRegion_Transition(),
					"container", (String) null, 1, 1, Transition.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getTransition_RedefinitionContext(), this.getClassifier(),
					this.getClassifier__transitionOfRedefinitionContext(), "redefinitionContext__from_Transition",
					(String) null, 0, -1, Transition.class, true, true, false, false, true, false, true, true, false);
			this.initEClass(this.constraintEClass, Constraint.class, "Constraint", false, false, true);
			this.initEReference(this.getConstraint_ConstrainedElement(), this.getElement(),
					this.getElement__constraintOfConstrainedElement(), "constrainedElement", (String) null, 0, -1,
					Constraint.class, false, false, true, false, true, false, true, false, true);
			this.initEReference(this.getConstraint_Context(), this.getNamespace(), this.getNamespace_OwnedRule(),
					"context", (String) null, 0, 1, Constraint.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getConstraint_Specification(), this.getValueSpecification(),
					this.getValueSpecification_OwningConstraint(), "specification", (String) null, 1, 1,
					Constraint.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getConstraint_OwningState(), this.getState(), this.getState_StateInvariant(),
					"owningState", (String) null, 0, 1, Constraint.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getConstraint__actionOfLocalPostcondition(), this.getAction(),
					this.getAction_LocalPostcondition(), "_actionOfLocalPostcondition", (String) null, 0, 1,
					Constraint.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__extendOfCondition(), this.getExtend(), this.getExtend_Condition(),
					"_extendOfCondition", (String) null, 0, 1, Constraint.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getConstraint_OwningTransition(), this.getProtocolTransition(),
					this.getProtocolTransition_PostCondition(), "owningTransition", (String) null, 0, 1,
					Constraint.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__protocolTransitionOfPreCondition(), this.getProtocolTransition(),
					this.getProtocolTransition_PreCondition(), "_protocolTransitionOfPreCondition", (String) null, 0, 1,
					Constraint.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__parameterSetOfCondition(), this.getParameterSet(),
					this.getParameterSet_Condition(), "_parameterSetOfCondition", (String) null, 0, 1, Constraint.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__messageOfGuard(), this.getMessage(), this.getMessage_Guard(),
					"_messageOfGuard", (String) null, 0, 1, Constraint.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getConstraint_BodyContext(), this.getOperation(),
					this.getOperation_BodyCondition(), "bodyContext", (String) null, 0, 1, Constraint.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint_PostContext(), this.getOperation(),
					this.getOperation_Postcondition(), "postContext", (String) null, 0, 1, Constraint.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint_PreContext(), this.getOperation(), this.getOperation_Precondition(),
					"preContext", (String) null, 0, 1, Constraint.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getConstraint__behaviorOfPostcondition(), this.getBehavior(),
					this.getBehavior_Postcondition(), "_behaviorOfPostcondition", (String) null, 0, 1, Constraint.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__behaviorOfPrecondition(), this.getBehavior(),
					this.getBehavior_Precondition(), "_behaviorOfPrecondition", (String) null, 0, 1, Constraint.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__stateInvariantOfInvariant(), this.getStateInvariant(),
					this.getStateInvariant_Invariant(), "_stateInvariantOfInvariant", (String) null, 0, 1,
					Constraint.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__actionOfLocalPrecondition(), this.getAction(),
					this.getAction_LocalPrecondition(), "_actionOfLocalPrecondition", (String) null, 0, 1,
					Constraint.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConstraint__transitionOfGuard(), this.getTransition(),
					this.getTransition_Guard(), "_transitionOfGuard", (String) null, 0, 1, Constraint.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.extendEClass, Extend.class, "Extend", false, false, true);
			this.initEReference(this.getExtend_ExtendedCase(), this.getUseCase(),
					this.getUseCase__extendOfExtendedCase(), "extendedCase", (String) null, 1, 1, Extend.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getExtend_Extension(), this.getUseCase(), this.getUseCase_Extend(), "extension",
					(String) null, 1, 1, Extend.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExtend_ExtensionLocation(), this.getExtensionPoint(),
					this.getExtensionPoint_Extension(), "extensionLocation", (String) null, 1, -1, Extend.class, false,
					false, true, false, true, false, true, false, true);
			this.initEReference(this.getExtend_Condition(), this.getConstraint(),
					this.getConstraint__extendOfCondition(), "condition", (String) null, 0, 1, Extend.class, false,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.useCaseEClass, UseCase.class, "UseCase", false, false, true);
			this.initEReference(this.getUseCase_Extend(), this.getExtend(), this.getExtend_Extension(), "extend",
					(String) null, 0, -1, UseCase.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getUseCase_ExtensionPoint(), this.getExtensionPoint(),
					this.getExtensionPoint_UseCase(), "extensionPoint", (String) null, 0, -1, UseCase.class, false,
					false, true, true, true, false, true, false, false);
			this.initEReference(this.getUseCase_Include(), this.getInclude(), this.getInclude_IncludingCase(),
					"include", (String) null, 0, -1, UseCase.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getUseCase__includeOfAddition(), this.getInclude(), this.getInclude_Addition(),
					"_includeOfAddition", (String) null, 0, -1, UseCase.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getUseCase_Subject(), this.getClassifier(), this.getClassifier_UseCase(),
					"subject", (String) null, 0, -1, UseCase.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getUseCase__classifierOfOwnedUseCase(), this.getClassifier(),
					this.getClassifier_OwnedUseCase(), "_classifierOfOwnedUseCase", (String) null, 0, 1, UseCase.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getUseCase__extendOfExtendedCase(), this.getExtend(),
					this.getExtend_ExtendedCase(), "_extendOfExtendedCase", (String) null, 0, -1, UseCase.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.extensionPointEClass, ExtensionPoint.class, "ExtensionPoint", false, false, true);
			this.initEReference(this.getExtensionPoint_Extension(), this.getExtend(),
					this.getExtend_ExtensionLocation(), "extension", (String) null, 0, -1, ExtensionPoint.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getExtensionPoint_UseCase(), this.getUseCase(), this.getUseCase_ExtensionPoint(),
					"useCase", (String) null, 1, 1, ExtensionPoint.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.includeEClass, Include.class, "Include", false, false, true);
			this.initEReference(this.getInclude_Addition(), this.getUseCase(), this.getUseCase__includeOfAddition(),
					"addition", (String) null, 1, 1, Include.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getInclude_IncludingCase(), this.getUseCase(), this.getUseCase_Include(),
					"includingCase", (String) null, 1, 1, Include.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.protocolTransitionEClass, ProtocolTransition.class, "ProtocolTransition", false, false,
					true);
			this.initEReference(this.getProtocolTransition_PreCondition(), this.getConstraint(),
					this.getConstraint__protocolTransitionOfPreCondition(), "preCondition", (String) null, 0, 1,
					ProtocolTransition.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProtocolTransition_Referred(), this.getOperation(),
					this.getOperation__protocolTransitionOfReferred(), "referred", (String) null, 0, -1,
					ProtocolTransition.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getProtocolTransition_PostCondition(), this.getConstraint(),
					this.getConstraint_OwningTransition(), "postCondition", (String) null, 0, 1,
					ProtocolTransition.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.operationEClass, Operation.class, "Operation", false, false, true);
			this.initEReference(this.getOperation_Type(), this.getType(), this.getType__operationOfType(), "type",
					(String) null, 0, 1, Operation.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getOperation_Datatype(), this.getDataType(), this.getDataType_OwnedOperation(),
					"datatype", (String) null, 0, 1, Operation.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getOperation_Interface(), this.getInterface(), this.getInterface_OwnedOperation(),
					"interface", (String) null, 0, 1, Operation.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getOperation__artifactOfOwnedOperation(), this.getArtifact(),
					this.getArtifact_OwnedOperation(), "_artifactOfOwnedOperation", (String) null, 0, 1,
					Operation.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation_BodyCondition(), this.getConstraint(),
					this.getConstraint_BodyContext(), "bodyCondition", (String) null, 0, 1, Operation.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation_UMLClass(), this.getClass_(), this.getClass_OwnedOperation(),
					"UMLClass", (String) null, 0, 1, Operation.class, false, false, true, false, true, false, true,
					false, false);
			this.initEAttribute(this.getOperation_Ordered(), this.getBoolean(), "isOrdered", (String) null, 1, 1,
					Operation.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getOperation_Query(), this.getBoolean(), "isQuery", "false", 1, 1, Operation.class,
					false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getOperation_Unique(), this.getBoolean(), "isUnique", (String) null, 1, 1,
					Operation.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getOperation_Lower(), this.getInteger(), "lower", (String) null, 0, 1,
					Operation.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getOperation_Postcondition(), this.getConstraint(),
					this.getConstraint_PostContext(), "postcondition", (String) null, 0, -1, Operation.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation_Precondition(), this.getConstraint(), this.getConstraint_PreContext(),
					"precondition", (String) null, 0, -1, Operation.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getOperation_RedefinedOperation(), this.getOperation(),
					this.getOperation__operationOfRedefinedOperation(), "redefinedOperation", (String) null, 0, -1,
					Operation.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation__operationOfRedefinedOperation(), this.getOperation(),
					this.getOperation_RedefinedOperation(), "_operationOfRedefinedOperation", (String) null, 0, -1,
					Operation.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getOperation_Upper(), this.getUnlimitedNatural(), "upper", (String) null, 0, 1,
					Operation.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getOperation__callOperationActionOfOperation(), this.getCallOperationAction(),
					this.getCallOperationAction_Operation(), "_callOperationActionOfOperation", (String) null, 0, -1,
					Operation.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation__callEventOfOperation(), this.getCallEvent(),
					this.getCallEvent_Operation(), "_callEventOfOperation", (String) null, 0, -1, Operation.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation__protocolTransitionOfReferred(), this.getProtocolTransition(),
					this.getProtocolTransition_Referred(), "_protocolTransitionOfReferred", (String) null, 0, -1,
					Operation.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getOperation_RaisedException(), this.getType(),
					this.getType__operationOfRaisedException(), "raisedException__from_Operation", (String) null, 0, -1,
					Operation.class, true, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOperation_OwnedParameter(), this.getParameter(), this.getParameter_Operation(),
					"ownedParameter__from_Operation", (String) null, 0, -1, Operation.class, true, false, true, true,
					true, false, true, false, true);
			this.initEReference(this.getOperation_TemplateParameter(), this.getOperationTemplateParameter(),
					this.getOperationTemplateParameter_ParameteredElement(), "templateParameter__from_Operation",
					(String) null, 0, 1, Operation.class, true, false, true, false, true, false, true, false, false);
			this.initEClass(this.behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", true, false,
					true);
			this.initEAttribute(this.getBehavioralFeature_Concurrency(), this.getCallConcurrencyKind(), "concurrency",
					"sequential", 1, 1, BehavioralFeature.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getBehavioralFeature_Abstract(), this.getBoolean(), "isAbstract", "false", 1, 1,
					BehavioralFeature.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getBehavioralFeature_Method(), this.getBehavior(),
					this.getBehavior_Specification(), "method", (String) null, 0, -1, BehavioralFeature.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getBehavioralFeature_OwnedParameter(), this.getParameter(),
					this.getParameter_OwnerFormalParam(), "ownedParameter", (String) null, 0, -1,
					BehavioralFeature.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getBehavioralFeature_OwnedParameterSet(), this.getParameterSet(),
					this.getParameterSet__behavioralFeatureOfOwnedParameterSet(), "ownedParameterSet", (String) null, 0,
					-1, BehavioralFeature.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getBehavioralFeature_RaisedException(), this.getType(),
					this.getType__behavioralFeatureOfRaisedException(), "raisedException", (String) null, 0, -1,
					BehavioralFeature.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.featureEClass, Feature.class, "Feature", true, false, true);
			this.initEReference(this.getFeature_FeaturingClassifier(), this.getClassifier(),
					this.getClassifier_Feature(), "featuringClassifier", (String) null, 0, 1, Feature.class, true, true,
					true, false, true, false, true, true, false);
			this.initEAttribute(this.getFeature_Static(), this.getBoolean(), "isStatic", "false", 1, 1, Feature.class,
					false, false, true, false, false, true, false, false);
			this.initEClass(this.parameterSetEClass, ParameterSet.class, "ParameterSet", false, false, true);
			this.initEReference(this.getParameterSet_Condition(), this.getConstraint(),
					this.getConstraint__parameterSetOfCondition(), "condition", (String) null, 0, -1,
					ParameterSet.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getParameterSet_Parameter(), this.getParameter(), this.getParameter_ParameterSet(),
					"parameter", (String) null, 1, -1, ParameterSet.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getParameterSet__behaviorOfOwnedParameterSet(), this.getBehavior(),
					this.getBehavior_OwnedParameterSet(), "_behaviorOfOwnedParameterSet", (String) null, 0, 1,
					ParameterSet.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getParameterSet__behavioralFeatureOfOwnedParameterSet(),
					this.getBehavioralFeature(), this.getBehavioralFeature_OwnedParameterSet(),
					"_behavioralFeatureOfOwnedParameterSet", (String) null, 0, 1, ParameterSet.class, false, false,
					true, false, true, false, true, false, false);
			this.initEClass(this.typeEClass, Type.class, "Type", true, false, true);
			this.initEReference(this.getType_Package(), this.getPackage(), this.getPackage_OwnedType(), "package",
					(String) null, 0, 1, Type.class, true, true, true, false, true, false, true, true, false);
			this.initEReference(this.getType__operationOfType(), this.getOperation(), this.getOperation_Type(),
					"_operationOfType", (String) null, 0, -1, Type.class, true, true, false, false, true, false, true,
					true, false);
			this.initEReference(this.getType__typedElementOfType(), this.getTypedElement(), this.getTypedElement_Type(),
					"_typedElementOfType", (String) null, 0, -1, Type.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getType__operationOfRaisedException(), this.getOperation(),
					this.getOperation_RaisedException(), "_operationOfRaisedException", (String) null, 0, -1,
					Type.class, false, true, true, false, true, false, true, false, false);
			this.initEReference(this.getType__associationOfEndType(), this.getAssociation(),
					this.getAssociation_EndType(), "_associationOfEndType", (String) null, 0, -1, Type.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getType__behavioralFeatureOfRaisedException(), this.getBehavioralFeature(),
					this.getBehavioralFeature_RaisedException(), "_behavioralFeatureOfRaisedException", (String) null,
					0, -1, Type.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.associationEClass, Association.class, "Association", false, false, true);
			this.initEAttribute(this.getAssociation_Derived(), this.getBoolean(), "isDerived", "false", 1, 1,
					Association.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getAssociation_MemberEnd(), this.getProperty(), this.getProperty_Association(),
					"memberEnd", (String) null, 2, -1, Association.class, false, false, true, false, true, false, true,
					false, true);
			this.initEReference(this.getAssociation__connectorOfType(), this.getConnector(), this.getConnector_Type(),
					"_connectorOfType", (String) null, 0, -1, Association.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getAssociation_OwnedEnd(), this.getProperty(),
					this.getProperty_OwningAssociation(), "ownedEnd", (String) null, 0, -1, Association.class, false,
					false, true, true, true, false, true, false, true);
			this.initEReference(this.getAssociation_NavigableOwnedEnd(), this.getProperty(),
					this.getProperty__associationOfNavigableOwnedEnd(), "navigableOwnedEnd", (String) null, 0, -1,
					Association.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getAssociation__clearAssociationActionOfAssociation(),
					this.getClearAssociationAction(), this.getClearAssociationAction_Association(),
					"_clearAssociationActionOfAssociation", (String) null, 0, -1, Association.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getAssociation_EndType(), this.getType(), this.getType__associationOfEndType(),
					"endType", (String) null, 1, -1, Association.class, true, true, false, false, true, false, true,
					true, false);
			this.initEClass(this.propertyEClass, Property.class, "Property", false, false, true);
			this.initEAttribute(this.getProperty_Aggregation(), this.getAggregationKind(), "aggregation", "none", 1, 1,
					Property.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getProperty_AssociationEnd(), this.getProperty(), this.getProperty_Qualifier(),
					"associationEnd", (String) null, 0, 1, Property.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getProperty_Qualifier(), this.getProperty(), this.getProperty_AssociationEnd(),
					"qualifier", (String) null, 0, -1, Property.class, false, false, true, true, true, false, true,
					false, true);
			this.initEReference(this.getProperty_UMLClass(), this.getClass_(), this.getClass_OwnedAttribute(),
					"UMLClass", (String) null, 0, 1, Property.class, true, true, true, false, true, false, true, false,
					false);
			this.initEReference(this.getProperty_Datatype(), this.getDataType(), this.getDataType_OwnedAttribute(),
					"datatype", (String) null, 0, 1, Property.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getProperty_DefaultValue(), this.getValueSpecification(),
					this.getValueSpecification_OwningProperty(), "defaultValue", (String) null, 0, 1, Property.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getProperty_Interface(), this.getInterface(), this.getInterface_OwnedAttribute(),
					"interface", (String) null, 0, 1, Property.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getProperty_OwningSignal(), this.getSignal(), this.getSignal_OwnedAttribute(),
					"owningSignal", (String) null, 0, 1, Property.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getProperty__structuredClassifierOfOwnedAttribute(),
					this.getStructuredClassifier(), this.getStructuredClassifier_OwnedAttribute(),
					"_structuredClassifierOfOwnedAttribute", (String) null, 0, 1, Property.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getProperty__connectorEndOfDefiningEnd(), this.getConnectorEnd(),
					this.getConnectorEnd_DefiningEnd(), "_connectorEndOfDefiningEnd", (String) null, 0, -1,
					Property.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getProperty__connectorEndOfPartWithPort(), this.getConnectorEnd(),
					this.getConnectorEnd_PartWithPort(), "_connectorEndOfPartWithPort", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__structuredClassifierOfPart(), this.getStructuredClassifier(),
					this.getStructuredClassifier_Part(), "_structuredClassifierOfPart", (String) null, 0, 1,
					Property.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getProperty__linkEndDataOfEnd(), this.getLinkEndData(), this.getLinkEndData_End(),
					"_linkEndDataOfEnd", (String) null, 0, -1, Property.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getProperty__qualifierValueOfQualifier(), this.getQualifierValue(),
					this.getQualifierValue_Qualifier(), "_qualifierValueOfQualifier", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__readLinkObjectEndActionOfEnd(), this.getReadLinkObjectEndAction(),
					this.getReadLinkObjectEndAction_End(), "_readLinkObjectEndActionOfEnd", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__readLinkObjectEndQualifierActionOfQualifier(),
					this.getReadLinkObjectEndQualifierAction(), this.getReadLinkObjectEndQualifierAction_Qualifier(),
					"_readLinkObjectEndQualifierActionOfQualifier", (String) null, 0, -1, Property.class, false, false,
					true, false, true, false, true, false, false);
			this.initEAttribute(this.getProperty_Composite(), this.getBoolean(), "isComposite", "false", 1, 1,
					Property.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getProperty_Derived(), this.getBoolean(), "isDerived", "false", 1, 1,
					Property.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getProperty_DerivedUnion(), this.getBoolean(), "isDerivedUnion", "false", 1, 1,
					Property.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getProperty_ID(), this.getBoolean(), "isID", "false", 1, 1, Property.class, false,
					false, true, false, false, true, false, false);
			this.initEReference(this.getProperty_Opposite(), this.getProperty(), this.getProperty__propertyOfOpposite(),
					"opposite", (String) null, 0, 1, Property.class, true, true, false, false, true, false, true, true,
					false);
			this.initEReference(this.getProperty__propertyOfOpposite(), this.getProperty(), this.getProperty_Opposite(),
					"_propertyOfOpposite", (String) null, 0, 1, Property.class, true, true, false, false, true, false,
					true, true, false);
			this.initEReference(this.getProperty_OwningAssociation(), this.getAssociation(),
					this.getAssociation_OwnedEnd(), "owningAssociation", (String) null, 0, 1, Property.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty_RedefinedProperty(), this.getProperty(),
					this.getProperty__propertyOfRedefinedProperty(), "redefinedProperty", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__propertyOfRedefinedProperty(), this.getProperty(),
					this.getProperty_RedefinedProperty(), "_propertyOfRedefinedProperty", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty_SubsettedProperty(), this.getProperty(),
					this.getProperty__propertyOfSubsettedProperty(), "subsettedProperty", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__propertyOfSubsettedProperty(), this.getProperty(),
					this.getProperty_SubsettedProperty(), "_propertyOfSubsettedProperty", (String) null, 0, -1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__associationOfNavigableOwnedEnd(), this.getAssociation(),
					this.getAssociation_NavigableOwnedEnd(), "_associationOfNavigableOwnedEnd", (String) null, 0, 1,
					Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty__artifactOfOwnedAttribute(), this.getArtifact(),
					this.getArtifact_OwnedAttribute(), "_artifactOfOwnedAttribute", (String) null, 0, 1, Property.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty_Classifier(), this.getClassifier(), this.getClassifier_Attribute(),
					"classifier", (String) null, 0, 1, Property.class, true, true, true, false, true, false, true, true,
					false);
			this.initEReference(this.getProperty__interactionUseOfReturnValueRecipient(), this.getInteractionUse(),
					this.getInteractionUse_ReturnValueRecipient(), "_interactionUseOfReturnValueRecipient",
					(String) null, 0, -1, Property.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getProperty_Association(), this.getAssociation(), this.getAssociation_MemberEnd(),
					"association", (String) null, 0, 1, Property.class, false, false, true, false, true, false, true,
					false, false);
			this.addEOperation(this.propertyEClass, this.getBoolean(), "isNavigable", 1, 1, true, false);
			this.initEClass(this.structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", true, false,
					true);
			this.initEAttribute(this.getStructuralFeature_ReadOnly(), this.getBoolean(), "isReadOnly", "false", 1, 1,
					StructuralFeature.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getStructuralFeature__slotOfDefiningFeature(), this.getSlot(),
					this.getSlot_DefiningFeature(), "_slotOfDefiningFeature", (String) null, 0, -1,
					StructuralFeature.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getStructuralFeature__structuralFeatureActionOfStructuralFeature(),
					this.getStructuralFeatureAction(), this.getStructuralFeatureAction_StructuralFeature(),
					"_structuralFeatureActionOfStructuralFeature", (String) null, 0, -1, StructuralFeature.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.slotEClass, Slot.class, "Slot", false, false, true);
			this.initEReference(this.getSlot_OwningInstance(), this.getInstanceSpecification(),
					this.getInstanceSpecification_Slot(), "owningInstance", (String) null, 1, 1, Slot.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getSlot_Value(), this.getValueSpecification(),
					this.getValueSpecification_OwningSlot(), "value", (String) null, 0, -1, Slot.class, false, false,
					true, true, true, false, true, false, true);
			this.initEReference(this.getSlot_DefiningFeature(), this.getStructuralFeature(),
					this.getStructuralFeature__slotOfDefiningFeature(), "definingFeature", (String) null, 1, 1,
					Slot.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.structuralFeatureActionEClass, StructuralFeatureAction.class,
					"StructuralFeatureAction", true, false, true);
			this.initEReference(this.getStructuralFeatureAction_Object(), this.getInputPin(),
					this.getInputPin__structuralFeatureActionOfObject(), "object", (String) null, 1, 1,
					StructuralFeatureAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStructuralFeatureAction_StructuralFeature(), this.getStructuralFeature(),
					this.getStructuralFeature__structuralFeatureActionOfStructuralFeature(), "structuralFeature",
					(String) null, 1, 1, StructuralFeatureAction.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.dataTypeEClass, DataType.class, "DataType", false, false, true);
			this.initEReference(this.getDataType_OwnedOperation(), this.getOperation(), this.getOperation_Datatype(),
					"ownedOperation", (String) null, 0, -1, DataType.class, false, false, true, true, true, false, true,
					false, true);
			this.initEReference(this.getDataType_OwnedAttribute(), this.getProperty(), this.getProperty_Datatype(),
					"ownedAttribute", (String) null, 0, -1, DataType.class, false, false, true, true, true, false, true,
					false, true);
			this.initEClass(this.interfaceEClass, Interface.class, "Interface", false, false, true);
			this.initEReference(this.getInterface_NestedClassifier(), this.getClassifier(),
					this.getClassifier__interfaceOfNestedClassifier(), "nestedClassifier", (String) null, 0, -1,
					Interface.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getInterface_OwnedOperation(), this.getOperation(), this.getOperation_Interface(),
					"ownedOperation", (String) null, 0, -1, Interface.class, false, false, true, true, true, false,
					true, false, true);
			this.initEReference(this.getInterface_OwnedReception(), this.getReception(),
					this.getReception__interfaceOfOwnedReception(), "ownedReception", (String) null, 0, -1,
					Interface.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInterface_Protocol(), this.getProtocolStateMachine(),
					this.getProtocolStateMachine_Interface(), "protocol", (String) null, 0, 1, Interface.class, false,
					false, true, true, true, false, true, false, false);
			this.initEReference(this.getInterface__portOfProvided(), this.getPort(), this.getPort_Provided(),
					"_portOfProvided", (String) null, 0, -1, Interface.class, true, true, false, false, true, false,
					true, true, false);
			this.initEReference(this.getInterface__portOfRequired(), this.getPort(), this.getPort_Required(),
					"_portOfRequired", (String) null, 0, -1, Interface.class, true, true, false, false, true, false,
					true, true, false);
			this.initEReference(this.getInterface_RedefinedInterface(), this.getInterface(),
					this.getInterface__interfaceOfRedefinedInterface(), "redefinedInterface", (String) null, 0, -1,
					Interface.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInterface__interfaceOfRedefinedInterface(), this.getInterface(),
					this.getInterface_RedefinedInterface(), "_interfaceOfRedefinedInterface", (String) null, 0, -1,
					Interface.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInterface__interfaceRealizationOfContract(), this.getInterfaceRealization(),
					this.getInterfaceRealization_Contract(), "_interfaceRealizationOfContract", (String) null, 0, -1,
					Interface.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInterface__componentOfProvided(), this.getComponent(),
					this.getComponent_Provided(), "_componentOfProvided", (String) null, 0, -1, Interface.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getInterface__componentOfRequired(), this.getComponent(),
					this.getComponent_Required(), "_componentOfRequired", (String) null, 0, -1, Interface.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getInterface_OwnedAttribute(), this.getProperty(), this.getProperty_Interface(),
					"ownedAttribute", (String) null, 0, -1, Interface.class, false, false, true, true, true, false,
					true, false, true);
			this.initEClass(this.receptionEClass, Reception.class, "Reception", false, false, true);
			this.initEReference(this.getReception_Signal(), this.getSignal(), this.getSignal__receptionOfSignal(),
					"signal", (String) null, 1, 1, Reception.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getReception__classOfOwnedReception(), this.getClass_(),
					this.getClass_OwnedReception(), "_classOfOwnedReception", (String) null, 0, 1, Reception.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReception__interfaceOfOwnedReception(), this.getInterface(),
					this.getInterface_OwnedReception(), "_interfaceOfOwnedReception", (String) null, 0, 1,
					Reception.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.signalEClass, Signal.class, "Signal", false, false, true);
			this.initEReference(this.getSignal_OwnedAttribute(), this.getProperty(), this.getProperty_OwningSignal(),
					"ownedAttribute", (String) null, 0, -1, Signal.class, false, false, true, true, true, false, true,
					false, true);
			this.initEReference(this.getSignal__signalEventOfSignal(), this.getSignalEvent(),
					this.getSignalEvent_Signal(), "_signalEventOfSignal", (String) null, 0, -1, Signal.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getSignal__sendSignalActionOfSignal(), this.getSendSignalAction(),
					this.getSendSignalAction_Signal(), "_sendSignalActionOfSignal", (String) null, 0, -1, Signal.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getSignal__broadcastSignalActionOfSignal(), this.getBroadcastSignalAction(),
					this.getBroadcastSignalAction_Signal(), "_broadcastSignalActionOfSignal", (String) null, 0, -1,
					Signal.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getSignal__receptionOfSignal(), this.getReception(), this.getReception_Signal(),
					"_receptionOfSignal", (String) null, 0, -1, Signal.class, false, false, true, false, true, false,
					true, false, false);
			this.initEClass(this.signalEventEClass, SignalEvent.class, "SignalEvent", false, false, true);
			this.initEReference(this.getSignalEvent_Signal(), this.getSignal(), this.getSignal__signalEventOfSignal(),
					"signal", (String) null, 1, 1, SignalEvent.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.messageEventEClass, MessageEvent.class, "MessageEvent", true, false, true);
			this.initEClass(this.eventEClass, Event.class, "Event", true, false, true);
			this.initEReference(this.getEvent__triggerOfEvent(), this.getTrigger(), this.getTrigger_Event(),
					"_triggerOfEvent", (String) null, 0, -1, Event.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getEvent_Behavior(), this.getBehavior(), this.getBehavior_Event(), "behavior",
					(String) null, 0, 1, Event.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.triggerEClass, Trigger.class, "Trigger", false, false, true);
			this.initEReference(this.getTrigger_Port(), this.getPort(), this.getPort__triggerOfPort(), "port",
					(String) null, 0, -1, Trigger.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTrigger__stateOfDeferrableTrigger(), this.getState(),
					this.getState_DeferrableTrigger(), "_stateOfDeferrableTrigger", (String) null, 0, 1, Trigger.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTrigger__transitionOfTrigger(), this.getTransition(),
					this.getTransition_Trigger(), "_transitionOfTrigger", (String) null, 0, 1, Trigger.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getTrigger__acceptEventActionOfTrigger(), this.getAcceptEventAction(),
					this.getAcceptEventAction_Trigger(), "_acceptEventActionOfTrigger", (String) null, 0, 1,
					Trigger.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTrigger__replyActionOfReplyToCall(), this.getReplyAction(),
					this.getReplyAction_ReplyToCall(), "_replyActionOfReplyToCall", (String) null, 0, -1, Trigger.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTrigger_Event(), this.getEvent(), this.getEvent__triggerOfEvent(), "event",
					(String) null, 1, 1, Trigger.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.portEClass, Port.class, "Port", false, false, true);
			this.initEAttribute(this.getPort_Behavior(), this.getBoolean(), "isBehavior", "false", 1, 1, Port.class,
					false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getPort_Conjugated(), this.getBoolean(), "isConjugated", "false", 1, 1, Port.class,
					false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getPort_Service(), this.getBoolean(), "isService", "true", 1, 1, Port.class, false,
					false, true, false, false, true, false, false);
			this.initEReference(this.getPort_Protocol(), this.getProtocolStateMachine(),
					this.getProtocolStateMachine__portOfProtocol(), "protocol", (String) null, 0, 1, Port.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getPort_Provided(), this.getInterface(), this.getInterface__portOfProvided(),
					"provided", (String) null, 0, -1, Port.class, true, true, false, false, true, false, true, true,
					false);
			this.initEReference(this.getPort_RedefinedPort(), this.getPort(), this.getPort__portOfRedefinedPort(),
					"redefinedPort", (String) null, 0, -1, Port.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getPort__portOfRedefinedPort(), this.getPort(), this.getPort_RedefinedPort(),
					"_portOfRedefinedPort", (String) null, 0, -1, Port.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getPort_Required(), this.getInterface(), this.getInterface__portOfRequired(),
					"required", (String) null, 0, -1, Port.class, true, true, false, false, true, false, true, true,
					false);
			this.initEReference(this.getPort__encapsulatedClassifierOfOwnedPort(), this.getEncapsulatedClassifier(),
					this.getEncapsulatedClassifier_OwnedPort(), "_encapsulatedClassifierOfOwnedPort", (String) null, 0,
					1, Port.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getPort__invocationActionOfOnPort(), this.getInvocationAction(),
					this.getInvocationAction_OnPort(), "_invocationActionOfOnPort", (String) null, 0, -1, Port.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPort__triggerOfPort(), this.getTrigger(), this.getTrigger_Port(),
					"_triggerOfPort", (String) null, 0, -1, Port.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.protocolStateMachineEClass, ProtocolStateMachine.class, "ProtocolStateMachine", false,
					false, true);
			this.initEReference(this.getProtocolStateMachine_Conformance(), this.getProtocolConformance(),
					this.getProtocolConformance_SpecificMachine(), "conformance", (String) null, 0, -1,
					ProtocolStateMachine.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getProtocolStateMachine__protocolConformanceOfGeneralMachine(),
					this.getProtocolConformance(), this.getProtocolConformance_GeneralMachine(),
					"_protocolConformanceOfGeneralMachine", (String) null, 0, -1, ProtocolStateMachine.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getProtocolStateMachine_Interface(), this.getInterface(),
					this.getInterface_Protocol(), "interface", (String) null, 0, 1, ProtocolStateMachine.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getProtocolStateMachine__portOfProtocol(), this.getPort(), this.getPort_Protocol(),
					"_portOfProtocol", (String) null, 0, -1, ProtocolStateMachine.class, false, false, true, false,
					true, false, true, false, false);
			this.initEClass(this.protocolConformanceEClass, ProtocolConformance.class, "ProtocolConformance", false,
					false, true);
			this.initEReference(this.getProtocolConformance_GeneralMachine(), this.getProtocolStateMachine(),
					this.getProtocolStateMachine__protocolConformanceOfGeneralMachine(), "generalMachine",
					(String) null, 1, 1, ProtocolConformance.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getProtocolConformance_SpecificMachine(), this.getProtocolStateMachine(),
					this.getProtocolStateMachine_Conformance(), "specificMachine", (String) null, 1, 1,
					ProtocolConformance.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.encapsulatedClassifierEClass, EncapsulatedClassifier.class, "EncapsulatedClassifier",
					true, false, true);
			this.initEReference(this.getEncapsulatedClassifier_OwnedPort(), this.getPort(),
					this.getPort__encapsulatedClassifierOfOwnedPort(), "ownedPort", (String) null, 0, -1,
					EncapsulatedClassifier.class, true, true, false, false, true, false, true, true, false);
			this.initEClass(this.structuredClassifierEClass, StructuredClassifier.class, "StructuredClassifier", true,
					false, true);
			this.initEReference(this.getStructuredClassifier_OwnedAttribute(), this.getProperty(),
					this.getProperty__structuredClassifierOfOwnedAttribute(), "ownedAttribute", (String) null, 0, -1,
					StructuredClassifier.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getStructuredClassifier_OwnedConnector(), this.getConnector(),
					this.getConnector__structuredClassifierOfOwnedConnector(), "ownedConnector", (String) null, 0, -1,
					StructuredClassifier.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStructuredClassifier_Part(), this.getProperty(),
					this.getProperty__structuredClassifierOfPart(), "part", (String) null, 0, -1,
					StructuredClassifier.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getStructuredClassifier_Role(), this.getConnectableElement(),
					this.getConnectableElement__structuredClassifierOfRole(), "role", (String) null, 0, -1,
					StructuredClassifier.class, true, true, true, false, true, false, true, true, false);
			this.initEClass(this.connectorEClass, Connector.class, "Connector", false, false, true);
			this.initEReference(this.getConnector_Contract(), this.getBehavior(),
					this.getBehavior__connectorOfContract(), "contract", (String) null, 0, -1, Connector.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnector_End(), this.getConnectorEnd(), this.getConnectorEnd__connectorOfEnd(),
					"end", (String) null, 2, -1, Connector.class, false, false, true, true, true, false, true, false,
					true);
			this.initEAttribute(this.getConnector_Kind(), this.getConnectorKind(), "kind", (String) null, 1, 1,
					Connector.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getConnector_RedefinedConnector(), this.getConnector(),
					this.getConnector__connectorOfRedefinedConnector(), "redefinedConnector", (String) null, 0, -1,
					Connector.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnector__connectorOfRedefinedConnector(), this.getConnector(),
					this.getConnector_RedefinedConnector(), "_connectorOfRedefinedConnector", (String) null, 0, -1,
					Connector.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnector_Type(), this.getAssociation(), this.getAssociation__connectorOfType(),
					"type", (String) null, 0, 1, Connector.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getConnector__messageOfConnector(), this.getMessage(), this.getMessage_Connector(),
					"_messageOfConnector", (String) null, 0, -1, Connector.class, false, false, true, false, true,
					false, true, false, false);
			this.initEReference(this.getConnector__informationFlowOfRealizingConnector(), this.getInformationFlow(),
					this.getInformationFlow_RealizingConnector(), "_informationFlowOfRealizingConnector", (String) null,
					0, -1, Connector.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnector__structuredClassifierOfOwnedConnector(),
					this.getStructuredClassifier(), this.getStructuredClassifier_OwnedConnector(),
					"_structuredClassifierOfOwnedConnector", (String) null, 0, 1, Connector.class, false, false, true,
					false, true, false, true, false, false);
			this.initEClass(this.connectorEndEClass, ConnectorEnd.class, "ConnectorEnd", false, false, true);
			this.initEReference(this.getConnectorEnd_DefiningEnd(), this.getProperty(),
					this.getProperty__connectorEndOfDefiningEnd(), "definingEnd", (String) null, 0, 1,
					ConnectorEnd.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getConnectorEnd_PartWithPort(), this.getProperty(),
					this.getProperty__connectorEndOfPartWithPort(), "partWithPort", (String) null, 0, 1,
					ConnectorEnd.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getConnectorEnd_Role(), this.getConnectableElement(),
					this.getConnectableElement_End(), "role", (String) null, 1, 1, ConnectorEnd.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getConnectorEnd__connectorOfEnd(), this.getConnector(), this.getConnector_End(),
					"_connectorOfEnd", (String) null, 1, 1, ConnectorEnd.class, false, false, true, false, true, false,
					true, false, false);
			this.initEClass(this.messageEClass, Message.class, "Message", false, false, true);
			this.initEReference(this.getMessage_Argument(), this.getValueSpecification(),
					this.getValueSpecification__messageOfArgument(), "argument", (String) null, 0, -1, Message.class,
					false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getMessage_Interaction(), this.getInteraction(), this.getInteraction_Message(),
					"interaction", (String) null, 1, 1, Message.class, false, false, true, false, true, false, true,
					false, false);
			this.initEAttribute(this.getMessage_MessageKind(), this.getMessageKind(), "messageKind", (String) null, 1,
					1, Message.class, true, true, false, false, false, true, true, false);
			this.initEAttribute(this.getMessage_MessageSort(), this.getMessageSort(), "messageSort", "synchCall", 1, 1,
					Message.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getMessage_ReceiveEvent(), this.getMessageEnd(),
					this.getMessageEnd__messageOfReceiveEvent(), "receiveEvent", (String) null, 0, 1, Message.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage__messageEndOfMessage(), this.getMessageEnd(),
					this.getMessageEnd_Message(), "_messageEndOfMessage", (String) null, 0, 2, Message.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage_SendEvent(), this.getMessageEnd(),
					this.getMessageEnd__messageOfSendEvent(), "sendEvent", (String) null, 0, 1, Message.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage_Signature(), this.getNamedElement(),
					this.getNamedElement__messageOfSignature(), "signature", (String) null, 0, 1, Message.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage_Guard(), this.getConstraint(), this.getConstraint__messageOfGuard(),
					"guard", (String) null, 0, 1, Message.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getMessage_Target(), this.getValueSpecification(),
					this.getValueSpecification__messageOfTarget(), "target", (String) null, 0, 1, Message.class, false,
					false, true, true, true, false, true, false, false);
			this.initEReference(this.getMessage_ReplyMessage(), this.getMessage(),
					this.getMessage__messageOfReplyMessage(), "replyMessage", (String) null, 0, 1, Message.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage__messageOfReplyMessage(), this.getMessage(),
					this.getMessage_ReplyMessage(), "_messageOfReplyMessage", (String) null, 0, -1, Message.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage__informationFlowOfRealizingMessage(), this.getInformationFlow(),
					this.getInformationFlow_RealizingMessage(), "_informationFlowOfRealizingMessage", (String) null, 0,
					-1, Message.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessage_Connector(), this.getConnector(),
					this.getConnector__messageOfConnector(), "connector", (String) null, 0, 1, Message.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.messageEndEClass, MessageEnd.class, "MessageEnd", true, false, true);
			this.initEReference(this.getMessageEnd_Message(), this.getMessage(), this.getMessage__messageEndOfMessage(),
					"message", (String) null, 0, 1, MessageEnd.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getMessageEnd__messageOfSendEvent(), this.getMessage(),
					this.getMessage_SendEvent(), "_messageOfSendEvent", (String) null, 0, 1, MessageEnd.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getMessageEnd__messageOfReceiveEvent(), this.getMessage(),
					this.getMessage_ReceiveEvent(), "_messageOfReceiveEvent", (String) null, 0, 1, MessageEnd.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.invocationActionEClass, InvocationAction.class, "InvocationAction", true, false, true);
			this.initEReference(this.getInvocationAction_Argument(), this.getInputPin(),
					this.getInputPin__invocationActionOfArgument(), "argument", (String) null, 0, -1,
					InvocationAction.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getInvocationAction_OnPort(), this.getPort(),
					this.getPort__invocationActionOfOnPort(), "onPort", (String) null, 0, 1, InvocationAction.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", false, false,
					true);
			this.initEAttribute(this.getAcceptEventAction_Unmarshall(), this.getBoolean(), "isUnmarshall", "false", 1,
					1, AcceptEventAction.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getAcceptEventAction_Result(), this.getOutputPin(),
					this.getOutputPin__acceptEventActionOfResult(), "result", (String) null, 0, -1,
					AcceptEventAction.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getAcceptEventAction_Trigger(), this.getTrigger(),
					this.getTrigger__acceptEventActionOfTrigger(), "trigger", (String) null, 1, -1,
					AcceptEventAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.outputPinEClass, OutputPin.class, "OutputPin", false, false, true);
			this.initEReference(this.getOutputPin__structuredActivityNodeOfStructuredNodeOutput(),
					this.getStructuredActivityNode(), this.getStructuredActivityNode_StructuredNodeOutput(),
					"_structuredActivityNodeOfStructuredNodeOutput", (String) null, 0, 1, OutputPin.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readExtentActionOfResult(), this.getReadExtentAction(),
					this.getReadExtentAction_Result(), "_readExtentActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__conditionalNodeOfResult(), this.getConditionalNode(),
					this.getConditionalNode_Result(), "_conditionalNodeOfResult", (String) null, 0, 1, OutputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__clauseOfBodyOutput(), this.getClause(), this.getClause_BodyOutput(),
					"_clauseOfBodyOutput", (String) null, 0, -1, OutputPin.class, false, false, true, false, true,
					false, true, false, false);
			this.initEReference(this.getOutputPin__clauseOfDecider(), this.getClause(), this.getClause_Decider(),
					"_clauseOfDecider", (String) null, 0, 1, OutputPin.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getOutputPin__loopNodeOfLoopVariable(), this.getLoopNode(),
					this.getLoopNode_LoopVariable(), "_loopNodeOfLoopVariable", (String) null, 0, 1, OutputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__loopNodeOfBodyOutput(), this.getLoopNode(),
					this.getLoopNode_BodyOutput(), "_loopNodeOfBodyOutput", (String) null, 0, -1, OutputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__loopNodeOfDecider(), this.getLoopNode(), this.getLoopNode_Decider(),
					"_loopNodeOfDecider", (String) null, 0, 1, OutputPin.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getOutputPin__loopNodeOfResult(), this.getLoopNode(), this.getLoopNode_Result(),
					"_loopNodeOfResult", (String) null, 0, 1, OutputPin.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getOutputPin__reduceActionOfResult(), this.getReduceAction(),
					this.getReduceAction_Result(), "_reduceActionOfResult", (String) null, 0, 1, OutputPin.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__actionOfOutput(), this.getAction(), this.getAction_Output(),
					"_actionOfOutput", (String) null, 0, 1, OutputPin.class, true, true, true, false, true, false, true,
					true, false);
			this.initEReference(this.getOutputPin__createObjectActionOfResult(), this.getCreateObjectAction(),
					this.getCreateObjectAction_Result(), "_createObjectActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__unmarshallActionOfResult(), this.getUnmarshallAction(),
					this.getUnmarshallAction_Result(), "_unmarshallActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__opaqueActionOfOutputValue(), this.getOpaqueAction(),
					this.getOpaqueAction_OutputValue(), "_opaqueActionOfOutputValue", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readLinkActionOfResult(), this.getReadLinkAction(),
					this.getReadLinkAction_Result(), "_readLinkActionOfResult", (String) null, 0, 1, OutputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readLinkObjectEndActionOfResult(), this.getReadLinkObjectEndAction(),
					this.getReadLinkObjectEndAction_Result(), "_readLinkObjectEndActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__acceptCallActionOfReturnInformation(), this.getAcceptCallAction(),
					this.getAcceptCallAction_ReturnInformation(), "_acceptCallActionOfReturnInformation", (String) null,
					0, 1, OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__writeStructuralFeatureActionOfResult(),
					this.getWriteStructuralFeatureAction(), this.getWriteStructuralFeatureAction_Result(),
					"_writeStructuralFeatureActionOfResult", (String) null, 0, 1, OutputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__createLinkObjectActionOfResult(), this.getCreateLinkObjectAction(),
					this.getCreateLinkObjectAction_Result(), "_createLinkObjectActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readStructuralFeatureActionOfResult(),
					this.getReadStructuralFeatureAction(), this.getReadStructuralFeatureAction_Result(),
					"_readStructuralFeatureActionOfResult", (String) null, 0, 1, OutputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__clearStructuralFeatureActionOfResult(),
					this.getClearStructuralFeatureAction(), this.getClearStructuralFeatureAction_Result(),
					"_clearStructuralFeatureActionOfResult", (String) null, 0, 1, OutputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__valueSpecificationActionOfResult(),
					this.getValueSpecificationAction(), this.getValueSpecificationAction_Result(),
					"_valueSpecificationActionOfResult", (String) null, 0, 1, OutputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__testIdentityActionOfResult(), this.getTestIdentityAction(),
					this.getTestIdentityAction_Result(), "_testIdentityActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readIsClassifiedObjectActionOfResult(),
					this.getReadIsClassifiedObjectAction(), this.getReadIsClassifiedObjectAction_Result(),
					"_readIsClassifiedObjectActionOfResult", (String) null, 0, 1, OutputPin.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__callActionOfResult(), this.getCallAction(),
					this.getCallAction_Result(), "_callActionOfResult", (String) null, 0, 1, OutputPin.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readSelfActionOfResult(), this.getReadSelfAction(),
					this.getReadSelfAction_Result(), "_readSelfActionOfResult", (String) null, 0, 1, OutputPin.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readVariableActionOfResult(), this.getReadVariableAction(),
					this.getReadVariableAction_Result(), "_readVariableActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__readLinkObjectEndQualifierActionOfResult(),
					this.getReadLinkObjectEndQualifierAction(), this.getReadLinkObjectEndQualifierAction_Result(),
					"_readLinkObjectEndQualifierActionOfResult", (String) null, 0, 1, OutputPin.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getOutputPin__acceptEventActionOfResult(), this.getAcceptEventAction(),
					this.getAcceptEventAction_Result(), "_acceptEventActionOfResult", (String) null, 0, 1,
					OutputPin.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.readExtentActionEClass, ReadExtentAction.class, "ReadExtentAction", false, false,
					true);
			this.initEReference(this.getReadExtentAction_Classifier(), this.getClassifier(),
					this.getClassifier__readExtentActionOfClassifier(), "classifier", (String) null, 1, 1,
					ReadExtentAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReadExtentAction_Result(), this.getOutputPin(),
					this.getOutputPin__readExtentActionOfResult(), "result", (String) null, 1, 1,
					ReadExtentAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", false, false, true);
			this.initEReference(this.getConditionalNode_Clause(), this.getClause(),
					this.getClause__conditionalNodeOfClause(), "clause", (String) null, 1, -1, ConditionalNode.class,
					false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getConditionalNode_Assured(), this.getBoolean(), "isAssured", "false", 1, 1,
					ConditionalNode.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getConditionalNode_Determinate(), this.getBoolean(), "isDeterminate", "false", 1,
					1, ConditionalNode.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getConditionalNode_Result(), this.getOutputPin(),
					this.getOutputPin__conditionalNodeOfResult(), "result", (String) null, 0, -1, ConditionalNode.class,
					true, false, true, true, true, false, true, false, true);
			this.initEClass(this.clauseEClass, Clause.class, "Clause", false, false, true);
			this.initEReference(this.getClause_Body(), this.getExecutableNode(), this.getExecutableNode__clauseOfBody(),
					"body", (String) null, 0, -1, Clause.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getClause_BodyOutput(), this.getOutputPin(),
					this.getOutputPin__clauseOfBodyOutput(), "bodyOutput", (String) null, 0, -1, Clause.class, false,
					false, true, false, true, false, true, false, true);
			this.initEReference(this.getClause_Decider(), this.getOutputPin(), this.getOutputPin__clauseOfDecider(),
					"decider", (String) null, 1, 1, Clause.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getClause_PredecessorClause(), this.getClause(), this.getClause_SuccessorClause(),
					"predecessorClause", (String) null, 0, -1, Clause.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getClause_SuccessorClause(), this.getClause(), this.getClause_PredecessorClause(),
					"successorClause", (String) null, 0, -1, Clause.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getClause_Test(), this.getExecutableNode(), this.getExecutableNode__clauseOfTest(),
					"test", (String) null, 1, -1, Clause.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getClause__conditionalNodeOfClause(), this.getConditionalNode(),
					this.getConditionalNode_Clause(), "_conditionalNodeOfClause", (String) null, 1, 1, Clause.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.loopNodeEClass, LoopNode.class, "LoopNode", false, false, true);
			this.initEReference(this.getLoopNode_BodyOutput(), this.getOutputPin(),
					this.getOutputPin__loopNodeOfBodyOutput(), "bodyOutput", (String) null, 0, -1, LoopNode.class,
					false, false, true, false, true, false, true, false, true);
			this.initEReference(this.getLoopNode_BodyPart(), this.getExecutableNode(),
					this.getExecutableNode__loopNodeOfBodyPart(), "bodyPart", (String) null, 0, -1, LoopNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getLoopNode_Decider(), this.getOutputPin(), this.getOutputPin__loopNodeOfDecider(),
					"decider", (String) null, 1, 1, LoopNode.class, false, false, true, false, true, false, true, false,
					false);
			this.initEAttribute(this.getLoopNode_TestedFirst(), this.getBoolean(), "isTestedFirst", "false", 1, 1,
					LoopNode.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getLoopNode_LoopVariableInput(), this.getInputPin(),
					this.getInputPin__loopNodeOfLoopVariableInput(), "loopVariableInput", (String) null, 0, -1,
					LoopNode.class, true, false, true, true, true, false, true, false, true);
			this.initEReference(this.getLoopNode_Result(), this.getOutputPin(), this.getOutputPin__loopNodeOfResult(),
					"result", (String) null, 0, -1, LoopNode.class, true, false, true, true, true, false, true, false,
					true);
			this.initEReference(this.getLoopNode_SetupPart(), this.getExecutableNode(),
					this.getExecutableNode__loopNodeOfSetupPart(), "setupPart", (String) null, 0, -1, LoopNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getLoopNode_Test(), this.getExecutableNode(),
					this.getExecutableNode__loopNodeOfTest(), "test", (String) null, 1, -1, LoopNode.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getLoopNode_LoopVariable(), this.getOutputPin(),
					this.getOutputPin__loopNodeOfLoopVariable(), "loopVariable", (String) null, 0, -1, LoopNode.class,
					false, false, true, true, true, false, true, false, true);
			this.initEClass(this.reduceActionEClass, ReduceAction.class, "ReduceAction", false, false, true);
			this.initEReference(this.getReduceAction_Collection(), this.getInputPin(),
					this.getInputPin__reduceActionOfCollection(), "collection", (String) null, 1, 1, ReduceAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getReduceAction_Ordered(), this.getBoolean(), "isOrdered", "false", 1, 1,
					ReduceAction.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getReduceAction_Reducer(), this.getBehavior(),
					this.getBehavior__reduceActionOfReducer(), "reducer", (String) null, 1, 1, ReduceAction.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReduceAction_Result(), this.getOutputPin(),
					this.getOutputPin__reduceActionOfResult(), "result", (String) null, 1, 1, ReduceAction.class, false,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", false, false,
					true);
			this.initEReference(this.getCreateObjectAction_Classifier(), this.getClassifier(),
					this.getClassifier__createObjectActionOfClassifier(), "classifier", (String) null, 1, 1,
					CreateObjectAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getCreateObjectAction_Result(), this.getOutputPin(),
					this.getOutputPin__createObjectActionOfResult(), "result", (String) null, 1, 1,
					CreateObjectAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.unmarshallActionEClass, UnmarshallAction.class, "UnmarshallAction", false, false,
					true);
			this.initEReference(this.getUnmarshallAction_Object(), this.getInputPin(),
					this.getInputPin__unmarshallActionOfObject(), "object", (String) null, 1, 1, UnmarshallAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getUnmarshallAction_UnmarshallType(), this.getClassifier(),
					this.getClassifier__unmarshallActionOfUnmarshallType(), "unmarshallType", (String) null, 1, 1,
					UnmarshallAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getUnmarshallAction_Result(), this.getOutputPin(),
					this.getOutputPin__unmarshallActionOfResult(), "result", (String) null, 1, -1,
					UnmarshallAction.class, false, false, true, true, true, false, true, false, true);
			this.initEClass(this.opaqueActionEClass, OpaqueAction.class, "OpaqueAction", false, false, true);
			this.initEAttribute(this.getOpaqueAction_Body(), this.getString(), "body", (String) null, 0, -1,
					OpaqueAction.class, false, false, true, false, false, false, false, true);
			this.initEReference(this.getOpaqueAction_InputValue(), this.getInputPin(),
					this.getInputPin__opaqueActionOfInputValue(), "inputValue", (String) null, 0, -1,
					OpaqueAction.class, false, false, true, true, true, false, true, false, false);
			this.initEAttribute(this.getOpaqueAction_Language(), this.getString(), "language", (String) null, 0, -1,
					OpaqueAction.class, false, false, true, false, false, true, false, true);
			this.initEReference(this.getOpaqueAction_OutputValue(), this.getOutputPin(),
					this.getOutputPin__opaqueActionOfOutputValue(), "outputValue", (String) null, 0, -1,
					OpaqueAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", false, false, true);
			this.initEReference(this.getReadLinkAction_Result(), this.getOutputPin(),
					this.getOutputPin__readLinkActionOfResult(), "result", (String) null, 1, 1, ReadLinkAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.linkActionEClass, LinkAction.class, "LinkAction", true, false, true);
			this.initEReference(this.getLinkAction_EndData(), this.getLinkEndData(),
					this.getLinkEndData__linkActionOfEndData(), "endData", (String) null, 2, -1, LinkAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getLinkAction_InputValue(), this.getInputPin(),
					this.getInputPin__linkActionOfInputValue(), "inputValue", (String) null, 1, -1, LinkAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.linkEndDataEClass, LinkEndData.class, "LinkEndData", false, false, true);
			this.initEReference(this.getLinkEndData_End(), this.getProperty(), this.getProperty__linkEndDataOfEnd(),
					"end", (String) null, 1, 1, LinkEndData.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getLinkEndData_Qualifier(), this.getQualifierValue(),
					this.getQualifierValue__linkEndDataOfQualifier(), "qualifier", (String) null, 0, -1,
					LinkEndData.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getLinkEndData_Value(), this.getInputPin(), this.getInputPin__linkEndDataOfValue(),
					"value", (String) null, 0, 1, LinkEndData.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getLinkEndData__linkActionOfEndData(), this.getLinkAction(),
					this.getLinkAction_EndData(), "_linkActionOfEndData", (String) null, 1, 1, LinkEndData.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.qualifierValueEClass, QualifierValue.class, "QualifierValue", false, false, true);
			this.initEReference(this.getQualifierValue_Qualifier(), this.getProperty(),
					this.getProperty__qualifierValueOfQualifier(), "qualifier", (String) null, 1, 1,
					QualifierValue.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getQualifierValue_Value(), this.getInputPin(),
					this.getInputPin__qualifierValueOfValue(), "value", (String) null, 1, 1, QualifierValue.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getQualifierValue__linkEndDataOfQualifier(), this.getLinkEndData(),
					this.getLinkEndData_Qualifier(), "_linkEndDataOfQualifier", (String) null, 1, 1,
					QualifierValue.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.readLinkObjectEndActionEClass, ReadLinkObjectEndAction.class,
					"ReadLinkObjectEndAction", false, false, true);
			this.initEReference(this.getReadLinkObjectEndAction_End(), this.getProperty(),
					this.getProperty__readLinkObjectEndActionOfEnd(), "end", (String) null, 1, 1,
					ReadLinkObjectEndAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReadLinkObjectEndAction_Object(), this.getInputPin(),
					this.getInputPin__readLinkObjectEndActionOfObject(), "object", (String) null, 1, 1,
					ReadLinkObjectEndAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getReadLinkObjectEndAction_Result(), this.getOutputPin(),
					this.getOutputPin__readLinkObjectEndActionOfResult(), "result", (String) null, 1, 1,
					ReadLinkObjectEndAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.acceptCallActionEClass, AcceptCallAction.class, "AcceptCallAction", false, false,
					true);
			this.initEReference(this.getAcceptCallAction_ReturnInformation(), this.getOutputPin(),
					this.getOutputPin__acceptCallActionOfReturnInformation(), "returnInformation", (String) null, 1, 1,
					AcceptCallAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class,
					"WriteStructuralFeatureAction", true, false, true);
			this.initEReference(this.getWriteStructuralFeatureAction_Value(), this.getInputPin(),
					this.getInputPin__writeStructuralFeatureActionOfValue(), "value", (String) null, 0, 1,
					WriteStructuralFeatureAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getWriteStructuralFeatureAction_Result(), this.getOutputPin(),
					this.getOutputPin__writeStructuralFeatureActionOfResult(), "result", (String) null, 0, 1,
					WriteStructuralFeatureAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.createLinkObjectActionEClass, CreateLinkObjectAction.class, "CreateLinkObjectAction",
					false, false, true);
			this.initEReference(this.getCreateLinkObjectAction_Result(), this.getOutputPin(),
					this.getOutputPin__createLinkObjectActionOfResult(), "result", (String) null, 1, 1,
					CreateLinkObjectAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", false, false,
					true);
			this.initEReference(this.getCreateLinkAction_EndData(), this.getLinkEndCreationData(),
					this.getLinkEndCreationData__createLinkActionOfEndData(), "endData__from_CreateLinkAction",
					(String) null, 2, -1, CreateLinkAction.class, true, false, true, true, true, false, true, false,
					false);
			this.initEClass(this.writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", true, false, true);
			this.initEClass(this.linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", false,
					false, true);
			this.initEReference(this.getLinkEndCreationData_InsertAt(), this.getInputPin(),
					this.getInputPin__linkEndCreationDataOfInsertAt(), "insertAt", (String) null, 0, 1,
					LinkEndCreationData.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getLinkEndCreationData_ReplaceAll(), this.getBoolean(), "isReplaceAll", "false", 1,
					1, LinkEndCreationData.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getLinkEndCreationData__createLinkActionOfEndData(), this.getCreateLinkAction(),
					this.getCreateLinkAction_EndData(), "_createLinkActionOfEndData", (String) null, 1, 1,
					LinkEndCreationData.class, true, true, true, false, true, false, true, false, false);
			this.initEClass(this.readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class,
					"ReadStructuralFeatureAction", false, false, true);
			this.initEReference(this.getReadStructuralFeatureAction_Result(), this.getOutputPin(),
					this.getOutputPin__readStructuralFeatureActionOfResult(), "result", (String) null, 1, 1,
					ReadStructuralFeatureAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class,
					"ClearStructuralFeatureAction", false, false, true);
			this.initEReference(this.getClearStructuralFeatureAction_Result(), this.getOutputPin(),
					this.getOutputPin__clearStructuralFeatureActionOfResult(), "result", (String) null, 0, 1,
					ClearStructuralFeatureAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.valueSpecificationActionEClass, ValueSpecificationAction.class,
					"ValueSpecificationAction", false, false, true);
			this.initEReference(this.getValueSpecificationAction_Value(), this.getValueSpecification(),
					this.getValueSpecification__valueSpecificationActionOfValue(), "value", (String) null, 1, 1,
					ValueSpecificationAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getValueSpecificationAction_Result(), this.getOutputPin(),
					this.getOutputPin__valueSpecificationActionOfResult(), "result", (String) null, 1, 1,
					ValueSpecificationAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", false, false,
					true);
			this.initEReference(this.getTestIdentityAction_First(), this.getInputPin(),
					this.getInputPin__testIdentityActionOfFirst(), "first", (String) null, 1, 1,
					TestIdentityAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getTestIdentityAction_Second(), this.getInputPin(),
					this.getInputPin__testIdentityActionOfSecond(), "second", (String) null, 1, 1,
					TestIdentityAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getTestIdentityAction_Result(), this.getOutputPin(),
					this.getOutputPin__testIdentityActionOfResult(), "result", (String) null, 1, 1,
					TestIdentityAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.readIsClassifiedObjectActionEClass, ReadIsClassifiedObjectAction.class,
					"ReadIsClassifiedObjectAction", false, false, true);
			this.initEReference(this.getReadIsClassifiedObjectAction_Classifier(), this.getClassifier(),
					this.getClassifier__readIsClassifiedObjectActionOfClassifier(), "classifier", (String) null, 1, 1,
					ReadIsClassifiedObjectAction.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getReadIsClassifiedObjectAction_Direct(), this.getBoolean(), "isDirect", "false",
					1, 1, ReadIsClassifiedObjectAction.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getReadIsClassifiedObjectAction_Object(), this.getInputPin(),
					this.getInputPin__readIsClassifiedObjectActionOfObject(), "object", (String) null, 1, 1,
					ReadIsClassifiedObjectAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getReadIsClassifiedObjectAction_Result(), this.getOutputPin(),
					this.getOutputPin__readIsClassifiedObjectActionOfResult(), "result", (String) null, 1, 1,
					ReadIsClassifiedObjectAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.callActionEClass, CallAction.class, "CallAction", true, false, true);
			this.initEAttribute(this.getCallAction_Synchronous(), this.getBoolean(), "isSynchronous", "true", 1, 1,
					CallAction.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getCallAction_Result(), this.getOutputPin(),
					this.getOutputPin__callActionOfResult(), "result", (String) null, 0, -1, CallAction.class, false,
					false, true, true, true, false, true, false, true);
			this.initEClass(this.readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", false, false, true);
			this.initEReference(this.getReadSelfAction_Result(), this.getOutputPin(),
					this.getOutputPin__readSelfActionOfResult(), "result", (String) null, 1, 1, ReadSelfAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.readVariableActionEClass, ReadVariableAction.class, "ReadVariableAction", false, false,
					true);
			this.initEReference(this.getReadVariableAction_Result(), this.getOutputPin(),
					this.getOutputPin__readVariableActionOfResult(), "result", (String) null, 1, 1,
					ReadVariableAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.variableActionEClass, VariableAction.class, "VariableAction", true, false, true);
			this.initEReference(this.getVariableAction_Variable(), this.getVariable(),
					this.getVariable__variableActionOfVariable(), "variable", (String) null, 1, 1, VariableAction.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.readLinkObjectEndQualifierActionEClass, ReadLinkObjectEndQualifierAction.class,
					"ReadLinkObjectEndQualifierAction", false, false, true);
			this.initEReference(this.getReadLinkObjectEndQualifierAction_Object(), this.getInputPin(),
					this.getInputPin__readLinkObjectEndQualifierActionOfObject(), "object", (String) null, 1, 1,
					ReadLinkObjectEndQualifierAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getReadLinkObjectEndQualifierAction_Qualifier(), this.getProperty(),
					this.getProperty__readLinkObjectEndQualifierActionOfQualifier(), "qualifier", (String) null, 1, 1,
					ReadLinkObjectEndQualifierAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReadLinkObjectEndQualifierAction_Result(), this.getOutputPin(),
					this.getOutputPin__readLinkObjectEndQualifierActionOfResult(), "result", (String) null, 1, 1,
					ReadLinkObjectEndQualifierAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.replyActionEClass, ReplyAction.class, "ReplyAction", false, false, true);
			this.initEReference(this.getReplyAction_ReplyValue(), this.getInputPin(),
					this.getInputPin__replyActionOfReplyValue(), "replyValue", (String) null, 0, -1, ReplyAction.class,
					false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getReplyAction_ReturnInformation(), this.getInputPin(),
					this.getInputPin__replyActionOfReturnInformation(), "returnInformation", (String) null, 1, 1,
					ReplyAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getReplyAction_ReplyToCall(), this.getTrigger(),
					this.getTrigger__replyActionOfReplyToCall(), "replyToCall", (String) null, 1, 1, ReplyAction.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", false, false,
					true);
			this.initEReference(this.getSendSignalAction_Target(), this.getInputPin(),
					this.getInputPin__sendSignalActionOfTarget(), "target", (String) null, 1, 1, SendSignalAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getSendSignalAction_Signal(), this.getSignal(),
					this.getSignal__sendSignalActionOfSignal(), "signal", (String) null, 1, 1, SendSignalAction.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.broadcastSignalActionEClass, BroadcastSignalAction.class, "BroadcastSignalAction",
					false, false, true);
			this.initEReference(this.getBroadcastSignalAction_Signal(), this.getSignal(),
					this.getSignal__broadcastSignalActionOfSignal(), "signal", (String) null, 1, 1,
					BroadcastSignalAction.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.interfaceRealizationEClass, InterfaceRealization.class, "InterfaceRealization", false,
					false, true);
			this.initEReference(this.getInterfaceRealization_ImplementingClassifier(), this.getBehavioredClassifier(),
					this.getBehavioredClassifier_InterfaceRealization(), "implementingClassifier", (String) null, 1, 1,
					InterfaceRealization.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInterfaceRealization_Contract(), this.getInterface(),
					this.getInterface__interfaceRealizationOfContract(), "contract", (String) null, 1, 1,
					InterfaceRealization.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.realizationEClass, Realization.class, "Realization", false, false, true);
			this.initEClass(this.abstractionEClass, Abstraction.class, "Abstraction", false, false, true);
			this.initEReference(this.getAbstraction_Mapping(), this.getOpaqueExpression(),
					this.getOpaqueExpression__abstractionOfMapping(), "mapping", (String) null, 0, 1, Abstraction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.dependencyEClass, Dependency.class, "Dependency", false, false, true);
			this.initEReference(this.getDependency_Client(), this.getNamedElement(),
					this.getNamedElement_ClientDependency(), "client", (String) null, 1, -1, Dependency.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getDependency_Supplier(), this.getNamedElement(),
					this.getNamedElement_SupplierDependency(), "supplier", (String) null, 1, -1, Dependency.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getDependency__collaborationUseOfRoleBinding(), this.getCollaborationUse(),
					this.getCollaborationUse_RoleBinding(), "_collaborationUseOfRoleBinding", (String) null, 0, 1,
					Dependency.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.collaborationUseEClass, CollaborationUse.class, "CollaborationUse", false, false,
					true);
			this.initEReference(this.getCollaborationUse_Type(), this.getCollaboration(),
					this.getCollaboration__collaborationUseOfType(), "type", (String) null, 1, 1,
					CollaborationUse.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getCollaborationUse__classifierOfRepresentation(), this.getClassifier(),
					this.getClassifier_Representation(), "_classifierOfRepresentation", (String) null, 0, 1,
					CollaborationUse.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getCollaborationUse__classifierOfCollaborationUse(), this.getClassifier(),
					this.getClassifier_CollaborationUse(), "_classifierOfCollaborationUse", (String) null, 0, 1,
					CollaborationUse.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getCollaborationUse_RoleBinding(), this.getDependency(),
					this.getDependency__collaborationUseOfRoleBinding(), "roleBinding", (String) null, 0, -1,
					CollaborationUse.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.collaborationEClass, Collaboration.class, "Collaboration", false, false, true);
			this.initEReference(this.getCollaboration_CollaborationRole(), this.getConnectableElement(),
					this.getConnectableElement__collaborationOfCollaborationRole(), "collaborationRole", (String) null,
					0, -1, Collaboration.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getCollaboration__collaborationUseOfType(), this.getCollaborationUse(),
					this.getCollaborationUse_Type(), "_collaborationUseOfType", (String) null, 0, -1,
					Collaboration.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", false, false,
					true);
			this.initEReference(this.getOpaqueExpression_Behavior(), this.getBehavior(),
					this.getBehavior__opaqueExpressionOfBehavior(), "behavior", (String) null, 0, 1,
					OpaqueExpression.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getOpaqueExpression_Body(), this.getString(), "body", (String) null, 0, -1,
					OpaqueExpression.class, false, false, true, false, false, false, false, true);
			this.initEAttribute(this.getOpaqueExpression_Language(), this.getString(), "language", (String) null, 0, -1,
					OpaqueExpression.class, false, false, true, false, false, true, false, true);
			this.initEReference(this.getOpaqueExpression_Result(), this.getParameter(),
					this.getParameter__opaqueExpressionOfResult(), "result", (String) null, 0, 1,
					OpaqueExpression.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getOpaqueExpression__abstractionOfMapping(), this.getAbstraction(),
					this.getAbstraction_Mapping(), "_abstractionOfMapping", (String) null, 0, 1, OpaqueExpression.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.componentEClass, Component.class, "Component", false, false, true);
			this.initEAttribute(this.getComponent_IndirectlyInstantiated(), this.getBoolean(),
					"isIndirectlyInstantiated", "true", 1, 1, Component.class, false, false, true, false, false, true,
					false, false);
			this.initEReference(this.getComponent_PackagedElement(), this.getPackageableElement(),
					this.getPackageableElement__componentOfPackagedElement(), "packagedElement", (String) null, 0, -1,
					Component.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getComponent_Realization(), this.getComponentRealization(),
					this.getComponentRealization_Abstraction(), "realization", (String) null, 0, -1, Component.class,
					false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getComponent_Required(), this.getInterface(),
					this.getInterface__componentOfRequired(), "required", (String) null, 0, -1, Component.class, true,
					true, false, false, true, false, true, true, false);
			this.initEReference(this.getComponent_Provided(), this.getInterface(),
					this.getInterface__componentOfProvided(), "provided", (String) null, 0, -1, Component.class, true,
					true, false, false, true, false, true, true, false);
			this.initEClass(this.componentRealizationEClass, ComponentRealization.class, "ComponentRealization", false,
					false, true);
			this.initEReference(this.getComponentRealization_RealizingClassifier(), this.getClassifier(),
					this.getClassifier__componentRealizationOfRealizingClassifier(), "realizingClassifier",
					(String) null, 1, -1, ComponentRealization.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getComponentRealization_Abstraction(), this.getComponent(),
					this.getComponent_Realization(), "abstraction", (String) null, 0, 1, ComponentRealization.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.artifactEClass, Artifact.class, "Artifact", false, false, true);
			this.initEAttribute(this.getArtifact_FileName(), this.getString(), "fileName", "", 0, 1, Artifact.class,
					false, false, true, false, false, true, false, false);
			this.initEReference(this.getArtifact_Manifestation(), this.getManifestation(),
					this.getManifestation__artifactOfManifestation(), "manifestation", (String) null, 0, -1,
					Artifact.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getArtifact_NestedArtifact(), this.getArtifact(),
					this.getArtifact__artifactOfNestedArtifact(), "nestedArtifact", (String) null, 0, -1,
					Artifact.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getArtifact__artifactOfNestedArtifact(), this.getArtifact(),
					this.getArtifact_NestedArtifact(), "_artifactOfNestedArtifact", (String) null, 0, 1, Artifact.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getArtifact_OwnedOperation(), this.getOperation(),
					this.getOperation__artifactOfOwnedOperation(), "ownedOperation", (String) null, 0, -1,
					Artifact.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getArtifact_OwnedAttribute(), this.getProperty(),
					this.getProperty__artifactOfOwnedAttribute(), "ownedAttribute", (String) null, 0, -1,
					Artifact.class, false, false, true, true, true, false, true, false, true);
			this.initEClass(this.deployedArtifactEClass, DeployedArtifact.class, "DeployedArtifact", true, false, true);
			this.initEReference(this.getDeployedArtifact__deploymentOfDeployedArtifact(), this.getDeployment(),
					this.getDeployment_DeployedArtifact(), "_deploymentOfDeployedArtifact", (String) null, 0, -1,
					DeployedArtifact.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.deploymentEClass, Deployment.class, "Deployment", false, false, true);
			this.initEReference(this.getDeployment_Configuration(), this.getDeploymentSpecification(),
					this.getDeploymentSpecification_Deployment(), "configuration", (String) null, 0, -1,
					Deployment.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getDeployment_Location(), this.getDeploymentTarget(),
					this.getDeploymentTarget_Deployment(), "location", (String) null, 1, 1, Deployment.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getDeployment_DeployedArtifact(), this.getDeployedArtifact(),
					this.getDeployedArtifact__deploymentOfDeployedArtifact(), "deployedArtifact", (String) null, 0, -1,
					Deployment.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.deploymentSpecificationEClass, DeploymentSpecification.class,
					"DeploymentSpecification", false, false, true);
			this.initEAttribute(this.getDeploymentSpecification_DeploymentLocation(), this.getString(),
					"deploymentLocation", "", 0, 1, DeploymentSpecification.class, false, false, true, false, false,
					true, false, false);
			this.initEAttribute(this.getDeploymentSpecification_ExecutionLocation(), this.getString(),
					"executionLocation", "", 0, 1, DeploymentSpecification.class, false, false, true, false, false,
					true, false, false);
			this.initEReference(this.getDeploymentSpecification_Deployment(), this.getDeployment(),
					this.getDeployment_Configuration(), "deployment", (String) null, 0, 1,
					DeploymentSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.manifestationEClass, Manifestation.class, "Manifestation", false, false, true);
			this.initEReference(this.getManifestation_UtilizedElement(), this.getPackageableElement(),
					this.getPackageableElement__manifestationOfUtilizedElement(), "utilizedElement", (String) null, 1,
					1, Manifestation.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getManifestation__artifactOfManifestation(), this.getArtifact(),
					this.getArtifact_Manifestation(), "_artifactOfManifestation", (String) null, 1, 1,
					Manifestation.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.interactionUseEClass, InteractionUse.class, "InteractionUse", false, false, true);
			this.initEReference(this.getInteractionUse_ActualGate(), this.getGate(),
					this.getGate__interactionUseOfActualGate(), "actualGate", (String) null, 0, -1,
					InteractionUse.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteractionUse_Argument(), this.getValueSpecification(),
					this.getValueSpecification__interactionUseOfArgument(), "argument", (String) null, 0, -1,
					InteractionUse.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getInteractionUse_RefersTo(), this.getInteraction(),
					this.getInteraction__interactionUseOfRefersTo(), "refersTo", (String) null, 1, 1,
					InteractionUse.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInteractionUse_ReturnValue(), this.getValueSpecification(),
					this.getValueSpecification__interactionUseOfReturnValue(), "returnValue", (String) null, 0, 1,
					InteractionUse.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteractionUse_ReturnValueRecipient(), this.getProperty(),
					this.getProperty__interactionUseOfReturnValueRecipient(), "returnValueRecipient", (String) null, 0,
					1, InteractionUse.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.gateEClass, Gate.class, "Gate", false, false, true);
			this.initEReference(this.getGate_FormalGate(), this.getGate(), this.getGate__gateOfFormalGate(),
					"formalGate", (String) null, 0, 1, Gate.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getGate__gateOfFormalGate(), this.getGate(), this.getGate_FormalGate(),
					"_gateOfFormalGate", (String) null, 0, -1, Gate.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getGate__combinedFragmentOfCfragmentGate(), this.getCombinedFragment(),
					this.getCombinedFragment_CfragmentGate(), "_combinedFragmentOfCfragmentGate", (String) null, 0, 1,
					Gate.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getGate__interactionOfFormalGate(), this.getInteraction(),
					this.getInteraction_FormalGate(), "_interactionOfFormalGate", (String) null, 0, 1, Gate.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getGate__interactionUseOfActualGate(), this.getInteractionUse(),
					this.getInteractionUse_ActualGate(), "_interactionUseOfActualGate", (String) null, 0, 1, Gate.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", false, false,
					true);
			this.initEAttribute(this.getCombinedFragment_InteractionOperator(), this.getInteractionOperatorKind(),
					"interactionOperator", "seq", 1, 1, CombinedFragment.class, false, false, true, false, false, true,
					false, false);
			this.initEReference(this.getCombinedFragment_Operand(), this.getInteractionOperand(),
					this.getInteractionOperand__combinedFragmentOfOperand(), "operand", (String) null, 1, -1,
					CombinedFragment.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getCombinedFragment_CfragmentGate(), this.getGate(),
					this.getGate__combinedFragmentOfCfragmentGate(), "cfragmentGate", (String) null, 0, -1,
					CombinedFragment.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.interactionOperandEClass, InteractionOperand.class, "InteractionOperand", false, false,
					true);
			this.initEReference(this.getInteractionOperand_Fragment(), this.getInteractionFragment(),
					this.getInteractionFragment_EnclosingOperand(), "fragment", (String) null, 0, -1,
					InteractionOperand.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getInteractionOperand_Guard(), this.getInteractionConstraint(),
					this.getInteractionConstraint__interactionOperandOfGuard(), "guard", (String) null, 0, 1,
					InteractionOperand.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteractionOperand__combinedFragmentOfOperand(), this.getCombinedFragment(),
					this.getCombinedFragment_Operand(), "_combinedFragmentOfOperand", (String) null, 0, 1,
					InteractionOperand.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.interactionConstraintEClass, InteractionConstraint.class, "InteractionConstraint",
					false, false, true);
			this.initEReference(this.getInteractionConstraint_Maxint(), this.getValueSpecification(),
					this.getValueSpecification__interactionConstraintOfMaxint(), "maxint", (String) null, 0, 1,
					InteractionConstraint.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteractionConstraint_Minint(), this.getValueSpecification(),
					this.getValueSpecification__interactionConstraintOfMinint(), "minint", (String) null, 0, 1,
					InteractionConstraint.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getInteractionConstraint__interactionOperandOfGuard(),
					this.getInteractionOperand(), this.getInteractionOperand_Guard(), "_interactionOperandOfGuard",
					(String) null, 1, 1, InteractionConstraint.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.clearAssociationActionEClass, ClearAssociationAction.class, "ClearAssociationAction",
					false, false, true);
			this.initEReference(this.getClearAssociationAction_Object(), this.getInputPin(),
					this.getInputPin__clearAssociationActionOfObject(), "object", (String) null, 1, 1,
					ClearAssociationAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getClearAssociationAction_Association(), this.getAssociation(),
					this.getAssociation__clearAssociationActionOfAssociation(), "association", (String) null, 1, 1,
					ClearAssociationAction.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.operationTemplateParameterEClass, OperationTemplateParameter.class,
					"OperationTemplateParameter", false, false, true);
			this.initEReference(this.getOperationTemplateParameter_ParameteredElement(), this.getOperation(),
					this.getOperation_TemplateParameter(), "parameteredElement__from_OperationTemplateParameter",
					(String) null, 1, 1, OperationTemplateParameter.class, true, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.callOperationActionEClass, CallOperationAction.class, "CallOperationAction", false,
					false, true);
			this.initEReference(this.getCallOperationAction_Target(), this.getInputPin(),
					this.getInputPin__callOperationActionOfTarget(), "target", (String) null, 1, 1,
					CallOperationAction.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getCallOperationAction_Operation(), this.getOperation(),
					this.getOperation__callOperationActionOfOperation(), "operation", (String) null, 1, 1,
					CallOperationAction.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.callEventEClass, CallEvent.class, "CallEvent", false, false, true);
			this.initEReference(this.getCallEvent_Operation(), this.getOperation(),
					this.getOperation__callEventOfOperation(), "operation", (String) null, 1, 1, CallEvent.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.stateInvariantEClass, StateInvariant.class, "StateInvariant", false, false, true);
			this.initEReference(this.getStateInvariant_Invariant(), this.getConstraint(),
					this.getConstraint__stateInvariantOfInvariant(), "invariant", (String) null, 1, 1,
					StateInvariant.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getStateInvariant_Covered(), this.getLifeline(),
					this.getLifeline__stateInvariantOfCovered(), "covered__from_StateInvariant", (String) null, 0, -1,
					StateInvariant.class, true, false, true, false, true, false, true, false, false);
			this.initEClass(this.exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", false, false,
					true);
			this.initEReference(this.getExceptionHandler_ExceptionType(), this.getClassifier(),
					this.getClassifier__exceptionHandlerOfExceptionType(), "exceptionType", (String) null, 1, -1,
					ExceptionHandler.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExceptionHandler_HandlerBody(), this.getExecutableNode(),
					this.getExecutableNode__exceptionHandlerOfHandlerBody(), "handlerBody", (String) null, 1, 1,
					ExceptionHandler.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExceptionHandler_ProtectedNode(), this.getExecutableNode(),
					this.getExecutableNode_Handler(), "protectedNode", (String) null, 1, 1, ExceptionHandler.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExceptionHandler_ExceptionInput(), this.getObjectNode(),
					this.getObjectNode__exceptionHandlerOfExceptionInput(), "exceptionInput", (String) null, 1, 1,
					ExceptionHandler.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.sendObjectActionEClass, SendObjectAction.class, "SendObjectAction", false, false,
					true);
			this.initEReference(this.getSendObjectAction_Request(), this.getInputPin(),
					this.getInputPin__sendObjectActionOfRequest(), "request", (String) null, 1, 1,
					SendObjectAction.class, true, false, true, true, true, false, true, false, false);
			this.initEReference(this.getSendObjectAction_Target(), this.getInputPin(),
					this.getInputPin__sendObjectActionOfTarget(), "target", (String) null, 1, 1, SendObjectAction.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class,
					"AddStructuralFeatureValueAction", false, false, true);
			this.initEAttribute(this.getAddStructuralFeatureValueAction_ReplaceAll(), this.getBoolean(), "isReplaceAll",
					"false", 1, 1, AddStructuralFeatureValueAction.class, false, false, true, false, false, true, false,
					false);
			this.initEReference(this.getAddStructuralFeatureValueAction_InsertAt(), this.getInputPin(),
					this.getInputPin__addStructuralFeatureValueActionOfInsertAt(), "insertAt", (String) null, 0, 1,
					AddStructuralFeatureValueAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class,
					"RemoveStructuralFeatureValueAction", false, false, true);
			this.initEAttribute(this.getRemoveStructuralFeatureValueAction_RemoveDuplicates(), this.getBoolean(),
					"isRemoveDuplicates", "false", 1, 1, RemoveStructuralFeatureValueAction.class, false, false, true,
					false, false, true, false, false);
			this.initEReference(this.getRemoveStructuralFeatureValueAction_RemoveAt(), this.getInputPin(),
					this.getInputPin__removeStructuralFeatureValueActionOfRemoveAt(), "removeAt", (String) null, 0, 1,
					RemoveStructuralFeatureValueAction.class, false, false, true, true, true, false, true, false,
					false);
			this.initEClass(this.startObjectBehaviorActionEClass, StartObjectBehaviorAction.class,
					"StartObjectBehaviorAction", false, false, true);
			this.initEReference(this.getStartObjectBehaviorAction_Object(), this.getInputPin(),
					this.getInputPin__startObjectBehaviorActionOfObject(), "object", (String) null, 1, 1,
					StartObjectBehaviorAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.removeVariableValueActionEClass, RemoveVariableValueAction.class,
					"RemoveVariableValueAction", false, false, true);
			this.initEAttribute(this.getRemoveVariableValueAction_RemoveDuplicates(), this.getBoolean(),
					"isRemoveDuplicates", "false", 1, 1, RemoveVariableValueAction.class, false, false, true, false,
					false, true, false, false);
			this.initEReference(this.getRemoveVariableValueAction_RemoveAt(), this.getInputPin(),
					this.getInputPin__removeVariableValueActionOfRemoveAt(), "removeAt", (String) null, 0, 1,
					RemoveVariableValueAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.writeVariableActionEClass, WriteVariableAction.class, "WriteVariableAction", true,
					false, true);
			this.initEReference(this.getWriteVariableAction_Value(), this.getInputPin(),
					this.getInputPin__writeVariableActionOfValue(), "value", (String) null, 0, 1,
					WriteVariableAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", false,
					false, true);
			this.initEAttribute(this.getDestroyObjectAction_DestroyLinks(), this.getBoolean(), "isDestroyLinks",
					"false", 1, 1, DestroyObjectAction.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getDestroyObjectAction_DestroyOwnedObjects(), this.getBoolean(),
					"isDestroyOwnedObjects", "false", 1, 1, DestroyObjectAction.class, false, false, true, false, false,
					true, false, false);
			this.initEReference(this.getDestroyObjectAction_Target(), this.getInputPin(),
					this.getInputPin__destroyObjectActionOfTarget(), "target", (String) null, 1, 1,
					DestroyObjectAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction",
					false, false, true);
			this.initEAttribute(this.getReclassifyObjectAction_ReplaceAll(), this.getBoolean(), "isReplaceAll", "false",
					1, 1, ReclassifyObjectAction.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getReclassifyObjectAction_NewClassifier(), this.getClassifier(),
					this.getClassifier__reclassifyObjectActionOfNewClassifier(), "newClassifier", (String) null, 0, -1,
					ReclassifyObjectAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReclassifyObjectAction_OldClassifier(), this.getClassifier(),
					this.getClassifier__reclassifyObjectActionOfOldClassifier(), "oldClassifier", (String) null, 0, -1,
					ReclassifyObjectAction.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getReclassifyObjectAction_Object(), this.getInputPin(),
					this.getInputPin__reclassifyObjectActionOfObject(), "object", (String) null, 1, 1,
					ReclassifyObjectAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", false,
					false, true);
			this.initEReference(this.getRaiseExceptionAction_Exception(), this.getInputPin(),
					this.getInputPin__raiseExceptionActionOfException(), "exception", (String) null, 1, 1,
					RaiseExceptionAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.linkEndDestructionDataEClass, LinkEndDestructionData.class, "LinkEndDestructionData",
					false, false, true);
			this.initEAttribute(this.getLinkEndDestructionData_DestroyDuplicates(), this.getBoolean(),
					"isDestroyDuplicates", "false", 1, 1, LinkEndDestructionData.class, false, false, true, false,
					false, true, false, false);
			this.initEReference(this.getLinkEndDestructionData__destroyLinkActionOfEndData(),
					this.getDestroyLinkAction(), this.getDestroyLinkAction_EndData(), "_destroyLinkActionOfEndData",
					(String) null, 1, 1, LinkEndDestructionData.class, true, true, true, false, true, false, true,
					false, false);
			this.initEReference(this.getLinkEndDestructionData_DestroyAt(), this.getInputPin(),
					this.getInputPin__linkEndDestructionDataOfDestroyAt(), "destroyAt", (String) null, 0, 1,
					LinkEndDestructionData.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", false, false,
					true);
			this.initEReference(this.getDestroyLinkAction_EndData(), this.getLinkEndDestructionData(),
					this.getLinkEndDestructionData__destroyLinkActionOfEndData(), "endData__from_DestroyLinkAction",
					(String) null, 2, -1, DestroyLinkAction.class, true, false, true, true, true, false, true, false,
					false);
			this.initEClass(this.addVariableValueActionEClass, AddVariableValueAction.class, "AddVariableValueAction",
					false, false, true);
			this.initEAttribute(this.getAddVariableValueAction_ReplaceAll(), this.getBoolean(), "isReplaceAll", "false",
					1, 1, AddVariableValueAction.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getAddVariableValueAction_InsertAt(), this.getInputPin(),
					this.getInputPin__addVariableValueActionOfInsertAt(), "insertAt", (String) null, 0, 1,
					AddVariableValueAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.startClassifierBehaviorActionEClass, StartClassifierBehaviorAction.class,
					"StartClassifierBehaviorAction", false, false, true);
			this.initEReference(this.getStartClassifierBehaviorAction_Object(), this.getInputPin(),
					this.getInputPin__startClassifierBehaviorActionOfObject(), "object", (String) null, 1, 1,
					StartClassifierBehaviorAction.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.interruptibleActivityRegionEClass, InterruptibleActivityRegion.class,
					"InterruptibleActivityRegion", false, false, true);
			this.initEReference(this.getInterruptibleActivityRegion_Node(), this.getActivityNode(),
					this.getActivityNode_InInterruptibleRegion(), "node", (String) null, 0, -1,
					InterruptibleActivityRegion.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getInterruptibleActivityRegion_InterruptingEdge(), this.getActivityEdge(),
					this.getActivityEdge_Interrupts(), "interruptingEdge", (String) null, 0, -1,
					InterruptibleActivityRegion.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.sequenceNodeEClass, SequenceNode.class, "SequenceNode", false, false, true);
			this.initEReference(this.getSequenceNode_ExecutableNode(), this.getExecutableNode(),
					this.getExecutableNode__sequenceNodeOfExecutableNode(), "executableNode", (String) null, 0, -1,
					SequenceNode.class, true, false, true, true, true, false, true, false, true);
			this.initEClass(this.actionInputPinEClass, ActionInputPin.class, "ActionInputPin", false, false, true);
			this.initEReference(this.getActionInputPin_FromAction(), this.getAction(),
					this.getAction__actionInputPinOfFromAction(), "fromAction", (String) null, 1, 1,
					ActionInputPin.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.actionExecutionSpecificationEClass, ActionExecutionSpecification.class,
					"ActionExecutionSpecification", false, false, true);
			this.initEReference(this.getActionExecutionSpecification_Action(), this.getAction(),
					this.getAction__actionExecutionSpecificationOfAction(), "action", (String) null, 1, 1,
					ActionExecutionSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.executionSpecificationEClass, ExecutionSpecification.class, "ExecutionSpecification",
					true, false, true);
			this.initEReference(this.getExecutionSpecification_Finish(), this.getOccurrenceSpecification(),
					this.getOccurrenceSpecification__executionSpecificationOfFinish(), "finish", (String) null, 1, 1,
					ExecutionSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExecutionSpecification_Start(), this.getOccurrenceSpecification(),
					this.getOccurrenceSpecification__executionSpecificationOfStart(), "start", (String) null, 1, 1,
					ExecutionSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExecutionSpecification__executionOccurrenceSpecificationOfExecution(),
					this.getExecutionOccurrenceSpecification(), this.getExecutionOccurrenceSpecification_Execution(),
					"_executionOccurrenceSpecificationOfExecution", (String) null, 0, 2, ExecutionSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.occurrenceSpecificationEClass, OccurrenceSpecification.class,
					"OccurrenceSpecification", false, false, true);
			this.initEReference(this.getOccurrenceSpecification_ToAfter(), this.getGeneralOrdering(),
					this.getGeneralOrdering_Before(), "toAfter", (String) null, 0, -1, OccurrenceSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOccurrenceSpecification_ToBefore(), this.getGeneralOrdering(),
					this.getGeneralOrdering_After(), "toBefore", (String) null, 0, -1, OccurrenceSpecification.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getOccurrenceSpecification__executionSpecificationOfStart(),
					this.getExecutionSpecification(), this.getExecutionSpecification_Start(),
					"_executionSpecificationOfStart", (String) null, 0, -1, OccurrenceSpecification.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getOccurrenceSpecification__executionSpecificationOfFinish(),
					this.getExecutionSpecification(), this.getExecutionSpecification_Finish(),
					"_executionSpecificationOfFinish", (String) null, 0, -1, OccurrenceSpecification.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getOccurrenceSpecification_Covered(), this.getLifeline(),
					this.getLifeline__occurrenceSpecificationOfCovered(), "covered__from_OccurrenceSpecification",
					(String) null, 0, -1, OccurrenceSpecification.class, true, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.generalOrderingEClass, GeneralOrdering.class, "GeneralOrdering", false, false, true);
			this.initEReference(this.getGeneralOrdering_After(), this.getOccurrenceSpecification(),
					this.getOccurrenceSpecification_ToBefore(), "after", (String) null, 1, 1, GeneralOrdering.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getGeneralOrdering__interactionFragmentOfGeneralOrdering(),
					this.getInteractionFragment(), this.getInteractionFragment_GeneralOrdering(),
					"_interactionFragmentOfGeneralOrdering", (String) null, 0, 1, GeneralOrdering.class, false, false,
					true, false, true, false, true, false, false);
			this.initEReference(this.getGeneralOrdering_Before(), this.getOccurrenceSpecification(),
					this.getOccurrenceSpecification_ToAfter(), "before", (String) null, 1, 1, GeneralOrdering.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.executionOccurrenceSpecificationEClass, ExecutionOccurrenceSpecification.class,
					"ExecutionOccurrenceSpecification", false, false, true);
			this.initEReference(this.getExecutionOccurrenceSpecification_Execution(), this.getExecutionSpecification(),
					this.getExecutionSpecification__executionOccurrenceSpecificationOfExecution(), "execution",
					(String) null, 1, 1, ExecutionOccurrenceSpecification.class, false, false, true, false, true, false,
					true, false, false);
			this.initEClass(this.partDecompositionEClass, PartDecomposition.class, "PartDecomposition", false, false,
					true);
			this.initEReference(this.getPartDecomposition__lifelineOfDecomposedAs(), this.getLifeline(),
					this.getLifeline_DecomposedAs(), "_lifelineOfDecomposedAs", (String) null, 1, 1,
					PartDecomposition.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.valuePinEClass, ValuePin.class, "ValuePin", false, false, true);
			this.initEReference(this.getValuePin_Value(), this.getValueSpecification(),
					this.getValueSpecification__valuePinOfValue(), "value", (String) null, 1, 1, ValuePin.class, false,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.intervalEClass, Interval.class, "Interval", false, false, true);
			this.initEReference(this.getInterval_Min(), this.getValueSpecification(),
					this.getValueSpecification__intervalOfMin(), "min", (String) null, 1, 1, Interval.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getInterval__intervalConstraintOfSpecification(), this.getIntervalConstraint(),
					this.getIntervalConstraint_Specification(), "_intervalConstraintOfSpecification", (String) null, 0,
					1, Interval.class, true, true, true, false, true, false, true, false, false);
			this.initEReference(this.getInterval_Max(), this.getValueSpecification(),
					this.getValueSpecification__intervalOfMax(), "max", (String) null, 1, 1, Interval.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.intervalConstraintEClass, IntervalConstraint.class, "IntervalConstraint", false, false,
					true);
			this.initEReference(this.getIntervalConstraint_Specification(), this.getInterval(),
					this.getInterval__intervalConstraintOfSpecification(), "specification__from_IntervalConstraint",
					(String) null, 1, 1, IntervalConstraint.class, true, false, true, true, true, false, true, false,
					false);
			this.initEClass(this.changeEventEClass, ChangeEvent.class, "ChangeEvent", false, false, true);
			this.initEReference(this.getChangeEvent_ChangeExpression(), this.getValueSpecification(),
					this.getValueSpecification__changeEventOfChangeExpression(), "changeExpression", (String) null, 1,
					1, ChangeEvent.class, false, false, true, true, true, false, true, false, false);
			this.initEClass(this.joinNodeEClass, JoinNode.class, "JoinNode", false, false, true);
			this.initEAttribute(this.getJoinNode_CombineDuplicate(), this.getBoolean(), "isCombineDuplicate", "true", 1,
					1, JoinNode.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getJoinNode_JoinSpec(), this.getValueSpecification(),
					this.getValueSpecification__joinNodeOfJoinSpec(), "joinSpec", (String) null, 0, 1, JoinNode.class,
					false, false, true, true, true, false, true, false, false);
			this.initEClass(this.controlNodeEClass, ControlNode.class, "ControlNode", true, false, true);
			this.initEClass(this.durationEClass, Duration.class, "Duration", false, false, true);
			this.initEReference(this.getDuration_Observation(), this.getObservation(),
					this.getObservation__durationOfObservation(), "observation", (String) null, 0, -1, Duration.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getDuration__durationIntervalOfMin(), this.getDurationInterval(),
					this.getDurationInterval_Min(), "_durationIntervalOfMin", (String) null, 0, -1, Duration.class,
					false, true, true, false, true, false, true, false, false);
			this.initEReference(this.getDuration__durationIntervalOfMax(), this.getDurationInterval(),
					this.getDurationInterval_Max(), "_durationIntervalOfMax", (String) null, 0, -1, Duration.class,
					false, true, true, false, true, false, true, false, false);
			this.initEReference(this.getDuration_Expr(), this.getValueSpecification(),
					this.getValueSpecification__durationOfExpr(), "expr", (String) null, 0, 1, Duration.class, false,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.observationEClass, Observation.class, "Observation", true, false, true);
			this.initEReference(this.getObservation__timeExpressionOfObservation(), this.getTimeExpression(),
					this.getTimeExpression_Observation(), "_timeExpressionOfObservation", (String) null, 0, 1,
					Observation.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getObservation_Behavior(), this.getBehavior(), this.getBehavior_Observation(),
					"behavior", (String) null, 0, 1, Observation.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getObservation__durationOfObservation(), this.getDuration(),
					this.getDuration_Observation(), "_durationOfObservation", (String) null, 0, 1, Observation.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.timeExpressionEClass, TimeExpression.class, "TimeExpression", false, false, true);
			this.initEReference(this.getTimeExpression_Expr(), this.getValueSpecification(),
					this.getValueSpecification__timeExpressionOfExpr(), "expr", (String) null, 0, 1,
					TimeExpression.class, false, false, true, true, true, false, true, false, false);
			this.initEReference(this.getTimeExpression__timeIntervalOfMin(), this.getTimeInterval(),
					this.getTimeInterval_Min(), "_timeIntervalOfMin", (String) null, 0, -1, TimeExpression.class, false,
					true, true, false, true, false, true, false, false);
			this.initEReference(this.getTimeExpression__timeIntervalOfMax(), this.getTimeInterval(),
					this.getTimeInterval_Max(), "_timeIntervalOfMax", (String) null, 0, -1, TimeExpression.class, false,
					true, true, false, true, false, true, false, false);
			this.initEReference(this.getTimeExpression__timeEventOfWhen(), this.getTimeEvent(),
					this.getTimeEvent_When(), "_timeEventOfWhen", (String) null, 0, 1, TimeExpression.class, false,
					false, true, false, true, false, true, false, false);
			this.initEReference(this.getTimeExpression_Observation(), this.getObservation(),
					this.getObservation__timeExpressionOfObservation(), "observation", (String) null, 0, -1,
					TimeExpression.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.timeIntervalEClass, TimeInterval.class, "TimeInterval", false, false, true);
			this.initEReference(this.getTimeInterval__timeConstraintOfSpecification(), this.getTimeConstraint(),
					this.getTimeConstraint_Specification(), "_timeConstraintOfSpecification", (String) null, 0, 1,
					TimeInterval.class, true, true, true, false, true, false, true, false, false);
			this.initEReference(this.getTimeInterval_Max(), this.getTimeExpression(),
					this.getTimeExpression__timeIntervalOfMax(), "max__from_TimeInterval", (String) null, 1, 1,
					TimeInterval.class, true, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTimeInterval_Min(), this.getTimeExpression(),
					this.getTimeExpression__timeIntervalOfMin(), "min__from_TimeInterval", (String) null, 1, 1,
					TimeInterval.class, true, false, true, false, true, false, true, false, false);
			this.initEClass(this.timeConstraintEClass, TimeConstraint.class, "TimeConstraint", false, false, true);
			this.initEAttribute(this.getTimeConstraint_FirstEvent(), this.getBoolean(), "firstEvent", "true", 0, 1,
					TimeConstraint.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getTimeConstraint_Specification(), this.getTimeInterval(),
					this.getTimeInterval__timeConstraintOfSpecification(), "specification__from_TimeConstraint",
					(String) null, 1, 1, TimeConstraint.class, true, false, true, true, true, false, true, false,
					false);
			this.initEClass(this.timeEventEClass, TimeEvent.class, "TimeEvent", false, false, true);
			this.initEAttribute(this.getTimeEvent_Relative(), this.getBoolean(), "isRelative", "false", 1, 1,
					TimeEvent.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getTimeEvent_When(), this.getTimeExpression(),
					this.getTimeExpression__timeEventOfWhen(), "when", (String) null, 1, 1, TimeEvent.class, false,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.durationIntervalEClass, DurationInterval.class, "DurationInterval", false, false,
					true);
			this.initEReference(this.getDurationInterval__durationConstraintOfSpecification(),
					this.getDurationConstraint(), this.getDurationConstraint_Specification(),
					"_durationConstraintOfSpecification", (String) null, 0, 1, DurationInterval.class, true, true, true,
					false, true, false, true, false, false);
			this.initEReference(this.getDurationInterval_Max(), this.getDuration(),
					this.getDuration__durationIntervalOfMax(), "max__from_DurationInterval", (String) null, 1, 1,
					DurationInterval.class, true, false, true, false, true, false, true, false, false);
			this.initEReference(this.getDurationInterval_Min(), this.getDuration(),
					this.getDuration__durationIntervalOfMin(), "min__from_DurationInterval", (String) null, 1, 1,
					DurationInterval.class, true, false, true, false, true, false, true, false, false);
			this.initEClass(this.durationConstraintEClass, DurationConstraint.class, "DurationConstraint", false, false,
					true);
			this.initEAttribute(this.getDurationConstraint_FirstEvent(), this.getBoolean(), "firstEvent", (String) null,
					0, 2, DurationConstraint.class, false, false, true, false, false, false, false, true);
			this.initEReference(this.getDurationConstraint_Specification(), this.getDurationInterval(),
					this.getDurationInterval__durationConstraintOfSpecification(),
					"specification__from_DurationConstraint", (String) null, 1, 1, DurationConstraint.class, true,
					false, true, true, true, false, true, false, false);
			this.initEClass(this.expressionEClass, Expression.class, "Expression", false, false, true);
			this.initEAttribute(this.getExpression_Symbol(), this.getString(), "symbol", "", 0, 1, Expression.class,
					false, false, true, false, false, true, false, false);
			this.initEReference(this.getExpression_Operand(), this.getValueSpecification(),
					this.getValueSpecification_Expression(), "operand", (String) null, 0, -1, Expression.class, false,
					false, true, true, true, false, true, false, true);
			this.initEClass(this.activityParameterNodeEClass, ActivityParameterNode.class, "ActivityParameterNode",
					false, false, true);
			this.initEReference(this.getActivityParameterNode_Parameter(), this.getParameter(),
					this.getParameter__activityParameterNodeOfParameter(), "parameter", (String) null, 1, 1,
					ActivityParameterNode.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.objectFlowEClass, ObjectFlow.class, "ObjectFlow", false, false, true);
			this.initEAttribute(this.getObjectFlow_Multicast(), this.getBoolean(), "isMulticast", "false", 1, 1,
					ObjectFlow.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getObjectFlow_Multireceive(), this.getBoolean(), "isMultireceive", "false", 1, 1,
					ObjectFlow.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getObjectFlow_Selection(), this.getBehavior(),
					this.getBehavior__objectFlowOfSelection(), "selection", (String) null, 0, 1, ObjectFlow.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getObjectFlow__decisionNodeOfDecisionInputFlow(), this.getDecisionNode(),
					this.getDecisionNode_DecisionInputFlow(), "_decisionNodeOfDecisionInputFlow", (String) null, 0, 1,
					ObjectFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getObjectFlow_Transformation(), this.getBehavior(),
					this.getBehavior__objectFlowOfTransformation(), "transformation", (String) null, 0, 1,
					ObjectFlow.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.decisionNodeEClass, DecisionNode.class, "DecisionNode", false, false, true);
			this.initEReference(this.getDecisionNode_DecisionInput(), this.getBehavior(),
					this.getBehavior__decisionNodeOfDecisionInput(), "decisionInput", (String) null, 0, 1,
					DecisionNode.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getDecisionNode_DecisionInputFlow(), this.getObjectFlow(),
					this.getObjectFlow__decisionNodeOfDecisionInputFlow(), "decisionInputFlow", (String) null, 0, 1,
					DecisionNode.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.behaviorExecutionSpecificationEClass, BehaviorExecutionSpecification.class,
					"BehaviorExecutionSpecification", false, false, true);
			this.initEReference(this.getBehaviorExecutionSpecification_Behavior(), this.getBehavior(),
					this.getBehavior__behaviorExecutionSpecificationOfBehavior(), "behavior", (String) null, 0, 1,
					BehaviorExecutionSpecification.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", false, false,
					true);
			this.initEReference(this.getCallBehaviorAction_Behavior(), this.getBehavior(),
					this.getBehavior__callBehaviorActionOfBehavior(), "behavior", (String) null, 1, 1,
					CallBehaviorAction.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.extensionEClass, Extension.class, "Extension", false, false, true);
			this.initEAttribute(this.getExtension_Required(), this.getBoolean(), "isRequired", (String) null, 1, 1,
					Extension.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getExtension_Metaclass(), this.getClass_(), this.getClass_Extension(), "metaclass",
					(String) null, 1, 1, Extension.class, true, true, false, false, true, false, true, true, false);
			this.initEReference(this.getExtension_OwnedEnd(), this.getExtensionEnd(),
					this.getExtensionEnd__extensionOfOwnedEnd(), "ownedEnd__from_Extension", (String) null, 0, -1,
					Extension.class, true, false, true, true, true, false, true, false, true);
			this.initEClass(this.extensionEndEClass, ExtensionEnd.class, "ExtensionEnd", false, false, true);
			this.initEReference(this.getExtensionEnd__extensionOfOwnedEnd(), this.getExtension(),
					this.getExtension_OwnedEnd(), "_extensionOfOwnedEnd", (String) null, 1, 1, ExtensionEnd.class, true,
					true, true, false, true, false, true, false, false);
			this.initEAttribute(this.getExtensionEnd_Lower(), this.getInteger(), "lower__from_ExtensionEnd",
					(String) null, 0, 1, ExtensionEnd.class, true, true, false, false, false, true, true, false);
			this.initEReference(this.getExtensionEnd_Type(), this.getStereotype(),
					this.getStereotype__extensionEndOfType(), "type__from_ExtensionEnd", (String) null, 0, 1,
					ExtensionEnd.class, true, false, true, false, true, false, true, false, false);
			this.initEClass(this.imageEClass, Image.class, "Image", false, false, true);
			this.initEAttribute(this.getImage_Content(), this.getString(), "content", "", 0, 1, Image.class, false,
					false, true, false, false, true, false, false);
			this.initEAttribute(this.getImage_Format(), this.getString(), "format", "", 0, 1, Image.class, false, false,
					true, false, false, true, false, false);
			this.initEAttribute(this.getImage_Location(), this.getString(), "location", "", 0, 1, Image.class, false,
					false, true, false, false, true, false, false);
			this.initEReference(this.getImage__stereotypeOfIcon(), this.getStereotype(), this.getStereotype_Icon(),
					"_stereotypeOfIcon", (String) null, 0, 1, Image.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.packageMergeEClass, PackageMerge.class, "PackageMerge", false, false, true);
			this.initEReference(this.getPackageMerge_MergedPackage(), this.getPackage(),
					this.getPackage__packageMergeOfMergedPackage(), "mergedPackage", (String) null, 1, 1,
					PackageMerge.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackageMerge_ReceivingPackage(), this.getPackage(),
					this.getPackage_PackageMerge(), "receivingPackage", (String) null, 1, 1, PackageMerge.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.profileApplicationEClass, ProfileApplication.class, "ProfileApplication", false, false,
					true);
			this.initEReference(this.getProfileApplication_AppliedProfile(), this.getProfile(),
					this.getProfile__profileApplicationOfAppliedProfile(), "appliedProfile", (String) null, 1, 1,
					ProfileApplication.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getProfileApplication_Strict(), this.getBoolean(), "isStrict", "false", 1, 1,
					ProfileApplication.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getProfileApplication_ApplyingPackage(), this.getPackage(),
					this.getPackage_ProfileApplication(), "applyingPackage", (String) null, 1, 1,
					ProfileApplication.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.packageImportEClass, PackageImport.class, "PackageImport", false, false, true);
			this.initEReference(this.getPackageImport_ImportingNamespace(), this.getNamespace(),
					this.getNamespace_PackageImport(), "importingNamespace", (String) null, 1, 1, PackageImport.class,
					false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1,
					1, PackageImport.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getPackageImport__profileOfMetamodelReference(), this.getProfile(),
					this.getProfile_MetamodelReference(), "_profileOfMetamodelReference", (String) null, 0, 1,
					PackageImport.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getPackageImport_ImportedPackage(), this.getPackage(),
					this.getPackage__packageImportOfImportedPackage(), "importedPackage", (String) null, 1, 1,
					PackageImport.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.diagramEClass, Diagram.class, "Diagram", false, false, true);
			this.initEReference(this.getDiagram_Context(), this.getElement(), this.getElement__diagramOfContext(),
					"context", (String) null, 0, 1, Diagram.class, false, false, true, false, true, false, true, false,
					false);
			this.initEReference(this.getDiagram_OwnerOfDiagram(), this.getNamespace(), this.getNamespace_OwnedDiagram(),
					"ownerOfDiagram", (String) null, 0, 1, Diagram.class, false, false, true, false, true, false, true,
					false, false);
			this.initEReference(this.getDiagram__representation(),
					theDiagramPackage.getAbstractDiagramRepresentationObject(), (EReference) null, "_representation",
					(String) null, 0, 1, Diagram.class, false, false, true, true, true, false, true, false, true);
			this.initEClass(this.generalizationEClass, Generalization.class, "Generalization", false, false, true);
			this.initEReference(this.getGeneralization_General(), this.getClassifier(),
					this.getClassifier__generalizationOfGeneral(), "general", (String) null, 1, 1, Generalization.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getGeneralization_GeneralizationSet(), this.getGeneralizationSet(),
					this.getGeneralizationSet_Generalization(), "generalizationSet", (String) null, 0, -1,
					Generalization.class, false, false, true, false, true, false, true, false, false);
			this.initEAttribute(this.getGeneralization_Substitutable(), this.getBoolean(), "isSubstitutable", "true", 0,
					1, Generalization.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getGeneralization_Specific(), this.getClassifier(),
					this.getClassifier_Generalization(), "specific", (String) null, 1, 1, Generalization.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", false, false,
					true);
			this.initEAttribute(this.getGeneralizationSet_Covering(), this.getBoolean(), "isCovering", "false", 1, 1,
					GeneralizationSet.class, false, false, true, false, false, true, false, false);
			this.initEAttribute(this.getGeneralizationSet_Disjoint(), this.getBoolean(), "isDisjoint", "false", 1, 1,
					GeneralizationSet.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getGeneralizationSet_Powertype(), this.getClassifier(),
					this.getClassifier_PowertypeExtent(), "powertype", (String) null, 0, 1, GeneralizationSet.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getGeneralizationSet_Generalization(), this.getGeneralization(),
					this.getGeneralization_GeneralizationSet(), "generalization", (String) null, 0, -1,
					GeneralizationSet.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.redefinableTemplateSignatureEClass, RedefinableTemplateSignature.class,
					"RedefinableTemplateSignature", false, false, true);
			this.initEReference(this.getRedefinableTemplateSignature_ExtendedSignature(),
					this.getRedefinableTemplateSignature(),
					this.getRedefinableTemplateSignature__redefinableTemplateSignatureOfExtendedSignature(),
					"extendedSignature", (String) null, 0, -1, RedefinableTemplateSignature.class, false, false, true,
					false, true, false, true, false, false);
			this.initEReference(this.getRedefinableTemplateSignature__redefinableTemplateSignatureOfExtendedSignature(),
					this.getRedefinableTemplateSignature(), this.getRedefinableTemplateSignature_ExtendedSignature(),
					"_redefinableTemplateSignatureOfExtendedSignature", (String) null, 0, -1,
					RedefinableTemplateSignature.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getRedefinableTemplateSignature_InheritedParameter(), this.getTemplateParameter(),
					this.getTemplateParameter__redefinableTemplateSignatureOfInheritedParameter(), "inheritedParameter",
					(String) null, 0, -1, RedefinableTemplateSignature.class, true, true, false, false, true, false,
					true, true, false);
			this.initEReference(this.getRedefinableTemplateSignature_Classifier(), this.getClassifier(),
					this.getClassifier_OwnedTemplateSignature(), "classifier", (String) null, 1, 1,
					RedefinableTemplateSignature.class, true, true, true, false, true, false, true, false, false);
			this.initEClass(this.substitutionEClass, Substitution.class, "Substitution", false, false, true);
			this.initEReference(this.getSubstitution_Contract(), this.getClassifier(),
					this.getClassifier__substitutionOfContract(), "contract", (String) null, 1, 1, Substitution.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getSubstitution_SubstitutingClassifier(), this.getClassifier(),
					this.getClassifier_Substitution(), "substitutingClassifier", (String) null, 1, 1,
					Substitution.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.classifierTemplateParameterEClass, ClassifierTemplateParameter.class,
					"ClassifierTemplateParameter", false, false, true);
			this.initEAttribute(this.getClassifierTemplateParameter_AllowSubstitutable(), this.getBoolean(),
					"allowSubstitutable", "true", 1, 1, ClassifierTemplateParameter.class, false, false, true, false,
					false, true, false, false);
			this.initEReference(this.getClassifierTemplateParameter_ConstrainingClassifier(), this.getClassifier(),
					this.getClassifier__classifierTemplateParameterOfConstrainingClassifier(), "constrainingClassifier",
					(String) null, 0, -1, ClassifierTemplateParameter.class, false, false, true, false, true, false,
					true, false, false);
			this.initEReference(this.getClassifierTemplateParameter_ParameteredElement(), this.getClassifier(),
					this.getClassifier_TemplateParameter(), "parameteredElement__from_ClassifierTemplateParameter",
					(String) null, 1, 1, ClassifierTemplateParameter.class, true, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.informationItemEClass, InformationItem.class, "InformationItem", false, false, true);
			this.initEReference(this.getInformationItem_Represented(), this.getClassifier(),
					this.getClassifier__informationItemOfRepresented(), "represented", (String) null, 0, -1,
					InformationItem.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.templateParameterSubstitutionEClass, TemplateParameterSubstitution.class,
					"TemplateParameterSubstitution", false, false, true);
			this.initEReference(this.getTemplateParameterSubstitution_Actual(), this.getParameterableElement(),
					this.getParameterableElement__templateParameterSubstitutionOfActual(), "actual", (String) null, 1,
					1, TemplateParameterSubstitution.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(),
					this.getTemplateParameter__templateParameterSubstitutionOfFormal(), "formal", (String) null, 1, 1,
					TemplateParameterSubstitution.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getTemplateParameterSubstitution_OwnedActual(), this.getParameterableElement(),
					this.getParameterableElement__templateParameterSubstitutionOfOwnedActual(), "ownedActual",
					(String) null, 0, 1, TemplateParameterSubstitution.class, false, false, true, true, true, false,
					true, false, false);
			this.initEReference(this.getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(),
					this.getTemplateBinding_ParameterSubstitution(), "templateBinding", (String) null, 1, 1,
					TemplateParameterSubstitution.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.instanceValueEClass, InstanceValue.class, "InstanceValue", false, false, true);
			this.initEReference(this.getInstanceValue_Instance(), this.getInstanceSpecification(),
					this.getInstanceSpecification__instanceValueOfInstance(), "instance", (String) null, 1, 1,
					InstanceValue.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.elementValueEClass, ElementValue.class, "ElementValue", false, false, true);
			this.initEReference(this.getElementValue_Element(), this.getElement(),
					this.getElement__elementValueOfElement(), "element", (String) null, 1, 1, ElementValue.class, false,
					false, true, false, true, false, true, false, false);
			this.initEClass(this.stringExpressionEClass, StringExpression.class, "StringExpression", false, false,
					true);
			this.initEReference(this.getStringExpression_OwningExpression(), this.getStringExpression(),
					this.getStringExpression_SubExpression(), "owningExpression", (String) null, 0, 1,
					StringExpression.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getStringExpression_SubExpression(), this.getStringExpression(),
					this.getStringExpression_OwningExpression(), "subExpression", (String) null, 0, -1,
					StringExpression.class, false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getStringExpression__namedElementOfNameExpression(), this.getNamedElement(),
					this.getNamedElement_NameExpression(), "_namedElementOfNameExpression", (String) null, 0, 1,
					StringExpression.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.considerIgnoreFragmentEClass, ConsiderIgnoreFragment.class, "ConsiderIgnoreFragment",
					false, false, true);
			this.initEReference(this.getConsiderIgnoreFragment_Message(), this.getNamedElement(),
					this.getNamedElement__considerIgnoreFragmentOfMessage(), "message", (String) null, 0, -1,
					ConsiderIgnoreFragment.class, false, false, true, false, true, false, true, false, false);
			this.initEClass(this.timeObservationEClass, TimeObservation.class, "TimeObservation", false, false, true);
			this.initEAttribute(this.getTimeObservation_FirstEvent(), this.getBoolean(), "firstEvent", "true", 1, 1,
					TimeObservation.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getTimeObservation_Event(), this.getNamedElement(),
					this.getNamedElement__timeObservationOfEvent(), "event", (String) null, 1, 1, TimeObservation.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.durationObservationEClass, DurationObservation.class, "DurationObservation", false,
					false, true);
			this.initEAttribute(this.getDurationObservation_FirstEvent(), this.getBoolean(), "firstEvent",
					(String) null, 0, 2, DurationObservation.class, false, false, true, false, false, false, false,
					true);
			this.initEReference(this.getDurationObservation_Event(), this.getNamedElement(),
					this.getNamedElement__durationObservationOfEvent(), "event", (String) null, 1, 2,
					DurationObservation.class, false, false, true, false, true, false, true, false, true);
			this.initEClass(this.connectableElementTemplateParameterEClass, ConnectableElementTemplateParameter.class,
					"ConnectableElementTemplateParameter", false, false, true);
			this.initEReference(this.getConnectableElementTemplateParameter_ParameteredElement(),
					this.getConnectableElement(), this.getConnectableElement_TemplateParameter(),
					"parameteredElement__from_ConnectableElementTemplateParameter", (String) null, 1, 1,
					ConnectableElementTemplateParameter.class, true, false, true, false, true, false, true, false,
					false);
			this.initEClass(this.literalIntegerEClass, LiteralInteger.class, "LiteralInteger", false, false, true);
			this.initEAttribute(this.getLiteralInteger_Value(), this.getInteger(), "value", "0", 1, 1,
					LiteralInteger.class, false, false, true, false, false, true, false, false);
			this.initEClass(this.literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", true,
					false, true);
			this.initEClass(this.enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", false, false,
					true);
			this.initEReference(this.getEnumerationLiteral_Enumeration(), this.getEnumeration(),
					this.getEnumeration_OwnedLiteral(), "enumeration", (String) null, 1, 1, EnumerationLiteral.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getEnumerationLiteral_Classifier(), this.getEnumeration(),
					this.getEnumeration__enumerationLiteralOfClassifier(), "classifier__from_EnumerationLiteral",
					(String) null, 0, -1, EnumerationLiteral.class, true, true, false, false, true, false, true, true,
					true);
			this.initEClass(this.enumerationEClass, Enumeration.class, "Enumeration", false, false, true);
			this.initEReference(this.getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(),
					this.getEnumerationLiteral_Enumeration(), "ownedLiteral", (String) null, 0, -1, Enumeration.class,
					false, false, true, true, true, false, true, false, true);
			this.initEReference(this.getEnumeration__enumerationLiteralOfClassifier(), this.getEnumerationLiteral(),
					this.getEnumerationLiteral_Classifier(), "_enumerationLiteralOfClassifier", (String) null, 0, -1,
					Enumeration.class, true, true, false, false, true, false, true, true, false);
			this.initEClass(this.finalStateEClass, FinalState.class, "FinalState", false, false, true);
			this.initEClass(this.initialNodeEClass, InitialNode.class, "InitialNode", false, false, true);
			this.initEClass(this.functionBehaviorEClass, FunctionBehavior.class, "FunctionBehavior", false, false,
					true);
			this.initEClass(this.opaqueBehaviorEClass, OpaqueBehavior.class, "OpaqueBehavior", false, false, true);
			this.initEAttribute(this.getOpaqueBehavior_Body(), this.getString(), "body", (String) null, 0, -1,
					OpaqueBehavior.class, false, false, true, false, false, false, false, true);
			this.initEAttribute(this.getOpaqueBehavior_Language(), this.getString(), "language", (String) null, 0, -1,
					OpaqueBehavior.class, false, false, true, false, false, true, false, true);
			this.initEClass(this.destructionOccurrenceSpecificationEClass, DestructionOccurrenceSpecification.class,
					"DestructionOccurrenceSpecification", false, false, true);
			this.initEClass(this.messageOccurrenceSpecificationEClass, MessageOccurrenceSpecification.class,
					"MessageOccurrenceSpecification", false, false, true);
			this.initEClass(this.literalStringEClass, LiteralString.class, "LiteralString", false, false, true);
			this.initEAttribute(this.getLiteralString_Value(), this.getString(), "value", "", 0, 1, LiteralString.class,
					false, false, true, false, false, true, false, false);
			this.initEClass(this.finalNodeEClass, FinalNode.class, "FinalNode", true, false, true);
			this.initEClass(this.executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", false,
					false, true);
			this.initEClass(this.nodeEClass, Node.class, "Node", false, false, true);
			this.initEReference(this.getNode_NestedNode(), this.getNode(), this.getNode__nodeOfNestedNode(),
					"nestedNode", (String) null, 0, -1, Node.class, false, false, true, true, true, false, true, false,
					false);
			this.initEReference(this.getNode__nodeOfNestedNode(), this.getNode(), this.getNode_NestedNode(),
					"_nodeOfNestedNode", (String) null, 0, 1, Node.class, false, false, true, false, true, false, true,
					false, false);
			this.initEClass(this.dataStoreNodeEClass, DataStoreNode.class, "DataStoreNode", false, false, true);
			this.initEClass(this.centralBufferNodeEClass, CentralBufferNode.class, "CentralBufferNode", false, false,
					true);
			this.initEClass(this.activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", false, false,
					true);
			this.initEClass(this.literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", false, false, true);
			this.initEAttribute(this.getLiteralBoolean_Value(), this.getBoolean(), "value", "false", 1, 1,
					LiteralBoolean.class, false, false, true, false, false, true, false, false);
			this.initEClass(this.modelEClass, Model.class, "Model", false, false, true);
			this.initEAttribute(this.getModel_Viewpoint(), this.getString(), "viewpoint", "", 0, 1, Model.class, false,
					false, true, false, false, true, false, false);
			this.initEClass(this.communicationPathEClass, CommunicationPath.class, "CommunicationPath", false, false,
					true);
			this.initEClass(this.continuationEClass, Continuation.class, "Continuation", false, false, true);
			this.initEAttribute(this.getContinuation_Setting(), this.getBoolean(), "setting", "true", 1, 1,
					Continuation.class, false, false, true, false, false, true, false, false);
			this.initEClass(this.expansionNodeEClass, ExpansionNode.class, "ExpansionNode", false, false, true);
			this.initEReference(this.getExpansionNode_RegionAsInput(), this.getExpansionRegion(),
					this.getExpansionRegion_InputElement(), "regionAsInput", (String) null, 0, 1, ExpansionNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExpansionNode_RegionAsOutput(), this.getExpansionRegion(),
					this.getExpansionRegion_OutputElement(), "regionAsOutput", (String) null, 0, 1, ExpansionNode.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.expansionRegionEClass, ExpansionRegion.class, "ExpansionRegion", false, false, true);
			this.initEAttribute(this.getExpansionRegion_Mode(), this.getExpansionKind(), "mode", "iterative", 1, 1,
					ExpansionRegion.class, false, false, true, false, false, true, false, false);
			this.initEReference(this.getExpansionRegion_OutputElement(), this.getExpansionNode(),
					this.getExpansionNode_RegionAsOutput(), "outputElement", (String) null, 0, -1,
					ExpansionRegion.class, false, false, true, false, true, false, true, false, false);
			this.initEReference(this.getExpansionRegion_InputElement(), this.getExpansionNode(),
					this.getExpansionNode_RegionAsInput(), "inputElement", (String) null, 1, -1, ExpansionRegion.class,
					false, false, true, false, true, false, true, false, false);
			this.initEClass(this.literalNullEClass, LiteralNull.class, "LiteralNull", false, false, true);
			this.initEClass(this.literalUnlimitedNaturalEClass, LiteralUnlimitedNatural.class,
					"LiteralUnlimitedNatural", false, false, true);
			this.initEAttribute(this.getLiteralUnlimitedNatural_Value(), this.getUnlimitedNatural(), "value", "0", 1, 1,
					LiteralUnlimitedNatural.class, false, false, true, false, false, true, false, false);
			this.initEClass(this.literalRealEClass, LiteralReal.class, "LiteralReal", false, false, true);
			this.initEAttribute(this.getLiteralReal_Value(), this.getReal(), "value", (String) null, 1, 1,
					LiteralReal.class, false, false, true, false, false, true, false, false);
			this.initEClass(this.anyReceiveEventEClass, AnyReceiveEvent.class, "AnyReceiveEvent", false, false, true);
			this.initEClass(this.forkNodeEClass, ForkNode.class, "ForkNode", false, false, true);
			this.initEClass(this.controlFlowEClass, ControlFlow.class, "ControlFlow", false, false, true);
			this.initEClass(this.primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", false, false, true);
			this.initEClass(this.usageEClass, Usage.class, "Usage", false, false, true);
			this.initEClass(this.flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", false, false, true);
			this.initEClass(this.actorEClass, Actor.class, "Actor", false, false, true);
			this.initEClass(this.associationClassEClass, AssociationClass.class, "AssociationClass", false, false,
					true);
			this.initEClass(this.deviceEClass, Device.class, "Device", false, false, true);
			this.initEClass(this.mergeNodeEClass, MergeNode.class, "MergeNode", false, false, true);
			this.initEClass(this.clearVariableActionEClass, ClearVariableAction.class, "ClearVariableAction", false,
					false, true);
			this.initEClass(this.modelObjectEClass, ModelObject.class, "ModelObject", true, false, true);
			this.initEAttribute(this.getModelObject__representationText(), this.ecorePackage.getEString(),
					"_representationText", (String) null, 0, 1, ModelObject.class, false, false, true, false, false,
					true, false, true);
			this.initEEnum(this.visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
			this.addEEnumLiteral(this.visibilityKindEEnum, (VisibilityKindEnum) VisibilityKindEnum.PUBLIC);
			this.addEEnumLiteral(this.visibilityKindEEnum, (VisibilityKindEnum) VisibilityKindEnum.PRIVATE);
			this.addEEnumLiteral(this.visibilityKindEEnum, (VisibilityKindEnum) VisibilityKindEnum.PROTECTED);
			this.addEEnumLiteral(this.visibilityKindEEnum, (VisibilityKindEnum) VisibilityKindEnum.PACKAGE);
			this.initEEnum(this.pseudostateKindEEnum, PseudostateKind.class, "PseudostateKind");
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.INITIAL);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.DEEPHISTORY);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.SHALLOWHISTORY);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.JOIN);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.FORK);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.JUNCTION);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.CHOICE);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.ENTRYPOINT);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.EXITPOINT);
			this.addEEnumLiteral(this.pseudostateKindEEnum, (PseudostateKindEnum) PseudostateKindEnum.TERMINATE);
			this.initEEnum(this.callConcurrencyKindEEnum, CallConcurrencyKind.class, "CallConcurrencyKind");
			this.addEEnumLiteral(this.callConcurrencyKindEEnum,
					(CallConcurrencyKindEnum) CallConcurrencyKindEnum.SEQUENTIAL);
			this.addEEnumLiteral(this.callConcurrencyKindEEnum,
					(CallConcurrencyKindEnum) CallConcurrencyKindEnum.GUARDED);
			this.addEEnumLiteral(this.callConcurrencyKindEEnum,
					(CallConcurrencyKindEnum) CallConcurrencyKindEnum.CONCURRENT);
			this.initEEnum(this.aggregationKindEEnum, AggregationKind.class, "AggregationKind");
			this.addEEnumLiteral(this.aggregationKindEEnum, (AggregationKindEnum) AggregationKindEnum.NONE);
			this.addEEnumLiteral(this.aggregationKindEEnum, (AggregationKindEnum) AggregationKindEnum.SHARED);
			this.addEEnumLiteral(this.aggregationKindEEnum, (AggregationKindEnum) AggregationKindEnum.COMPOSITE);
			this.initEEnum(this.connectorKindEEnum, ConnectorKind.class, "ConnectorKind");
			this.addEEnumLiteral(this.connectorKindEEnum, (ConnectorKindEnum) ConnectorKindEnum.ASSEMBLY);
			this.addEEnumLiteral(this.connectorKindEEnum, (ConnectorKindEnum) ConnectorKindEnum.DELEGATION);
			this.initEEnum(this.messageKindEEnum, MessageKind.class, "MessageKind");
			this.addEEnumLiteral(this.messageKindEEnum, (MessageKindEnum) MessageKindEnum.COMPLETE);
			this.addEEnumLiteral(this.messageKindEEnum, (MessageKindEnum) MessageKindEnum.LOST);
			this.addEEnumLiteral(this.messageKindEEnum, (MessageKindEnum) MessageKindEnum.FOUND);
			this.addEEnumLiteral(this.messageKindEEnum, (MessageKindEnum) MessageKindEnum.UNKNOWN);
			this.initEEnum(this.messageSortEEnum, MessageSort.class, "MessageSort");
			this.addEEnumLiteral(this.messageSortEEnum, (MessageSortEnum) MessageSortEnum.SYNCHCALL);
			this.addEEnumLiteral(this.messageSortEEnum, (MessageSortEnum) MessageSortEnum.ASYNCHCALL);
			this.addEEnumLiteral(this.messageSortEEnum, (MessageSortEnum) MessageSortEnum.ASYNCHSIGNAL);
			this.addEEnumLiteral(this.messageSortEEnum, (MessageSortEnum) MessageSortEnum.CREATEMESSAGE);
			this.addEEnumLiteral(this.messageSortEEnum, (MessageSortEnum) MessageSortEnum.DELETEMESSAGE);
			this.addEEnumLiteral(this.messageSortEEnum, (MessageSortEnum) MessageSortEnum.REPLY);
			this.initEEnum(this.interactionOperatorKindEEnum, InteractionOperatorKind.class, "InteractionOperatorKind");
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.SEQ);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.ALT);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.OPT);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.BREAK);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.PAR);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.STRICT);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.LOOP);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.CRITICAL);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.NEG);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.ASSERT);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.IGNORE);
			this.addEEnumLiteral(this.interactionOperatorKindEEnum,
					(InteractionOperatorKindEnum) InteractionOperatorKindEnum.CONSIDER);
			this.initEEnum(this.transitionKindEEnum, TransitionKind.class, "TransitionKind");
			this.addEEnumLiteral(this.transitionKindEEnum, (TransitionKindEnum) TransitionKindEnum.INTERNAL);
			this.addEEnumLiteral(this.transitionKindEEnum, (TransitionKindEnum) TransitionKindEnum.LOCAL);
			this.addEEnumLiteral(this.transitionKindEEnum, (TransitionKindEnum) TransitionKindEnum.EXTERNAL);
			this.initEEnum(this.objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class, "ObjectNodeOrderingKind");
			this.addEEnumLiteral(this.objectNodeOrderingKindEEnum,
					(ObjectNodeOrderingKindEnum) ObjectNodeOrderingKindEnum.UNORDERED);
			this.addEEnumLiteral(this.objectNodeOrderingKindEEnum,
					(ObjectNodeOrderingKindEnum) ObjectNodeOrderingKindEnum.ORDERED);
			this.addEEnumLiteral(this.objectNodeOrderingKindEEnum,
					(ObjectNodeOrderingKindEnum) ObjectNodeOrderingKindEnum.LIFO);
			this.addEEnumLiteral(this.objectNodeOrderingKindEEnum,
					(ObjectNodeOrderingKindEnum) ObjectNodeOrderingKindEnum.FIFO);
			this.initEEnum(this.parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind");
			this.addEEnumLiteral(this.parameterDirectionKindEEnum,
					(ParameterDirectionKindEnum) ParameterDirectionKindEnum.IN);
			this.addEEnumLiteral(this.parameterDirectionKindEEnum,
					(ParameterDirectionKindEnum) ParameterDirectionKindEnum.INOUT);
			this.addEEnumLiteral(this.parameterDirectionKindEEnum,
					(ParameterDirectionKindEnum) ParameterDirectionKindEnum.OUT);
			this.addEEnumLiteral(this.parameterDirectionKindEEnum,
					(ParameterDirectionKindEnum) ParameterDirectionKindEnum.RETURN);
			this.initEEnum(this.parameterEffectKindEEnum, ParameterEffectKind.class, "ParameterEffectKind");
			this.addEEnumLiteral(this.parameterEffectKindEEnum,
					(ParameterEffectKindEnum) ParameterEffectKindEnum.CREATE);
			this.addEEnumLiteral(this.parameterEffectKindEEnum, (ParameterEffectKindEnum) ParameterEffectKindEnum.READ);
			this.addEEnumLiteral(this.parameterEffectKindEEnum,
					(ParameterEffectKindEnum) ParameterEffectKindEnum.UPDATE);
			this.addEEnumLiteral(this.parameterEffectKindEEnum,
					(ParameterEffectKindEnum) ParameterEffectKindEnum.DELETE);
			this.initEEnum(this.expansionKindEEnum, ExpansionKind.class, "ExpansionKind");
			this.addEEnumLiteral(this.expansionKindEEnum, (ExpansionKindEnum) ExpansionKindEnum.PARALLEL);
			this.addEEnumLiteral(this.expansionKindEEnum, (ExpansionKindEnum) ExpansionKindEnum.ITERATIVE);
			this.addEEnumLiteral(this.expansionKindEEnum, (ExpansionKindEnum) ExpansionKindEnum.STREAM);
			this.initEDataType(this.stringEDataType, String.class, "String", true, false);
			this.initEDataType(this.booleanEDataType, Boolean.TYPE, "Boolean", true, false);
			this.initEDataType(this.integerEDataType, Integer.TYPE, "Integer", true, false);
			this.initEDataType(this.unlimitedNaturalEDataType, Integer.TYPE, "UnlimitedNatural", true, false);
			this.initEDataType(this.realEDataType, Double.TYPE, "Real", true, false);
			this.initEDataType(this.parameterParameterEffectKindEDataType, ParameterEffectKind.class,
					"ParameterParameterEffectKind", true, false);
			this.initEDataType(this.namedElementVisibilityKindEDataType, VisibilityKind.class,
					"NamedElementVisibilityKind", true, false);
			this.createResource("http://www.nomagic.com/magicdraw/UML/2.5.1");
			this.createGenModelAnnotations();
			this.createMOFAnnotations();
			this.createMdTransientAnnotations();
			this.createSubsetsAnnotations();
			this.createDuplicatesAnnotations();
			this.createRedefinesAnnotations();
			this.createUnionAnnotations();
			this.createMdContainmentAnnotations();
			this.createRenamedAnnotations();
		}
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createRenamedAnnotations() {
		this.addAnnotation(this.getConnectableElement_TemplateParameter(), "renamed",
				new String[]{"name", "templateParameter"});
		this.addAnnotation(this.getPackageableElement_Visibility(), "renamed", new String[]{"name", "visibility"});
		this.addAnnotation(this.getClassifier_OwnedTemplateSignature(), "renamed",
				new String[]{"name", "ownedTemplateSignature"});
		this.addAnnotation(this.getClassifier_TemplateParameter(), "renamed",
				new String[]{"name", "templateParameter"});
		this.addAnnotation(this.getClass_OwnedAttribute(), "renamed", new String[]{"name", "ownedAttribute"});
		this.addAnnotation(this.getClass_Abstract(), "renamed", new String[]{"name", "isAbstract"});
		this.addAnnotation(this.getStructuredActivityNode_Activity(), "renamed", new String[]{"name", "activity"});
		this.addAnnotation(this.getVertex_RedefinitionContext(), "renamed",
				new String[]{"name", "redefinitionContext"});
		this.addAnnotation(this.getRegion_RedefinitionContext(), "renamed",
				new String[]{"name", "redefinitionContext"});
		this.addAnnotation(this.getTransition_RedefinitionContext(), "renamed",
				new String[]{"name", "redefinitionContext"});
		this.addAnnotation(this.getOperation_RaisedException(), "renamed", new String[]{"name", "raisedException"});
		this.addAnnotation(this.getOperation_OwnedParameter(), "renamed", new String[]{"name", "ownedParameter"});
		this.addAnnotation(this.getOperation_TemplateParameter(), "renamed", new String[]{"name", "templateParameter"});
		this.addAnnotation(this.getCreateLinkAction_EndData(), "renamed", new String[]{"name", "endData"});
		this.addAnnotation(this.getOperationTemplateParameter_ParameteredElement(), "renamed",
				new String[]{"name", "parameteredElement"});
		this.addAnnotation(this.getStateInvariant_Covered(), "renamed", new String[]{"name", "covered"});
		this.addAnnotation(this.getDestroyLinkAction_EndData(), "renamed", new String[]{"name", "endData"});
		this.addAnnotation(this.getOccurrenceSpecification_Covered(), "renamed", new String[]{"name", "covered"});
		this.addAnnotation(this.getIntervalConstraint_Specification(), "renamed",
				new String[]{"name", "specification"});
		this.addAnnotation(this.getTimeInterval_Max(), "renamed", new String[]{"name", "max"});
		this.addAnnotation(this.getTimeInterval_Min(), "renamed", new String[]{"name", "min"});
		this.addAnnotation(this.getTimeConstraint_Specification(), "renamed", new String[]{"name", "specification"});
		this.addAnnotation(this.getDurationInterval_Max(), "renamed", new String[]{"name", "max"});
		this.addAnnotation(this.getDurationInterval_Min(), "renamed", new String[]{"name", "min"});
		this.addAnnotation(this.getDurationConstraint_Specification(), "renamed",
				new String[]{"name", "specification"});
		this.addAnnotation(this.getExtension_OwnedEnd(), "renamed", new String[]{"name", "ownedEnd"});
		this.addAnnotation(this.getExtensionEnd_Lower(), "renamed", new String[]{"name", "lower"});
		this.addAnnotation(this.getExtensionEnd_Type(), "renamed", new String[]{"name", "type"});
		this.addAnnotation(this.getClassifierTemplateParameter_ParameteredElement(), "renamed",
				new String[]{"name", "parameteredElement"});
		this.addAnnotation(this.getConnectableElementTemplateParameter_ParameteredElement(), "renamed",
				new String[]{"name", "parameteredElement"});
		this.addAnnotation(this.getEnumerationLiteral_Classifier(), "renamed", new String[]{"name", "classifier"});
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		this.addAnnotation(this, source, new String[]{"documentation", "Author:.\nCreated:.\nTitle:.\nComment:.\n"},
				new URI[0]);
		this.addAnnotation(this.variableEClass, source, new String[]{"documentation",
				"A Variable is a ConnectableElement that may store values during the execution of an Activity. Reading and writing the values of a Variable provides an alternative means for passing data than the use of ObjectFlows. A Variable may be owned directly by an Activity, in which case it is accessible from anywhere within that activity, or it may be owned by a StructuredActivityNode, in which case it is only accessible within that node."},
				new URI[0]);
		this.addAnnotation(this.getVariable_Scope(), source,
				new String[]{"documentation", "A StructuredActivityNode that owns the Variable."}, new URI[0]);
		this.addAnnotation(this.getVariable_ActivityScope(), source,
				new String[]{"documentation", "An Activity that owns the Variable."}, new URI[0]);
		this.addAnnotation(this.connectableElementEClass, source, new String[]{"documentation",
				"ConnectableElement is an abstract metaclass representing a set of instances that play roles of a StructuredClassifier. ConnectableElements may be joined by attached Connectors and specify configurations of linked instances to be created within an instance of the containing StructuredClassifier."},
				new URI[0]);
		this.addAnnotation(this.getConnectableElement_TemplateParameter(), source, new String[]{"documentation",
				"The ConnectableElementTemplateParameter for this ConnectableElement parameter."}, new URI[0]);
		this.addAnnotation(this.getConnectableElement_End(), source,
				new String[]{"documentation", "A set of ConnectorEnds that attach to this ConnectableElement."},
				new URI[0]);
		this.addAnnotation(this.typedElementEClass, source, new String[]{"documentation",
				"A TypedElement is a NamedElement that may have a Type specified for it."}, new URI[0]);
		this.addAnnotation(this.getTypedElement_Type(), source,
				new String[]{"documentation", "The type of the TypedElement."}, new URI[0]);
		this.addAnnotation(this.namedElementEClass, source, new String[]{"documentation",
				"A NamedElement is an Element in a model that may have a name. The name may be given directly and/or via the use of a StringExpression."},
				new URI[0]);
		this.addAnnotation(this.getNamedElement_ClientDependency(), source, new String[]{"documentation",
				"Indicates the Dependencies that reference this NamedElement as a client."}, new URI[0]);
		this.addAnnotation(this.getNamedElement_SupplierDependency(), source,
				new String[]{"documentation", "Indicates the dependencies that reference the supplier."}, new URI[0]);
		this.addAnnotation(this.getNamedElement_Namespace(), source,
				new String[]{"documentation", "Specifies the Namespace that owns the NamedElement."}, new URI[0]);
		this.addAnnotation(this.getNamedElement_Name(), source,
				new String[]{"documentation", "The name of the NamedElement."}, new URI[0]);
		this.addAnnotation(this.getNamedElement_NameExpression(), source,
				new String[]{"documentation", "The StringExpression used to define the name of this NamedElement."},
				new URI[0]);
		this.addAnnotation(this.getNamedElement_QualifiedName(), source, new String[]{"documentation",
				"A name that allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing Namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself."},
				new URI[0]);
		this.addAnnotation(this.getNamedElement_Visibility(), source,
				new String[]{"documentation",
						"Determines whether and how the NamedElement is visible outside its owning Namespace."},
				new URI[0]);
		this.addAnnotation(this.elementEClass, source, new String[]{"documentation",
				"An Element is a constituent of a model. As such, it has the capability of owning other Elements."},
				new URI[0]);
		this.addAnnotation(this.getElement_OwnedComment(), source,
				new String[]{"documentation", "The Comments owned by this Element."}, new URI[0]);
		this.addAnnotation(this.getElement_OwnedElement(), source,
				new String[]{"documentation", "The Elements owned by this Element."}, new URI[0]);
		this.addAnnotation(this.getElement_Owner(), source,
				new String[]{"documentation", "The Element that owns this Element."}, new URI[0]);
		this.addAnnotation(this.commentEClass, source, new String[]{"documentation",
				"A Comment is a textual annotation that can be attached to a set of Elements."}, new URI[0]);
		this.addAnnotation(this.getComment_AnnotatedElement(), source,
				new String[]{"documentation", "References the Element(s) being commented."}, new URI[0]);
		this.addAnnotation(this.getComment_Body(), source,
				new String[]{"documentation", "Specifies a string that is the comment."}, new URI[0]);
		this.addAnnotation(this.stringEDataType, source, new String[]{"documentation",
				"String is a sequence of characters in some suitable character set used to display information about the model. Character sets may include non-Roman alphabets and characters."},
				new URI[0]);
		this.addAnnotation(this.instanceSpecificationEClass, source, new String[]{"documentation",
				"An InstanceSpecification is a model element that represents an instance in a modeled system. An InstanceSpecification can act as a DeploymentTarget in a Deployment relationship, in the case that it represents an instance of a Node. It can also act as a DeployedArtifact, if it represents an instance of an Artifact."},
				new URI[0]);
		this.addAnnotation(this.getInstanceSpecification_Slot(), source, new String[]{"documentation",
				"A Slot giving the value or values of a StructuralFeature of the instance. An InstanceSpecification can have one Slot per StructuralFeature of its Classifiers, including inherited features. It is not necessary to model a Slot for every StructuralFeature, in which case the InstanceSpecification is a partial description."},
				new URI[0]);
		this.addAnnotation(this.getInstanceSpecification_Specification(), source,
				new String[]{"documentation", "A specification of how to compute, derive, or construct the instance."},
				new URI[0]);
		this.addAnnotation(this.getInstanceSpecification_Classifier(), source, new String[]{"documentation",
				"The Classifier or Classifiers of the represented instance. If multiple Classifiers are specified, the instance is classified by all of them."},
				new URI[0]);
		this.addAnnotation(this.deploymentTargetEClass, source,
				new String[]{"documentation", "A deployment target is the location for a deployed artifact."},
				new URI[0]);
		this.addAnnotation(this.getDeploymentTarget_DeployedElement(), source, new String[]{"documentation",
				"The set of elements that are manifested in an Artifact that is involved in Deployment to a DeploymentTarget."},
				new URI[0]);
		this.addAnnotation(this.getDeploymentTarget_Deployment(), source,
				new String[]{"documentation", "The set of Deployments for a DeploymentTarget."}, new URI[0]);
		this.addAnnotation(this.packageableElementEClass, source, new String[]{"documentation",
				"A PackageableElement is a NamedElement that may be owned directly by a Package. A PackageableElement is also able to serve as the parameteredElement of a TemplateParameter."},
				new URI[0]);
		this.addAnnotation(this.getPackageableElement_Visibility(), source, new String[]{"documentation",
				"A PackageableElement must have a visibility specified if it is owned by a Namespace. The default visibility is public."},
				new URI[0]);
		this.addAnnotation(this.parameterableElementEClass, source, new String[]{"documentation",
				"A ParameterableElement is an Element that can be exposed as a formal TemplateParameter for a template, or specified as an actual parameter in a binding of a template."},
				new URI[0]);
		this.addAnnotation(this.getParameterableElement_OwningTemplateParameter(), source,
				new String[]{"documentation", "The formal TemplateParameter that owns this ParameterableElement."},
				new URI[0]);
		this.addAnnotation(this.getParameterableElement_TemplateParameter(), source,
				new String[]{"documentation",
						"The TemplateParameter that exposes this ParameterableElement as a formal parameter."},
				new URI[0]);
		this.addAnnotation(this.templateParameterEClass, source,
				new String[]{"documentation",
						"A TemplateParameter exposes a ParameterableElement as a formal parameter of a template."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameter_Default(), source, new String[]{"documentation",
				"The ParameterableElement that is the default for this formal TemplateParameter."}, new URI[0]);
		this.addAnnotation(this.getTemplateParameter_OwnedDefault(), source, new String[]{"documentation",
				"The ParameterableElement that is owned by this TemplateParameter for the purpose of providing a default."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameter_ParameteredElement(), source,
				new String[]{"documentation", "The ParameterableElement exposed by this TemplateParameter."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameter_Signature(), source,
				new String[]{"documentation", "The TemplateSignature that owns this TemplateParameter."}, new URI[0]);
		this.addAnnotation(this.getTemplateParameter_OwnedParameteredElement(), source, new String[]{"documentation",
				"The ParameterableElement that is owned by this TemplateParameter for the purpose of exposing it as the parameteredElement."},
				new URI[0]);
		this.addAnnotation(this.templateSignatureEClass, source,
				new String[]{"documentation",
						"A Template Signature bundles the set of formal TemplateParameters for a template."},
				new URI[0]);
		this.addAnnotation(this.getTemplateSignature_Parameter(), source, new String[]{"documentation",
				"The ordered set of all formal TemplateParameters for this TemplateSignature."}, new URI[0]);
		this.addAnnotation(this.getTemplateSignature_Template(), source,
				new String[]{"documentation", "The TemplateableElement that owns this TemplateSignature."}, new URI[0]);
		this.addAnnotation(this.getTemplateSignature_OwnedParameter(), source,
				new String[]{"documentation", "The formal parameters that are owned by this TemplateSignature."},
				new URI[0]);
		this.addAnnotation(this.templateableElementEClass, source, new String[]{"documentation",
				"A TemplateableElement is an Element that can optionally be defined as a template and bound to other templates."},
				new URI[0]);
		this.addAnnotation(this.getTemplateableElement_TemplateBinding(), source,
				new String[]{"documentation",
						"The optional TemplateBindings from this TemplateableElement to one or more templates."},
				new URI[0]);
		this.addAnnotation(this.getTemplateableElement_OwnedTemplateSignature(), source, new String[]{"documentation",
				"The optional TemplateSignature specifying the formal TemplateParameters for this TemplateableElement. If a TemplateableElement has a TemplateSignature, then it is a template."},
				new URI[0]);
		this.addAnnotation(this.templateBindingEClass, source, new String[]{"documentation",
				"A TemplateBinding is a DirectedRelationship between a TemplateableElement and a template. A TemplateBinding specifies the TemplateParameterSubstitutions of actual parameters for the formal parameters of the template."},
				new URI[0]);
		this.addAnnotation(this.getTemplateBinding_ParameterSubstitution(), source,
				new String[]{"documentation", "The TemplateParameterSubstitutions owned by this TemplateBinding."},
				new URI[0]);
		this.addAnnotation(this.getTemplateBinding_Signature(), source,
				new String[]{"documentation",
						"The TemplateSignature for the template that is the target of this TemplateBinding."},
				new URI[0]);
		this.addAnnotation(this.getTemplateBinding_BoundElement(), source,
				new String[]{"documentation", "The TemplateableElement that is bound by this TemplateBinding."},
				new URI[0]);
		this.addAnnotation(this.directedRelationshipEClass, source, new String[]{"documentation",
				"A DirectedRelationship represents a relationship between a collection of source model Elements and a collection of target model Elements."},
				new URI[0]);
		this.addAnnotation(this.getDirectedRelationship_Source(), source,
				new String[]{"documentation", "Specifies the source Element(s) of the DirectedRelationship."},
				new URI[0]);
		this.addAnnotation(this.getDirectedRelationship_Target(), source,
				new String[]{"documentation", "Specifies the target Element(s) of the DirectedRelationship."},
				new URI[0]);
		this.addAnnotation(this.relationshipEClass, source, new String[]{"documentation",
				"Relationship is an abstract concept that specifies some kind of relationship between Elements."},
				new URI[0]);
		this.addAnnotation(this.getRelationship_RelatedElement(), source,
				new String[]{"documentation", "Specifies the elements related by the Relationship."}, new URI[0]);
		this.addAnnotation(this.informationFlowEClass, source, new String[]{"documentation",
				"InformationFlows describe circulation of information through a system in a general manner. They do not specify the nature of the information, mechanisms by which it is conveyed, sequences of exchange or any control conditions. During more detailed modeling, representation and realization links may be added to specify which model elements implement an InformationFlow and to show how information is conveyed.  InformationFlows require some kind of “information channel” for unidirectional transmission of information items from sources to targets.  They specify the information channel’s realizations, if any, and identify the information that flows along them.  Information moving along the information channel may be represented by abstract InformationItems and by concrete Classifiers."},
				new URI[0]);
		this.addAnnotation(this.getInformationFlow_Conveyed(), source, new String[]{"documentation",
				"Specifies the information items that may circulate on this information flow."}, new URI[0]);
		this.addAnnotation(this.getInformationFlow_RealizingMessage(), source,
				new String[]{"documentation", "Determines which Messages will realize the specified flow."},
				new URI[0]);
		this.addAnnotation(this.getInformationFlow_RealizingConnector(), source,
				new String[]{"documentation", "Determines which Connectors will realize the specified flow."},
				new URI[0]);
		this.addAnnotation(this.getInformationFlow_RealizingActivityEdge(), source,
				new String[]{"documentation", "Determines which ActivityEdges will realize the specified flow."},
				new URI[0]);
		this.addAnnotation(this.getInformationFlow_InformationSource(), source,
				new String[]{"documentation", "Defines from which source the conveyed InformationItems are initiated."},
				new URI[0]);
		this.addAnnotation(this.getInformationFlow_InformationTarget(), source,
				new String[]{"documentation", "Defines to which target the conveyed InformationItems are directed."},
				new URI[0]);
		this.addAnnotation(this.getInformationFlow_Realization(), source,
				new String[]{"documentation", "Determines which Relationship will realize the specified flow."},
				new URI[0]);
		this.addAnnotation(this.classifierEClass, source,
				new String[]{"documentation",
						"A Classifier represents a classification of instances according to their Features."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_OwnedTemplateSignature(), source,
				new String[]{"documentation",
						"The optional RedefinableTemplateSignature specifying the formal template parameters."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_TemplateParameter(), source, new String[]{"documentation",
				"TheClassifierTemplateParameter that exposes this element as a formal parameter."}, new URI[0]);
		this.addAnnotation(this.getClassifier_UseCase(), source,
				new String[]{"documentation", "The set of UseCases for which this Classifier is the subject."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_OwnedUseCase(), source,
				new String[]{"documentation", "The UseCases owned by this classifier."}, new URI[0]);
		this.addAnnotation(this.getClassifier_Feature(), source, new String[]{"documentation",
				"Specifies each Feature directly defined in the classifier. Note that there may be members of the Classifier that are of the type Feature but are not included, e.g., inherited features."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_Representation(), source,
				new String[]{"documentation",
						"A CollaborationUse which indicates the Collaboration that represents this Classifier."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_CollaborationUse(), source,
				new String[]{"documentation", "The CollaborationUses owned by the Classifier."}, new URI[0]);
		this.addAnnotation(this.getClassifier_Attribute(), source, new String[]{"documentation",
				"All of the Properties that are direct (i.e., not inherited or imported) attributes of the Classifier."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_General(), source,
				new String[]{"documentation", "The generalizing Classifiers for this Classifier."}, new URI[0]);
		this.addAnnotation(this.getClassifier_Generalization(), source, new String[]{"documentation",
				"The Generalization relationships for this Classifier. These Generalizations navigate to more general Classifiers in the generalization hierarchy."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_PowertypeExtent(), source,
				new String[]{"documentation", "The GeneralizationSet of which this Classifier is a power type."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_InheritedMember(), source, new String[]{"documentation",
				"All elements inherited by this Classifier from its general Classifiers."}, new URI[0]);
		this.addAnnotation(this.getClassifier_Abstract(), source, new String[]{"documentation",
				"If true, the Classifier can only be instantiated by instantiating one of its specializations. An abstract Classifier is intended to be used by other Classifiers e.g., as the target of Associations or Generalizations."},
				new URI[0]);
		this.addAnnotation(this.getClassifier_FinalSpecialization(), source,
				new String[]{"documentation", "If true, the Classifier cannot be specialized."}, new URI[0]);
		this.addAnnotation(this.getClassifier_RedefinedClassifier(), source,
				new String[]{"documentation", "The Classifiers redefined by this Classifier."}, new URI[0]);
		this.addAnnotation(this.getClassifier_Substitution(), source,
				new String[]{"documentation", "The Substitutions owned by this Classifier."}, new URI[0]);
		this.addAnnotation(this.namespaceEClass, source, new String[]{"documentation",
				"A Namespace is an Element in a model that owns and/or imports a set of NamedElements that can be identified by name."},
				new URI[0]);
		this.addAnnotation(this.getNamespace_ElementImport(), source,
				new String[]{"documentation", "References the ElementImports owned by the Namespace."}, new URI[0]);
		this.addAnnotation(this.getNamespace_OwnedRule(), source,
				new String[]{"documentation", "Specifies a set of Constraints owned by this Namespace."}, new URI[0]);
		this.addAnnotation(this.getNamespace_PackageImport(), source,
				new String[]{"documentation", "References the PackageImports owned by the Namespace."}, new URI[0]);
		this.addAnnotation(this.getNamespace_ImportedMember(), source, new String[]{"documentation",
				"References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports."},
				new URI[0]);
		this.addAnnotation(this.getNamespace_Member(), source, new String[]{"documentation",
				"A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance."},
				new URI[0]);
		this.addAnnotation(this.getNamespace_OwnedMember(), source,
				new String[]{"documentation", "A collection of NamedElements owned by the Namespace."}, new URI[0]);
		this.addAnnotation(this.elementImportEClass, source, new String[]{"documentation",
				"An ElementImport identifies a NamedElement in a Namespace other than the one that owns that NamedElement and allows the NamedElement to be referenced using an unqualified name in the Namespace owning the ElementImport."},
				new URI[0]);
		this.addAnnotation(this.getElementImport_Alias(), source, new String[]{"documentation",
				"Specifies the name that should be added to the importing Namespace in lieu of the name of the imported PackagableElement. The alias must not clash with any other member in the importing Namespace. By default, no alias is used."},
				new URI[0]);
		this.addAnnotation(this.getElementImport_ImportedElement(), source, new String[]{"documentation",
				"Specifies the PackageableElement whose name is to be added to a Namespace."}, new URI[0]);
		this.addAnnotation(this.getElementImport_Visibility(), source, new String[]{"documentation",
				"Specifies the visibility of the imported PackageableElement within the importingNamespace, i.e., whether the  importedElement will in turn be visible to other Namespaces. If the ElementImport is public, the importedElement will be visible outside the importingNamespace while, if the ElementImport is private, it will not."},
				new URI[0]);
		this.addAnnotation(this.getElementImport_ImportingNamespace(), source,
				new String[]{"documentation",
						"Specifies the Namespace that imports a PackageableElement from another Namespace."},
				new URI[0]);
		this.addAnnotation(this.visibilityKindEEnum, source, new String[]{"documentation",
				"VisibilityKind is an enumeration type that defines literals to determine the visibility of Elements in a model."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.visibilityKindEEnum.getELiterals().get(0), source, new String[]{
				"documentation",
				"A Named Element with public visibility is visible to all elements that can access the contents of the Namespace that owns it."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.visibilityKindEEnum.getELiterals().get(1), source,
				new String[]{"documentation",
						"A NamedElement with private visibility is only visible inside the Namespace that owns it."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.visibilityKindEEnum.getELiterals().get(2), source, new String[]{
				"documentation",
				"A NamedElement with protected visibility is visible to Elements that have a generalization relationship to the Namespace that owns it."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.visibilityKindEEnum.getELiterals().get(3), source, new String[]{
				"documentation",
				"A NamedElement with package visibility is visible to all Elements within the nearest enclosing Package (given that other owning Elements have proper visibility). Outside the nearest enclosing Package, a NamedElement marked as having package visibility is not visible.  Only NamedElements that are not owned by Packages can be marked as having package visibility. "},
				new URI[0]);
		this.addAnnotation(this.profileEClass, source, new String[]{"documentation",
				"A profile defines limited extensions to a reference metamodel with the purpose of adapting the metamodel to a specific platform or domain."},
				new URI[0]);
		this.addAnnotation(this.getProfile_MetamodelReference(), source,
				new String[]{"documentation",
						"References a package containing (directly or indirectly) metaclasses that may be extended."},
				new URI[0]);
		this.addAnnotation(this.getProfile_MetaclassReference(), source,
				new String[]{"documentation", "References a metaclass that may be extended."}, new URI[0]);
		this.addAnnotation(this.packageEClass, source, new String[]{"documentation",
				"A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.\nPackage specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.\nA package is used to group elements, and provides a namespace for the grouped elements."},
				new URI[0]);
		this.addAnnotation(this.getPackage_URI(), source, new String[]{"documentation",
				"Provides an identifier for the package that can be used for many purposes. A URI is the universally unique identification of the package following the IETF URI specification, RFC 2396 http://www.ietf.org/rfc/rfc2396.txt and it must comply with those syntax rules."},
				new URI[0]);
		this.addAnnotation(this.getPackage_NestedPackage(), source,
				new String[]{"documentation", "References the packaged elements that are Packages."}, new URI[0]);
		this.addAnnotation(this.getPackage_NestingPackage(), source,
				new String[]{"documentation", "References the Package that owns this Package."}, new URI[0]);
		this.addAnnotation(this.getPackage_OwnedStereotype(), source,
				new String[]{"documentation", "References the Stereotypes that are owned by the Package."}, new URI[0]);
		this.addAnnotation(this.getPackage_OwnedType(), source,
				new String[]{"documentation", "References the packaged elements that are Types."}, new URI[0]);
		this.addAnnotation(this.getPackage_PackageMerge(), source,
				new String[]{"documentation", "References the PackageMerges that are owned by this Package."},
				new URI[0]);
		this.addAnnotation(this.getPackage_PackagedElement(), source,
				new String[]{"documentation", "Specifies the packageable elements that are owned by this Package."},
				new URI[0]);
		this.addAnnotation(this.getPackage_ProfileApplication(), source, new String[]{"documentation",
				"References the ProfileApplications that indicate which profiles have been applied to the Package."},
				new URI[0]);
		this.addAnnotation(this.stereotypeEClass, source, new String[]{"documentation",
				"A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass."},
				new URI[0]);
		this.addAnnotation(this.getStereotype_Icon(), source, new String[]{"documentation",
				"Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements."},
				new URI[0]);
		this.addAnnotation(this.getStereotype_Profile(), source,
				new String[]{"documentation", "The profile that directly or indirectly contains this stereotype."},
				new URI[0]);
		this.addAnnotation(this.classEClass, source, new String[]{"documentation",
				"A Class classifies a set of objects and specifies the features that characterize the structure and behavior of those objects.  A Class may have an internal structure and Ports.\r\n"},
				new URI[0]);
		this.addAnnotation(this.getClass_OwnedAttribute(), source,
				new String[]{"documentation", "The attributes (i.e., the Properties) owned by the Class."}, new URI[0]);
		this.addAnnotation(this.getClass_Abstract(), source, new String[]{"documentation",
				"If true, the Class does not provide a complete declaration and cannot be instantiated. An abstract Class is typically used as a target of Associations or Generalizations."},
				new URI[0]);
		this.addAnnotation(this.getClass_OwnedReception(), source,
				new String[]{"documentation", "The Receptions owned by the Class."}, new URI[0]);
		this.addAnnotation(this.getClass_OwnedOperation(), source,
				new String[]{"documentation", "The Operations owned by the Class."}, new URI[0]);
		this.addAnnotation(this.getClass_Extension(), source, new String[]{"documentation",
				"This property is used when the Class is acting as a metaclass. It references the Extensions that specify additional properties of the metaclass. The property is derived from the Extensions whose memberEnds are typed by the Class."},
				new URI[0]);
		this.addAnnotation(this.getClass_Active(), source, new String[]{"documentation",
				"Determines whether an object specified by this Class is active or not. If true, then the owning Class is referred to as an active Class. If false, then such a Class is referred to as a passive Class."},
				new URI[0]);
		this.addAnnotation(this.getClass_NestedClassifier(), source,
				new String[]{"documentation", "The Classifiers owned by the Class that are not ownedBehaviors."},
				new URI[0]);
		this.addAnnotation(this.getClass_SuperClass(), source,
				new String[]{"documentation", "The superclasses of a Class, derived from its Generalizations."},
				new URI[0]);
		this.addAnnotation(this.behavioredClassifierEClass, source, new String[]{"documentation",
				"A BehavioredClassifier may have InterfaceRealizations, and owns a set of Behaviors one of which may specify the behavior of the BehavioredClassifier itself."},
				new URI[0]);
		this.addAnnotation(this.getBehavioredClassifier_ClassifierBehavior(), source, new String[]{"documentation",
				"A Behavior that specifies the behavior of the BehavioredClassifier itself."}, new URI[0]);
		this.addAnnotation(this.getBehavioredClassifier_InterfaceRealization(), source, new String[]{"documentation",
				"The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation."},
				new URI[0]);
		this.addAnnotation(this.getBehavioredClassifier_OwnedBehavior(), source,
				new String[]{"documentation", "Behaviors owned by a BehavioredClassifier."}, new URI[0]);
		this.addAnnotation(this.behaviorEClass, source, new String[]{"documentation",
				"Behavior is a specification of how its context BehavioredClassifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_Context(), source, new String[]{"documentation",
				"The BehavioredClassifier that is the context for the execution of the Behavior. A Behavior that is directly owned as a nestedClassifier does not have a context. Otherwise, to determine the context of a Behavior, find the first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any. If there is such a BehavioredClassifier, then it is the context, unless it is itself a Behavior with a non-empty context, in which case that is also the context for the original Behavior. For example, following this algorithm, the context of an entry Behavior in a StateMachine is the BehavioredClassifier that owns the StateMachine. The features of the context BehavioredClassifier as well as the Elements visible to the context Classifier are visible to the Behavior."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_Reentrant(), source, new String[]{"documentation",
				"Tells whether the Behavior can be invoked while it is still executing from a previous invocation."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_OwnedParameter(), source, new String[]{"documentation",
				"References a list of Parameters to the Behavior which describes the order and type of arguments that can be given when the Behavior is invoked and of the values which will be returned when the Behavior completes its execution."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_Specification(), source, new String[]{"documentation",
				"Designates a BehavioralFeature that the Behavior implements. The BehavioralFeature must be owned by the BehavioredClassifier that owns the Behavior or be inherited by it. The Parameters of the BehavioralFeature and the implementing Behavior must match. A Behavior does not need to have a specification, in which case it either is the classifierBehavior of a BehavioredClassifier or it can only be invoked by another Behavior of the Classifier."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_OwnedParameterSet(), source,
				new String[]{"documentation", "The ParameterSets owned by this Behavior."}, new URI[0]);
		this.addAnnotation(this.getBehavior_Postcondition(), source, new String[]{"documentation",
				"An optional set of Constraints specifying what is fulfilled after the execution of the Behavior is completed, if its precondition was fulfilled before its invocation."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_Precondition(), source, new String[]{"documentation",
				"An optional set of Constraints specifying what must be fulfilled before the Behavior is invoked."},
				new URI[0]);
		this.addAnnotation(this.getBehavior_RedefinedBehavior(), source, new String[]{"documentation",
				"References the Behavior that this Behavior redefines. A subtype of Behavior may redefine any other subtype of Behavior. If the Behavior implements a BehavioralFeature, it replaces the redefined Behavior. If the Behavior is a classifierBehavior, it extends the redefined Behavior."},
				new URI[0]);
		this.addAnnotation(this.booleanEDataType, source,
				new String[]{"documentation",
						"Boolean is used for logical expressions, consisting of the predefined values true and false."},
				new URI[0]);
		this.addAnnotation(this.parameterEClass, source, new String[]{"documentation",
				"A Parameter is a specification of an argument used to pass information into or out of an invocation of a BehavioralFeature.  Parameters can be treated as ConnectableElements within Collaborations."},
				new URI[0]);
		this.addAnnotation(this.getParameter_ParameterSet(), source,
				new String[]{"documentation", "The ParameterSets containing the parameter. See ParameterSet."},
				new URI[0]);
		this.addAnnotation(this.getParameter_Operation(), source,
				new String[]{"documentation", "The Operation owning this parameter."}, new URI[0]);
		this.addAnnotation(this.getParameter_DefaultValue(), source, new String[]{"documentation",
				"Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter."},
				new URI[0]);
		this.addAnnotation(this.getParameter_Default(), source,
				new String[]{"documentation",
						"A String that represents a value to be used when no argument is supplied for the Parameter."},
				new URI[0]);
		this.addAnnotation(this.getParameter_Direction(), source,
				new String[]{"documentation",
						"Indicates whether a parameter is being sent into or out of a behavioral element."},
				new URI[0]);
		this.addAnnotation(this.getParameter_Effect(), source, new String[]{"documentation",
				"Specifies the effect that executions of the owner of the Parameter have on objects passed in or out of the parameter."},
				new URI[0]);
		this.addAnnotation(this.getParameter_Exception(), source,
				new String[]{"documentation",
						"Tells whether an output parameter may emit a value to the exclusion of the other outputs."},
				new URI[0]);
		this.addAnnotation(this.getParameter_Stream(), source, new String[]{"documentation",
				"Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter may post values while the behavior is executing."},
				new URI[0]);
		this.addAnnotation(this.multiplicityElementEClass, source, new String[]{"documentation",
				"A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A MultiplicityElement embeds this information to specify the allowable cardinalities for an instantiation of the Element."},
				new URI[0]);
		this.addAnnotation(this.getMultiplicityElement_Ordered(), source, new String[]{"documentation",
				"For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this MultiplicityElement are sequentially ordered."},
				new URI[0]);
		this.addAnnotation(this.getMultiplicityElement_Unique(), source, new String[]{"documentation",
				"For a multivalued multiplicity, this attributes specifies whether the values in an instantiation of this MultiplicityElement are unique."},
				new URI[0]);
		this.addAnnotation(this.getMultiplicityElement_Lower(), source,
				new String[]{"documentation", "The lower bound of the multiplicity interval."}, new URI[0]);
		this.addAnnotation(this.getMultiplicityElement_LowerValue(), source,
				new String[]{"documentation", "The specification of the lower bound for this multiplicity."},
				new URI[0]);
		this.addAnnotation(this.getMultiplicityElement_UpperValue(), source,
				new String[]{"documentation", "The specification of the upper bound for this multiplicity."},
				new URI[0]);
		this.addAnnotation(this.getMultiplicityElement_Upper(), source,
				new String[]{"documentation", "The upper bound of the multiplicity interval."}, new URI[0]);
		this.addAnnotation(this.integerEDataType, source,
				new String[]{"documentation", "Integer is a primitive type representing integer values."}, new URI[0]);
		this.addAnnotation(this.valueSpecificationEClass, source, new String[]{"documentation",
				"A ValueSpecification is the specification of a (possibly empty) set of values. A ValueSpecification is a ParameterableElement that may be exposed as a formal TemplateParameter and provided as the actual parameter in the binding of a template."},
				new URI[0]);
		this.addAnnotation(this.lifelineEClass, source, new String[]{"documentation",
				"A Lifeline represents an individual participant in the Interaction. While parts and structural features may have multiplicity greater than 1, Lifelines represent only one interacting entity."},
				new URI[0]);
		this.addAnnotation(this.getLifeline_CoveredBy(), source,
				new String[]{"documentation", "References the InteractionFragments in which this Lifeline takes part."},
				new URI[0]);
		this.addAnnotation(this.getLifeline_Interaction(), source,
				new String[]{"documentation", "References the Interaction enclosing this Lifeline."}, new URI[0]);
		this.addAnnotation(this.getLifeline_DecomposedAs(), source,
				new String[]{"documentation", "References the Interaction that represents the decomposition."},
				new URI[0]);
		this.addAnnotation(this.getLifeline_Represents(), source, new String[]{"documentation",
				"References the ConnectableElement within the classifier that contains the enclosing interaction."},
				new URI[0]);
		this.addAnnotation(this.getLifeline_Selector(), source, new String[]{"documentation",
				"If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set."},
				new URI[0]);
		this.addAnnotation(this.interactionFragmentEClass, source, new String[]{"documentation",
				"InteractionFragment is an abstract notion of the most general interaction unit. An InteractionFragment is a piece of an Interaction. Each InteractionFragment is conceptually like an Interaction by itself."},
				new URI[0]);
		this.addAnnotation(this.getInteractionFragment_EnclosingInteraction(), source,
				new String[]{"documentation", "The Interaction enclosing this InteractionFragment."}, new URI[0]);
		this.addAnnotation(this.getInteractionFragment_EnclosingOperand(), source, new String[]{"documentation",
				"The operand enclosing this InteractionFragment (they may nest recursively)."}, new URI[0]);
		this.addAnnotation(this.getInteractionFragment_GeneralOrdering(), source,
				new String[]{"documentation", "The general ordering relationships contained in this fragment."},
				new URI[0]);
		this.addAnnotation(this.getInteractionFragment_Covered(), source,
				new String[]{"documentation", "References the Lifelines that the InteractionFragment involves."},
				new URI[0]);
		this.addAnnotation(this.interactionEClass, source, new String[]{"documentation",
				"An Interaction is a unit of Behavior that focuses on the observable exchange of information between connectable elements."},
				new URI[0]);
		this.addAnnotation(this.getInteraction_Action(), source,
				new String[]{"documentation", "Actions owned by the Interaction."}, new URI[0]);
		this.addAnnotation(this.getInteraction_Message(), source,
				new String[]{"documentation", "The Messages contained in this Interaction."}, new URI[0]);
		this.addAnnotation(this.getInteraction_FormalGate(), source, new String[]{"documentation",
				"Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it."},
				new URI[0]);
		this.addAnnotation(this.getInteraction_Lifeline(), source,
				new String[]{"documentation", "Specifies the participants in this Interaction."}, new URI[0]);
		this.addAnnotation(this.getInteraction_Fragment(), source,
				new String[]{"documentation", "The ordered set of fragments in the Interaction."}, new URI[0]);
		this.addAnnotation(this.actionEClass, source, new String[]{"documentation",
				"An Action is the fundamental unit of executable functionality. The execution of an Action represents some transformation or processing in the modeled system. Actions provide the ExecutableNodes within Activities and may also be used within Interactions."},
				new URI[0]);
		this.addAnnotation(this.getAction_LocalPostcondition(), source, new String[]{"documentation",
				"A Constraint that must be satisfied when execution of the Action is completed."}, new URI[0]);
		this.addAnnotation(this.getAction_Output(), source,
				new String[]{"documentation", "The ordered set of OutputPins representing outputs from the Action."},
				new URI[0]);
		this.addAnnotation(this.getAction_LocalPrecondition(), source, new String[]{"documentation",
				"A Constraint that must be satisfied when execution of the Action is started."}, new URI[0]);
		this.addAnnotation(this.getAction_Input(), source,
				new String[]{"documentation", "The ordered set of InputPins representing the inputs to the Action."},
				new URI[0]);
		this.addAnnotation(this.getAction_Context(), source, new String[]{"documentation",
				"The context Classifier of the Behavior that contains this Action, or the Behavior itself if it has no context."},
				new URI[0]);
		this.addAnnotation(this.getAction_LocallyReentrant(), source, new String[]{"documentation",
				"If true, the Action can begin a new, concurrent execution, even if there is already another execution of the Action ongoing. If false, the Action cannot begin a new execution until any previous execution has completed."},
				new URI[0]);
		this.addAnnotation(this.executableNodeEClass, source, new String[]{"documentation",
				"An ExecutableNode is an abstract class for ActivityNodes whose execution may be controlled using ControlFlows and to which ExceptionHandlers may be attached."},
				new URI[0]);
		this.addAnnotation(this.getExecutableNode_Handler(), source, new String[]{"documentation",
				"A set of ExceptionHandlers that are examined if an exception propagates out of the ExceptionNode."},
				new URI[0]);
		this.addAnnotation(this.activityNodeEClass, source, new String[]{"documentation",
				"ActivityNode is an abstract class for points in the flow of an Activity connected by ActivityEdges."},
				new URI[0]);
		this.addAnnotation(this.getActivityNode_Activity(), source,
				new String[]{"documentation",
						"The Activity containing the ActivityNode, if it is directly owned by an Activity."},
				new URI[0]);
		this.addAnnotation(this.getActivityNode_InGroup(), source,
				new String[]{"documentation", "ActivityGroups containing the ActivityNode."}, new URI[0]);
		this.addAnnotation(this.getActivityNode_InPartition(), source,
				new String[]{"documentation", "ActivityPartitions containing the ActivityNode."}, new URI[0]);
		this.addAnnotation(this.getActivityNode_InStructuredNode(), source, new String[]{"documentation",
				"The StructuredActivityNode containing the ActvityNode, if it is directly owned by a StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.getActivityNode_InInterruptibleRegion(), source,
				new String[]{"documentation", "InterruptibleActivityRegions containing the ActivityNode."}, new URI[0]);
		this.addAnnotation(this.getActivityNode_Outgoing(), source,
				new String[]{"documentation", "ActivityEdges that have the ActivityNode as their source."}, new URI[0]);
		this.addAnnotation(this.getActivityNode_Incoming(), source,
				new String[]{"documentation", "ActivityEdges that have the ActivityNode as their target."}, new URI[0]);
		this.addAnnotation(this.getActivityNode_RedefinedNode(), source, new String[]{"documentation",
				"ActivityNodes from a generalization of the Activity containining this ActivityNode that are redefined by this ActivityNode."},
				new URI[0]);
		this.addAnnotation(this.redefinableElementEClass, source, new String[]{"documentation",
				"A RedefinableElement is an element that, when defined in the context of a Classifier, can be redefined more specifically or differently in the context of another Classifier that specializes (directly or indirectly) the context Classifier."},
				new URI[0]);
		this.addAnnotation(this.getRedefinableElement_Leaf(), source, new String[]{"documentation",
				"Indicates whether it is possible to further redefine a RedefinableElement. If the value is true, then it is not possible to further redefine the RedefinableElement."},
				new URI[0]);
		this.addAnnotation(this.getRedefinableElement_RedefinedElement(), source,
				new String[]{"documentation", "The RedefinableElement that is being redefined by this element."},
				new URI[0]);
		this.addAnnotation(this.getRedefinableElement_RedefinitionContext(), source,
				new String[]{"documentation", "The contexts that this element may be redefined from."}, new URI[0]);
		this.addAnnotation(this.activityEClass, source, new String[]{"documentation",
				"An Activity is the specification of parameterized Behavior as the coordinated sequencing of subordinate units."},
				new URI[0]);
		this.addAnnotation(this.getActivity_Edge(), source,
				new String[]{"documentation", "ActivityEdges expressing flow between the nodes of the Activity."},
				new URI[0]);
		this.addAnnotation(this.getActivity_Group(), source,
				new String[]{"documentation", "Top-level ActivityGroups in the Activity."}, new URI[0]);
		this.addAnnotation(this.getActivity_Partition(), source,
				new String[]{"documentation", "Top-level ActivityPartitions in the Activity."}, new URI[0]);
		this.addAnnotation(this.getActivity_StructuredNode(), source,
				new String[]{"documentation", "Top-level StructuredActivityNodes in the Activity."}, new URI[0]);
		this.addAnnotation(this.getActivity_ReadOnly(), source, new String[]{"documentation",
				"If true, this Activity must not make any changes to objects. The default is false (an Activity may make nonlocal changes). (This is an assertion, not an executable property. It may be used by an execution engine to optimize model execution. If the assertion is violated by the Activity, then the model is ill-formed.) "},
				new URI[0]);
		this.addAnnotation(this.getActivity_SingleExecution(), source, new String[]{"documentation",
				"If true, all invocations of the Activity are handled by the same execution."}, new URI[0]);
		this.addAnnotation(this.getActivity_Variable(), source,
				new String[]{"documentation", "Top-level Variables defined by the Activity."}, new URI[0]);
		this.addAnnotation(this.getActivity_Node(), source,
				new String[]{"documentation", "ActivityNodes coordinated by the Activity."}, new URI[0]);
		this.addAnnotation(this.activityEdgeEClass, source,
				new String[]{"documentation",
						"An ActivityEdge is an abstract class for directed connections between two ActivityNodes."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_Guard(), source, new String[]{"documentation",
				"A ValueSpecification that is evaluated to determine if a token can traverse the ActivityEdge. If an ActivityEdge has no guard, then there is no restriction on tokens traversing the edge."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_InGroup(), source,
				new String[]{"documentation", "ActivityGroups containing the ActivityEdge."}, new URI[0]);
		this.addAnnotation(this.getActivityEdge_InPartition(), source,
				new String[]{"documentation", "ActivityPartitions containing the ActivityEdge."}, new URI[0]);
		this.addAnnotation(this.getActivityEdge_InStructuredNode(), source, new String[]{"documentation",
				"The StructuredActivityNode containing the ActivityEdge, if it is owned by a StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_Interrupts(), source,
				new String[]{"documentation",
						"The InterruptibleActivityRegion for which this ActivityEdge is an interruptingEdge."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_RedefinedEdge(), source, new String[]{"documentation",
				"ActivityEdges from a generalization of the Activity containing this ActivityEdge that are redefined by this ActivityEdge."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_Source(), source,
				new String[]{"documentation",
						"The ActivityNode from which tokens are taken when they traverse the ActivityEdge."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_Target(), source, new String[]{"documentation",
				"The ActivityNode to which tokens are put when they traverse the ActivityEdge."}, new URI[0]);
		this.addAnnotation(this.getActivityEdge_Weight(), source, new String[]{"documentation",
				"The minimum number of tokens that must traverse the ActivityEdge at the same time. If no weight is specified, this is equivalent to specifying a constant value of 1."},
				new URI[0]);
		this.addAnnotation(this.getActivityEdge_Activity(), source,
				new String[]{"documentation",
						"The Activity containing the ActivityEdge, if it is directly owned by an Activity."},
				new URI[0]);
		this.addAnnotation(this.activityGroupEClass, source, new String[]{"documentation",
				"ActivityGroup is an abstract class for defining sets of ActivityNodes and ActivityEdges in an Activity."},
				new URI[0]);
		this.addAnnotation(this.getActivityGroup_ContainedNode(), source,
				new String[]{"documentation", "ActivityNodes immediately contained in the ActivityGroup."}, new URI[0]);
		this.addAnnotation(this.getActivityGroup_InActivity(), source,
				new String[]{"documentation",
						"The Activity containing the ActivityGroup, if it is directly owned by an Activity."},
				new URI[0]);
		this.addAnnotation(this.getActivityGroup_Subgroup(), source,
				new String[]{"documentation", "Other ActivityGroups immediately contained in this ActivityGroup."},
				new URI[0]);
		this.addAnnotation(this.getActivityGroup_SuperGroup(), source, new String[]{"documentation",
				"The ActivityGroup immediately containing this ActivityGroup, if it is directly owned by another ActivityGroup."},
				new URI[0]);
		this.addAnnotation(this.getActivityGroup_ContainedEdge(), source,
				new String[]{"documentation", "ActivityEdges immediately contained in the ActivityGroup."}, new URI[0]);
		this.addAnnotation(this.activityPartitionEClass, source, new String[]{"documentation",
				"An ActivityPartition is a kind of ActivityGroup for identifying ActivityNodes that have some characteristic in common."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_Dimension(), source,
				new String[]{"documentation",
						"Indicates whether the ActivityPartition groups other ActivityPartitions along a dimension."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_External(), source, new String[]{"documentation",
				"Indicates whether the ActivityPartition represents an entity to which the partitioning structure does not apply."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_Node(), source,
				new String[]{"documentation", "ActivityNodes immediately contained in the ActivityPartition."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_Represents(), source,
				new String[]{"documentation",
						"An Element represented by the functionality modeled within the ActivityPartition."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_Subpartition(), source,
				new String[]{"documentation",
						"Other ActivityPartitions immediately contained in this ActivityPartition (as its subgroups)."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_SuperPartition(), source,
				new String[]{"documentation",
						"Other ActivityPartitions immediately containing this ActivityPartition (as its superGroups)."},
				new URI[0]);
		this.addAnnotation(this.getActivityPartition_Edge(), source,
				new String[]{"documentation", "ActivityEdges immediately contained in the ActivityPartition."},
				new URI[0]);
		this.addAnnotation(this.structuredActivityNodeEClass, source, new String[]{"documentation",
				"A StructuredActivityNode is an Action that is also an ActivityGroup and whose behavior is specified by the ActivityNodes and ActivityEdges it so contains. Unlike other kinds of ActivityGroup, a StructuredActivityNode owns the ActivityNodes and ActivityEdges it contains, and so a node or edge can only be directly contained in one StructuredActivityNode, though StructuredActivityNodes may be nested."},
				new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_Activity(), source, new String[]{"documentation",
				"The Activity immediately containing the StructuredActivityNode, if it is not contained in another StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_MustIsolate(), source, new String[]{"documentation",
				"If true, then any object used by an Action within the StructuredActivityNode cannot be accessed by any Action outside the node until the StructuredActivityNode as a whole completes. Any concurrent Actions that would result in accessing such objects are required to have their execution deferred until the completion of the StructuredActivityNode.\r\n"},
				new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_Node(), source,
				new String[]{"documentation", "The ActivityNodes immediately contained in the StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_StructuredNodeInput(), source,
				new String[]{"documentation", "The InputPins owned by the StructuredActivityNode."}, new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_StructuredNodeOutput(), source,
				new String[]{"documentation", "The OutputPins owned by the StructuredActivityNode."}, new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_Variable(), source,
				new String[]{"documentation", "The Variables defined in the scope of the StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.getStructuredActivityNode_Edge(), source,
				new String[]{"documentation", "The ActivityEdges immediately contained in the StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.inputPinEClass, source, new String[]{"documentation",
				"An InputPin is a Pin that holds input values to be consumed by an Action."}, new URI[0]);
		this.addAnnotation(this.pinEClass, source, new String[]{"documentation",
				"A Pin is an ObjectNode and MultiplicityElement that provides input values to an Action or accepts output values from an Action."},
				new URI[0]);
		this.addAnnotation(this.getPin_Control(), source, new String[]{"documentation",
				"Indicates whether the Pin provides data to the Action or just controls how the Action executes."},
				new URI[0]);
		this.addAnnotation(this.objectNodeEClass, source, new String[]{"documentation",
				"An ObjectNode is an abstract ActivityNode that may hold tokens within the object flow in an Activity. ObjectNodes also support token selection, limitation on the number of tokens held, specification of the state required for tokens being held, and carrying control values.\r\n"},
				new URI[0]);
		this.addAnnotation(this.getObjectNode_InState(), source,
				new String[]{"documentation",
						"The States required to be associated with the values held by tokens on this ObjectNode."},
				new URI[0]);
		this.addAnnotation(this.getObjectNode_ControlType(), source, new String[]{"documentation",
				"Indicates whether the type of the ObjectNode is to be treated as representing control values that may traverse ControlFlows."},
				new URI[0]);
		this.addAnnotation(this.getObjectNode_Ordering(), source, new String[]{"documentation",
				"Indicates how the tokens held by the ObjectNode are ordered for selection to traverse ActivityEdges outgoing from the ObjectNode."},
				new URI[0]);
		this.addAnnotation(this.getObjectNode_Selection(), source, new String[]{"documentation",
				"A Behavior used to select tokens to be offered on outgoing ActivityEdges."}, new URI[0]);
		this.addAnnotation(this.getObjectNode_UpperBound(), source, new String[]{"documentation",
				"The maximum number of tokens that may be held by this ObjectNode. Tokens cannot flow into the ObjectNode if the upperBound is reached. If no upperBound is specified, then there is no limit on how many tokens the ObjectNode can hold."},
				new URI[0]);
		this.addAnnotation(this.stateEClass, source,
				new String[]{"documentation",
						"A State models a situation during which some (usually implicit) invariant condition holds."},
				new URI[0]);
		this.addAnnotation(this.getVertex_RedefinitionContext(), source, new String[]{"documentation",
				"References the Classifier in which context this element may be redefined."}, new URI[0]);
		this.addAnnotation(this.getState_Region(), source,
				new String[]{"documentation", "The Regions owned directly by the State."}, new URI[0]);
		this.addAnnotation(this.getState_ConnectionPoint(), source, new String[]{"documentation",
				"The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States."},
				new URI[0]);
		this.addAnnotation(this.getState_Connection(), source, new String[]{"documentation",
				"The entry and exit connection points used in conjunction with this (submachine) State, i.e., as targets and sources, respectively, in the Region with the submachine State. A connection point reference references the corresponding definition of a connection point Pseudostate in the StateMachine referenced by the submachine State."},
				new URI[0]);
		this.addAnnotation(this.getState_Submachine(), source, new String[]{"documentation",
				"The StateMachine that is to be inserted in place of the (submachine) State."}, new URI[0]);
		this.addAnnotation(this.getState_StateInvariant(), source, new String[]{"documentation",
				"Specifies conditions that are always true when this State is the current State. In ProtocolStateMachines state invariants are additional conditions to the preconditions of the outgoing Transitions, and to the postcondition of the incoming Transitions."},
				new URI[0]);
		this.addAnnotation(this.getState_DeferrableTrigger(), source, new String[]{"documentation",
				"A list of Triggers that are candidates to be retained by the StateMachine if they trigger no Transitions out of the State (not consumed). A deferred Trigger is retained until the StateMachine reaches a State configuration where it is no longer deferred."},
				new URI[0]);
		this.addAnnotation(this.getState_DoActivity(), source, new String[]{"documentation",
				"An optional Behavior that is executed while being in the State. The execution starts when this State is entered, and ceases either by itself when done, or when the State is exited, whichever comes first."},
				new URI[0]);
		this.addAnnotation(this.getState_Entry(), source, new String[]{"documentation",
				"An optional Behavior that is executed whenever this State is entered regardless of the Transition taken to reach the State. If defined, entry Behaviors are always executed to completion prior to any internal Behavior or Transitions performed within the State."},
				new URI[0]);
		this.addAnnotation(this.getState_Exit(), source, new String[]{"documentation",
				"An optional Behavior that is executed whenever this State is exited regardless of which Transition was taken out of the State. If defined, exit Behaviors are always executed to completion only after all internal and transition Behaviors have completed execution."},
				new URI[0]);
		this.addAnnotation(this.getState_Composite(), source, new String[]{"documentation",
				"A state with isComposite=true is said to be a composite State. A composite State is a State that contains at least one Region."},
				new URI[0]);
		this.addAnnotation(this.getState_Orthogonal(), source, new String[]{"documentation",
				"A State with isOrthogonal=true is said to be an orthogonal composite State An orthogonal composite State contains two or more Regions."},
				new URI[0]);
		this.addAnnotation(this.getState_Simple(), source, new String[]{"documentation",
				"A State with isSimple=true is said to be a simple State A simple State does not have any Regions and it does not refer to any submachine StateMachine."},
				new URI[0]);
		this.addAnnotation(this.getState_SubmachineState(), source, new String[]{"documentation",
				"A State with isSubmachineState=true is said to be a submachine State Such a State refers to another StateMachine(submachine)."},
				new URI[0]);
		this.addAnnotation(this.getVertex_RedefinedVertex(), source,
				new String[]{"documentation", "The Vertex of which this Vertex is a redefinition."}, new URI[0]);
		this.addAnnotation(this.vertexEClass, source, new String[]{"documentation",
				"A Vertex is an abstraction of a node in a StateMachine graph. It can be the source or destination of any number of Transitions."},
				new URI[0]);
		this.addAnnotation(this.getVertex_Container(), source,
				new String[]{"documentation", "The Region that contains this Vertex."}, new URI[0]);
		this.addAnnotation(this.getVertex_Outgoing(), source,
				new String[]{"documentation", "Specifies the Transitions departing from this Vertex."}, new URI[0]);
		this.addAnnotation(this.getVertex_Incoming(), source,
				new String[]{"documentation", "Specifies the Transitions entering this Vertex."}, new URI[0]);
		this.addAnnotation(this.regionEClass, source, new String[]{"documentation",
				"A Region is a top-level part of a StateMachine or a composite State, that serves as a container for the Vertices and Transitions of the StateMachine. A StateMachine or composite State may contain multiple Regions representing behaviors that may occur in parallel."},
				new URI[0]);
		this.addAnnotation(this.getRegion_RedefinitionContext(), source, new String[]{"documentation",
				"References the Classifier in which context this element may be redefined."}, new URI[0]);
		this.addAnnotation(this.getRegion_ExtendedRegion(), source,
				new String[]{"documentation", "The region of which this region is an extension."}, new URI[0]);
		this.addAnnotation(this.getRegion_State(), source, new String[]{"documentation",
				"The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine."},
				new URI[0]);
		this.addAnnotation(this.getRegion_StateMachine(), source, new String[]{"documentation",
				"The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State."},
				new URI[0]);
		this.addAnnotation(this.getRegion_Transition(), source,
				new String[]{"documentation", "The set of Transitions owned by the Region."}, new URI[0]);
		this.addAnnotation(this.getRegion_Subvertex(), source,
				new String[]{"documentation", "The set of Vertices that are owned by this Region."}, new URI[0]);
		this.addAnnotation(this.stateMachineEClass, source, new String[]{"documentation",
				"StateMachines can be used to express event-driven behaviors of parts of a system. Behavior is modeled as a traversal of a graph of Vertices interconnected by one or more joined Transition arcs that are triggered by the dispatching of successive Event occurrences. During this traversal, the StateMachine may execute a sequence of Behaviors associated with various elements of the StateMachine."},
				new URI[0]);
		this.addAnnotation(this.getStateMachine_ConnectionPoint(), source, new String[]{"documentation",
				"The connection points defined for this StateMachine. They represent the interface of the StateMachine when used as part of submachine State"},
				new URI[0]);
		this.addAnnotation(this.getStateMachine_ExtendedStateMachine(), source,
				new String[]{"documentation", "The StateMachines of which this is an extension."}, new URI[0]);
		this.addAnnotation(this.getStateMachine_SubmachineState(), source, new String[]{"documentation",
				"References the submachine(s) in case of a submachine State. Multiple machines are referenced in case of a concurrent State."},
				new URI[0]);
		this.addAnnotation(this.getStateMachine_Region(), source,
				new String[]{"documentation", "The Regions owned directly by the StateMachine."}, new URI[0]);
		this.addAnnotation(this.pseudostateEClass, source, new String[]{"documentation",
				"A Pseudostate is an abstraction that encompasses different types of transient Vertices in the StateMachine graph. A StateMachine instance never comes to rest in a Pseudostate, instead, it will exit and enter the Pseudostate within a single run-to-completion step."},
				new URI[0]);
		this.addAnnotation(this.getPseudostate_Kind(), source, new String[]{"documentation",
				"Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint, initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice."},
				new URI[0]);
		this.addAnnotation(this.getPseudostate_State(), source,
				new String[]{"documentation", "The State that owns this Pseudostate and in which it appears."},
				new URI[0]);
		this.addAnnotation(this.getPseudostate_StateMachine(), source, new String[]{"documentation",
				"The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates of the kind entryPoint or exitPoint."},
				new URI[0]);
		this.addAnnotation(this.pseudostateKindEEnum, source, new String[]{"documentation",
				"PseudostateKind is an Enumeration type that is used to differentiate various kinds of Pseudostates."},
				new URI[0]);
		this.addAnnotation(this.connectionPointReferenceEClass, source, new String[]{"documentation",
				"A ConnectionPointReference represents a usage (as part of a submachine State) of an entry/exit point Pseudostate defined in the StateMachine referenced by the submachine State."},
				new URI[0]);
		this.addAnnotation(this.getConnectionPointReference_Entry(), source,
				new String[]{"documentation", "The entryPoint Pseudostates corresponding to this connection point."},
				new URI[0]);
		this.addAnnotation(this.getConnectionPointReference_State(), source,
				new String[]{"documentation", "The State in which the ConnectionPointReference is defined."},
				new URI[0]);
		this.addAnnotation(this.getConnectionPointReference_Exit(), source, new String[]{"documentation",
				"The exitPoints kind Pseudostates corresponding to this connection point."}, new URI[0]);
		this.addAnnotation(this.transitionEClass, source, new String[]{"documentation",
				"A Transition represents an arc between exactly one source Vertex and exactly one Target vertex (the source and targets may be the same Vertex). It may form part of a compound transition, which takes the StateMachine from one steady State configuration to another, representing the full response of the StateMachine to an occurrence of an Event that triggered it."},
				new URI[0]);
		this.addAnnotation(this.getTransition_RedefinitionContext(), source, new String[]{"documentation",
				"References the Classifier in which context this element may be redefined."}, new URI[0]);
		this.addAnnotation(this.getTransition_Effect(), source, new String[]{"documentation",
				"Specifies an optional behavior to be performed when the Transition fires."}, new URI[0]);
		this.addAnnotation(this.getTransition_Guard(), source, new String[]{"documentation",
				"A guard is a Constraint that provides a fine-grained control over the firing of the Transition. The guard is evaluated when an Event occurrence is dispatched by the StateMachine. If the guard is true at that time, the Transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed."},
				new URI[0]);
		this.addAnnotation(this.getTransition_Trigger(), source,
				new String[]{"documentation", "Specifies the Triggers that may fire the transition."}, new URI[0]);
		this.addAnnotation(this.getTransition_Kind(), source,
				new String[]{"documentation", "Indicates the precise type of the Transition."}, new URI[0]);
		this.addAnnotation(this.getTransition_RedefinedTransition(), source,
				new String[]{"documentation", "The Transition that is redefined by this Transition."}, new URI[0]);
		this.addAnnotation(this.getTransition_Source(), source, new String[]{"documentation",
				"Designates the originating Vertex (State or Pseudostate) of the Transition."}, new URI[0]);
		this.addAnnotation(this.getTransition_Target(), source, new String[]{"documentation",
				"Designates the target Vertex that is reached when the Transition is taken."}, new URI[0]);
		this.addAnnotation(this.getTransition_Container(), source,
				new String[]{"documentation", "Designates the Region that owns this Transition."}, new URI[0]);
		this.addAnnotation(this.constraintEClass, source, new String[]{"documentation",
				"A Constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an Element or set of Elements."},
				new URI[0]);
		this.addAnnotation(this.getConstraint_ConstrainedElement(), source,
				new String[]{"documentation", "The ordered set of Elements referenced by this Constraint."},
				new URI[0]);
		this.addAnnotation(this.getConstraint_Context(), source,
				new String[]{"documentation", "Specifies the Namespace that owns the Constraint."}, new URI[0]);
		this.addAnnotation(this.getConstraint_Specification(), source,
				new String[]{"documentation",
						"A condition that must be true when evaluated in order for the Constraint to be satisfied."},
				new URI[0]);
		this.addAnnotation(this.extendEClass, source, new String[]{"documentation",
				"A relationship from an extending UseCase to an extended UseCase that specifies how and when the behavior defined in the extending UseCase can be inserted into the behavior defined in the extended UseCase."},
				new URI[0]);
		this.addAnnotation(this.getExtend_ExtendedCase(), source,
				new String[]{"documentation", "The UseCase that is being extended."}, new URI[0]);
		this.addAnnotation(this.getExtend_Extension(), source, new String[]{"documentation",
				"The UseCase that represents the extension and owns the Extend relationship."}, new URI[0]);
		this.addAnnotation(this.getExtend_ExtensionLocation(), source, new String[]{"documentation",
				"An ordered list of ExtensionPoints belonging to the extended UseCase, specifying where the respective behavioral fragments of the extending UseCase are to be inserted. The first fragment in the extending UseCase is associated with the first extension point in the list, the second fragment with the second point, and so on. Note that, in most practical cases, the extending UseCase has just a single behavior fragment, so that the list of ExtensionPoints is trivial."},
				new URI[0]);
		this.addAnnotation(this.getExtend_Condition(), source, new String[]{"documentation",
				"References the condition that must hold when the first ExtensionPoint is reached for the extension to take place. If no constraint is associated with the Extend relationship, the extension is unconditional."},
				new URI[0]);
		this.addAnnotation(this.useCaseEClass, source, new String[]{"documentation",
				"A UseCase specifies a set of actions performed by its subjects, which yields an observable result that is of value for one or more Actors or other stakeholders of each subject."},
				new URI[0]);
		this.addAnnotation(this.getUseCase_Extend(), source,
				new String[]{"documentation", "The Extend relationships owned by this UseCase."}, new URI[0]);
		this.addAnnotation(this.getUseCase_ExtensionPoint(), source,
				new String[]{"documentation", "The ExtensionPoints owned by this UseCase."}, new URI[0]);
		this.addAnnotation(this.getUseCase_Include(), source,
				new String[]{"documentation", "The Include relationships owned by this UseCase."}, new URI[0]);
		this.addAnnotation(this.getUseCase_Subject(), source, new String[]{"documentation",
				"The subjects to which this UseCase applies. Each subject or its parts realize all the UseCases that apply to it."},
				new URI[0]);
		this.addAnnotation(this.extensionPointEClass, source, new String[]{"documentation",
				"An ExtensionPoint identifies a point in the behavior of a UseCase where that behavior can be extended by the behavior of some other (extending) UseCase, as specified by an Extend relationship."},
				new URI[0]);
		this.addAnnotation(this.getExtensionPoint_UseCase(), source,
				new String[]{"documentation", "The UseCase that owns this ExtensionPoint."}, new URI[0]);
		this.addAnnotation(this.includeEClass, source, new String[]{"documentation",
				"An Include relationship specifies that a UseCase contains the behavior defined in another UseCase."},
				new URI[0]);
		this.addAnnotation(this.getInclude_Addition(), source,
				new String[]{"documentation", "The UseCase that is to be included."}, new URI[0]);
		this.addAnnotation(this.getInclude_IncludingCase(), source, new String[]{"documentation",
				"The UseCase which includes the addition and owns the Include relationship."}, new URI[0]);
		this.addAnnotation(this.protocolTransitionEClass, source, new String[]{"documentation",
				"A ProtocolTransition specifies a legal Transition for an Operation. Transitions of ProtocolStateMachines have the following information: a pre-condition (guard), a Trigger, and a post-condition. Every ProtocolTransition is associated with at most one BehavioralFeature belonging to the context Classifier of the ProtocolStateMachine."},
				new URI[0]);
		this.addAnnotation(this.getProtocolTransition_PreCondition(), source, new String[]{"documentation",
				"Specifies the precondition of the Transition. It specifies the Condition that should be verified before triggering the Transition. This guard condition added to the source State will be evaluated as part of the precondition of the Operation referred by the Transition if any."},
				new URI[0]);
		this.addAnnotation(this.getProtocolTransition_Referred(), source, new String[]{"documentation",
				"This association refers to the associated Operation. It is derived from the Operation of the CallEvent Trigger when applicable."},
				new URI[0]);
		this.addAnnotation(this.getProtocolTransition_PostCondition(), source, new String[]{"documentation",
				"Specifies the post condition of the Transition which is the Condition that should be obtained once the Transition is triggered. This post condition is part of the post condition of the Operation connected to the Transition."},
				new URI[0]);
		this.addAnnotation(this.operationEClass, source, new String[]{"documentation",
				"An Operation is a BehavioralFeature of a Classifier that specifies the name, type, parameters, and constraints for invoking an associated Behavior. An Operation may invoke both the execution of method behaviors as well as other behavioral responses. Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template."},
				new URI[0]);
		this.addAnnotation(this.getOperation_RaisedException(), source,
				new String[]{"documentation",
						"The Types representing exceptions that may be raised during an invocation of this operation."},
				new URI[0]);
		this.addAnnotation(this.getOperation_OwnedParameter(), source,
				new String[]{"documentation", "The parameters owned by this Operation."}, new URI[0]);
		this.addAnnotation(this.getOperation_TemplateParameter(), source, new String[]{"documentation",
				"The OperationTemplateParameter that exposes this element as a formal parameter."}, new URI[0]);
		this.addAnnotation(this.getOperation_Type(), source, new String[]{"documentation",
				"The return type of the operation, if present. This information is derived from the return result for this Operation."},
				new URI[0]);
		this.addAnnotation(this.getOperation_Datatype(), source,
				new String[]{"documentation", "The DataType that owns this Operation, if any."}, new URI[0]);
		this.addAnnotation(this.getOperation_Interface(), source,
				new String[]{"documentation", "The Interface that owns this Operation, if any."}, new URI[0]);
		this.addAnnotation(this.getOperation_BodyCondition(), source, new String[]{"documentation",
				"An optional Constraint on the result values of an invocation of this Operation."}, new URI[0]);
		this.addAnnotation(this.getOperation_UMLClass(), source,
				new String[]{"documentation", "The Class that owns this operation, if any."}, new URI[0]);
		this.addAnnotation(this.getOperation_Ordered(), source, new String[]{"documentation",
				"Specifies whether the return parameter is ordered or not, if present.  This information is derived from the return result for this Operation."},
				new URI[0]);
		this.addAnnotation(this.getOperation_Query(), source, new String[]{"documentation",
				"Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false)."},
				new URI[0]);
		this.addAnnotation(this.getOperation_Unique(), source, new String[]{"documentation",
				"Specifies whether the return parameter is unique or not, if present. This information is derived from the return result for this Operation."},
				new URI[0]);
		this.addAnnotation(this.getOperation_Lower(), source, new String[]{"documentation",
				"Specifies the lower multiplicity of the return parameter, if present. This information is derived from the return result for this Operation."},
				new URI[0]);
		this.addAnnotation(this.getOperation_Postcondition(), source, new String[]{"documentation",
				"An optional set of Constraints specifying the state of the system when the Operation is completed."},
				new URI[0]);
		this.addAnnotation(this.getOperation_Precondition(), source,
				new String[]{"documentation",
						"An optional set of Constraints on the state of the system when the Operation is invoked."},
				new URI[0]);
		this.addAnnotation(this.getOperation_RedefinedOperation(), source,
				new String[]{"documentation", "The Operations that are redefined by this Operation."}, new URI[0]);
		this.addAnnotation(this.getOperation_Upper(), source, new String[]{"documentation",
				"The upper multiplicity of the return parameter, if present. This information is derived from the return result for this Operation."},
				new URI[0]);
		this.addAnnotation(this.behavioralFeatureEClass, source, new String[]{"documentation",
				"A BehavioralFeature is a feature of a Classifier that specifies an aspect of the behavior of its instances.  A BehavioralFeature is implemented (realized) by a Behavior. A BehavioralFeature specifies that a Classifier will respond to a designated request by invoking its implementing method."},
				new URI[0]);
		this.addAnnotation(this.getBehavioralFeature_Concurrency(), source, new String[]{"documentation",
				"Specifies the semantics of concurrent calls to the same passive instance (i.e., an instance originating from a Class with isActive being false). Active instances control access to their own BehavioralFeatures."},
				new URI[0]);
		this.addAnnotation(this.getBehavioralFeature_Abstract(), source, new String[]{"documentation",
				"If true, then the BehavioralFeature does not have an implementation, and one must be supplied by a more specific Classifier. If false, the BehavioralFeature must have an implementation in the Classifier or one must be inherited."},
				new URI[0]);
		this.addAnnotation(this.getBehavioralFeature_Method(), source, new String[]{"documentation",
				"A Behavior that implements the BehavioralFeature. There may be at most one Behavior for a particular pairing of a Classifier (as owner of the Behavior) and a BehavioralFeature (as specification of the Behavior)."},
				new URI[0]);
		this.addAnnotation(this.getBehavioralFeature_OwnedParameter(), source,
				new String[]{"documentation", "The ordered set of formal Parameters of this BehavioralFeature."},
				new URI[0]);
		this.addAnnotation(this.getBehavioralFeature_OwnedParameterSet(), source,
				new String[]{"documentation", "The ParameterSets owned by this BehavioralFeature."}, new URI[0]);
		this.addAnnotation(this.getBehavioralFeature_RaisedException(), source, new String[]{"documentation",
				"The Types representing exceptions that may be raised during an invocation of this BehavioralFeature."},
				new URI[0]);
		this.addAnnotation(this.featureEClass, source, new String[]{"documentation",
				"A Feature declares a behavioral or structural characteristic of Classifiers."}, new URI[0]);
		this.addAnnotation(this.getFeature_FeaturingClassifier(), source,
				new String[]{"documentation", "The Classifiers that have this Feature as a feature."}, new URI[0]);
		this.addAnnotation(this.getFeature_Static(), source, new String[]{"documentation",
				"Specifies whether this Feature characterizes individual instances classified by the Classifier (false) or the Classifier itself (true)."},
				new URI[0]);
		this.addAnnotation(this.callConcurrencyKindEEnum, source, new String[]{"documentation",
				"CallConcurrencyKind is an Enumeration used to specify the semantics of concurrent calls to a BehavioralFeature."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.callConcurrencyKindEEnum.getELiterals().get(0), source, new String[]{
				"documentation",
				"No concurrency management mechanism is associated with the BehavioralFeature and, therefore, concurrency conflicts may occur. Instances that invoke a BehavioralFeature need to coordinate so that only one invocation to a target on any BehavioralFeature occurs at once."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.callConcurrencyKindEEnum.getELiterals().get(1), source, new String[]{
				"documentation",
				"Multiple invocations of a BehavioralFeature that overlap in time may occur to one instance, but only one is allowed to commence. The others are blocked until the performance of the currently executing BehavioralFeature is complete. It is the responsibility of the system designer to ensure that deadlocks do not occur due to simultaneous blocking."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.callConcurrencyKindEEnum.getELiterals().get(2), source, new String[]{
				"documentation",
				"Multiple invocations of a BehavioralFeature that overlap in time may occur to one instance and all of them may proceed concurrently."},
				new URI[0]);
		this.addAnnotation(this.parameterSetEClass, source,
				new String[]{"documentation",
						"A ParameterSet designates alternative sets of inputs or outputs that a Behavior may use."},
				new URI[0]);
		this.addAnnotation(this.getParameterSet_Condition(), source, new String[]{"documentation",
				"A constraint that should be satisfied for the owner of the Parameters in an input ParameterSet to start execution using the values provided for those Parameters, or the owner of the Parameters in an output ParameterSet to end execution providing the values for those Parameters, if all preconditions and conditions on input ParameterSets were satisfied."},
				new URI[0]);
		this.addAnnotation(this.getParameterSet_Parameter(), source,
				new String[]{"documentation", "Parameters in the ParameterSet."}, new URI[0]);
		this.addAnnotation(this.typeEClass, source,
				new String[]{"documentation", "A Type constrains the values represented by a TypedElement."},
				new URI[0]);
		this.addAnnotation(this.getType_Package(), source,
				new String[]{"documentation", "Specifies the owning Package of this Type, if any."}, new URI[0]);
		this.addAnnotation(this.associationEClass, source, new String[]{"documentation",
				"A link is a tuple of values that refer to typed objects.  An Association classifies a set of links, each of which is an instance of the Association.  Each value in the link refers to an instance of the type of the corresponding end of the Association.\r\n"},
				new URI[0]);
		this.addAnnotation(this.getAssociation_Derived(), source, new String[]{"documentation",
				"Specifies whether the Association is derived from other model elements such as other Associations."},
				new URI[0]);
		this.addAnnotation(this.getAssociation_MemberEnd(), source, new String[]{"documentation",
				"Each end represents participation of instances of the Classifier connected to the end in links of the Association."},
				new URI[0]);
		this.addAnnotation(this.getAssociation_OwnedEnd(), source,
				new String[]{"documentation", "The ends that are owned by the Association itself."}, new URI[0]);
		this.addAnnotation(this.getAssociation_NavigableOwnedEnd(), source,
				new String[]{"documentation", "The navigable ends that are owned by the Association itself."},
				new URI[0]);
		this.addAnnotation(this.getAssociation_EndType(), source,
				new String[]{"documentation", "The Classifiers that are used as types of the ends of the Association."},
				new URI[0]);
		this.addAnnotation(this.propertyEClass, source, new String[]{"documentation",
				"A Property is a StructuralFeature. A Property related by ownedAttribute to a Classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the Classifier to a value or set of values of the type of the attribute. A Property related by memberEnd to an Association represents an end of the Association. The type of the Property is the type of the end of the Association. A Property has the capability of being a DeploymentTarget in a Deployment relationship. This enables modeling the deployment to hierarchical nodes that have Properties functioning as internal parts.  Property specializes ParameterableElement to specify that a Property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.propertyEClass.getEOperations().get(0), source,
				new String[]{"documentation",
						"The query isNavigable() indicates whether it is possible to navigate across the property."},
				new URI[0]);
		this.addAnnotation(this.getProperty_Aggregation(), source,
				new String[]{"documentation", "Specifies the kind of aggregation that applies to the Property."},
				new URI[0]);
		this.addAnnotation(this.getProperty_AssociationEnd(), source, new String[]{"documentation",
				"Designates the optional association end that owns a qualifier attribute."}, new URI[0]);
		this.addAnnotation(this.getProperty_Qualifier(), source,
				new String[]{"documentation", "An optional list of ordered qualifier attributes for the end."},
				new URI[0]);
		this.addAnnotation(this.getProperty_UMLClass(), source,
				new String[]{"documentation", "The Class that owns this Property, if any."}, new URI[0]);
		this.addAnnotation(this.getProperty_Datatype(), source,
				new String[]{"documentation", "The DataType that owns this Property, if any."}, new URI[0]);
		this.addAnnotation(this.getProperty_DefaultValue(), source, new String[]{"documentation",
				"A ValueSpecification that is evaluated to give a default value for the Property when an instance of the owning Classifier is instantiated."},
				new URI[0]);
		this.addAnnotation(this.getProperty_Interface(), source,
				new String[]{"documentation", "The Interface that owns this Property, if any."}, new URI[0]);
		this.addAnnotation(this.getProperty_Composite(), source, new String[]{"documentation",
				"If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute. This is a derived value, indicating whether the aggregation of the Property is composite or not."},
				new URI[0]);
		this.addAnnotation(this.getProperty_Derived(), source, new String[]{"documentation",
				"Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information."},
				new URI[0]);
		this.addAnnotation(this.getProperty_DerivedUnion(), source, new String[]{"documentation",
				"Specifies whether the property is derived as the union of all of the Properties that are constrained to subset it."},
				new URI[0]);
		this.addAnnotation(this.getProperty_ID(), source, new String[]{"documentation",
				"True indicates this property can be used to uniquely identify an instance of the containing Class."},
				new URI[0]);
		this.addAnnotation(this.getProperty_Opposite(), source,
				new String[]{"documentation",
						"In the case where the Property is one end of a binary association this gives the other end."},
				new URI[0]);
		this.addAnnotation(this.getProperty_OwningAssociation(), source,
				new String[]{"documentation", "The owning association of this property, if any."}, new URI[0]);
		this.addAnnotation(this.getProperty_RedefinedProperty(), source,
				new String[]{"documentation", "The properties that are redefined by this property, if any."},
				new URI[0]);
		this.addAnnotation(this.getProperty_SubsettedProperty(), source, new String[]{"documentation",
				"The properties of which this Property is constrained to be a subset, if any."}, new URI[0]);
		this.addAnnotation(this.getProperty_Association(), source,
				new String[]{"documentation", "The Association of which this Property is a member, if any."},
				new URI[0]);
		this.addAnnotation(this.structuralFeatureEClass, source, new String[]{"documentation",
				"A StructuralFeature is a typed feature of a Classifier that specifies the structure of instances of the Classifier."},
				new URI[0]);
		this.addAnnotation(this.getStructuralFeature_ReadOnly(), source,
				new String[]{"documentation",
						"If isReadOnly is true, the StructuralFeature may not be written to after initialization."},
				new URI[0]);
		this.addAnnotation(this.slotEClass, source, new String[]{"documentation",
				"A Slot designates that an entity modeled by an InstanceSpecification has a value or values for a specific StructuralFeature."},
				new URI[0]);
		this.addAnnotation(this.getSlot_OwningInstance(), source,
				new String[]{"documentation", "The InstanceSpecification that owns this Slot."}, new URI[0]);
		this.addAnnotation(this.getSlot_Value(), source,
				new String[]{"documentation", "The value or values held by the Slot."}, new URI[0]);
		this.addAnnotation(this.getSlot_DefiningFeature(), source, new String[]{"documentation",
				"The StructuralFeature that specifies the values that may be held by the Slot."}, new URI[0]);
		this.addAnnotation(this.structuralFeatureActionEClass, source, new String[]{"documentation",
				"StructuralFeatureAction is an abstract class for all Actions that operate on StructuralFeatures."},
				new URI[0]);
		this.addAnnotation(this.getStructuralFeatureAction_Object(), source, new String[]{"documentation",
				"The InputPin from which the object whose StructuralFeature is to be read or written is obtained."},
				new URI[0]);
		this.addAnnotation(this.getStructuralFeatureAction_StructuralFeature(), source,
				new String[]{"documentation", "The StructuralFeature to be read or written."}, new URI[0]);
		this.addAnnotation(this.aggregationKindEEnum, source,
				new String[]{"documentation",
						"AggregationKind is an Enumeration for specifying the kind of aggregation of a Property."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.aggregationKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "Indicates that the Property has no aggregation."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.aggregationKindEEnum.getELiterals().get(1), source,
				new String[]{"documentation", "Indicates that the Property has shared aggregation."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.aggregationKindEEnum.getELiterals().get(2), source, new String[]{
				"documentation",
				"Indicates that the Property is aggregated compositely, i.e., the composite object has responsibility for the existence and storage of the composed objects (parts)."},
				new URI[0]);
		this.addAnnotation(this.dataTypeEClass, source, new String[]{"documentation",
				"A DataType is a type whose instances are identified only by their value."}, new URI[0]);
		this.addAnnotation(this.getDataType_OwnedOperation(), source,
				new String[]{"documentation", "The Operations owned by the DataType."}, new URI[0]);
		this.addAnnotation(this.getDataType_OwnedAttribute(), source,
				new String[]{"documentation", "The attributes owned by the DataType."}, new URI[0]);
		this.addAnnotation(this.interfaceEClass, source, new String[]{"documentation",
				"Interfaces declare coherent services that are implemented by BehavioredClassifiers that implement the Interfaces via InterfaceRealizations."},
				new URI[0]);
		this.addAnnotation(this.getInterface_NestedClassifier(), source, new String[]{"documentation",
				"References all the Classifiers that are defined (nested) within the Interface."}, new URI[0]);
		this.addAnnotation(this.getInterface_OwnedOperation(), source,
				new String[]{"documentation", "The Operations owned by the Interface."}, new URI[0]);
		this.addAnnotation(this.getInterface_OwnedReception(), source, new String[]{"documentation",
				"Receptions that objects providing this Interface are willing to accept."}, new URI[0]);
		this.addAnnotation(this.getInterface_Protocol(), source, new String[]{"documentation",
				"References a ProtocolStateMachine specifying the legal sequences of the invocation of the BehavioralFeatures described in the Interface."},
				new URI[0]);
		this.addAnnotation(this.getInterface_RedefinedInterface(), source,
				new String[]{"documentation", "References all the Interfaces redefined by this Interface."},
				new URI[0]);
		this.addAnnotation(this.getInterface_OwnedAttribute(), source,
				new String[]{"documentation", "The attributes (i.e., the Properties) owned by the Interface."},
				new URI[0]);
		this.addAnnotation(this.receptionEClass, source, new String[]{"documentation",
				"A Reception is a declaration stating that a Classifier is prepared to react to the receipt of a Signal."},
				new URI[0]);
		this.addAnnotation(this.getReception_Signal(), source,
				new String[]{"documentation", "The Signal that this Reception handles."}, new URI[0]);
		this.addAnnotation(this.signalEClass, source, new String[]{"documentation",
				"A Signal is a specification of a kind of communication between objects in which a reaction is asynchronously triggered in the receiver without a reply."},
				new URI[0]);
		this.addAnnotation(this.getSignal_OwnedAttribute(), source,
				new String[]{"documentation", "The attributes owned by the Signal."}, new URI[0]);
		this.addAnnotation(this.signalEventEClass, source, new String[]{"documentation",
				"A SignalEvent represents the receipt of an asynchronous Signal instance."}, new URI[0]);
		this.addAnnotation(this.getSignalEvent_Signal(), source,
				new String[]{"documentation", "The specific Signal that is associated with this SignalEvent."},
				new URI[0]);
		this.addAnnotation(this.messageEventEClass, source, new String[]{"documentation",
				"A MessageEvent specifies the receipt by an object of either an Operation call or a Signal instance."},
				new URI[0]);
		this.addAnnotation(this.eventEClass, source, new String[]{"documentation",
				"An Event is the specification of some occurrence that may potentially trigger effects by an object."},
				new URI[0]);
		this.addAnnotation(this.triggerEClass, source, new String[]{"documentation",
				"A Trigger specifies a specific point  at which an Event occurrence may trigger an effect in a Behavior. A Trigger may be qualified by the Port on which the Event occurred."},
				new URI[0]);
		this.addAnnotation(this.getTrigger_Port(), source,
				new String[]{"documentation", "A optional Port of through which the given effect is detected."},
				new URI[0]);
		this.addAnnotation(this.getTrigger_Event(), source,
				new String[]{"documentation", "The Event that detected by the Trigger."}, new URI[0]);
		this.addAnnotation(this.portEClass, source, new String[]{"documentation",
				"A Port is a property of an EncapsulatedClassifier that specifies a distinct interaction point between that EncapsulatedClassifier and its environment or between the (behavior of the) EncapsulatedClassifier and its internal parts. Ports are connected to Properties of the EncapsulatedClassifier by Connectors through which requests can be made to invoke BehavioralFeatures. A Port may specify the services an EncapsulatedClassifier provides (offers) to its environment as well as the services that an EncapsulatedClassifier expects (requires) of its environment.  A Port may have an associated ProtocolStateMachine."},
				new URI[0]);
		this.addAnnotation(this.getPort_Behavior(), source, new String[]{"documentation",
				"Specifies whether requests arriving at this Port are sent to the classifier behavior of this EncapsulatedClassifier. Such a Port is referred to as a behavior Port. Any invocation of a BehavioralFeature targeted at a behavior Port will be handled by the instance of the owning EncapsulatedClassifier itself, rather than by any instances that it may contain."},
				new URI[0]);
		this.addAnnotation(this.getPort_Conjugated(), source, new String[]{"documentation",
				"Specifies the way that the provided and required Interfaces are derived from the Port’s Type."},
				new URI[0]);
		this.addAnnotation(this.getPort_Service(), source, new String[]{"documentation",
				"If true, indicates that this Port is used to provide the published functionality of an EncapsulatedClassifier.  If false, this Port is used to implement the EncapsulatedClassifier but is not part of the essential externally-visible functionality of the EncapsulatedClassifier and can, therefore, be altered or deleted along with the internal implementation of the EncapsulatedClassifier and other properties that are considered part of its implementation."},
				new URI[0]);
		this.addAnnotation(this.getPort_Protocol(), source, new String[]{"documentation",
				"An optional ProtocolStateMachine which describes valid interactions at this interaction point."},
				new URI[0]);
		this.addAnnotation(this.getPort_Provided(), source, new String[]{"documentation",
				"The Interfaces specifying the set of Operations and Receptions that the EncapsulatedCclassifier offers to its environment via this Port, and which it will handle either directly or by forwarding it to a part of its internal structure. This association is derived according to the value of isConjugated. If isConjugated is false, provided is derived as the union of the sets of Interfaces realized by the type of the port and its supertypes, or directly from the type of the Port if the Port is typed by an Interface. If isConjugated is true, it is derived as the union of the sets of Interfaces used by the type of the Port and its supertypes."},
				new URI[0]);
		this.addAnnotation(this.getPort_RedefinedPort(), source, new String[]{"documentation",
				"A Port may be redefined when its containing EncapsulatedClassifier is specialized. The redefining Port may have additional Interfaces to those that are associated with the redefined Port or it may replace an Interface by one of its subtypes."},
				new URI[0]);
		this.addAnnotation(this.getPort_Required(), source, new String[]{"documentation",
				"The Interfaces specifying the set of Operations and Receptions that the EncapsulatedCassifier expects its environment to handle via this port. This association is derived according to the value of isConjugated. If isConjugated is false, required is derived as the union of the sets of Interfaces used by the type of the Port and its supertypes. If isConjugated is true, it is derived as the union of the sets of Interfaces realized by the type of the Port and its supertypes, or directly from the type of the Port if the Port is typed by an Interface."},
				new URI[0]);
		this.addAnnotation(this.protocolStateMachineEClass, source, new String[]{"documentation",
				"A ProtocolStateMachine is always defined in the context of a Classifier. It specifies which BehavioralFeatures of the Classifier can be called in which State and under which conditions, thus specifying the allowed invocation sequences on the Classifier's BehavioralFeatures. A ProtocolStateMachine specifies the possible and permitted Transitions on the instances of its context Classifier, together with the BehavioralFeatures that carry the Transitions. In this manner, an instance lifecycle can be specified for a Classifier, by defining the order in which the BehavioralFeatures can be activated and the States through which an instance progresses during its existence."},
				new URI[0]);
		this.addAnnotation(this.getProtocolStateMachine_Conformance(), source,
				new String[]{"documentation", "Conformance between ProtocolStateMachine "}, new URI[0]);
		this.addAnnotation(this.getProtocolStateMachine_Interface(), source, new String[]{"documentation",
				"Specifies the namespace in which the protocol state machine is defined."}, new URI[0]);
		this.addAnnotation(this.protocolConformanceEClass, source, new String[]{"documentation",
				"A ProtocolStateMachine can be redefined into a more specific ProtocolStateMachine or into behavioral StateMachine. ProtocolConformance declares that the specific ProtocolStateMachine specifies a protocol that conforms to the general ProtocolStateMachine or that the specific behavioral StateMachine abides by the protocol of the general ProtocolStateMachine."},
				new URI[0]);
		this.addAnnotation(this.getProtocolConformance_GeneralMachine(), source,
				new String[]{"documentation",
						"Specifies the ProtocolStateMachine to which the specific ProtocolStateMachine conforms."},
				new URI[0]);
		this.addAnnotation(this.getProtocolConformance_SpecificMachine(), source,
				new String[]{"documentation",
						"Specifies the ProtocolStateMachine which conforms to the general ProtocolStateMachine."},
				new URI[0]);
		this.addAnnotation(this.encapsulatedClassifierEClass, source, new String[]{"documentation",
				"An EncapsulatedClassifier may own Ports to specify typed interaction points."}, new URI[0]);
		this.addAnnotation(this.getEncapsulatedClassifier_OwnedPort(), source,
				new String[]{"documentation", "The Ports owned by the EncapsulatedClassifier."}, new URI[0]);
		this.addAnnotation(this.structuredClassifierEClass, source, new String[]{"documentation",
				"StructuredClassifiers may contain an internal structure of connected elements each of which plays a role in the overall Behavior modeled by the StructuredClassifier."},
				new URI[0]);
		this.addAnnotation(this.getStructuredClassifier_OwnedAttribute(), source,
				new String[]{"documentation", "The Properties owned by the StructuredClassifier."}, new URI[0]);
		this.addAnnotation(this.getStructuredClassifier_OwnedConnector(), source,
				new String[]{"documentation", "The connectors owned by the StructuredClassifier."}, new URI[0]);
		this.addAnnotation(this.getStructuredClassifier_Part(), source, new String[]{"documentation",
				"The Properties specifying instances that the StructuredClassifier owns by composition. This collection is derived, selecting those owned Properties where isComposite is true."},
				new URI[0]);
		this.addAnnotation(this.getStructuredClassifier_Role(), source,
				new String[]{"documentation", "The roles that instances may play in this StructuredClassifier."},
				new URI[0]);
		this.addAnnotation(this.connectorEClass, source, new String[]{"documentation",
				"A Connector specifies links that enables communication between two or more instances. In contrast to Associations, which specify links between any instance of the associated Classifiers, Connectors specify links between instances playing the connected parts only."},
				new URI[0]);
		this.addAnnotation(this.getConnector_Contract(), source,
				new String[]{"documentation",
						"The set of Behaviors that specify the valid interaction patterns across the Connector."},
				new URI[0]);
		this.addAnnotation(this.getConnector_End(), source, new String[]{"documentation",
				"A Connector has at least two ConnectorEnds, each representing the participation of instances of the Classifiers typing the ConnectableElements attached to the end. The set of ConnectorEnds is ordered."},
				new URI[0]);
		this.addAnnotation(this.getConnector_Kind(), source, new String[]{"documentation",
				"Indicates the kind of Connector. This is derived: a Connector with one or more ends connected to a Port which is not on a Part and which is not a behavior port is a delegation; otherwise it is an assembly."},
				new URI[0]);
		this.addAnnotation(this.getConnector_RedefinedConnector(), source, new String[]{"documentation",
				"A Connector may be redefined when its containing Classifier is specialized. The redefining Connector may have a type that specializes the type of the redefined Connector. The types of the ConnectorEnds of the redefining Connector may specialize the types of the ConnectorEnds of the redefined Connector. The properties of the ConnectorEnds of the redefining Connector may be replaced."},
				new URI[0]);
		this.addAnnotation(this.getConnector_Type(), source, new String[]{"documentation",
				"An optional Association that classifies links corresponding to this Connector."}, new URI[0]);
		this.addAnnotation(this.connectorEndEClass, source, new String[]{"documentation",
				"A ConnectorEnd is an endpoint of a Connector, which attaches the Connector to a ConnectableElement."},
				new URI[0]);
		this.addAnnotation(this.getConnectorEnd_DefiningEnd(), source, new String[]{"documentation",
				"A derived property referencing the corresponding end on the Association which types the Connector owing this ConnectorEnd, if any. It is derived by selecting the end at the same place in the ordering of Association ends as this ConnectorEnd."},
				new URI[0]);
		this.addAnnotation(this.getConnectorEnd_PartWithPort(), source, new String[]{"documentation",
				"Indicates the role of the internal structure of a Classifier with the Port to which the ConnectorEnd is attached."},
				new URI[0]);
		this.addAnnotation(this.getConnectorEnd_Role(), source, new String[]{"documentation",
				"The ConnectableElement attached at this ConnectorEnd. When an instance of the containing Classifier is created, a link may (depending on the multiplicities) be created to an instance of the Classifier that types this ConnectableElement."},
				new URI[0]);
		this.addAnnotation(this.connectorKindEEnum, source, new String[]{"documentation",
				"ConnectorKind is an enumeration that defines whether a Connector is an assembly or a delegation."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.connectorKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "Indicates that the Connector is an assembly Connector."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.connectorKindEEnum.getELiterals().get(1), source,
				new String[]{"documentation", "Indicates that the Connector is a delegation Connector."}, new URI[0]);
		this.addAnnotation(this.messageEClass, source,
				new String[]{"documentation",
						"A Message defines a particular communication between Lifelines of an Interaction."},
				new URI[0]);
		this.addAnnotation(this.getMessage_Argument(), source,
				new String[]{"documentation", "The arguments of the Message."}, new URI[0]);
		this.addAnnotation(this.getMessage_Interaction(), source,
				new String[]{"documentation", "The enclosing Interaction owning the Message."}, new URI[0]);
		this.addAnnotation(this.getMessage_MessageKind(), source,
				new String[]{"documentation", "The derived kind of the Message (complete, lost, found, or unknown)."},
				new URI[0]);
		this.addAnnotation(this.getMessage_MessageSort(), source,
				new String[]{"documentation", "The sort of communication reflected by the Message."}, new URI[0]);
		this.addAnnotation(this.getMessage_ReceiveEvent(), source,
				new String[]{"documentation", "References the Receiving of the Message."}, new URI[0]);
		this.addAnnotation(this.getMessage_SendEvent(), source,
				new String[]{"documentation", "References the Sending of the Message."}, new URI[0]);
		this.addAnnotation(this.getMessage_Signature(), source, new String[]{"documentation",
				"The signature of the Message is the specification of its content. It refers either an Operation or a Signal."},
				new URI[0]);
		this.addAnnotation(this.getMessage_Connector(), source,
				new String[]{"documentation", "The Connector on which this Message is sent."}, new URI[0]);
		this.addAnnotation(this.messageKindEEnum, source,
				new String[]{"documentation", "This is an enumerated type that identifies the type of Message."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.messageKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "sendEvent and receiveEvent are present"}, new URI[0]);
		this.addAnnotation((ENamedElement) this.messageKindEEnum.getELiterals().get(1), source,
				new String[]{"documentation", "sendEvent present and receiveEvent absent"}, new URI[0]);
		this.addAnnotation((ENamedElement) this.messageKindEEnum.getELiterals().get(2), source,
				new String[]{"documentation", "sendEvent absent and receiveEvent present"}, new URI[0]);
		this.addAnnotation((ENamedElement) this.messageKindEEnum.getELiterals().get(3), source,
				new String[]{"documentation", "sendEvent and receiveEvent absent (should not appear)"}, new URI[0]);
		this.addAnnotation(this.messageSortEEnum, source, new String[]{"documentation",
				"This is an enumerated type that identifies the type of communication action that was used to generate the Message."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.messageSortEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "The message was generated by a synchronous call to an operation."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.messageSortEEnum.getELiterals().get(1), source, new String[]{
				"documentation",
				"The message was generated by an asynchronous call to an operation; i.e., a CallAction with isSynchronous = false."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.messageSortEEnum.getELiterals().get(2), source,
				new String[]{"documentation", "The message was generated by an asynchronous send action."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.messageSortEEnum.getELiterals().get(3), source,
				new String[]{"documentation", "The message designating the creation of another lifeline object."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.messageSortEEnum.getELiterals().get(4), source,
				new String[]{"documentation", "The message designating the termination of another lifeline."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.messageSortEEnum.getELiterals().get(5), source,
				new String[]{"documentation", "The message is a reply message to an operation call."}, new URI[0]);
		this.addAnnotation(this.messageEndEClass, source, new String[]{"documentation",
				"MessageEnd is an abstract specialization of NamedElement that represents what can occur at the end of a Message."},
				new URI[0]);
		this.addAnnotation(this.getMessageEnd_Message(), source, new String[]{"documentation", "References a Message."},
				new URI[0]);
		this.addAnnotation(this.invocationActionEClass, source, new String[]{"documentation",
				"InvocationAction is an abstract class for the various actions that request Behavior invocation.\r\n"},
				new URI[0]);
		this.addAnnotation(this.getInvocationAction_Argument(), source,
				new String[]{"documentation",
						"The InputPins that provide the argument values passed in the invocation request."},
				new URI[0]);
		this.addAnnotation(this.getInvocationAction_OnPort(), source, new String[]{"documentation",
				"For CallOperationActions, SendSignalActions, and SendObjectActions, an optional Port of the target object through which the invocation request is sent."},
				new URI[0]);
		this.addAnnotation(this.acceptEventActionEClass, source, new String[]{"documentation",
				"An AcceptEventAction is an Action that waits for the occurrence of one or more specific Events."},
				new URI[0]);
		this.addAnnotation(this.getAcceptEventAction_Unmarshall(), source, new String[]{"documentation",
				"Indicates whether there is a single OutputPin for a SignalEvent occurrence, or multiple OutputPins for attribute values of the instance of the Signal associated with a SignalEvent occurrence."},
				new URI[0]);
		this.addAnnotation(this.getAcceptEventAction_Result(), source,
				new String[]{"documentation", "OutputPins holding the values received from an Event occurrence."},
				new URI[0]);
		this.addAnnotation(this.getAcceptEventAction_Trigger(), source,
				new String[]{"documentation",
						"The Triggers specifying the Events of which the AcceptEventAction waits for occurrences."},
				new URI[0]);
		this.addAnnotation(this.outputPinEClass, source,
				new String[]{"documentation", "An OutputPin is a Pin that holds output values produced by an Action."},
				new URI[0]);
		this.addAnnotation(this.readExtentActionEClass, source,
				new String[]{"documentation",
						"A ReadExtentAction is an Action that retrieves the current instances of a Classifier."},
				new URI[0]);
		this.addAnnotation(this.getReadExtentAction_Classifier(), source,
				new String[]{"documentation", "The Classifier whose instances are to be retrieved."}, new URI[0]);
		this.addAnnotation(this.getReadExtentAction_Result(), source,
				new String[]{"documentation", "The OutputPin on which the Classifier instances are placed."},
				new URI[0]);
		this.addAnnotation(this.conditionalNodeEClass, source, new String[]{"documentation",
				"A ConditionalNode is a StructuredActivityNode that chooses one among some number of alternative collections of ExecutableNodes to execute."},
				new URI[0]);
		this.addAnnotation(this.getConditionalNode_Clause(), source,
				new String[]{"documentation", "The set of Clauses composing the ConditionalNode."}, new URI[0]);
		this.addAnnotation(this.getConditionalNode_Assured(), source, new String[]{"documentation",
				"If true, the modeler asserts that the test for at least one Clause of the ConditionalNode will succeed."},
				new URI[0]);
		this.addAnnotation(this.getConditionalNode_Determinate(), source, new String[]{"documentation",
				"If true, the modeler asserts that the test for at most one Clause of the ConditionalNode will succeed."},
				new URI[0]);
		this.addAnnotation(this.getConditionalNode_Result(), source, new String[]{"documentation",
				"The OutputPins that onto which are moved values from the bodyOutputs of the Clause selected for execution."},
				new URI[0]);
		this.addAnnotation(this.clauseEClass, source, new String[]{"documentation",
				"A Clause is an Element that represents a single branch of a ConditionalNode, including a test and a body section. The body section is executed only if (but not necessarily if) the test section evaluates to true."},
				new URI[0]);
		this.addAnnotation(this.getClause_Body(), source, new String[]{"documentation",
				"The set of ExecutableNodes that are executed if the test evaluates to true and the Clause is chosen over other Clauses within the ConditionalNode that also have tests that evaluate to true."},
				new URI[0]);
		this.addAnnotation(this.getClause_BodyOutput(), source, new String[]{"documentation",
				"The OutputPins on Actions within the body section whose values are moved to the result OutputPins of the containing ConditionalNode after execution of the body."},
				new URI[0]);
		this.addAnnotation(this.getClause_Decider(), source, new String[]{"documentation",
				"An OutputPin on an Action in the test section whose Boolean value determines the result of the test."},
				new URI[0]);
		this.addAnnotation(this.getClause_PredecessorClause(), source, new String[]{"documentation",
				"A set of Clauses whose tests must all evaluate to false before this Clause can evaluate its test."},
				new URI[0]);
		this.addAnnotation(this.getClause_SuccessorClause(), source, new String[]{"documentation",
				"A set of Clauses that may not evaluate their tests unless the test for this Clause evaluates to false."},
				new URI[0]);
		this.addAnnotation(this.getClause_Test(), source, new String[]{"documentation",
				"The set of ExecutableNodes that are executed in order to provide a test result for the Clause."},
				new URI[0]);
		this.addAnnotation(this.loopNodeEClass, source, new String[]{"documentation",
				"A LoopNode is a StructuredActivityNode that represents an iterative loop with setup, test, and body sections."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_BodyOutput(), source, new String[]{"documentation",
				"The OutputPins on Actions within the bodyPart, the values of which are moved to the loopVariable OutputPins after the completion of each execution of the bodyPart, before the next iteration of the loop begins or before the loop exits."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_BodyPart(), source, new String[]{"documentation",
				"The set of ExecutableNodes that perform the repetitive computations of the loop. The bodyPart is executed as long as the test section produces a true value."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_Decider(), source, new String[]{"documentation",
				"An OutputPin on an Action in the test section whose Boolean value determines whether to continue executing the loop bodyPart."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_TestedFirst(), source, new String[]{"documentation",
				"If true, the test is performed before the first execution of the bodyPart. If false, the bodyPart is executed once before the test is performed."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_LoopVariableInput(), source, new String[]{"documentation",
				"A list of InputPins whose values are moved into the loopVariable Pins before the first iteration of the loop."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_Result(), source, new String[]{"documentation",
				"A list of OutputPins that receive the loopVariable values after the last iteration of the loop and constitute the output of the LoopNode."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_SetupPart(), source, new String[]{"documentation",
				"The set of ExecutableNodes executed before the first iteration of the loop, in order to initialize values or perform other setup computations."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_Test(), source,
				new String[]{"documentation",
						"The set of ExecutableNodes executed in order to provide the test result for the loop."},
				new URI[0]);
		this.addAnnotation(this.getLoopNode_LoopVariable(), source, new String[]{"documentation",
				"A list of OutputPins that hold the values of the loop variables during an execution of the loop. When the test fails, the values are moved to the result OutputPins of the loop."},
				new URI[0]);
		this.addAnnotation(this.reduceActionEClass, source, new String[]{"documentation",
				"A ReduceAction is an Action that reduces a collection to a single value by repeatedly combining the elements of the collection using a reducer Behavior."},
				new URI[0]);
		this.addAnnotation(this.getReduceAction_Collection(), source,
				new String[]{"documentation", "The InputPin that provides the collection to be reduced."}, new URI[0]);
		this.addAnnotation(this.getReduceAction_Ordered(), source, new String[]{"documentation",
				"Indicates whether the order of the input collection should determine the order in which the reducer Behavior is applied to its elements."},
				new URI[0]);
		this.addAnnotation(this.getReduceAction_Reducer(), source, new String[]{"documentation",
				"A Behavior that is repreatedly applied to two elements of the input collection to produce a value that is of the same type as elements of the collection."},
				new URI[0]);
		this.addAnnotation(this.getReduceAction_Result(), source,
				new String[]{"documentation", "The output pin on which the result value is placed."}, new URI[0]);
		this.addAnnotation(this.createObjectActionEClass, source,
				new String[]{"documentation",
						"A CreateObjectAction is an Action that creates an instance of the specified Classifier."},
				new URI[0]);
		this.addAnnotation(this.getCreateObjectAction_Classifier(), source,
				new String[]{"documentation", "The Classifier to be instantiated."}, new URI[0]);
		this.addAnnotation(this.getCreateObjectAction_Result(), source,
				new String[]{"documentation", "The OutputPin on which the newly created object is placed."},
				new URI[0]);
		this.addAnnotation(this.unmarshallActionEClass, source, new String[]{"documentation",
				"An UnmarshallAction is an Action that retrieves the values of the StructuralFeatures of an object and places them on OutputPins. "},
				new URI[0]);
		this.addAnnotation(this.getUnmarshallAction_Object(), source,
				new String[]{"documentation", "The InputPin that gives the object to be unmarshalled."}, new URI[0]);
		this.addAnnotation(this.getUnmarshallAction_UnmarshallType(), source,
				new String[]{"documentation", "The type of the object to be unmarshalled."}, new URI[0]);
		this.addAnnotation(this.getUnmarshallAction_Result(), source,
				new String[]{"documentation",
						"The OutputPins on which are placed the values of the StructuralFeatures of the input object."},
				new URI[0]);
		this.addAnnotation(this.opaqueActionEClass, source, new String[]{"documentation",
				"An OpaqueAction is an Action whose functionality is not specified within UML."}, new URI[0]);
		this.addAnnotation(this.getOpaqueAction_Body(), source, new String[]{"documentation",
				"Provides a textual specification of the functionality of the Action, in one or more languages other than UML."},
				new URI[0]);
		this.addAnnotation(this.getOpaqueAction_InputValue(), source,
				new String[]{"documentation", "The InputPins providing inputs to the OpaqueAction."}, new URI[0]);
		this.addAnnotation(this.getOpaqueAction_Language(), source, new String[]{"documentation",
				"If provided, a specification of the language used for each of the body Strings."}, new URI[0]);
		this.addAnnotation(this.getOpaqueAction_OutputValue(), source,
				new String[]{"documentation", "The OutputPins on which the OpaqueAction provides outputs."},
				new URI[0]);
		this.addAnnotation(this.readLinkActionEClass, source, new String[]{"documentation",
				"A ReadLinkAction is a LinkAction that navigates across an Association to retrieve the objects on one end."},
				new URI[0]);
		this.addAnnotation(this.getReadLinkAction_Result(), source, new String[]{"documentation",
				"The OutputPin on which the objects retrieved from the \"open\" end of those links whose values on other ends are given by the endData."},
				new URI[0]);
		this.addAnnotation(this.linkActionEClass, source, new String[]{"documentation",
				"LinkAction is an abstract class for all Actions that identify the links to be acted on using LinkEndData."},
				new URI[0]);
		this.addAnnotation(this.getLinkAction_EndData(), source, new String[]{"documentation",
				"The LinkEndData identifying the values on the ends of the links acting on by this LinkAction."},
				new URI[0]);
		this.addAnnotation(this.getLinkAction_InputValue(), source,
				new String[]{"documentation", "InputPins used by the LinkEndData of the LinkAction."}, new URI[0]);
		this.addAnnotation(this.linkEndDataEClass, source, new String[]{"documentation",
				"LinkEndData is an Element that identifies on end of a link to be read or written by a LinkAction. As a link (that is not a link object) cannot be passed as a runtime value to or from an Action, it is instead identified by its end objects and qualifier values, if any. A LinkEndData instance provides these values for a single Association end."},
				new URI[0]);
		this.addAnnotation(this.getLinkEndData_End(), source,
				new String[]{"documentation", "The Association end for which this LinkEndData specifies values."},
				new URI[0]);
		this.addAnnotation(this.getLinkEndData_Qualifier(), source, new String[]{"documentation",
				"A set of QualifierValues used to provide values for the qualifiers of the end."}, new URI[0]);
		this.addAnnotation(this.getLinkEndData_Value(), source, new String[]{"documentation",
				"The InputPin that provides the specified value for the given end. This InputPin is omitted if the LinkEndData specifies the \"open\" end for a ReadLinkAction."},
				new URI[0]);
		this.addAnnotation(this.qualifierValueEClass, source, new String[]{"documentation",
				"A QualifierValue is an Element that is used as part of LinkEndData to provide the value for a single qualifier of the end given by the LinkEndData."},
				new URI[0]);
		this.addAnnotation(this.getQualifierValue_Qualifier(), source,
				new String[]{"documentation", "The qualifier Property for which the value is to be specified."},
				new URI[0]);
		this.addAnnotation(this.getQualifierValue_Value(), source, new String[]{"documentation",
				"The InputPin from which the specified value for the qualifier is taken."}, new URI[0]);
		this.addAnnotation(this.readLinkObjectEndActionEClass, source,
				new String[]{"documentation",
						"A ReadLinkObjectEndAction is an Action that retrieves an end object from a link object."},
				new URI[0]);
		this.addAnnotation(this.getReadLinkObjectEndAction_End(), source,
				new String[]{"documentation", "The Association end to be read."}, new URI[0]);
		this.addAnnotation(this.getReadLinkObjectEndAction_Object(), source,
				new String[]{"documentation", "The input pin from which the link object is obtained."}, new URI[0]);
		this.addAnnotation(this.getReadLinkObjectEndAction_Result(), source,
				new String[]{"documentation", "The OutputPin where the result value is placed."}, new URI[0]);
		this.addAnnotation(this.acceptCallActionEClass, source, new String[]{"documentation",
				"An AcceptCallAction is an AcceptEventAction that handles the receipt of a synchronous call request. In addition to the values from the Operation input parameters, the Action produces an output that is needed later to supply the information to the ReplyAction necessary to return control to the caller. An AcceptCallAction is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent ReplyAction will complete immediately with no effect."},
				new URI[0]);
		this.addAnnotation(this.getAcceptCallAction_ReturnInformation(), source, new String[]{"documentation",
				"An OutputPin where a value is placed containing sufficient information to perform a subsequent ReplyAction and return control to the caller. The contents of this value are opaque. It can be passed and copied but it cannot be manipulated by the model."},
				new URI[0]);
		this.addAnnotation(this.writeStructuralFeatureActionEClass, source, new String[]{"documentation",
				"WriteStructuralFeatureAction is an abstract class for StructuralFeatureActions that change StructuralFeature values."},
				new URI[0]);
		this.addAnnotation(this.getWriteStructuralFeatureAction_Value(), source,
				new String[]{"documentation",
						"The InputPin that provides the value to be added or removed from the StructuralFeature."},
				new URI[0]);
		this.addAnnotation(this.getWriteStructuralFeatureAction_Result(), source, new String[]{"documentation",
				"The OutputPin on which is put the input object as modified by the WriteStructuralFeatureAction."},
				new URI[0]);
		this.addAnnotation(this.createLinkObjectActionEClass, source, new String[]{"documentation",
				"A CreateLinkObjectAction is a CreateLinkAction for creating link objects (AssociationClasse instances)."},
				new URI[0]);
		this.addAnnotation(this.getCreateLinkObjectAction_Result(), source,
				new String[]{"documentation", "The output pin on which the newly created link object is placed."},
				new URI[0]);
		this.addAnnotation(this.createLinkActionEClass, source,
				new String[]{"documentation", "A CreateLinkAction is a WriteLinkAction for creating links."},
				new URI[0]);
		this.addAnnotation(this.getCreateLinkAction_EndData(), source, new String[]{"documentation",
				"The LinkEndData that specifies the values to be placed on the Association ends for the new link."},
				new URI[0]);
		this.addAnnotation(this.writeLinkActionEClass, source,
				new String[]{"documentation",
						"WriteLinkAction is an abstract class for LinkActions that create and destroy links."},
				new URI[0]);
		this.addAnnotation(this.linkEndCreationDataEClass, source, new String[]{"documentation",
				"LinkEndCreationData is LinkEndData used to provide values for one end of a link to be created by a CreateLinkAction."},
				new URI[0]);
		this.addAnnotation(this.getLinkEndCreationData_InsertAt(), source, new String[]{"documentation",
				"For ordered Association ends, the InputPin that provides the position where the new link should be inserted or where an existing link should be moved to. The type of the insertAt InputPin is UnlimitedNatural, but the input cannot be zero. It is omitted for Association ends that are not ordered."},
				new URI[0]);
		this.addAnnotation(this.getLinkEndCreationData_ReplaceAll(), source, new String[]{"documentation",
				"Specifies whether the existing links emanating from the object on this end should be destroyed before creating a new link."},
				new URI[0]);
		this.addAnnotation(this.readStructuralFeatureActionEClass, source, new String[]{"documentation",
				"A ReadStructuralFeatureAction is a StructuralFeatureAction that retrieves the values of a StructuralFeature."},
				new URI[0]);
		this.addAnnotation(this.getReadStructuralFeatureAction_Result(), source,
				new String[]{"documentation", "The OutputPin on which the result values are placed."}, new URI[0]);
		this.addAnnotation(this.clearStructuralFeatureActionEClass, source, new String[]{"documentation",
				"A ClearStructuralFeatureAction is a StructuralFeatureAction that removes all values of a StructuralFeature."},
				new URI[0]);
		this.addAnnotation(this.getClearStructuralFeatureAction_Result(), source, new String[]{"documentation",
				"The OutputPin on which is put the input object as modified by the ClearStructuralFeatureAction."},
				new URI[0]);
		this.addAnnotation(this.valueSpecificationActionEClass, source, new String[]{"documentation",
				"A ValueSpecificationAction is an Action that evaluates a ValueSpecification and provides a result."},
				new URI[0]);
		this.addAnnotation(this.getValueSpecificationAction_Value(), source,
				new String[]{"documentation", "The ValueSpecification to be evaluated."}, new URI[0]);
		this.addAnnotation(this.getValueSpecificationAction_Result(), source,
				new String[]{"documentation", "The OutputPin on which the result value is placed."}, new URI[0]);
		this.addAnnotation(this.testIdentityActionEClass, source,
				new String[]{"documentation",
						"A TestIdentityAction is an Action that tests if two values are identical objects."},
				new URI[0]);
		this.addAnnotation(this.getTestIdentityAction_First(), source,
				new String[]{"documentation", "The InputPin on which the first input object is placed."}, new URI[0]);
		this.addAnnotation(this.getTestIdentityAction_Second(), source,
				new String[]{"documentation", "The OutputPin on which the second input object is placed."}, new URI[0]);
		this.addAnnotation(this.getTestIdentityAction_Result(), source,
				new String[]{"documentation",
						"The OutputPin whose Boolean value indicates whether the two input objects are identical."},
				new URI[0]);
		this.addAnnotation(this.readIsClassifiedObjectActionEClass, source, new String[]{"documentation",
				"A ReadIsClassifiedObjectAction is an Action that determines whether an object is classified by a given Classifier."},
				new URI[0]);
		this.addAnnotation(this.getReadIsClassifiedObjectAction_Classifier(), source, new String[]{"documentation",
				"The Classifier against which the classification of the input object is tested."}, new URI[0]);
		this.addAnnotation(this.getReadIsClassifiedObjectAction_Direct(), source, new String[]{"documentation",
				"Indicates whether the input object must be directly classified by the given Classifier or whether it may also be an instance of a specialization of the given Classifier."},
				new URI[0]);
		this.addAnnotation(this.getReadIsClassifiedObjectAction_Object(), source, new String[]{"documentation",
				"The InputPin that holds the object whose classification is to be tested."}, new URI[0]);
		this.addAnnotation(this.getReadIsClassifiedObjectAction_Result(), source,
				new String[]{"documentation", "The OutputPin that holds the Boolean result of the test."}, new URI[0]);
		this.addAnnotation(this.callActionEClass, source, new String[]{"documentation",
				"CallAction is an abstract class for Actions that invoke a Behavior with given argument values and (if the invocation is synchronous) receive reply values."},
				new URI[0]);
		this.addAnnotation(this.getCallAction_Synchronous(), source, new String[]{"documentation",
				"If true, the call is synchronous and the caller waits for completion of the invoked Behavior. If false, the call is asynchronous and the caller proceeds immediately and cannot receive return values."},
				new URI[0]);
		this.addAnnotation(this.getCallAction_Result(), source, new String[]{"documentation",
				"The OutputPins on which the reply values from the invocation are placed (if the call is synchronous)."},
				new URI[0]);
		this.addAnnotation(this.readSelfActionEClass, source, new String[]{"documentation",
				"A ReadSelfAction is an Action that retrieves the context object of the Behavior execution within which the ReadSelfAction execution is taking place."},
				new URI[0]);
		this.addAnnotation(this.getReadSelfAction_Result(), source,
				new String[]{"documentation", "The OutputPin on which the context object is placed."}, new URI[0]);
		this.addAnnotation(this.readVariableActionEClass, source,
				new String[]{"documentation",
						"A ReadVariableAction is a VariableAction that retrieves the values of a Variable."},
				new URI[0]);
		this.addAnnotation(this.getReadVariableAction_Result(), source,
				new String[]{"documentation", "The OutputPin on which the result values are placed."}, new URI[0]);
		this.addAnnotation(this.variableActionEClass, source,
				new String[]{"documentation",
						"VariableAction is an abstract class for Actions that operate on a specified Variable."},
				new URI[0]);
		this.addAnnotation(this.getVariableAction_Variable(), source,
				new String[]{"documentation", "The Variable to be read or written."}, new URI[0]);
		this.addAnnotation(this.readLinkObjectEndQualifierActionEClass, source, new String[]{"documentation",
				"A ReadLinkObjectEndQualifierAction is an Action that retrieves a qualifier end value from a link object."},
				new URI[0]);
		this.addAnnotation(this.getReadLinkObjectEndQualifierAction_Object(), source,
				new String[]{"documentation", "The InputPin from which the link object is obtained."}, new URI[0]);
		this.addAnnotation(this.getReadLinkObjectEndQualifierAction_Qualifier(), source,
				new String[]{"documentation", "The qualifier Property to be read."}, new URI[0]);
		this.addAnnotation(this.getReadLinkObjectEndQualifierAction_Result(), source,
				new String[]{"documentation", "The OutputPin where the result value is placed."}, new URI[0]);
		this.addAnnotation(this.replyActionEClass, source, new String[]{"documentation",
				"A ReplyAction is an Action that accepts a set of reply values and a value containing return information produced by a previous AcceptCallAction. The ReplyAction returns the values to the caller of the previous call, completing execution of the call."},
				new URI[0]);
		this.addAnnotation(this.getReplyAction_ReplyValue(), source, new String[]{"documentation",
				"A list of InputPins providing the values for the output (inout, out, and return) Parameters of the Operation. These values are returned to the caller."},
				new URI[0]);
		this.addAnnotation(this.getReplyAction_ReturnInformation(), source,
				new String[]{"documentation",
						"An InputPin that holds the return information value produced by an earlier AcceptCallAction."},
				new URI[0]);
		this.addAnnotation(this.getReplyAction_ReplyToCall(), source,
				new String[]{"documentation", "The Trigger specifying the Operation whose call is being replied to."},
				new URI[0]);
		this.addAnnotation(this.sendSignalActionEClass, source, new String[]{"documentation",
				"A SendSignalAction is an InvocationAction that creates a Signal instance and transmits it to the target object. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instance is sent out and cannot receive reply values."},
				new URI[0]);
		this.addAnnotation(this.getSendSignalAction_Target(), source,
				new String[]{"documentation",
						"The InputPin that provides the target object to which the Signal instance is sent."},
				new URI[0]);
		this.addAnnotation(this.getSendSignalAction_Signal(), source,
				new String[]{"documentation", "The Signal whose instance is transmitted to the target."}, new URI[0]);
		this.addAnnotation(this.broadcastSignalActionEClass, source, new String[]{"documentation",
				"A BroadcastSignalAction is an InvocationAction that transmits a Signal instance to all the potential target objects in the system. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instances are sent out and cannot receive reply values."},
				new URI[0]);
		this.addAnnotation(this.getBroadcastSignalAction_Signal(), source,
				new String[]{"documentation", "The Signal whose instances are to be sent."}, new URI[0]);
		this.addAnnotation(this.interfaceRealizationEClass, source, new String[]{"documentation",
				"An InterfaceRealization is a specialized realization relationship between a BehavioredClassifier and an Interface. This relationship signifies that the realizing BehavioredClassifier conforms to the contract specified by the Interface."},
				new URI[0]);
		this.addAnnotation(this.getInterfaceRealization_ImplementingClassifier(), source, new String[]{"documentation",
				"References the BehavioredClassifier that owns this InterfaceRealization, i.e., the BehavioredClassifier that realizes the Interface to which it refers."},
				new URI[0]);
		this.addAnnotation(this.getInterfaceRealization_Contract(), source,
				new String[]{"documentation", "References the Interface specifying the conformance contract."},
				new URI[0]);
		this.addAnnotation(this.realizationEClass, source, new String[]{"documentation",
				"Realization is a specialized Abstraction relationship between two sets of model Elements, one representing a specification (the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model stepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc."},
				new URI[0]);
		this.addAnnotation(this.abstractionEClass, source, new String[]{"documentation",
				"An Abstraction is a Relationship that relates two Elements or sets of Elements that represent the same concept at different levels of abstraction or from different viewpoints."},
				new URI[0]);
		this.addAnnotation(this.getAbstraction_Mapping(), source, new String[]{"documentation",
				"An OpaqueExpression that states the abstraction relationship between the supplier(s) and the client(s). In some cases, such as derivation, it is usually formal and unidirectional; in other cases, such as trace, it is usually informal and bidirectional. The mapping expression is optional and may be omitted if the precise relationship between the Elements is not specified."},
				new URI[0]);
		this.addAnnotation(this.dependencyEClass, source, new String[]{"documentation",
				"A Dependency is a Relationship that signifies that a single model Element or a set of model Elements requires other model Elements for their specification or implementation. This means that the complete semantics of the client Element(s) are either semantically or structurally dependent on the definition of the supplier Element(s)."},
				new URI[0]);
		this.addAnnotation(this.getDependency_Client(), source, new String[]{"documentation",
				"The Element(s) dependent on the supplier Element(s). In some cases (such as a trace Abstraction) the assignment of direction (that is, the designation of the client Element) is at the discretion of the modeler and is a stipulation."},
				new URI[0]);
		this.addAnnotation(this.getDependency_Supplier(), source, new String[]{"documentation",
				"The Element(s) on which the client Element(s) depend in some respect. The modeler may stipulate a sense of Dependency direction suitable for their domain."},
				new URI[0]);
		this.addAnnotation(this.collaborationUseEClass, source, new String[]{"documentation",
				"A CollaborationUse is used to specify the application of a pattern specified by a Collaboration to a specific situation."},
				new URI[0]);
		this.addAnnotation(this.getCollaborationUse_Type(), source, new String[]{"documentation",
				"The Collaboration which is used in this CollaborationUse. The Collaboration defines the cooperation between its roles which are mapped to ConnectableElements relating to the Classifier owning the CollaborationUse."},
				new URI[0]);
		this.addAnnotation(this.getCollaborationUse_RoleBinding(), source, new String[]{"documentation",
				"A mapping between features of the Collaboration and features of the owning Classifier. This mapping indicates which ConnectableElement of the Classifier plays which role(s) in the Collaboration. A ConnectableElement may be bound to multiple roles in the same CollaborationUse (that is, it may play multiple roles)."},
				new URI[0]);
		this.addAnnotation(this.collaborationEClass, source, new String[]{"documentation",
				"A Collaboration describes a structure of collaborating elements (roles), each performing a specialized function, which collectively accomplish some desired functionality. "},
				new URI[0]);
		this.addAnnotation(this.getCollaboration_CollaborationRole(), source,
				new String[]{"documentation", "Represents the participants in the Collaboration."}, new URI[0]);
		this.addAnnotation(this.opaqueExpressionEClass, source, new String[]{"documentation",
				"An OpaqueExpression is a ValueSpecification that specifies the computation of a collection of values either in terms of a UML Behavior or based on a textual statement in a language other than UML"},
				new URI[0]);
		this.addAnnotation(this.getOpaqueExpression_Behavior(), source,
				new String[]{"documentation", "Specifies the behavior of the OpaqueExpression as a UML Behavior."},
				new URI[0]);
		this.addAnnotation(this.getOpaqueExpression_Body(), source, new String[]{"documentation",
				"A textual definition of the behavior of the OpaqueExpression, possibly in multiple languages."},
				new URI[0]);
		this.addAnnotation(this.getOpaqueExpression_Language(), source, new String[]{"documentation",
				"Specifies the languages used to express the textual bodies of the OpaqueExpression.  Languages are matched to body Strings by order. The interpretation of the body depends on the languages. If the languages are unspecified, they may be implicit from the expression body or the context."},
				new URI[0]);
		this.addAnnotation(this.getOpaqueExpression_Result(), source, new String[]{"documentation",
				"If an OpaqueExpression is specified using a UML Behavior, then this refers to the single required return Parameter of that Behavior. When the Behavior completes execution, the values on this Parameter give the result of evaluating the OpaqueExpression."},
				new URI[0]);
		this.addAnnotation(this.componentEClass, source, new String[]{"documentation",
				"A Component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.  "},
				new URI[0]);
		this.addAnnotation(this.getComponent_IndirectlyInstantiated(), source, new String[]{"documentation",
				"If true, the Component is defined at design-time, but at run-time (or execution-time) an object specified by the Component does not exist, that is, the Component is instantiated indirectly, through the instantiation of its realizing Classifiers or parts."},
				new URI[0]);
		this.addAnnotation(this.getComponent_PackagedElement(), source, new String[]{"documentation",
				"The set of PackageableElements that a Component owns. In the namespace of a Component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g., Classes, Interfaces, Components, Packages, UseCases, Dependencies (e.g., mappings), and Artifacts."},
				new URI[0]);
		this.addAnnotation(this.getComponent_Realization(), source, new String[]{"documentation",
				"The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior."},
				new URI[0]);
		this.addAnnotation(this.getComponent_Required(), source, new String[]{"documentation",
				"The Interfaces that the Component requires from other Components in its environment in order to be able to offer its full set of provided functionality. These Interfaces may be used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports."},
				new URI[0]);
		this.addAnnotation(this.getComponent_Provided(), source, new String[]{"documentation",
				"The Interfaces that the Component exposes to its environment. These Interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports."},
				new URI[0]);
		this.addAnnotation(this.componentRealizationEClass, source, new String[]{"documentation",
				"Realization is specialized to (optionally) define the Classifiers that realize the contract offered by a Component in terms of its provided and required Interfaces. The Component forms an abstraction from these various Classifiers."},
				new URI[0]);
		this.addAnnotation(this.getComponentRealization_RealizingClassifier(), source, new String[]{"documentation",
				"The Classifiers that are involved in the implementation of the Component that owns this Realization."},
				new URI[0]);
		this.addAnnotation(this.getComponentRealization_Abstraction(), source, new String[]{"documentation",
				"The Component that owns this ComponentRealization and which is implemented by its realizing Classifiers."},
				new URI[0]);
		this.addAnnotation(this.artifactEClass, source, new String[]{"documentation",
				"An artifact is the specification of a physical piece of information that is used or produced by a software development process, or by deployment and operation of a system. Examples of artifacts include model files, source files, scripts, and binary executable files, a table in a database system, a development deliverable, or a word-processing document, a mail message.\nAn artifact is the source of a deployment to a node."},
				new URI[0]);
		this.addAnnotation(this.getArtifact_FileName(), source, new String[]{"documentation",
				"A concrete name that is used to refer to the Artifact in a physical context. Example: file system name, universal resource locator."},
				new URI[0]);
		this.addAnnotation(this.getArtifact_Manifestation(), source, new String[]{"documentation",
				"The set of model elements that are manifested in the Artifact. That is, these model elements are utilized in the construction (or generation) of the artifact."},
				new URI[0]);
		this.addAnnotation(this.getArtifact_NestedArtifact(), source, new String[]{"documentation",
				"The Artifacts that are defined (nested) within the Artifact. The association is a specialization of the ownedMember association from Namespace to NamedElement."},
				new URI[0]);
		this.addAnnotation(this.getArtifact_OwnedOperation(), source, new String[]{"documentation",
				"The Operations defined for the Artifact. The association is a specialization of the ownedMember association."},
				new URI[0]);
		this.addAnnotation(this.getArtifact_OwnedAttribute(), source, new String[]{"documentation",
				"The attributes or association ends defined for the Artifact. The association is a specialization of the ownedMember association."},
				new URI[0]);
		this.addAnnotation(this.deployedArtifactEClass, source, new String[]{"documentation",
				"A deployed artifact is an artifact or artifact instance that has been deployed to a deployment target."},
				new URI[0]);
		this.addAnnotation(this.deploymentEClass, source, new String[]{"documentation",
				"A deployment is the allocation of an artifact or artifact instance to a deployment target.\nA component deployment is the deployment of one or more artifacts or artifact instances to a deployment target, optionally parameterized by a deployment specification. Examples are executables and configuration files."},
				new URI[0]);
		this.addAnnotation(this.getDeployment_Configuration(), source, new String[]{"documentation",
				"The specification of properties that parameterize the deployment and execution of one or more Artifacts."},
				new URI[0]);
		this.addAnnotation(this.getDeployment_Location(), source,
				new String[]{"documentation", "The DeployedTarget which is the target of a Deployment."}, new URI[0]);
		this.addAnnotation(this.getDeployment_DeployedArtifact(), source, new String[]{"documentation",
				"The Artifacts that are deployed onto a Node. This association specializes the supplier association."},
				new URI[0]);
		this.addAnnotation(this.deploymentSpecificationEClass, source, new String[]{"documentation",
				"A deployment specification specifies a set of properties that determine execution parameters of a component artifact that is deployed on a node. A deployment specification can be aimed at a specific type of container. An artifact that reifies or implements deployment specification properties is a deployment descriptor."},
				new URI[0]);
		this.addAnnotation(this.getDeploymentSpecification_DeploymentLocation(), source, new String[]{"documentation",
				"The location where an Artifact is deployed onto a Node. This is typically a 'directory' or 'memory address.'"},
				new URI[0]);
		this.addAnnotation(this.getDeploymentSpecification_ExecutionLocation(), source,
				new String[]{"documentation",
						"The location where a component Artifact executes. This may be a local or remote location."},
				new URI[0]);
		this.addAnnotation(this.getDeploymentSpecification_Deployment(), source,
				new String[]{"documentation", "The deployment with which the DeploymentSpecification is associated."},
				new URI[0]);
		this.addAnnotation(this.manifestationEClass, source, new String[]{"documentation",
				"A manifestation is the concrete physical rendering of one or more model elements by an artifact."},
				new URI[0]);
		this.addAnnotation(this.getManifestation_UtilizedElement(), source, new String[]{"documentation",
				"The model element that is utilized in the manifestation in an Artifact."}, new URI[0]);
		this.addAnnotation(this.interactionUseEClass, source, new String[]{"documentation",
				"An InteractionUse refers to an Interaction. The InteractionUse is a shorthand for copying the contents of the referenced Interaction where the InteractionUse is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal Gates with the actual ones."},
				new URI[0]);
		this.addAnnotation(this.getInteractionUse_ActualGate(), source,
				new String[]{"documentation", "The actual gates of the InteractionUse."}, new URI[0]);
		this.addAnnotation(this.getInteractionUse_Argument(), source,
				new String[]{"documentation", "The actual arguments of the Interaction."}, new URI[0]);
		this.addAnnotation(this.getInteractionUse_RefersTo(), source,
				new String[]{"documentation", "Refers to the Interaction that defines its meaning."}, new URI[0]);
		this.addAnnotation(this.getInteractionUse_ReturnValue(), source,
				new String[]{"documentation", "The value of the executed Interaction."}, new URI[0]);
		this.addAnnotation(this.getInteractionUse_ReturnValueRecipient(), source,
				new String[]{"documentation", "The recipient of the return value."}, new URI[0]);
		this.addAnnotation(this.gateEClass, source, new String[]{"documentation",
				"A Gate is a MessageEnd which serves as a connection point for relating a Message which has a MessageEnd (sendEvent / receiveEvent) outside an InteractionFragment with another Message which has a MessageEnd (receiveEvent / sendEvent)  inside that InteractionFragment."},
				new URI[0]);
		this.addAnnotation(this.combinedFragmentEClass, source, new String[]{"documentation",
				"A CombinedFragment defines an expression of InteractionFragments. A CombinedFragment is defined by an interaction operator and corresponding InteractionOperands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner."},
				new URI[0]);
		this.addAnnotation(this.getCombinedFragment_InteractionOperator(), source, new String[]{"documentation",
				"Specifies the operation which defines the semantics of this combination of InteractionFragments."},
				new URI[0]);
		this.addAnnotation(this.getCombinedFragment_Operand(), source,
				new String[]{"documentation", "The set of operands of the combined fragment."}, new URI[0]);
		this.addAnnotation(this.getCombinedFragment_CfragmentGate(), source, new String[]{"documentation",
				"Specifies the gates that form the interface between this CombinedFragment and its surroundings"},
				new URI[0]);
		this.addAnnotation(this.interactionOperatorKindEEnum, source, new String[]{"documentation",
				"InteractionOperatorKind is an enumeration designating the different kinds of operators of CombinedFragments. The InteractionOperand defines the type of operator of a CombinedFragment."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation",
						"The InteractionOperatorKind seq designates that the CombinedFragment represents a weak sequencing between the behaviors of the operands."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(1), source,
				new String[]{"documentation",
						"The InteractionOperatorKind alt designates that the CombinedFragment represents a choice of behavior. At most one of the operands will be chosen. The chosen operand must have an explicit or implicit guard expression that evaluates to true at this point in the interaction. An implicit true guard is implied if the operand has no guard."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(2), source,
				new String[]{"documentation",
						"The InteractionOperatorKind opt designates that the CombinedFragment represents a choice of behavior where either the (sole) operand happens or nothing happens. An option is semantically equivalent to an alternative CombinedFragment where there is one operand with non-empty content and the second operand is empty."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(3), source,
				new String[]{"documentation",
						"The InteractionOperatorKind break designates that the CombinedFragment represents a breaking scenario in the sense that the operand is a scenario that is performed instead of the remainder of the enclosing InteractionFragment. A break operator with a guard is chosen when the guard is true and the rest of the enclosing Interaction Fragment is ignored. When the guard of the break operand is false, the break operand is ignored and the rest of the enclosing InteractionFragment is chosen. The choice between a break operand without a guard and the rest of the enclosing InteractionFragment is done non-deterministically."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(4), source,
				new String[]{"documentation",
						"The InteractionOperatorKind par designates that the CombinedFragment represents a parallel merge between the behaviors of the operands. The OccurrenceSpecifications of the different operands can be interleaved in any way as long as the ordering imposed by each operand as such is preserved."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(5), source,
				new String[]{"documentation",
						"The InteractionOperatorKind strict designates that the CombinedFragment represents a strict sequencing between the behaviors of the operands. The semantics of strict sequencing defines a strict ordering of the operands on the first level within the CombinedFragment with interactionOperator strict. Therefore OccurrenceSpecifications within contained CombinedFragment will not directly be compared with other OccurrenceSpecifications of the enclosing CombinedFragment."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(6), source,
				new String[]{"documentation",
						"The InteractionOperatorKind loop designates that the CombinedFragment represents a loop. The loop operand will be repeated a number of times."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(7), source,
				new String[]{"documentation",
						"The InteractionOperatorKind critical designates that the CombinedFragment represents a critical region. A critical region means that the traces of the region cannot be interleaved by other OccurrenceSpecifications (on those Lifelines covered by the region). This means that the region is treated atomically by the enclosing fragment when determining the set of valid traces. Even though enclosing CombinedFragments may imply that some OccurrenceSpecifications may interleave into the region, such as with par-operator, this is prevented by defining a region."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(8), source,
				new String[]{"documentation",
						"The InteractionOperatorKind neg designates that the CombinedFragment represents traces that are defined to be invalid."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(9), source,
				new String[]{"documentation",
						"The InteractionOperatorKind assert designates that the CombinedFragment represents an assertion. The sequences of the operand of the assertion are the only valid continuations. All other continuations result in an invalid trace."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(10), source,
				new String[]{"documentation",
						"The InteractionOperatorKind ignore designates that there are some message types that are not shown within this combined fragment. These message types can be considered insignificant and are implicitly ignored if they appear in a corresponding execution. Alternatively, one can understand ignore to mean that the message types that are ignored can appear anywhere in the traces."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.interactionOperatorKindEEnum.getELiterals().get(11), source,
				new String[]{"documentation",
						"The InteractionOperatorKind consider designates which messages should be considered within this combined fragment. This is equivalent to defining every other message to be ignored."},
				new URI[0]);
		this.addAnnotation(this.interactionOperandEClass, source, new String[]{"documentation",
				"An InteractionOperand is contained in a CombinedFragment. An InteractionOperand represents one operand of the expression given by the enclosing CombinedFragment."},
				new URI[0]);
		this.addAnnotation(this.getInteractionOperand_Fragment(), source,
				new String[]{"documentation", "The fragments of the operand."}, new URI[0]);
		this.addAnnotation(this.getInteractionOperand_Guard(), source,
				new String[]{"documentation", "Constraint of the operand."}, new URI[0]);
		this.addAnnotation(this.interactionConstraintEClass, source, new String[]{"documentation",
				"An InteractionConstraint is a Boolean expression that guards an operand in a CombinedFragment."},
				new URI[0]);
		this.addAnnotation(this.getInteractionConstraint_Maxint(), source,
				new String[]{"documentation", "The maximum number of iterations of a loop"}, new URI[0]);
		this.addAnnotation(this.getInteractionConstraint_Minint(), source,
				new String[]{"documentation", "The minimum number of iterations of a loop"}, new URI[0]);
		this.addAnnotation(this.clearAssociationActionEClass, source, new String[]{"documentation",
				"A ClearAssociationAction is an Action that destroys all links of an Association in which a particular object participates."},
				new URI[0]);
		this.addAnnotation(this.getClearAssociationAction_Object(), source,
				new String[]{"documentation",
						"The InputPin that gives the object whose participation in the Association is to be cleared."},
				new URI[0]);
		this.addAnnotation(this.getClearAssociationAction_Association(), source,
				new String[]{"documentation", "The Association to be cleared."}, new URI[0]);
		this.addAnnotation(this.operationTemplateParameterEClass, source,
				new String[]{"documentation",
						"An OperationTemplateParameter exposes an Operation as a formal parameter for a template."},
				new URI[0]);
		this.addAnnotation(this.getOperationTemplateParameter_ParameteredElement(), source,
				new String[]{"documentation", "The Operation exposed by this OperationTemplateParameter."}, new URI[0]);
		this.addAnnotation(this.unlimitedNaturalEDataType, source, new String[]{"documentation",
				"UnlimitedNatural is a primitive type representing unlimited natural values."}, new URI[0]);
		this.addAnnotation(this.callOperationActionEClass, source, new String[]{"documentation",
				"A CallOperationAction is a CallAction that transmits an Operation call request to the target object, where it may cause the invocation of associated Behavior. The argument values of the CallOperationAction are passed on the input Parameters of the Operation. If call is synchronous, the execution of the CallOperationAction waits until the execution of the invoked Operation completes and the values of output Parameters of the Operation are placed on the result OutputPins. If the call is asynchronous, the CallOperationAction completes immediately and no results values can be provided."},
				new URI[0]);
		this.addAnnotation(this.getCallOperationAction_Target(), source,
				new String[]{"documentation",
						"The InputPin that provides the target object to which the Operation call request is sent."},
				new URI[0]);
		this.addAnnotation(this.getCallOperationAction_Operation(), source,
				new String[]{"documentation", "The Operation being invoked."}, new URI[0]);
		this.addAnnotation(this.callEventEClass, source,
				new String[]{"documentation",
						"A CallEvent models the receipt by an object of a message invoking a call of an Operation."},
				new URI[0]);
		this.addAnnotation(this.getCallEvent_Operation(), source,
				new String[]{"documentation", "Designates the Operation whose invocation raised the CalEvent."},
				new URI[0]);
		this.addAnnotation(this.stateInvariantEClass, source, new String[]{"documentation",
				"A StateInvariant is a runtime constraint on the participants of the Interaction. It may be used to specify a variety of different kinds of Constraints, such as values of Attributes or Variables, internal or external States, and so on. A StateInvariant is an InteractionFragment and it is placed on a Lifeline."},
				new URI[0]);
		this.addAnnotation(this.getStateInvariant_Covered(), source,
				new String[]{"documentation", "References the Lifeline on which the StateInvariant appears."},
				new URI[0]);
		this.addAnnotation(this.getStateInvariant_Invariant(), source,
				new String[]{"documentation", "A Constraint that should hold at runtime for this StateInvariant."},
				new URI[0]);
		this.addAnnotation(this.transitionKindEEnum, source, new String[]{"documentation",
				"TransitionKind is an Enumeration type used to differentiate the various kinds of Transitions."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.transitionKindEEnum.getELiterals().get(0), source, new String[]{
				"documentation",
				"Implies that the Transition, if triggered, occurs without exiting or entering the source State (i.e., it does not cause a state change). This means that the entry or exit condition of the source State will not be invoked. An internal Transition can be taken even if the SateMachine is in one or more Regions nested within the associated State."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.transitionKindEEnum.getELiterals().get(1), source, new String[]{
				"documentation",
				"Implies that the Transition, if triggered, will not exit the composite (source) State, but it will exit and re-enter any state within the composite State that is in the current state configuration."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.transitionKindEEnum.getELiterals().get(2), source,
				new String[]{"documentation",
						"Implies that the Transition, if triggered, will exit the composite (source) State."},
				new URI[0]);
		this.addAnnotation(this.objectNodeOrderingKindEEnum, source, new String[]{"documentation",
				"ObjectNodeOrderingKind is an enumeration indicating queuing order for offering the tokens held by an ObjectNode."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.objectNodeOrderingKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "Indicates that tokens are unordered."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.objectNodeOrderingKindEEnum.getELiterals().get(1), source,
				new String[]{"documentation", "Indicates that tokens are ordered."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.objectNodeOrderingKindEEnum.getELiterals().get(2), source,
				new String[]{"documentation", "Indicates that tokens are queued in a last in, first out manner."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.objectNodeOrderingKindEEnum.getELiterals().get(3), source,
				new String[]{"documentation", "Indicates that tokens are queued in a first in, first out manner."},
				new URI[0]);
		this.addAnnotation(this.exceptionHandlerEClass, source, new String[]{"documentation",
				"An ExceptionHandler is an Element that specifies a handlerBody ExecutableNode to execute in case the specified exception occurs during the execution of the protected ExecutableNode."},
				new URI[0]);
		this.addAnnotation(this.getExceptionHandler_ExceptionType(), source, new String[]{"documentation",
				"The Classifiers whose instances the ExceptionHandler catches as exceptions. If an exception occurs whose type is any exceptionType, the ExceptionHandler catches the exception and executes the handlerBody."},
				new URI[0]);
		this.addAnnotation(this.getExceptionHandler_HandlerBody(), source,
				new String[]{"documentation",
						"An ExecutableNode that is executed if the ExceptionHandler catches an exception."},
				new URI[0]);
		this.addAnnotation(this.getExceptionHandler_ProtectedNode(), source, new String[]{"documentation",
				"The ExecutableNode protected by the ExceptionHandler. If an exception propagates out of the protectedNode and has a type matching one of the exceptionTypes, then it is caught by this ExceptionHandler."},
				new URI[0]);
		this.addAnnotation(this.getExceptionHandler_ExceptionInput(), source, new String[]{"documentation",
				"An ObjectNode within the handlerBody. When the ExceptionHandler catches an exception, the exception token is placed on this ObjectNode, causing the handlerBody to execute."},
				new URI[0]);
		this.addAnnotation(this.sendObjectActionEClass, source, new String[]{"documentation",
				"A SendObjectAction is an InvocationAction that transmits an input object to the target object, which is handled as a request message by the target object. The requestor continues execution immediately after the object is sent out and cannot receive reply values."},
				new URI[0]);
		this.addAnnotation(this.getSendObjectAction_Request(), source, new String[]{"documentation",
				"The request object, which is transmitted to the target object. The object may be copied in transmission, so identity might not be preserved."},
				new URI[0]);
		this.addAnnotation(this.getSendObjectAction_Target(), source,
				new String[]{"documentation", "The target object to which the object is sent."}, new URI[0]);
		this.addAnnotation(this.addStructuralFeatureValueActionEClass, source, new String[]{"documentation",
				"An AddStructuralFeatureValueAction is a WriteStructuralFeatureAction for adding values to a StructuralFeature."},
				new URI[0]);
		this.addAnnotation(this.getAddStructuralFeatureValueAction_ReplaceAll(), source, new String[]{"documentation",
				"Specifies whether existing values of the StructuralFeature should be removed before adding the new value."},
				new URI[0]);
		this.addAnnotation(this.getAddStructuralFeatureValueAction_InsertAt(), source, new String[]{"documentation",
				"The InputPin that gives the position at which to insert the value in an ordered StructuralFeature. The type of the insertAt InputPin is UnlimitedNatural, but the value cannot be zero. It is omitted for unordered StructuralFeatures."},
				new URI[0]);
		this.addAnnotation(this.removeStructuralFeatureValueActionEClass, source, new String[]{"documentation",
				"A RemoveStructuralFeatureValueAction is a WriteStructuralFeatureAction that removes values from a StructuralFeature."},
				new URI[0]);
		this.addAnnotation(this.getRemoveStructuralFeatureValueAction_RemoveDuplicates(), source,
				new String[]{"documentation",
						"Specifies whether to remove duplicates of the value in nonunique StructuralFeatures."},
				new URI[0]);
		this.addAnnotation(this.getRemoveStructuralFeatureValueAction_RemoveAt(), source, new String[]{"documentation",
				"An InputPin that provides the position of an existing value to remove in ordered, nonunique structural features. The type of the removeAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited."},
				new URI[0]);
		this.addAnnotation(this.startObjectBehaviorActionEClass, source, new String[]{"documentation",
				"A StartObjectBehaviorAction is an InvocationAction that starts the execution either of a directly instantiated Behavior or of the classifierBehavior of an object. Argument values may be supplied for the input Parameters of the Behavior. If the Behavior is invoked synchronously, then output values may be obtained for output Parameters."},
				new URI[0]);
		this.addAnnotation(this.getStartObjectBehaviorAction_Object(), source, new String[]{"documentation",
				"An InputPin that holds the object that is either a Behavior to be started or has a classifierBehavior to be started."},
				new URI[0]);
		this.addAnnotation(this.removeVariableValueActionEClass, source,
				new String[]{"documentation",
						"A RemoveVariableValueAction is a WriteVariableAction that removes values from a Variables."},
				new URI[0]);
		this.addAnnotation(this.getRemoveVariableValueAction_RemoveDuplicates(), source, new String[]{"documentation",
				"Specifies whether to remove duplicates of the value in nonunique Variables."}, new URI[0]);
		this.addAnnotation(this.getRemoveVariableValueAction_RemoveAt(), source, new String[]{"documentation",
				"An InputPin that provides the position of an existing value to remove in ordered, nonunique Variables. The type of the removeAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited."},
				new URI[0]);
		this.addAnnotation(this.writeVariableActionEClass, source,
				new String[]{"documentation",
						"WriteVariableAction is an abstract class for VariableActions that change Variable values."},
				new URI[0]);
		this.addAnnotation(this.getWriteVariableAction_Value(), source, new String[]{"documentation",
				"The InputPin that gives the value to be added or removed from the Variable."}, new URI[0]);
		this.addAnnotation(this.destroyObjectActionEClass, source,
				new String[]{"documentation", "A DestroyObjectAction is an Action that destroys objects."}, new URI[0]);
		this.addAnnotation(this.getDestroyObjectAction_DestroyLinks(), source, new String[]{"documentation",
				"Specifies whether links in which the object participates are destroyed along with the object."},
				new URI[0]);
		this.addAnnotation(this.getDestroyObjectAction_DestroyOwnedObjects(), source, new String[]{"documentation",
				"Specifies whether objects owned by the object (via composition) are destroyed along with the object."},
				new URI[0]);
		this.addAnnotation(this.getDestroyObjectAction_Target(), source,
				new String[]{"documentation", "The InputPin providing the object to be destroyed."}, new URI[0]);
		this.addAnnotation(this.reclassifyObjectActionEClass, source,
				new String[]{"documentation",
						"A ReclassifyObjectAction is an Action that changes the Classifiers that classify an object."},
				new URI[0]);
		this.addAnnotation(this.getReclassifyObjectAction_ReplaceAll(), source,
				new String[]{"documentation",
						"Specifies whether existing Classifiers should be removed before adding the new Classifiers."},
				new URI[0]);
		this.addAnnotation(this.getReclassifyObjectAction_NewClassifier(), source, new String[]{"documentation",
				"A set of Classifiers to be added to the Classifiers of the given object."}, new URI[0]);
		this.addAnnotation(this.getReclassifyObjectAction_OldClassifier(), source, new String[]{"documentation",
				"A set of Classifiers to be removed from the Classifiers of the given object."}, new URI[0]);
		this.addAnnotation(this.getReclassifyObjectAction_Object(), source,
				new String[]{"documentation", "The InputPin that holds the object to be reclassified."}, new URI[0]);
		this.addAnnotation(this.raiseExceptionActionEClass, source, new String[]{"documentation",
				"A RaiseExceptionAction is an Action that causes an exception to occur. The input value becomes the exception object."},
				new URI[0]);
		this.addAnnotation(this.getRaiseExceptionAction_Exception(), source,
				new String[]{"documentation", "An InputPin whose value becomes the exception object."}, new URI[0]);
		this.addAnnotation(this.linkEndDestructionDataEClass, source, new String[]{"documentation",
				"LinkEndDestructionData is LinkEndData used to provide values for one end of a link to be destroyed by a DestroyLinkAction."},
				new URI[0]);
		this.addAnnotation(this.getLinkEndDestructionData_DestroyDuplicates(), source,
				new String[]{"documentation",
						"Specifies whether to destroy duplicates of the value in nonunique Association ends."},
				new URI[0]);
		this.addAnnotation(this.getLinkEndDestructionData_DestroyAt(), source, new String[]{"documentation",
				"The InputPin that provides the position of an existing link to be destroyed in an ordered, nonunique Association end. The type of the destroyAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited."},
				new URI[0]);
		this.addAnnotation(this.destroyLinkActionEClass, source,
				new String[]{"documentation",
						"A DestroyLinkAction is a WriteLinkAction that destroys links (including link objects)."},
				new URI[0]);
		this.addAnnotation(this.getDestroyLinkAction_EndData(), source,
				new String[]{"documentation",
						"The LinkEndData that the values of the Association ends for the links to be destroyed."},
				new URI[0]);
		this.addAnnotation(this.addVariableValueActionEClass, source,
				new String[]{"documentation",
						"An AddVariableValueAction is a WriteVariableAction for adding values to a Variable."},
				new URI[0]);
		this.addAnnotation(this.getAddVariableValueAction_ReplaceAll(), source, new String[]{"documentation",
				"Specifies whether existing values of the Variable should be removed before adding the new value."},
				new URI[0]);
		this.addAnnotation(this.getAddVariableValueAction_InsertAt(), source, new String[]{"documentation",
				"The InputPin that gives the position at which to insert a new value or move an existing value in ordered Variables. The type of the insertAt InputPin is UnlimitedNatural, but the value cannot be zero. It is omitted for unordered Variables."},
				new URI[0]);
		this.addAnnotation(this.startClassifierBehaviorActionEClass, source, new String[]{"documentation",
				"A StartClassifierBehaviorAction is an Action that starts the classifierBehavior of the input object."},
				new URI[0]);
		this.addAnnotation(this.getStartClassifierBehaviorAction_Object(), source, new String[]{"documentation",
				"The InputPin that holds the object whose classifierBehavior is to be started."}, new URI[0]);
		this.addAnnotation(this.interruptibleActivityRegionEClass, source, new String[]{"documentation",
				"An InterruptibleActivityRegion is an ActivityGroup that supports the termination of tokens flowing in the portions of an activity within it."},
				new URI[0]);
		this.addAnnotation(this.getInterruptibleActivityRegion_Node(), source, new String[]{"documentation",
				"ActivityNodes immediately contained in the InterruptibleActivityRegion."}, new URI[0]);
		this.addAnnotation(this.getInterruptibleActivityRegion_InterruptingEdge(), source, new String[]{"documentation",
				"The ActivityEdges leaving the InterruptibleActivityRegion on which a traversing token will result in the termination of other tokens flowing in the InterruptibleActivityRegion."},
				new URI[0]);
		this.addAnnotation(this.sequenceNodeEClass, source, new String[]{"documentation",
				"A SequenceNode is a StructuredActivityNode that executes a sequence of ExecutableNodes in order."},
				new URI[0]);
		this.addAnnotation(this.getSequenceNode_ExecutableNode(), source,
				new String[]{"documentation", "The ordered set of ExecutableNodes to be sequenced."}, new URI[0]);
		this.addAnnotation(this.actionInputPinEClass, source, new String[]{"documentation",
				"An ActionInputPin is a kind of InputPin that executes an Action to determine the values to input to another Action."},
				new URI[0]);
		this.addAnnotation(this.getActionInputPin_FromAction(), source,
				new String[]{"documentation", "The Action used to provide the values of the ActionInputPin."},
				new URI[0]);
		this.addAnnotation(this.actionExecutionSpecificationEClass, source, new String[]{"documentation",
				"An ActionExecutionSpecification is a kind of ExecutionSpecification representing the execution of an Action."},
				new URI[0]);
		this.addAnnotation(this.getActionExecutionSpecification_Action(), source,
				new String[]{"documentation", "Action whose execution is occurring."}, new URI[0]);
		this.addAnnotation(this.executionSpecificationEClass, source, new String[]{"documentation",
				"An ExecutionSpecification is a specification of the execution of a unit of Behavior or Action within the Lifeline. The duration of an ExecutionSpecification is represented by two OccurrenceSpecifications, the start OccurrenceSpecification and the finish OccurrenceSpecification."},
				new URI[0]);
		this.addAnnotation(this.getExecutionSpecification_Finish(), source,
				new String[]{"documentation",
						"References the OccurrenceSpecification that designates the finish of the Action or Behavior."},
				new URI[0]);
		this.addAnnotation(this.getExecutionSpecification_Start(), source,
				new String[]{"documentation",
						"References the OccurrenceSpecification that designates the start of the Action or Behavior."},
				new URI[0]);
		this.addAnnotation(this.occurrenceSpecificationEClass, source, new String[]{"documentation",
				"An OccurrenceSpecification is the basic semantic unit of Interactions. The sequences of occurrences specified by them are the meanings of Interactions."},
				new URI[0]);
		this.addAnnotation(this.getOccurrenceSpecification_Covered(), source,
				new String[]{"documentation", "References the Lifeline on which the OccurrenceSpecification appears."},
				new URI[0]);
		this.addAnnotation(this.getOccurrenceSpecification_ToAfter(), source, new String[]{"documentation",
				"References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification."},
				new URI[0]);
		this.addAnnotation(this.getOccurrenceSpecification_ToBefore(), source, new String[]{"documentation",
				"References the GeneralOrderings that specify EventOcurrences that must occur before this OccurrenceSpecification."},
				new URI[0]);
		this.addAnnotation(this.generalOrderingEClass, source, new String[]{"documentation",
				"A GeneralOrdering represents a binary relation between two OccurrenceSpecifications, to describe that one OccurrenceSpecification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of OccurrenceSpecifications that may otherwise not have a specified order."},
				new URI[0]);
		this.addAnnotation(this.getGeneralOrdering_After(), source, new String[]{"documentation",
				"The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced by before."},
				new URI[0]);
		this.addAnnotation(this.getGeneralOrdering_Before(), source, new String[]{"documentation",
				"The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced by after."},
				new URI[0]);
		this.addAnnotation(this.executionOccurrenceSpecificationEClass, source, new String[]{"documentation",
				"An ExecutionOccurrenceSpecification represents moments in time at which Actions or Behaviors start or finish."},
				new URI[0]);
		this.addAnnotation(this.getExecutionOccurrenceSpecification_Execution(), source, new String[]{"documentation",
				"References the execution specification describing the execution that is started or finished at this execution event."},
				new URI[0]);
		this.addAnnotation(this.partDecompositionEClass, source, new String[]{"documentation",
				"A PartDecomposition is a description of the internal Interactions of one Lifeline relative to an Interaction."},
				new URI[0]);
		this.addAnnotation(this.valuePinEClass, source,
				new String[]{"documentation",
						"A ValuePin is an InputPin that provides a value by evaluating a ValueSpecification."},
				new URI[0]);
		this.addAnnotation(this.getValuePin_Value(), source,
				new String[]{"documentation",
						"The ValueSpecification that is evaluated to obtain the value that the ValuePin will provide."},
				new URI[0]);
		this.addAnnotation(this.intervalEClass, source,
				new String[]{"documentation", "An Interval defines the range between two ValueSpecifications."},
				new URI[0]);
		this.addAnnotation(this.getInterval_Min(), source, new String[]{"documentation",
				"Refers to the ValueSpecification denoting the minimum value of the range."}, new URI[0]);
		this.addAnnotation(this.getInterval_Max(), source, new String[]{"documentation",
				"Refers to the ValueSpecification denoting the maximum value of the range."}, new URI[0]);
		this.addAnnotation(this.intervalConstraintEClass, source, new String[]{"documentation",
				"An IntervalConstraint is a Constraint that is specified by an Interval."}, new URI[0]);
		this.addAnnotation(this.getIntervalConstraint_Specification(), source,
				new String[]{"documentation", "The Interval that specifies the condition of the IntervalConstraint."},
				new URI[0]);
		this.addAnnotation(this.changeEventEClass, source,
				new String[]{"documentation",
						"A ChangeEvent models a change in the system configuration that makes a condition true."},
				new URI[0]);
		this.addAnnotation(this.getChangeEvent_ChangeExpression(), source, new String[]{"documentation",
				"A Boolean-valued ValueSpecification that will result in a ChangeEvent whenever its value changes from false to true."},
				new URI[0]);
		this.addAnnotation(this.joinNodeEClass, source,
				new String[]{"documentation", "A JoinNode is a ControlNode that synchronizes multiple flows."},
				new URI[0]);
		this.addAnnotation(this.getJoinNode_CombineDuplicate(), source, new String[]{"documentation",
				"Indicates whether incoming tokens having objects with the same identity are combined into one by the JoinNode."},
				new URI[0]);
		this.addAnnotation(this.getJoinNode_JoinSpec(), source, new String[]{"documentation",
				"A ValueSpecification giving the condition under which the JoinNode will offer a token on its outgoing ActivityEdge. If no joinSpec is specified, then the JoinNode will offer an outgoing token if tokens are offered on all of its incoming ActivityEdges (an \"and\" condition)."},
				new URI[0]);
		this.addAnnotation(this.controlNodeEClass, source,
				new String[]{"documentation",
						"A ControlNode is an abstract ActivityNode that coordinates flows in an Activity."},
				new URI[0]);
		this.addAnnotation(this.durationEClass, source, new String[]{"documentation",
				"A Duration is a ValueSpecification that specifies the temporal distance between two time instants."},
				new URI[0]);
		this.addAnnotation(this.getDuration_Observation(), source,
				new String[]{"documentation",
						"Refers to the Observations that are involved in the computation of the Duration value"},
				new URI[0]);
		this.addAnnotation(this.getDuration_Expr(), source,
				new String[]{"documentation", "A ValueSpecification that evaluates to the value of the Duration."},
				new URI[0]);
		this.addAnnotation(this.observationEClass, source, new String[]{"documentation",
				"Observation specifies a value determined by observing an event or events that occur relative to other model Elements."},
				new URI[0]);
		this.addAnnotation(this.timeExpressionEClass, source,
				new String[]{"documentation", "A TimeExpression is a ValueSpecification that represents a time value."},
				new URI[0]);
		this.addAnnotation(this.getTimeExpression_Expr(), source, new String[]{"documentation",
				"A ValueSpecification that evaluates to the value of the TimeExpression."}, new URI[0]);
		this.addAnnotation(this.getTimeExpression_Observation(), source,
				new String[]{"documentation",
						"Refers to the Observations that are involved in the computation of the TimeExpression value."},
				new URI[0]);
		this.addAnnotation(this.timeIntervalEClass, source,
				new String[]{"documentation", "A TimeInterval defines the range between two TimeExpressions."},
				new URI[0]);
		this.addAnnotation(this.getTimeInterval_Max(), source,
				new String[]{"documentation", "Refers to the TimeExpression denoting the maximum value of the range."},
				new URI[0]);
		this.addAnnotation(this.getTimeInterval_Min(), source,
				new String[]{"documentation", "Refers to the TimeExpression denoting the minimum value of the range."},
				new URI[0]);
		this.addAnnotation(this.timeConstraintEClass, source,
				new String[]{"documentation", "A TimeConstraint is a Constraint that refers to a TimeInterval."},
				new URI[0]);
		this.addAnnotation(this.getTimeConstraint_Specification(), source,
				new String[]{"documentation", "TheTimeInterval constraining the duration."}, new URI[0]);
		this.addAnnotation(this.getTimeConstraint_FirstEvent(), source, new String[]{"documentation",
				"The value of firstEvent is related to the constrainedElement. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the constrainedElement. If firstEvent is false, then the corresponding observation event is the last time instant the execution is within the constrainedElement."},
				new URI[0]);
		this.addAnnotation(this.timeEventEClass, source,
				new String[]{"documentation", "A TimeEvent is an Event that occurs at a specific point in time."},
				new URI[0]);
		this.addAnnotation(this.getTimeEvent_Relative(), source, new String[]{"documentation",
				"Specifies whether the TimeEvent is specified as an absolute or relative time."}, new URI[0]);
		this.addAnnotation(this.getTimeEvent_When(), source,
				new String[]{"documentation", "Specifies the time of the TimeEvent."}, new URI[0]);
		this.addAnnotation(this.durationIntervalEClass, source,
				new String[]{"documentation", "A DurationInterval defines the range between two Durations."},
				new URI[0]);
		this.addAnnotation(this.getDurationInterval_Max(), source,
				new String[]{"documentation", "Refers to the Duration denoting the maximum value of the range."},
				new URI[0]);
		this.addAnnotation(this.getDurationInterval_Min(), source,
				new String[]{"documentation", "Refers to the Duration denoting the minimum value of the range."},
				new URI[0]);
		this.addAnnotation(this.durationConstraintEClass, source, new String[]{"documentation",
				"A DurationConstraint is a Constraint that refers to a DurationInterval."}, new URI[0]);
		this.addAnnotation(this.getDurationConstraint_Specification(), source,
				new String[]{"documentation", "The DurationInterval constraining the duration."}, new URI[0]);
		this.addAnnotation(this.getDurationConstraint_FirstEvent(), source, new String[]{"documentation",
				"The value of firstEvent[i] is related to constrainedElement[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters constrainedElement[i]. If firstEvent[i] is false, then the corresponding observation event is the last time instant the execution is within constrainedElement[i]."},
				new URI[0]);
		this.addAnnotation(this.expressionEClass, source, new String[]{"documentation",
				"An Expression represents a node in an expression tree, which may be non-terminal or terminal. It defines a symbol, and has a possibly empty sequence of operands that are ValueSpecifications. It denotes a (possibly empty) set of values when evaluated in a context."},
				new URI[0]);
		this.addAnnotation(this.getExpression_Symbol(), source,
				new String[]{"documentation", "The symbol associated with this node in the expression tree."},
				new URI[0]);
		this.addAnnotation(this.getExpression_Operand(), source,
				new String[]{"documentation", "Specifies a sequence of operand ValueSpecifications."}, new URI[0]);
		this.addAnnotation(this.parameterDirectionKindEEnum, source, new String[]{"documentation",
				"ParameterDirectionKind is an Enumeration that defines literals used to specify direction of parameters."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterDirectionKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "Indicates that Parameter values are passed in by the caller. "},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterDirectionKindEEnum.getELiterals().get(1), source, new String[]{
				"documentation",
				"Indicates that Parameter values are passed in by the caller and (possibly different) values passed out to the caller."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterDirectionKindEEnum.getELiterals().get(2), source,
				new String[]{"documentation", "Indicates that Parameter values are passed out to the caller."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterDirectionKindEEnum.getELiterals().get(3), source, new String[]{
				"documentation", "Indicates that Parameter values are passed as return values back to the caller."},
				new URI[0]);
		this.addAnnotation(this.parameterEffectKindEEnum, source, new String[]{"documentation",
				"ParameterEffectKind is an Enumeration that indicates the effect of a Behavior on values passed in or out of its parameters."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterEffectKindEEnum.getELiterals().get(0), source,
				new String[]{"documentation", "Indicates that the behavior creates values."}, new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterEffectKindEEnum.getELiterals().get(1), source, new String[]{
				"documentation",
				"Indicates objects that are values of the parameter have values of their properties, or links in which they participate, or their classifiers retrieved during executions of the behavior."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterEffectKindEEnum.getELiterals().get(2), source, new String[]{
				"documentation",
				"Indicates objects that are values of the parameter have values of their properties, or links in which they participate, or their classification changed during executions of the behavior."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.parameterEffectKindEEnum.getELiterals().get(3), source, new String[]{
				"documentation",
				"Indicates objects that are values of the parameter do not exist after executions of the behavior are finished."},
				new URI[0]);
		this.addAnnotation(this.activityParameterNodeEClass, source, new String[]{"documentation",
				"An ActivityParameterNode is an ObjectNode for accepting values from the input Parameters or providing values to the output Parameters of an Activity."},
				new URI[0]);
		this.addAnnotation(this.getActivityParameterNode_Parameter(), source,
				new String[]{"documentation",
						"The Parameter for which the ActivityParameterNode will be accepting or providing values."},
				new URI[0]);
		this.addAnnotation(this.objectFlowEClass, source, new String[]{"documentation",
				"An ObjectFlow is an ActivityEdge that is traversed by object tokens that may hold values. Object flows also support multicast/receive, token selection from object nodes, and transformation of tokens."},
				new URI[0]);
		this.addAnnotation(this.getObjectFlow_Multicast(), source, new String[]{"documentation",
				"Indicates whether the objects in the ObjectFlow are passed by multicasting."}, new URI[0]);
		this.addAnnotation(this.getObjectFlow_Multireceive(), source, new String[]{"documentation",
				"Indicates whether the objects in the ObjectFlow are gathered from respondents to multicasting."},
				new URI[0]);
		this.addAnnotation(this.getObjectFlow_Selection(), source,
				new String[]{"documentation", "A Behavior used to select tokens from a source ObjectNode."},
				new URI[0]);
		this.addAnnotation(this.getObjectFlow_Transformation(), source,
				new String[]{"documentation",
						"A Behavior used to change or replace object tokens flowing along the ObjectFlow."},
				new URI[0]);
		this.addAnnotation(this.decisionNodeEClass, source, new String[]{"documentation",
				"A DecisionNode is a ControlNode that chooses between outgoing ActivityEdges for the routing of tokens."},
				new URI[0]);
		this.addAnnotation(this.getDecisionNode_DecisionInput(), source, new String[]{"documentation",
				"A Behavior that is executed to provide an input to guard ValueSpecifications on ActivityEdges outgoing from the DecisionNode."},
				new URI[0]);
		this.addAnnotation(this.getDecisionNode_DecisionInputFlow(), source, new String[]{"documentation",
				"An additional ActivityEdge incoming to the DecisionNode that provides a decision input value for the guards ValueSpecifications on ActivityEdges outgoing from the DecisionNode."},
				new URI[0]);
		this.addAnnotation(this.behaviorExecutionSpecificationEClass, source, new String[]{"documentation",
				"A BehaviorExecutionSpecification is a kind of ExecutionSpecification representing the execution of a Behavior."},
				new URI[0]);
		this.addAnnotation(this.getBehaviorExecutionSpecification_Behavior(), source,
				new String[]{"documentation", "Behavior whose execution is occurring."}, new URI[0]);
		this.addAnnotation(this.callBehaviorActionEClass, source, new String[]{"documentation",
				"A CallBehaviorAction is a CallAction that invokes a Behavior directly. The argument values of the CallBehaviorAction are passed on the input Parameters of the invoked Behavior. If the call is synchronous, the execution of the CallBehaviorAction waits until the execution of the invoked Behavior completes and the values of output Parameters of the Behavior are placed on the result OutputPins. If the call is asynchronous, the CallBehaviorAction completes immediately and no results values can be provided."},
				new URI[0]);
		this.addAnnotation(this.getCallBehaviorAction_Behavior(), source,
				new String[]{"documentation", "The Behavior being invoked."}, new URI[0]);
		this.addAnnotation(this.extensionEClass, source, new String[]{"documentation",
				"An extension is used to indicate that the properties of a metaclass are extended through a stereotype, and gives the ability to flexibly add (and later remove) stereotypes to classes."},
				new URI[0]);
		this.addAnnotation(this.getExtension_OwnedEnd(), source,
				new String[]{"documentation", "References the end of the extension that is typed by a Stereotype."},
				new URI[0]);
		this.addAnnotation(this.getExtension_Required(), source, new String[]{"documentation",
				"Indicates whether an instance of the extending stereotype must be created when an instance of the extended class is created. The attribute value is derived from the value of the lower property of the ExtensionEnd referenced by Extension::ownedEnd; a lower value of 1 means that isRequired is true, but otherwise it is false. Since the default value of ExtensionEnd::lower is 0, the default value of isRequired is false."},
				new URI[0]);
		this.addAnnotation(this.getExtension_Metaclass(), source, new String[]{"documentation",
				"References the Class that is extended through an Extension. The property is derived from the type of the memberEnd that is not the ownedEnd."},
				new URI[0]);
		this.addAnnotation(this.extensionEndEClass, source, new String[]{"documentation",
				"An extension end is used to tie an extension to a stereotype when extending a metaclass.\nThe default multiplicity of an extension end is 0..1."},
				new URI[0]);
		this.addAnnotation(this.getExtensionEnd_Lower(), source, new String[]{"documentation",
				"This redefinition changes the default multiplicity of association ends, since model elements are usually extended by 0 or 1 instance of the extension stereotype."},
				new URI[0]);
		this.addAnnotation(this.getExtensionEnd_Type(), source, new String[]{"documentation",
				"References the type of the ExtensionEnd. Note that this association restricts the possible types of an ExtensionEnd to only be Stereotypes."},
				new URI[0]);
		this.addAnnotation(this.imageEClass, source,
				new String[]{"documentation", "Physical definition of a graphical image."}, new URI[0]);
		this.addAnnotation(this.getImage_Content(), source, new String[]{"documentation",
				"This contains the serialization of the image according to the format. The value could represent a bitmap, image such as a GIF file, or drawing 'instructions' using a standard such as Scalable Vector Graphic (SVG) (which is XML based)."},
				new URI[0]);
		this.addAnnotation(this.getImage_Format(), source, new String[]{"documentation",
				"This indicates the format of the content, which is how the string content should be interpreted. The following values are reserved: SVG, GIF, PNG, JPG, WMF, EMF, BMP. In addition the prefix 'MIME: ' is also reserved. This option can be used as an alternative to express the reserved values above, for example \"SVG\" could instead be expressed as \"MIME: image/svg+xml\"."},
				new URI[0]);
		this.addAnnotation(this.getImage_Location(), source, new String[]{"documentation",
				"This contains a location that can be used by a tool to locate the image as an alternative to embedding it in the stereotype."},
				new URI[0]);
		this.addAnnotation(this.packageMergeEClass, source, new String[]{"documentation",
				"A package merge defines how the contents of one package are extended by the contents of another package."},
				new URI[0]);
		this.addAnnotation(this.getPackageMerge_MergedPackage(), source,
				new String[]{"documentation",
						"References the Package that is to be merged with the receiving package of the PackageMerge."},
				new URI[0]);
		this.addAnnotation(this.getPackageMerge_ReceivingPackage(), source, new String[]{"documentation",
				"References the Package that is being extended with the contents of the merged package of the PackageMerge."},
				new URI[0]);
		this.addAnnotation(this.profileApplicationEClass, source,
				new String[]{"documentation",
						"A profile application is used to show which profiles have been applied to a package."},
				new URI[0]);
		this.addAnnotation(this.getProfileApplication_AppliedProfile(), source,
				new String[]{"documentation",
						"References the Profiles that are applied to a Package through this ProfileApplication."},
				new URI[0]);
		this.addAnnotation(this.getProfileApplication_Strict(), source, new String[]{"documentation",
				"Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied."},
				new URI[0]);
		this.addAnnotation(this.getProfileApplication_ApplyingPackage(), source,
				new String[]{"documentation", "The package that owns the profile application."}, new URI[0]);
		this.addAnnotation(this.packageImportEClass, source, new String[]{"documentation",
				"A PackageImport is a Relationship that imports all the non-private members of a Package into the Namespace owning the PackageImport, so that those Elements may be referred to by their unqualified names in the importingNamespace."},
				new URI[0]);
		this.addAnnotation(this.getPackageImport_ImportingNamespace(), source,
				new String[]{"documentation", "Specifies the Namespace that imports the members from a Package."},
				new URI[0]);
		this.addAnnotation(this.getPackageImport_Visibility(), source, new String[]{"documentation",
				"Specifies the visibility of the imported PackageableElements within the importingNamespace, i.e., whether imported Elements will in turn be visible to other Namespaces. If the PackageImport is public, the imported Elements will be visible outside the importingNamespace, while, if the PackageImport is private, they will not."},
				new URI[0]);
		this.addAnnotation(this.getPackageImport_ImportedPackage(), source,
				new String[]{"documentation", "Specifies the Package whose members are imported into a Namespace."},
				new URI[0]);
		this.addAnnotation(this.generalizationEClass, source, new String[]{"documentation",
				"A Generalization is a taxonomic relationship between a more general Classifier and a more specific Classifier. Each instance of the specific Classifier is also an instance of the general Classifier. The specific Classifier inherits the features of the more general Classifier. A Generalization is owned by the specific Classifier."},
				new URI[0]);
		this.addAnnotation(this.getGeneralization_General(), source,
				new String[]{"documentation", "The general classifier in the Generalization relationship."},
				new URI[0]);
		this.addAnnotation(this.getGeneralization_GeneralizationSet(), source, new String[]{"documentation",
				"Represents a set of instances of Generalization.  A Generalization may appear in many GeneralizationSets."},
				new URI[0]);
		this.addAnnotation(this.getGeneralization_Substitutable(), source, new String[]{"documentation",
				"Indicates whether the specific Classifier can be used wherever the general Classifier can be used. If true, the execution traces of the specific Classifier shall be a superset of the execution traces of the general Classifier. If false, there is no such constraint on execution traces. If unset, the modeler has not stated whether there is such a constraint or not."},
				new URI[0]);
		this.addAnnotation(this.getGeneralization_Specific(), source,
				new String[]{"documentation", "The specializing Classifier in the Generalization relationship."},
				new URI[0]);
		this.addAnnotation(this.generalizationSetEClass, source, new String[]{"documentation",
				"A GeneralizationSet is a PackageableElement whose instances represent sets of Generalization relationships."},
				new URI[0]);
		this.addAnnotation(this.getGeneralizationSet_Covering(), source, new String[]{"documentation",
				"Indicates (via the associated Generalizations) whether or not the set of specific Classifiers are covering for a particular general classifier. When isCovering is true, every instance of a particular general Classifier is also an instance of at least one of its specific Classifiers for the GeneralizationSet. When isCovering is false, there are one or more instances of the particular general Classifier that are not instances of at least one of its specific Classifiers defined for the GeneralizationSet."},
				new URI[0]);
		this.addAnnotation(this.getGeneralizationSet_Disjoint(), source, new String[]{"documentation",
				"Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty."},
				new URI[0]);
		this.addAnnotation(this.getGeneralizationSet_Powertype(), source, new String[]{"documentation",
				"Designates the Classifier that is defined as the power type for the associated GeneralizationSet, if there is one."},
				new URI[0]);
		this.addAnnotation(this.getGeneralizationSet_Generalization(), source,
				new String[]{"documentation",
						"Designates the instances of Generalization that are members of this GeneralizationSet."},
				new URI[0]);
		this.addAnnotation(this.redefinableTemplateSignatureEClass, source, new String[]{"documentation",
				"A RedefinableTemplateSignature supports the addition of formal template parameters in a specialization of a template classifier."},
				new URI[0]);
		this.addAnnotation(this.getRedefinableTemplateSignature_ExtendedSignature(), source,
				new String[]{"documentation", "The signatures extended by this RedefinableTemplateSignature."},
				new URI[0]);
		this.addAnnotation(this.getRedefinableTemplateSignature_InheritedParameter(), source,
				new String[]{"documentation", "The formal template parameters of the extended signatures."},
				new URI[0]);
		this.addAnnotation(this.getRedefinableTemplateSignature_Classifier(), source,
				new String[]{"documentation", "The Classifier that owns this RedefinableTemplateSignature."},
				new URI[0]);
		this.addAnnotation(this.substitutionEClass, source, new String[]{"documentation",
				"A substitution is a relationship between two classifiers signifying that the substituting classifier complies with the contract specified by the contract classifier. This implies that instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected."},
				new URI[0]);
		this.addAnnotation(this.getSubstitution_Contract(), source,
				new String[]{"documentation", "The contract with which the substituting classifier complies."},
				new URI[0]);
		this.addAnnotation(this.getSubstitution_SubstitutingClassifier(), source, new String[]{"documentation",
				"Instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected."},
				new URI[0]);
		this.addAnnotation(this.classifierTemplateParameterEClass, source,
				new String[]{"documentation",
						"A ClassifierTemplateParameter exposes a Classifier as a formal template parameter."},
				new URI[0]);
		this.addAnnotation(this.getClassifierTemplateParameter_ParameteredElement(), source,
				new String[]{"documentation", "The Classifier exposed by this ClassifierTemplateParameter."},
				new URI[0]);
		this.addAnnotation(this.getClassifierTemplateParameter_AllowSubstitutable(), source, new String[]{
				"documentation",
				"Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter."},
				new URI[0]);
		this.addAnnotation(this.getClassifierTemplateParameter_ConstrainingClassifier(), source, new String[]{
				"documentation",
				"The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any Classifier that is compatible with this constraining Classifier can be substituted; otherwise, it must be either this Classifier or one of its specializations. If this property is empty, there are no constraints on the Classifier that can be used as an argument."},
				new URI[0]);
		this.addAnnotation(this.informationItemEClass, source, new String[]{"documentation",
				"InformationItems represent many kinds of information that can flow from sources to targets in very abstract ways.  They represent the kinds of information that may move within a system, but do not elaborate details of the transferred information.  Details of transferred information are the province of other Classifiers that may ultimately define InformationItems.  Consequently, InformationItems cannot be instantiated and do not themselves have features, generalizations, or associations. An important use of InformationItems is to represent information during early design stages, possibly before the detailed modeling decisions that will ultimately define them have been made. Another purpose of InformationItems is to abstract portions of complex models in less precise, but perhaps more general and communicable, ways. "},
				new URI[0]);
		this.addAnnotation(this.getInformationItem_Represented(), source, new String[]{"documentation",
				"Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers."},
				new URI[0]);
		this.addAnnotation(this.templateParameterSubstitutionEClass, source, new String[]{"documentation",
				"A TemplateParameterSubstitution relates the actual parameter to a formal TemplateParameter as part of a template binding."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameterSubstitution_Actual(), source, new String[]{"documentation",
				"The ParameterableElement that is the actual parameter for this TemplateParameterSubstitution."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameterSubstitution_Formal(), source,
				new String[]{"documentation",
						"The formal TemplateParameter that is associated with this TemplateParameterSubstitution."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameterSubstitution_OwnedActual(), source, new String[]{"documentation",
				"The ParameterableElement that is owned by this TemplateParameterSubstitution as its actual parameter."},
				new URI[0]);
		this.addAnnotation(this.getTemplateParameterSubstitution_TemplateBinding(), source,
				new String[]{"documentation", "The TemplateBinding that owns this TemplateParameterSubstitution."},
				new URI[0]);
		this.addAnnotation(this.instanceValueEClass, source,
				new String[]{"documentation", "An InstanceValue is a ValueSpecification that identifies an instance."},
				new URI[0]);
		this.addAnnotation(this.getInstanceValue_Instance(), source,
				new String[]{"documentation", "The InstanceSpecification that represents the specified value."},
				new URI[0]);
		this.addAnnotation(this.stringExpressionEClass, source, new String[]{"documentation",
				"A StringExpression is an Expression that specifies a String value that is derived by concatenating a sequence of operands with String values or a sequence of subExpressions, some of which might be template parameters."},
				new URI[0]);
		this.addAnnotation(this.getStringExpression_OwningExpression(), source, new String[]{"documentation",
				"The StringExpression of which this StringExpression is a subExpression."}, new URI[0]);
		this.addAnnotation(this.getStringExpression_SubExpression(), source,
				new String[]{"documentation", "The StringExpressions that constitute this StringExpression."},
				new URI[0]);
		this.addAnnotation(this.considerIgnoreFragmentEClass, source, new String[]{"documentation",
				"A ConsiderIgnoreFragment is a kind of CombinedFragment that is used for the consider and ignore cases, which require lists of pertinent Messages to be specified."},
				new URI[0]);
		this.addAnnotation(this.getConsiderIgnoreFragment_Message(), source,
				new String[]{"documentation", "The set of messages that apply to this fragment."}, new URI[0]);
		this.addAnnotation(this.timeObservationEClass, source, new String[]{"documentation",
				"A TimeObservation is a reference to a time instant during an execution. It points out the NamedElement in the model to observe and whether the observation is when this NamedElement is entered or when it is exited."},
				new URI[0]);
		this.addAnnotation(this.getTimeObservation_FirstEvent(), source, new String[]{"documentation",
				"The value of firstEvent is related to the event. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the event Element. If firstEvent is false, then the corresponding observation event is the time instant the execution exits the event Element."},
				new URI[0]);
		this.addAnnotation(this.getTimeObservation_Event(), source, new String[]{"documentation",
				"The TimeObservation is determined by the entering or exiting of the event Element during execution."},
				new URI[0]);
		this.addAnnotation(this.durationObservationEClass, source, new String[]{"documentation",
				"A DurationObservation is a reference to a duration during an execution. It points out the NamedElement(s) in the model to observe and whether the observations are when this NamedElement is entered or when it is exited."},
				new URI[0]);
		this.addAnnotation(this.getDurationObservation_FirstEvent(), source, new String[]{"documentation",
				"The value of firstEvent[i] is related to event[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters event[i]. If firstEvent[i] is false, then the corresponding observation event is the time instant the execution exits event[i]."},
				new URI[0]);
		this.addAnnotation(this.getDurationObservation_Event(), source, new String[]{"documentation",
				"The DurationObservation is determined as the duration between the entering or exiting of a single event Element during execution, or the entering/exiting of one event Element and the entering/exiting of a second."},
				new URI[0]);
		this.addAnnotation(this.connectableElementTemplateParameterEClass, source, new String[]{"documentation",
				"A ConnectableElementTemplateParameter exposes a ConnectableElement as a formal parameter for a template."},
				new URI[0]);
		this.addAnnotation(this.getConnectableElementTemplateParameter_ParameteredElement(), source,
				new String[]{"documentation", "The ConnectableElement for this ConnectableElementTemplateParameter."},
				new URI[0]);
		this.addAnnotation(this.literalIntegerEClass, source,
				new String[]{"documentation", "A LiteralInteger is a specification of an Integer value."}, new URI[0]);
		this.addAnnotation(this.getLiteralInteger_Value(), source,
				new String[]{"documentation", "The specified Integer value."}, new URI[0]);
		this.addAnnotation(this.literalSpecificationEClass, source,
				new String[]{"documentation", "A LiteralSpecification identifies a literal constant being modeled."},
				new URI[0]);
		this.addAnnotation(this.enumerationLiteralEClass, source,
				new String[]{"documentation", "An EnumerationLiteral is a user-defined data value for an Enumeration."},
				new URI[0]);
		this.addAnnotation(this.getEnumerationLiteral_Classifier(), source,
				new String[]{"documentation",
						"The classifier of this EnumerationLiteral derived to be equal to its Enumeration."},
				new URI[0]);
		this.addAnnotation(this.getEnumerationLiteral_Enumeration(), source,
				new String[]{"documentation", "The Enumeration that this EnumerationLiteral is a member of."},
				new URI[0]);
		this.addAnnotation(this.enumerationEClass, source, new String[]{"documentation",
				"An Enumeration is a DataType whose values are enumerated in the model as EnumerationLiterals."},
				new URI[0]);
		this.addAnnotation(this.getEnumeration_OwnedLiteral(), source,
				new String[]{"documentation", "The ordered set of literals owned by this Enumeration."}, new URI[0]);
		this.addAnnotation(this.finalStateEClass, source, new String[]{"documentation",
				"A special kind of State, which, when entered, signifies that the enclosing Region has completed. If the enclosing Region is directly contained in a StateMachine and all other Regions in that StateMachine also are completed, then it means that the entire StateMachine behavior is completed."},
				new URI[0]);
		this.addAnnotation(this.initialNodeEClass, source,
				new String[]{"documentation",
						"An InitialNode is a ControlNode that offers a single control token when initially enabled."},
				new URI[0]);
		this.addAnnotation(this.functionBehaviorEClass, source, new String[]{"documentation",
				"A FunctionBehavior is an OpaqueBehavior that does not access or modify any objects or other external data."},
				new URI[0]);
		this.addAnnotation(this.opaqueBehaviorEClass, source, new String[]{"documentation",
				"An OpaqueBehavior is a Behavior whose specification is given in a textual language other than UML."},
				new URI[0]);
		this.addAnnotation(this.getOpaqueBehavior_Body(), source,
				new String[]{"documentation", "Specifies the behavior in one or more languages."}, new URI[0]);
		this.addAnnotation(this.getOpaqueBehavior_Language(), source,
				new String[]{"documentation", "Languages the body strings use in the same order as the body strings."},
				new URI[0]);
		this.addAnnotation(this.destructionOccurrenceSpecificationEClass, source, new String[]{"documentation",
				"A DestructionOccurenceSpecification models the destruction of an object."}, new URI[0]);
		this.addAnnotation(this.messageOccurrenceSpecificationEClass, source, new String[]{"documentation",
				"A MessageOccurrenceSpecification specifies the occurrence of Message events, such as sending and receiving of Signals or invoking or receiving of Operation calls. A MessageOccurrenceSpecification is a kind of MessageEnd. Messages are generated either by synchronous Operation calls or asynchronous Signal sends. They are received by the execution of corresponding AcceptEventActions."},
				new URI[0]);
		this.addAnnotation(this.literalStringEClass, source,
				new String[]{"documentation", "A LiteralString is a specification of a String value."}, new URI[0]);
		this.addAnnotation(this.getLiteralString_Value(), source,
				new String[]{"documentation", "The specified String value."}, new URI[0]);
		this.addAnnotation(this.finalNodeEClass, source, new String[]{"documentation",
				"A FinalNode is an abstract ControlNode at which a flow in an Activity stops."}, new URI[0]);
		this.addAnnotation(this.executionEnvironmentEClass, source, new String[]{"documentation",
				"An execution environment is a node that offers an execution environment for specific types of components that are deployed on it in the form of executable artifacts."},
				new URI[0]);
		this.addAnnotation(this.nodeEClass, source, new String[]{"documentation",
				"A Node is computational resource upon which artifacts may be deployed for execution. Nodes can be interconnected through communication paths to define network structures."},
				new URI[0]);
		this.addAnnotation(this.getNode_NestedNode(), source,
				new String[]{"documentation", "The Nodes that are defined (nested) within the Node."}, new URI[0]);
		this.addAnnotation(this.dataStoreNodeEClass, source,
				new String[]{"documentation", "A DataStoreNode is a CentralBufferNode for persistent data."},
				new URI[0]);
		this.addAnnotation(this.centralBufferNodeEClass, source,
				new String[]{"documentation",
						"A CentralBufferNode is an ObjectNode for managing flows from multiple sources and targets."},
				new URI[0]);
		this.addAnnotation(this.activityFinalNodeEClass, source, new String[]{"documentation",
				"An ActivityFinalNode is a FinalNode that terminates the execution of its owning Activity or StructuredActivityNode."},
				new URI[0]);
		this.addAnnotation(this.literalBooleanEClass, source,
				new String[]{"documentation", "A LiteralBoolean is a specification of a Boolean value."}, new URI[0]);
		this.addAnnotation(this.getLiteralBoolean_Value(), source,
				new String[]{"documentation", "The specified Boolean value."}, new URI[0]);
		this.addAnnotation(this.modelEClass, source, new String[]{"documentation",
				"A model captures a view of a physical system. It is an abstraction of the physical system, with a certain purpose. This purpose determines what is to be included in the model and what is irrelevant. Thus the model completely describes those aspects of the physical system that are relevant to the purpose of the model, at the appropriate level of detail."},
				new URI[0]);
		this.addAnnotation(this.getModel_Viewpoint(), source, new String[]{"documentation",
				"The name of the viewpoint that is expressed by a model (this name may refer to a profile definition)."},
				new URI[0]);
		this.addAnnotation(this.communicationPathEClass, source, new String[]{"documentation",
				"A communication path is an association between two deployment targets, through which they are able to exchange signals and messages."},
				new URI[0]);
		this.addAnnotation(this.continuationEClass, source, new String[]{"documentation",
				"A Continuation is a syntactic way to define continuations of different branches of an alternative CombinedFragment. Continuations are intuitively similar to labels representing intermediate points in a flow of control."},
				new URI[0]);
		this.addAnnotation(this.getContinuation_Setting(), source, new String[]{"documentation",
				"True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning."},
				new URI[0]);
		this.addAnnotation(this.realEDataType, source, new String[]{"documentation",
				"Real is a primitive type representing the mathematical concept of real."}, new URI[0]);
		this.addAnnotation(this.expansionNodeEClass, source, new String[]{"documentation",
				"An ExpansionNode is an ObjectNode used to indicate a collection input or output for an ExpansionRegion. A collection input of an ExpansionRegion contains a collection that is broken into its individual elements inside the region, whose content is executed once per element. A collection output of an ExpansionRegion combines individual elements produced by the execution of the region into a collection for use outside the region."},
				new URI[0]);
		this.addAnnotation(this.getExpansionNode_RegionAsInput(), source,
				new String[]{"documentation", "The ExpansionRegion for which the ExpansionNode is an input."},
				new URI[0]);
		this.addAnnotation(this.getExpansionNode_RegionAsOutput(), source,
				new String[]{"documentation", "The ExpansionRegion for which the ExpansionNode is an output."},
				new URI[0]);
		this.addAnnotation(this.expansionRegionEClass, source, new String[]{"documentation",
				"An ExpansionRegion is a StructuredActivityNode that executes its content multiple times corresponding to elements of input collection(s)."},
				new URI[0]);
		this.addAnnotation(this.getExpansionRegion_Mode(), source, new String[]{"documentation",
				"The mode in which the ExpansionRegion executes its contents. If parallel, executions are concurrent. If iterative, executions are sequential. If stream, a stream of values flows into a single execution."},
				new URI[0]);
		this.addAnnotation(this.getExpansionRegion_OutputElement(), source, new String[]{"documentation",
				"The ExpansionNodes that form the output collections of the ExpansionRegion."}, new URI[0]);
		this.addAnnotation(this.getExpansionRegion_InputElement(), source, new String[]{"documentation",
				"The ExpansionNodes that hold the input collections for the ExpansionRegion."}, new URI[0]);
		this.addAnnotation(this.expansionKindEEnum, source, new String[]{"documentation",
				"ExpansionKind is an enumeration type used to specify how an ExpansionRegion executes its contents."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.expansionKindEEnum.getELiterals().get(0), source, new String[]{
				"documentation",
				"The content of the ExpansionRegion is executed concurrently for the elements of the input collections."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.expansionKindEEnum.getELiterals().get(1), source, new String[]{
				"documentation",
				"The content of the ExpansionRegion is executed iteratively for the elements of the input collections, in the order of the input elements, if the collections are ordered."},
				new URI[0]);
		this.addAnnotation((ENamedElement) this.expansionKindEEnum.getELiterals().get(2), source, new String[]{
				"documentation",
				"A stream of input collection elements flows into a single execution of the content of the ExpansionRegion, in the order of the collection elements if the input collections are ordered."},
				new URI[0]);
		this.addAnnotation(this.literalNullEClass, source,
				new String[]{"documentation", "A LiteralNull specifies the lack of a value."}, new URI[0]);
		this.addAnnotation(this.literalUnlimitedNaturalEClass, source, new String[]{"documentation",
				"A LiteralUnlimitedNatural is a specification of an UnlimitedNatural number."}, new URI[0]);
		this.addAnnotation(this.getLiteralUnlimitedNatural_Value(), source,
				new String[]{"documentation", "The specified UnlimitedNatural value."}, new URI[0]);
		this.addAnnotation(this.literalRealEClass, source,
				new String[]{"documentation", "A LiteralReal is a specification of a Real value."}, new URI[0]);
		this.addAnnotation(this.getLiteralReal_Value(), source,
				new String[]{"documentation", "The specified Real value."}, new URI[0]);
		this.addAnnotation(this.anyReceiveEventEClass, source, new String[]{"documentation",
				"A trigger for an AnyReceiveEvent is triggered by the receipt of any message that is not explicitly handled by any related trigger."},
				new URI[0]);
		this.addAnnotation(this.forkNodeEClass, source, new String[]{"documentation",
				"A ForkNode is a ControlNode that splits a flow into multiple concurrent flows."}, new URI[0]);
		this.addAnnotation(this.controlFlowEClass, source, new String[]{"documentation",
				"A ControlFlow is an ActivityEdge traversed by control tokens or object tokens of control type, which are use to control the execution of ExecutableNodes."},
				new URI[0]);
		this.addAnnotation(this.primitiveTypeEClass, source, new String[]{"documentation",
				"A PrimitiveType defines a predefined DataType, without any substructure. A PrimitiveType may have an algebra and operations defined outside of UML, for example, mathematically."},
				new URI[0]);
		this.addAnnotation(this.usageEClass, source, new String[]{"documentation",
				"A Usage is a Dependency in which the client Element requires the supplier Element (or set of Elements) for its full implementation or operation."},
				new URI[0]);
		this.addAnnotation(this.flowFinalNodeEClass, source,
				new String[]{"documentation",
						"A FlowFinalNode is a FinalNode that terminates a flow by consuming the tokens offered to it."},
				new URI[0]);
		this.addAnnotation(this.actorEClass, source, new String[]{"documentation",
				"An Actor specifies a role played by a user or any other system that interacts with the subject."},
				new URI[0]);
		this.addAnnotation(this.associationClassEClass, source, new String[]{"documentation",
				"A model element that has both Association and Class properties. An AssociationClass can be seen as an Association that also has Class properties, or as a Class that also has Association properties. It not only connects a set of Classifiers but also defines a set of Features that belong to the Association itself and not to any of the associated Classifiers."},
				new URI[0]);
		this.addAnnotation(this.deviceEClass, source, new String[]{"documentation",
				"A device is a physical computational resource with processing capability upon which artifacts may be deployed for execution. Devices may be complex (i.e., they may consist of other devices)."},
				new URI[0]);
		this.addAnnotation(this.mergeNodeEClass, source, new String[]{"documentation",
				"A merge node is a control node that brings together multiple alternate flows. It is not used to synchronize concurrent flows but to accept one among several alternate flows."},
				new URI[0]);
		this.addAnnotation(this.clearVariableActionEClass, source,
				new String[]{"documentation",
						"A ClearVariableAction is a VariableAction that removes all values of a Variable."},
				new URI[0]);
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createMOFAnnotations() {
		String source = "MOF";
		this.addAnnotation(this.variableEClass, source, new String[]{"package", "activities.mdstructuredactivities"},
				new URI[0]);
		this.addAnnotation(this.connectableElementEClass, source,
				new String[]{"package", "compositestructures.mdinternalstructures"}, new URI[0]);
		this.addAnnotation(this.typedElementEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.namedElementEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.elementEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.commentEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.stringEDataType, source, new String[]{"package", "mdprimitivetypes"}, new URI[0]);
		this.addAnnotation(this.instanceSpecificationEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.deploymentTargetEClass, source, new String[]{"package", "deployments.mdnodes"},
				new URI[0]);
		this.addAnnotation(this.packageableElementEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.parameterableElementEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.templateParameterEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.templateSignatureEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.templateableElementEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.templateBindingEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.directedRelationshipEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.relationshipEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.informationFlowEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdinformationflows"}, new URI[0]);
		this.addAnnotation(this.classifierEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.namespaceEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.elementImportEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.visibilityKindEEnum, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.profileEClass, source, new String[]{"package", "mdprofiles"}, new URI[0]);
		this.addAnnotation(this.packageEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.stereotypeEClass, source, new String[]{"package", "mdprofiles"}, new URI[0]);
		this.addAnnotation(this.classEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.behavioredClassifierEClass, source,
				new String[]{"package", "commonbehaviors.mdbasicbehaviors"}, new URI[0]);
		this.addAnnotation(this.behaviorEClass, source, new String[]{"package", "commonbehaviors.mdbasicbehaviors"},
				new URI[0]);
		this.addAnnotation(this.booleanEDataType, source, new String[]{"package", "mdprimitivetypes"}, new URI[0]);
		this.addAnnotation(this.parameterEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.multiplicityElementEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.integerEDataType, source, new String[]{"package", "mdprimitivetypes"}, new URI[0]);
		this.addAnnotation(this.valueSpecificationEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.lifelineEClass, source, new String[]{"package", "interactions.mdbasicinteractions"},
				new URI[0]);
		this.addAnnotation(this.interactionFragmentEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.interactionEClass, source, new String[]{"package", "interactions.mdbasicinteractions"},
				new URI[0]);
		this.addAnnotation(this.actionEClass, source, new String[]{"package", "actions.mdbasicactions"}, new URI[0]);
		this.addAnnotation(this.executableNodeEClass, source,
				new String[]{"package", "activities.mdstructuredactivities"}, new URI[0]);
		this.addAnnotation(this.activityNodeEClass, source,
				new String[]{"package", "activities.mdfundamentalactivities"}, new URI[0]);
		this.addAnnotation(this.redefinableElementEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.activityEClass, source, new String[]{"package", "activities.mdfundamentalactivities"},
				new URI[0]);
		this.addAnnotation(this.activityEdgeEClass, source, new String[]{"package", "activities.mdbasicactivities"},
				new URI[0]);
		this.addAnnotation(this.activityGroupEClass, source,
				new String[]{"package", "activities.mdfundamentalactivities"}, new URI[0]);
		this.addAnnotation(this.activityPartitionEClass, source,
				new String[]{"package", "activities.mdintermediateactivities"}, new URI[0]);
		this.addAnnotation(this.structuredActivityNodeEClass, source,
				new String[]{"package", "activities.mdstructuredactivities"}, new URI[0]);
		this.addAnnotation(this.inputPinEClass, source, new String[]{"package", "actions.mdbasicactions"}, new URI[0]);
		this.addAnnotation(this.pinEClass, source, new String[]{"package", "actions.mdbasicactions"}, new URI[0]);
		this.addAnnotation(this.objectNodeEClass, source, new String[]{"package", "activities.mdbasicactivities"},
				new URI[0]);
		this.addAnnotation(this.stateEClass, source, new String[]{"package", "statemachines.mdbehaviorstatemachines"},
				new URI[0]);
		this.addAnnotation(this.vertexEClass, source, new String[]{"package", "statemachines.mdbehaviorstatemachines"},
				new URI[0]);
		this.addAnnotation(this.regionEClass, source, new String[]{"package", "statemachines.mdbehaviorstatemachines"},
				new URI[0]);
		this.addAnnotation(this.stateMachineEClass, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.pseudostateEClass, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.pseudostateKindEEnum, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.connectionPointReferenceEClass, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.transitionEClass, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.constraintEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.extendEClass, source, new String[]{"package", "mdusecases"}, new URI[0]);
		this.addAnnotation(this.useCaseEClass, source, new String[]{"package", "mdusecases"}, new URI[0]);
		this.addAnnotation(this.extensionPointEClass, source, new String[]{"package", "mdusecases"}, new URI[0]);
		this.addAnnotation(this.includeEClass, source, new String[]{"package", "mdusecases"}, new URI[0]);
		this.addAnnotation(this.protocolTransitionEClass, source,
				new String[]{"package", "statemachines.mdprotocolstatemachines"}, new URI[0]);
		this.addAnnotation(this.operationEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.behavioralFeatureEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.featureEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.callConcurrencyKindEEnum, source,
				new String[]{"package", "commonbehaviors.mdcommunications"}, new URI[0]);
		this.addAnnotation(this.parameterSetEClass, source, new String[]{"package", "activities.mdcompleteactivities"},
				new URI[0]);
		this.addAnnotation(this.typeEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.associationEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.propertyEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.structuralFeatureEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.slotEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.structuralFeatureActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.aggregationKindEEnum, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.dataTypeEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.interfaceEClass, source, new String[]{"package", "classes.mdinterfaces"}, new URI[0]);
		this.addAnnotation(this.receptionEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.signalEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.signalEventEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.messageEventEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.eventEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.triggerEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.portEClass, source, new String[]{"package", "compositestructures.mdports"}, new URI[0]);
		this.addAnnotation(this.protocolStateMachineEClass, source,
				new String[]{"package", "statemachines.mdprotocolstatemachines"}, new URI[0]);
		this.addAnnotation(this.protocolConformanceEClass, source,
				new String[]{"package", "statemachines.mdprotocolstatemachines"}, new URI[0]);
		this.addAnnotation(this.encapsulatedClassifierEClass, source,
				new String[]{"package", "compositestructures.mdports"}, new URI[0]);
		this.addAnnotation(this.structuredClassifierEClass, source,
				new String[]{"package", "compositestructures.mdinternalstructures"}, new URI[0]);
		this.addAnnotation(this.connectorEClass, source,
				new String[]{"package", "compositestructures.mdinternalstructures"}, new URI[0]);
		this.addAnnotation(this.connectorEndEClass, source,
				new String[]{"package", "compositestructures.mdinternalstructures"}, new URI[0]);
		this.addAnnotation(this.connectorKindEEnum, source, new String[]{"package", "components.mdbasiccomponents"},
				new URI[0]);
		this.addAnnotation(this.messageEClass, source, new String[]{"package", "interactions.mdbasicinteractions"},
				new URI[0]);
		this.addAnnotation(this.messageKindEEnum, source, new String[]{"package", "interactions.mdbasicinteractions"},
				new URI[0]);
		this.addAnnotation(this.messageSortEEnum, source, new String[]{"package", "interactions.mdbasicinteractions"},
				new URI[0]);
		this.addAnnotation(this.messageEndEClass, source, new String[]{"package", "interactions.mdbasicinteractions"},
				new URI[0]);
		this.addAnnotation(this.invocationActionEClass, source, new String[]{"package", "actions.mdbasicactions"},
				new URI[0]);
		this.addAnnotation(this.acceptEventActionEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.outputPinEClass, source, new String[]{"package", "actions.mdbasicactions"}, new URI[0]);
		this.addAnnotation(this.readExtentActionEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.conditionalNodeEClass, source,
				new String[]{"package", "activities.mdstructuredactivities"}, new URI[0]);
		this.addAnnotation(this.clauseEClass, source, new String[]{"package", "activities.mdstructuredactivities"},
				new URI[0]);
		this.addAnnotation(this.loopNodeEClass, source, new String[]{"package", "activities.mdstructuredactivities"},
				new URI[0]);
		this.addAnnotation(this.reduceActionEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.createObjectActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.unmarshallActionEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.opaqueActionEClass, source, new String[]{"package", "actions.mdbasicactions"},
				new URI[0]);
		this.addAnnotation(this.readLinkActionEClass, source, new String[]{"package", "actions.mdintermediateactions"},
				new URI[0]);
		this.addAnnotation(this.linkActionEClass, source, new String[]{"package", "actions.mdintermediateactions"},
				new URI[0]);
		this.addAnnotation(this.linkEndDataEClass, source, new String[]{"package", "actions.mdintermediateactions"},
				new URI[0]);
		this.addAnnotation(this.qualifierValueEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.readLinkObjectEndActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.acceptCallActionEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.writeStructuralFeatureActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.createLinkObjectActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.createLinkActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.writeLinkActionEClass, source, new String[]{"package", "actions.mdintermediateactions"},
				new URI[0]);
		this.addAnnotation(this.linkEndCreationDataEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.readStructuralFeatureActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.clearStructuralFeatureActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.valueSpecificationActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.testIdentityActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.readIsClassifiedObjectActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.callActionEClass, source, new String[]{"package", "actions.mdbasicactions"},
				new URI[0]);
		this.addAnnotation(this.readSelfActionEClass, source, new String[]{"package", "actions.mdintermediateactions"},
				new URI[0]);
		this.addAnnotation(this.readVariableActionEClass, source,
				new String[]{"package", "actions.mdstructuredactions"}, new URI[0]);
		this.addAnnotation(this.variableActionEClass, source, new String[]{"package", "actions.mdstructuredactions"},
				new URI[0]);
		this.addAnnotation(this.readLinkObjectEndQualifierActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.replyActionEClass, source, new String[]{"package", "actions.mdcompleteactions"},
				new URI[0]);
		this.addAnnotation(this.sendSignalActionEClass, source, new String[]{"package", "actions.mdbasicactions"},
				new URI[0]);
		this.addAnnotation(this.broadcastSignalActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.interfaceRealizationEClass, source, new String[]{"package", "classes.mdinterfaces"},
				new URI[0]);
		this.addAnnotation(this.realizationEClass, source, new String[]{"package", "classes.mddependencies"},
				new URI[0]);
		this.addAnnotation(this.abstractionEClass, source, new String[]{"package", "classes.mddependencies"},
				new URI[0]);
		this.addAnnotation(this.dependencyEClass, source, new String[]{"package", "classes.mddependencies"},
				new URI[0]);
		this.addAnnotation(this.collaborationUseEClass, source,
				new String[]{"package", "compositestructures.mdcollaborations"}, new URI[0]);
		this.addAnnotation(this.collaborationEClass, source,
				new String[]{"package", "compositestructures.mdcollaborations"}, new URI[0]);
		this.addAnnotation(this.opaqueExpressionEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.componentEClass, source, new String[]{"package", "components.mdbasiccomponents"},
				new URI[0]);
		this.addAnnotation(this.componentRealizationEClass, source,
				new String[]{"package", "components.mdbasiccomponents"}, new URI[0]);
		this.addAnnotation(this.artifactEClass, source, new String[]{"package", "deployments.mdartifacts"}, new URI[0]);
		this.addAnnotation(this.deployedArtifactEClass, source, new String[]{"package", "deployments.mdnodes"},
				new URI[0]);
		this.addAnnotation(this.deploymentEClass, source, new String[]{"package", "deployments.mdnodes"}, new URI[0]);
		this.addAnnotation(this.deploymentSpecificationEClass, source,
				new String[]{"package", "deployments.mdcomponentdeployments"}, new URI[0]);
		this.addAnnotation(this.manifestationEClass, source, new String[]{"package", "deployments.mdartifacts"},
				new URI[0]);
		this.addAnnotation(this.interactionUseEClass, source, new String[]{"package", "interactions.mdfragments"},
				new URI[0]);
		this.addAnnotation(this.gateEClass, source, new String[]{"package", "interactions.mdfragments"}, new URI[0]);
		this.addAnnotation(this.combinedFragmentEClass, source, new String[]{"package", "interactions.mdfragments"},
				new URI[0]);
		this.addAnnotation(this.interactionOperatorKindEEnum, source,
				new String[]{"package", "interactions.mdfragments"}, new URI[0]);
		this.addAnnotation(this.interactionOperandEClass, source, new String[]{"package", "interactions.mdfragments"},
				new URI[0]);
		this.addAnnotation(this.interactionConstraintEClass, source,
				new String[]{"package", "interactions.mdfragments"}, new URI[0]);
		this.addAnnotation(this.clearAssociationActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.operationTemplateParameterEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.unlimitedNaturalEDataType, source, new String[]{"package", "mdprimitivetypes"},
				new URI[0]);
		this.addAnnotation(this.callOperationActionEClass, source, new String[]{"package", "actions.mdbasicactions"},
				new URI[0]);
		this.addAnnotation(this.callEventEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.stateInvariantEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.transitionKindEEnum, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.objectNodeOrderingKindEEnum, source,
				new String[]{"package", "activities.mdcompleteactivities"}, new URI[0]);
		this.addAnnotation(this.exceptionHandlerEClass, source,
				new String[]{"package", "activities.mdextrastructuredactivities"}, new URI[0]);
		this.addAnnotation(this.sendObjectActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.addStructuralFeatureValueActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.removeStructuralFeatureValueActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.startObjectBehaviorActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.removeVariableValueActionEClass, source,
				new String[]{"package", "actions.mdstructuredactions"}, new URI[0]);
		this.addAnnotation(this.writeVariableActionEClass, source,
				new String[]{"package", "actions.mdstructuredactions"}, new URI[0]);
		this.addAnnotation(this.destroyObjectActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.reclassifyObjectActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.raiseExceptionActionEClass, source,
				new String[]{"package", "actions.mdstructuredactions"}, new URI[0]);
		this.addAnnotation(this.linkEndDestructionDataEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.destroyLinkActionEClass, source,
				new String[]{"package", "actions.mdintermediateactions"}, new URI[0]);
		this.addAnnotation(this.addVariableValueActionEClass, source,
				new String[]{"package", "actions.mdstructuredactions"}, new URI[0]);
		this.addAnnotation(this.startClassifierBehaviorActionEClass, source,
				new String[]{"package", "actions.mdcompleteactions"}, new URI[0]);
		this.addAnnotation(this.interruptibleActivityRegionEClass, source,
				new String[]{"package", "activities.mdcompleteactivities"}, new URI[0]);
		this.addAnnotation(this.sequenceNodeEClass, source,
				new String[]{"package", "activities.mdstructuredactivities"}, new URI[0]);
		this.addAnnotation(this.actionInputPinEClass, source, new String[]{"package", "actions.mdstructuredactions"},
				new URI[0]);
		this.addAnnotation(this.actionExecutionSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.executionSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.occurrenceSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.generalOrderingEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.executionOccurrenceSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.partDecompositionEClass, source, new String[]{"package", "interactions.mdfragments"},
				new URI[0]);
		this.addAnnotation(this.valuePinEClass, source, new String[]{"package", "actions.mdbasicactions"}, new URI[0]);
		this.addAnnotation(this.intervalEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.intervalConstraintEClass, source,
				new String[]{"package", "commonbehaviors.mdsimpletime"}, new URI[0]);
		this.addAnnotation(this.changeEventEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.joinNodeEClass, source, new String[]{"package", "activities.mdintermediateactivities"},
				new URI[0]);
		this.addAnnotation(this.controlNodeEClass, source, new String[]{"package", "activities.mdbasicactivities"},
				new URI[0]);
		this.addAnnotation(this.durationEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.observationEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.timeExpressionEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.timeIntervalEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.timeConstraintEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.timeEventEClass, source, new String[]{"package", "commonbehaviors.mdcommunications"},
				new URI[0]);
		this.addAnnotation(this.durationIntervalEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.durationConstraintEClass, source,
				new String[]{"package", "commonbehaviors.mdsimpletime"}, new URI[0]);
		this.addAnnotation(this.expressionEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.parameterDirectionKindEEnum, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.parameterEffectKindEEnum, source,
				new String[]{"package", "activities.mdcompleteactivities"}, new URI[0]);
		this.addAnnotation(this.activityParameterNodeEClass, source,
				new String[]{"package", "activities.mdbasicactivities"}, new URI[0]);
		this.addAnnotation(this.objectFlowEClass, source, new String[]{"package", "activities.mdbasicactivities"},
				new URI[0]);
		this.addAnnotation(this.decisionNodeEClass, source,
				new String[]{"package", "activities.mdintermediateactivities"}, new URI[0]);
		this.addAnnotation(this.behaviorExecutionSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.callBehaviorActionEClass, source, new String[]{"package", "actions.mdbasicactions"},
				new URI[0]);
		this.addAnnotation(this.extensionEClass, source, new String[]{"package", "mdprofiles"}, new URI[0]);
		this.addAnnotation(this.extensionEndEClass, source, new String[]{"package", "mdprofiles"}, new URI[0]);
		this.addAnnotation(this.imageEClass, source, new String[]{"package", "mdprofiles"}, new URI[0]);
		this.addAnnotation(this.packageMergeEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.profileApplicationEClass, source, new String[]{"package", "mdprofiles"}, new URI[0]);
		this.addAnnotation(this.packageImportEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.diagramEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.generalizationEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.generalizationSetEClass, source, new String[]{"package", "classes.mdpowertypes"},
				new URI[0]);
		this.addAnnotation(this.redefinableTemplateSignatureEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.substitutionEClass, source, new String[]{"package", "classes.mddependencies"},
				new URI[0]);
		this.addAnnotation(this.classifierTemplateParameterEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.informationItemEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdinformationflows"}, new URI[0]);
		this.addAnnotation(this.templateParameterSubstitutionEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.instanceValueEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.elementValueEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.stringExpressionEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.considerIgnoreFragmentEClass, source,
				new String[]{"package", "interactions.mdfragments"}, new URI[0]);
		this.addAnnotation(this.timeObservationEClass, source, new String[]{"package", "commonbehaviors.mdsimpletime"},
				new URI[0]);
		this.addAnnotation(this.durationObservationEClass, source,
				new String[]{"package", "commonbehaviors.mdsimpletime"}, new URI[0]);
		this.addAnnotation(this.connectableElementTemplateParameterEClass, source,
				new String[]{"package", "auxiliaryconstructs.mdtemplates"}, new URI[0]);
		this.addAnnotation(this.literalIntegerEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.literalSpecificationEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.enumerationLiteralEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.enumerationEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.finalStateEClass, source,
				new String[]{"package", "statemachines.mdbehaviorstatemachines"}, new URI[0]);
		this.addAnnotation(this.initialNodeEClass, source, new String[]{"package", "activities.mdbasicactivities"},
				new URI[0]);
		this.addAnnotation(this.functionBehaviorEClass, source,
				new String[]{"package", "commonbehaviors.mdbasicbehaviors"}, new URI[0]);
		this.addAnnotation(this.opaqueBehaviorEClass, source,
				new String[]{"package", "commonbehaviors.mdbasicbehaviors"}, new URI[0]);
		this.addAnnotation(this.destructionOccurrenceSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.messageOccurrenceSpecificationEClass, source,
				new String[]{"package", "interactions.mdbasicinteractions"}, new URI[0]);
		this.addAnnotation(this.literalStringEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.finalNodeEClass, source, new String[]{"package", "activities.mdintermediateactivities"},
				new URI[0]);
		this.addAnnotation(this.executionEnvironmentEClass, source, new String[]{"package", "deployments.mdnodes"},
				new URI[0]);
		this.addAnnotation(this.nodeEClass, source, new String[]{"package", "deployments.mdnodes"}, new URI[0]);
		this.addAnnotation(this.dataStoreNodeEClass, source, new String[]{"package", "activities.mdcompleteactivities"},
				new URI[0]);
		this.addAnnotation(this.centralBufferNodeEClass, source,
				new String[]{"package", "activities.mdintermediateactivities"}, new URI[0]);
		this.addAnnotation(this.activityFinalNodeEClass, source,
				new String[]{"package", "activities.mdbasicactivities"}, new URI[0]);
		this.addAnnotation(this.literalBooleanEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.modelEClass, source, new String[]{"package", "auxiliaryconstructs.mdmodels"},
				new URI[0]);
		this.addAnnotation(this.communicationPathEClass, source, new String[]{"package", "deployments.mdnodes"},
				new URI[0]);
		this.addAnnotation(this.continuationEClass, source, new String[]{"package", "interactions.mdfragments"},
				new URI[0]);
		this.addAnnotation(this.realEDataType, source, new String[]{"package", "mdprimitivetypes"}, new URI[0]);
		this.addAnnotation(this.expansionNodeEClass, source,
				new String[]{"package", "activities.mdextrastructuredactivities"}, new URI[0]);
		this.addAnnotation(this.expansionRegionEClass, source,
				new String[]{"package", "activities.mdextrastructuredactivities"}, new URI[0]);
		this.addAnnotation(this.expansionKindEEnum, source,
				new String[]{"package", "activities.mdextrastructuredactivities"}, new URI[0]);
		this.addAnnotation(this.literalNullEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.literalUnlimitedNaturalEClass, source, new String[]{"package", "classes.mdkernel"},
				new URI[0]);
		this.addAnnotation(this.literalRealEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.anyReceiveEventEClass, source,
				new String[]{"package", "commonbehaviors.mdcommunications"}, new URI[0]);
		this.addAnnotation(this.forkNodeEClass, source, new String[]{"package", "activities.mdintermediateactivities"},
				new URI[0]);
		this.addAnnotation(this.controlFlowEClass, source, new String[]{"package", "activities.mdbasicactivities"},
				new URI[0]);
		this.addAnnotation(this.primitiveTypeEClass, source, new String[]{"package", "classes.mdkernel"}, new URI[0]);
		this.addAnnotation(this.usageEClass, source, new String[]{"package", "classes.mddependencies"}, new URI[0]);
		this.addAnnotation(this.flowFinalNodeEClass, source,
				new String[]{"package", "activities.mdintermediateactivities"}, new URI[0]);
		this.addAnnotation(this.actorEClass, source, new String[]{"package", "mdusecases"}, new URI[0]);
		this.addAnnotation(this.associationClassEClass, source, new String[]{"package", "classes.mdassociationclasses"},
				new URI[0]);
		this.addAnnotation(this.deviceEClass, source, new String[]{"package", "deployments.mdnodes"}, new URI[0]);
		this.addAnnotation(this.mergeNodeEClass, source, new String[]{"package", "activities.mdintermediateactivities"},
				new URI[0]);
		this.addAnnotation(this.clearVariableActionEClass, source,
				new String[]{"package", "actions.mdstructuredactions"}, new URI[0]);
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		this.addAnnotation(this.getVariable_Scope(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getVariable_ActivityScope(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getConnectableElement__structuredClassifierOfRole(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/_namespaceOfMember")});
		this.addAnnotation(this.getConnectableElement__collaborationOfCollaborationRole(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//ConnectableElement/_structuredClassifierOfRole")});
		this.addAnnotation(this.getNamedElement_ClientDependency(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource")});
		this.addAnnotation(this.getNamedElement_SupplierDependency(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getNamedElement_Namespace(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/_namespaceOfMember"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getNamedElement__classifierOfInheritedMember(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/_namespaceOfMember")});
		this.addAnnotation(this.getNamedElement__informationFlowOfInformationSource(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource")});
		this.addAnnotation(this.getNamedElement__informationFlowOfInformationTarget(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getNamedElement_NameExpression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getElement_OwnedComment(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getElement_AppliedStereotypeInstance(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getElement__directedRelationshipOfSource(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_relationshipOfRelatedElement")});
		this.addAnnotation(this.getElement__directedRelationshipOfTarget(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_relationshipOfRelatedElement")});
		this.addAnnotation(this.getComment_OwningElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getInstanceSpecification_Slot(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInstanceSpecification_Specification(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInstanceSpecification_StereotypedElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getDeploymentTarget_Deployment(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/clientDependency")});
		this.addAnnotation(this.getPackageableElement__elementImportOfImportedElement(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getPackageableElement__componentOfPackagedElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getPackageableElement__manifestationOfUtilizedElement(), source, new String[0],
				new URI[]{
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/supplierDependency")});
		this.addAnnotation(this.getPackageableElement_OwningPackage(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getPackageableElement__namespaceOfImportedMember(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/_namespaceOfMember")});
		this.addAnnotation(this.getParameterableElement_OwningTemplateParameter(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ParameterableElement/templateParameter")});
		this.addAnnotation(this.getParameterableElement__templateParameterOfOwnedDefault(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner"), URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//ParameterableElement/_templateParameterOfDefault")});
		this.addAnnotation(this.getParameterableElement__templateParameterSubstitutionOfOwnedActual(), source,
				new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner"), URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//ParameterableElement/_templateParameterSubstitutionOfActual")});
		this.addAnnotation(this.getTemplateParameter_OwnedDefault(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/default")});
		this.addAnnotation(this.getTemplateParameter_Signature(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/_templateSignatureOfParameter"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTemplateParameter__redefinableTemplateSignatureOfInheritedParameter(), source,
				new String[0], new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/_templateSignatureOfParameter")});
		this.addAnnotation(this.getTemplateParameter_OwnedParameteredElement(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/parameteredElement")});
		this.addAnnotation(this.getTemplateSignature_Template(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTemplateSignature__templateBindingOfSignature(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getTemplateSignature_OwnedParameter(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateSignature/parameter")});
		this.addAnnotation(this.getTemplateableElement_TemplateBinding(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getTemplateableElement_OwnedTemplateSignature(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getTemplateBinding_ParameterSubstitution(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getTemplateBinding_Signature(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getTemplateBinding_BoundElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getDirectedRelationship_Source(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Relationship/relatedElement")});
		this.addAnnotation(this.getDirectedRelationship_Target(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Relationship/relatedElement")});
		this.addAnnotation(this.getInformationFlow_InformationSource(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source")});
		this.addAnnotation(this.getInformationFlow_InformationTarget(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getClassifier_OwnedTemplateSignature(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext")});
		this.addAnnotation(this.getClassifier__regionOfRedefinitionContext(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext")});
		this.addAnnotation(this.getClassifier_OwnedUseCase(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getClassifier_Feature(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/member")});
		this.addAnnotation(this.getClassifier__interfaceOfNestedClassifier(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getClassifier_Representation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/collaborationUse")});
		this.addAnnotation(this.getClassifier_CollaborationUse(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getClassifier__componentRealizationOfRealizingClassifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/clientDependency")});
		this.addAnnotation(this.getClassifier_Attribute(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature")});
		this.addAnnotation(this.getClassifier__transitionOfRedefinitionContext(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext")});
		this.addAnnotation(this.getClassifier__vertexOfRedefinitionContext(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext")});
		this.addAnnotation(this.getClassifier_UMLClass(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getClassifier_Generalization(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getClassifier__generalizationOfGeneral(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getClassifier_InheritedMember(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/member")});
		this.addAnnotation(this.getClassifier_RedefinedClassifier(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getClassifier__classifierOfRedefinedClassifier(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getClassifier_Substitution(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/clientDependency")});
		this.addAnnotation(this.getClassifier__substitutionOfContract(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/supplierDependency")});
		this.addAnnotation(this.getNamespace_ElementImport(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getNamespace_OwnedRule(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getNamespace_PackageImport(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getNamespace_ImportedMember(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/member")});
		this.addAnnotation(this.getNamespace_OwnedMember(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/member")});
		this.addAnnotation(this.getNamespace_OwnedDiagram(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getElementImport_ImportedElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getElementImport__profileOfMetaclassReference(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ElementImport/importingNamespace")});
		this.addAnnotation(this.getElementImport_ImportingNamespace(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getProfile__profileApplicationOfAppliedProfile(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getProfile_MetamodelReference(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/packageImport")});
		this.addAnnotation(this.getProfile_MetaclassReference(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/elementImport")});
		this.addAnnotation(this.getPackage_NestedPackage(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Package/packagedElement")});
		this.addAnnotation(this.getPackage_NestingPackage(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//PackageableElement/owningPackage")});
		this.addAnnotation(this.getPackage_OwnedStereotype(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Package/packagedElement")});
		this.addAnnotation(this.getPackage_OwnedType(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Package/packagedElement")});
		this.addAnnotation(this.getPackage_PackageMerge(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getPackage__packageMergeOfMergedPackage(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getPackage_PackagedElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getPackage_ProfileApplication(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getPackage__packageImportOfImportedPackage(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getStereotype__extensionEndOfType(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Type/_typedElementOfType")});
		this.addAnnotation(this.getStereotype_Icon(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getStereotype__packageOfOwnedStereotype(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//PackageableElement/owningPackage")});
		this.addAnnotation(this.getClass_OwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/attribute"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getClass_OwnedReception(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getClass_OwnedOperation(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getClass_NestedClassifier(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getClass__classOfSuperClass(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_classifierOfGeneral")});
		this.addAnnotation(this.getBehavioredClassifier_ClassifierBehavior(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//BehavioredClassifier/ownedBehavior")});
		this.addAnnotation(this.getBehavioredClassifier__behaviorOfContext(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext")});
		this.addAnnotation(this.getBehavioredClassifier_InterfaceRealization(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/clientDependency")});
		this.addAnnotation(this.getBehavioredClassifier_OwnedBehavior(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getBehavior_Context(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getBehavior_OwnedParameter(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getBehavior__transitionOfEffect(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getBehavior_OwnedParameterSet(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getBehavior_Event(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getBehavior_Postcondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getBehavior_Precondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getBehavior__stateOfDoActivity(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getBehavior__stateOfEntry(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getBehavior__stateOfExit(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getBehavior_Observation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getBehavior_RedefinedBehavior(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/redefinedClassifier")});
		this.addAnnotation(this.getBehavior__behaviorOfRedefinedBehavior(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_classifierOfRedefinedClassifier")});
		this.addAnnotation(this.getBehavior__behavioredClassifierOfOwnedBehavior(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getBehavior__behavioredClassifierOfClassifierBehavior(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Behavior/_behavioredClassifierOfOwnedBehavior")});
		this.addAnnotation(this.getParameter_OwnerFormalParam(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getParameter_Operation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Parameter/ownerFormalParam")});
		this.addAnnotation(this.getParameter_DefaultValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getParameter__behaviorOfOwnedParameter(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getMultiplicityElement_LowerValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getMultiplicityElement_UpperValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getValueSpecification__lifelineOfSelector(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__activityEdgeOfGuard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningConstraint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningSlot(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningProperty(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__messageOfArgument(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__messageOfTarget(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__valueSpecificationActionOfValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__interactionConstraintOfMaxint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__interactionConstraintOfMinint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__interactionUseOfArgument(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__interactionUseOfReturnValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__objectNodeOfUpperBound(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__activityEdgeOfWeight(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__valuePinOfValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningParameter(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__changeEventOfChangeExpression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__joinNodeOfJoinSpec(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningInstanceSpec(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningUpper(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__durationOfExpr(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification__timeExpressionOfExpr(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_Expression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValueSpecification_OwningLower(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getLifeline__stateInvariantOfCovered(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Lifeline/coveredBy")});
		this.addAnnotation(this.getLifeline__occurrenceSpecificationOfCovered(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Lifeline/coveredBy")});
		this.addAnnotation(this.getLifeline_Interaction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getLifeline_Selector(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionFragment_EnclosingInteraction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getInteractionFragment_EnclosingOperand(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getInteractionFragment_GeneralOrdering(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteraction_Action(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteraction_Message(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInteraction_FormalGate(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInteraction_Lifeline(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInteraction_Fragment(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getAction_LocalPostcondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getAction_Output(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getAction_LocalPrecondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getAction_Input(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getAction__actionInputPinOfFromAction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getAction__interactionOfAction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getExecutableNode_Handler(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getExecutableNode__sequenceNodeOfExecutableNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityNode/inStructuredNode")});
		this.addAnnotation(this.getActivityNode_Activity(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getActivityNode_InPartition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityNode/inGroup")});
		this.addAnnotation(this.getActivityNode_InStructuredNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityNode/inGroup"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getActivityNode_InInterruptibleRegion(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityNode/inGroup")});
		this.addAnnotation(this.getActivityNode_RedefinedNode(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getActivityNode__activityNodeOfRedefinedNode(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getActivity_Edge(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getActivity_Group(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getActivity_Partition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Activity/group")});
		this.addAnnotation(this.getActivity_Variable(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getActivity_Node(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getActivityEdge_Guard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getActivityEdge_InPartition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityEdge/inGroup")});
		this.addAnnotation(this.getActivityEdge_InStructuredNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityEdge/inGroup"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getActivityEdge_RedefinedEdge(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getActivityEdge__activityEdgeOfRedefinedEdge(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getActivityEdge_Weight(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getActivityEdge_Activity(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getActivityGroup_InActivity(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getActivityGroup_Subgroup(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getActivityGroup_SuperGroup(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getActivityPartition_Node(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/containedNode")});
		this.addAnnotation(this.getActivityPartition_Subpartition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/subgroup")});
		this.addAnnotation(this.getActivityPartition_SuperPartition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/superGroup")});
		this.addAnnotation(this.getActivityPartition__activityOfPartition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/inActivity")});
		this.addAnnotation(this.getActivityPartition_Edge(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/containedEdge")});
		this.addAnnotation(this.getStructuredActivityNode_Node(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/containedNode"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getStructuredActivityNode_StructuredNodeInput(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getStructuredActivityNode_StructuredNodeOutput(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getStructuredActivityNode_Variable(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getStructuredActivityNode_Edge(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/containedEdge"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInputPin__structuralFeatureActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__invocationActionOfArgument(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__loopNodeOfLoopVariableInput(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_structuredActivityNodeOfStructuredNodeInput")});
		this.addAnnotation(this.getInputPin__reduceActionOfCollection(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__unmarshallActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__opaqueActionOfInputValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__linkActionOfInputValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__readLinkObjectEndActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__writeStructuralFeatureActionOfValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__testIdentityActionOfFirst(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__testIdentityActionOfSecond(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__readIsClassifiedObjectActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__readLinkObjectEndQualifierActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__replyActionOfReplyValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__replyActionOfReturnInformation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__sendSignalActionOfTarget(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__clearAssociationActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__callOperationActionOfTarget(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__sendObjectActionOfTarget(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__sendObjectActionOfRequest(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_invocationActionOfArgument")});
		this.addAnnotation(this.getInputPin__addStructuralFeatureValueActionOfInsertAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__actionOfInput(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getInputPin__removeStructuralFeatureValueActionOfRemoveAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__startObjectBehaviorActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__removeVariableValueActionOfRemoveAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__writeVariableActionOfValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__destroyObjectActionOfTarget(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__reclassifyObjectActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__raiseExceptionActionOfException(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__addVariableValueActionOfInsertAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__startClassifierBehaviorActionOfObject(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getInputPin__structuredActivityNodeOfStructuredNodeInput(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InputPin/_actionOfInput")});
		this.addAnnotation(this.getObjectNode_UpperBound(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getState_Region(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getState_ConnectionPoint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getState_Connection(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getState_StateInvariant(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getState_DeferrableTrigger(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getState_DoActivity(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getState_Entry(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getState_Exit(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getVertex_RedefinedVertex(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getVertex___vertexOfRedefinedVertex(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getVertex_Container(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getRegion_ExtendedRegion(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getRegion__regionOfExtendedRegion(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getRegion_State(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getRegion_StateMachine(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getRegion_Transition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getRegion_Subvertex(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getStateMachine_ConnectionPoint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getStateMachine__stateMachineOfExtendedStateMachine(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Behavior/_behaviorOfRedefinedBehavior")});
		this.addAnnotation(this.getStateMachine_Region(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getPseudostate_State(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getPseudostate_StateMachine(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getConnectionPointReference_State(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getTransition_Effect(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getTransition_Guard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getTransition_Trigger(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getTransition_RedefinedTransition(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getTransition__transitionOfRedefinedTransition(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getTransition_Container(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getConstraint_Context(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getConstraint_Specification(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getConstraint_OwningState(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint__actionOfLocalPostcondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getConstraint__extendOfCondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getConstraint_OwningTransition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint__protocolTransitionOfPreCondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/_transitionOfGuard")});
		this.addAnnotation(this.getConstraint__parameterSetOfCondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getConstraint__messageOfGuard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getConstraint_BodyContext(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint_PostContext(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint_PreContext(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint__behaviorOfPostcondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint__behaviorOfPrecondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getConstraint__stateInvariantOfInvariant(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getConstraint__actionOfLocalPrecondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getConstraint__transitionOfGuard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/context")});
		this.addAnnotation(this.getExtend_ExtendedCase(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getExtend_Extension(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getExtend_Condition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getUseCase_Extend(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getUseCase_ExtensionPoint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getUseCase_Include(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getUseCase__includeOfAddition(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getUseCase__classifierOfOwnedUseCase(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getUseCase__extendOfExtendedCase(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getExtensionPoint_UseCase(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getInclude_Addition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getInclude_IncludingCase(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProtocolTransition_PreCondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Transition/guard")});
		this.addAnnotation(this.getProtocolTransition_PostCondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getOperation_Datatype(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getOperation_Interface(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getOperation__artifactOfOwnedOperation(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getOperation_BodyCondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getOperation_UMLClass(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getOperation_Postcondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getOperation_Precondition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedRule")});
		this.addAnnotation(this.getOperation_RedefinedOperation(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getOperation__operationOfRedefinedOperation(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getBehavioralFeature_OwnedParameter(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getBehavioralFeature_OwnedParameterSet(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getFeature_FeaturingClassifier(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/_namespaceOfMember")});
		this.addAnnotation(this.getParameterSet_Condition(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getParameterSet__behaviorOfOwnedParameterSet(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getParameterSet__behavioralFeatureOfOwnedParameterSet(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getType_Package(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//PackageableElement/owningPackage")});
		this.addAnnotation(this.getType__operationOfRaisedException(), source, new String[0], new URI[]{URI
				.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Type/_behavioralFeatureOfRaisedException")});
		this.addAnnotation(this.getType__associationOfEndType(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_relationshipOfRelatedElement")});
		this.addAnnotation(this.getAssociation_MemberEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/member")});
		this.addAnnotation(this.getAssociation_OwnedEnd(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Association/memberEnd"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getAssociation_NavigableOwnedEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Association/ownedEnd")});
		this.addAnnotation(this.getAssociation_EndType(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Relationship/relatedElement")});
		this.addAnnotation(this.getProperty_AssociationEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getProperty_Qualifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getProperty_UMLClass(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/classifier"),
				URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/_structuredClassifierOfOwnedAttribute"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProperty_Datatype(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/classifier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProperty_DefaultValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getProperty_Interface(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/classifier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProperty_OwningSignal(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/classifier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProperty__structuredClassifierOfOwnedAttribute(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/classifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"), URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//ConnectableElement/_structuredClassifierOfRole")});
		this.addAnnotation(this.getProperty_OwningAssociation(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/association"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getProperty_RedefinedProperty(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getProperty__propertyOfRedefinedProperty(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getProperty__associationOfNavigableOwnedEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/owningAssociation")});
		this.addAnnotation(this.getProperty__artifactOfOwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/classifier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProperty_Classifier(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getProperty_Association(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/_namespaceOfMember")});
		this.addAnnotation(this.getSlot_OwningInstance(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getSlot_Value(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getStructuralFeatureAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getDataType_OwnedOperation(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getDataType_OwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/attribute"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInterface_NestedClassifier(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInterface_OwnedOperation(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInterface_OwnedReception(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInterface_Protocol(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInterface_RedefinedInterface(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/redefinedClassifier")});
		this.addAnnotation(this.getInterface__interfaceOfRedefinedInterface(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_classifierOfRedefinedClassifier")});
		this.addAnnotation(this.getInterface__interfaceRealizationOfContract(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/supplierDependency")});
		this.addAnnotation(this.getInterface_OwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/attribute"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getReception__classOfOwnedReception(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getReception__interfaceOfOwnedReception(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getSignal_OwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/attribute"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getEvent_Behavior(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTrigger__stateOfDeferrableTrigger(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTrigger__transitionOfTrigger(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTrigger__acceptEventActionOfTrigger(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getPort_RedefinedPort(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/redefinedProperty")});
		this.addAnnotation(this.getPort__portOfRedefinedPort(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/_propertyOfRedefinedProperty")});
		this.addAnnotation(this.getPort__encapsulatedClassifierOfOwnedPort(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/_structuredClassifierOfOwnedAttribute")});
		this.addAnnotation(this.getProtocolStateMachine_Conformance(), source, new String[0],
				new URI[]{
						URI.createURI(
								"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfSource"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getProtocolStateMachine__protocolConformanceOfGeneralMachine(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/_directedRelationshipOfTarget")});
		this.addAnnotation(this.getProtocolStateMachine_Interface(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getProtocolConformance_GeneralMachine(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getProtocolConformance_SpecificMachine(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getEncapsulatedClassifier_OwnedPort(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredClassifier/ownedAttribute")});
		this.addAnnotation(this.getStructuredClassifier_OwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/attribute"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredClassifier/role")});
		this.addAnnotation(this.getStructuredClassifier_OwnedConnector(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getStructuredClassifier_Role(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/member")});
		this.addAnnotation(this.getConnector_End(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getConnector_RedefinedConnector(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getConnector__connectorOfRedefinedConnector(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getConnector__structuredClassifierOfOwnedConnector(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Feature/featuringClassifier"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getConnectorEnd__connectorOfEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getMessage_Argument(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getMessage_Interaction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getMessage_ReceiveEvent(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Message/_messageEndOfMessage")});
		this.addAnnotation(this.getMessage_SendEvent(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Message/_messageEndOfMessage")});
		this.addAnnotation(this.getMessage_Guard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getMessage_Target(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getMessageEnd__messageOfSendEvent(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//MessageEnd/message")});
		this.addAnnotation(this.getMessageEnd__messageOfReceiveEvent(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//MessageEnd/message")});
		this.addAnnotation(this.getInvocationAction_Argument(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getAcceptEventAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getAcceptEventAction_Trigger(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getOutputPin__structuredActivityNodeOfStructuredNodeOutput(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readExtentActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__conditionalNodeOfResult(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_structuredActivityNodeOfStructuredNodeOutput")});
		this.addAnnotation(this.getOutputPin__loopNodeOfLoopVariable(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getOutputPin__loopNodeOfResult(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_structuredActivityNodeOfStructuredNodeOutput")});
		this.addAnnotation(this.getOutputPin__reduceActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__actionOfOutput(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getOutputPin__createObjectActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__unmarshallActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__opaqueActionOfOutputValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readLinkActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readLinkObjectEndActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__acceptCallActionOfReturnInformation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__writeStructuralFeatureActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__createLinkObjectActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readStructuralFeatureActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__clearStructuralFeatureActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__valueSpecificationActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__testIdentityActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readIsClassifiedObjectActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__callActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readSelfActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readVariableActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__readLinkObjectEndQualifierActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getOutputPin__acceptEventActionOfResult(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//OutputPin/_actionOfOutput")});
		this.addAnnotation(this.getReadExtentAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getConditionalNode_Clause(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getClause__conditionalNodeOfClause(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getLoopNode_LoopVariable(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getReduceAction_Collection(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getReduceAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getCreateObjectAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getUnmarshallAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getUnmarshallAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getOpaqueAction_InputValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getOpaqueAction_OutputValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getReadLinkAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getLinkAction_EndData(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getLinkAction_InputValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getLinkEndData_Qualifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getLinkEndData__linkActionOfEndData(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getQualifierValue__linkEndDataOfQualifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getReadLinkObjectEndAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getReadLinkObjectEndAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getAcceptCallAction_ReturnInformation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getWriteStructuralFeatureAction_Value(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getWriteStructuralFeatureAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getCreateLinkObjectAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getLinkEndCreationData__createLinkActionOfEndData(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//LinkEndData/_linkActionOfEndData")});
		this.addAnnotation(this.getReadStructuralFeatureAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getClearStructuralFeatureAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getValueSpecificationAction_Value(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getValueSpecificationAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getTestIdentityAction_First(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getTestIdentityAction_Second(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getTestIdentityAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getReadIsClassifiedObjectAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getReadIsClassifiedObjectAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getCallAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getReadSelfAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getReadVariableAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getReadLinkObjectEndQualifierAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getReadLinkObjectEndQualifierAction_Result(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/output")});
		this.addAnnotation(this.getReplyAction_ReplyValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getReplyAction_ReturnInformation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getSendSignalAction_Target(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getInterfaceRealization_ImplementingClassifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/client"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getInterfaceRealization_Contract(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/supplier")});
		this.addAnnotation(this.getAbstraction_Mapping(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getDependency_Client(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source")});
		this.addAnnotation(this.getDependency_Supplier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getDependency__collaborationUseOfRoleBinding(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getCollaborationUse__classifierOfRepresentation(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//CollaborationUse/_classifierOfCollaborationUse")});
		this.addAnnotation(this.getCollaborationUse__classifierOfCollaborationUse(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getCollaborationUse_RoleBinding(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getCollaboration_CollaborationRole(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredClassifier/role")});
		this.addAnnotation(this.getOpaqueExpression__abstractionOfMapping(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getComponent_PackagedElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getComponent_Realization(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/supplierDependency"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getComponentRealization_RealizingClassifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/client")});
		this.addAnnotation(this.getComponentRealization_Abstraction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/supplier"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getArtifact_Manifestation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/clientDependency")});
		this.addAnnotation(this.getArtifact_NestedArtifact(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getArtifact__artifactOfNestedArtifact(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getArtifact_OwnedOperation(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_redefinableElementOfRedefinitionContext"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/feature"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getArtifact_OwnedAttribute(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/attribute"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getDeployedArtifact__deploymentOfDeployedArtifact(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/supplierDependency")});
		this.addAnnotation(this.getDeployment_Configuration(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getDeployment_Location(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/client"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getDeployment_DeployedArtifact(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/supplier")});
		this.addAnnotation(this.getDeploymentSpecification_Deployment(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getManifestation_UtilizedElement(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/supplier")});
		this.addAnnotation(this.getManifestation__artifactOfManifestation(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/client"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getInteractionUse_ActualGate(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionUse_Argument(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionUse_ReturnValue(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getGate__combinedFragmentOfCfragmentGate(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getGate__interactionOfFormalGate(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getGate__interactionUseOfActualGate(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getCombinedFragment_Operand(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getCombinedFragment_CfragmentGate(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionOperand_Fragment(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getInteractionOperand_Guard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionOperand__combinedFragmentOfOperand(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getInteractionConstraint_Maxint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionConstraint_Minint(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInteractionConstraint__interactionOperandOfGuard(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getClearAssociationAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getCallOperationAction_Target(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getStateInvariant_Invariant(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getExceptionHandler_ProtectedNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getSendObjectAction_Target(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getAddStructuralFeatureValueAction_InsertAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getRemoveStructuralFeatureValueAction_RemoveAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getStartObjectBehaviorAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getRemoveVariableValueAction_RemoveAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getWriteVariableAction_Value(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getDestroyObjectAction_Target(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getReclassifyObjectAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getRaiseExceptionAction_Exception(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getLinkEndDestructionData__destroyLinkActionOfEndData(), source, new String[0],
				new URI[]{URI
						.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//LinkEndData/_linkActionOfEndData")});
		this.addAnnotation(this.getAddVariableValueAction_InsertAt(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getStartClassifierBehaviorAction_Object(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Action/input")});
		this.addAnnotation(this.getInterruptibleActivityRegion_Node(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityGroup/containedNode")});
		this.addAnnotation(this.getActionInputPin_FromAction(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getGeneralOrdering__interactionFragmentOfGeneralOrdering(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getValuePin_Value(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getInterval__intervalConstraintOfSpecification(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ValueSpecification/owningConstraint")});
		this.addAnnotation(this.getChangeEvent_ChangeExpression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getJoinNode_JoinSpec(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getDuration__durationIntervalOfMin(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ValueSpecification/_intervalOfMin")});
		this.addAnnotation(this.getDuration__durationIntervalOfMax(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ValueSpecification/_intervalOfMax")});
		this.addAnnotation(this.getDuration_Expr(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getObservation_Behavior(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTimeExpression_Expr(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getTimeExpression__timeIntervalOfMin(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ValueSpecification/_intervalOfMin")});
		this.addAnnotation(this.getTimeExpression__timeIntervalOfMax(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ValueSpecification/_intervalOfMax")});
		this.addAnnotation(this.getTimeExpression__timeEventOfWhen(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTimeInterval__timeConstraintOfSpecification(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Interval/_intervalConstraintOfSpecification")});
		this.addAnnotation(this.getTimeEvent_When(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getDurationInterval__durationConstraintOfSpecification(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Interval/_intervalConstraintOfSpecification")});
		this.addAnnotation(this.getExpression_Operand(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getExtensionEnd__extensionOfOwnedEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Property/owningAssociation")});
		this.addAnnotation(this.getImage__stereotypeOfIcon(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getPackageMerge_MergedPackage(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getPackageMerge_ReceivingPackage(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getProfileApplication_AppliedProfile(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getProfileApplication_ApplyingPackage(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getPackageImport_ImportingNamespace(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getPackageImport__profileOfMetamodelReference(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//PackageImport/importingNamespace")});
		this.addAnnotation(this.getPackageImport_ImportedPackage(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getDiagram_OwnerOfDiagram(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getGeneralization_General(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/target")});
		this.addAnnotation(this.getGeneralization_Specific(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//DirectedRelationship/source"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getRedefinableTemplateSignature_ExtendedSignature(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinedElement")});
		this.addAnnotation(this.getRedefinableTemplateSignature__redefinableTemplateSignatureOfExtendedSignature(),
				source, new String[0], new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/_redefinableElementOfRedefinedElement")});
		this.addAnnotation(this.getRedefinableTemplateSignature_InheritedParameter(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateSignature/parameter")});
		this.addAnnotation(this.getRedefinableTemplateSignature_Classifier(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getSubstitution_Contract(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/supplier")});
		this.addAnnotation(this.getSubstitution_SubstitutingClassifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Dependency/client"),
						URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getTemplateParameterSubstitution_OwnedActual(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement"),
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameterSubstitution/actual")});
		this.addAnnotation(this.getTemplateParameterSubstitution_TemplateBinding(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getStringExpression_OwningExpression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getStringExpression_SubExpression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/ownedElement")});
		this.addAnnotation(this.getStringExpression__namedElementOfNameExpression(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Element/owner")});
		this.addAnnotation(this.getEnumerationLiteral_Enumeration(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
		this.addAnnotation(this.getEnumeration_OwnedLiteral(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getEnumeration__enumerationLiteralOfClassifier(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/_instanceSpecificationOfClassifier")});
		this.addAnnotation(this.getNode_NestedNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Namespace/ownedMember")});
		this.addAnnotation(this.getNode__nodeOfNestedNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/namespace")});
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		this.addAnnotation(this.getConnectableElement_TemplateParameter(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ParameterableElement/templateParameter")});
		this.addAnnotation(this.getPackageableElement_Visibility(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//NamedElement/visibility")});
		this.addAnnotation(this.getClassifier_OwnedTemplateSignature(), source, new String[0], new URI[]{URI
				.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateableElement/ownedTemplateSignature")});
		this.addAnnotation(this.getClassifier_TemplateParameter(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ParameterableElement/templateParameter")});
		this.addAnnotation(this.getClass_OwnedAttribute(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredClassifier/ownedAttribute")});
		this.addAnnotation(this.getClass_Abstract(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/isAbstract")});
		this.addAnnotation(this.getClass_SuperClass(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Classifier/general")});
		this.addAnnotation(this.getStructuredActivityNode_Activity(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ActivityNode/activity")});
		this.addAnnotation(this.getVertex_RedefinitionContext(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getRegion_RedefinitionContext(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getStateMachine_ExtendedStateMachine(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Behavior/redefinedBehavior")});
		this.addAnnotation(this.getTransition_RedefinitionContext(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//RedefinableElement/redefinitionContext")});
		this.addAnnotation(this.getOperation_RaisedException(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//BehavioralFeature/raisedException")});
		this.addAnnotation(this.getOperation_OwnedParameter(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//BehavioralFeature/ownedParameter")});
		this.addAnnotation(this.getOperation_TemplateParameter(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//ParameterableElement/templateParameter")});
		this.addAnnotation(this.getConditionalNode_Result(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredActivityNode/structuredNodeOutput")});
		this.addAnnotation(this.getLoopNode_LoopVariableInput(), source, new String[0], new URI[]{URI
				.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredActivityNode/structuredNodeInput")});
		this.addAnnotation(this.getLoopNode_Result(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredActivityNode/structuredNodeOutput")});
		this.addAnnotation(this.getCreateLinkAction_EndData(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//LinkAction/endData")});
		this.addAnnotation(this.getOperationTemplateParameter_ParameteredElement(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/parameteredElement")});
		this.addAnnotation(this.getStateInvariant_Covered(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InteractionFragment/covered")});
		this.addAnnotation(this.getSendObjectAction_Request(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InvocationAction/argument")});
		this.addAnnotation(this.getDestroyLinkAction_EndData(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//LinkAction/endData")});
		this.addAnnotation(this.getSequenceNode_ExecutableNode(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//StructuredActivityNode/node")});
		this.addAnnotation(this.getOccurrenceSpecification_Covered(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InteractionFragment/covered")});
		this.addAnnotation(this.getIntervalConstraint_Specification(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Constraint/specification")});
		this.addAnnotation(this.getTimeInterval_Max(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Interval/max")});
		this.addAnnotation(this.getTimeInterval_Min(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Interval/min")});
		this.addAnnotation(this.getTimeConstraint_Specification(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//IntervalConstraint/specification__from_IntervalConstraint")});
		this.addAnnotation(this.getDurationInterval_Max(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Interval/max")});
		this.addAnnotation(this.getDurationInterval_Min(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Interval/min")});
		this.addAnnotation(this.getDurationConstraint_Specification(), source, new String[0], new URI[]{URI.createURI(
				"http://www.nomagic.com/magicdraw/UML/2.5.1#//IntervalConstraint/specification__from_IntervalConstraint")});
		this.addAnnotation(this.getExtension_OwnedEnd(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//Association/ownedEnd")});
		this.addAnnotation(this.getExtensionEnd_Lower(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//MultiplicityElement/lower")});
		this.addAnnotation(this.getExtensionEnd_Type(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TypedElement/type")});
		this.addAnnotation(this.getRedefinableTemplateSignature_Classifier(), source, new String[0],
				new URI[]{URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateSignature/template")});
		this.addAnnotation(this.getClassifierTemplateParameter_ParameteredElement(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/parameteredElement")});
		this.addAnnotation(this.getConnectableElementTemplateParameter_ParameteredElement(), source, new String[0],
				new URI[]{URI.createURI(
						"http://www.nomagic.com/magicdraw/UML/2.5.1#//TemplateParameter/parameteredElement")});
		this.addAnnotation(this.getEnumerationLiteral_Classifier(), source, new String[0], new URI[]{
				URI.createURI("http://www.nomagic.com/magicdraw/UML/2.5.1#//InstanceSpecification/classifier")});
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		this.addAnnotation(this.connectableElementEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.packageableElementEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.classifierEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.classEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.structuredActivityNodeEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.stateEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.regionEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.transitionEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.operationEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.createLinkActionEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.operationTemplateParameterEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.stateInvariantEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.destroyLinkActionEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.occurrenceSpecificationEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.intervalConstraintEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.timeIntervalEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.timeConstraintEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.durationIntervalEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.durationConstraintEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.extensionEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.extensionEndEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.classifierTemplateParameterEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.connectableElementTemplateParameterEClass, source, new String[0], new URI[0]);
		this.addAnnotation(this.enumerationLiteralEClass, source, new String[0], new URI[0]);
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createUnionAnnotations() {
		String source = "union";
		this.addAnnotation(this.getConnectableElement__structuredClassifierOfRole(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement__namespaceOfMember(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement_Namespace(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement_OwnedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement_Owner(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__relationshipOfRelatedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__directedRelationshipOfSource(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__directedRelationshipOfTarget(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getDirectedRelationship_Source(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getDirectedRelationship_Target(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getRelationship_RelatedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__redefinableElementOfRedefinitionContext(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getClassifier_Feature(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier_Attribute(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamespace_Member(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamespace_OwnedMember(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAction_Output(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAction_Input(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityNode_InGroup(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getRedefinableElement_RedefinedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getRedefinableElement__redefinableElementOfRedefinedElement(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getRedefinableElement_RedefinitionContext(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityEdge_InGroup(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityGroup_ContainedNode(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityGroup_Subgroup(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityGroup_SuperGroup(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityGroup_ContainedEdge(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInputPin__actionOfInput(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getFeature_FeaturingClassifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty_Classifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getStructuredClassifier_Role(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOutputPin__actionOfOutput(), source, new String[0], new URI[0]);
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createMdContainmentAnnotations() {
		String source = "mdContainment";
		this.addAnnotation(this.getElement_OwnedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamespace_OwnedMember(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProfile_MetamodelReference(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProfile_MetaclassReference(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPackage_NestedPackage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPackage_OwnedStereotype(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPackage_OwnedType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior_Postcondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior_Precondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAction_Output(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAction_Input(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivity_StructuredNode(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityGroup_Subgroup(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getState_StateInvariant(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getTransition_Guard(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProtocolTransition_PreCondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProtocolTransition_PostCondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOperation_BodyCondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOperation_Postcondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOperation_Precondition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getEncapsulatedClassifier_OwnedPort(), source, new String[0], new URI[0]);
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	protected void createMdTransientAnnotations() {
		String source = "mdTransient";
		this.addAnnotation(this.getVariable__variableActionOfVariable(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getConnectableElement_End(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getConnectableElement__collaborationOfCollaborationRole(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getConnectableElement__lifelineOfRepresents(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement__messageOfSignature(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement_ClientDependency(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement_SupplierDependency(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement__informationFlowOfInformationSource(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getNamedElement__informationFlowOfInformationTarget(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getNamedElement__considerIgnoreFragmentOfMessage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement__timeObservationOfEvent(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getNamedElement__durationObservationOfEvent(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__commentOfAnnotatedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__elementOfSyncElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__activityPartitionOfRepresents(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__diagramOfContext(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getElement__elementValueOfElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInstanceSpecification__instanceValueOfInstance(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPackageableElement__elementImportOfImportedElement(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getPackageableElement__manifestationOfUtilizedElement(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getParameterableElement__templateParameterOfDefault(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getParameterableElement__templateParameterSubstitutionOfActual(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getTemplateParameter__templateSignatureOfParameter(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getTemplateParameter__templateParameterSubstitutionOfFormal(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getTemplateSignature__templateBindingOfSignature(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getRelationship__abstraction(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__readExtentActionOfClassifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__createObjectActionOfClassifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__unmarshallActionOfUnmarshallType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__readIsClassifiedObjectActionOfClassifier(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getClassifier__componentRealizationOfRealizingClassifier(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getClassifier__exceptionHandlerOfExceptionType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__reclassifyObjectActionOfNewClassifier(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getClassifier__reclassifyObjectActionOfOldClassifier(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getClassifier__generalizationOfGeneral(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__classifierOfRedefinedClassifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__substitutionOfContract(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__classifierTemplateParameterOfConstrainingClassifier(), source,
				new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__informationItemOfRepresented(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__instanceSpecificationOfClassifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getClassifier__informationFlowOfConveyed(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProfile__profileApplicationOfAppliedProfile(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPackage__packageMergeOfMergedPackage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPackage__packageImportOfImportedPackage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getStereotype__extensionEndOfType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__connectorOfContract(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__reduceActionOfReducer(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__opaqueExpressionOfBehavior(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__objectNodeOfSelection(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__behaviorOfRedefinedBehavior(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__objectFlowOfTransformation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__objectFlowOfSelection(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__decisionNodeOfDecisionInput(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__behaviorExecutionSpecificationOfBehavior(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getBehavior__callBehaviorActionOfBehavior(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getBehavior__behavioredClassifierOfClassifierBehavior(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getParameter__activityParameterNodeOfParameter(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getValueSpecification__intervalOfMax(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getValueSpecification__intervalOfMin(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getLifeline__stateInvariantOfCovered(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getLifeline__occurrenceSpecificationOfCovered(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInteraction__interactionUseOfRefersTo(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAction__actionExecutionSpecificationOfAction(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutableNode__clauseOfBody(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutableNode__clauseOfTest(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutableNode__loopNodeOfBodyPart(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutableNode__loopNodeOfSetupPart(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutableNode__loopNodeOfTest(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutableNode__exceptionHandlerOfHandlerBody(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityNode__activityNodeOfRedefinedNode(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityEdge__activityEdgeOfRedefinedEdge(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getActivityEdge__informationFlowOfRealizingActivityEdge(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getActivityPartition__activityOfPartition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInputPin__qualifierValueOfValue(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInputPin__linkEndDataOfValue(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInputPin__linkEndCreationDataOfInsertAt(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInputPin__linkEndDestructionDataOfDestroyAt(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getObjectNode__exceptionHandlerOfExceptionInput(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getVertex___vertexOfRedefinedVertex(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getState__objectNodeOfInState(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getVertex_Outgoing(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getVertex_Incoming(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getRegion__regionOfExtendedRegion(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getStateMachine__stateMachineOfExtendedStateMachine(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getPseudostate__connectionPointReferenceOfExit(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPseudostate__connectionPointReferenceOfEntry(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getTransition__transitionOfRedefinedTransition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getConstraint_ConstrainedElement(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getUseCase__includeOfAddition(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getUseCase__extendOfExtendedCase(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExtensionPoint_Extension(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOperation__operationOfRedefinedOperation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOperation__callOperationActionOfOperation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOperation__callEventOfOperation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getType__typedElementOfType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getType__operationOfRaisedException(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getType__behavioralFeatureOfRaisedException(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAssociation__connectorOfType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getAssociation__clearAssociationActionOfAssociation(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getProperty__connectorEndOfPartWithPort(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__linkEndDataOfEnd(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__qualifierValueOfQualifier(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__readLinkObjectEndActionOfEnd(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__readLinkObjectEndQualifierActionOfQualifier(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getProperty__propertyOfRedefinedProperty(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__propertyOfSubsettedProperty(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__associationOfNavigableOwnedEnd(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProperty__interactionUseOfReturnValueRecipient(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getStructuralFeature__slotOfDefiningFeature(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getStructuralFeature__structuralFeatureActionOfStructuralFeature(), source,
				new String[0], new URI[0]);
		this.addAnnotation(this.getInterface__interfaceOfRedefinedInterface(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getInterface__interfaceRealizationOfContract(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getSignal__signalEventOfSignal(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getSignal__sendSignalActionOfSignal(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getSignal__broadcastSignalActionOfSignal(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getSignal__receptionOfSignal(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getEvent__triggerOfEvent(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getTrigger__replyActionOfReplyToCall(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPort__portOfRedefinedPort(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPort__invocationActionOfOnPort(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getPort__triggerOfPort(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getProtocolStateMachine__protocolConformanceOfGeneralMachine(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getProtocolStateMachine__portOfProtocol(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getConnector__connectorOfRedefinedConnector(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getConnector__messageOfConnector(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getConnector__informationFlowOfRealizingConnector(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getMessage__messageEndOfMessage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getMessage__messageOfReplyMessage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getMessage__informationFlowOfRealizingMessage(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getMessageEnd__messageOfSendEvent(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getMessageEnd__messageOfReceiveEvent(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOutputPin__clauseOfBodyOutput(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOutputPin__clauseOfDecider(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOutputPin__loopNodeOfBodyOutput(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getOutputPin__loopNodeOfDecider(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getCollaborationUse__classifierOfRepresentation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getCollaboration__collaborationUseOfType(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getDeployedArtifact__deploymentOfDeployedArtifact(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getGate__gateOfFormalGate(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getExecutionSpecification__executionOccurrenceSpecificationOfExecution(), source,
				new String[0], new URI[0]);
		this.addAnnotation(this.getOccurrenceSpecification__executionSpecificationOfStart(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getOccurrenceSpecification__executionSpecificationOfFinish(), source, new String[0],
				new URI[0]);
		this.addAnnotation(this.getPartDecomposition__lifelineOfDecomposedAs(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getDuration__durationIntervalOfMin(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getDuration__durationIntervalOfMax(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getObservation__timeExpressionOfObservation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getObservation__durationOfObservation(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getTimeExpression__timeIntervalOfMin(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getTimeExpression__timeIntervalOfMax(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getObjectFlow__decisionNodeOfDecisionInputFlow(), source, new String[0], new URI[0]);
		this.addAnnotation(this.getRedefinableTemplateSignature__redefinableTemplateSignatureOfExtendedSignature(),
				source, new String[0], new URI[0]);
	}

	public String getPrivateFeatureName(EClass containingClass, String publicFeatureName) {
		if (this.publicToPrivate == null) {
			throw new IllegalStateException("UMLPackage is not initialized.");
		} else {
			Map<String, String> map = (Map) this.publicToPrivate.get(containingClass);
			if (map == null) {
				return publicFeatureName;
			} else {
				String privateName = (String) map.get(publicFeatureName);
				return privateName == null ? publicFeatureName : privateName;
			}
		}
	}

	@InternalApi(reason = "No Magic internal API. This code can change without any notification.")
	@Deprecated
	public List<EStructuralFeature> getMDTransientStructuralFeatures() {
		return this.mdTransientStructuralFeatures;
	}

	private void initPublicToPrivate() {
		this.publicToPrivate = new IdentityHashMap();
		Collection<EClass> allClasses = new HashSet();
		UML2ModelUtil.collectEAllClasses(this, allClasses);
		Iterator var3 = allClasses.iterator();

		while (var3.hasNext()) {
			EClass eClass = (EClass) var3.next();
			Iterator var5 = eClass.getEAllStructuralFeatures().iterator();

			while (var5.hasNext()) {
				EStructuralFeature feature = (EStructuralFeature) var5.next();
				if (UML2ModelUtil.isRenamed(feature)) {
					String privateName = feature.getName();
					String publicFeatureName = UML2ModelUtil.getPublicFeatureName(feature);
					Map<String, String> map = (Map) this.publicToPrivate.get(eClass);
					if (map == null) {
						map = new HashMap();
						this.publicToPrivate.put(eClass, map);
					}

					((Map) map).put(publicFeatureName, privateName);
				}
			}
		}

	}

	private void initMDTransientStructuralFeatures() {
		this.mdTransientStructuralFeatures = new ArrayList();
		this.mdTransientStructuralFeatures.add(this.getVariable__variableActionOfVariable());
		this.mdTransientStructuralFeatures.add(this.getConnectableElement_End());
		this.mdTransientStructuralFeatures.add(this.getConnectableElement__collaborationOfCollaborationRole());
		this.mdTransientStructuralFeatures.add(this.getConnectableElement__lifelineOfRepresents());
		this.mdTransientStructuralFeatures.add(this.getNamedElement__messageOfSignature());
		this.mdTransientStructuralFeatures.add(this.getNamedElement_ClientDependency());
		this.mdTransientStructuralFeatures.add(this.getNamedElement_SupplierDependency());
		this.mdTransientStructuralFeatures.add(this.getNamedElement__informationFlowOfInformationSource());
		this.mdTransientStructuralFeatures.add(this.getNamedElement__informationFlowOfInformationTarget());
		this.mdTransientStructuralFeatures.add(this.getNamedElement__considerIgnoreFragmentOfMessage());
		this.mdTransientStructuralFeatures.add(this.getNamedElement__timeObservationOfEvent());
		this.mdTransientStructuralFeatures.add(this.getNamedElement__durationObservationOfEvent());
		this.mdTransientStructuralFeatures.add(this.getElement__commentOfAnnotatedElement());
		this.mdTransientStructuralFeatures.add(this.getElement__elementOfSyncElement());
		this.mdTransientStructuralFeatures.add(this.getElement__activityPartitionOfRepresents());
		this.mdTransientStructuralFeatures.add(this.getElement__diagramOfContext());
		this.mdTransientStructuralFeatures.add(this.getElement__elementValueOfElement());
		this.mdTransientStructuralFeatures.add(this.getInstanceSpecification__instanceValueOfInstance());
		this.mdTransientStructuralFeatures.add(this.getPackageableElement__elementImportOfImportedElement());
		this.mdTransientStructuralFeatures.add(this.getPackageableElement__manifestationOfUtilizedElement());
		this.mdTransientStructuralFeatures.add(this.getParameterableElement__templateParameterOfDefault());
		this.mdTransientStructuralFeatures.add(this.getParameterableElement__templateParameterSubstitutionOfActual());
		this.mdTransientStructuralFeatures.add(this.getTemplateParameter__templateSignatureOfParameter());
		this.mdTransientStructuralFeatures.add(this.getTemplateParameter__templateParameterSubstitutionOfFormal());
		this.mdTransientStructuralFeatures.add(this.getTemplateSignature__templateBindingOfSignature());
		this.mdTransientStructuralFeatures.add(this.getRelationship__abstraction());
		this.mdTransientStructuralFeatures.add(this.getClassifier__readExtentActionOfClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__createObjectActionOfClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__unmarshallActionOfUnmarshallType());
		this.mdTransientStructuralFeatures.add(this.getClassifier__readIsClassifiedObjectActionOfClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__componentRealizationOfRealizingClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__exceptionHandlerOfExceptionType());
		this.mdTransientStructuralFeatures.add(this.getClassifier__reclassifyObjectActionOfNewClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__reclassifyObjectActionOfOldClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__generalizationOfGeneral());
		this.mdTransientStructuralFeatures.add(this.getClassifier__classifierOfRedefinedClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__substitutionOfContract());
		this.mdTransientStructuralFeatures
				.add(this.getClassifier__classifierTemplateParameterOfConstrainingClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__informationItemOfRepresented());
		this.mdTransientStructuralFeatures.add(this.getClassifier__instanceSpecificationOfClassifier());
		this.mdTransientStructuralFeatures.add(this.getClassifier__informationFlowOfConveyed());
		this.mdTransientStructuralFeatures.add(this.getProfile__profileApplicationOfAppliedProfile());
		this.mdTransientStructuralFeatures.add(this.getPackage__packageMergeOfMergedPackage());
		this.mdTransientStructuralFeatures.add(this.getPackage__packageImportOfImportedPackage());
		this.mdTransientStructuralFeatures.add(this.getStereotype__extensionEndOfType());
		this.mdTransientStructuralFeatures.add(this.getBehavior__connectorOfContract());
		this.mdTransientStructuralFeatures.add(this.getBehavior__reduceActionOfReducer());
		this.mdTransientStructuralFeatures.add(this.getBehavior__opaqueExpressionOfBehavior());
		this.mdTransientStructuralFeatures.add(this.getBehavior__objectNodeOfSelection());
		this.mdTransientStructuralFeatures.add(this.getBehavior__behaviorOfRedefinedBehavior());
		this.mdTransientStructuralFeatures.add(this.getBehavior__objectFlowOfTransformation());
		this.mdTransientStructuralFeatures.add(this.getBehavior__objectFlowOfSelection());
		this.mdTransientStructuralFeatures.add(this.getBehavior__decisionNodeOfDecisionInput());
		this.mdTransientStructuralFeatures.add(this.getBehavior__behaviorExecutionSpecificationOfBehavior());
		this.mdTransientStructuralFeatures.add(this.getBehavior__callBehaviorActionOfBehavior());
		this.mdTransientStructuralFeatures.add(this.getBehavior__behavioredClassifierOfClassifierBehavior());
		this.mdTransientStructuralFeatures.add(this.getParameter__activityParameterNodeOfParameter());
		this.mdTransientStructuralFeatures.add(this.getValueSpecification__intervalOfMax());
		this.mdTransientStructuralFeatures.add(this.getValueSpecification__intervalOfMin());
		this.mdTransientStructuralFeatures.add(this.getLifeline__stateInvariantOfCovered());
		this.mdTransientStructuralFeatures.add(this.getLifeline__occurrenceSpecificationOfCovered());
		this.mdTransientStructuralFeatures.add(this.getInteraction__interactionUseOfRefersTo());
		this.mdTransientStructuralFeatures.add(this.getAction__actionExecutionSpecificationOfAction());
		this.mdTransientStructuralFeatures.add(this.getExecutableNode__clauseOfBody());
		this.mdTransientStructuralFeatures.add(this.getExecutableNode__clauseOfTest());
		this.mdTransientStructuralFeatures.add(this.getExecutableNode__loopNodeOfBodyPart());
		this.mdTransientStructuralFeatures.add(this.getExecutableNode__loopNodeOfSetupPart());
		this.mdTransientStructuralFeatures.add(this.getExecutableNode__loopNodeOfTest());
		this.mdTransientStructuralFeatures.add(this.getExecutableNode__exceptionHandlerOfHandlerBody());
		this.mdTransientStructuralFeatures.add(this.getActivityNode__activityNodeOfRedefinedNode());
		this.mdTransientStructuralFeatures.add(this.getActivityEdge__activityEdgeOfRedefinedEdge());
		this.mdTransientStructuralFeatures.add(this.getActivityEdge__informationFlowOfRealizingActivityEdge());
		this.mdTransientStructuralFeatures.add(this.getActivityPartition__activityOfPartition());
		this.mdTransientStructuralFeatures.add(this.getInputPin__qualifierValueOfValue());
		this.mdTransientStructuralFeatures.add(this.getInputPin__linkEndDataOfValue());
		this.mdTransientStructuralFeatures.add(this.getInputPin__linkEndCreationDataOfInsertAt());
		this.mdTransientStructuralFeatures.add(this.getInputPin__linkEndDestructionDataOfDestroyAt());
		this.mdTransientStructuralFeatures.add(this.getObjectNode__exceptionHandlerOfExceptionInput());
		this.mdTransientStructuralFeatures.add(this.getVertex___vertexOfRedefinedVertex());
		this.mdTransientStructuralFeatures.add(this.getState__objectNodeOfInState());
		this.mdTransientStructuralFeatures.add(this.getVertex_Outgoing());
		this.mdTransientStructuralFeatures.add(this.getVertex_Incoming());
		this.mdTransientStructuralFeatures.add(this.getRegion__regionOfExtendedRegion());
		this.mdTransientStructuralFeatures.add(this.getStateMachine__stateMachineOfExtendedStateMachine());
		this.mdTransientStructuralFeatures.add(this.getPseudostate__connectionPointReferenceOfExit());
		this.mdTransientStructuralFeatures.add(this.getPseudostate__connectionPointReferenceOfEntry());
		this.mdTransientStructuralFeatures.add(this.getTransition__transitionOfRedefinedTransition());
		this.mdTransientStructuralFeatures.add(this.getConstraint_ConstrainedElement());
		this.mdTransientStructuralFeatures.add(this.getUseCase__includeOfAddition());
		this.mdTransientStructuralFeatures.add(this.getUseCase__extendOfExtendedCase());
		this.mdTransientStructuralFeatures.add(this.getExtensionPoint_Extension());
		this.mdTransientStructuralFeatures.add(this.getOperation__operationOfRedefinedOperation());
		this.mdTransientStructuralFeatures.add(this.getOperation__callOperationActionOfOperation());
		this.mdTransientStructuralFeatures.add(this.getOperation__callEventOfOperation());
		this.mdTransientStructuralFeatures.add(this.getType__typedElementOfType());
		this.mdTransientStructuralFeatures.add(this.getType__operationOfRaisedException());
		this.mdTransientStructuralFeatures.add(this.getType__behavioralFeatureOfRaisedException());
		this.mdTransientStructuralFeatures.add(this.getAssociation__connectorOfType());
		this.mdTransientStructuralFeatures.add(this.getAssociation__clearAssociationActionOfAssociation());
		this.mdTransientStructuralFeatures.add(this.getProperty__connectorEndOfPartWithPort());
		this.mdTransientStructuralFeatures.add(this.getProperty__linkEndDataOfEnd());
		this.mdTransientStructuralFeatures.add(this.getProperty__qualifierValueOfQualifier());
		this.mdTransientStructuralFeatures.add(this.getProperty__readLinkObjectEndActionOfEnd());
		this.mdTransientStructuralFeatures.add(this.getProperty__readLinkObjectEndQualifierActionOfQualifier());
		this.mdTransientStructuralFeatures.add(this.getProperty__propertyOfRedefinedProperty());
		this.mdTransientStructuralFeatures.add(this.getProperty__propertyOfSubsettedProperty());
		this.mdTransientStructuralFeatures.add(this.getProperty__associationOfNavigableOwnedEnd());
		this.mdTransientStructuralFeatures.add(this.getProperty__interactionUseOfReturnValueRecipient());
		this.mdTransientStructuralFeatures.add(this.getStructuralFeature__slotOfDefiningFeature());
		this.mdTransientStructuralFeatures.add(this.getStructuralFeature__structuralFeatureActionOfStructuralFeature());
		this.mdTransientStructuralFeatures.add(this.getInterface__interfaceOfRedefinedInterface());
		this.mdTransientStructuralFeatures.add(this.getInterface__interfaceRealizationOfContract());
		this.mdTransientStructuralFeatures.add(this.getSignal__signalEventOfSignal());
		this.mdTransientStructuralFeatures.add(this.getSignal__sendSignalActionOfSignal());
		this.mdTransientStructuralFeatures.add(this.getSignal__broadcastSignalActionOfSignal());
		this.mdTransientStructuralFeatures.add(this.getSignal__receptionOfSignal());
		this.mdTransientStructuralFeatures.add(this.getEvent__triggerOfEvent());
		this.mdTransientStructuralFeatures.add(this.getTrigger__replyActionOfReplyToCall());
		this.mdTransientStructuralFeatures.add(this.getPort__portOfRedefinedPort());
		this.mdTransientStructuralFeatures.add(this.getPort__invocationActionOfOnPort());
		this.mdTransientStructuralFeatures.add(this.getPort__triggerOfPort());
		this.mdTransientStructuralFeatures.add(this.getProtocolStateMachine__protocolConformanceOfGeneralMachine());
		this.mdTransientStructuralFeatures.add(this.getProtocolStateMachine__portOfProtocol());
		this.mdTransientStructuralFeatures.add(this.getConnector__connectorOfRedefinedConnector());
		this.mdTransientStructuralFeatures.add(this.getConnector__messageOfConnector());
		this.mdTransientStructuralFeatures.add(this.getConnector__informationFlowOfRealizingConnector());
		this.mdTransientStructuralFeatures.add(this.getMessage__messageEndOfMessage());
		this.mdTransientStructuralFeatures.add(this.getMessage__messageOfReplyMessage());
		this.mdTransientStructuralFeatures.add(this.getMessage__informationFlowOfRealizingMessage());
		this.mdTransientStructuralFeatures.add(this.getMessageEnd__messageOfSendEvent());
		this.mdTransientStructuralFeatures.add(this.getMessageEnd__messageOfReceiveEvent());
		this.mdTransientStructuralFeatures.add(this.getOutputPin__clauseOfBodyOutput());
		this.mdTransientStructuralFeatures.add(this.getOutputPin__clauseOfDecider());
		this.mdTransientStructuralFeatures.add(this.getOutputPin__loopNodeOfBodyOutput());
		this.mdTransientStructuralFeatures.add(this.getOutputPin__loopNodeOfDecider());
		this.mdTransientStructuralFeatures.add(this.getCollaborationUse__classifierOfRepresentation());
		this.mdTransientStructuralFeatures.add(this.getCollaboration__collaborationUseOfType());
		this.mdTransientStructuralFeatures.add(this.getDeployedArtifact__deploymentOfDeployedArtifact());
		this.mdTransientStructuralFeatures.add(this.getGate__gateOfFormalGate());
		this.mdTransientStructuralFeatures
				.add(this.getExecutionSpecification__executionOccurrenceSpecificationOfExecution());
		this.mdTransientStructuralFeatures.add(this.getOccurrenceSpecification__executionSpecificationOfStart());
		this.mdTransientStructuralFeatures.add(this.getOccurrenceSpecification__executionSpecificationOfFinish());
		this.mdTransientStructuralFeatures.add(this.getPartDecomposition__lifelineOfDecomposedAs());
		this.mdTransientStructuralFeatures.add(this.getDuration__durationIntervalOfMin());
		this.mdTransientStructuralFeatures.add(this.getDuration__durationIntervalOfMax());
		this.mdTransientStructuralFeatures.add(this.getObservation__timeExpressionOfObservation());
		this.mdTransientStructuralFeatures.add(this.getObservation__durationOfObservation());
		this.mdTransientStructuralFeatures.add(this.getTimeExpression__timeIntervalOfMin());
		this.mdTransientStructuralFeatures.add(this.getTimeExpression__timeIntervalOfMax());
		this.mdTransientStructuralFeatures.add(this.getObjectFlow__decisionNodeOfDecisionInputFlow());
		this.mdTransientStructuralFeatures
				.add(this.getRedefinableTemplateSignature__redefinableTemplateSignatureOfExtendedSignature());
		this.mdTransientStructuralFeatures = Collections.unmodifiableList(this.mdTransientStructuralFeatures);
	}
}