/*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
:
N rows
 */

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_23B {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n Value: ");
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
