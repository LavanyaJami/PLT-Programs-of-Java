/*
 
*
* *
* * *
* * * *
:
N rows
 
 */


package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_23D {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value: ");
		n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
