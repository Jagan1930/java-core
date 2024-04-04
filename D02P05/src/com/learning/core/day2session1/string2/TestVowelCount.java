package com.learning.core.day2session1.string2;

import java.util.Scanner;

public class TestVowelCount {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        int vowelCount = countLastNVowels(input, n);

        if (vowelCount == -1) {
            System.out.println("Mismatch in Vowel count");
        } else {
            System.out.println("Last " + n + " vowels count: " + vowelCount);
        }
    }

    public static int countLastNVowels(String str, int n) {
        int vowelCount = 0;
        int length = str.length();
        int lastIndex = length - 1;

        for (int i = lastIndex; i >= 0 && n > 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isVowel(ch)) {
                vowelCount++;
                n--;
            }
        }

        if (n > 0) {
            return -1;
        }

        return vowelCount;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
