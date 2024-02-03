 def call(String ImageName, String ImageTag, String DockerHub){
    
     sh """
      docker image build -t ${DockerHub}/${ImageName} . 
      docker image tag ${DockerHub}/${ImageName} ${DockerHub}/${ImageName}:${ImageTag}
      docker image tag ${DockerHub}/${ImageName} ${DockerHub}/${ImageName}:latest
     """
 }