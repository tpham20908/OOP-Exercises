/**
*@param args the command line arguments
*/
import java.util.Scanner;

// no return type and no arg

public class Main {
	// static int a = 10, b = 4;

	public static void main(String[] args) {
		// sum();
		// System.out.println("mul = " + mul());
		// sub(a, b);
		// System.out.println("Div = " + div(a, b));

		int a, b, ch;

		Calc c = new Calc();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();

		System.out.println("1. Sum:\n2. Mul:\n3. Sub:\n4. Div:\n5. Exit:\n");
		ch = input.nextInt();

		switch (ch) {
			case 1: 
				c.sum(a, b);
				break;
			case 2:
				System.out.println("Mul = " + c.mul(a, b));
				break;	
			case 3:
				c.sub(a, b);
				break;
			case 4:
				System.out.printf("Div = %.2f\n", c.div(a, b));	
				break;
			case 5:
				System.exit(0);
				break;
		}
	}

	// // no args and no return
	// public static void sum() {
	// 	int a = 10, b = 4, c;
	// 	c = a + b;
	// 	System.out.println("sum = " + c);
	// }

	// // no args with return
	// public static int mul() {
	// 	return a*b;
	// }

	// // with args no return
	// public static void sub(int a, int b) {
	// 	int c = a - b;
	// 	System.out.println("sub = " + c);
	// }

	// // with args with return
	// public static double div(int a, int b) {
	// 	double d = (double)a / b;
	// 	return d;
	// }
}
