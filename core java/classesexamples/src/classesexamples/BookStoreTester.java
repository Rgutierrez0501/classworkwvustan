package classesexamples;

public class BookStoreTester {

	public static void main(String[] args) {
		System.out.println(BookStore.getHeadquarters());
		BookStore bookStore= new BookStore();
		System.out.println(bookStore);
		bookStore.setLocation("Geneva");
		bookStore.setName("CrossWords");
		bookStore.setSellAmount(434454.55);
		
		System.out.println(bookStore);
		
		bookStore.hashCode();
		
	}

}
