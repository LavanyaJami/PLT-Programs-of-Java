/* 10. Write a pseudocode to find the reverse of a number. Store the reverse value
in a different variable. Display the reverse.*/

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number;
		int i;
		int reverseNumber[] = new int[10];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		number= sc.nextInt();
		for( i= 0;number!=0;i++) {
			reverseNumber[i]= number%10;
			number=number/10;
		}
		
		System.out.println("Reverse Number is: ");
		for(int j=0;j<i;j++) {
			System.out.print(reverseNumber[j]);
		}
		
	}
	

}
