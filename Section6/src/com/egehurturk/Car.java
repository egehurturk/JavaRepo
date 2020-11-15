package com.egehurturk;

public class Car {
    private int doors; // generally go with private
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // setter
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        this.model = "Unknown";
    }

    // getter
    public String getModel() {
        return this.model;
    }
}

/*
 Since we've defined these fields as private, we can't access them from Main.java
 `this` is the instance.
*/
