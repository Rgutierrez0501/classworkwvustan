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
/**
	Add primary key to employees
*/
alter table employees add primary key(empid);