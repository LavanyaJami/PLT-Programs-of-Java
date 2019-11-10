/* 17. Write a pseudocode to display the 1st , 2nd , and 4th multiple of 7 which gives the
remainder 1 when divided by 2,3,4,5 and 6*/

package com.pratian.qa.pltprograms;

public class MultiplesOfSevenWithCondition {
	
public static void main(String[] args) {
	
	int i;
	int j;
	int count = 0;
	
	System.out.println("1st, 2nd and 4th Multilples of 7: ");
	
	for( i=1; count<4 ;i++) {
		
		j=i*7;
		
		if(j%2==1 && j%3==1 && j%4==1 && j%5==1 && j%6==1) {
		
			count++;
			if(count!=3) {
			System.out.print(j +" ");
			}
		}
	}
}
	
}
