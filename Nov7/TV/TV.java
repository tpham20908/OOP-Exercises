public class TV {
	
	private int channel;
	private int volumeLevel;
	private boolean on;



	public TV() {
		this.channel = 1;
		this.volumeLevel = 1;
		this.on = false;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (on) {
			if (newChannel < 1)
				this.channel = 1;
			else if (newChannel > 120)
				this.channel = 120;
			else
				this.channel = newChannel;	
		}
		
	}

	public void setVolume(int newVolume) {
		if (this.on)
		{
			if (newVolume < 1)
				this.volumeLevel = 1;
			else if (newVolume > 70)
				this.volumeLevel = 70;
			else
				this.volumeLevel = newVolume;
		}
			
	}

	public void channelUp() {
		if (this.on)
			increaseInRange(this.channel, 0, 120);
		// {
		// 	if (this.channel <= 1)
		// 		this.channel = 1;
		// 	else if (this.channel >= 120)
		// 		this.channel = 120;
		// 	else
		// 		this.channel++;	
		// } 
		
	}

	public void channelDown() {
		if (this.on)
			decreaseInRange(this.channel, 0, 120);
		// {
		// 	if (this.channel <= 0)
		// 		this.channel = 0;
		// 	else if (this.channel >= 70)
		// 		this.channel = 70;
		// 	else
		// 		this.channel--;	
		// } 
		
	}

	public void volumeUp() {
		if (this.on)
			increaseInRange(this.volumeLevel, 0, 70);
		// {
		// 	if (this.volumeLevel <= 0)
		// 		this.volumeLevel = 0;
		// 	else if (this.volumeLevel >= 70)
		// 		this.volumeLevel = 70;
		// 	else
		// 		this.volumeLevel++;
		// }
			
	}

	public void volumeDown() {
		if (this.on)
			decreaseInRange(this.volumeLevel, 0, 70);
		// {
		// 	if (this.volumeLevel <= 0)
		// 		this.volumeLevel = 0;
		// 	else if (this.volumeLevel >= 70)
		// 		this.volumeLevel = 70;
		// 	else
		// 		this.volumeLevel--;
		// }
		
	}

	// getter
	public String getChannel() {
		return this.on ? "Channel: " + this.channel : "TV is off! Cannot get channel." ;
	}

	public String getVolume() {
		return this.on ? "Volume: " + this.volumeLevel : "TV is off! Cannot get volume." ;
	}

	public String getStatus() {
		return this.on? "TV is on" : "TV is off" ;
	}

	//
	public int increaseInRange(int num, int min, int max) {
		if (num <= min)
			num = min;
		else if (num >= max)
			num = max;
		else
			num++;
		return num;
	}

	public int decreaseInRange(int num, int min, int max) {
		if (num <= min)
			num = min;
		else if (num >= max)
			num = max;
		else
			num--;
		return num;
	}
}