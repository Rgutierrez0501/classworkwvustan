package hrmsapp.service;

import java.util.List;

import hrmsapp.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);

	public Employee getEmployeeById(Integer empId);

	public List<Employee> getAllEmployees();

	public void deleteEmployeeById(Integer empId);

	public void updateEmployee(Employee employee);
	
	public List<Employee> getEmployeeDetailsByCity(String city);
}
