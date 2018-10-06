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
    }
}
