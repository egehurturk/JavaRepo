package com.egehurturk;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        boolean condition = (end > 0) && (start > 0) && (end >= start);
        if (!condition) {
            return -1;
        }

        int sum = 0;
        for (int i=start; i<=end;i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}