package javaarryasexample.arraysexample;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		//primitive type array of int 
		int[] number = new int[10];
		number[0]=5;
		number[1]=6;
		number[2]=7;
		number[3]=8;
		number[4]=9;
		number[5]=10;
		number[6]=11;
		number[7]=12;
		number[8]=4;
		number[9]=6;
		
		
		Arrays.sort(number);
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		System.out.println("*************************************");
		//Wrapper class of primitive data type int is Integer
		Integer [] numbers = new Integer[5];
		numbers[0]=11;
		numbers[1]=9;
		numbers[2]=8;
		numbers[3]=10;
		numbers[4]=7;
		//Arrays.asList() method accepts an array of type T where T is a class of an objects
		List<Integer> listOfNumbers= Arrays.asList(numbers);
		System.out.println(listOfNumbers);
		
		for(Integer n:listOfNumbers) {
			//System.out.println(n instanceof Object);
			System.out.println(n);
		}
		System.out.println("**********************************");
		String[] arrayOfString = new String[5];
		
		arrayOfString[0]="Java";
		arrayOfString[1]="C++";
		arrayOfString[2]="C";
		arrayOfString[3]="Python";
		arrayOfString[4]="Cobol";
		//String type object is stored in a list referred by a variable listOfStrings
		List<String> listOfStrings = Arrays.asList(arrayOfString);
		for(String str:listOfStrings) {
			System.out.println(str);
		}
		System.out.println("*************After sorting*****************");
		Arrays.sort(arrayOfString);
		for(String str:listOfStrings) {
			System.out.println(str);
		}
	}
}
