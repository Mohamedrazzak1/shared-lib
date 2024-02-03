def call(String ImageName, String ImageTag, String DockerHub){
     withCredentials([usernamePassword(
             credentialsId: "dockerPass",
             usernameVariable: "USER",
             passwordVariable: "PASS"
     )]) {
         sh "docker login -u '$USER' -p '$PASS'"
     }
     sh "docker image push ${DockerHub}/${ImageName}:${ImageTag}"
     sh "docker image push ${DockerHub}/${ImageName}:latest"   
 }