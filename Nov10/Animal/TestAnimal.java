public class TestAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog("Huskey");
		System.out.println(dog.getName());
		dog.eat();
		dog.breath();

		Bird bird1 = new Penguin("aPenguin");
		System.out.println(bird1.getName());
		bird1.eat();
		bird1.breath();
		bird1.fly();

		Bird bird2 = new Parrot("aParrot");
		System.out.println(bird2.getName());
		bird2.eat();
		bird2.breath();
		bird2.fly();
	}
}