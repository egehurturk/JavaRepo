package com.egehurturk;


import java.sql.SQLOutput;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Ege", 500);
        System.out.println();
        System.out.printf("New score is %d", newScore);
        int newScore2 = calculateScore(75);
        System.out.println(newScore2);
        calculateScore();
    }

    public static int calculateScore(String name, int score) {
        System.out.printf("Player: %s, Score: %d", name, score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println();
        System.out.printf("Unnamed Player, Score: %d", score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println();
        System.out.printf("No Player, no score");
        return 0;
    }

//    public static void calculateScore() {
//        System.out.println();
//        System.out.printf("No Player, no score");
//    } ERROR

}

/*
Overriding and Overloading are different things
Overloading means creating same method with different parameters
Just changing the return type of a method won't create method overloading (signature).
 */