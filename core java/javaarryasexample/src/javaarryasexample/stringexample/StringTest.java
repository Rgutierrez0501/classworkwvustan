package javaarryasexample.stringexample;

public class StringTest {

	public static void main(String[] args) {
		foo("foo");
		foo(new String("foo"));
		foo("bar");
	}
	
	private static void foo(String str) {
		if(str == "foo") {
			str="1";
		}else if(str.equals("foo")) {
			str = "2";
		}else {
			str = "4";
		}
		System.out.println(str);
	}

}
