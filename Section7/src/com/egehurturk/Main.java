package com.egehurturk;

import com.composition.challenge.*;
import com.encapsulation.EnhancedPlayer;
import com.encapsulation.Player;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
	    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

	    PC pc = new PC(theCase, monitor, motherboard);
//	   	pc.powerUp();

		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");

		Ceiling ceiling = new Ceiling(12, 55);

		Bed bed = new Bed("Modern", 4, 3,2,1);
		Lamp lamp = new Lamp("Classic", false, 75);

		Bedroom bedroom = new Bedroom("Eges", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//		bedroom.makeBed();
//		bedroom.getLamp().turnOn();

		Player player = new Player();
		player.fullName = "Tim";
		player.health = 20;
		player.weapons = "Sword";

		int damage = 10;
//		player.loseHealth(damage);
//		System.out.printf("Remaining health is %d", player.healthRemaining());

		EnhancedPlayer player2 = new EnhancedPlayer("Tim", 200, "Sword");
		System.out.println("Initial Health is "+player2.getHealth());


    }
}


// HAS-A Relationship: COMPOSITION
// IS-A Relationship: INHERITANCE