public class ComplexNumber {
	private int real, img;

	public ComplexNumber() {
		real = 0;
		img = 0;
	}

	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img = img;
	}

	public void display() {
		System.out.println(this.real + " " + this.img + "i");
	}

	public void sum(ComplexNumber num1, ComplexNumber num2) {
		this.real = num1.real + num2.real;
		this.img = num1.img + num2.img;
	}
}