package com.oopchalenge;

public class Addition {
    private int cost;
    private String name;

    public Addition(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

