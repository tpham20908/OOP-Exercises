public class Example {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.setChannel(12);
		tv.setVolume(45);

		for (int i = 0; i < 125; i++) {
			tv.channelDown();			
		}

		for (int j = 0; j < 117; j++) {
			tv.volumeUp();	
		}

		// tv.turnOff();

		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		System.out.println(tv.getStatus());
	}
}