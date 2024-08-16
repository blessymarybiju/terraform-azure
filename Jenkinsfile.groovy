pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/blessymarybiju/terraform-azure-setup.git'
      }
    }
    stage('Build') {
      steps {
        sh 'make build'
      }
    }
    stage('Test') {
      steps {
        sh 'make test'
      }
    }
  }
}
