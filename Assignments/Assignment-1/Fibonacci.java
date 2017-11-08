class Fibonacci {
  public static void main(String[] args) {
    //W.A.P to print Fibonacci series for the given n numbers (use functions)
    
    // System.out.println(fibonacci1(1));
    // System.out.println(fibonacci1(2));
    // System.out.println(fibonacci1(3));
    // System.out.println(fibonacci1(4));
    // System.out.println(fibonacci1(5));
    // System.out.println(fibonacci1(6));
    // System.out.println(fibonacci1(7));
    // System.out.println(fibonacci1(8));
    // System.out.println(fibonacci1(9));
    // System.out.println(fibonacci1(10));
    // System.out.println(fibonacci1(11));
    // System.out.println(fibonacci1(12));
    // System.out.println(fibonacci1(13));
    // System.out.println(fibonacci1(14));
    // System.out.println(fibonacci1(15));
    // System.out.println(fibonacci1(70));

    System.out.println(fibonacci2(1));
    System.out.println(fibonacci2(2));
    System.out.println(fibonacci2(3));
    System.out.println(fibonacci2(4));
    System.out.println(fibonacci2(5));
    System.out.println(fibonacci2(6));
    System.out.println(fibonacci2(7));
    System.out.println(fibonacci2(8));
    System.out.println(fibonacci2(9));
    System.out.println(fibonacci2(10));
    System.out.println(fibonacci2(11));
    System.out.println(fibonacci2(12));
    System.out.println(fibonacci2(13));
    System.out.println(fibonacci2(14));
    System.out.println(fibonacci2(15));
    System.out.println(fibonacci2(50));
  }

  // loop method: much faster
  public static double fibonacci1(int num) {
    int first = 1, last = 1, value = 0;
    if (num == 1)
      value = 1;
    else if (num == 2)
      value = 1;
    else
      for (int i = 3; i <= num; i++) {
        value = first + last;
        first = last;
        last = value;
      }
    return value;
  }

  // recursive method: very slow when num >= 45
  public static double fibonacci2(int num) {
    return (num <= 2) ? 1 : (fibonacci2(num - 1) + fibonacci2(num - 2));
  }
}