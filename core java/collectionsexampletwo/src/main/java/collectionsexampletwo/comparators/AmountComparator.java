package collectionsexampletwo.comparators;

import java.util.Comparator;

import collectionsexampletwo.model.Order;

public class AmountComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		/**
		if(o1.getAmount() == o2.getAmount()) {
			return 0;
		}else if (o1.getAmount() > o2.getAmount()) {
			return 1;
		}else {
			return -1;
		}**/
		if(o1.getAmount() == o2.getAmount()) {
			return 0;
			
		}else {
			return o1.getAmount() > o2.getAmount() ? 1:-1;
		}
		
	}

}
