# RECAP

# METHOD HIDING ?
child class also use static.
 
# WHY WE MAKE VARIABLE PRIVATE ?
1. PROTECT 

# WHY GETTER AND SETTER ?
1. IT SUPPORT ENCAPSULATION 

# WHY WE MAKE CONSTRCTOR ?
1.TO MAKE OBJECT 
2.INITIALIZE THE VARIABLE 


CASE [IF YOU CREATE PARAMETRIZED CONSTRUCTOR, YOU NEED TO CREATE EXPLICITLY CREATE DEFAULT CONSTRUCTOR ]
[OR YOU CAN CREATE PARAMETRRIZED CONSTRUCTOR IN CHILD CLASS ]

# OVERLOADING VS OVERRIDING ?
1. OVERLOADING ->[STATIC BINDING][COMPILE TIME POLYMOPHISM ]
2. OVERRIDING ->[DYNAMIC BINDING][RUN TIME POLYMOPHISM] 

# INHERITANCE VS COMPOSITION ?
1. IN → IS A RELATION 
2. COMP → HAS A RELATION 


# ABSTRACTION [HIDING THE IMPLEMENTATION AND SHOWING ONLY THE FUNCTIONALITY ]
# 2- WAY TO ACHIEVE ABSTRACTION 
1. ABSTRACT CLASS (0-100)
2. INTERFACES (100)

# MODIFIERS [public, protected, default, ]
# NON-MODIFIERS [ ABSTRACT, FINAL, STATIC ]

# CHARACTER OF ABSTRACT CLASS 
1. object cannot be created 
2. may or may not have the abstract method 
3. abstract method does not have body 
4. can have constructor 
5. can have instance variable 
6. abstract method only exist in abstract class 

# Why abstraction ?
1. it prevents bugs bcz we can easily get the bug, unexpected behavior of the program without an error,
2. makes easy to override the method 



# Interface [It is a contract which a class must adhere to.]
1. All the method in interface are by default abstract.
2. No concrete method allowed
3. No object for interface
4. No constructor allowed
5. can have instance variables
6. variables are by default public, static & final
7. [class to class → extends] [interface to class → implements] [interface to interface → extends]

# Why interface when we have abstract class ? 
1. Multiple inheritance is allowed with help of interface.


# When to use abstract class and when to use interface ?
1. Common identity - abstract class
2. Multiple inheritance 

# example 
what you are ----> abstract 
what you can do -→ interface 
