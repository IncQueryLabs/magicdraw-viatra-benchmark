#!/bin/bash

if [ -z "$MD_HOME" ]; then
    export MD_HOME=$(pwd)/com.incquerylabs.magicdraw.benchmark/build/install
fi
 
if [ "$OS" = Windows_NT ]; then
    md_home_url_leader=$(echo "$MD_HOME" | sed -e 's/^/\//' -e 's/ /%20/g' -e 's/\\/\//g')
    md_home_url_base=$(echo "$MD_HOME" | sed -e 's/:/%3A/g' -e 's/ /%20/g' \
                                                    -e 's/\//%2F/g' -e 's/\\/%5C/g')
    cp_delim=";"
else
    md_home_url_leader=$(echo "$MD_HOME" | sed -e 's/ /%20/g')
    md_home_url_base=$(echo "$MD_HOME" | sed -e 's/ /%20/g')
    cp_delim=":"
fi
 
md_cp_url=file:$md_home_url_leader/bin/magicdraw.properties?base=$md_home_url_base#CLASSPATH
 
OSGI_LAUNCHER=$(echo "$MD_HOME"/lib/com.nomagic.osgi.launcher-*.jar)
OSGI_FRAMEWORK=$(echo "$MD_HOME"/lib/bundles/org.eclipse.osgi_*.jar)
MD_OSGI_FRAGMENT=$(echo "$MD_HOME"/lib/bundles/com.nomagic.magicdraw.osgi.fragment_*.jar)
 

CP="${OSGI_LAUNCHER}${cp_delim}${OSGI_FRAMEWORK}${cp_delim}${MD_OSGI_FRAGMENT}${cp_delim}\
`  `$MD_HOME/lib/md_api.jar${cp_delim}$MD_HOME/lib/md_common_api.jar${cp_delim}\
`  `$MD_HOME/lib/md.jar${cp_delim}$MD_HOME/lib/md_common.jar${cp_delim}\
`  `$MD_HOME/lib/jna.jar"

# Setup benchmark
if [ -z "$BENCHMARK_ENGINES" ]; then
#BENCHMARK_ENGINES="RETE, LOCAL_SEARCH, LOCAL_SEARCH_HINTS-CONDITION_FIRST, LOCAL_SEARCH_HINTS-TC_FIRST, HYBRID"
BENCHMARK_ENGINES="RETE"
fi
echo "Selected engines: ${BENCHMARK_ENGINES}"

if [ -z "$BENCHMARK_QUERIES" ]; then
#BENCHMARK_QUERIES="blocksOrRequirementsOrConstraints, alphabeticalDependencies, circularDependencies, loopTransitionWithTriggerEffectEventNoGuard, stateWithMostSubstates, transitiveSubstatesWithCheck3, allBenchMarkedQueries"
BENCHMARK_QUERIES="rateNotStreaming, boundReferenceNotReferenceOrValueProperty, participantPropertyNotBlock, flowPortDeprecated, activityStreamingNoNStreaming, requirementIdNotUnique,\
 proxyPortTypeNotInterfaceBlock, propertySpecificTypeNotOwnedByBlock, allocateNotSingleClient, interfaceBlockPortInvalidType, adjunctPropertyConnectorNotAssociationBlock,\
 viewStakeholderNotDerivedFromConform, participantPropertyAggregationKindNotNone, optionalLowerNotZero, adjunctPropertyIncorrectMultiplicity, proxyPortSubportNotProxyPort,\
 deriveReqtClientNotReqt, parameterDiscreteAndContinuous, adjunctPropertySubmachineOrInteraction, classifierBehaviorPropertyInvalidOwner, blockAssociationNotBinary, noBufferAndOverwrite,\
 allocateActivityPartitionActionsOnClientEnds, partPropertyInvalidType, adjunctPropertyNotComposite, endPathMiultiplicityNotRedefiniton, valueTypeSpecializatonNotValueType,\
 acsfeActionOneTrigger, requirementInAssociation, connectorPropertyNotOwnedOrInherited, itemFlowInvalidType, copyClientNotRequirement, proxyPortFullPort, adjunctPropertyInvalidPrincipalKind,\
 satisfySupplierNotRequirement, triggerOnNestedPortNotSinglePort, changeStructuralFeatureEventStatic, propertySpecificTypeNotOneProperty, itemFlowItemPropertyDifferentName,\
 triggerOnNestedPortFullPort, adjunctPropertyIncompatibleType, itemFlowDifferentType, refineNotSingleSupplier, requirementHasOperation, blockSpecializationNotBlock,\
 flowSpecificationInvalidApplication, viewpointNoCreate, acsfeActionNotTwoResultpins, activityEdgeDiscreteAndContinuous, boundReferenceNotConnectorEnd, participantPropertyEndOwner,\
 viewViewpointNotDerivedFromConform, participantPropertyDifferentType, valueTypeValuePropertyNotComposite, referencePropertyInvalidType, endPathMiultiplicityNegative,\
 classifierBehaviorPropertyInvalidType, constraintBlockSpecializationNotConstraintBlock, itemFlowAssociationHasItemProperty, traceNotSingleClient, participantPropertyMultiplicity,\
 acsfeActionIncorrectResultpins, notBinaryConnector, classifierBehaviorPropertyNotComposite, changeStructuralFeatureEventFeatureMultiplicity, conformGeneralNotViewpoint,\
 flowPropertyInvalidType, refineNotSingleClient, interfaceBlockIsConjugated, triggerOnNestedPortBaseFullPort, viewNotSingleViewpoint, flowPortOwnerNotBlock, boundReferenceNotOrdered,\
 direcredFeatureInvalidStereotype, deriveReqtSupplierNotReqt, adjunctPropertyCallActionInconsistent, acsfeActionInvalidTrigger, conformSpecificNotView, adjunctPropertyWrongName,\
 stakeHolderInvalidStereotype, blockValuePropertyNotComposite, constraintBlockPropertyNotComposite, adjunctPropertyMultiplicityRestrictive, sharedPropertyInvalidType,\
 flowSpecificationDeprecated, allocateNotSingleSupplier, traceNotSingleSupplier, copyMultipleCopies, requirementNestedClassifierNotRequirement, exposeClientNotView,\
 requirementInGeneralization, participationPropertyNotAssociation, copySupplierNotRequirement, controlOperatorOperationMethod, invocationOnNestedPortActionOnPortUndefined,\
 verifySupplierNotRequirement, interfaceBlockInvalidInheritance, boundReferenceRedefined, connectorPropertyNotBlock, distributedPropertyNotBlockOrValueType, fullPortIsBehavioral,\
 connectionPropertyDifferentName, optionalLowerZero, requirementHasAttribute, adjunctPropertyConnectorPropertyInconsistent, probabilityInvalidStereotype, boundReferenceUnique, copyCycle,\
 boundReferenceOpposite, connectorPropertyNotComposite, requirementAsType, participantPropertyIsMemberEndOfAssociation, connectionPropertyNotTypedByAssociationBlock,\
 valuePropertyNotValueType, fullPortBoundToFullPort, probabilityAllOutgoingEdges"
