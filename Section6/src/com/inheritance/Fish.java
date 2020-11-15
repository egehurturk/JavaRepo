package com.inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    private void rest() {

    }

    public void swim() {
        System.out.println("Fish.swim() called");
        moveMuscles();
        moveBackFin();
        super.move(5);
    }

    public void swimFast() {
        System.out.println("Fish.swimFast() called");
        moveMuscles();
        moveBackFin();
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Fish.move() is called");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }


    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() is called");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() is called");
    }

    public Fish(int brain, int body, int size, int weight, String name, int gills, int eyes, int fins) {
        super(brain, body, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }


}
