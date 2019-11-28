#!/bin/bash
if [ -z "$WORKSPACE_BENCHMARK" ]; then 
	export WORKSPACE_BENCHMARK=$(pwd)
fi
cd ${WORKSPACE_BENCHMARK}

cd benchmark
rm -rf diagrams
mkdir diagrams

cd results

  python3 ${WORKSPACE_BENCHMARK}/mondo-sam/reporting/report.py --source ${WORKSPACE_BENCHMARK}/benchmark/results/all_results.csv \
--output ${WORKSPACE_BENCHMARK}/benchmark/diagrams/ --config ${WORKSPACE_BENCHMARK}/benchmark/config_summary.json

for i in $(ls -d */); do
  echo ${i};
  mkdir ../diagrams/${i}
  
  python3 ${WORKSPACE_BENCHMARK}/mondo-sam/reporting/report.py --source ${WORKSPACE_BENCHMARK}/benchmark/results/${i}results.csv \
--output ${WORKSPACE_BENCHMARK}/benchmark/diagrams/${i} --config ${WORKSPACE_BENCHMARK}/benchmark/config.json

done

