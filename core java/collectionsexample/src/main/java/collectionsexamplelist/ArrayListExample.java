package collectionsexamplelist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//languages is an arraylist object or instance
		//Below an arraylist object is created by invoking ArrayList() constructor
		//languages is a reference to an arraylist object.
		//Below created ArrayList container is going to store String type of object
		ArrayList<String> languages = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println(languages);
		System.out.println(numbers);
		System.out.println(languages.isEmpty());
		System.out.println(numbers.isEmpty());
		//Adding elements in an arraylist by calling add method 
		languages.add("English");
		languages.add("Spanish");
		languages.add("French");
		System.out.println(languages);
		//Accessing elements or objects from arraylist using index position
		System.out.println(languages.get(0));
		System.out.println(languages.get(1));
		System.out.println(languages.get(2));
		
		if(languages.get(0).equals("English")) {
			System.out.println("I am learning English");
		}else if(languages.get(0).equals("Spanish")) {
			System.out.println("I am learning Spanish");
		}else {
			System.out.println("I am learning Java");
		}

		System.out.println("*******************Traversing arraylist using for loop***********************");
		for(int index=0;index<languages.size();index++) {
			System.out.println(languages.get(index));
		}
		
		System.out.println("*******************Traversing arraylist using for each loop***********************");
		for(String language:languages) {
			System.out.println(language);
		}
		
		int [] nums = new int[5]; //arrays declaration
		List<String> fruits = new ArrayList<String>();
		fruits.add("Litchi");
		fruits.add("BlueBerry");
		fruits.add("RaspBerry");
		fruits.add("StrawBerry");
		fruits.add("Mango");
		fruits.add("Apple");
		System.out.println("**************Fruits using for each loop***********************");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println(fruits);
		fruits.remove("Mango");
		System.out.println(fruits);
		fruits.remove(3);
		System.out.println(fruits);
		System.out.println(fruits.size());
		List<String> vegies = new ArrayList<String>();
		vegies.add("Tomato");
		vegies.add("Bell Pepper");
		fruits.addAll(vegies);
		System.out.println(fruits);
		
		System.out.println("**************Traversing through Iterator****************");
		
		Iterator itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(numbers);
		numbers.add(15);
		numbers.add(5);
		numbers.add(10);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		System.out.println(numbers);
		System.out.println(numbers.size());
		System.out.println("*********Use of continue*************");
		for(Integer number : numbers) {
			if(number != 5) {
				System.out.println(number);
				continue;
			}
		}
		System.out.println("***********Use of break***********");
		for(Integer number : numbers) {
			if(number == 5) {
				System.out.println(number);
				break;
				
			}
		}
		
		//numbers.add("1323432");
		/**
		List listObj = new ArrayList();
		listObj.add("abc");
		listObj.add(5);
		//listObj.add(new Integer(15));
		for(Object obj:listObj) {
			String str = (String) obj;
			System.out.println(str);
		}**/
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		//list.add(15);
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
