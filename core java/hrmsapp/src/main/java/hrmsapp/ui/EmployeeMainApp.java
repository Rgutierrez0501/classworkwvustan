package hrmsapp.ui;

import java.util.List;

import hrmsapp.model.Address;
import hrmsapp.model.Department;
import hrmsapp.model.Employee;
import hrmsapp.model.Location;
import hrmsapp.service.EmployeeService;
import hrmsapp.service.EmployeeServiceImpl;

public class EmployeeMainApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpFirstName("Yuri");
		emp.setEmpLastName("Gargin");
		emp.setType("Contract");
		Department dept = new Department(1,"Marketing");
		emp.setDepartment(dept);
		Address address = new Address(1,"10 Downing Street","London","England","UK");
		emp.setOfficeLocation(new Location(1, address));
		emp.setAddress(address);
		System.out.println(emp);
		
		
		Employee employee = new Employee();
		employee.setEmpId(2);
		employee.setEmpFirstName("Roasa");
		employee.setEmpLastName("G");
		employee.setType("Contract");
		employee.setDepartment(dept);
		employee.setOfficeLocation(new Location(1, address));
		employee.setAddress(address);
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.addEmployee(emp);
		employeeService.addEmployee(employee);
		List<Employee> listOfEmp = employeeService.getAllEmployees();
		System.out.println(listOfEmp);
		Employee e =employeeService.getEmployeeById(2);
		System.out.println(e);
		
		System.out.println(employeeService.getEmployeeDetailsByCity("New York"));
		System.out.println(employeeService.getEmployeeDetailsByCity("London"));
	}

}
