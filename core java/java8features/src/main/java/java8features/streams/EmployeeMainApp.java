package java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeMainApp {

	public static void main(String[] args) {
		Employee empOne = new Employee(1, "Mani", 28, 150000, "Manager", "IT");
		Employee empTwo = new Employee(2, "Binay", 29, 160000, "Senior Associate", "IT");
		Employee empThree = new Employee(4, "Rahul", 32, 170000, "Senior Manager", "Marketing");
		Employee empFour = new Employee(3, "Abhishek", 24, 80000, "Associate", "Finance");
		Employee empFive = new Employee(5, "Rajesh", 38, 250000, "Director", "IT");
		Employee empSix = new Employee(6, "Venkat", 29, 100000, "Associate", "Admin");
		Employee empSeven = new Employee(4, "Ram", 32, 140000, "Senior Manager", "Marketing");
		Employee empEight = new Employee(3, "Robert", 24, 110000, "Associate", "Finance");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);
		empList.add(empFour);
		empList.add(empFive);
		empList.add(empSix);
		empList.add(empSeven);
		empList.add(empEight);
		
		System.out.println(empList.stream());
		
		empList.stream().filter(e->(e.getAge()>30)).forEach(System.out::println);
		System.out.println("********************************************");
		empList.stream().filter(e->(e.getAge()>20)).limit(4).forEach(System.out::println);
		System.out.println("********************************************");
		empList.stream().filter(e->(e.getAge()>20)).skip(4).forEach(System.out::println);
		
		System.out.println("****************Sorting streams*****************");
		empList.stream().filter(e->(e.getAge()>25)).sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("************************************************");
		empList.stream().filter(e->e.getJobTitle().equals("Senior Manager")).forEach(System.out::println);
		
		System.out.println("************************************************");
		boolean  allAssociates =  empList.stream().allMatch(o->o.getJobTitle().equals("Associate"));
        System.out.println(allAssociates);
	
	}

}
