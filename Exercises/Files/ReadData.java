import java.io.*;
import java.util.Scanner;

class ReadData {
  public static void main(String[] args) throws IOException {
    File file = new File("score.txt");
    Scanner input = new Scanner(file);

    while (input.hasNext()) {
      String firstName = input.next();
      String middleName = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      System.out.println(firstName + " " + middleName + " "
        + lastName + " " + score);
    }
    input.close();
  }
}