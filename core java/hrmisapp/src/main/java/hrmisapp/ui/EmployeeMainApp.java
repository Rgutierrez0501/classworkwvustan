package hrmisapp.ui;

import java.util.List;

import hrmisapp.data.Employee;
import hrmisapp.service.EmployeeService;
import hrmisapp.service.EmployeeServiceImpl;

public class EmployeeMainApp {

	public static void main(String[] args) {
		EmployeeService empService= new EmployeeServiceImpl();
		List<Employee> associates= empService.getEmployeeWithJobTitle("Associate");
		associates.forEach(System.out::println);
		System.out.println("*************************************************");
		empService.getAllEmployeesSortBySalary().forEach(System.out::println);
	}

}
