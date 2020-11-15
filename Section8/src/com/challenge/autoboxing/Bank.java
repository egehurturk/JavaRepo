package com.challenge.autoboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> listOfBranches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.listOfBranches.add(Branch.branchBuilder(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmo) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            return branch.addNewCustomer(customerName, initialAmo);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amo) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addNewCustomer(customerName, amo);
        }
        return false;
    }

    private Branch findBranch(String customerName) {
        for (Branch branch : listOfBranches) {
            if (branch.getName().equals(customerName)) {
                return branch;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getListOfBranches() {
        return listOfBranches;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch!=null) {
            System.out.println("Customers for branch: " + branch.getName());

            ArrayList<Customer> branchCustomer = branch.getCustomerList();
            for (int i = 0; i < 4; i++) {
                return true;
            }
        }
        return false;
    }







}
