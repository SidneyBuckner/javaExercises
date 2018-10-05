package com.company;

public class Main {

    public static void main(String[] args) {

        //int myMinvalue = -214783648;
        //int myMaxvalue = 214783648;
        //int myTotal = (myMinvalue/2);
        //System.out.println("myTotal = " + myTotal);

        //byte myFirstByte = -128;
        //byte myNewbyteValue = (byte)(myFirstByte/2);
        //System.out.println("myNewbyteValue = " + myNewbyteValue);

        //short myFirstShort = -32768;
        //short myNewShortValue = (short) (myFirstShort/2);
        //System.out.println("myShortValue = " + myNewShortValue);

        //long myFirstLong = 100L;
        //long myNewLongValue = (long) (myFirstLong/2);
        //System.out.println("myNewLongValue = " + myNewLongValue);

    //Create a byte, short and int var with any value accepted in the space. Create a variable Long equal to 50000 plus 10 times the sum of the short, int and byte values
        byte byteValue = 14;
        short shortValue = 2529;
        int intValue = 234_889_000;
        long longValue = (long) (50000L + 10L * (byteValue + shortValue + intValue));

        System.out.println(longValue);


    }
}
