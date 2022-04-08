package helloworld;

public class HelloWorld {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Hello World ");
		System.out.println("hello everyone");
		displayMessage();
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.clone();
	}
	
	public static void displayMessage(){
		System.out.println();
	}

}
