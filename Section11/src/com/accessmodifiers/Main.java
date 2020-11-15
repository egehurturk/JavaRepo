package com.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
        // timsAccount.balance = (5000); // THIS SHOULD BE WRONG (if we declare fields as public)
        System.out.println("Balance on account is " + timsAccount.getBalance());
    }
}

/**
 * Access Modifiers:
 *  We can't have private classes
 *  TOP LEVELS:
 *         Only Classes, Interfaces, Enums exist at the top level, and everything inside them
 *      Modifiers:
 *          <i>public</i>: the object is visible to all classes everywhere
 *          <i>Package-private</i>: the object is only avaliable within its own package
 *                                  To declare package-private, do not use any modifiers: class MyClass; (w/o public)
 *  Member Level:
 *          public: same meaning as the top level
 *          Package-private: same meaning as the top level
 *          private: the object is only visible within the class it is declared, not visibile anywhere else (incl. subclass)
 *          protected: the object is visibile anywhere in its own package (like Package private), but also in subclasses
 *                      even if they are in other package
 */

/** QUIZ:
 * `
 * interface Accessible {
 *     int SOME_CONSTANT = 100;
 *     public void methodA();
 *     void methodB();
 *     boolean methodC();
 * }
 * `
 *  What is the visibility of:
 *  1) The top interface:
 *         A- Package Protected
 *  2) The int variable SOME_CONSTANT
 *         A- public
 *  3) mehtodA()
 *          A- public
 *  4) methodB();
 *          A- public
 */

/** Note: every interface elements are public final static.
 */