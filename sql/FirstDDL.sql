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
/**
	show all relations in tradersdb
*/
\dt

/**
	create table with name employee
*/
create table employees(empid bigint,firstname varchar(15),lastname varchar(15),extension varchar(10),email varchar(20),designation varchar(25));
/**
	Insert data into all columns of employees table
*/
insert into employees values(1703,'Jones','Smith','x19200','sjones@gmail.com','Sales Rep');
/**
	Insert data into mapped columns  or not all columns of employees table
*/
insert into employees(empid,firstname,lastname,email,designation) values (1704,'Graham','Latham','graham@abc.com','executive');
insert into employees(empid,firstname,lastname,email,designation) values (1704,'Graham','Latham','graham@abc.com','executive');

/**
	delete a specific row or record from employees table
*/
delete from employees where empid = 1704;
insert into employees(empid,firstname,lastname,email,designation) values (1704,'Graham','Latham','graham@abc.com','executive');
/**
	Add primary key to employees
*/
alter table employees add primary key(empid);

/**
	Below statement will give you error :---
	ERROR:  duplicate key value violates unique constraint "employees_pkey"
DETAIL:  Key (empid)=(1704) already exists.
**/
insert into employees(empid,firstname,lastname,email,designation) values (1704,'Graham','Latham','graham@abc.com','executive');


/**
	Auto increment the empid 
**/
alter table employees add constraint serial primary key(empid);

 insert into employees(firstname,lastname,email,designation) values ('Megan','Orth','megan@abc.com','associate');
 insert into employees(firstname,lastname,email,designation) values ('Desiree','Steffen','desiree@abc.com','associate');
 insert into employees(firstname,lastname,email,designation) values ('Hunter','Risse','hunter@abc.com','associate');
 insert into employees(firstname,lastname,email,designation) values ('Rosa','G','rosa@abc.com','business analyst');
 
 
  update employees set extension='x19201' where empid=1705;
  update employees set extension='x19202' where empid=1706;
  update employees set extension='x19203' where empid=1707;
  update employees set extension='x19204' where empid=1708;
  update employees set extension='x19205' where empid=1709;
  update employees set extension='x19206' where empid=1710;
  
  
  update employees set extension='x19207',designation='software engineer' where empid=1708;
  update employees set extension='x19208',designation='member technical staff' where empid=1709;
  
  select * from employees;
  /**
	Adding primary key in a table is an example of entity integrity
  */
  create table products (skuid varchar(15) primary key, productname varchar(70), productvendor varchar(50),description text);
  
  drop table products;
  
  create table products (skuid varchar(15), productname varchar(70), productvendor varchar(50),
  description text, CONSTRAINT skuid_pk PRIMARY KEY (skuid));
  
  /**
	Referential Integrity
  */
  create table department(deptid bigint primary key,deptname VARCHAR(20)); create table employee(empid bigint primary key ,empname varchar(50),deptid bigint REFERENCES department(deptid));
  insert into department values(1,'IT');
  insert into department values(2,'Marketing');
  insert into department values(1,'Finance');
  
  
insert into employee values(1,'John',4);
ERROR:  insert or update on table "employee" violates foreign key constraint "employee_deptid_fkey"
DETAIL:  Key (deptid)=(4) is not present in table "department".

insert into employee values(1,'John',2);
insert into employee values(2,'Malcom',3);
insert into employee values(3,'Marc',1);
insert into employee values(4,'Jim Carry',2);

select * from employee;


delete from department where deptid=2;
ERROR:  update or delete on table "department" violates foreign key constraint "employee_deptid_fkey" on table "employee"
DETAIL:  Key (deptid)=(2) is still referenced from table "employee".