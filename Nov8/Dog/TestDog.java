public class TestDog {
	public static void main(String[] args) {
		BarkingDog barkingDog = new BarkingDog(5, 2);
		barkingDog.pant();
		barkingDog.bark();

		YodelingDog yodelingDog = new YodelingDog(2, 6);
		yodelingDog.pant();
		yodelingDog.yodels();

		LahsaApso lahsaApso = new LahsaApso(4, 6, 8);
		lahsaApso.pant();
		lahsaApso.bark();
		lahsaApso.guard();

		GoldenRetriever goldenRetriever = new GoldenRetriever(3, 5, 7);
		goldenRetriever.pant();
		goldenRetriever.bark();
		goldenRetriever.retrieves();

		Basenji basenji = new Basenji(3, 3, 3);
		basenji.pant();
		basenji.yodels();
		basenji.hunts();
	}
}