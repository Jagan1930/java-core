package com.learning.core.day1session1.month;

import java.util.Scanner;

public class TestMonth {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");

		int[] inputs = new int[3];

		for (int i = 0; i < 3; i++)

		{

			inputs[i] = sc.nextInt();

		}

		for (int monthNumber : inputs) {

			if (monthNumber >= 1 && monthNumber <= 12) {

				String yearMonth;

				if (monthNumber == 1) {

					yearMonth = "January";

				} else if (monthNumber == 2) {

					yearMonth = "February";

				} else if (monthNumber == 3) {

					yearMonth = "March";

				} else if (monthNumber == 4) {

					yearMonth = "April";

				} else if (monthNumber == 5) {

					yearMonth = "May";

				} else if (monthNumber == 6) {

					yearMonth = "June";

				} else if (monthNumber == 7) {

					yearMonth = "July";

				} else if (monthNumber == 8) {

					yearMonth = "August";

				} else if (monthNumber == 9) {

					yearMonth = "September";

				} else if (monthNumber == 10) {

					yearMonth = "October";

				} else if (monthNumber == 11) {

					yearMonth = "November";

				} else {

					yearMonth = "December";

				}

				System.out.println(yearMonth);

			} else {

				System.out.println("Invalid Input");

			}

		}

	}

}
