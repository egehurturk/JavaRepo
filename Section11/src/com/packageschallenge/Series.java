package com.packageschallenge;

public class Series {
    public static int nsum(int  n) {
        int totalSum = (n * (n+1)) / 2;
        return totalSum;
    }

    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        else {
            return (n * factorial(n-1));
        }

    }

    public static int fibonnaci(int n) {
        if (n <= 1) return n;
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
