package javadatetimeexample;

import java.util.Date;

public class EmployeeMain {


	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Rosa Gutierrez");
		Date date = new Date(999999999999l);
		emp.setDateOfBirth(date);
		
		Employee emp1 = new Employee(2,"Samuel Sholib",new Date(99999999999l));
		System.out.println(emp);
		System.out.println(emp1);
		
		/**
		 * Logic to persist or save objects emp and emp1 in DB
		 */

	}

}
