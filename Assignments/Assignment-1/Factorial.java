//W.A.P to find the factorial of given number. (use function)
class Factorial {
  public static void main(String[] args) {
    for (int i = 1; i < 50; i++) {
      System.out.println(factorial1(50));
    }
  }

  public static double factorial1(int x) {
    double result = 1;
    for (int i = 1; i <= x; i++) {
      result *= i;
    }
    return result;
  }

  public static double factorial2(int x) {
    return (x <= 1) ? 1 : x * factorial2(x-1);
  }
}