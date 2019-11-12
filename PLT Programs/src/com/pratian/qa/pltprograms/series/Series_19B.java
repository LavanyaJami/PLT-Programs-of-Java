//19B. Series: 1, 1, 2, 3, 5, 8, 13, … N

//Logic: (1+1=2), (1+2=3),(2+3=5),(3+5=8),...


package com.pratian.qa.pltprograms.series;



import java.util.Scanner;

public class Series_19B {

	public static void main(String[] args) {
		
		int range;
		int i;
		int sum=0;
		int num1=0;
		int num2=1;
		
		
		System.out.println("Enter the Range: ");
		Scanner sc= new Scanner(System.in);
		range= sc.nextInt();
		
		System.out.println("Series: ");
		for(i=1;sum<range; i++) {
			
			
			num1=num2;
			num2=sum;
			sum= num1+num2;
			System.out.print(sum +  " ");
			
		}
		
		
	}
}
