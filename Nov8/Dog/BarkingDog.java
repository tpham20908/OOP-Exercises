public class BarkingDog extends Dog {
	private int barkFrequency;

	public BarkingDog(int pant, int barkFrequency) {
		super(pant);
		this.barkFrequency = barkFrequency;
	}

	public void bark() {
		// for (int i = 0; i < barkFrequency; i++) {
		// 	System.out.print("Barking ");
		// }
		System.out.println("I'm a Barking Dog");
	}

	public String sounds() {
		return "Sound of BarkingDog";
	}
}