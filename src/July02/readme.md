
# OOPS Programming [objects are first class citizens  ]
# Functional Programming [function are first class citizens ]


                        FeatureObject-Oriented Programming (OOP)      Functional Programming (FP)
1. Core                 Unit Objects and Classes                      Pure Functions
2. Data & Behavior      Combined together in objects                  Kept strictly separate
3. State Management     Managed via mutable state                     Emphasizes complete immutability
4. Programming Style    Imperative (how to do it)                     Declarative (what to do)
5. Concurrency          Difficult due to shared, mutable state        Excellent due to zero shared state
6. Primary Strength     Modeling complex, real-world systems          Mathematical tasks and data transformations

# Lambda [λ] and Functional Programming [FP] supported in functional interface 

# FUNCTIONAL INTERFACE   [ WITH EXACTLY ONE ABSTRACT METHOD(without body)][use annotation @functinal interface]
1.[only 1 method without body]
2.[can have number of static method and default method]
3.[static must return]


# Why we use Functional Interface ?
1. To avoid the creating class and their object and implementing their functions 

# Any instance variable in the interface is static final [INTERVIEW][VV.IMP]
[instance variable do not belong to object itself bcz in interface we cant create object ]


# Lambda [λ] [ ()-> ]



[4 type of BUILT-IN functional interface]

1. PREDICATE< T > = TEST A CONDITION         == RETURN => BOOLEAN(TRUE/FALSE)
2. FUNCTION <T,R> = INTAKE T                 == RETURN R =>
3. CONSUMER < T > = INPUT T(ACCEPT VALUES )  == RETURN NOTHING(NO VALUES )
4. SUPPLIER < R > = INPUT NOTHING(NO VALUE ) == RETURN R (RETURN VALUE )


