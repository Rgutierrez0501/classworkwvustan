package exceptionhandlingexample.demo;

public class ExceptionDemoWithJDK7Features {

	public static void main(String[] args) {
		try {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double result = divide(x,y);
		System.out.println("Result value : "+result);
		
		String s1 = null;
		System.out.println(s1.length());
		}catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
				e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception Trapped in Exception Type");
			e.printStackTrace();
		}
		
		System.out.println("End of main() method");
	}

	private static double divide(int x, int y) {
		double z ;
		try {
		z=x/y;
		}catch(ArithmeticException aex) {
			
		}
		return 0;
	}

}
