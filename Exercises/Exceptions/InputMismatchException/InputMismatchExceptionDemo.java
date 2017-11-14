import java.util.*;

public class InputMismatchExceptionDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {
      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        continueInput = false;
        //display input
        System.out.println("The number entered is " + number);
      }
      catch (InputMismatchException e) {
        System.out.println("Try again. (Invalid input: " +
          "an integer is required).");
        input.nextLine();
      }
    }
    while (continueInput);

    // System.out.println(3.0/0);
    long value = Long.MAX_VALUE + 1;
    System.out.println(value);
  }
}