DROP DATABASE IF EXISTS tradersdb;
/**
	Show all databases present in the system
*/
\l 
/**
	create database with name tradersdb
*/
CREATE DATABASE tradersdb;
\c tradersdb;


create table student(studentid serial primary key,studentname varchar(50), country varchar(25),state varchar(25));

create table location(locationid serial primary key, country varchar(25),state varchar(25));


insert into location (country,state) values ('Japan','Tokyo');
insert into location (country,state) values ('UK','London');
insert into location (country,state) values ('USA','NA');
insert into location (country,state) values ('UK','London');

insert into student(studentname,country,state) values ('Eric Vara','Japan','Tokyo');
insert into student(studentname,country,state) values ('Shabana Mehr','USA','MA');
insert into student(studentname,country,state) values ('Matthew Nevish','USA','NY');


postgres=# \l
                                         List of databases
   Name    |  Owner   | Encoding |      Collate       |       Ctype        |   Access privileges
-----------+----------+----------+--------------------+--------------------+-----------------------
 ecomdb    | postgres | UTF8     | English_India.1252 | English_India.1252 |
 postgres  | postgres | UTF8     | English_India.1252 | English_India.1252 |
 template0 | postgres | UTF8     | English_India.1252 | English_India.1252 | =c/postgres          +
           |          |          |                    |                    | postgres=CTc/postgres
 template1 | postgres | UTF8     | English_India.1252 | English_India.1252 | =c/postgres          +
           |          |          |                    |                    | postgres=CTc/postgres
 test      | postgres | UTF8     | English_India.1252 | English_India.1252 |
 testdb    | postgres | UTF8     | English_India.1252 | English_India.1252 |
 tradersdb | postgres | UTF8     | English_India.1252 | English_India.1252 |
 training  | postgres | UTF8     | English_India.1252 | English_India.1252 |
(8 rows)


postgres=# \c tradersdb;
You are now connected to database "tradersdb" as user "postgres".
tradersdb=# \dt
           List of relations
 Schema |    Name    | Type  |  Owner
--------+------------+-------+----------
 public | department | table | postgres
 public | employee   | table | postgres
 public | employees  | table | postgres
 public | offices    | table | postgres
 public | products   | table | postgres
(5 rows)


