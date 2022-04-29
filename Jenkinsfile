pipeline {
   agent any
    tools {
        maven "M385"
        // docker "DK"
    }
   stages {
     stage ('build') {
       steps {
         sh 'mvn clean package'
       }
     }
     stage ('docker-build') {
         steps{
            //  sh "sudo docker build -t lihg/jenkinstestjava:0.01 ."
            docker.build('lihg/jenkinstestjava:0.01')
         }
     }
   }
 }