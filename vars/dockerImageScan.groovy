 def call(String ImageName,String DockerHub){
    
     sh """   
      trivy image ${DockerHub}/${ImageName}:latest > scan.txt
      cat scan.txt
     """
 }