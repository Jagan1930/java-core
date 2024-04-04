package com.learning.core.day2session1.string9;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String replaced = replaceSpaces(input);
		System.out.println(replaced);
	}

	public static String replaceSpaces(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
