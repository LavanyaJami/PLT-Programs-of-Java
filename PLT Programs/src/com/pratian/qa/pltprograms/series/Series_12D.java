//12D. Series: 1, 4, 7, 12, 23, 42, 77, … N

//Logic: (1+4+7=12), (4+7+12=23), (7+12+23=42),...


package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_12D {

	public static void main(String[] args) {
			
			int range;
			int num1=1;
			int num2=4;
			int num3=7;
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

