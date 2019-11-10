//19A. Series: 1, -2, 6, -15, 31, -56, … N

//Logic: (2-1=1), (6-2=4), (15-6=9), (31-15=16)....

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_19A {
	
 public static void main(String args[]) {
	 
	 
	 int range;
	 int j=1;
	 
	 System.out.println("Enter the Range: ");
	 Scanner sc = new Scanner(System.in);
	 range= sc.nextInt();
	 
	 System.out.println("Series: ");
	 
	 
	 for(int i=0; j<range; i++) {
		 
		 j=j+(i*i);
		
		if(i%2==0)
		 System.out.print(j +" ");
		else
			System.out.print(-j +" ");
	 }
	 
	
 }
}
