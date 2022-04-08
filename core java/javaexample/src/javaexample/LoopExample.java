package javaexample;

public class LoopExample {

	public static void main(String[] args) {
		int count =0;
		while(count<10) {
			System.out.println("Hi and value of count--"+count);
			count++;
		}
		System.out.println("**************************************************");
		int index =0;
		do {
			System.out.println("Inside do while loop value of index is ---"+index);
			index++;
		}while(index<5);
		
		for(int i=0;i<10;i++) {
			System.out.println("Value of i is ---"+i);
		}
		
	}

}
