//12A. Series: 4,16,36,64...N
//Logic: 2*2, 4*4, 6*6, 8*8

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_12A {

	public static void main(String args[]) {
		
		
		
		int range;
		int value = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range: ");
		range= sc.nextInt();
		
		System.out.println("Series: ");
		
		for(int i=2; value<range; i=i+2) {
			value= i*i;
			System.out.print(value+ " ");
			
		}
	}
}
