package javaarryasexample.stringexample;

public class StringBufferExample {



	public static void main(String[] args) {
		StringBuffer strBuff = new StringBuffer("Ravi Kumar ");
		System.out.println("---"+strBuff);
		strBuff.append(" How are you ?");
		System.out.println("---"+strBuff);
		
		strBuff.insert(10, "Hello,");
		System.out.println("---"+strBuff);
		
		strBuff.deleteCharAt(30);
		System.out.println("---"+strBuff);
		strBuff.delete(10, 15);
		System.out.println("---"+strBuff);
		System.out.println("----"+strBuff.capacity());
		System.out.println("----"+strBuff.length());
	}

}
