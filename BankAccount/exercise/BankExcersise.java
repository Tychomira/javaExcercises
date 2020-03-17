/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.excersise;

import java.util.ArrayList;

/**
 *
 * @author ticho
 */
public class BankExcersise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Create a BankAccount class with variables number(int), amount(double), name(String), 
        active(boolean), transactions(ArrayList<String>) 
        Add getters/setters
Create methods deposit(), withdraw(). Do you need the setter for amount variable?
Store each action (deposit, withdraw, creation) in the transactions list.
If account doesn't have amount, what can you withdraw?
Create a variable(accountsOpened) that counts the number of accounts opened. This variable shows how many accounts have been opened.
Create 3 contructors (default, name-number, all(except transactions)). When created all will be active.      */

        BankAccount tryMe = new BankAccount();
        ArrayList<String> myTransaction = new ArrayList();
        tryMe.setName("Tychomira");
        tryMe.setNumber(36594);
        tryMe.setAmount(3690.00);
        tryMe.setActive(true);
        tryMe.setTransaction(myTransaction);
        tryMe.deposit(36.30);

       // System.out.println("**************");
        tryMe.withDraw(23.8);
        //System.out.println("name: " + tryMe.getName());
       // System.out.println("transaction list: " + tryMe.getTransactions());

    }

}
