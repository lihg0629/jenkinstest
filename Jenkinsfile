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
                docker.withRegistry("https://registry.hub.docker.com", "faea6989-9ad7-4b86-b559-e1b8f0cd8d31"){
                    myimage.push()
                }
                // myimage.push()
             }
            //  sh "sudo docker build -t lihg/jenkinstestjava:0.01 ."
            //  sh "sudo docker push lihg/jenkinstestjava:0.01"
            // docker.build('lihg/jenkinstestjava:0.01')
         }
     }
     stage  ('k8s-deploy') {
      //  steps{
      //    sh "ssh root@"
      //  }
        steps{
          withKubeConfig([credentialsId:'jenkins-k8s-3', serverUrl:'https://192.168.0.11:6443']){
            sh 'kubectl get node'
          }
        }
     }
   }
 }