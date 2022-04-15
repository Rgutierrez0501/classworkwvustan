package classesdemo.ui;

public class CircleCopy {
	private int x,y;
	private double radius;
	
	public CircleCopy() {
		this(0,0,0);
	}

	public CircleCopy(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public CircleCopy(double radius) {
		this(0,0,radius);
	}
	public CircleCopy(CircleCopy circle) {
		this(circle.x,circle.y,circle.radius);
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
