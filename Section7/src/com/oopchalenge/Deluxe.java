package com.oopchalenge;

public class Deluxe extends Hamburger{
    private Addition chips;
    private Addition drink;

    public Deluxe(String name, String breadRollType, int basePrice) {
        super(name, breadRollType, basePrice);
        this.chips = new Addition(0, "Chips");
        this.drink = new Addition(0, "Drink");
    }

    /*
    * Overriding the `Hamburger` Base class check
    * Limitation for adding an `Addition` class is used.
    * Referencing to the `super.getAdditionNo()` which returns how many additions are added
    * Checking if that it is 0 because Deluxe burger doesn't have any additions
     */
    @Override
    protected boolean checkAdditions() {
        if (super.getAdditionNo() == 0) {
            return true;
        }
        return false;
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrink() {
        return drink;
    }
}

