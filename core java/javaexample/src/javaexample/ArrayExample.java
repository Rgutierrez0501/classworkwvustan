package javaexample;

public class ArrayExample {

	public static void main(String[] args) {
	
		int [] list; // Declaring an array variable list of integer type
		list= new int[10];// Allocating memory for holding data values
		list[0]=5;
		list[1]=4;
		list[2]=6;
		//list[3]="hiu";
		
		float numbers[];
		numbers = new float[5];
		numbers[0]=1.1f;
		numbers[1]=1.2f;
		numbers[2]=1.3f;
		numbers[3]=1.4f;
		numbers[4]=1.5f;
		
		String words[] = new String[6];
		
		words[0] ="Hello";
		words[1] ="Hi";
		words[2] ="Good";
		words[3] ="bad";
		words[4] ="bye";
		words[5] ="Java";
		
		
		Student[] arraysOfStudent = new Student[3];
		arraysOfStudent[0]= new Student(1,"Donald Lopez");
		arraysOfStudent[1]= new Student(2,"Fatima Baloch");
		arraysOfStudent[2]= new Student(3,"Rosa");
		// java.lang.ArrayIndexOutOfBoundsException
		//arraysOfStudent[3]= new Student(4,"Megan Orth");
		
		
		//Length of an array
		System.out.println(list.length);
		System.out.println(numbers.length);
		System.out.println(words.length);
		System.out.println(arraysOfStudent.length);
		//Accessing an element from array of String which is referred by variable words
		System.out.println(words[2]);
		
		//Traversing an array
		for(int index=0;index<arraysOfStudent.length;index++) {
			System.out.println(arraysOfStudent[index]);
		}
		
		for(int index=0;index<list.length;index++) {
			System.out.println(list[index]);
		}
		
		//for each loop --- using this loop we can iterate through collection of objects
		//for each student in arrays of student
		for(Student stud:arraysOfStudent) {
			System.out.println(stud.getStudentName());
		}
		
		for(String word:words) {
			System.out.println(word);
		}
	}

}
