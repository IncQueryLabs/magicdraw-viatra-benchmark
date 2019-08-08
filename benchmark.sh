#!/bin/bash
export WORKSPACE=<The directory path that contains this file>
# MagicDraw Installation folder by default is "$WORKSPACE/com.incquerylabs.magicdraw.benchmark/build/install"
export MD_HOME=<MagicDraw Installation folder>

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