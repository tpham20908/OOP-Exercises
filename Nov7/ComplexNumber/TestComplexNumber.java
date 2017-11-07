import java.util.Scanner;

public class TestComplexNumber {
	public static void main(String[] args) {
		int real, img;
		ComplexNumber n1, n2, result;
		char answer;
		Scanner input = new Scanner(System.in);

		System.out.print("Input the real part #1: ");
		real = input.nextInt();

		System.out.print("Input the image part #1: ");
		img = input.nextInt();
		n1 = new ComplexNumber(real, img);

		System.out.print("Input the real part #2: ");
		real = input.nextInt();

		System.out.print("Input the image part #2: ");
		img = input.nextInt();

		n2 = new ComplexNumber(real, img);

		n1.display();
		n2.display();

		result = new ComplexNumber();
		result.sum(n1, n2);
		result.display();

	}
}