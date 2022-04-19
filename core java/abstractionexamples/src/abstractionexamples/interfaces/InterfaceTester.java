package abstractionexamples.interfaces;

public class InterfaceTester {

	public static void main(String[] args) {
		Drawable d = new Rectangle();
		d.draw();
		
		Drawable circle = new Circle();
		circle.draw();
	}

}
