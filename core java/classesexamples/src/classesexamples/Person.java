package classesexamples;
//public , private,protected and default these access modifiers
public class Person {
	//Data members
	private String name; //instance variable or fields
	private double height;

	public static Integer age=18; //class variables or static fields


	//Default constructor method
	public Person() {
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor method
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}


	/**
	 * instance methods
	 * 
	 */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	//Class or static methods
	public static void display() {
		System.out.println("Age is a static field ----"+age);
	}

}
