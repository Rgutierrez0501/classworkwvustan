package java8features.functionalinterface;

public class PrintInformationImpl implements PrintInformation {

	@Override
	public void printMessage(String message) {
		System.out.println("Good Afternoon please remain awake");
	}

}
