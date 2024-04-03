package com.learning.core.day1session1.student;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks: ");
		int marks = sc.nextInt();
		char grade;

		if (marks >= 60) {
			grade = 'A';
		} else if (marks >= 40) {
			grade = 'B';
		} else if (marks >= 35) {
			grade = 'C';
		} else {
			grade = 'F';
		}

		System.out.println(grade + " Grade");
	}

}
