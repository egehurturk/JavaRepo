package com.challenge.inheritance;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int geers;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int speed, int wheels, int doors, int geers, boolean isManual) {
        super(name, size, speed);
        this.wheels = wheels;
        this.doors = doors;
        this.geers = geers;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeVelocity(double speed, double direction) {
        super.move(speed,direction);
        System.out.println("Car.move() called with"+speed+direction);
    }


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGeers() {
        return geers;
    }

    public void setGeers(int geers) {
        this.geers = geers;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() changed to "+this.currentGear);
    }
}
