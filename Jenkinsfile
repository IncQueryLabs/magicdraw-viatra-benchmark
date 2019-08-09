// Tell Jenkins how to build projects from this repository
pipeline {
	agent {
		label 'performance'
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