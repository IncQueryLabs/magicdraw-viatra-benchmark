#!/bin/bash

if [ -z "$MODEL_LOCATION" ]; then 
	export MODEL_LOCATION=${WORKSPACE_BENCHMARK}/models-tmt
fi

if [ -z "$WORKSPACE_BENCHMARK" ]; then 
	export WORKSPACE_BENCHMARK=$WORKSPACE
fi

if [ -z "$MD_HOME" ]; then
    export MD_HOME=${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark/build/install
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
BENCHMARK_QUERIES="transitiveSubstatesWithCheck3"
fi
echo "Selected queries: ${BENCHMARK_QUERIES}"

if [ -z "$BENCHMARK_QUERIES_EXCLUDE" ]; then
BENCHMARK_QUERIES_EXCLUDE=""
fi
echo "Queries to be excluded: ${BENCHMARK_QUERIES_EXCLUDE}"

if [ -z "$BENCHMARK_SIZES" ]; then
#BENCHMARK_SIZES="300000, 540000, 780000, 1040000, 1200000"
BENCHMARK_SIZES="5000"
fi
echo "Selected sizes: ${BENCHMARK_SIZES}"

if [ -z "$BENCHMARK_RUNS" ]; then
BENCHMARK_RUNS=1
fi
echo "Number of runs: ${BENCHMARK_RUNS}"

OUTPUT_DIR=${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark/results

IFS=', ' read -r -a engines <<< "$BENCHMARK_ENGINES"
IFS=', ' read -r -a queries <<< "$BENCHMARK_QUERIES"
IFS=', ' read -r -a excluded <<< "$BENCHMARK_QUERIES_EXCLUDE"
IFS=', ' read -r -a modelsizes <<< "$BENCHMARK_SIZES"

# Run benchmark
cd ${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark
	
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
			if [[ " ${excluded[@]} " =~ " ${query} " ]]; then
					echo "No benchmark is needed: $query is excluded - $BENCHMARK_QUERIES_EXCLUDE"
				else
					echo "Query: $query"
					echo "Running measurement on $query with $engine (model size: $size ; runIndex: $runIndex )"
					
					# Call MD
					./gradlew -Pquery="$query" -Pmodel="${MODEL_LOCATION}/TMT$size.mdzip" -Pwarmup="${MODEL_LOCATION}/Warmup.mdzip" -Pindex="$runIndex" -Psize="$size" \
					-Poutput="${OUTPUT_DIR}" -Pengine="$engine" -Pexclude="$BENCHMARK_QUERIES_EXCLUDE" runBenchmark -PnexusUsername=$DEPLOY_USER -PnexusPassword=$DEPLOY_PASSWORD
				fi
			done
		done
	done
done

