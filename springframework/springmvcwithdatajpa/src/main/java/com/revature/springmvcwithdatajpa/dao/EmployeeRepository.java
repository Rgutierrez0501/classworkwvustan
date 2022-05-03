package com.revature.springmvcwithdatajpa.dao;
/*
Spring Data JPA focuses on using JPA to store data in a Relational DB.
* Its most compelling feature is the ability to create repository implementations automatically,
* at runtime, from a repository interface
*/

import org.springframework.data.repository.CrudRepository;

import com.revature.springmvcwithdatajpa.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {


}
