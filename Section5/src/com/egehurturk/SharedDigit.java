package com.egehurturk;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    // write your code here
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        boolean condition = ((numberOne >= 10) && (numberOne <= 99)) && ((numberTwo >= 10) && (numberTwo <= 99));
        if (!condition) {
            return false;
        }
        int num2Buffer = numberTwo;
        int num1Buffer = numberOne;
        int digit1 = 0;
        int digit21 = 0;
        while (numberOne > 0) {
            digit1 = numberOne % 10;
            numberOne = numberOne / 10;
            while (numberTwo > 0) {
                digit21 = numberTwo % 10;
                if (digit1 == digit21) {
                    return true;

                }
                numberTwo = numberTwo / 10;
            }

        }
        return false;
    }
}