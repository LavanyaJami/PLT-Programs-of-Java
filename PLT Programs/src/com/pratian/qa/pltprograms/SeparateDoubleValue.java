/* 4. Write a pseudocode to accept a double value. Separate the whole value from the
fractional value and store them in two variables. Display the same.*/

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class SeparateDoubleValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wholeNumber;
		float decimalNumber;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		double number=sc.nextDouble();
				wholeNumber=(int)number;
				decimalNumber= (float) (number-wholeNumber);
		System.out.println("Whole number: "+ wholeNumber);
		System.out.println("Decimal number: "+ decimalNumber);
		
		
		
				
;
		}

}
