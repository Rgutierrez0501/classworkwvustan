package exceptionhandlingexample.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {


	public static void main(String[] args) {
		String myName = getMyName();
		System.out.println("My Name : "+myName);

	}

	private static String getMyName() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name = null;
		try {
			name = bufferedReader.readLine();
			
		}catch (IOException e) {
			System.out.println("Error while reading :\n "+ e.getMessage());
		}catch (Exception e) {
			System.out.println("Unable to read");
		}
		return name;
		
	}
	 
	/**
	public static void main(String[] args) throws IOException {
		String myName = getMyName();
		System.out.println("My Name : "+myName);
		
	}
	
	private static String getMyName() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String name = bufferedReader.readLine();
		return name;
	}**/

}
