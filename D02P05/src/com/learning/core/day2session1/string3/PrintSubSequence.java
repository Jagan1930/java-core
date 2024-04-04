package com.learning.core.day2session1.string3;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubSequence {
	public static void generateSubsequences(String input, int index, String current, ArrayList<String> subsequences) {
        if (index == input.length()) {
            subsequences.add(current);
            return;
        }
        generateSubsequences(input, index + 1, current + input.charAt(index), subsequences);
 
        generateSubsequences(input, index + 1, current, subsequences);
    }
 
    public static void printSubsequence(String input) {
        ArrayList<String> subsequences = new ArrayList<>();
        generateSubsequences(input, 0, "", subsequences);
    
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
        printSubsequence(input);
    }

}
