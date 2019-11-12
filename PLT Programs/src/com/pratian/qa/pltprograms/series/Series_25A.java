/*
1
-4 9
-16 25 -36
:
:
N rows
*/

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_25A {

	public static void main(String[] args) {

		int n;
		int k=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n Value ");
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i;j++) {
				k=k+1;
				if(k%2==0) {
					System.out.print(-k*k + " ");
				}
				else {
					System.out.print(k*k + " ");
				}
	
			}
			System.out.println();
				
			
			}
			
		


	}

}

	