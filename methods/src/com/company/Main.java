
package com.company;

public class Main {

    public static void main(String[] args) {
        // We use "if" Statements to create a statement to validate certain conditions, and the actions when those conditions are or are not met!
        boolean gameOver = true;
        int score = 50000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore();

        if (gameOver == true) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("This is your first final score: " + finalScore);
        }
    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("This is your actual final score: " + finalScore);
        }
    }
}
