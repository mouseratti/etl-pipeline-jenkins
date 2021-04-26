def call() {
    pipeline {
      agent any
      stages {
        stage('build') {
          steps {
            sh "run build phase"
          }
        }
        stage('upload') {
          steps {
            sh "run upload phase"
          }
        }
      }
    }
}