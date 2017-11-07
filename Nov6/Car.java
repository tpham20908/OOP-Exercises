public class Car {
	private String color, model;
	private int wheels, engine, doors;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getDoors() {
		return this.doors;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getEngine() {
		return this.engine;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWheels() {
		return this.wheels;
	}

}