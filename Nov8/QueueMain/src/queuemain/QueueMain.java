/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemain;
import java.util.Scanner;

/**
 *
 * @author shahida.chauhan
 */
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q=new Queue();
       int ch,x; 
       Scanner scanner=new Scanner(System.in);
      
        while(true)
        {
        System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
        ch=scanner.nextInt();
       
         switch(ch)
         {
            case 1:
                    System.out.println("Enter value:");
                    x=scanner.nextInt();
                    q.insert(x);
                    break;
            case 2:
                    q.delete();
                    break;
                
                
            case 3:
                    q.display();
                    break;
            case 4:
                    System.exit(0);
            default:
            System.out.println("Invalid choice:");
                
          }
        }
    }
}
