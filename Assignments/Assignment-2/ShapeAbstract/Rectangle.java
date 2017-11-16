public class Rectangle extends Shape {
  private int length = 12;
  private int width = 15;

  public double getArea() {
    return length * width;
  }

  public String toString() {
    return super.toString() +
      "\nLength: " + length +
      "\nWidth: " + width +
      "\nArea: " + getArea();
  }
}