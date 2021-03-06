#!/bin/bash

if [ -z "$WORKSPACE_BENCHMARK" ]; then 
	export WORKSPACE_BENCHMARK=$(pwd)
fi
cd ${WORKSPACE_BENCHMARK}

# Clone results repository if needed
echo "Clone mondo-sam"
if [ -d "mondo-sam" ]; then
  # Repo exists, update
  cd mondo-sam
  git fetch
  git reset origin/0.1-maintenance --hard
  cd ..
else
  # Clone repo
  git clone https://github.com/FTSRG/mondo-sam.git mondo-sam
  cd mondo-sam
  git fetch
  git checkout 0.1-maintenance
fi
echo "Finished Cloning"

