package com.company;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5/3;
	float myFloatValue = 5f/3f;
	double myDoubleValue =5.0 / 3.0;

	System.out.println("The integer is valued at: " + myIntValue);
	System.out.println("The double is valued at: " + myDoubleValue);
	System.out.println("The float is valued at: " + myFloatValue);

	//convert a given number of pounds to kilos
    //create a var to store the number of pounds
    //calculate the number of kilos from the pounds given and store in a variable
    //Print out the result

    double pounds = 58;
    double kilo = pounds * 0.45359237;
        System.out.println("The amount of kilos is: " + kilo);

    }
}
