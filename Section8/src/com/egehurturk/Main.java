package com.egehurturk;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//	    int[]  myIntArray = { 1,2,3,4,5,6,7,8,9,10 }; // 10 elements in int array
//      myIntArray[0] = 45;
//      myIntArray[1] = 476;
//      myIntArray[5] = 50;
//      double[] myDoubleArray = new double[10]; // 10 elements in double array
//      System.out.println(myIntArray[0]);
//      System.out.println(myIntArray[3]);
//
//        int[] anotherArray = new int[25];
//        for (int i = 0; i < anotherArray.length; i++) {
//            anotherArray[i] = i*10;
//        }
//        printArray(anotherArray);

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.printf("Element %d, typed value was %d. \n", i, myIntegers[i]);
        }

        System.out.println("The average is " + returnAverage(myIntegers));

    }

    public static int[] getIntegers(int numbers) {
        System.out.println("Enter " + numbers + " integer values.\r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    
    public static double returnAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / (double)array.length;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
}
