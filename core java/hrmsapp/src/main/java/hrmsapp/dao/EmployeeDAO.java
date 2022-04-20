package hrmsapp.dao;

import java.util.List;

import hrmsapp.model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee employee);
	public Employee getEmployeeById(Integer empId);
	public List<Employee> getAllEmployees();
	public void deleteEmployeeById(Integer empId);
	public void updateEmployee(Employee employee);
}
