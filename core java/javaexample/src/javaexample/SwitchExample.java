package javaexample;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// char choice = '/';
		System.out.println("Choose from below choice-----");
		System.out.println(" + for Addition ");
		System.out.println(" - for Subtraction ");
		System.out.println(" * for Multiplication ");
		System.out.println(" / for Division ");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();

		switch (choice) {
		case "+":
			System.out.println("Addition");
			break;

		case "-":
			System.out.println("Subtraction");
			break;
		case "/":
			System.out.println("Division");
			break;

		case "*":
			System.out.println("Multiplication");
			break;
		default:
			System.out.println("Enter correct choice");
			break;
		}

	}

}
