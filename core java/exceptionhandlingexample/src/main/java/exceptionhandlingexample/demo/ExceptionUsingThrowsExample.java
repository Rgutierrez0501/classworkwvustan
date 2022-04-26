package exceptionhandlingexample.demo;

public class ExceptionUsingThrowsExample {

	public static void main(String[] args) {
		ThrowsDemo throwsDemo = new ThrowsDemo();
		try {
			throwsDemo.displayInfo();
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("I caught an exception thrown from displayInfo method");
		}
		
		try {
			throwsDemo.division();

		}catch(ArithmeticException aex) {
			System.out.println("Division by zero exception");
		}catch(NumberFormatException nfex) {
			System.out.println("Number Format is not correct");
		}
		
	}

}
