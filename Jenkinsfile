// Tell Jenkins how to build projects from this repository
pipeline {
	agent {
		label 'performance'
	} 
	
	parameters {
		string( 
			defaultValue: 'RETE',
			description: 'Comma separated list of engines to test (with a single space after each comma).',
			name: 'BENCHMARK_ENGINES' 
		)

		string( 
			defaultValue: 'optionalLowerZero',
			description: 'Comma separated list of queries to test (with a single space after each comma). If empty, all queries are taken into account. Use the value "all" if you want to apply all patterns in one run.',
			name: 'BENCHMARK_QUERIES' 
		)
		
		string( 
			defaultValue: '300000',
			description: 'Comma separated list of model sizes to test (with a single space after each comma).',
			name: 'BENCHMARK_SIZES' 
		)

		string( 
			defaultValue: '1',
			description: 'Number of runs',
			name: 'BENCHMARK_RUNS' 
		)
	}

    // Keep only the last 15 builds
	options {
		buildDiscarder(logRotator(numToKeepStr: '5'))
	}
	
	tools { 
        jdk 'Oracle JDK 8' 
    }
	 
    stages { 
        stage('Build') { 
			steps {
				sh '''
					export MODEL_LOCATION=/home/jenkins/models-tmt
					# WORKSPACE_BENCHMARK is used as on client-side 3rd applications (e.g. git on Windows) 
					# overrides the $WORKSPACE variable during their execution
					export WORKSPACE_BENCHMARK=$WORKSPACE
					rm -rf benhmark/results
					rm -rf benhmark/diagrams
				    cd com.incquerylabs.magicdraw.benchmark
				    rm -rf results
				    rm -rf build/dependency-cache
				    ./gradlew clean
				    ./gradlew installDist
				'''
			}
		}
		stage('Benchmark') {
            steps {
            	wrap([$class: 'Xvnc']) {
				    sh './com.incquerylabs.magicdraw.benchmark/run.sh'
            	}
			}
		}
		stage('Report') {
			steps {
				sh './benchmark/dep-mondo-sam.sh'
				sh './benchmark/convert_results.sh'
				sh 'python3 ./benchmark/merge_csv.py'
				sh './benchmark/report.sh'
			}
		}
    }
    
    post {
    	always {
    		archiveArtifacts 'com.incquerylabs.magicdraw.benchmark/results/**, benchmark/**'
    	}
	}
}