#BENCHMARK_QUERIES="optionalLowerZero"
fi
echo "Selected queries: ${BENCHMARK_QUERIES}"

if [ -z "$BENCHMARK_SIZES" ]; then
BENCHMARK_SIZES="300000, 540000, 780000, 1040000, 1200000"
BENCHMARK_SIZES="300000"
fi
echo "Selected sizes: ${BENCHMARK_SIZES}"

if [ -z "$BENCHMARK_RUNS" ]; then
BENCHMARK_RUNS=1
fi
echo "Number of runs: ${BENCHMARK_RUNS}"

if [ -z "$BENCHMARK_TWC" ]; then
BENCHMARK_TWC="localhost"
fi

if [ -z "$BENCHMARK_USER" ]; then
BENCHMARK_USER="Administrator"
fi

if [ -z "$BENCHMARK_PASSWORD" ]; then
BENCHMARK_PASSWORD="Administrator"
fi

if [ -z $WORKSPACE ]; then 
	export WORKSPACE=$(pwd)
fi
OUTPUT_DIR="$WORKSPACE/com.incquerylabs.magicdraw.benchmark/results"

IFS=', ' read -r -a engines <<< "$BENCHMARK_ENGINES"
IFS=', ' read -r -a queries <<< "$BENCHMARK_QUERIES"
IFS=', ' read -r -a modelsizes <<< "$BENCHMARK_SIZES"

# Run benchmark
for runIndex in `seq 1 "$BENCHMARK_RUNS"`;
do
	
	echo "Run: $runIndex"
	for engine in "${engines[@]}";
	do
		echo "Engine: $engine"
		for size in "${modelsizes[@]}";
		do
			echo "Model size: $size"
			
			for query in "${queries[@]}";
			do
				echo "Query: $query"
				echo "Running measurement on $query with $engine (model size: $size ; runIndex: $runIndex )"
				# Call MD
				cd com.incquerylabs.magicdraw.benchmark
				
				./gradlew -Pquery="$query" -Pmodel="/home/jenkins/models-tmt/TMT$size.mdzip" -Pwarmup="/home/jenkins/models-tmt/Warmup.mdzip" -Pindex="$runIndex" -Psize="$size" \
				-Poutput="${OUTPUT_DIR}" runBenchmark
				
				# TODO Load from TWC when available
				#./gradlew -Pquery="$query" -Pmodel="TMT" -Pwarmup="TMT" -Pindex="$runIndex" -Psize="$size" \
				#-Pserver="$BENCHMARK_TWC" -Puser="$BENCHMARK_USER" -Ppassword="$BENCHMARK_PASSWORD" -Poutput="${OUTPUT_DIR}" runBenchmark
			done
		done
	done
done

