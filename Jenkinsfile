#!groovy

pipeline {

  agent any
  stages {

    // Build
    stage('Build') {
      agent {
        label 'node'
      }
      steps {
        sh 'sleep 300'
        sh "echo 'Run Build'"
      }
    }

    // Static Code Analysis
    stage('Static Code Analysis') {
      agent {
        label 'node'
      }
      steps {
        sh 'sleep 300'
        sh "echo 'Run Static Code Analysis'"
      }
    }

    // Unit Tests
    stage('Unit Tests') {
      agent {
        label 'node'
      }
      steps {
        sh 'sleep 600'
        sh "echo 'Run Unit Tests'"
      }
    }

    // Acceptance Tests
    stage('Acceptance Tests') {
      agent {
        label 'node'
      }
      steps {
        sh 'sleep 500'
        sh "echo 'Run Acceptance Tests'"
      }
    }

  }
  post {
    success {
      sh "echo 'Send mail on success'
    }
    failure {
      sh "echo 'Send mail on failure'"
    }
  }
}
