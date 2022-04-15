package classesdemo.ui;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Integer num1 = null;
		Integer num2 = null;
		Integer choice = 6;
		boolean running = true;
		while (running) {
			System.out.println("Choose number to perform operations:\n");
			System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulus Division \n6. Exit");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			if (choice != 6) {
				System.out.println("Enter two numbers:---\n");
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
			}
			Calculator calculator = new Calculator(num1, num2);
			switch (choice) {
			case 1:
				Integer addResult = calculator.addition(num1, num2);
				System.out.println("Addition of two numbers " + num1 + " and " + num2 + " is " + addResult);
				break;
			case 2:
				Integer subResult = calculator.subtraction(num1, num2);
				System.out.println("Subtraction of two numbers " + num1 + " and " + num2 + " is " + subResult);

				break;
			case 3:
				Integer mulResult = calculator.multiplication(num1, num2);
				System.out.println("Multiplication of two numbers " + num1 + " and " + num2 + " is " + mulResult);
				break;
			case 4:
				Integer divResult = calculator.division(num1, num2);
				System.out.println("Division of two numbers " + num1 + " and " + num2 + " is " + divResult);
				break;
			case 5:
				Integer modDivResult = calculator.modulusDivision(num1, num2);
				System.out.println("Modulus Division of two numbers " + num1 + " and " + num2 + " is " + modDivResult);
				break;
			default:
				System.out.println("You no longer will be able to use calculator");
				running=false;
				break;

			}

		}
	}
}
