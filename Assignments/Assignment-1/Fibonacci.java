//W.A.P to print Fibonacci series for the given n numbers (use functions)
class Fibonacci {
  public static void main(String[] args) {

    // for (int i = 1; i < 50; i++) {
    //   System.out.println(fibonacci1(i));
    // }

    for (int i = 1; i < 50; i++) {
      System.out.println(fibonacci2(i));
    }
  }

  // loop method: much faster than recursive method
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