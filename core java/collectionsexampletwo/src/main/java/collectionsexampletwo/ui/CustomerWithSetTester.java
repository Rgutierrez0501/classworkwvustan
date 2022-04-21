package collectionsexampletwo.ui;

import java.util.HashSet;

import collectionsexampletwo.model.Customer;

public class CustomerWithSetTester {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Bob");
		Customer customer2 = new Customer(1,"Bob");
		Customer customer3 = new Customer(1,"Bob");
		System.out.println(customer1.hashCode());
		System.out.println(customer2.hashCode());
		System.out.println(customer3.hashCode());
		
		HashSet<Customer> customers = new HashSet<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		
		System.out.println(customers.size());
		System.out.println(customers.contains(customer3));
		
		/**
		 * We have already override equals() and verify that customer1 and customer 2
		 * are equal, and we all know that HashSet stores unique objects, so why did
		 * it consider them as different objects? --- above size is 2
		 * 
		 * Hashset stores its elements in memory buckets.
		 * Each bucket is linked to a particular hashcode.
		 * in line 15 customers.add(customer1) , Java stores customer1 inside a bucket
		 * and links to the value of customer1.hashCode().
		 * 
		 * When we add customer2 it has a separate hashCode , it will be stored in a separate
		 * memory bucket and will be considered a totally different object.
		 * 
		 * Now when HashSet searches (line 19) for an element inside it, it first generate 
		 * the element's hashCode and looks for a bucket which corresponds to this hashCode.
		 * 
		 * Here comes the importance of overriding the hashCode() , so let's override
		 * 
		 * 
		 */
		

	}

}
