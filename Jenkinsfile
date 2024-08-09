#!groovy

pipeline {

  stages {

    // Build
    stage('Build') {
      steps {
        sh "echo 'Run Build'"
      }
    }

    // Static Code Analysis
    stage('Static Code Analysis') {
      steps {
        sh "echo 'Run Static Code Analysis'"
      }
    }

    // Unit Tests
    stage('Unit Tests') {
      steps {
        sh "echo 'Run Unit Tests'"
      }
    }

    // Acceptance Tests
    stage('Acceptance Tests') {
      steps {
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
