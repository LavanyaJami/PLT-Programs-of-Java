/*
1
2 3
4 5 6
7 8 9 10
:
N rows

 */

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_24C {

	public static void main(String[] args) {

		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n Value: ");
		n= sc.nextInt();
		int k=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++ ) {
				k=k+1;
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
