#!/bin/bash
cd "$( cd "$( dirname "$0" )" && pwd )/.."

cd benchmark
rm -rf diagrams
mkdir diagrams

cd results

  python3 ${WORKSPACE}/mondo-sam/reporting/report.py --source ${WORKSPACE}/benchmark/results/all_results.csv \
--output ${WORKSPACE}/benchmark/diagrams/ --config ${WORKSPACE}/benchmark/config_summary.json

for i in $(ls -d */); do
  echo ${i};
  mkdir ../diagrams/${i}
  
  python3 ${WORKSPACE}/mondo-sam/reporting/report.py --source ${WORKSPACE}/benchmark/results/${i}results.csv \
--output ${WORKSPACE}/benchmark/diagrams/${i} --config ${WORKSPACE}/benchmark/config.json

done

