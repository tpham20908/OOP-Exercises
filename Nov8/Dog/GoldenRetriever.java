public class GoldenRetriever extends BarkingDog {
	private int retrievalSpeed;

	public GoldenRetriever(int pant, int barkFrequency, int retrievalSpeed) {
		super(pant, barkFrequency);
		this.retrievalSpeed = retrievalSpeed;
	}

	public void retrieves() {
		// for (int i = 0; i < retrievalSpeed; i++) {
		// 	System.out.print("Retrieving ");
		// }
		System.out.println("I'm GoldenRetriever");
	}
}