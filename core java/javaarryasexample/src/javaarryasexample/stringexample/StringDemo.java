package javaarryasexample.stringexample;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
		System.out.println("************************************************************");
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s3 == s4);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));
		String s5 = s1+"Welcome !";
		System.out.println(s5);// s5 value is HelloWelcome!
		s5=s1+"Everyone !"; //s5 value is HelloWelcome !Everyone !
		System.out.println(s5);
		System.out.println(s1);
		
	}

}
