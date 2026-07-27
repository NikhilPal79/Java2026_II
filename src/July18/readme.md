# Recap

# CORE JAVA 
1. OOPS 
2. INTERFACE AND CLASSES 
3. EXCEPTION 
4. LAMBDAS 
5. STREAM 
6. MULTI-THREADING [deferring]
7. FILE SYSTEM [deferring]


# Application 
UI / Business Logic / Data
(Presentation Layer )- Business Layer - Data Layer(Data Layer )


# EJB (Enterprise Java Bean)

# SPRING 
1. Maven [Build Tool for Java Project ][do compilation, testing and documentation]


# Reason why we USE Spring 
1. removing dependency/control = [inversion of control] [where spring manages the life cycle of the object ]
2.  [Autowiring] []

# SOURCE OF TRUTH [OUR PROJECT LEARN EVERYTHING FROM THE POM ][pom file]

# MAVEN [BUILDING TOOL]

# PACKAGE [uniqueness come  from package to differentiate ]
# GROUP [give you the id to differentiate]
# ARTIFACT [name of the project]


# How to create beans through XML file [in lecture===> see spring boot app July 18]

# IF YOU WANT TO CODE IN application.properties 
[{employee.firstName=Adam
employee.lastName=Jude
employee.email=Adam@gmail.com}]
1. paste this in application.properties [<context:property-placeholder location="classpath:application.properties"/>]
2. import things come with this 
3. change the vale [${employee.firstName}]

# People find problems in creating beans in beans.xml so they abandoned them [moved to Java-Based configuration called AppConfig]


# When use Java-Based Configuration[use] [new AnnotationConfigApplicationContext(AppConfig.class);]




