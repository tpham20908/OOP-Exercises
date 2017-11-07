package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author 1796137
 */
public class vowelconsonant {

  public static void main(String[] args) 
  {
    char c;
    String msg = "";
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a character: ");
    c = input.next().charAt(0);
    // validate c
    while (!isChar(c))
    {
      System.out.print("It's not a character.\n");
      System.out.print("Enter a character: ");
      c = input.next().charAt(0);
    }
    // branching
    msg = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') ? 
            String.format("%c is a vowel.\n", c) :
            String.format("%c is a consonant.\n", c);
    System.out.print(msg);
  }
  // isChar returns boolean if a character is vowel?
  public static boolean isChar(char c)
  {
    //return (Character.isLetter(c));
    return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
  }
  
}
