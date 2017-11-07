public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(12.4);
		Circle c3 = new Circle(126.5);
		Circle c4 = new Circle(23.8);
		Circle c5 = new Circle(53.18);
		Circle c6 = new Circle(235.8);

		System.out.println("Number of Circles: " + Circle.getNumberOfObjects());

		System.out.println();

		System.out.printf("Area of Circle #1 is %.2f\n", c1.getArea());
		System.out.printf("Area of Circle #2 is %.2f\n", c2.getArea());
		System.out.printf("Area of Circle #3 is %.2f\n", c3.getArea());
		System.out.printf("Area of Circle #4 is %.2f\n", c4.getArea());
		System.out.printf("Area of Circle #5 is %.2f\n", c5.getArea());
		System.out.printf("Area of Circle #6 is %.2f\n", c6.getArea());
	}
}