package abstractionexamples.interfacesjava8features;


public interface DisplayMessage {
	
	public void displayMsg();//abstract method it will not have body
	
	public void displayMessage(String message); //abstract method it will not have body
	
	//default method
	public default void printMsg() {
		System.out.println("Hello I am default method");
	}

	//static method
	public static void printMessage(String name) {
		System.out.println("Hello Good Morning "+name+" I am static method");
	}
	
	
}

