import java.math.BigInteger;

class Big {
  public static void main(String[] args) {
    BigInteger x = BigInteger.valueOf(213);
    BigInteger p = pow(x, 15);
    System.out.println(p);
  }

  public static BigInteger pow(BigInteger x, int n) {
    if (n == 0) return BigInteger.valueOf(1);

    // find x to the n/2 recursively
    BigInteger t = pow(x, n / 2);

    // if n is even, the result is t squared
    // if n is odd, the result is t squared times x
    if (n % 2 == 0) {
      return t.multiply(t);
    }
    else {
      return t.multiply(t).multiply(x);
    }
  }
}