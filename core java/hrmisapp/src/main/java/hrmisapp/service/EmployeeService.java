package hrmisapp.service;

import java.util.List;

import hrmisapp.data.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployeeWithJobTitle(String jobTitle);

}
