pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK22'
    }
    stages {
        stage('Clonar') {
          steps {
            git branch: 'main', url: 'https://github.com/patriciodunstan/saludoapp.git'
          }
        }

        stage('Compilar') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                bat 'mvn package'
            }
        }
    }
}