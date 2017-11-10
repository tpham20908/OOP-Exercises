class CarClass implements VehicleInterface1 {

	public void turnLeft() {
		System.out.println("Turning left.");
	}

	public void turnRight() {
		System.out.println("Turning right.");	
	}

	public void accelerate() {
		System.out.println("Accelerate " + a + " km/h.");
	}

	public void slowDown() {
		System.out.println("Slowing down.");
	}
}