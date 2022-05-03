package com.revature.springmvcwithdatajpa.service;

import java.util.List;

import com.revature.springmvcwithdatajpa.entity.Employee;

public interface EmployeeService {
		//Retrieve
		public List<Employee> getAllEmployees();
		
		//Create
		public Employee addEmployee(Employee employee);
}
