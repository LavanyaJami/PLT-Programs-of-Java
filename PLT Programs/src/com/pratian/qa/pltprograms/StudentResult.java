/* 5. Write a pseudocode to accept a student’s name and scores in three subject. Display the
average and total. Display whether the student has secured 1st, 2nd, pass class or has
failed. 1st class is for a score of 60 and above, 2nd is for a score of 50 and above, while
pass class is for a score of 35 and above. If the score is less than 35, then the student
fails. */

package com.pratian.qa.pltprograms;

import java.util.Scanner;

//import com.unox.entities.Review;

public class StudentResult {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of subjects:");
		int countOfSubjects = sc.nextInt();
		int[] marks = new int[countOfSubjects];
		int sum = 0;
		System.out.println("Enter Student Name:");
		String studentName = sc.nextLine();
		System.out.println("Enter the marks for Subjects:");
		for (int i = 0; i < countOfSubjects; i++) {
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}
		System.out.println("Total Marks: " + sum);
		int average = sum / countOfSubjects;
		System.out.println("Average: " + average);
		System.out.println(studentName);
		if (average >= 60) {
			System.out.println("First Class");
		} else if (average >= 50 && average < 60) {
			System.out.println("Second Class");
		} else if (average >= 35 && average < 50) {
			System.out.println("Pass Class");

		} else if (average >= 0 && average < 35) {
			System.out.println("Failed");
		} else {
			System.out.println("Check the average value");
		}
	}
}
