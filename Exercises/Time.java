class Time {
  private int hour;
  private int minute;
  private double second;

  public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }

  public Time(int hour, int minute, double second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return this.hour;
  }

  public int getMinute() {
    return this.minute;
  }

  public double getSecond() {
    return this.second;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(double second) {
    this.second = second;
  }

  public static void main(String[] args) {
    Time time = new Time(11, 59, 59.9);
    printTime(time);
    time.increment(230.5);
    printTime(time);
  }

  public static void printTime(Time t) {
    System.out.printf("%02d:%02d:%04.1f\n",
        t.hour, t.minute, t.second);
  }

  // public void increment(double seconds) {
  //   this.second += seconds;
  //   while (this.second >= 60.0) {
  //     this.second -= 60.0;
  //     this.minute += 1;
  //   }
  //   while (this.minute >= 60) {
  //     this.minute -= 60;
  //     this.hour += 1;
  //   }
  // }

  public void increment(double second) {
    this.second += second;
    this.minute += (int)(this.second / 60);
    this.hour += this.minute / 60;
    this.minute %= 60;
    this.second %= 60;
  }
}