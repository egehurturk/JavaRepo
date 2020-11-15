package com.polymorphism;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngines() {
        return "CAR -> startEngine()";
    }

    public String accelerate() {
        return "CAR -> accelerate()";
    }

    public String brake() {
        return "CAR -> brake()";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}


class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(name, cylinders);
    }

    @Override
    public String startEngines() {
        return "MITUSIBSHI -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "MITSUBISHI -> accelerate()";
    }

    @Override
    public String brake() {
        return "MITSUBISHI -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(name, cylinders);
    }

    @Override
    public String startEngines() {
        return "FORD -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "FORD -> accelerate()";
    }

    @Override
    public String brake() {
        return "FORD -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(name, cylinders);
    }

    @Override
    public String startEngines() {
        return getClass().getSimpleName() + "-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}



public class Challenge {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngines());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mit = new Mitsubishi(8, "Outlander VRW 4WD");
        System.out.println(mit.startEngines());
        System.out.println(mit.accelerate());
        System.out.println(mit.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngines());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngines());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
