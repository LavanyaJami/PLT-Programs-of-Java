//12C. 1, 4, 27, 256, 3125, … N
//1(power 1), 2(power 2), 3(Power 3),4(power 4),5 (Power 5 … N

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_12C {

	public static void main(String[] args) {
		

		
		int range;
		int number =1;
		
		System.out.println("Enter the Range: ");
		Scanner sc= new Scanner(System.in);
		range= sc.nextInt();
		
		System.out.println("Series: ");
		
		for(int i=1; number<range; i++) {
			
			number=i;
			for(int count=1;count<i;count++) {
				number=number*i;
			}
			if(number>range) {
				break;
			}
			System.out.println(number +" ");
		}
		
		

	}

}
