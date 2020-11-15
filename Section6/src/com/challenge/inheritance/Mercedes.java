package com.challenge.inheritance;

public class Mercedes extends Car {
    private int roadServiceMonths;

    public Mercedes(int roadServiceMonths) {
        super("Mercedes", "4WD", 6, 5, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getSpeed() + rate;
        if (newVelocity == 0) {
            stop();
            setGeers(1);
        } else if (newVelocity >0 && newVelocity <= 10) {
            setGeers(1);
        } else if (newVelocity >10 && newVelocity <= 20) {
            setGeers(2);
        } else if (newVelocity > 20 & newVelocity <= 30) {
            setGeers(3);
        } else {
            setGeers(4);
        }

        if(newVelocity >0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void setRoadServiceMonths(int roadServiceMonths) {
        this.roadServiceMonths = roadServiceMonths;
    }
}
