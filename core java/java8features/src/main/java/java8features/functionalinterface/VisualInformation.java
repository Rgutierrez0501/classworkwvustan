package java8features.functionalinterface;

public interface VisualInformation {
	public default void printVisualInformation() {
		System.out.println("Functional Interface is extending non functional interface which do not have any abstract method");
	}
	
	
}