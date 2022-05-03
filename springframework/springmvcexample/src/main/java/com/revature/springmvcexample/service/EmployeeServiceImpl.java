package com.revature.springmvcexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springmvcexample.dao.EmployeeDAO;
import com.revature.springmvcexample.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO empoyeeDAO;

	@Override
	public List<Employee> getEmployees() {
		// Will get employees from DB --- it will call DAO layer methods
		/**
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.getEmployees();
		**/
		/**
		List<Employee> empList= empoyeeDAO.getEmployees();
		return empList;
		**/
		return empoyeeDAO.getEmployees();
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return empoyeeDAO.getAllEmployees();
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		return empoyeeDAO.addEmployee(employee);
	}

}
