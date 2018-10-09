package com.company;

public class Main {

    public static void main(String[] args) {
	// We use "if" Statements to create a statement to validate certain conditions, and the actions when those conditions are or are not met!
        boolean gameOver = true;
        int score = 50000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000){
            System.out.println("Your score is in the range of 5000!");
        } else if (score < 1000){
            System.out.println("Your score is less than 5000!");

        } else {
            System.out.println("You are here, your score is: " + score);
        }

//        if (gameOver == true){
//            int finalScore = score + (levelCompleted + bonus);
//            System.out.println(finalScore);
//        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted + bonus);
            System.out.println(finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true){
            int finalScore = score + (levelCompleted + bonus);
            System.out.println(finalScore);
        }
    }
}
