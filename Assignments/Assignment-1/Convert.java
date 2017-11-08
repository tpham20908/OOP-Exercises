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