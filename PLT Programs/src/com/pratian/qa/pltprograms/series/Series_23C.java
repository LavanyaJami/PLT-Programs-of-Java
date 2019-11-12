/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
:
N rows
 */


package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_23C {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		n= sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
