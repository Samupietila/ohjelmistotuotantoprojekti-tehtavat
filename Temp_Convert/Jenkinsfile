pipeline {
    agent any // IN THE LECTURE I WILL EXPLAIN THE SCRIPT AND THE WORKFLOW
    
    environment {
        // Define Docker Hub credentials ID
        DOCKERHUB_CREDENTIALS_ID = 'dockerhub_credential'
        // Define Docker Hub repository name
        DOCKERHUB_REPO = 'samupietila/lecturedemo3'
        // Define Docker image tag
        DOCKER_IMAGE_TAG = 'latest'
    }
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git 'https://github.com/Samupietila/ohjelmistotuotantoprojekti-tehtavat.git'
                sh 'ls -la'
                sh 'ls -la ./Temp_Convert'
            }
        }  
        stage('Build Docker Image') {
            steps {
                // Build Docker image
                script {
                    docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG} ./Temp_Convert")
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                // Push Docker image to Docker Hub
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKERHUB_CREDENTIALS_ID) {
                        docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}