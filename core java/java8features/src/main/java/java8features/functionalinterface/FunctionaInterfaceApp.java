package java8features.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionaInterfaceApp {
	public static void main(String[] args) {
		
		Order orderOne = new Order("AUD", 15000);
		Order orderTwo = new Order("INR", 5000);
		Order orderThree = new Order("USD", 150000);
		Order orderFour = new Order("EUR", 25000);
		Order orderFive = new Order("AUD", 8000);
		Order orderSix = new Order("EUR", 5000);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		
		evaluate(orderList,o->System.out.println(o.getAmount()));
		List<Double> orderAmount = new ArrayList<Double>();
		evaluate(orderList,o->orderAmount.add(o.getAmount()));

		System.out.println("List of orderAmount ----"+orderAmount);
		
		evaluate(orderList,o->System.out.println(o.getCurrency()));
		System.out.println("**************************Predicate Example*******************");
		List<Order> filterOrder = evaluatePredicate(orderList,o->o.getAmount()>10000);
		
		System.out.println("********************Filtered Order with order amount greater than 10k***************");
		filterOrder.forEach(System.out::println);
		
		System.out.println("********************Filtered Order with order amount less than 10k***************");
		List<Order> filterOrders = evaluatePredicate(orderList,o->o.getAmount()<10000);
		filterOrders.forEach(System.out::println);
		
		
		System.out.println("**************************Example of Function Interface*******************");
		Function<List<Order>,Double> averageOrder =orderLists->{
			double total = 0.0;
			for(Order order: orderLists) {
				total+=order.getAmount();
			}
			return total/orderList.size();
		};
		System.out.println(averageOrder.apply(orderList));
		
		
		System.out.println("******************Example of andThen and compose*****************************");
		
		Function<Integer,Integer> addOne=x->x+1;
		Function<Integer,Integer> multiplyByTwo = x->x*2;
		 //after (In this case first addition and then multiplication)
		Function<Integer,Integer> andThenExample = addOne.andThen(multiplyByTwo); 
		System.out.println(andThenExample.apply(10));
		
		//before (In this case first it perform multiplication and then addition)
		Function<Integer,Integer> composeExample = addOne.compose(multiplyByTwo); 
		
		System.out.println(composeExample.apply(10));
		
		System.out.println("**********************************");
		//Collection of data and usage of andThen()
		List<Integer> salaries = Arrays.asList(15000,10000,5000,21000,20000,16000);
		for(Integer salary:salaries) {
			System.out.println(andThenExample.apply(salary));
		}
		
		System.out.println(orderList);
		System.out.println("********************Reverse sorting of order on the basis of amount*************************");
		Collections.sort(orderList,	Comparator.comparing(Order::getAmount).reversed());
		//Chaining Comparator methods
		//Collections.sort(orderList,Comparator.comparing(Order::getAmount).thenComparing(Order::getCurrency));
		orderList.forEach(System.out::println);
		
		betterWayToEvaluatePredicate(orderList,o->o.getAmount()>20000);
	}
	
	static void evaluate(List<Order> orderList,Consumer<Order> consumer) {
		//orderList.forEach(consumer);
		System.out.println("*************************************");
		for(Order order:orderList) {
			consumer.accept(order);
		}
	}
	
	static List evaluatePredicate(List<Order> orders,Predicate<Order> predicate) {
		List<Order> filteredOrder = new ArrayList<Order>();
		for(Order order:orders) {
			if(predicate.test(order)) {
				filteredOrder.add(order);
			}
		}
		return filteredOrder;
	}
	
	static void betterWayToEvaluatePredicate(List<Order> orders,Predicate<Order> predicate) {
		orders.stream().filter(predicate).forEach(System.out::println);

	}
}