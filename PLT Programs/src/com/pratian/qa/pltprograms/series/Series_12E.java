//12E. Series: 1, 4, 9, 25, 36, 49, 81, 100, … N
//Logic: 1(power 2), 2(Power 2), 3(Power 2), Skip 4 multiple

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_12E {
	
public static void main(String[] args) {
	
	
	int range;
	int number = 0;
	
	System.out.println("Enter the Range: ");
	Scanner sc= new Scanner(System.in);
	range= sc.nextInt();
	
	System.out.println("Series: ");
	
	for(int i=1; number<range; i++) {
		
		//number= (i%4==0) ? continue: i*i; ;
		
		if(i%4==0) {
			continue;
		}
		else {
			number=i*i;
		}
		
		System.out.println(number + " ");
		
		
	}
	
}
}
