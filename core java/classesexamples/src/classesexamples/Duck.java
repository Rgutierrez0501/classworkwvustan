package classesexamples;

public class Duck {
	//Data members
	private int size; //instance variable or fields or properties
	private static int duckCount;//class variable
	private static String duckName;
	
	//Default constructor method
	public Duck() {
		duckCount++;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//Static method or class method which returns static variable or fields duckCount
	public static int getDuckCount() {
		return duckCount;
	}

	
	
	public static void main(String[] args) {
		//System.out.println(size);
		Duck duckObject = new Duck(); //invoking default constructor to create an object or an instance 
		//using instance or object duck we are trying to access value of size  which is an instance variable or fields
		System.out.println(duckObject.getSize()); 
		Duck.getDuckCount();//Using class name Duck we are accessing static method getDuckCount()
		System.out.println(Duck.duckCount);//Using class name Duck we are accessing static variable duckCount
		duckObject.getDuckCount();//We should avoid using instance to access static method
		
		Duck duckInstance = new Duck();
		Duck duck = new Duck();
		Duck abcd = new Duck();
		Duck rosa = new Duck();
		Duck graham = new Duck();
		// duckObject, duckInstance and duck these three are reference variable 
		//referring to object of Duck class
	}
	
}
