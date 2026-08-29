# How application communicate with each other ?
1. http Client 
2. Rest Template
3. Web Client 
4. Feign Client 


1. http Client [plain java native  client] [you dont need spring framework for this ]

2. Rest Template [Synchronous Client] [ Blocking ][Comes with spring ]

3. Web Client [Asynchronous Client] [ Non-Blocking , Reactive Programming ] [Comes with spring]

4. Feign Client [built on top of Rest Template] [declarative approach ]


# Monolith  [a single, cohesive platform and codebase ]
# Pros
1. Easy to deploy
2. data consistency 
3. Operation are easy 
4. It's not very complex 

# Cons 
1. 




Monolith ----> Service Oriented Architecture (SOA)[failed]  ------> Microservices 



# MicroServices  [design approach that builds a single application as a collection of independent services that run their own processes and talk through APIs]
# Why we need them ? []
# Principals
1. Single Responsibility Model [should focus on one domain ]
2. Autonomy [every individual app should be independent of other application ]
3. Independently Deployable []
4. Agility [easy to make changes and create ]
5. Resilient [recover itself and did not crash if something fails ]


