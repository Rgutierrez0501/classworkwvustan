package com.revature.springmvcexample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.revature.springmvcexample.model.Employee;
import com.revature.springmvcexample.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	// http://localhost:8080/employees
	@RequestMapping("/employees") // Default HTTP get method will be handled here
	public ModelAndView getEmployees() {
		Map model = new HashMap();
		// Retrieve data from DB -- Call service later method -- which will get data
		// from DB
		// Get data or mode from service layer
		List<Employee> empList = employeeService.getEmployees();
		model.put("emps", empList);

		ModelAndView modelAndView = new ModelAndView("employee", model);
		return modelAndView;
	}
	
	/**
	 * 
	 * We are explicitly declaring that getAllEmployees method will handle the http
	 * get request from url http://localhost:8080/allemployees
	 */
	@RequestMapping(value = "/allemployees", method = RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		Map employeeModel = new HashMap();
		List<Employee> empList = employeeService.getAllEmployees();
		employeeModel.put("empList", empList);
		ModelAndView modelAndView = new ModelAndView("allemployee", employeeModel);
		return modelAndView;
	}

}
