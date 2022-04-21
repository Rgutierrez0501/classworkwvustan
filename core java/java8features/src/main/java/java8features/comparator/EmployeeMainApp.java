package java8features.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(111, "Hitha"));
		empList.add(new Employee(132, "Sagar"));
		empList.add(new Employee(121, "Rakesh"));
		empList.add(new Employee(101, "Sneha"));
		empList.add(new Employee(131, "Shahnawaz"));
		
		// Unsorted
		//System.out.println(empList);
		
		empList.forEach(System.out::println);
		
		System.out.println("***************Sort By Emp Name*******************");
		Collections.sort(empList,new SortByEmployeeByEmpName());
		empList.forEach(System.out::println);
		System.out.println("********************Sort By Emp No**********************");
		
		Collections.sort(empList, new SortByEmployeeByEmpNo());
		empList.forEach(System.out::println);
		System.out.println("******************************************");
		//Collections.reverse(empList);
		//empList.forEach(System.out::println);
		
		System.out.println("****************reverseOrder method**************************");
		//Reverese the employee list on the basis of emp no
		Collections.sort(empList, Collections.reverseOrder(new SortByEmployeeByEmpNo())); 
		empList.forEach(System.out::println);
		
	}
}