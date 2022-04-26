package hrmisapp.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hrmisapp.dao.EmployeeDAO;
import hrmisapp.dao.EmployeeDAOImpl;
import hrmisapp.data.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> getEmployeeWithJobTitle(String jobTitle) {
			EmployeeDAO employeeDAO = new EmployeeDAOImpl();
			List<Employee> empList = employeeDAO.getEmployeeWithJobTitle(jobTitle);
			//sorted empList
			//Collections.sort(empList,Comparator.comparing(Employee::getAge));
			//empList.stream().filter(e->e.getAge()>25).toList();
			
			return empList.stream().filter(e->e.getAge()>25).toList();
	}

	@Override
	public List<Employee> getAllEmployeesSortBySalary() {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		List<Employee> empList = employeeDAO.getAllEmployees();
		Collections.sort(empList,Comparator.comparing(Employee::getSalary));
		return empList;
	}

}
