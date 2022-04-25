package java8features.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(111232L, "iPhone 13 Pro Max", "Mobile Phones", 2600.50));
		products.add(new Product(111233L, "iPhone 13 Pro", "Mobile Phones", 2100.50));
		products.add(new Product(111234L, "Air Conditoner", "Home Appliances", 1600.50));
		products.add(new Product(111235L, "Fan", "Home Appliances", 600.50));
		products.add(new Product(111236L, "Digitial Photo Frame", "Electronic", 100.50));
		products.add(new Product(111237L, "Air Purifies", "Home Appliances", 1400.50));
		Customer customer = new Customer(1111111L, "Donald Lopez", 1);
		Order orderOne = new Order(1111L, "Dispatched", LocalDate.now(), (LocalDate.now()).plusDays(5), products,
				customer);
		Order orderTwo = new Order(1110L, "Recieved", LocalDate.now().minusDays(2), (LocalDate.now()).plusDays(5),
				products, customer);
		Order orderThree = new Order(1112L, "Delivered", LocalDate.now().minusDays(2), (LocalDate.now()), products,
				customer);
		Order orderFour = new Order(1114L, "Delivered", LocalDate.now().minusDays(2), (LocalDate.now()).plusDays(3),
				products, customer);

		Order orderFive = new Order(1113L, "Open", LocalDate.now().minusDays(2), (LocalDate.now()).plusDays(4),
				products, customer);

		Order orderSix = new Order(1109L, "Dispatched", LocalDate.now().minusDays(2), (LocalDate.now()).plusDays(2),
				products, customer);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		System.out.println("**********Before sorting*******************");
		orderList.forEach(System.out::println);

		System.out.println("**********After sorting*******************");
		Collections.sort(orderList, new OrderStatusComprator());
		orderList.forEach(System.out::println);

		System.out.println("**********After sorting using method reference of getDeliveryDate*******************");
		Collections.sort(orderList, Comparator.comparing(Order::getDeliveryDate));
		orderList.forEach(System.out::println);

		System.out.println("**********After sorting using method reference of getOrderDate*******************");
		Collections.sort(orderList, Comparator.comparing(Order::getOrderDate));
		orderList.forEach(System.out::println);

		// Static method reference example
		DisplayInformation displ = Order::displayOrderDate;
		displ.display();

		// Reference to instance method
		DisplayInformation displayInfo = orderOne::displayStatus;
		displayInfo.display();

		// Reference to constructor
		OrderStatus orderStatus = Order::new;
		System.out.println(orderStatus.getOrderStatus("Dispatached"));
	}

}
