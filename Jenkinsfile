pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK22'
    }
    stages {
        stage('Clonar') {
            steps {
                git 'https://github.com/patriciodunstan/saludoapp.git'
            }
        }
        stage('Compilar') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
    }
}