package classesexamples;

public class PersonTester {
	private double pi_value;
	private String nameOfPerson;

	public static void main(String[] args) {
		Person.display();
		System.out.println(Person.age);
		
		Person person = new Person();//Heap Memory
		int i=0;//Stack memory'
		System.out.println(person.getName());
		person.display();
	
	}

}
