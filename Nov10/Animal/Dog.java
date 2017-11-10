public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public void eat() {
		System.out.println("Dog can eat meat!");
	}

	public void breath() {
		System.out.println("Dog can breath 100 times per minute!");	
	}
}