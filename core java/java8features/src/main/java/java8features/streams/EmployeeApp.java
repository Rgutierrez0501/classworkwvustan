package java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeApp {

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
		
		System.out.println("**********************allMatch**************************");
		boolean  allAssociates =  empList.stream().allMatch(o->o.getJobTitle().equals("Associate"));
        System.out.println(allAssociates);
        System.out.println("*********************anyMatch***************************");
        boolean  anyAssociate =  empList.stream().anyMatch(o->o.getJobTitle().equals("Associate"));
        System.out.println(anyAssociate);
        
        System.out.println("*********************noneMatch***************************");
        boolean  noneAssociate =  empList.stream().noneMatch(o->o.getJobTitle().equals("Executive"));
        System.out.println(noneAssociate);
        System.out.println("*******************filtered associates**********************************");
        empList.stream().filter(o->o.getJobTitle().equals("Associate")).forEach(System.out::println);
        System.out.println("*********************Find Any***************************");
        Optional<Employee> employees =  empList.stream().filter(o->o.getJobTitle().equals("Associate")).findAny();
        System.out.println(employees);
        System.out.println("*********************************************");
        empList.stream().filter(o->o.getJobTitle().equals("Executive")).findAny().ifPresent(System.out::println);
        
        System.out.println("*********************************************");
        empList.stream().filter(o->o.getJobTitle().equals("Manager")).findAny().ifPresent(System.out::println);
        System.out.println("*********************************************");
        empList.stream().filter(o->o.getJobTitle().equals("Associate")).findFirst().ifPresent(System.out::println);
        
        System.out.println("*********************map()***********************");
        
        empList.stream().filter(o->o.getJobTitle().equals("Associate")).map(Employee::getSalary).forEach(System.out::println);
	
        System.out.println("*********************map() output stream is converted to list by calling toList()***********************");
        //map function returns stream and this stream is converted to list object
        List<Double> associateSalaries = empList.stream().filter(o->o.getJobTitle().equals("Associate")).map(Employee::getSalary).toList();
        associateSalaries.forEach(System.out::println);
        System.out.println("*************************************************************");
        /**
         * reduce() operation is one example
			Takes two arguments
				Initial value
				Binary function to be called
						First parameter is current partial result
						Second parameter is next data item
						
						a= 80000
						b= 100000
						a=a+b= 180000
						---now a is 180000 and b is 110000
						a+b = 180000+110000 = 290000
         */
        
        double totalSalaryOfAssociates = empList.stream().filter(o->o.getJobTitle().equals("Associate")).map(Employee::getSalary).reduce(0.0,(a,b)->a+b);
        System.out.println(totalSalaryOfAssociates);
        
        long countOfAssociates = empList.stream().filter(o->o.getJobTitle().equals("Associate")).count();
        Optional<Employee> empWithMaxSalary = empList.stream().filter(o->o.getJobTitle().equals("Associate")).max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> empWithMinSalary = empList.stream().filter(o->o.getJobTitle().equals("Associate")).min(Comparator.comparing(Employee::getSalary));
        System.out.println(countOfAssociates);
        
        empWithMaxSalary.ifPresent(System.out::println);
        empWithMinSalary.ifPresent(System.out::println);
	
        
        System.out.println("********************GroupingBy example*************");
        Map<String, List<Employee>> filteredEmployees = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
        
        System.out.println(filteredEmployees);
	
	}
}
