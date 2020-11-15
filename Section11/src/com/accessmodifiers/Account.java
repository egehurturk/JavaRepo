package com.accessmodifiers;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.setAccountName(accountName);
        this.setTransactions(new ArrayList<Integer>());
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.setBalance(this.getBalance() + (amount));
            System.out.println(amount + " deposited. Balance is now " + this.getBalance());
        } else {
            System.out.println("Cannot deposit, negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (amount > 0) {
            this.getTransactions().add(amount);
            this.setBalance(this.getBalance() + amount);
            System.out.println(amount + " withdrawn. Balance is now " + this.getBalance());
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.setBalance(0);
        for (int i:
                this.getTransactions()) {
            this.setBalance(this.getBalance() + i);
        }
        System.out.println("Calculated balance is " + this.getBalance());
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<Integer> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Integer> transactions) {
        this.transactions = transactions;
    }
}



