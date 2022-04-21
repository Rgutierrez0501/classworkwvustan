package java8features.lambda;

public class ThreadDemo {

	public static void main(String[] args) {
	Thread thread = new Thread(new SimpleRunnable());
	thread.start();

	}

}
