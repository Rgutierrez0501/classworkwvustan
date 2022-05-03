package com.revature.springmvcexample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	/**
	 * Add employee data Below Method receives data from URL as parameter in the
	 * form key value pair http://localhost:8080/addemployee?id=21&name=Jyotika
	 * http://localhost:8080/addemployee?query string parameters
	 */
	@RequestMapping(value = "/addemployee", method = RequestMethod.GET)
	public ModelAndView addEmployeeReceiveDataUsingRequestParam(@RequestParam(value = "id") Integer empId,
			@RequestParam(value = "name") String empName) {

		// Created an employee object- by calling or invoking the Employee()
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);

		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (isEmployeeAdded) {
			messageModel.put("successmsg", "Employee added successfully");
			modelAndView = new ModelAndView("success", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

	// Below Method receives data from URL
	// http://localhost:8080/addEmployee/21/Jyotika
	@GetMapping("/addEmployee/{empId}/{empName}")
	public ModelAndView addEmployeeUsingPathVariable(@PathVariable Integer empId, @PathVariable String empName) {
		// Created an employee object- by calling or invoking the Employee()
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);

		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (isEmployeeAdded) {
			messageModel.put("successmsg", "Employee added successfully");
			modelAndView = new ModelAndView("success", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

	// URL- http://localhost:8080/employee
	@GetMapping("/employee")
	public ModelAndView getEmployeeForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("addemployee");
		return modelAndView;
	}

	// RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	@PostMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (isEmployeeAdded) {
			messageModel.put("emplData", employee);
			modelAndView = new ModelAndView("successWithData", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}
}
