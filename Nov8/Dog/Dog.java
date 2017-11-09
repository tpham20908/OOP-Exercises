public abstract class Dog {
	private int pantRate;

	public Dog(int pantRate) {
		this.pantRate = pantRate;
	}

	public void pant() {
		// for (int i = 0; i < pantRate; i++)
		// System.out.print("Painting ");
		// System.out.println();
		System.out.println("I'm a Dog");
	}

	public abstract String sounds();
}