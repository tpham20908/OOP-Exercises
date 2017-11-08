public class YodelingDog extends Dog {
	private int yodelFrequency;

	public YodelingDog(int pant, int yodelFrequency) {
		super(pant);
		this.yodelFrequency = yodelFrequency;
	}

	public void yodels() {
		// for (int i = 0; i < yodelFrequency; i++) {
		// 	System.out.print("Yodelling ");
		// }
		System.out.println("I'm a Yodeling Dog");
	}
}