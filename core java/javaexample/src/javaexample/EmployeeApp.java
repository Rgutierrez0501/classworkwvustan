package javaexample;

public class EmployeeApp {
	
	public static void main(String[] args) {
		//address object or address instace
		Address address = new Address();
		address.setAdderessId(1);
		address.setStreet("15");
		//Below emp instance or emp object is there and using these instances we are able to
		 //access setter method
		Employee emp= new Employee();
		emp.setAddress(address);
		emp.setEmpId(1);
		emp.setEmpName("Shabana Meher");
		
		System.out.println(emp);
		System.out.println(emp.getEmpId());
		
		EmployeeMain empMain = new EmployeeMain();
		empMain.printValueOfPI();
	}
	
	public void main() {
		System.out.println("Hi");
	}

}
