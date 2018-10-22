/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccountstrategy;

/**
 *
 * @author mahtab
 */
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
	
    public PaypalStrategy(String email, String pwd){
	this.emailId=email;
	this.password=pwd;
    }
	
    @Override
    public void pay(double amount) {
	System.out.println(amount + " paid using Paypal.");
    }
}
