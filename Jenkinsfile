pipeline {
   agent any
    tools {
        maven "M385"
    }
   stages {
     stage ('build') {
       steps {
         git 'https://github.com/lihg0629/jenkinstest.git'
         sh 'mvn clean package'
       }
     }
     stage ('docker-build') {
         steps{
             sh "docker build -t lihg/jenkinstestjava:0.01 ."
         }
     }
   }
 }