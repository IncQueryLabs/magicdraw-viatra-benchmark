// Tell Jenkins how to build projects from this repository
pipeline {
	agent {
		label 'performance'
	} 
	
	parameters {
		string( 
			defaultValue: 'RETE',
			description: 'Comma separated list of engines to test (with a single space after each comma).
Possible values:
RETE, LOCAL_SEARCH, LOCAL_SEARCH_HINTS-CONDITION_FIRST, LOCAL_SEARCH_HINTS-TC_FIRST, HYBRID',
			name: 'BENCHMARK_ENGINES' 
		)

		string( 
			defaultValue: 'optionalLowerZero',
			description: 'Comma separated list of queries to test (with a single space after each comma).',
			name: 'BENCHMARK_QUERIES' 
		)

		string( 
			defaultValue: 300000,
			description: 'Comma separated list of model sizes to test (with a single space after each comma).
Possible values:
300000, 540000, 780000, 1040000, 1200000',
			name: 'BENCHMARK_SIZES' 
		)

		string( 
			defaultValue: '1',
			description: 'Number of runs',
			name: 'BENCHMARK_RUNS' 
		)

		string( 
			defaultValue: 'localhost',
			description: 'Address of Teamwork Cloud',
			name: 'BENCHMARK_TWC' 
		)

	}

    // Keep only the last 15 builds
	options {
		buildDiscarder(logRotator(numToKeepStr: '15'))
	}
	
	tools { 
        jdk 'Oracle JDK 8' 
    }
	 
    stages { 
        stage('Build') { 
			steps {
				sh '''
				    cd com.incquerylabs.magicdraw.benchmark
				    rm -rf build/dependency-cache
				    ./gradlew clean
				    ./gradlew installDist
				'''
			}
		}
		stage('Benchmark') {
            steps {
            	wrap([$class: 'Xvnc']) {
					withCredentials([usernamePassword(credentialsId: 'leonard_twc', passwordVariable: 'BENCHMARK_PASSWORD', usernameVariable: 'BENCHMARK_USER')]) {
						sh './com.incquerylabs.magicdraw.benchmark/run.sh'
					}
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