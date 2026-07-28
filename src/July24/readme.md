# SpringBoot Application 

# spring is also framework 
# What is spring boot[ is framework,on top of spring, it is opinionated framework ]

# opinionated [can work different under different opinion ]




# Why we need springboot application ?[bcz of these problem]
1. configuration was very difficult [like creating bean manually]
2. spring ecosystem is very big [many library/project]
3. version conflicts 

# So they created springboot 

# Starter poms [and parent pom ] [interview]

# PARENT POM [is actually used by spring boot to define all the compatible version and libraries also define certain library too]



# SpringBootApplication Annotation [Combination of 2]
1. @EnableAutoConfiguration[it try to configure everything in the classpath,weather you put annotation or not]
2. @ComponentScan [allow spring boot to go through your project and look for annotation @component, @configuration, @repository, @Service @ Controller,@RestController]


# add in XML ---> debug = true [to know why application didn't work ]


# CommandLineRunner 
CommandLineRunner when you need to execute a specific block of code exactly once
immediately after the application context has fully loaded but before the application starts accepting web traffic or user requests



