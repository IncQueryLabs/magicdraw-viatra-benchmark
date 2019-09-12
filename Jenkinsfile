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
			defaultValue: '',
			description: 'Comma separated list of queries to exclude from the benchmark (with a single space after each comma)',
			name: 'BENCHMARK_QUERIES_EXLUDE' 
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

		string( 
			defaultValue: 'https://twc.benchmark.iqs.beta.incquerylabs.com:8111',
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