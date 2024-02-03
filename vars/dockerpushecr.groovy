def call(String aws_account_id, String Region, String ECR_REPO_NAME){
    
    sh """
     aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 320188775919.dkr.ecr.us-east-1.amazonaws.com
     docker push ${aws_account_id}.dkr.ecr.${Region}.amazonaws.com/${ECR_REPO_NAME}:latest
    """
}