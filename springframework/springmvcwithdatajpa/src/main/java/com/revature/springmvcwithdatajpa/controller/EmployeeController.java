package com.revature.springmvcwithdatajpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.springmvcwithdatajpa.entity.Employee;
import com.revature.springmvcwithdatajpa.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	//Retrieve all employees
	@GetMapping("/retrieveemployees")
	public ModelAndView getAllEmployees() {
		List<Employee> listOfEmployee = employeeService.getAllEmployees();
		Map employeeModel = new HashMap();
		/**
		 * Model model = null; model.addAttribute("listOfEmployee", listOfEmployee);
		 * return new ModelAndView("allemployee",model.asMap());
		 **/
		if (!listOfEmployee.isEmpty()) {
			employeeModel.put("listOfEmployee", listOfEmployee);
			return new ModelAndView("allemployee", employeeModel, HttpStatus.OK);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel, HttpStatus.NOT_FOUND);
		}

	}
	
	// GetEmployeeForm
		@GetMapping("/employee")
		public ModelAndView getEmployeeForm(@ModelAttribute Employee employee) {
			ModelAndView modelAndView = new ModelAndView("employeeform");
			return modelAndView;
		}
		
		// Create
		@PostMapping("/saveemployee")
		public ModelAndView addEmployee(Employee employee) {
			Employee emp = employeeService.addEmployee(employee);
			ModelAndView modelAndView;
			// Model in Spring Web MVC is a map
			Map messageModel = new HashMap();
			if (emp != null) {
				messageModel.put("emplData", emp);
				modelAndView = new ModelAndView("successWithData", messageModel);
			} else {
				messageModel.put("errormsg", "Unable to add employee");
				modelAndView = new ModelAndView("errorMsg", messageModel);
			}
			return modelAndView;
		}
}
