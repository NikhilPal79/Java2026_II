# Collection
Collection framework it is set of class & interfaces which is used to store and manipulate the group of objects.

# Wrapper Classes [object of primitive Data Types eg Integers, Float, Double ]
work with objects only

# List [it is an ordered collection, contain duplicates]
1. ArrayList 
2. LinkedList


# ArrayList [Linear Data Structure, stored at contiguous memory location ]
1. It is a resizeable-array (dynamic) implementation of the List. 
2. ordered
3. duplicates size 
4. capacity ? 

# Implementation 
By default, the list of size 10 will be created. when it will reach 100% capacity it will grow by 1.5X

# Load Factor in ArrayList [100%]

# Problem in ArrayList [adding/delete an element][shifting elements costs more memory ]

# for insert/delete don't use ArrayList[Manipulation is costly in arrayList]
[REASON][bcz it will invoke shifting of each element to adjust to addition/deletion]


# Big (O) Notation [ALWAYS TAKE WORST CASE ]
1. TIME COMPLEXITY 
2. SPACE COMPLEXITY 

# How to loop over arrayList 
1. traditional for loop 
2. for each loop
for(DataType element : Reference){
sout(reference)
}

[CASE-- IF WE WANT TO REMOVE IN LOOP it will GIVE CONCURRENT MODIFICATION EXCEPTION ] [WE USE ITERATOR ]

# ITERATOR [INTERFACE]
# Iterator [that lets you traverse a collection one element at a time without exposing its internal structure ][two methods]
1. hasNext
2. next

# CONCURRENT MODIFICATION EXCEPTION [This happens when you use Iterator]
1. Fail-Fast ====> when you try to modify the list it will throw ConcurrentModificationException , ArrayList, HashMap will give Exception  
2. Fail-Safe ====> modify on the copy of the collection. Don't throw ConcurrentModificationException use ConcurrentHashMap, CopyOnWriteArrayList


# ArrayList is not thread safe [you can not run two program at same point ]


# Time and Space Complexity [metric to determine efficiency of program ] 

# TIME COMPLEXITY [relation between input size and running time]

# Big O [MAXIMUM TIME PROGRAM TAKE TO RUN ] ====>  WORST CASE [O(n)]

O(1)         — constant [best practice]
O(log n)     — logarithmic [best practice]
O(n)         — linear
O(n log n)   — linearithmic
O(n²)        — quadratic
O(2ⁿ)        — exponential


# SPACE COMPLEXITY [ relation between amount of space occupied and input size ]
space complexity = auxiliary space [temp space] + input space 

