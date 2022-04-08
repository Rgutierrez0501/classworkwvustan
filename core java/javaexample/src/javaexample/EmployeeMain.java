package javaexample;

public class EmployeeMain {

	

	public static void main(String[] args) {
		//count is a variable of type int, Here int is a primitive data type
		int count =0;//variable declaration and initialization is occurring
		float amount = 0.0f;
		double amt = 0.0;
		char c ='A';
		boolean isTodayFriday =true;
		displayInfo(c,isTodayFriday);
		
		Employee emp = new Employee();
		System.out.println(Employee.valueOfPI);
		System.out.println(emp.valueOfPI);

	}
	
	public void printValueOfPI() {
		Employee emp = new Employee();
		System.out.println(Employee.valueOfPI);
		System.out.println(emp.valueOfPI);
	}
	
	public static void displayInfo(char x,boolean flag) {
		System.out.println(x+"----"+flag);
		//System.out.println(c);
	}

}

