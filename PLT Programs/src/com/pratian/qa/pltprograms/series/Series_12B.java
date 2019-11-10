//12B. Series: 1, -2, 3, -4, 5, -6, …N

package com.pratian.qa.pltprograms.series;

import java.util.Scanner;

public class Series_12B {
	
 public static void main(String args[]) {
	 
	
	
	 int range;
	 int number;
	 System.out.println("Enter the Range: ");
	 Scanner sc= new Scanner(System.in);
	 range= sc.nextInt();
	 System.out.println("Series: ");
	 
	 for(int i=1; i<=range; i++) {
		 
		 number = (i%2==0) ?  -i: i;
		 
		 System.out.print(number +" ");
	 }
	 
	 
 }
}
