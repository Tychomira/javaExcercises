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
public class BankAccount {

    private static int accountsOpened;

    private int number; 
    private double amount;
    private String name; 
    private boolean active;
    private ArrayList<String> transactions;

    public BankAccount() {
        accountsOpened++;
        this.active = true;
        this.amount = 0;
        this.transactions = new ArrayList();

        this.transactions.add(name);
        System.out.println("Account created!");
    }

    public BankAccount(String onoma, int arithmos) {
        this();   // πως θα μετραει ο accountsOpened, ανεξαρτητα απο το ποιο constructor θα χρησιμοποιησω????  
        name = onoma;
        number = arithmos;

    }

    public BankAccount(int arithmos, double poso, String onoma, boolean energos) {
        this();
        name = onoma;
        number = arithmos;
        amount = poso;
        active = energos;

    }

    public void setNumber(int arithmos) {
        if (number > 0) {
            number = arithmos;
        }

    }

    public void setAmount(double poso) {
        if (amount > 0) {
            amount = poso;
        }

    }

    public void setName(String onoma) {

        name = onoma;

    }

    public void setActive(Boolean energos) {
        if (active = true) {
            active = energos;
        } else {
            System.out.println("Your account is not active!!");
        }
    }

    public void setTransaction(ArrayList<String> synallagi) {
        transactions = synallagi;

    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {

        return amount;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {

        return active;
    }

    public ArrayList<String> getTransactions() {
        return transactions;

    }

    public void deposit(double poso) {
                    amount += poso;
            this.transactions.add(String.format("Deposit: %.3f", poso));
        
        

    }

    public void withDraw(double poso) {
        if (poso>amount) {
            System.out.println("You dont have money in your account. To continue transaction you must deposit!!!!");
        } else {
            amount -= poso;
            this.transactions.add(String.format("Withdraw :%3.f", poso));
        }
        
    }

    public static int getAccountsOpened() {

        return accountsOpened;
    }

  
}
