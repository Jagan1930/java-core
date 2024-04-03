package com.learning.core.day1session2.array3;

import java.util.HashMap;

public class FirstRepeatingElement {

	static int findFirstRepeating(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int element = -1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (map.containsKey(arr[i])) {

				element = arr[i];

			} else {

				map.put(arr[i], 1);

			}

		}

		return element;

	}

	public static void main(String[] args) {

		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };

		int element = findFirstRepeating(arr);

		if (element != -1) {

			System.out.println("First repeating element: " + element);

		} else {

			System.out.println("No repeating element");

		}

	}
}
