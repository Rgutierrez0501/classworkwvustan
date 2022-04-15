package classesdemo.ui;

public class CircleCopyDemo {

	public static void main(String[] args) {
		CircleCopy obj1= new CircleCopy();
		CircleCopy obj2= new CircleCopy(10,20,5.4);
		CircleCopy obj3=new CircleCopy(5.4);
		CircleCopy obj4 = new CircleCopy(obj2);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}

}
