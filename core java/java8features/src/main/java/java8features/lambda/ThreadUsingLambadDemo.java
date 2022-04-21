package java8features.lambda;

public class ThreadUsingLambadDemo {

	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("I am new thread using lambda");
	        System.out.println("I am new thread using lambda too");
		}).start();
	}

}
