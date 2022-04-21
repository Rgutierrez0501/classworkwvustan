package collectionsexampletwo.ui;

import java.util.ArrayList;
import java.util.Collections;

import collectionsexampletwo.comparators.AmountComparator;
import collectionsexampletwo.comparators.OrderDescriptionComparator;
import collectionsexampletwo.model.Order;

public class OrderTester {

	public static void main(String[] args) {
		ArrayList<Order> listOfOrders = new ArrayList<Order>();
		listOfOrders.add(new Order(101,"IPhone 13",15533.50));
		listOfOrders.add(new Order(106,"Samsung Galaxy S4",12333.50));
		listOfOrders.add(new Order(102,"Nokia 3310",5533.00));
		listOfOrders.add(new Order(104,"Motorola Zx",11333.50));
		System.out.println(listOfOrders);
		System.out.println("*******************Sorting by amount************************");
		Collections.sort(listOfOrders, new AmountComparator());
		for(Order order : listOfOrders) {
			System.out.println(order);
		}
		
		System.out.println("*******************Sorting by order description************************");
		Collections.sort(listOfOrders, new OrderDescriptionComparator());
		for(Order order : listOfOrders) {
			System.out.println(order);
		}
	}

}
