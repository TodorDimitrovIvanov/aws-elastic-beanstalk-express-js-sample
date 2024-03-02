pipeline{
  
  agent { 
    docker{
      image "node:20.11.1-alpine3.19"
    }
  }

  stages{
    stage ("Env setup"){
      steps{
        script{
          sh """
            node --version
            npm install 
            node start 
          """
        }
      }
    }
  }
}