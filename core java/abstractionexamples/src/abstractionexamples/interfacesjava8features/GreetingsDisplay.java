package abstractionexamples.interfacesjava8features;

public class GreetingsDisplay implements DisplayMessage {

	
	public static String greetings= "Good Morning";
	@Override
	public void displayMsg() {
		System.out.println("I am GreetingDisplay Class");

	}

	@Override
	public void displayMessage(String message) {
		System.out.println("Hello Good Morning "+message);
		
	}
	
	

}