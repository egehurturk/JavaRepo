package com.finals;

public class Password {
    private static final int key = 242536346;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key; // XOR
    }

    // We can't override this method because it is final
    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope");
        }
        return false;
    }
}

// Normal constructors are instance constructors, and called when a instance is created everytime
// A static initialization block is only executed once when the class is first loaded into the project
// We can assign the value of a static final variable inside a static block