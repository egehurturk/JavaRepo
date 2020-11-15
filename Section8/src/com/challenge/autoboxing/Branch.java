package com.challenge.autoboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch( String name) {
        this.name = name;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customerList.add(Customer.customerBuilder(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }

    public static Branch branchBuilder(String name) {
        return new Branch(name);
    }
}
