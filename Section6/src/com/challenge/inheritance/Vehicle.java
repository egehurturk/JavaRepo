package com.challenge.inheritance;

public class Vehicle {
    private String name;
    private String size;
    private int speed;

    private double currentVelocity;
    private double currentDirection;

    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(double currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public double getCurrentDirection() {
        return this.currentDirection;
    }

    public void setCurrentDirection(double currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle(String name, String size, int speed) {
        this.name = name;
        this.size = size;
        this.speed = speed;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(double direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer("+direction+") is called");
    }

    public void move(double velocity, double direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move("+velocity+direction+") is called");
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
