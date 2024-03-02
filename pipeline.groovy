pipeline{
  
  agent docker

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