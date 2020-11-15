package com.egehurturk;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int sum = sumDigits(125);
        int sum2 = sumDigits(125.90);
        System.out.println(sum);
        System.out.println(sum2);

    }
    public static int sumDigits(int x) {
        if (!(x >= 10)) {
            return -1;
        }

        String number = Integer.toString(x);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int intDigit = Character.getNumericValue(digit);
            sum += intDigit;
        }
        return sum;

    }
    public static int sumDigits(double x) {
        if (!(x >= 10)) {
            return -1;
        }
        String number = Double.toString(x);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (digit == '.') {
                continue;
            }
            int intDigit = Character.getNumericValue(digit);
            sum += intDigit;
        }
        return sum;
    }
}
