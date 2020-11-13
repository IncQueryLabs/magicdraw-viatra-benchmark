#!/bin/bash

# WORKSPACE_BENCHMARK is used as $WORKSPACE can be overriden by 3rd party applications e.g. Git.

# export WORKSPACE_BENCHMARK=<The directory path that contains this file>
# export MODEL_LOCATION=<The directory path that contains the TMT model files(*.mdzip)>

if [ -z "$WORKSPACE_BENCHMARK" ]; then 
	export WORKSPACE_BENCHMARK=$(pwd)
fi

# compile benchmark
cd ${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark
./gradlew installDist

# export MD_HOME
export MD_HOME=${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark/build/install

# execute benchmark
./run.sh
cd ${WORKSPACE_BENCHMARK}

# clone and checkout MONDO-SAM for reporting scripts
./benchmark/dep-mondo-sam.sh

# converts results from individual JSON files to CSV
./benchmark/convert_results.sh

python3 ${WORKSPACE_BENCHMARK}/benchmark/merge_csv.py

# generates diagrams with R
./benchmark/report.sh