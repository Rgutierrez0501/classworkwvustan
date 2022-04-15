package classesdemo.ui;

public class CircleDemo {

	public static void main(String[] args) {
		Circle obj1= new Circle();
		Circle obj2= new Circle(10,20,5.4);
		Circle obj3=new Circle(5.4);
		Circle obj4 = new Circle(obj2);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}

}
