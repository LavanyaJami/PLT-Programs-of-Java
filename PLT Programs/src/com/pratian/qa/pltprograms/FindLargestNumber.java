/*6.Write a pseudocode to find the largest and second largest of 3 numbers */

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main (String[] args) {
	int[] num = new int[3];
	System.out.println("Enter the numbers:");
	Scanner sc= new Scanner(System.in);
	for(int i=0; i<3; i++) {
		num[i]= sc.nextInt();	
	}
	
	if(num[0]>num[1]) {
		if(num[0]>num[2]) {
			System.out.println("Largest Number: " +num[0]);
			if(num[1]>num[2]) {
				System.out.println("Second Largest Number: " +num[1]);
			}
			else {
				System.out.println("Second Largest Number: " +num[2]);
			}
			
		}
		else if(num[0]<num[2]) {
			System.out.println("Largest Number: " + num[2]);
			if(num[1]>num[0]) {
				System.out.println("Second Largest Number: " +num[1]);
			}
			else {
				System.out.println("Second Largest Number: " +num[0]);
		}
	}
	}
	else if (num[0]<num[1]) {
		if(num[1]>num[2]) {
			System.out.println("Largest Number: " + num[1]);
			if(num[0]>num[2]) {
				System.out.println("Second Largest Number: " +num[0]);
			}
			else {
				System.out.println("Second Largest Number: " +num[2]);
			}
		
		}
		else if(num[1]<num[2]) {
			System.out.println("Largest Number: " + num[2]);
			if(num[0]>num[1]) {
				System.out.println("Second Largest Number: " +num[0]);
			}
			else {
				System.out.println("Second Largest Number: " +num[1]);
			}
			
		}
	}
	
	
	

	}
	}

