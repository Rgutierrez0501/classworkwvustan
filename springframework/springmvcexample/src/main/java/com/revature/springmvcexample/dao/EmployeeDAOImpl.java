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

	@Override
	public List<Employee> getAllEmployees() {
		if(empList.size() ==0) {
		
		Employee emp = new Employee();
		emp.setEmpId(18);
		emp.setEmpName("Piyusha");

		Employee emp1 = new Employee();
		emp1.setEmpId(19);
		emp1.setEmpName("Supratim");

		Employee emp2 = new Employee();
		emp2.setEmpId(20);
		emp2.setEmpName("Joy Singh");

		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		
		}
		return empList;
	}

	@Override
	public Boolean addEmployee(Employee employee) {
			List<Employee> empList = new ArrayList<Employee>();
			if(employee.getEmpId() >1) {
				empList.add(employee);
			}else {
				return false;
			}
			return true;
		}


}
