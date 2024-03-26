pipeline{
    agent any
    environment {
           registry = "akashsingha411/newrepo"
           registryCredential = 'docker_id_practise'
           dockerImage = ''
    }
    
    
    tools{
        maven '3.9.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/docker']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/akash41111/practise2']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t akash/assignment2 .'
                }
            }
        }
       
        stage('push image'){
            steps{
                script{
                    bat 'docker tag akash/assignment2:latest akashsingha411/newrepo:latest'
                    bat 'docker push akashsingha411/newrepo:latest'
                }
            }
        }
         stage('Run container'){
            steps{
                script{
                    bat 'docker run -d -p 9292:9191 akash/assignment2 .'
                }
            }
        }
        
    }
}