package com.learning.core.day2session1.string7;

import java.util.HashSet;

public class TestPattern {
	static boolean check(String pattern, String word) {

		if (pattern.length() != word.length())
			return false;

		int[] ch = new int[128];
		int Len = word.length();

		for (int i = 0; i < Len; i++) {
			if (ch[(int) pattern.charAt(i)] == 0) {
				ch[(int) pattern.charAt(i)] = word.charAt(i);
			} else if (ch[(int) pattern.charAt(i)] != word.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	static void findMatchedWords(HashSet<String> dict, String pattern) {

		int Len = pattern.length();
		String result = " ";
		for (String word : dict) {
			if (check(pattern, word)) {
				result = word + " " + result;
			}
		}
		System.out.print(result);
	}

	// Driver code
	public static void main(String[] args) {
		HashSet<String> dict = new HashSet<String>();
		dict.add("abb");
		dict.add("abc");
		dict.add("xyz");
		dict.add("xyy");

		String pattern = "foo";

		findMatchedWords(dict, pattern);
	}

}
