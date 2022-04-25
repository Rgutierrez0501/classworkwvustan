package hrmisapp.service;

import java.util.List;

import hrmisapp.dao.EmployeeDAO;
import hrmisapp.dao.EmployeeDAOImpl;
import hrmisapp.data.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> getEmployeeWithJobTitle(String jobTitle) {
			EmployeeDAO employeeDAO = new EmployeeDAOImpl();
			List<Employee> empList = employeeDAO.getEmployeeWithJobTitle(jobTitle);
			//sorted empList
			return null;
	}

}
