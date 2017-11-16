public class Triangle extends Shape {
  private int base = 33;
  private int height = 45;

  public double getArea() {
    return base * height * 0.5;
  }

  public String toString() {
    return super.toString() +
      "\nBase: " + base +
      "\nHeight: " + height +
      "\nArea: " + getArea();
  }
}