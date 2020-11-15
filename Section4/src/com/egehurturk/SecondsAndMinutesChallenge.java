package com.egehurturk;

public class SecondsAndMinutesChallenge {
    private static final String INVALID_DATA_TYPE = "Invalid Value";
    private static final byte HOURS_TO_MINUTES = 60;
    private static final byte MINUTES_TO_SECONDS = 60;

    public static void main(String[] args) {
        String currentTime = getDurationString(65, 45);
        String currentTime2 = getDurationString(3945);
        System.out.println("Current time is " + currentTime + "\n" + "Current Time is " + currentTime2);
    }

    public static String getDurationString(int minutes, int seconds) {
        // minutes >= 0, 0≤seconds≤59
        if (!(minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            return INVALID_DATA_TYPE;
        }

        int hours = 0;
        int remainderMinutes = 0;
        int newMinutes = minutes;
        int remainderSeconds = seconds;

        if (seconds > 60) {
             newMinutes = seconds / MINUTES_TO_SECONDS;
             remainderSeconds = seconds % MINUTES_TO_SECONDS;
        }
        if (newMinutes > 60) {
            hours = newMinutes / HOURS_TO_MINUTES;
            remainderMinutes = newMinutes % HOURS_TO_MINUTES;
        }
        return hours + "h " + remainderMinutes + "m " + remainderSeconds + "s";

    }

    public static String getDurationString(int seconds) {
        if (!(seconds >= 0)) {
            return "Invalid Value";
        }

        int minutes = 0;
        int remainderSeconds = seconds;
        if (seconds > 60) {
            minutes = seconds / MINUTES_TO_SECONDS;
            remainderSeconds = seconds % MINUTES_TO_SECONDS;
        }
        return getDurationString(minutes, seconds);
    }
}
