 def call(String ImageName, String ImageTag, String hubUser){
    
     sh """
      docker rmi ${DockerHub}/${ImageName}:${ImageTag}
      docker rmi ${DockerHub}/${ImageName} ${DockerHub}/${ImageName}:latest
     """
 }
