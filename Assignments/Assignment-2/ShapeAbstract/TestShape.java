public class TestShape {
  public static void main(String[] args) {
    Shape s1 = new Rectangle();
    s1.setColor("Cyan");
    System.out.println(s1.toString());

    Shape s2 = new Triangle();
    s2.setColor("Magenta");
    System.out.println(s2.toString());
  }
}