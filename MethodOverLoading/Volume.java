public class Volume {
	
	// volume of a rectangle
	public void volume(double length, double width, double height) {
		double volume = length * width * height;
		System.out.printf("Volume of rectangle = %.2f\n", volume);
	}

	// volume of a cone
	public void volume(double base, double height) {
		double volume = base * height / 3;
		System.out.printf("Volume of cone = %.2f\n", volume);
	}

	// volume of a cylinder
	public void volume(int radius, double height) {
		double volume = radius * radius * height * 3.14;
		System.out.printf("Volume of a cylinder = %.2f", volume);
	}

}