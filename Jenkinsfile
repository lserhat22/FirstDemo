#!groovy

pipeline {

  stages {

    // Build
    stage('Build') {
      steps {
        sh 'sleep 300'
        sh "echo 'Run Build'"
      }
    }

    // Static Code Analysis
    stage('Static Code Analysis') {
      steps {
        sh 'sleep 300'
        sh "echo 'Run Static Code Analysis'"
      }
    }

    // Unit Tests
    stage('Unit Tests') {
      steps {
        sh 'sleep 600'
        sh "echo 'Run Unit Tests'"
      }
    }

    // Acceptance Tests
    stage('Acceptance Tests') {
      steps {
        sh 'sleep 500'
        sh "echo 'Run Acceptance Tests'"
      }
    }

  }
  post {
    success {
      sh "echo 'Send mail on success'"
    }
    failure {
      sh "echo 'Send mail on failure'"
    }
  }
}
