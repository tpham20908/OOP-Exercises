public class Example {
	public static void main(String[] args) {
		
		Car audi = new Car();

		audi.setColor("red");
		audi.setModel("V8");
		audi.setDoors(2);
		audi.setEngine(2017);
		audi.setWheels(4);

		System.out.println("Color of car is " + audi.getColor());
		System.out.println("Model of car is " + audi.getModel());
		System.out.println("Doors of car is " + audi.getDoors());
		System.out.println("Engine of car is " + audi.getEngine());
		System.out.println("Wheels of car is " + audi.getWheels());
	}
}