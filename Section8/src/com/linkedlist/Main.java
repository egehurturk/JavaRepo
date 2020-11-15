package com.linkedlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intlist = new ArrayList<Integer>();

        intlist.add(1);
        intlist.add(3);
        intlist.add(4);

        for (int i = 0; i < intlist.size(); i++) {
            System.out.println(i + " : " + intlist.get(i));
        }
        System.out.println("---------");
        intlist.add(1,2); // insert 2 in index pos 1 (push other records in array to one place down)
        for (int i = 0; i < intlist.size(); i++) {
            System.out.println(i + " : " + intlist.get(i));
        }
    }
}
