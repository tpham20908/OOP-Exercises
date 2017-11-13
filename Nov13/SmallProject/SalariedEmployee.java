/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package interfaceexample;

/**
 *
 * @author shahida.chauhan
 */
public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, String SIN) {
        super(firstName, lastName, SIN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return(weeklySalary);
    }
    
    
}
