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
                def myimage = docker.build('lihg/jenkinstestjava:0.01')
                // docker.withRegistry("https://hub.docker.com/", "faea6989-9ad7-4b86-b559-e1b8f0cd8d31"){
                    myimage.push()
                // }
                // myimage.push()
             }
            //  sh "sudo docker build -t lihg/jenkinstestjava:0.01 ."
            // docker.build('lihg/jenkinstestjava:0.01')
         }
     }
   }
 }