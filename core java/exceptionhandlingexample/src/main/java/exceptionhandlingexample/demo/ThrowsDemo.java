package exceptionhandlingexample.demo;

public class ThrowsDemo {
	
	public void displayInfo() throws Exception{
		
		System.out.println("I am throwing an exception");
		throw new Exception();
	}
	
	public void division() throws ArithmeticException,NumberFormatException{
		int x=0;
		int y=50/x;
		System.out.println("I am in division");
	}

}
