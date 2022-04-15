package javadatetimeexample;

import java.util.Scanner;

public class StringHandsOn {

	public static void main(String[] args) {
		// String str = "ABC1234";
		String[] str = new String[3];
		str[0]="ABCD22323";
		str[1]="1232312";
		str[2]="ABCDFDF";
		
		for(String s : str) {
			if (s.matches("[0-9]+")) {
				System.out.println("It contains digit only");
			} else if (s.matches("[a-zA-Z]+")) {
				System.out.println("It contains string only");
			} else {
				System.out.println("It contains string as well as digits");
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		// logic to check digits or string
		if (string.matches("[0-9]+")) {
			System.out.println("It contains digit only");
		} else if (string.matches("[a-zA-Z]+")) {
			System.out.println("It contains string only");
		} else {
			System.out.println("It contains string as well as digits");
		}
	}

}
