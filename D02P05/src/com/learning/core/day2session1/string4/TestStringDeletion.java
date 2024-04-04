package com.learning.core.day2session1.string4;

import java.util.Scanner;

public class TestStringDeletion {
	public static int minDeletions(String X, int i, int j) {

		if (i >= j) {
			return 0;
		}

		if (X.charAt(i) == X.charAt(j)) {
			return minDeletions(X, i + 1, j - 1);
		}

		return 1 + Math.min(minDeletions(X, i, j - 1), minDeletions(X, i + 1, j));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		int n = input.length();

		System.out.print("String number of deletions: " + minDeletions(input, 0, n - 1));
	}

}
