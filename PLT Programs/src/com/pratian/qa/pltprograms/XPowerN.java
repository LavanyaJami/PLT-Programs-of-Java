/* 20. Write a pseudocode to find Xn (x to the power of n). Accept X and n. Display the
result.*/


package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class XPowerN {

	public static void main(String[] args) {
		int result;
		int n;
		int x;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x Value: ");
		result= sc.nextInt();
		System.out.println("Enter n Value: ");
		n= sc.nextInt();
		x=result;
		
		for(int i=1; i<n; i++) {
			result= result*x;
			
		}
		System.out.println(x + " to the Power " + n + " is: " + result);
		

	}

}
