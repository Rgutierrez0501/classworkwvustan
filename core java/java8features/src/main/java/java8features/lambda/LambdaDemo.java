package java8features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		Addition addition = new AdditionImpl();
		int result = addition.add(15, 10);
		System.out.println(result);
		
		System.out.println("***********************************");
		Addition addTwoNumber = (a,b)->(a+b);
		System.out.println(addTwoNumber.add(15, 10));
		
		System.out.println("***********************************");
		Subtraction sub = (x,y)->(x-y);
		System.out.println(sub.subtract(10, 8));
		
		System.out.println("***********************************");
		
		List<String> currencies = Arrays.asList("USD","JPY","EUR","HKD","INR","AUD");
		currencies.forEach(System.out::println);
		System.out.println("***********Sorted currencies using lambda********");
		//Collections.sort(currencies,(a,b)->a.compareTo(b));
		//currencies.forEach(System.out::println);
		Collections.sort(currencies,(String a,String b)->{return a.compareTo(b);});
		//Syntax of lambda expression is ---  (parameter list)->{}
		System.out.println("***********************************");
		for(String currency:currencies)
			System.out.println(currency);
		
		System.out.println("******************forEach*****************");
		currencies.forEach(System.out::println); //method reference
		
		currencies.forEach(c->System.out.println(c)); //lambda expression
		
		currencies.forEach((String currency)->System.out.printf("Currency is %s"+"-",currency));
		
		for (String currency:currencies) {
			System.out.println(currency);
		}
		
		for(int index=0;index<currencies.size();index++) {
			System.out.println(currencies.get(index));
		}
		
		System.out.println("******************forEach different actions*****************");
		currencies.forEach(c->{System.out.println(c.concat("Hello"));});
	}
	

}
