//19D. Series: 1, 5, 8, 14, 27, 49, … N

//Logic: (1+5+8=14),(5+8+14=27),(8+14+27=49),...

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_19D {

	public static void main(String[] args) {
		
		int range;
		int num1=1;
		int num2=5;
		int num3=8;
		int sum=0;
		
		System.out.println("Enter the Range: ");
		
		Scanner sc= new Scanner(System.in);
		range= sc.nextInt();
		
		System.out.println("Series: ");
		System.out.print(num1 + " " + num2 + " " + num3 + " ");
		
		for(int i=1; sum<range; i++) {
			
			sum=num1+num2+num3;
			System.out.print(sum + " ");
			num1= num2;
			num2=num3;
			num3=sum;
			
		}
	}
}
