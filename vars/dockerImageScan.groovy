 def call(String ImageName, String ImageTag, String DockerHub){
    
     sh """   
      trivy image ${DockerHub}/${ImageName}:latest > scan.txt
      cat scan.txt
     """
 }