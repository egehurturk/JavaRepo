package com.autoboxing;

import java.util.ArrayList;

class IntClass { // wrapper class for int
    private int value;
    public IntClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    public void setValue(int other) {
        this.value = other;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] arry = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<String>(); // string is not primitive
        stringArrayList.add("Tim");

        // ArrayList<int> intArrayList = new ArrayList<int>(); < ERROR: ArraList<> cant get primitive arraylist. >
        ArrayList<IntClass> intList = new ArrayList<IntClass>();
        intList.add(new IntClass(54));
        Integer integer = new Integer(54); // wrapper class [USAGE DEPRECATED]
        Double doubleValue = new Double(12.25); // wrapper class [USAGE DEPRECATED]

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // take a value of primitive int and convert to Integer (autoboxing)
        }
        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("%d --> %d \n", i, intArrayList.get(i).intValue()); // convert Integer wrapper to int primitive (unboxing)
        }

        Integer myIntValue = 56; // autoboxing --> [Integer.valueOf(56)]
        int myInt = myIntValue; // unboxing --> [myIntValue.intValue()]

        ArrayList<Double> doubleArray = new ArrayList<Double>();
        for (double dbl=0.0;dbl<=10.0;dbl+=0.5) {
            doubleArray.add(dbl); // AUTOBOXING // Double.valueOf(dbl)
        }
        for (int i = 0; i < doubleArray.size(); i++) {
            double value = doubleArray.get(i); // UNBOXING // doubleArray.get(i).doubleValue()
            System.out.printf("%d --> %.1f \n", i, value);
        }

    }
}
