public class Rectangle implements Shape {
  private int length = 23;
  private int width = 15;

  public double getArea() {
    return length * width;
  }

  public String toString() {
    return "Color: " + color +
      "\nLength: " + length +
      "\nWidth: " + width +
      "\nArea: " + getArea();
  }
}