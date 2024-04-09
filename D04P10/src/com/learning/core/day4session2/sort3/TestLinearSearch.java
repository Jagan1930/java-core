package com.learning.core.day4session2.sort3;

import java.util.Scanner;

public class TestLinearSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the elements separated by commas:");
		String input = scanner.nextLine();
		String[] elements = input.split(",");
		int[] array = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			array[i] = Integer.parseInt(elements[i]);
		}

		System.out.println("Enter the element to search:");
		int key = scanner.nextInt();

		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Element is present.");
		} else {
			System.out.println("Element is not present.");
		}

		scanner.close();
	}

}
