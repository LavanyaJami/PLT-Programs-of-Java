/* 2. Write a pseudocode to accept two numbers. Display the two numbers. Swap the
two numbers and display them again.*/

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int num1;
		// int num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1 = sc.nextInt();
		System.out.println("Enter number2:");
		int num2 = sc.nextInt();

		System.out.println("Numbers before swapping:");
		System.out.println("Number1: " + num1 + ", Number2: " + num2);
		int temp;
		temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("Numbers after swapping:");
		System.out.println("Number1: " + num1 + ", Number2: " + num2);
		
	}

}
