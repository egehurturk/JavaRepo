package com.abstractclasses;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in. Breathe out. Repeat");
    }
}

// in order to create valid classes, we have to implement abstract methods in the super class