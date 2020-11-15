package com.challenge.autoboxing;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Syndney");
        bank.addCustomer("Syndney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.64);

        bank.listCustomers("Adelaide", false);


    }
}
