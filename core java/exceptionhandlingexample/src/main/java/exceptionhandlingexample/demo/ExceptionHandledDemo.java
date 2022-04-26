package exceptionhandlingexample.demo;

public class ExceptionHandledDemo {

	public static void main(String[] args) {
			int x , a;
			
			try {
				
				x=0;
				a=22/x;
				System.out.println("This will be bypassed");
			}catch(ArithmeticException aex) {
				System.out.println("Division by zero");
			}finally {
				System.out.println("Inside finally");
			}
			
			System.out.println("After catch statement");
			
			try {
				System.out.println(args[0]);
				System.out.println(args[1]);
			}
			catch(ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("No elements at index position");
			}

	}

}
