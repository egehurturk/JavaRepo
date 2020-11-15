package com.interfacechallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10,15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
      //  loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf",20,40 );
        System.out.println(werewolf);
        saveObject(werewolf);
        System.out.println("Strength = "+((Monster) werewolf).getStrenth()); // type conversion

    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String strInput = scanner.nextLine();
                    values.add(index, strInput);
                    index++;
                    break;
            }

        }
        return values;
    }



    public static void saveObject(ISaveable object) {
        for (int i = 0; i < object.write().size(); i++) {
            System.out.printf("Saving %s to storage device \n", object.write().get(i));
        }
    }

    public static void loadObject(ISaveable object) {
        List<String> values = readValues();
        object.read(values);
    }
}
