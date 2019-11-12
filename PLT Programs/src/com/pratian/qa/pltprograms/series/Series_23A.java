/*Series:
 			* * * * *
 			* * * * *
 			* * * * *
 			* * * * *
				:
			 N rows */
			 
			 

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_23A {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n Value: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=5; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		

	}

}
