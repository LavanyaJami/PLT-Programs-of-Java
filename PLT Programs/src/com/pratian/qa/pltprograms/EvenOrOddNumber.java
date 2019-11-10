/* 3. Write a pseudocode to accept a number and display whether it is an even or
odd number*/

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= sc.nextInt();
		if(number%2==0) {
			System.out.println(number + " is even number ");
		}
		else {
			System.out.println(number + " is odd number ");
			}
				
				
		}

	}
