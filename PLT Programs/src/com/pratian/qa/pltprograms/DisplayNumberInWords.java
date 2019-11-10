/* 11. Write a pseudocode to display a number in words.
Ex. 270176
Output: Two Seven Zero One Seven Six*/

package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class DisplayNumberInWords {
	
	public static void main(String args[]) {

	String number;
	int i=0;
	String numberToWord="";
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number: ");
	number= sc.nextLine();
	//System.out.println(number.length());
	for(i=0; i<number.length();i++) {
	//System.out.println(number.charAt(i));
	
		switch(number.charAt(i)) {
		 case '0':  numberToWord= numberToWord + "Zero ";	break;
		 case '1':  numberToWord= numberToWord + "One ";	break;
		 case '2':  numberToWord= numberToWord + "Two ";	break;
		 case '3':  numberToWord= numberToWord + "Three ";	break;
		 case '4':  numberToWord= numberToWord + "Four ";	break;
		 case '5':  numberToWord= numberToWord + "Five ";	break;
		 case '6':  numberToWord= numberToWord + "Six ";	break;
		 case '7':  numberToWord= numberToWord + "Seven ";	break;
		 case '8':  numberToWord= numberToWord + "Eight ";	break;
		 case '9':  numberToWord= numberToWord + "Nine ";	break;
		 default: numberToWord= "Please Check the Number";  break;
		 
	}
	
	
	}
	System.out.println(numberToWord);
	
}

}