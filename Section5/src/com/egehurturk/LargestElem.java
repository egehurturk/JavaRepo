package com.egehurturk;

import java.util.Scanner;

class LargestElem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        int number = s.nextInt();
        int[] a = new int[number];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < number; i++)
        {
            a[i] = s.nextInt();
        }
        int largestElem = findLargestElem(a);
        System.out.println(largestElem);
    }

    public static int findLargestElem(int[] array) {

        int temp = 0;
        for (int i=0;i<array.length;i++) {
            if (temp == 0) {
                temp += array[i];
            }
            if (array[i] > temp) {
                temp = array[i];
            }
        }
        return temp;
    }

}

      