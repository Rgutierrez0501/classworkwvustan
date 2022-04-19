package methodoverloadingexample;

public class MethodOverloadTest {


	public static void main(String[] args) {
		
		MethodOverload overload = new MethodOverload();
		overload.test(10);
		overload.test(10, 2);
		overload.test((float)5.5);
		
	}

}
