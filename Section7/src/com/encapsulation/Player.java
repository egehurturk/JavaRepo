package com.encapsulation;

public class Player {
    public String fullName;
    public int health;
    public String weapons;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }

    }

    public int healthRemaining() {
        return this.health;
    }
}

// NON-ENCAPSULATING CLASS

/*
Drawbacks of public attrs:
    - When you change some code, it will affect everything
    - people can change every attribute

 */