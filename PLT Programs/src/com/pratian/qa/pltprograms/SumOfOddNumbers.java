/* 9. Write a pseudocode to find the sum of all odd numbers from 1 to N. Accept N. Display
the sum. */

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class SumOfOddNumbers {
 
	public static void main (String[] args) {
		
		
		int n;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value:");
		n= sc.nextInt();
		for(int num=1; num<=n; num++) {
			

			if(num%2!=0) {
				sum=sum+num;
			}
		}
		System.out.println("Sum of Odd Numbers: " + sum);
	}
}
