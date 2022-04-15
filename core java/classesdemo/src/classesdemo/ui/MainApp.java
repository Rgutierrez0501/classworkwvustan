package classesdemo.ui;

public class MainApp {

	public static void main(String[] args) {
		Apple apple = new Apple(); //apple object or apple object reference
		System.out.println(apple.color);
		
		changeApple(apple);// passing apple object reference
		System.out.println(apple.color);
	}

	private static void changeApple(Apple apple) {
	apple.color="green";
		
	}

}
