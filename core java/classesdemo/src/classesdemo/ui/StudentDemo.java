package classesdemo.ui;

import classesdemo.model.Student;
import classesdemo.accessmodifiers.Customer;
public class StudentDemo {
	public static void main(String[] args) {
		/**
		 * We can create an object of Student class by invoking Student class 
		 * constructor using new keyword
		 */
		/**studentObject is a reference variable referring to an 
		object or an instance of Student class
		*/
		Student studentObject = new Student(); //we created object 
		System.out.println(studentObject);
		//Here we are creating an object and initializing its properties with values.
		Student stuObject = new Student(1,"Donald");
		System.out.println(stuObject);
		stuObject.setStudentId(2);
		stuObject.setStudentName("Rosa");
		System.out.println(stuObject);
		System.out.println(Student.age);
		Student.display();
		Customer customer = new Customer();
		
	}

}
