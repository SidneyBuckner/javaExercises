package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 10000 + 20000;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        int nextResult = result;

        result = result * 4;
        System.out.println(nextResult + " * 4 = " + result);


        int thirdResult = result;

        result = result / 16;
        System.out.println(thirdResult + " / 16 = " + result);


        int fourthResult = result;

        result = result * 4;
        System.out.println(nextResult + " * 4 = " + result);


        int lastResult = result;

        result = result % 80;
        System.out.println(lastResult + " % 80 = " + result);
        System.out.println("An Incremented result = " + result++);
        System.out.println("A Decremented result = " + result--);
        System.out.println(result+=2);
        System.out.println(result-=2);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("NOOOO ALIENS!! :D");


        int topScores = 250;
        if (topScores != 250)
            System.out.println("you LOOOOSE!! :D");
    }
}
