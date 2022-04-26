package exceptionhandlingexample.demo;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			int number3 = Integer.parseInt(args[2]);
		}catch(NumberFormatException nfex) {
			System.out.println("Only numerical values required");
		}catch(ArrayIndexOutOfBoundsException aioobex) {
			System.out.println("Arguments passed lesser than the expected");
		}
	}

}
