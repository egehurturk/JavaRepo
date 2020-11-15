package com.scopes;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar -> " + publicVar + ", privateVar -> " + privateVar );
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2; // This variable is local to the timesTwo() method
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar); // uses the local variable
        }
    } // enclosing block for for loop inside timesTwo
    // Java looks for privateVar inside the for block, when it can't find it looks for the one outer block,
    // which is the timesTwo block. There it finds the privateVar varialbe and uses that. The timesTwo() method is
    // enclosing to the for loop, which means the outer block
    // The i variable is limited to the for block, so we can't use the i variable outside the for loop.
    //      because of the local scope, the i's scope is local to the for block.
    // So, we can't use local variables inside other non-enclosing methods or blocks (we can't use i outside for loop)
    // or, we can't use a variable declared inside the timesTwo method inside another method,
    // because that will be local to timesTwo method
    // We can use the class variable with adding the `this` keyword: `this.privateVar`



    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i*privateVar);
            }
        }
    }
    // The scope rule applies to inner classes as well
    // 1. Inside the for loop inside the timesTwo() method, Java looked for the privateVar variable
    // 2. It couldn't find the var inside the for loop, and looked inside the method
    // 3. No local variable to the timesTwo() method as well. Next stop is the class' field
    // 4. Java looked for a field inside the inner class `InnerClass`. Boom, it found one and used that

    //  If we commented out the field of InnerClass, Java would look for:
    //          1. The field, couldn't find
    //          2. What is the next enclosing scope? The outer class ScopeCheck
    //          3. Search the `privateVar` inside the enclosing scope, and Boom! Java uses the value of the outer class
    // NOTE: We can't use the `this.privateVar` inside the timesTwo() method, because the inner class does not have one
    //      But we can use the ScopeCheck.this.privateVar
}
