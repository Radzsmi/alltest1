/**
node {
    checkout scm

    def customImage = docker.build("radzsmir/springreadyapp")

}
**/


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
    	sh 'sudo docker build -t radzsmir/springreadyapp'
            echo 'Build Image Completed'
          }
        }
        }
}
