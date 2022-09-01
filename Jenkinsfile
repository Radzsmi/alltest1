node {
    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'Dockerhub') {

        def customImage = docker.build("radzsmir/springreadyapp")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
/**
pipeline {
  environment {
    imagename = "radzsmir/springreadyapp"
    registryCredential = 'radzsmir'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git([url: 'https://github.com/Radzsmi/alltest1.git', branch: 'main', credentialsId: 'radzsmir'])

      }
    }
        stage('Build Docker Image') {
          steps{
    	sh 'sudo docker build -t radzsmir/springreadyapp:$BUILD_NUMBER .'
            echo 'Build Image Completed'
          }
        }
        }
}
**/