public abstract class Shape {
  private String color;

  protected abstract double getArea();

  protected void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "Color: " + color;
  }
}