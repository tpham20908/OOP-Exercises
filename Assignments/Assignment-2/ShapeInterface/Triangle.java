public class Triangle implements Shape {
  private int base = 45;
  private int height = 17;

  public double getArea() {
    return base * height * 0.5;
  }

  public String toString() {
    return "Color: " + color +
      "\nBase: " + base +
      "\nHeight: " + height +
      "\nArea: " + getArea();
  }
}