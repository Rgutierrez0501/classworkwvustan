package abstractionexamples.interfaces;

public class DisplayInfoTester {

	public static void main(String[] args) {
		DisplayInfo obj = new DisplayInfoImpl();
		obj.print();
		System.out.println(obj.MIN);
		//The final field DisplayInfo.MIN cannot be assigned
		//obj.MIN = 15;

	}

}
