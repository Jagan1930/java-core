package com.learning.core.day2session1.string8;

import java.util.Scanner;

public class DistinctStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String result = canBeSplit(input) ? "Yes" : "No";
		;

		System.out.println(result);
	}

	public static boolean canBeSplit(String input) {

		if (input.length() < 4)

			return false;

		for (int i = 1; i < input.length(); i++) {

			for (int j = i + 1; j < input.length(); j++) {

				for (int k = j + 1; k < input.length(); k++) {

					String str1 = input.substring(0, i);

					String str2 = input.substring(i, j);

					String str3 = input.substring(j, k);

					String str4 = input.substring(k);

					if (!str1.equals(str2) && !str1.equals(str3) && !str1.equals(str4) &&

							!str2.equals(str3) && !str2.equals(str4) &&

							!str3.equals(str4)) {

						return true;

					}

				}

			}

		}

		return false;

	}

}
