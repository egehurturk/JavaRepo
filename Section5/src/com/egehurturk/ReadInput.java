package com.egehurturk;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in "sin"
        System.out.println("enter year of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // for string
        
        int age = 2020 - yearOfBirth;
        System.out.println(age);
        System.out.println(name);

        scanner.close(); // close the scanner for memory allocation

    }
}
