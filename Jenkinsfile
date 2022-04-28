pipeline {
   agent any
    tools {
        maven "M385"
    }
   stages {
     stage ('build') {
       steps {
         sh 'mvn clean package'
       }
     }
     stage ('docker-build') {
         steps{
             sh "sudo docker build -t lihg/jenkinstestjava:0.01 ."
         }
     }
   }
 }