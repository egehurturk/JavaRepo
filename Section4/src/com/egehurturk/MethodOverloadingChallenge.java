package com.egehurturk;

public class MethodOverloadingChallenge {
    public static final double INCHES_TO_CM = 2.54;
    public static final int FEET_TO_INCHES = 12;

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(192);
        System.out.println(centimeters);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) && (inches > 12))) {
            return -1;
        }
        double newInches = feet * FEET_TO_INCHES;
        double centimeters = (newInches * INCHES_TO_CM) + (inches * INCHES_TO_CM);

        System.out.println(feet + "feet, " + inches + "inches = " + centimeters + "cm.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if  ( inches < 0 ) {
           return -1;
        }

        double feet =  Math.round(inches /  FEET_TO_INCHES);
        double remainderInches =  Math.round(inches % FEET_TO_INCHES);
        System.out.println();
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
}


// instructions: https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/4422036#notes
// helpful site: