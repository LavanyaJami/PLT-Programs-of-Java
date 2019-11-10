/*1. Write a pseudocode to accept principle, rate of interest and time. Calculate
simple interest and display the same  */

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class InterestCalculation {
public static void main(String[] args) {
	double simpleInterest;
//	long principal;
	//float rateOfInterest;
	//float timeInYears;
	
	System.out.println("Interest Calculation:");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Principal amount:");
	long principa1=sc.nextLong();
	System.out.println("Enter the Rate of Interest value:");
	float rateOfInterest=sc.nextFloat();
	System.out.println("Enter the Time in terms of Year:");
	float timeInYears=sc.nextFloat();
	
	//Interest Calculation
	
	simpleInterest=principa1*(+(rateOfInterest*timeInYears));
	
	System.out.println("Interest Value is: "+ simpleInterest);
	
	
	
}
}
