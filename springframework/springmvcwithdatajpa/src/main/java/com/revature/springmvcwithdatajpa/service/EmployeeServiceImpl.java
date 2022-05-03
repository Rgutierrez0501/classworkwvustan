package com.revature.springmvcwithdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springmvcwithdatajpa.dao.EmployeeRepository;
import com.revature.springmvcwithdatajpa.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) repository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {

		return repository.save(employee);
	}

}
