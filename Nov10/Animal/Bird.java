public abstract class Bird extends Animal {
	public Bird(String name) {
		super(name);
	}

	public void eat() {
		System.out.println("Bird can eat fruits!");
	}

	public void breath() {
		System.out.println("Bird can breath 120 times per minute!");
	}

	public abstract void fly();
}