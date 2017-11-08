public class Basenji extends YodelingDog {
	int huntEfficiency;

	public Basenji(int pant, int yodelingFrequency, int huntEfficiency) {
		super(pant, yodelingFrequency);
		this.huntEfficiency = huntEfficiency;
	}

	public void hunts() {
		// for (int i = 0; i < huntEfficiency; i++) {
		// 	System.out.print("Hunting ");
		// }
		System.out.println("I'm Basenji");
	}
}