def info(message) {
  echo "INFO: ${message}"
}

def warning(message) {
  echo "WARNING: ${message}"
}

pipeline {
  agent any

  stages {

    stage('Shared Library Demo') {
      steps {
        script {
          print 'hello'
          sample.info 'Starting'
          sample.warning 'Nothing to do!'
        }
      }
    }
  }
}