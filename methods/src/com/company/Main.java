
package com.company;

public class Main {

    public static void main(String[] args) {
        // We use "if" Statements to create a statement to validate certain conditions, and the actions when those conditions are or are not met!
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("This is your actual final score: " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        since the variables below are already defined in the 'main' method and are parameters in the 'calculateScore' method, theres no need for them to be defined here in the code block
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("This is your first final score: " + finalScore);
        }
    }
}
