interface Interface1 {
	int x = 5;
	void display();
}

interface Interface2 {
	int x = 10;
	void display();
}

class C implements Interface1, Interface2 {
	public static void main(String[] args) {
		Interface1 A = new C();
		Interface2 B = new C();

		System.out.println(A.x);
		System.out.println(B.x);

		A.display();
	}

	public void display() {
		System.out.println("I'm the sharing method.");
	}
}