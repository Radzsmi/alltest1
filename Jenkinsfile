/**
node {
    checkout scm

    def customImage = docker.build("radzsmir/springreadyapp")

}
**/


node {
    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        checkout scm
    }

    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */

        app = docker.build("radzsmir/springreadyapp")
    }

    stage('Test image') {
        /* Ideally, we would run a test framework against our image.
         * For this example, we're using a Volkswagen-type approach ;-) */
         docker.image('my-custom-image').inside {
            sh 'make test'
        }
    }

    }
