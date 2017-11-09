public class TestDog {
	public static void main(String[] args) {
		BarkingDog barkingDog = new BarkingDog(5, 2);
		System.out.println(barkingDog.sounds());
		// barkingDog.pant();
		// barkingDog.bark();
		
		YodelingDog yodelingDog = new YodelingDog(2, 6);
		System.out.println(yodelingDog.sounds());
		// yodelingDog.pant();
		// yodelingDog.yodels();
		
		LahsaApso lahsaApso = new LahsaApso(4, 6, 8);
		System.out.println(lahsaApso.sounds());
		// lahsaApso.pant();
		// lahsaApso.bark();
		// lahsaApso.guard();

		GoldenRetriever goldenRetriever = new GoldenRetriever(3, 5, 7);
		System.out.println(goldenRetriever.sounds());
		// goldenRetriever.pant();
		// goldenRetriever.bark();
		// goldenRetriever.retrieves();

		Dog basenji = new Basenji(3, 3, 3);
		System.out.println(basenji.sounds());
		// basenji.pant();
		// basenji.yodels();
		// basenji.hunts();
	}
}