# List 
1. ArrayList 
2. LinkedList


# ArrayList [Linear Data Structure, stored at contiguous memory location ]




# Problem in ArrayList [adding/delete an element][shifting elements costs more memory ]

# for insert/delete don't use ArrayList[Manipulation is costly in arrayList]
[REASON][bcz it will invoke shifting of the element to adjust to addition/deletion]


# Big (O) Notation [ALWAYS TAKE WORST CASE ]
1. TIME COMPLEXITY 
2. SPACE COMPLEXITY 

# How to loop over arrayList 
1. traditional for loop 
2. for each loop
for(DataType element : Reference){
sout(reference)
}

[CASE-- IF WE WANT TO REMOVE IN LOOP GIVE CONCURRENT MODIFICATION EXCEPTION ] [WE USE ITERATOR ]

# CONCURRENT MODIFICATION EXCEPTION 
1. Fail-Fast ====> when you try to modify the list it will throw ConcurrentModificationException , ArrayList will give ConcurrentModification Exception  
2. Fail-Safe ====> Iterator 

# Iterator [has two methods]
1. hasNext
2. next 


# ArrayList is not thread safe 

