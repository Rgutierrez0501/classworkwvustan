package methodoverloadingexample;

public class MethodOverload {

	void test (int a) {
		System.out.println("a : "+a);
	}
	
	void test(int a, int b) {
		System.out.println("a and b : "+a+" , "+b);
	}
	
	void test (float a) {
		System.out.println("double a : "+a);
	}
}
