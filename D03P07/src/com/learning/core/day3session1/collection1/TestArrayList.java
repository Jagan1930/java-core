package com.learning.core.day3session1.collection1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<>();

		studentNames.add("Jack");
		studentNames.add("Paul");
		studentNames.add("Henry");
		studentNames.add("John");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Name to Search: ");
		String nameToSearch = scanner.nextLine();

		if (studentNames.contains(nameToSearch)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		scanner.close();
	}

}
