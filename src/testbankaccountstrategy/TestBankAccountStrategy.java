/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccountstrategy;

/**
 *
 * @author ha07
 */
public class TestBankAccountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating some bank accounts, e.g., savings and checking
        SavingsAccount sa1 = new SavingsAccount(1000, 2.5);
        CheckingAccount ca1 = new CheckingAccount(1000);
        
        sa1.pay(new PaypalStrategy("myemail@example.com", "mypwd"), 200);
        ca1.pay(new CreditCardStrategy("myname", "XXXXXXXXXXXXXXXX", "XXX", "XX/XX"), 100);
        //ca1.pay(new StandingOrder("myname", "XXXXXXXXXXXXXXXX", "XXX", "XX/XX"), 100);
        
        
        // viewing the available balance
        System.out.println("The balances of the saving accounts are: " + sa1.getBalance());
        System.out.println("The balances of the checking accounts are: " + ca1.getBalance());
    }
 }
