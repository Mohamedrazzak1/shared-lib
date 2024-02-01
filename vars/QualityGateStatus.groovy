import org.sonarsource.scanner.jenkins.pipeline.QualityGateStatus

def call(credentialsId){
  waitForQualityGate abortPipeline: false, credentialsId: credentialsId
}