/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package interfaceexample;

import java.util.Scanner;

/**
 *
 * @author shahida.chauhan
 */
public class InterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int ch;
       String ln = null, fn = null, sin = null;
       double gs, wages, hours, weekklySalary;
       Scanner scanner=new Scanner(System.in);
       while(true)
       {
            System.out.println("Enter Option\n1.Commision Employee\n"
                    + "2.Salaried Employee\n3.Hourly Employee\n4.Invoice\n"
                    + "5.Exit");
            ch=scanner.nextInt();
            switch(ch)
            {
                case 1:
                    getGeneralInfo(fn, ln, sin);
                    System.out.println("Enter gross sale:");
                    gs = scanner.nextDouble();

                    CommissionEmployee cemp = new CommissionEmployee(fn,ln,sin,gs,0.1);
                    System.out.println("Salary = "+cemp.getPaymentAmount());
                    break;
                case 2:
                    getGeneralInfo(fn, ln, sin);
                    System.out.println("Enter weekkly salary:");
                    weekklySalary = scanner.nextDouble();
                    SalariedEmployee semp = new SalariedEmployee(weekklySalary, fn, ln, sin);
                    System.out.println("Salary = " +semp.getPaymentAmount());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice:");
            }
        }
    }

    public static void getGeneralInfo(String fn, String ln, String sin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        fn=scanner.next();
        System.out.println("Enter last name:");
        ln=scanner.next();
        System.out.println("Enter SIN:");
        sin=scanner.next();
    }
}
