# SCM [source code management ]

# PipeLine

# Flow of Pipeline 
1. select triggers [build / poll scm] 
2. select pipeline script [ script/ script with scm ]  will be in groovy language  

# Demo Pipeline Creation 
github --> maven Build[{shell commands} mvn clean and install] ---> test ---> docker image ---> deploy to dev ---> QA---> production 

