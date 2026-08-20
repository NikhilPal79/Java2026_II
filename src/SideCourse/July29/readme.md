

# Type of Databases
1. NoSql [collection, document ][in form of key-value pair] 
2. SQL [structural query language ][tables with rows and coloums]


# SQL
1. MySql 
2. PostgreSql
3. MicroSoftSql
4. Oracle

# NoSQL
1. MongoDb
2. Redis

# RDBMS [RELATIONAL DATABASE MANAGEMENT SYSTEM ] [SOFTWARE]

# SQL [use to communicate to RDBMS]

# Type of SQL [Structured Query Language ]
1. DDL [Data Definition Language]
2. DQL [Data Query Language ]
3. DML [Data Manipulation Language]
4. DCL [Data Control Language]
5. TCL [Transaction Control Language] [manage transcation]


https://dev.mysql.com/downloads/workbench/ [download mysql]
database-1.cdq0q0imew01.us-east-2.rds.amazonaws.com [url]
admin
pragra123


create database pragar;
use employee_db;
use sys;

show tables;

select * from employees;
select id, name,salary from employees;
select distinct address from employees;

select * from employees where address = "USA";
select * from employees where address = "UK";
select * from employees where name = "John Smith";
select * from employees where salary > 70000;
select * from employees where salary BETWEEN 60000 AND 75000;
SELECT * from employees LIMIT 5 offset 14;
select * from employees ORDER BY name desc;
describe employees;
select * from employees where address IN ("USA","UK");

select * from employees where address = "USA" AND gender = "Female";

select * from employees where name LIKE '%ow%';
select * from employees where address LIKE 'U_';
select * from employees where address IS NOT NULL;

1. create database Pragra [create new db]
2. drop database Pragra [delete db]
3. use database Pragra []
4. show tables [show the table in db ]
5. LIKE '%KH%' [ANYTHING BEFORE % AND ANYTHING AFTER %]
6. LIKE 'N_' [ONLY SINGLE CHARACTER AFTER N ]
7. DISTINCT [FOR UNIQUE VALUES ]
8. WHERE [FOR ANY CONDITION]
9. WHERE WITH CONDITION 1  AND CONDITION 2
10. WHERE ____ IN [TWO FILTER FROM SAME COLUMNS ]  
11. SORT [ORDER BY ASC, DESC]
12. LIMIT [IF YOU NEED ONLY FIRST 5 ] [interview]
13. OFFSET 10 [SKIPPING HOW MANY RECORDS ] [interview]
14. DESCRIBE DATABASE [WILL SHOW YOU ALL SCHEMA FOR DATABASE]





