/**
 * 
 */
package javaexample;

/**
 * @author UD SYSTEMS
 *
 */
public class StudentMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//student object or instance is created by invoke or calling default constructor using new keyword
		Student student = new Student();
		System.out.println("Value of student before setting values using setter methods---"+student);
		//Now we are setting the values of fields of student object
		student.setStudentId(1);
		student.setStudentName("Desiree Steffen");
		
		//Creating an object student1 using the parameterizedd constructor
		Student student1 = new Student(2,"Samuel Sholib");
		
		System.out.println("Value of student instance or object is ----"+student);
		System.out.println("Value of student1 instance or object is ----"+student1);
		
	}

}
