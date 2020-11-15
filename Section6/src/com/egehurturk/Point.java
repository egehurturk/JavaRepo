package com.egehurturk;

public class Point {
    private double x;
    private double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance() {
        double difX = Math.pow(this.x - 0, 2);
        double difY = Math.pow(this.y - 0, 2);
        return Math.sqrt(difX + difY);
    }

    public double distance(int x, int y) {
        double difX = Math.pow(this.x - x, 2);
        double difY = Math.pow(this.y - y, 2);
        return Math.sqrt(difX + difY);
    }

    public double distance(Point point) {
        double difX = Math.pow(this.x - point.getX(), 2);
        double difY = Math.pow(this.y - point.getY(), 2);
        return Math.sqrt(difX + difY);
    }
}
