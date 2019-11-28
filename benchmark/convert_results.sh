#!/bin/bash

if [ -z "$WORKSPACE_BENCHMARK" ]; then 
	export WORKSPACE_BENCHMARK=$(pwd)
fi

# Ensure old results are removed
rm -rf ${WORKSPACE_BENCHMARK}/benchmark/results
mkdir ${WORKSPACE_BENCHMARK}/benchmark/results

cd ${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark/results

echo "Process results"
for i in $(ls -d */); do
  echo ${i};
  
  if [ "warmup/" == ${i} ] || [ "log/" == ${i} ]; then
    echo "SKIP"
  else
    echo "PROCESS"
	mkdir ${WORKSPACE_BENCHMARK}/benchmark/results/${i}
	python3 ${WORKSPACE_BENCHMARK}/mondo-sam/reporting/convert_results.py --source ${WORKSPACE_BENCHMARK}/com.incquerylabs.magicdraw.benchmark/results/${i} \
--jsonfile ${WORKSPACE_BENCHMARK}/benchmark/results/${i}results.json \
--csvfile ${WORKSPACE_BENCHMARK}/benchmark/results/${i}results.csv
  fi
  
done
echo "Finished processing result"


