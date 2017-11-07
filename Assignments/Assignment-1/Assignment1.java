class VariableAndDataTypes {
  public static void main(String[] args) {
  // 1. Create a byte variable and set it to any valid byte number.
  byte num1 = 125;
  // 2. Create a short variable and set it to any valid short number.
  short num2 = 28345;
  // 3. Create a int variable and set it to any valid in number.
  int num3 = 32048778;
  // 4. Create a variable of type long, and make it equal to
  // 50000 + 10 times the sum of the byte, plus the short plus the int
  long num4 = 50000 + 10 * (num1 + num2 + num3);
  }
}

class Convert {
  public static void main(String[] args) {
  // 1. Create a variable to store the number of pounds
  double numInPound = 423.52;
  // 2. Calculate the number of Kilograms for the number above and store in a variable.
  double numInKg;
  numInKg = numInPound * 0.45359237;
  // 3. Print out the result.
  System.out.printf("%.2f pounds equals to %.2f kgs.\n", numInPound, numInKg);
  // NOTES: 1 pound is equal to 0.45359237 kilograms.
  }
}

class FindCode {
  public static void main(String[] args) {
  // 1. Find the code for the registered symbol (ɰ)
  // 2. Create a variable of type char and assign it the unicode value for that symbol.
  char symbol = '\u0270';
  // 3. Display in on screen.
  System.out.println(symbol);
  // For Unicode refer: https://unicode-table.com/en/#basic-latin
  }
}

class Fibonacci {
  public static void main(String[] args) {
    // W.A.P to print Fibonacci series for the given n numbers (use functions)
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(6));
    System.out.println(fibonacci(7));
    System.out.println(fibonacci(8));
    System.out.println(fibonacci(9));
    System.out.println(fibonacci(10));
    System.out.println(fibonacci(11));
    System.out.println(fibonacci(12));
    System.out.println(fibonacci(13));
    System.out.println(fibonacci(14));
    System.out.println(fibonacci(15));
  }
  public static double fibonacci(int num) {
    // return (num <= 2) ? 1 : (fibonacci(num - 1) + fibonacci(num - 2));
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
}

class Factorial {
  public static void main(String[] args) {
    //W.A.P to find the factorial of given number. (use function)
    System.out.println(factorial(3));
    System.out.println(factorial(4));
    System.out.println(factorial(5));
    System.out.println(factorial(6));
    System.out.println(factorial(7));
    System.out.println(factorial(8));
    System.out.println(factorial(9));
    System.out.println(factorial(10));
    System.out.println(factorial(11));
    System.out.println(factorial(12));
  }

  public static double factorial(int x) {
    double result = 1;
    for (int i = 1; i <= x; i++) {
      result *= i;
    }
    return result;
  }
}