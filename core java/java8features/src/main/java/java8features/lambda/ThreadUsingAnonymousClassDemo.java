package java8features.lambda;

public class ThreadUsingAnonymousClassDemo {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Anonymous class");

			}

		}).start();
	}
}