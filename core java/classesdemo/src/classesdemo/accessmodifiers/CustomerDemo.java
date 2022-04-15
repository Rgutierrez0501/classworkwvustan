package classesdemo.accessmodifiers;

import java.math.BigDecimal;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.getId();
		customer.getName();
		customer.setId(1);
		customer.setName("D K");
		
		Object object1 ="Hello";
		
		String string1 = (String) object1;
		System.out.println(string1);
		
		/**
		 * We can cast an Object reference to String reference only 
		 * if the object pointed to is actually a String
		 */
		Object object2 = 100; //object2 reference is of type Object
		//String string2 = (String)object2;
		//System.out.println(string2);
		Integer intObject = (Integer)object2;
		System.out.println(intObject);
		//In Java References are strongly typed
		
		Object object3 = 155334.53;
		Double bigDecimalObject = (Double) object3;
		System.out.println(bigDecimalObject);
	}

}
