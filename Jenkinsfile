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
             script{
                             docker.build('lihg/jenkinstestjava:0.01')

             }
            //  sh "sudo docker build -t lihg/jenkinstestjava:0.01 ."
            // docker.build('lihg/jenkinstestjava:0.01')
         }
     }
   }
 }