package classesdemo.ui;

public class Circle {
	private int x,y;
	private double radius;
	
	public Circle() {
		x=0;
		y=0;
		radius=0.0;
	}

	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(Circle circle) {
		this.x = circle.x;
		this.y = circle.y;
		this.radius = circle.radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
	
}
