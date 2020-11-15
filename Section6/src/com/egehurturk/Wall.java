package com.egehurturk;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0,0);
    }

    public Wall(double width, double height) {
        this.width = width<0 ? 0 : width;
        this.height = height<0 ? 0 : height;

    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double other) {
        if (other < 0) {
            this.width = 0;
        }
        this.width = other;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double other) {
        if (other < 0) {
            this.height = 0;
        }
        this.height = other;
    }
    public double getArea() {
        return this.height * this.width;
    }
}