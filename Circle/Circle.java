public class Circle {
	private double radius;
	private static int numberOfObjects = 0;

	public Circle() {
		this.radius = 1.0;
		numberOfObjects++;
	}

	public Circle(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double getArea() {
		return this.radius * this.radius * 3.14;
	}
}