# SQL CONSTRAINTS [rules applied to table columns to limit the type of data that can be entered]
1. NOT NULL
2. UNIQUE
3. PRIMARY KEY 
4. FOREIGN KEY 
5. CHECK 
6. DEFAULT

# DATA TYPE SQL
1. INT - 25
2. DECIMAL 
3. FLOAT 
4. DOUBLE 
5. CHAR --- FIXED LENGTH STRING
6. VARCHAR ---- VARIABLE LENGTH STRING 
7. TEXT 
8. DATE
9. TIME 
10. DATETIME 
11. TIMESTAMP ---- STORES DATA & TIME (OFTEN AUTO UPDATED)
12. BOOLEAN
13. BLOB --- BINARY DATA , IMAGES, pdf

# create table -- 
1. create table STUDENTS (
                          StudentId INT PRIMARY KEY AUTO_INCREMENT, 
                          FirstName VARCHAR(50) NOT NULL, 
                          LastName varchar(50) NOT NULL, 
                          Email VARCHAR(100) UNIQUE, 
                          DateOfBirth DATE , 
                          EnrollmentDate TIMESTAMP DEFAULT current_timestamp );

# insert single record -- 
1. INSERT INTO STUDENTS (FirstName, LastName, Email, DateOfBirth) values ('PARTH','Contractor','path@gmail.com','1995-05-15' );
# insert multiple records -- 
1. INSERT INTO STUDENTS (FirstName, LastName, Email, DateOfBirth)
                 values ('Sejal','Sejal','sejal@gmail.com','1995-06-15' ),('Sandeep','Aulakh','sandeep@gmail.com','1995-05-15' );
# UPDATE 
1. STUDENTS SET lastname = 'Singh', email = 'singh@gmail.com' where studentId = 5;
# DELETE
1. Delete from STUDENTS where studentid > 7; 
# ALTER
1. ALTER table STUDENTS MODIFY email VARCHAR(100) NOT NULL;
# A table can have only 1 primary key. primary key vs unique key --
# Foreign key -> primary key from one table will become the foreign key in another table.
# ALIAS
1. SELECT COUNT(*) AS ABC FROM STUDENTS;
/// SELECT gender, SUM(salary) AS AVG_Salary from employees GROUP BY gender;
# JOINTS 
# JOIN -> It allows you to combine the data from multiple tables based on related columns.

# INEER JOIN [Return records with matching values in both the tables]
# LEFT JOIN [Return all records from left table + matches from the right table]
# RIGHT JOIN [Return all records from right table + matches from the left table]
# FULL JOIN [return all records from both the tables][LEFT-JOIN UNION RIGHT-JOIN = FULL JOIN in MYSQL]

# INNER JOIN -- 
1. Select s.student_name, c.course_name, e.grade from Student s 
    INNER JOIN Enrollment e on e.student_id = s.student_id 
    INNER JOIN Course c on e.course_id = c.course_id;

# LEFT JOIN -- 
1. Select s.student_name, c.course_name, e.grade from Student s 
       LEFT JOIN Enrollment e on e.student_id = s.student_id 
       LEFT JOIN Course c on e.course_id = c.course_id;

# RIGHT JOIN -- 
1. Select s.student_name, c.course_name, e.grade from Student s 
           RIGHT JOIN Enrollment e on e.student_id = s.student_id 
           RIGHT JOIN Course c on e.course_id = c.course_id;

# Stored procedure [A stored procedure is a prepared SQL code that you can save, so the code can be reused over and over again.]

# INTERVIEW [find second-highest salary ???] 
1. select MAX(salary) AS second_highest from employees where salary < ( select MAX(Salary) from employees ) ;
2. select name, salary from employees order by salary desc LIMIT 1 OFFSET 2;
