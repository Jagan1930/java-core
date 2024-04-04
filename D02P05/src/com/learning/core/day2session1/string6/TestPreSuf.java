package com.learning.core.day2session1.string6;

import java.util.Scanner;

public class TestPreSuf {
	public static int longestPrefixSuffixLength(String s) {

		int n = s.length();

		int[] lps = new int[n];

		int len = 0;

		int i = 1;

		while (i < n)

		{

			if (s.charAt(i) == s.charAt(len)) {

				len++;

				lps[i] = len;

				i++;

			} else

			{

				if (len != 0) {

					len = lps[len - 1];

				} else {

					lps[i] = 0;

					i++;

				}

			}

		}

		return lps[n - 1];

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int longestPrefixSuffix = longestPrefixSuffixLength(input);

		System.out.println("Result of Prefix and Suffix: " + longestPrefixSuffix);

	}

}
