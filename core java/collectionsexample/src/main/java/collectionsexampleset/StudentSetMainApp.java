package collectionsexampleset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import collectionsexamplelist.entity.Student;

public class StudentSetMainApp {

	public static void main(String[] args) {
		Student student1 = new Student(10110,"Hunter","Risse");
		Student student2 = new Student(10111,"Shabana","Meher");
		Student student3 = new Student(11111,"Uyenvy","Nguyen");
		Student student4 = new Student(10111,"Shabana","Meher");
		
		Set<Student> studentSet= new HashSet<>();
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		boolean flag = studentSet.add(student4);
		studentSet.add(student4);
		System.out.println(studentSet.size());
		System.out.println(flag);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student4.hashCode());
		System.out.println(studentSet);
		
		Iterator itr = studentSet.iterator();
		while(itr.hasNext()) {
			Student student = (Student) itr.next();
			System.out.println(student.getLastName());
		}
		
		studentSet.remove(student1);
		System.out.println("Usage of student: ---"+studentSet);
		studentSet.clear(); // It removes all elements from Set
		System.out.println(studentSet);
		
		Student student5 = new Student(10112,"Fatima","Baloch");
		Student student6 = new Student(11114,"Duan","Kim");
		Student student7 = new Student(10113,"Madison","S");
	
		Set<Student> studentTreeSet = new TreeSet<Student>();
		System.out.println("Is Empty:---"+ studentTreeSet.isEmpty()+"----studentTreeSet.size----"+studentTreeSet.size());
		studentTreeSet.add(student1);
		studentTreeSet.add(student2);
		studentTreeSet.add(student3);
		studentTreeSet.add(student4);
		studentTreeSet.add(student5);
		studentTreeSet.add(student6);
		studentTreeSet.add(student7);
		System.out.println("Is Empty:---"+ studentTreeSet.isEmpty()+"----studentTreeSet.size----"+studentTreeSet.size());
		System.out.println(studentTreeSet);
	}

}
