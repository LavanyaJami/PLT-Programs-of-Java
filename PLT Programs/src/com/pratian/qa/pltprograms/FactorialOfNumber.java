/*14. Write a pseudocode to find the factorial of a given number. 0! is always 1.
Factorial of a negative number is not possible.*/


package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int number;
		long  factorialValue=1;
		
		
		System.out.println("Enter the Number: ");
		Scanner sc= new Scanner(System.in);
		number = sc.nextInt();
		
		
		if(number==0) {
			System.out.println("Factorial of " + number + " is: 1");
		}
		else if (number<0) {
			System.out.println("Factorial of a negative number is not possible.");
		}
		else {
		for(int i = number; i>0;i--) {
			factorialValue=factorialValue*i;
		}
System.out.println("Factorial of " + number + " is: " + factorialValue);
	}
	}

}
