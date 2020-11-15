package com.egehurturk;

import java.util.Arrays;
import java.util.Scanner;

public class MInimumElementChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = readIntegers(5);
        int[] minMaxArray = findMinMax(array);
        System.out.println("Maximum element: " + minMaxArray[1]);
        System.out.println("Minimum element: " + minMaxArray[0]);
    }

    public static int[] readIntegers(int number) {
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter a value: \n");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] findMinMax(int[] array) {
        int min = 0;
        int max = 0;
        for (int j : array) {
            if (min == 0 || max == 0) {
                min = j;
                max = j;
            }
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }

        }
        int[] minMaxArray = { min, max };
        return minMaxArray;
    }


}

