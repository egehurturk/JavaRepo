package com.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("TARCIN");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Bookia");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin p = new Penguin("a");
        p.fly();
    }
}

// interfaces are kind of abstract, you can't instantiate them directly. You can instantiate classes that impelemts them
// abstract classes provides methods, but do not provide an implementation of those methods
// interfaces has a can-a relationship
// abstract class can have member variables that are inherited
// interfaces can have variables, but public static final variables
// interfaces cannot have constructors, but abstract classes can have
// all methods of interfaces are public, but abstract classes can have private methods, etc.
// abstract classes can have defined methods, whereas all methods in interface have to be implemented
