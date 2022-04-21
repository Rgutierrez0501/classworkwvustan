package collectionsexampletwo.ui;

import collectionsexampletwo.model.Customer;

public class CustomerTester {

	public static void main(String[] args) {
		/**
		 * Although the two insatnces have exactly the same attribute values,
		 * they are stored in different memory locations.Hence, they are not considered equal as per 
		 * default implementation of equals(). The same applies for hashCode() - a random unique code is generated 
		 * for each instance
		 */
		Customer customer1 = new Customer(1,"Bob");
		Customer customer2 = new Customer(1,"Bob");
		System.out.println("customer1 hashcode value is ---"+customer1.hashCode());
		System.out.println("customer2 hashcode value is ---"+customer2.hashCode());
		System.out.println("Check equality of customer1 and customer2  ---"+customer1.equals(customer2));
		

	}

}
