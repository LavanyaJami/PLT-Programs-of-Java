package com.pratian.qa.pltprograms;

import java.util.Scanner;

public class ReverseOfString {
	
public static void main(String[] args) {
	
	String name;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name: ");
	name= sc.nextLine();
	
	System.out.println("Reverse of the String " +name+ " is: " );
	
	for(int i=name.length()-1; i>=0; i--) {
		
		System.out.print(name.charAt(i));
		
	}
}
}
