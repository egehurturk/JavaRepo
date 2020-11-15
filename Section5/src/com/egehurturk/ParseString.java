package com.egehurturk;

public class ParseString {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("NumberAsString" + numberAsString);
        int number = Integer.parseInt(numberAsString); // wrapper class for int
        System.out.println(number);

        numberAsString += 1;
        number += 1;
        System.out.println(10);
    }
}
