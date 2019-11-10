//12F. Series: 1, 5, 13, 29, 49, 77, … N
//Logic: (Substractions) 1(1*1),(5-1=4(2*2)),(13-5=8(2*2*2)),16,20,28


package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_12F {
	
	

	public static void main(String[] args) {
		
		int range;
		int number = 1;
		
		System.out.println("Enter the Range: ");
		
		Scanner sc= new Scanner(System.in);
		range= sc.nextInt();
		
		for(int i=1; number<range; i++) {
			
			if(i%3==0) {
				continue;
			}
			else {
				System.out.println(number +" ");
				number= number+(4*i);
				
			}
			
			
		}

	}

}
