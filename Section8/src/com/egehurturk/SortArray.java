package com.egehurturk;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        System.out.println("-------------------------");
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number) {
        int[] scopeArray = new int[number];
        for (int i = 0; i < scopeArray.length ; i++) {
            System.out.print("Enter a number: ");
            scopeArray[i] = scanner.nextInt();
        }
        return scopeArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.printf("Element: %d \n", array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//           sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length); // COPY array
        boolean flag= true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    // swap elements
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }


}
