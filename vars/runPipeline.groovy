def call() {
    pipeline {
      agent any
      stages {
        stage('build') {
          steps {
            sh "echo 'build phase'"
          }
        }
        stage('upload') {
          steps {
            sh "echo 'upload phase'"
          }
        }
      }
    }
}