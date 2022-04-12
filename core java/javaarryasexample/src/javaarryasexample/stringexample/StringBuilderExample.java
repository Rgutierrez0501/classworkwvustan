package javaarryasexample.stringexample;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Good Evening all how you doing ?");
		
		System.out.println(sb.length());
		
		sb.append("  Thank you all for your responses");
		System.out.println(sb);

	}

}
