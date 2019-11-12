/*
1
1 2
3 5 8
:
:
N rows
 */


package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_24D {

	public static void main(String[] args) {
		int n;
		int num1=0;
		int num2=1;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n Value: ");
		n= sc.nextInt();
		
		for(int i=1;i<=n; i++) {
			for(int j=1;j<=i;j++) {
				num1= num2;
				num2=sum;
				sum=num1+num2;
				System.out.print(sum + " ");
				
				
				
			}
			System.out.println();
		}

	}

}
