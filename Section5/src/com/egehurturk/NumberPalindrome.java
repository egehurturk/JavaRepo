package com.egehurturk;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int temp = number;

        while (temp > 0) {
            int leastSigFig = temp % 10;
            reverse *= 10;
            reverse += leastSigFig;
            temp = temp /  10;
        }
        return reverse == number;
    }

}