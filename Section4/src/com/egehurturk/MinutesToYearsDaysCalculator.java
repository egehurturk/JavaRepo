package com.egehurturk;

public class MinutesToYearsDaysCalculator {
    public static final short HOURS_MINUTES = 60;
    public static final short DAY_HOURS = 24;
    public static final short YEARS_DAYS = 365;

    public static void main(String[] args) {
        printYearsAndDays(-1051200);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int hours = (int) (minutes / HOURS_MINUTES);
        int remainderMinutes =  (int) (minutes % HOURS_MINUTES);

        int days = hours / DAY_HOURS;
        int remainingHours = hours  % DAY_HOURS;

        int years = days / YEARS_DAYS;
        int remainingDays = days % YEARS_DAYS;

        System.out.printf("%d min = %d y and %d d", minutes, years, remainingDays);

    }
}