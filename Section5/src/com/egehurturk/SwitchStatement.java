package com.egehurturk;

public class SwitchStatement {

    public static void main(String[] args) {
        // OLD TYPE
        int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        // NEW TYPE
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:case 4:case 5:
                System.out.println("It was 3 or 4 or 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        // CHALLENGE
        char character = 'a';
        switch (character) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("Found");
                break;

            default:
                System.out.println("Not Found");
                break;

        }

    }
}
