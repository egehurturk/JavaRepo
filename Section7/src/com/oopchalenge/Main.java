package com.oopchalenge;

public class Main {
    public static void main(String[] args) {
        Addition ad1 = new Addition(10, "Lettuce");
        Addition ad2 = new Addition(8, "Tomato");
        Addition ad3 = new Addition(9, "Carrot");
        Addition ad4 = new Addition(7, "Pickle");
        Addition ad5 = new Addition(13, "Extra beef");
        Addition ad6 = new Addition(12, "Extra cheese");
        Addition ad7 = new Addition(6, "Bacon");

        Hamburger burger = new Hamburger("Chef's Burger", "Defualt", 30);
        System.out.println("Burger's base price before additions is: " + burger.getBasePrice());
        burger.addAddition(ad1);
        burger.addAddition(ad2);
        burger.addAddition(ad3);
        burger.addAddition(ad4);
        System.out.println("Burger's base price after additions is: " + burger.getBasePrice());
        System.out.println("Burger's first addition is: " + burger.getAddition1().getName());
        System.out.println("Burger's second addition is: " + burger.getAddition2().getName());
        System.out.println("Burger's third addition is: " + burger.getAddition3().getName());
        System.out.println("Burger's fourth addition is: " + burger.getAddition4().getName());

        HealthyBurger hb1 = new HealthyBurger("Health Burger", 45);
        System.out.println("Healthy Burger's base price before additions is: " + hb1.getBasePrice());
        hb1.addAddition(ad1);
        hb1.addAddition(ad2);
        hb1.addAddition(ad3);
        hb1.addAddition(ad4);
        hb1.addAddition(ad5);
        hb1.addAddition(ad6);

        System.out.println("Healthy Burger's base price after additions is: " + hb1.getBasePrice());
        System.out.println("Healthy Burger's first addition is: " + hb1.getAddition1().getName());
        System.out.println("Healthy Burger's second addition is: " + hb1.getAddition2().getName());
        System.out.println("Healthy Burger's third addition is: " + hb1.getAddition3().getName());
        System.out.println("Healthy Burger's fourth addition is: " + hb1.getAddition4().getName());
        System.out.println("Healthy Burger's fifth addition is: " + hb1.getAddition5().getName());
        System.out.println("Healthy Burger's sixth addition is: " + hb1.getAddition6().getName());

        // error
        hb1.addAddition(ad7);

        Deluxe deluxe = new Deluxe("Deluxe Burger", "Default", 40);
        System.out.println("Deluxe Burger's base price is: " + deluxe.getBasePrice());
        System.out.println("Deluxe Burger's first addition which is chips is: " + deluxe.getChips().getName());
        System.out.println("Deluxe Burger's first addition's cost which is chips is: " + deluxe.getChips().getCost());
        System.out.println("Deluxe Burger's second addition which is drink is: " + deluxe.getDrink().getName());
        System.out.println("Deluxe Burger's second addition's cost which is drink is: " + deluxe.getDrink().getCost());

        deluxe.addAddition(ad7);

    }
}
