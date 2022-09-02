/**
node {
    checkout scm

    def customImage = docker.build("radzsmir/springreadyapp")

}
**/

/**
node {
    def app

    stage('Clone repository') {


        checkout scm
    }

    stage('Build image') {


        app = docker.build("radzsmir/springreadyapp")
    }

    stage('Test image') {

        app.inside {
            sh 'echo "Tests passed"'
        }

    }

    }
    **/
pipeline {
    agent { dockerfile true }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}