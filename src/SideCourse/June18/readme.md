# SCM [source code management ]

# PipeLine

# Flow of Pipeline 
1. select triggers [build / poll scm] 
2. select pipeline script [ script/ script with scm ]  will be in groovy language  

# Demo Pipeline Creation 
github --> maven Build[{shell commands} mvn clean and install] ---> test ---> docker image ---> deploy to dev ---> QA---> production 

pipeline {
agent any
tools {
maven '3.25'  // Use the name you gave in Tools configuration
}
stages {
stage('Git clone') {
steps {
git url:'https://github.com/prgara/HttpClientFeb.git'
}
}
stage('Maven claean') {
steps {
bat'mvn clean'
}
}
stage('Maven install') {
steps {
sh'mvn install'
}
}
stage('Test cases ') {
steps {
sh'mvn test'
sleep 20
}
}
stage('SonarCube Testing') {
steps {
echo'Sonar test running '
}
}
stage('Docker Image Build') {
steps {
echo'Creating Docker image and pushing to regitery '
sleep 10
}
}
stage('Deployment - Dev') {
steps {
echo 'Code deployed to dev environment'
}
}
stage('Deployment - QA') {
steps {
echo 'Code deployed to QA environment'
}
}
stage('Seccurity ') {
steps {
echo 'Providing Security Measures'
sleep 10
}
}
stage('Deployment - Prodcution') {
steps {
echo 'Code deployed to Prodctuion environment'
}
}

    }
}


