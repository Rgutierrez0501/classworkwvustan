package javaexample;

public class SumOfDigits {

	public static void main(String[] args) {
		double r1;
		double r2;
		System.out.println("Argument 1 ----"+args[0]);
		System.out.println("Argument 2 ----"+args[1]);
		r1=Double.parseDouble(args[0]);
		r2=Double.parseDouble(args[1]);
		System.out.println("Value of  r1 ----"+r1);
		System.out.println("Value of  r2 ----"+r2);
		System.out.println(r1+r2);
	}

}
