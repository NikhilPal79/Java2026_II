# JVM, JRE, JDK
# GARBAGE COLLECTION 
# SERIALIZATION / DESERIALIZATION 



# EXCEPTIONS [it breaks the normal flow of execution program ]

# EXCEPTIONS HANDLING [handles exceptions scenarios gracefully to maintain the flow of program ]

# ERROR [it is irreversible condition like power outage]

# HIERARCHY OF EXCEPTION 
                            THROWABLE[interface] 
                               |
           |                                        |
       EXCEPTION                                  ERROR      
          |
 RUN TIME EXCEPTION 
          |





#  TYPE OF EXCEPTIONS
1. COMPILE TIME EXCEPTION [checked exception][CHECKED AT COMPILE TIME AND MUST BE HANDLED OR DECLARED]
2. RUN TIME EXCEPTION [unchecked exception ][UN-CHECKED EXCEPTION,NOT FORCED TO HANDLE]



# TO DEAL WITH THEM
1. try
2. catch
3. finally [no matter what, it will always execute]
4. throw [TO CREATE YOUR OWN EXCEPTION ]
5. throws [added to the method signature // dedicating your responsibility to someone else // someone will handle it]

# FLOW OF CATCHING THE EXCEPTION 
1. JVM detects the exception
2. create exception object
3. search matching catch block
4. execute catch block 
5. continues program


# Why we need multiple catch block ?
1. parent class has to be in the end ?
2. so that we can know what kind of exception we have , and we have different ways to handle different exception

# Why finally ?
1. used for cleanup 
2. connection closing 




