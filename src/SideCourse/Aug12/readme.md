# INDEX [data structures that speeds up the data retrieval ]

# INDEX CREATION 
1. create Index index_email on Student(Email) --------------> create a simple index 
2. create Index index_name on Student(Email, FirstName) --------------> create a composite index 
3. Drop Index index_name on Students ; ---- drop the index 


# TRANSACTIONS [sequence of SQL operations that either all succeed or all files ] [interviews ]

# ACID PROPERTIES 
1. A - ALL OR NONE [all operation pass or none ]
2. C - Consistency [db move from one valid state to another state ]
3. I - Isolation [Concurrent txs dont interfere with each other ] [diffrent form parallel]
4. D - Durability [data should be durable to stay there ]



# BEGIN Transaction;




# NoSql ---[when data not having a structure ]
--- Document----[MongoDB, Couchbase, DynamoDb ]
--- Key-Value ---[Redis, Memcached ]
--- Search ----[elasticSearch]


# MongoDb [it stores data in JSON like documents, it is designed for flexibility and stability]


