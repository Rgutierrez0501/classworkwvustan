package methodoverloadingexample.finalexample;

public class FinalClassExample {



	public static void main(String[] args) {
		Subtraction subs = new Subtraction();
		System.out.println(subs.subtraction(10, 15));
		Subtraction sub = subs;
		System.out.println(sub.subtraction(5, 4));
		System.out.println(sub.getResult());
		sub.setResult(15);
		System.out.println(sub.getResult());
	}

}
