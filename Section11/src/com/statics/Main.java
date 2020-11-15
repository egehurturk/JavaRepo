package com.statics;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
        StaticTest test1 = new StaticTest("Asdasd");
        System.out.println(test1.getName() + " is instance no " + StaticTest.getNumInstances());

        StaticTest test2 = new StaticTest("ASDASD");
        System.out.println(test2.getName() + " is instance no " + StaticTest.getNumInstances());

        StaticTest test3 = new StaticTest("SDFSDFDSFDS");
        System.out.println(test3.getName() + " is instance no " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}


/**
 * numInsatnces in the StaticTest class is a static field, so shared with all classes
 * If you're working on static fields, it makes sense to declare methods that handle them static:
 *          StaticTest.getNumInstances();
 *          Integer.parseInt();
 *
 * Static methods and fields belong to classes, and we can use them with the class name rather than an instance
 */

/**
 * Normal (non-static) fields require an instance of a class, and don't actually exists until it is created
 * We can't use instance (non-static) variables inside static methods
 * We can call static methods from nonstatic ones with no problems
 */

