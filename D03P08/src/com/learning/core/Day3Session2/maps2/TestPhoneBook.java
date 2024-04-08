package com.learning.core.Day3Session2.maps2;

import java.util.HashMap;
import java.util.Scanner;

public class TestPhoneBook {
	public static void main(String args[]) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("John", "9988998800");
		hm.put("Henry", "9988776699");
		hm.put("Harry", "9900990088");
		hm.put("Mario", "7788990000");
		hm.put("Anne", "8877990000");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name to search for: ");
		String name = scanner.nextLine();

		String phoneNumber = hm.get(name);

		if (phoneNumber != null) {
			System.out.println("Phone number is " + phoneNumber);
		} else {
			System.out.println("No entry found");
		}

		scanner.close();

	}

}
