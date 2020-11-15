package com.finals;

public class SIBTest {
    public static final String owner;

    static { // Static initialization block
        owner = "tim";
        System.out.println("SIBTest static initalization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static { // Static initialization block
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}

/**
 * Both static initialization blocks were called before constructor, i.f. before called any non-static methods
 *
 */