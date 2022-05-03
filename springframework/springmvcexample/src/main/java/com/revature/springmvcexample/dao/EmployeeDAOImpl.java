package com.revature.springmvcexample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.revature.springmvcexample.model.Employee;
@Component
public class EmployeeDAOImpl implements EmployeeDAO {
	private static List<Employee> empList = new ArrayList<Employee>();
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Write the logic to get all employees from DB
		
		Employee emp = new Employee();
		emp.setEmpId(15);
		emp.setEmpName("Jyotika");

		Employee emp1 = new Employee();
		emp1.setEmpId(16);
		emp1.setEmpName("Krutika");

		Employee emp2 = new Employee();
		emp2.setEmpId(17);
		emp2.setEmpName("Shreyashi");

		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);

		return empList;
	}

}
