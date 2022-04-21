package collectionsexampletwo.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import collectionsexampletwo.model.Student;

public class StudentTester {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(new Student(101,"Donal",35));
		listOfStudent.add(new Student(106,"Mellownyee",30));
		listOfStudent.add(new Student(105,"Mickey",18));
		for(Student student : listOfStudent) {
			System.out.println(student);
		}
		System.out.println("*********After sorting *********************");
		Collections.sort(listOfStudent);
		for(Student student : listOfStudent) {
			System.out.println(student);
		}
		
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student(101,"Donal",35));
		studentSet.add(new Student(106,"Mellownyee",30));
		studentSet.add(new Student(105,"Mickey",18));
		System.out.println("*********Before sorting  studentSet*********************");
		studentSet.forEach(System.out::println);
		
		//Collections.sort(studentSet);
		Set<Student> studentTreeSet = new TreeSet<Student>();
		studentTreeSet.add(new Student(101,"Donal",35));
		studentTreeSet.add(new Student(106,"Mellownyee",30));
		studentTreeSet.add(new Student(105,"Mickey",18));
		System.out.println("*********Tree Set data is sorted *********************");
		
		for(Student student : studentTreeSet) {
			System.out.println(student);
		}
		
		
		Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
		
		studentMap.put(1, new Student(101,"Donal",35));
		studentMap.put(2, new Student(106,"Mellownyee",30));
		studentMap.put(3, new Student(105,"Mickey",18));
		studentMap.put(4, null);
		studentMap.put(null, null);
		
		System.out.println(studentMap);
		System.out.println(studentMap.get(3));
		
		
	}

}
