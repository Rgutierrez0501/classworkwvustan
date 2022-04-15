package classesdemo.ui;

public class MainDemo {

	//main method
	public static void main(String[] args) {
		
		/**
		 * Create an array of integers-- an array of integer data 
		 */
		int[] numbers = new int[10] ;
		int lengthOfArrayOfNumber =numbers.length;
		System.out.println(lengthOfArrayOfNumber);
		/*
		 * Non primitive data types: Arrays,String
		 * Primitive Data types in Java -
		 * int,byte,long,short,float,boolean,double,char
		 * 
		 * Wrapper Classes
		 * int -- Integer
		 * long -- Long
		 * byte -- Byte
		 * short -- Short
		 * float -- Float
		 * boolean -- Boolean
		 * double -- Double
		 * char -- Character
		 */
		Integer number = 1;
		Long num = 33343234L;
		Float n = 13223.232f;
		Short s = 1;
		Boolean isValid = false;
		int i =5;
		System.out.println(number instanceof Integer);
		//System.out.println(i instanceof Integer);
		String str = "124234";
		System.out.println(str+110);
		System.out.println(str instanceof String);
		Integer strToInt = Integer.parseInt(str);
		int sum =strToInt+110;
		System.out.println(sum);
		System.out.println(Integer.valueOf(str));
		
		int x =15;
		Integer y = 10;
		int result = x+y;
		System.out.println(result);
		
		Integer res=x+y;
		System.out.println(res);
		
		long m =9999999106l;
		Long k = 122312123323L;
		System.out.println(Long.valueOf(str));
		System.out.println(Long.valueOf(y));
		System.out.println(Long.valueOf(m));
		System.out.println(Long.valueOf(x));

		long z = k;
		System.out.println(z);
		long p = x;
		System.out.println(p);
		
		
	}
	
	//display method
	public void display() {
		System.out.println("Hello");
	}

}
