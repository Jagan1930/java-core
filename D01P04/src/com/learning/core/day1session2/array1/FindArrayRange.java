package com.learning.core.day1session2.array1;

import java.util.Scanner;

public class FindArrayRange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number (1 to 40): ");

		int num1 = sc.nextInt();

		System.out.print("Enter second number (1 to 40): ");

		int num2 = sc.nextInt();

		int[] array = { 7, 25, 5, 8, 17, 19, 30, 9, 17, 3, 39, 8 };

		boolean foundNum1 = false;

		boolean foundNum2 = false;

		for (int i : array) {

			if (i == num1) {

				foundNum1 = true;

			}

			if (i == num2) {

				foundNum2 = true;

			}

		}

		if (foundNum1 && foundNum2) {

			System.out.println("Its Bingo");

		} else {

			System.out.println("not found");

		}

	}

}
