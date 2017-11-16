public class Cylinder extends Circle {
  private double radius;
  private double String;
  private double height = 1.0;

  public Cylinder() {
    super();
  }

  public Cylinder(double height) {
    super();
    this.height = height;
  }

  public Cylinder(double height, double radius) {
    super(radius);
    this.height = height;
  }

  public Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // @override
  public String toString() {
    return super.toString() + "\theight: " + height;
  }

  public double getVolume() {
    return super.getArea() * height;
  }
}