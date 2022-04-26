package exceptionhandlingexample.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CredentialTester {

	public static void main(String[] args) {

		try {
			getCredentials();
		} catch (CredentialException e) {

			e.printStackTrace();
		}
		System.out.println("Welcome to the App");

	}

	private static void getCredentials() throws CredentialException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter userid : ");
			String userid = br.readLine();
			if (!userid.equals("admin")) {
				throw new CredentialException(userid);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
