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
public abstract class Employee implements Payable{
    protected String firstName;
    protected String lastName;
    protected String SIN;


    public Employee(String firstName, String lastName, String SIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SIN = SIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }
}
