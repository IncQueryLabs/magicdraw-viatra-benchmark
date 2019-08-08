#!/bin/bash
export MD_HOME="D:\\git\magicdraw-viatra-benchmark-fork\\com.incquerylabs.magicdraw.benchmark\\build\\install"
export WORKSPACE="D:\\git\\magicdraw-viatra-benchmark-fork"

# compile and execute benchmark
cd com.incquerylabs.magicdraw.benchmark
./gradlew installDist
./run.sh
cd ..

# clone and checkout MONDO-SAM for reporting scripts
./benchmark/dep-mondo-sam.sh

# converts results from individual JSON files to CSV
./benchmark/convert_results.sh

python3 ${WORKSPACE}/benchmark/merge_csv.py

# generates diagrams with R
./benchmark/report.sh