package java8features.functionalinterface;
@FunctionalInterface
public interface PrintInformation {
	public void printMessage(String message);
	public default void printInfo() {
		System.out.println("I am into default method of functional interface");
	}
	
	public static void printInformation() {
		System.out.println("I am into static method of functional interface");
	}
}
