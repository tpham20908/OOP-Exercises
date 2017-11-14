import java.io.*;

public class WriteData{
  public static void main(String[] args) throws IOException {
    File file = new File("score.txt");
    if (file.exists()) {
      System.out.println("File already exists.");
      System.exit(0);
    }
    PrintWriter pwriter = new PrintWriter(file);
    pwriter.print("John T Smith ");
    pwriter.println(90);
    pwriter.print("Eric K Jones ");
    pwriter.println(85);

    pwriter.close();
  }
}