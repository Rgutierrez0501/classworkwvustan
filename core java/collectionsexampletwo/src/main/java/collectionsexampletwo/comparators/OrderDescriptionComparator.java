package collectionsexampletwo.comparators;

import java.util.Comparator;

import collectionsexampletwo.model.Order;

public class OrderDescriptionComparator implements Comparator<Order> {
	@Override
	public int compare(Order o1, Order o2) {
	 return o1.getOrderDescription().compareTo(o2.getOrderDescription());
		
	}
}
