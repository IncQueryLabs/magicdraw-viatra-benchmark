# The MagicDraw VIATRA Query performance benchmark

This benchmark is intended to showcase the performance of the [VIATRA](http://eclipse.org/viatra) [Query](https://wiki.eclipse.org/VIATRA/Query) engine when run directly on MagicDraw SysML models, through the EMF interface.

## Master-SysML branch

This branch contains SysML validation queries to be used in the benchmarks. Detailed information about the SysML validation rules can be found at [incquery-sysml-validation](https://github.com/IncQueryLabs/incquery-sysml-validation).

## Getting Started

### Cloning this repository

Use the green "Clone or download" link on the GitHub web to clone the repository and get the source.

From now on, the folder that contains this README.md file on your computer is called `WORKSPACE_BENCHMARK`

```bash
export WORKSPACE_BENCHMARK`=c:/git/magicdraw-viatra-benchmark
```

### Get the instance models



You need to get a set of instance models (`mdzip` files) that the benchmark runs on.

From now on, the folder that contains models on your computer is called `MODEL_LOCATION` 

```bash
export MODEL_LOCATION`=c:/models-tmt/
```

You can download the models from this link: http://static.incquerylabs.com/projects/magicdraw/benchmark/models/models-tmt.zip

### Running the benchmark

After you clone this repository, you can run the benchmark by executing the following `./benchmark.sh` in the `WORKSPACE_BENCHMARK` folder:

In addition, you need to have Gradle and Java installed to run the build.
The results of the benchmark will be available in the `com.incquerylabs.benchmark.test/results` folder.

### Create diagrams from results

Reporting is done using the [MONDO-SAM](https://github.com/FTSRG/mondo-sam/) tool, we are using the 0.1-maintenance branch.
MONDO-SAM requires [R](https://www.r-project.org/) and [Python 3](https://www.python.org/) to be installed and available in your PATH.
You can find information on how to setup MONDO-SAM on their repository.

The following script downloads MONDO-SAM, converts the results from `com.incquerylabs.benchmark.test/results/<query>` to `benchmark/results` then generates the diagrams to `benchmark/diagrams`:

You need to set the `WORKSPACE_BENCHMARK` environment variable to the repository root.

### Configuring the benchmark

By default, the benchmark runs on a very small subset of queries, with the smallest model and only once per measurement.
This behaviour is configured by four variables and affects how `com.incquerylabs.benchmark.test/run.sh` behaves:

The name of the variables and their possible values are the following:
* `BENCHMARK_ENGINES`: Which query engine implementations to measure
  * Default (all possible values): `RETE, LOCAL_SEARCH, LOCAL_SEARCH_HINTS-CONDITION_FIRST, LOCAL_SEARCH_HINTS-TC_FIRST, HYBRID`
* `BENCHMARK_QUERIES`: Which queries to measure - `all` is a special value to run the queries at once in the same MagicDraw instance
  * Default: `rateNotStreaming`
  * Possible values: `all, rateNotStreaming, boundReferenceNotReferenceOrValueProperty, participantPropertyNotBlock, flowPortDeprecated, activityStreamingNoNStreaming, requirementIdNotUnique, proxyPortTypeNotInterfaceBlock, propertySpecificTypeNotOwnedByBlock, allocateNotSingleClient, interfaceBlockPortInvalidType, adjunctPropertyConnectorNotAssociationBlock, viewStakeholderNotDerivedFromConform, participantPropertyAggregationKindNotNone, optionalLowerNotZero, adjunctPropertyIncorrectMultiplicity, proxyPortSubportNotProxyPort, deriveReqtClientNotReqt, parameterDiscreteAndContinuous, adjunctPropertySubmachineOrInteraction, classifierBehaviorPropertyInvalidOwner, blockAssociationNotBinary, noBufferAndOverwrite, allocateActivityPartitionActionsOnClientEnds, partPropertyInvalidType, adjunctPropertyNotComposite, endPathMiultiplicityNotRedefiniton, valueTypeSpecializatonNotValueType, acsfeActionOneTrigger, requirementInAssociation, connectorPropertyNotOwnedOrInherited, itemFlowInvalidType, copyClientNotRequirement, proxyPortFullPort, adjunctPropertyInvalidPrincipalKind, satisfySupplierNotRequirement, triggerOnNestedPortNotSinglePort, changeStructuralFeatureEventStatic, propertySpecificTypeNotOneProperty, itemFlowItemPropertyDifferentName, triggerOnNestedPortFullPort, adjunctPropertyIncompatibleType, itemFlowDifferentType, refineNotSingleSupplier, requirementHasOperation, blockSpecializationNotBlock, flowSpecificationInvalidApplication, viewpointNoCreate, acsfeActionNotTwoResultpins, activityEdgeDiscreteAndContinuous, boundReferenceNotConnectorEnd, participantPropertyEndOwner, viewViewpointNotDerivedFromConform, participantPropertyDifferentType, valueTypeValuePropertyNotComposite, referencePropertyInvalidType, endPathMiultiplicityNegative, classifierBehaviorPropertyInvalidType, constraintBlockSpecializationNotConstraintBlock, itemFlowAssociationHasItemProperty, traceNotSingleClient, participantPropertyMultiplicity, acsfeActionIncorrectResultpins, notBinaryConnector, classifierBehaviorPropertyNotComposite, changeStructuralFeatureEventFeatureMultiplicity, conformGeneralNotViewpoint, flowPropertyInvalidType, refineNotSingleClient, interfaceBlockIsConjugated, triggerOnNestedPortBaseFullPort, viewNotSingleViewpoint, flowPortOwnerNotBlock, boundReferenceNotOrdered, direcredFeatureInvalidStereotype, deriveReqtSupplierNotReqt, adjunctPropertyCallActionInconsistent, acsfeActionInvalidTrigger, conformSpecificNotView, adjunctPropertyWrongName, stakeHolderInvalidStereotype, blockValuePropertyNotComposite, constraintBlockPropertyNotComposite, adjunctPropertyMultiplicityRestrictive, sharedPropertyInvalidType, flowSpecificationDeprecated, allocateNotSingleSupplier, traceNotSingleSupplier, copyMultipleCopies, requirementNestedClassifierNotRequirement, exposeClientNotView, requirementInGeneralization, participationPropertyNotAssociation, copySupplierNotRequirement, controlOperatorOperationMethod, invocationOnNestedPortActionOnPortUndefined, verifySupplierNotRequirement, interfaceBlockInvalidInheritance, boundReferenceRedefined, connectorPropertyNotBlock, distributedPropertyNotBlockOrValueType, fullPortIsBehavioral, connectionPropertyDifferentName, optionalLowerZero, requirementHasAttribute, adjunctPropertyConnectorPropertyInconsistent, probabilityInvalidStereotype, boundReferenceUnique, copyCycle, boundReferenceOpposite, connectorPropertyNotComposite, requirementAsType, participantPropertyIsMemberEndOfAssociation, connectionPropertyNotTypedByAssociationBlock, valuePropertyNotValueType, fullPortBoundToFullPort, probabilityAllOutgoingEdges`
* `BENCHMARK_QUERIES_EXCLUDE`: Which queries to exclude from measure
  * Default: `adjunctPropertyMultiplicityRestrictive, requirementIdNotUnique, adjunctPropertyCallActionInconsistent`
  * Possible values: `rateNotStreaming, boundReferenceNotReferenceOrValueProperty, participantPropertyNotBlock, flowPortDeprecated, activityStreamingNoNStreaming, requirementIdNotUnique, proxyPortTypeNotInterfaceBlock, propertySpecificTypeNotOwnedByBlock, allocateNotSingleClient, interfaceBlockPortInvalidType, adjunctPropertyConnectorNotAssociationBlock, viewStakeholderNotDerivedFromConform, participantPropertyAggregationKindNotNone, optionalLowerNotZero, adjunctPropertyIncorrectMultiplicity, proxyPortSubportNotProxyPort, deriveReqtClientNotReqt, parameterDiscreteAndContinuous, adjunctPropertySubmachineOrInteraction, classifierBehaviorPropertyInvalidOwner, blockAssociationNotBinary, noBufferAndOverwrite, allocateActivityPartitionActionsOnClientEnds, partPropertyInvalidType, adjunctPropertyNotComposite, endPathMiultiplicityNotRedefiniton, valueTypeSpecializatonNotValueType, acsfeActionOneTrigger, requirementInAssociation, connectorPropertyNotOwnedOrInherited, itemFlowInvalidType, copyClientNotRequirement, proxyPortFullPort, adjunctPropertyInvalidPrincipalKind, satisfySupplierNotRequirement, triggerOnNestedPortNotSinglePort, changeStructuralFeatureEventStatic, propertySpecificTypeNotOneProperty, itemFlowItemPropertyDifferentName, triggerOnNestedPortFullPort, adjunctPropertyIncompatibleType, itemFlowDifferentType, refineNotSingleSupplier, requirementHasOperation, blockSpecializationNotBlock, flowSpecificationInvalidApplication, viewpointNoCreate, acsfeActionNotTwoResultpins, activityEdgeDiscreteAndContinuous, boundReferenceNotConnectorEnd, participantPropertyEndOwner, viewViewpointNotDerivedFromConform, participantPropertyDifferentType, valueTypeValuePropertyNotComposite, referencePropertyInvalidType, endPathMiultiplicityNegative, classifierBehaviorPropertyInvalidType, constraintBlockSpecializationNotConstraintBlock, itemFlowAssociationHasItemProperty, traceNotSingleClient, participantPropertyMultiplicity, acsfeActionIncorrectResultpins, notBinaryConnector, classifierBehaviorPropertyNotComposite, changeStructuralFeatureEventFeatureMultiplicity, conformGeneralNotViewpoint, flowPropertyInvalidType, refineNotSingleClient, interfaceBlockIsConjugated, triggerOnNestedPortBaseFullPort, viewNotSingleViewpoint, flowPortOwnerNotBlock, boundReferenceNotOrdered, direcredFeatureInvalidStereotype, deriveReqtSupplierNotReqt, adjunctPropertyCallActionInconsistent, acsfeActionInvalidTrigger, conformSpecificNotView, adjunctPropertyWrongName, stakeHolderInvalidStereotype, blockValuePropertyNotComposite, constraintBlockPropertyNotComposite, adjunctPropertyMultiplicityRestrictive, sharedPropertyInvalidType, flowSpecificationDeprecated, allocateNotSingleSupplier, traceNotSingleSupplier, copyMultipleCopies, requirementNestedClassifierNotRequirement, exposeClientNotView, requirementInGeneralization, participationPropertyNotAssociation, copySupplierNotRequirement, controlOperatorOperationMethod, invocationOnNestedPortActionOnPortUndefined, verifySupplierNotRequirement, interfaceBlockInvalidInheritance, boundReferenceRedefined, connectorPropertyNotBlock, distributedPropertyNotBlockOrValueType, fullPortIsBehavioral, connectionPropertyDifferentName, optionalLowerZero, requirementHasAttribute, adjunctPropertyConnectorPropertyInconsistent, probabilityInvalidStereotype, boundReferenceUnique, copyCycle, boundReferenceOpposite, connectorPropertyNotComposite, requirementAsType, participantPropertyIsMemberEndOfAssociation, connectionPropertyNotTypedByAssociationBlock, valuePropertyNotValueType, fullPortBoundToFullPort, probabilityAllOutgoingEdges`
* `BENCHMARK_SIZES`: Which models to measure
  * Default: `5000`
  * Possible values: `300000, 540000, 780000, 1040000, 1200000`
* `BENCHMARK_RUNS`: How many times the measurements should be run for each configuration
  * Default: `1`
  
You can either set this in environment variables before running the benchmark or modify the `run.sh` script directly.

<!-- end of Getting started (only edit outside of section, please) -->

## Repository structure
* [Benchmark plugin](https://github.com/IncQueryLabs/magicdraw-viatra-benchmark/tree/master/com.incquerylabs.magicdraw.benchmark/src/com/incquerylabs/magicdraw/benchmark)
  * [Benchmark queries](https://github.com/IncQueryLabs/magicdraw-viatra-benchmark/tree/master/com.incquerylabs.magicdraw.benchmark/src/com/incquerylabs/magicdraw/benchmark/queries) 
  * [Benchmark plugin entry point](https://github.com/IncQueryLabs/magicdraw-viatra-benchmark/blob/master/com.incquerylabs.magicdraw.benchmark/src/com/incquerylabs/magicdraw/benchmark/MagicDrawPerformancePlugin.java)
  * [Benchmark execution script](https://github.com/IncQueryLabs/magicdraw-viatra-benchmark/blob/master/com.incquerylabs.magicdraw.benchmark/run.sh)
* [Report generation](https://github.com/IncQueryLabs/magicdraw-viatra-benchmark/tree/master/benchmark)

## [Benchmark details and results wiki page](https://github.com/IncQueryLabs/magicdraw-viatra-benchmark/wiki/MagicDraw-VIATRA-benchmark-results)
