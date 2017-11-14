public class TestCircleWithException {
  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException();
      CircleWithException c2 = new CircleWithException(2.5);
      CircleWithException c3 = new CircleWithException(-5.8);
      CircleWithException c4 = new CircleWithException(8.3);
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of Object created: "
      + CircleWithException.getNumberOfObject());
  }
}