package javaexample;

public class ExampleOne {

	static int count =0;
	
	public static void main(String[] args) {
		
		char x ='P';
		count++;
		System.out.println("Value of x and count is ---"+x+"---"+count);
		
		displayInfo(x,count);
		
	}
	
	public static void displayInfo(char y,int counter) {
		count++;
		counter++;
		System.out.println(y+"---"+counter);
		//System.out.println(x+"---"+count);
		System.out.println("Value of count---"+count);
	}

}
