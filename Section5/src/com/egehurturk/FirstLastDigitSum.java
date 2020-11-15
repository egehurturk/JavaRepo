package com.egehurturk;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(123123));
    }

    // write your code here
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;

            while (number >= 10) {
                number = number / 10;
            }
            int firstDigit = number % 10;
            sum += firstDigit;
            number = 0;
        }
        return sum;
    }

}