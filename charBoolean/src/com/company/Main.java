package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9';
        System.out.println("The char data type only holds one character value, but can hold unicode, '\u00A9' like this: " + myChar);

        boolean myBoolean = true;
        boolean isMale = false;

// Find the Register symbol in Unicode
// Create a char varand assign the register unicode to it
// Display it

        char register = '\u00AE';
        System.out.println("This is the register symbol: " + register);
    }
}
