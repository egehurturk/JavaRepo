package com.egehurturk;

public class lastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,19,99));
    }

    public static boolean hasSameLastDigit(int no1, int no2, int no3) {
        if (!(isValid(no1) && isValid(no2) && isValid(no3))) {
            return false;
        }

        while (no1 > 0) {
            int lastDigit = no1 % 10;
            while (no2 > 0) {
                int lastDigit2 = no2 % 10;
                while (no3 > 0) {
                    int lastDigit3 = no3 % 10;
                    if ((lastDigit == lastDigit2) || (lastDigit == lastDigit3) || (lastDigit2 == lastDigit3)) {
                        return true;
                    }
                    no3 = no3 / 10;
                }
                no2 = no2 / 10;
            }
            no1 = no1 / 10;
        }
        return false;
    }

    public static boolean isValid(int param) {
        return ((param >= 10) && (param <= 1000));

    }
}