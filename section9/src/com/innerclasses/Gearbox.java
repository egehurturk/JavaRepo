package com.innerclasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears = new ArrayList<>();
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        for (int i = 0; i < maxGears; i++) {
            addGear(i, i*5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if(newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        } else {
            return revs * (gears.get(currentGear).getRatio());
        }
    }

    public class Gear {
        private int gearNo;
        private double ratio;

        private Gear(int gearNo, double ratio) {
            this.gearNo = gearNo;
            this.ratio = ratio;
        }

        public int getGearNo() {
            return gearNo;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
// Gear is coupled with GearBox
// Gearbox can access all private  methods/fields of Gear
// access outer class: Gearbox.gear.gearNo;
// since gearNo exists in both Gear and Gearbox, it is said to be shadow (IT IS BAD)
// Gear is a member of Gearbox
// Usually, make inner classes private to hide that
