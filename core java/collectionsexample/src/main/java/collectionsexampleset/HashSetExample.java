package collectionsexampleset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(15);
		numbers.add(15);
		numbers.add(11);
		numbers.add(null);
		numbers.add(10);
		numbers.add(1);
		numbers.add(null);
		System.out.println(numbers);
		
		System.out.println("******************Traversal using For Each loop ****************");
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("******************Traversal using Iterator ****************");
		Iterator itr = numbers.iterator();
		while(itr.hasNext()) {
			//System.out.println("Before if condition value of itr.next() --"+itr.next());
			Object num = itr.next();
			if(num!=null) {
				//System.out.println("After if condition value of itr.next() --"+itr.next());
				System.out.println(num);
			}
		}
		System.out.println("********after removing**********");
		numbers.remove(null);
		System.out.println(numbers);
		
		numbers.forEach(System.out::println);//Introduced in Java 8 and concept is called method reference
		
		
		
	}

}
