# toString METHOD [REFER TO CODE ]

# lineNO 14 [will give you hash value because toString method is not overridden] 
toString is unnecessary [can be removed ]

# lineNo18 [will give you proper value because toString method is already overridden ]


# if we call a method [if note present in child class ] [will look child class first then it will look for parent class] 


# STATIC 
1. static loaded in memory even before the main method [will call PARENT ]
2. can not override the static method 
# Why we cant override static method ?
because override the happened at run time, and static loaded in memory in compile time even before the main method call.


# ENCAPSULATION [wraps the data into a single unit... programmer can control who can access what]

# WHY ?
1. DATA PROTECTION 
2. VALIDATION 
3. CONTROL ACCESS 
4. 
# HOW TO ACHIEVE IT ?
 private ?

by default, you should make all the fields/data members as [private] [no one can access it outside.] [only by getter or setter ]



# MODIFIERS 2 TYPES [1=> ACCESS MODIFIER ,2 => ]
# ACCESS MODIFIERS====> CAN USE WITH [CLASS, METHOD, VARIABLE, CONSTRUCTOR  ]
1. PUBLIC [ANYONE CAN USE ]
2. PRIVATE [ONLY ACCESS INSIDE SAME CLASS ]
3. DEFAULT [SAME PACKAGE ]
4. PROTECTED [NOT AVAILABLE IN DIFFERENT PACKAGE NON-SUBCLASS, OTHERWISE YES ]
