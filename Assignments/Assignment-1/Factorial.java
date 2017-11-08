class Factorial {
  public static void main(String[] args) {
    //W.A.P to find the factorial of given number. (use function)
    
    // System.out.println(factorial1(3));
    // System.out.println(factorial1(4));
    // System.out.println(factorial1(5));
    // System.out.println(factorial1(6));
    // System.out.println(factorial1(7));
    // System.out.println(factorial1(8));
    // System.out.println(factorial1(9));
    // System.out.println(factorial1(10));
    // System.out.println(factorial1(11));
    // System.out.println(factorial1(12));
    // System.out.println(factorial1(50));

    System.out.println(factorial2(3));
    System.out.println(factorial2(4));
    System.out.println(factorial2(5));
    System.out.println(factorial2(6));
    System.out.println(factorial2(7));
    System.out.println(factorial2(8));
    System.out.println(factorial2(9));
    System.out.println(factorial2(10));
    System.out.println(factorial2(11));
    System.out.println(factorial2(12));
    System.out.println(factorial2(50));
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