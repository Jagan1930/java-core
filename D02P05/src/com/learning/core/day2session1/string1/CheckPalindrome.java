package com.learning.core.day2session1.string1;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		boolean isPalindrome = checkPalindrome(inputString);
		if (isPalindrome) {
			System.out.println("It is a Palindrome.");
		} else {
			System.out.println("It is not a Palindrome.");
		}

		scanner.close();
	}

	public static boolean checkPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
