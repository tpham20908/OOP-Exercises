class TestInterface {
	public static void main(String[] args) {
		CarClass car = new CarClass();

		car.turnLeft();
		car.turnRight();
		car.accelerate();
		car.slowDown();

		Truck truck = new Truck();
		truck.load();
		truck.unLoad();
	}
}