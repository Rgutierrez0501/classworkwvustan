package hrmsapp.dao;

import java.util.ArrayList;
import java.util.List;

import hrmsapp.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	public static List<Employee> listOfEmp = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee) {
		//Call the method or execute query to save employee object in DB
		listOfEmp.add(employee);	
	}

	public Employee getEmployeeById(Integer empId) {
		//Logic to retrieve employee from DB
		for(Employee emp:listOfEmp) {
			if(emp.getEmpId() == empId) {
				return emp;
			}
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		//Logic to retrieve all employees from DB 
		return listOfEmp;
	}

	public void deleteEmployeeById(Integer empId) {
		
		//Logic to delete employee from DB 
	}

	public void updateEmployee(Employee employee) {
		//Logic to update employee in DB 

	}

	public List<Employee> getEmployeeDetailsByCity(String city) {
		List<Employee> empListByCity = new ArrayList<Employee>();
		for(Employee emp:listOfEmp) {
			if((emp.getAddress().getCity()).equals(city)) {
				empListByCity.add(emp);
				//return empListByCity;
			}
		}
		return empListByCity;
	}

}