tradersdb=# create customers (customerid serial primary key, custname varchar(20), creditlimit bigint, address varchar(30);
tradersdb(# );
ERROR:  syntax error at or near "customers"
LINE 1: create customers (customerid serial primary key, custname va...
               ^
tradersdb=# create customers (customerid serial primary key, custname varchar(20), creditlimit bigint, address varchar(30));
ERROR:  syntax error at or near "customers"
LINE 1: create customers (customerid serial primary key, custname va...
               ^
tradersdb=# create table customers (customerid serial primary key, custname varchar(20), creditlimit bigint, address varchar(30));
CREATE TABLE
tradersdb=# \d customers;
                                          Table "public.customers"
   Column    |         Type          | Collation | Nullable |                    Default
-------------+-----------------------+-----------+----------+-----------------------------------------------
 customerid  | integer               |           | not null | nextval('customers_customerid_seq'::regclass)
 custname    | character varying(20) |           |          |
 creditlimit | bigint                |           |          |
 address     | character varying(30) |           |          |
Indexes:
    "customers_pkey" PRIMARY KEY, btree (customerid)


tradersdb=# insert into customers values (1,'Mickey',10000,'Ohio');
INSERT 0 1
tradersdb=# insert into customers values (2,'Mike',5000,'Toronto');
INSERT 0 1
tradersdb=# insert into customers values (3,'George',15000,'Istanbul');
INSERT 0 1
tradersdb=# insert into customers values (4,'Melinda',25000,'Tel Aviv');
INSERT 0 1
tradersdb=#
tradersdb=# select * from customers;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
(4 rows)


tradersdb=# insert into customers values (5,'Gates',-5000,'Paris');
INSERT 0 1
tradersdb=# select creditlimit from customers;
 creditlimit
-------------
       10000
        5000
       15000
       25000
       -5000
(5 rows)


tradersdb=# select +creditlimit from customers;
 ?column?
----------
    10000
     5000
    15000
    25000
    -5000
(5 rows)


tradersdb=# select -creditlimit from customers;
 ?column?
----------
   -10000
    -5000
   -15000
   -25000
     5000
(5 rows)


tradersdb=# select -(creditlimit) from customers;
 ?column?
----------
   -10000
    -5000
   -15000
   -25000
     5000
(5 rows)


tradersdb=# select (creditlimit) from customers;
 creditlimit
-------------
       10000
        5000
       15000
       25000
       -5000
(5 rows)


tradersdb=# select +(creditlimit) from customers;
 ?column?
----------
    10000
     5000
    15000
    25000
    -5000
(5 rows)


tradersdb=# select -(creditlimit) from customers;
 ?column?
----------
   -10000
    -5000
   -15000
   -25000
     5000
(5 rows)


tradersdb=# select (creditlimit/10) from customers;
 ?column?
----------
     1000
      500
     1500
     2500
     -500
(5 rows)


tradersdb=# select (creditlimit*10) from customers;
 ?column?
----------
   100000
    50000
   150000
   250000
   -50000
(5 rows)


tradersdb=# select (creditlimit+10000) from customers;
 ?column?
----------
    20000
    15000
    25000
    35000
     5000
(5 rows)


tradersdb=# select (creditlimit-10000) from customers;
 ?column?
----------
        0
    -5000
     5000
    15000
   -15000
(5 rows)


tradersdb=# select * from customres;
ERROR:  relation "customres" does not exist
LINE 1: select * from customres;
                      ^
tradersdb=# select * from customers;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(5 rows)


tradersdb=# select * from customers where custname = 'Mike';
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
          2 | Mike     |        5000 | Toronto
(1 row)


tradersdb=# select * from customers where creditlimit >15000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          4 | Melinda  |       25000 | Tel Aviv
(1 row)


tradersdb=# select * from customers where creditlimit >=15000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
(2 rows)


tradersdb=# select * from customers where creditlimit <15000;
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          5 | Gates    |       -5000 | Paris
(3 rows)


tradersdb=# select * from customers where creditlimit <=15000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          5 | Gates    |       -5000 | Paris
(4 rows)


tradersdb=# select * from customers where creditlimit !=15000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(4 rows)


tradersdb=# select * from customers where creditlimit <> 15000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(4 rows)


tradersdb=# select * from customers where address IN ('Ohio','Paris');
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
          1 | Mickey   |       10000 | Ohio
          5 | Gates    |       -5000 | Paris
(2 rows)


tradersdb=# select * from customers where address NOT IN ('Ohio','Paris');
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
(3 rows)


tradersdb=# select * from customers where creditlimit between 10000 and 20000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          3 | George   |       15000 | Istanbul
(2 rows)


tradersdb=# select * from customers where creditlimit not between 10000 and 20000;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          2 | Mike     |        5000 | Toronto
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(3 rows)


tradersdb=# select * from customers where custname like '%M';
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
(0 rows)


tradersdb=# select * from customers where custname like '%s';
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
          5 | Gates    |       -5000 | Paris
(1 row)


tradersdb=# select * from customers where custname like '%a';
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          4 | Melinda  |       25000 | Tel Aviv
(1 row)


tradersdb=# select * from customers where custname not like '%a';
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          5 | Gates    |       -5000 | Paris
(4 rows)


tradersdb=# select * from customers where custname is not null and creditlimit <=10000;
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          5 | Gates    |       -5000 | Paris
(3 rows)


tradersdb=# select * from customers where custname is null and creditlimit <=10000;
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
(0 rows)


tradersdb=# select * from customers where custname is null and creditlimit <=10000;
 customerid | custname | creditlimit | address
------------+----------+-------------+---------
(0 rows)


tradersdb=# \d
                    List of relations
 Schema |           Name           |   Type   |  Owner
--------+--------------------------+----------+----------
 public | customers                | table    | postgres
 public | customers_customerid_seq | sequence | postgres
 public | department               | table    | postgres
 public | employee                 | table    | postgres
 public | employees                | table    | postgres
 public | employees_empid_seq      | sequence | postgres
 public | offices                  | table    | postgres
 public | products                 | table    | postgres
(8 rows)


tradersdb=# \dt
           List of relations
 Schema |    Name    | Type  |  Owner
--------+------------+-------+----------
 public | customers  | table | postgres
 public | department | table | postgres
 public | employee   | table | postgres
 public | employees  | table | postgres
 public | offices    | table | postgres
 public | products   | table | postgres
(6 rows)


tradersdb=# select * from customers;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(5 rows)


tradersdb=# select * from products;
 skuid | productname | productvendor | description
-------+-------------+---------------+-------------
(0 rows)


tradersdb=# insert into products values(1,'mac book pro','apple inc','laptop';
tradersdb(# );
ERROR:  syntax error at or near ";"
LINE 1: ... into products values(1,'mac book pro','apple inc','laptop';
                                                                      ^
tradersdb=# insert into products values(1,'mac book pro','apple inc','laptop');
INSERT 0 1
tradersdb=# insert into products values(2,'mac book air','apple inc','laptop');
INSERT 0 1
tradersdb=# insert into products values(3,'mac book air charger ','apple inc','accessories');
INSERT 0 1
tradersdb=# insert into products values(3,'ear pod ','apple inc','accessories');
ERROR:  duplicate key value violates unique constraint "skuid_pk"
DETAIL:  Key (skuid)=(3) already exists.
tradersdb=# insert into products values(4,'ear pod ','apple inc','accessories');
INSERT 0 1
tradersdb=# insert into products values(5,'ear pod  plus plus','apple inc','accessories');
INSERT 0 1
tradersdb=# select * from products;
 skuid |      productname      | productvendor | description
-------+-----------------------+---------------+-------------
 1     | mac book pro          | apple inc     | laptop
 2     | mac book air          | apple inc     | laptop
 3     | mac book air charger  | apple inc     | accessories
 4     | ear pod               | apple inc     | accessories
 5     | ear pod  plus plus    | apple inc     | accessories
(5 rows)


tradersdb=# select custname from customers UNION select product_name from products;
ERROR:  column "product_name" does not exist
LINE 1: select custname from customers UNION select product_name fro...
                                                    ^
HINT:  Perhaps you meant to reference the column "products.productname".
tradersdb=# select custname from customers UNION select productname from products;
       custname
-----------------------
 Gates
 ear pod
 mac book air charger
 mac book pro
 Mike
 Mickey
 George
 ear pod  plus plus
 Melinda
 mac book air
(10 rows)


tradersdb=# select custname from customers UNION  ALL select productname from products;
       custname
-----------------------
 Mickey
 Mike
 George
 Melinda
 Gates
 mac book pro
 mac book air
 mac book air charger
 ear pod
 ear pod  plus plus
(10 rows)


tradersdb=# select custname from customers INTERSECT  select productname from products;
 custname
----------
(0 rows)


tradersdb=# create table student(studentid serial primary key,studentname varchar(50), country varchar(25),state varchar(25);
tradersdb(# ;
tradersdb(# );
ERROR:  syntax error at or near ";"
LINE 1: ...entname varchar(50), country varchar(25),state varchar(25);
                                                                     ^
tradersdb=# create table student(studentid serial primary key,studentname varchar(50), country varchar(25),state varchar(25));
CREATE TABLE
tradersdb=# create table location(locationid serial primary key, country varchar(25),state varchar(25);
tradersdb(# );
ERROR:  syntax error at or near ";"
LINE 1: ...d serial primary key, country varchar(25),state varchar(25);
                                                                      ^
tradersdb=# create table location(locationid serial primary key, country varchar(25),state varchar(25));
CREATE TABLE
tradersdb=# \d location;
                                         Table "public.location"
   Column   |         Type          | Collation | Nullable |                   Default
------------+-----------------------+-----------+----------+----------------------------------------------
 locationid | integer               |           | not null | nextval('location_locationid_seq'::regclass)
 country    | character varying(25) |           |          |
 state      | character varying(25) |           |          |
Indexes:
    "location_pkey" PRIMARY KEY, btree (locationid)


tradersdb=# \d student;
                                         Table "public.student"
   Column    |         Type          | Collation | Nullable |                  Default
-------------+-----------------------+-----------+----------+--------------------------------------------
 studentid   | integer               |           | not null | nextval('student_studentid_seq'::regclass)
 studentname | character varying(50) |           |          |
 country     | character varying(25) |           |          |
 state       | character varying(25) |           |          |
Indexes:
    "student_pkey" PRIMARY KEY, btree (studentid)


tradersdb=#
tradersdb=# insert into location (country,state) values ('Japan','Tokyo');
INSERT 0 1
tradersdb=# insert into location (country,state) values ('UK','London');
INSERT 0 1
tradersdb=# insert into location (country,state) values ('USA','NA');
INSERT 0 1
tradersdb=# insert into location (country,state) values ('UK','London');
INSERT 0 1
tradersdb=# select  * from location;
 locationid | country | state
------------+---------+--------
          1 | Japan   | Tokyo
          2 | UK      | London
          3 | USA     | NA
          4 | UK      | London
(4 rows)


tradersdb=# insert into student(studentname,country,state) values ('Eric Vara','Japan','Tokyo');
INSERT 0 1
tradersdb=# insert into student(studentname,country,state) values ('Shabana Mehr','USA','MA');
INSERT 0 1
tradersdb=# insert into student(studentname,country,state) values ('Matthew Nevish','USA','NY');
INSERT 0 1
tradersdb=# select country,state from student union select country,state from location;
 country | state
---------+--------
 Japan   | Tokyo
 USA     | MA
 USA     | NA
 USA     | NY
 UK      | London
(5 rows)


tradersdb=# select * from student;
 studentid |  studentname   | country | state
-----------+----------------+---------+-------
         1 | Eric Vara      | Japan   | Tokyo
         2 | Shabana Mehr   | USA     | MA
         3 | Matthew Nevish | USA     | NY
(3 rows)


tradersdb=# select country,state from student union all select country,state from location;
 country | state
---------+--------
 Japan   | Tokyo
 USA     | MA
 USA     | NY
 Japan   | Tokyo
 UK      | London
 USA     | NA
 UK      | London
(7 rows)


tradersdb=# \dt
           List of relations
 Schema |    Name    | Type  |  Owner
--------+------------+-------+----------
 public | customers  | table | postgres
 public | department | table | postgres
 public | employee   | table | postgres
 public | employees  | table | postgres
 public | location   | table | postgres
 public | offices    | table | postgres
 public | products   | table | postgres
 public | student    | table | postgres
(8 rows)


tradersdb=# select * from customers;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(5 rows)


tradersdb=# select count(*) from customers;
 count
-------
     5
(1 row)


tradersdb=# select sum(creditlimit) from customers where creditlimit >0;
  sum
-------
 55000
(1 row)


tradersdb=# select avg(creditlimit) from customers;
          avg
------------------------
 10000.0000000000000000
(1 row)


tradersdb=# select avg(creditlimit) from customers where creditlimit>5000;
        avg
--------------------
 16666.666666666667
(1 row)


tradersdb=# select min(creditlimit) from customers;
  min
-------
 -5000
(1 row)


tradersdb=# select max(creditlimit) from customers;
  max
-------
 25000
(1 row)


tradersdb=# select * from customers;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(5 rows)


tradersdb=# select ucase(custname) from customers;
ERROR:  function ucase(character varying) does not exist
LINE 1: select ucase(custname) from customers;
               ^
HINT:  No function matches the given name and argument types. You might need to add explicit type casts.
tradersdb=# select UCASE(string);
ERROR:  column "string" does not exist
LINE 1: select UCASE(string);
                     ^
tradersdb=# select UCASE(custname) from customers;
ERROR:  function ucase(character varying) does not exist
LINE 1: select UCASE(custname) from customers;
               ^
HINT:  No function matches the given name and argument types. You might need to add explicit type casts.
tradersdb=# select upper(custname) from customers;
  upper
---------
 MICKEY
 MIKE
 GEORGE
 MELINDA
 GATES
(5 rows)


tradersdb=# select customerid,upper(custname) "Customer Name" from customers;
 customerid | Customer Name
------------+---------------
          1 | MICKEY
          2 | MIKE
          3 | GEORGE
          4 | MELINDA
          5 | GATES
(5 rows)


tradersdb=# select customerid as Customer Id,upper(custname) "Customer Name" from customers;
ERROR:  syntax error at or near "Id"
LINE 1: select customerid as Customer Id,upper(custname) "Customer N...
                                      ^
tradersdb=# select customerid as "Customer Id",upper(custname) "Customer Name" from customers;
 Customer Id | Customer Name
-------------+---------------
           1 | MICKEY
           2 | MIKE
           3 | GEORGE
           4 | MELINDA
           5 | GATES
(5 rows)


tradersdb=# \d customers;
                                          Table "public.customers"
   Column    |         Type          | Collation | Nullable |                    Default
-------------+-----------------------+-----------+----------+-----------------------------------------------
 customerid  | integer               |           | not null | nextval('customers_customerid_seq'::regclass)
 custname    | character varying(20) |           |          |
 creditlimit | bigint                |           |          |
 address     | character varying(30) |           |          |
Indexes:
    "customers_pkey" PRIMARY KEY, btree (customerid)


tradersdb=# select customerid as "Customer Id",lower(custname) "Customer Name" from customers;
 Customer Id | Customer Name
-------------+---------------
           1 | mickey
           2 | mike
           3 | george
           4 | melinda
           5 | gates
(5 rows)


tradersdb=# select customerid as "Customer Id",concat(custname, ' ','Baloch' ) "Customer Name" from customers;
 Customer Id | Customer Name
-------------+----------------
           1 | Mickey Baloch
           2 | Mike Baloch
           3 | George Baloch
           4 | Melinda Baloch
           5 | Gates Baloch
(5 rows)


tradersdb=# select customerid as "Customer Id",concat(custname, ' ','Baloch' ) "Customer Name",now() "Current Date" from customers;
 Customer Id | Customer Name  |           Current Date
-------------+----------------+----------------------------------
           1 | Mickey Baloch  | 2022-04-01 22:28:56.837799+05:30
           2 | Mike Baloch    | 2022-04-01 22:28:56.837799+05:30
           3 | George Baloch  | 2022-04-01 22:28:56.837799+05:30
           4 | Melinda Baloch | 2022-04-01 22:28:56.837799+05:30
           5 | Gates Baloch   | 2022-04-01 22:28:56.837799+05:30
(5 rows)


tradersdb=# create table person(personid serial primary key,firstname varchar(15),lastname varchar(15),entrydate DATE DEFAULT CURRENT_DATE);
CREATE TABLE
tradersdb=# insert into person values('Shabana','Meher');
ERROR:  invalid input syntax for type integer: "Shabana"
LINE 1: insert into person values('Shabana','Meher');
                                  ^
tradersdb=# insert into person(firstname,lastname) values('Shabana','Meher');
INSERT 0 1
tradersdb=# select * from person;
 personid | firstname | lastname | entrydate
----------+-----------+----------+------------
        1 | Shabana   | Meher    | 2022-04-01
(1 row)


tradersdb=# select substring(person,1,3) from person;
ERROR:  function substring(person, integer, integer) does not exist
LINE 1: select substring(person,1,3) from person;
               ^
HINT:  No function matches the given name and argument types. You might need to add explicit type casts.
tradersdb=# select substring(firstname,1,3) from person;
 substring
-----------
 Sha
(1 row)


tradersdb=# select substring(firstname,2,5) from person;
 substring
-----------
 haban
(1 row)


tradersdb=# select substring(firstname,2,5) from person;
 substring
-----------
 haban
(1 row)


tradersdb=# select * from person;
 personid | firstname | lastname | entrydate
----------+-----------+----------+------------
        1 | Shabana   | Meher    | 2022-04-01
(1 row)


tradersdb=# insert into person(firstname,lastname) values(' Eric     ','  Vara ');
INSERT 0 1
tradersdb=# select * from person;
 personid | firstname  | lastname | entrydate
----------+------------+----------+------------
        1 | Shabana    | Meher    | 2022-04-01
        2 |  Eric      |   Vara   | 2022-04-01
(2 rows)


tradersdb=# select trim(firstname),trim(lastname),entrydate from person where personid= 2
tradersdb-# ;
 btrim | btrim | entrydate
-------+-------+------------
 Eric  | Vara  | 2022-04-01
(1 row)


tradersdb=# select firstname,lastname,entrydate from person where personid= 2;
 firstname  | lastname | entrydate
------------+----------+------------
  Eric      |   Vara   | 2022-04-01
(1 row)


tradersdb=# select * from customers;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
(5 rows)


tradersdb=# select abs(creditlimit) from customers;
  abs
-------
 10000
  5000
 15000
 25000
  5000
(5 rows)


tradersdb=# insert into customers(custname,creditlimit,address) values('Graham',5555.64,'Boston');
ERROR:  duplicate key value violates unique constraint "customers_pkey"
DETAIL:  Key (customerid)=(1) already exists.
tradersdb=# insert into customers(custoemrid,custname,creditlimit,address) values(6,'Graham',5555.64,'Boston');
ERROR:  column "custoemrid" of relation "customers" does not exist
LINE 1: insert into customers(custoemrid,custname,creditlimit,addres...
                              ^
tradersdb=#
tradersdb=# insert into customers(customerid,custname,creditlimit,address) values(6,'Graham',5555.64,'Boston');
INSERT 0 1
tradersdb=# select * from customers
tradersdb-# ;
 customerid | custname | creditlimit | address
------------+----------+-------------+----------
          1 | Mickey   |       10000 | Ohio
          2 | Mike     |        5000 | Toronto
          3 | George   |       15000 | Istanbul
          4 | Melinda  |       25000 | Tel Aviv
          5 | Gates    |       -5000 | Paris
          6 | Graham   |        5556 | Boston
(6 rows)


tradersdb=# select (CEIL(17.36)) FROM dual;
ERROR:  relation "dual" does not exist
LINE 1: select (CEIL(17.36)) FROM dual;
                                  ^
tradersdb=# select (CEIL(17.36)) FROM creditlimit;
ERROR:  relation "creditlimit" does not exist
LINE 1: select (CEIL(17.36)) FROM creditlimit;
                                  ^
tradersdb=# select (CEIL(17.36)) FROM customers;
 ceil
------
   18
   18
   18
   18
   18
   18
(6 rows)


tradersdb=# \d customers;
                                          Table "public.customers"
   Column    |         Type          | Collation | Nullable |                    Default
-------------+-----------------------+-----------+----------+-----------------------------------------------
 customerid  | integer               |           | not null | nextval('customers_customerid_seq'::regclass)
 custname    | character varying(20) |           |          |
 creditlimit | bigint                |           |          |
 address     | character varying(30) |           |          |
Indexes:
    "customers_pkey" PRIMARY KEY, btree (customerid)


tradersdb=# alter table customers add column orderamount double precision;
ALTER TABLE
tradersdb=# \d customers;
                                          Table "public.customers"
   Column    |         Type          | Collation | Nullable |                    Default
-------------+-----------------------+-----------+----------+-----------------------------------------------
 customerid  | integer               |           | not null | nextval('customers_customerid_seq'::regclass)
 custname    | character varying(20) |           |          |
 creditlimit | bigint                |           |          |
 address     | character varying(30) |           |          |
 orderamount | double precision      |           |          |
Indexes:
    "customers_pkey" PRIMARY KEY, btree (customerid)


tradersdb=# insert into customers(customerid,custname,creditlimit,address,orderamount) values(7,'Samuel',5555.64,'Boston',5555.32423);
INSERT 0 1
tradersdb=# select * from customers;
 customerid | custname | creditlimit | address  | orderamount
------------+----------+-------------+----------+-------------
          1 | Mickey   |       10000 | Ohio     |
          2 | Mike     |        5000 | Toronto  |
          3 | George   |       15000 | Istanbul |
          4 | Melinda  |       25000 | Tel Aviv |
          5 | Gates    |       -5000 | Paris    |
          6 | Graham   |        5556 | Boston   |
          7 | Samuel   |        5556 | Boston   |  5555.32423
(7 rows)


tradersdb=# select ceil(orderamount) from customers;
 ceil
------






 5556
(7 rows)


tradersdb=# select floor(orderamount) from customers;
 floor
-------






  5555
(7 rows)


tradersdb=# select mod(creditlimit,5) from customers;
 mod
-----
   0
   0
   0
   0
   0
   1
   1
(7 rows)


tradersdb=# select * from customers;
 customerid | custname | creditlimit | address  | orderamount
------------+----------+-------------+----------+-------------
          1 | Mickey   |       10000 | Ohio     |
          2 | Mike     |        5000 | Toronto  |
          3 | George   |       15000 | Istanbul |
          4 | Melinda  |       25000 | Tel Aviv |
          5 | Gates    |       -5000 | Paris    |
          6 | Graham   |        5556 | Boston   |
          7 | Samuel   |        5556 | Boston   |  5555.32423
(7 rows)


tradersdb=# select custname,POWER(creditlimit,3) from customers;
 custname |     power
----------+----------------
 Mickey   |  1000000000000
 Mike     |   125000000000
 George   |  3375000000000
 Melinda  | 15625000000000
 Gates    |  -125000000000
 Graham   |   171508919616
 Samuel   |   171508919616
(7 rows)


tradersdb=# select custname,POWER(creditlimit,2) from customers;
 custname |   power
----------+-----------
 Mickey   | 100000000
 Mike     |  25000000
 George   | 225000000
 Melinda  | 625000000
 Gates    |  25000000
 Graham   |  30869136
 Samuel   |  30869136
(7 rows)


tradersdb=# select custname,SQRT(creditlimit) from customers where customerid IN (2,3,4);
 custname |        sqrt
----------+--------------------
 Mike     |  70.71067811865476
 George   | 122.47448713915891
 Melinda  | 158.11388300841898
(3 rows)


tradersdb=# \d person;
                                        Table "public.person"
  Column   |         Type          | Collation | Nullable |                 Default
-----------+-----------------------+-----------+----------+------------------------------------------
 personid  | integer               |           | not null | nextval('person_personid_seq'::regclass)
 firstname | character varying(15) |           |          |
 lastname  | character varying(15) |           |          |
 entrydate | date                  |           |          | CURRENT_DATE
Indexes:
    "person_pkey" PRIMARY KEY, btree (personid)


tradersdb=# select * from person;
 personid | firstname  | lastname | entrydate
----------+------------+----------+------------
        1 | Shabana    | Meher    | 2022-04-01
        2 |  Eric      |   Vara   | 2022-04-01
(2 rows)


                                    ^
HINT:  No operator matches the given name and argument types. You might need to add explicit type casts.
tradersdb=# SELECT current_date + INTERVAL '1 day';
      ?column?
---------------------
 2022-04-03 00:00:00
(1 row)


tradersdb=#