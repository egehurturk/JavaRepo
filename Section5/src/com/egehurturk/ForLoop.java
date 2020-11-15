package com.egehurturk;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        // for(init; termination; increment;) {}

        for (int i = 0; i < 6; i++) {
            System.out.println("Loop" + i + "hello!");
        }

    }



    public static double calculateInterest(double amount, double interestRate) {
        return amount* (interestRate/100);
    }
}

// String.format("%.2f", 7.00000001); -> 7.00