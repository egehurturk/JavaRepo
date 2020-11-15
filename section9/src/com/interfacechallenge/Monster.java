package com.interfacechallenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strenth;

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, ""+this.hitPoints); // a fast way to convert int to String
        values.add(2, ""+this.strenth);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenth = Integer.parseInt(savedValues.get(2));
        }
    }

    public Monster(String name, int hitPoints, int strenth) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenth = strenth;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenth=" + strenth +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrenth() {
        return strenth;
    }
}
