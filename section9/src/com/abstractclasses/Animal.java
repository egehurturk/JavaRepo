package com.abstractclasses;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(); // do not implement
    public abstract void breathe(); // do not implement

    public String getName() {
        return name;
    }
}
