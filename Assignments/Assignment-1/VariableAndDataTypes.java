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