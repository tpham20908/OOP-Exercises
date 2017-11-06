public class MethodOverLoading {

	public static void main(String[] args) {
		// method overloading example
		// calculate volume for ractangle cone and cylinder

		// declare object of class Volume
		Volume v = new Volume();
		// calling funcion for a rectangle
		v.volume(3.5, 12.4, 7.8);
		// calling funcion for a cone
		v.volume(52.4, 7.8);
		// calling funcion for a cylinder
		v.volume(12, 7.8);
	}
}