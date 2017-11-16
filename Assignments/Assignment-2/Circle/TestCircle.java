class TestCircle {
  public static void main(String[] args) {
    Circle c = new Cylinder(4.7, 12.3, "Orange");
    System.out.println(c.getArea());
    System.out.println(c.toString());
    System.out.println(((Cylinder)c).getVolume());
  }
}