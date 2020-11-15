package com.errorege;

public class WithError {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.printf("Your score was %d", finalscore);
        System.out.println();

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int finalscore2 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.printf("Your score was %d", finalscore);
        System.out.println();

        int score1 = 1500, score2 = 900, score3 = 400, score4 = 50;
        int pos1 = calculateHighScorePosition(score1);
        int pos2 = calculateHighScorePosition(score2);
        int pos3 = calculateHighScorePosition(score3);
        int pos4 = calculateHighScorePosition(score4);

        displayHighScorePosition("Ege", pos1);
        displayHighScorePosition("Cem", pos2);
        displayHighScorePosition("Tim", pos3);
        displayHighScorePosition("Efe", pos4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalscore = 0;
        if (gameOver) {
            finalscore = score + (levelCompleted * bonus);
            finalscore += 2000;
            return finalscore;
        }
        return finalscore;
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.printf("%s managed to get into position %d on the high score table", name, position);
        System.out.println("\n");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position=1;
        }
        else if (score >= 500) {
            position=2;
        }
        else if (score >= 100); {
            position=3; // empty
        }
        return position;
    }
}
