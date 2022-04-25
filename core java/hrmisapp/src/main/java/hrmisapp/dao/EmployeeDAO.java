package hrmisapp.dao;

import java.util.List;

import hrmisapp.data.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployeeWithJobTitle(String jobTitle);
}
