public class LahsaApso extends BarkingDog {
	private int guardEfficiency;

	public LahsaApso(int pant, int barkFrequency, int guardEfficiency) {
		super(pant, barkFrequency);
		this.guardEfficiency = guardEfficiency;
	}

	public void guard() {
		// for (int i = 0; i < guardEfficiency; i++) {
		// 	System.out.print("Guarding ");
		// }
		System.out.println("I'm LahsaApso");
	}
}