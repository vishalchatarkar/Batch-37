pipeline {

}agent any

    stages {
        stage('Git clone from GITHUB') {
            steps {
            git branch: 'main', url: 'https://github.com/DevSecOpsG/helloworldsimplejavaprogram'
            }
        }
        stage('Build by itiyo'){
            steps{
            sh 'javac helloworld.java'
            }
        }
        stage('Run by java'){
            steps{
            sh 'java Simple'
            }
        }
    }
