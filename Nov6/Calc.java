/**
* @author: Tung Pham - 1796137
*/

public class Calc {

	

	// no args and no return
	public void sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("sum = " + c);
	}

	// no args with return
	public int mul(int a, int b) {
		return a*b;
	}

	// with args no return
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("sub = " + c);
	}

	// with args with return
	public double div(int a, int b) {
		double d = (double)a / b;
		return d;
	}
}