package com.learning.core.day1session1.pattern;

import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] args) {
		int i, j, rows;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows to print: ");
		rows = sc.nextInt();
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
