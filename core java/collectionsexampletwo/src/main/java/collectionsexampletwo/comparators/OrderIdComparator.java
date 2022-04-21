package collectionsexampletwo.comparators;

import java.util.Comparator;

import collectionsexampletwo.model.Order;

public class OrderIdComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		if(o1.getOrderId() == o2.getOrderId()) {
			return 0;
		}else if (o1.getOrderId() > o2.getOrderId()) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
