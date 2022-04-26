package exceptionhandlingexample.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemoTryWithResources {

	public static void main(String[] args) {
		String myName = getMyName();
		System.out.println("My Name : "+myName);

	}
	//private static String getMyName() throws IOException{
	private static String getMyName() {
		String name = "";
		System.out.println("Enter your name: ");

		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				
				){
			
			 name= bufferedReader.readLine();
			
		} catch (IOException e) {
				e.printStackTrace();
		}				
		return name;
	}

}
