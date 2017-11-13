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
public class HourlyEmployee extends Employee{
    double wages;
    double hours;

    public HourlyEmployee(String firstName,String lastName,String SIN,double wages, double hours) {
        super(firstName,lastName,SIN);
        this.wages = wages;
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
       return(wages*hours);
    }
    
    
}
