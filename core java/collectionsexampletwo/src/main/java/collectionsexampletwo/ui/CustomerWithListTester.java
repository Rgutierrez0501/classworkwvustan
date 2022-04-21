package collectionsexampletwo.ui;

import java.util.ArrayList;
import java.util.List;

import collectionsexampletwo.model.Customer;

public class CustomerWithListTester {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Bob");
		//Customer customer2 = new Customer(1,"Bob");
		List<Customer> listOfCustomer = new ArrayList<Customer> ();
		listOfCustomer.add(customer1);
		
		System.out.println(listOfCustomer.size());
		//System.out.println(listOfCustomer.contains(customer2));
		System.out.println(listOfCustomer.contains(new Customer(1,"Bob")));

	}

}
