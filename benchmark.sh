#!/bin/bash
export MD_HOME=<MagicDraw Installation folder>
export WORKSPACE=<The directory path that contains this file>

# compile and execute benchmark
cd com.incquerylabs.magicdraw.benchmark
./gradlew installDist
./run.sh
cd ..

# clone and checkout MONDO-SAM for reporting scripts
./benchmark/dep-mondo-sam.sh

# converts results from individual JSON files to CSV
./benchmark/convert_results.sh

# generates diagrams with R
./benchmark/report.sh