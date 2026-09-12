# how the microservices works and communicate with each other 

1. create Discovery server [Enable Eureka client in application]
2. create Order Service [Enable DiscoveryClient in application]
3. create Payment Service [Enable DiscoveryClient in application]
4. create ApiGateway [Enable DiscoveryClient in application]


# Two Service can communicate with each other by
1. http Client 
2. Rest Template
3. Web Client 
4. Feign Client 