package com.finals;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//
//      //   Math m = new Math(); because Math is declared to be: private Math(){}
//        int pw = 74548;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(34534543);
//        password.letMeIn(345345);
//        password.letMeIn(464565);
//        password.letMeIn(74548);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);


    }
}

// Marking a class as `final` prevents the class from being subclassed
// Marking methods prevent them to be overriden