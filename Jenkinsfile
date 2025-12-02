pipeline{
  agent any
  tools{
    maven 'devops_maven'
  }
  triggers{
    githubPush()
  }
  environment{
    POM="jugandoArreglos/pom.xml"
  }
  stages{
      stage('Descarga'){
        steps{
        git url:'https://github.com/Monsse28/JugandoArreglos.git', branch:'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B package'
      }
    }
    stage('Prueba'){
      steps{
        sh 'mvn -f $POM verify'
      }
      post{
        always{
          junit allowEmptyResults: true, testResults: 'jugandoArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'jugandoArreglos/target/*.jar', fingerprint:true
      }
    }
  }
}
