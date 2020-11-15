package com.egehurturk;

public class DigitSumChallengeTimSolution {
    public static void main(String[] args) {
        int sum = sumDigits(125);
        System.out.println(sum);
        int sum2 = sumDigits(-125);
        System.out.println(sum2);
        int sum3 = sumDigits(4);
        System.out.println(sum3);
        int sum4 = sumDigits(32123);
        System.out.println(sum4);
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5 (Modulo)
        while (number > 0) {
            // extract digits
            int remainFig = number % 10;
            sum += remainFig;
            number = number / 10;
        }
        return sum;
    }
}


/*
first step: extract the least significant digit (125 -> 5)
 */