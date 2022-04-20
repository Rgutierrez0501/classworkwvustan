package hrmsapp.service;

import java.util.List;

import hrmsapp.dao.EmployeeDAO;
import hrmsapp.dao.EmployeeDAOImpl;
import hrmsapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public void addEmployee(Employee employee) {
		//Here logic to call data layer method addEmployee
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.addEmployee(employee);
	}

	public Employee getEmployeeById(Integer empId) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		Employee emp = employeeDAO.getEmployeeById(empId);
		return emp;
	}

	public List<Employee> getAllEmployees() {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		List<Employee> listOfEmployee =employeeDAO.getAllEmployees();
		return listOfEmployee;
	}

	public void deleteEmployeeById(Integer empId) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.deleteEmployeeById(empId);

	}

	public void updateEmployee(Employee employee) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		employeeDAO.updateEmployee(employee);
	}

}
