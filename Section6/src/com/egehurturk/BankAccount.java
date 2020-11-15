package com.egehurturk;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // constructor
    public BankAccount() {
        this(0, "Default", "no_email@no_email.org", 24234, 234324);
        System.out.println("EMPTY CONSTRUCTOR");
    }

    // Constructor overloaded
    public BankAccount(int balance, String customerName, String email, int accountNumber, int phoneNumber) {
        System.out.println("Accound constructor called");
        // WRONG: setName(other);
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int fund) {
        this.balance += fund;
    }

    public void withdraw(int amount) {
        if ((amount > this.balance) || this.balance == 0) {
            System.out.println("Insufficient balance.");
            return;
        }
        this.balance -= amount;
    }
}
