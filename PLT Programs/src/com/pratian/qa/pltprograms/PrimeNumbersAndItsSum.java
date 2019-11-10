/* 13. Write a pseudocode to find the sum of all the prime numbers in the range n to m.
Display each prime number and also the final sum.*/

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class PrimeNumbersAndItsSum {
	
 public static void main(String[] args) {
	 
	 int n;
	 int m;
	 int count;
	 int sum=0;
	 
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter n Value: ");
	 n= sc.nextInt();
	 System.out.println("Enter m Value: ");
	 m=sc.nextInt();
	 System.out.println("Prime Nunbers between " + n + " and " + m + " are: ");
	 
	 for(int i=n; i<m; i++) {
		 count=0;
		 for(int j=1; j<=i;j++) {
			count= i%j==0 ?  count+1 : count;
			 
		 }
		if(count==2) {
			System.out.print(i + " ");
			sum= sum+i;
		}
	 }
	 System.out.println();
	 System.out.println("Sum of the Prime numbers between " + n + " and " + m + " is: " + sum);
 }
}
