package collectionsexamplelist;

import java.util.ArrayList;
import java.util.List;

import collectionsexamplelist.entity.Student;

public class StudentMainApp {

	public static void main(String[] args) {
		Student stu1 = new Student(1,"Samuel","Sholib");
		Student stu2 = new Student(2,"Fatima","Baloch");
		Student stu3 = new Student(3,"Kal","McClure");
		Student stu4 = new Student(4,"Mathew","Nevish");
		
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(stu1);
		listOfStudents.add(stu2);
		listOfStudents.add(stu3);
		listOfStudents.add(stu4);
		//listOfStudents.add("Rakesh");
		
		System.out.println(listOfStudents);
		for(Student student : listOfStudents) {
			System.out.println(student);
		}
		System.out.println(listOfStudents.size());
	}

}
