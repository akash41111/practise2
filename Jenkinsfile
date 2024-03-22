pipeline{
    agent any
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
         stage('Run container'){
            steps{
                script{
                    bat 'docker run -d -p 9292:9191 akash/assignment2 .'
                }
            }
        }
        
    }
}