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
public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate=0.1;
   
    
    public double getPaymentAmount(){
        return(grossSale*commissionRate);
    
    }

    public CommissionEmployee(String firstName,String lastName,String SIN,double grossSale, double commissionRate) {
        super(firstName,lastName,SIN);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    
    
}
