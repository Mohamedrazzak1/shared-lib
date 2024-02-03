 def call(String ImageName, String ImageTag, String DockerHub){
    
     sh """
      docker image build -t ${AppName}/${ImageName} . 
      docker image tag ${AppName}/${ImageName} ${AppName}/${ImageName}:${ImageTag}
      docker image tag ${AppName}/${ImageName} ${AppName}/${ImageName}:latest
     """
 }