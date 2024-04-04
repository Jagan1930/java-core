package com.learning.core.day2session1.string5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestStringCharcter {
	public static boolean canFormCircle(String[] words) {

		if (words == null || words.length == 0) {

			return false;

		}

		Map<Character, List<String>> graph = new HashMap<>();

		for (String word : words) {

			char startChar = word.charAt(0);

			char endChar = word.charAt(word.length() - 1);

			graph.putIfAbsent(startChar, new ArrayList<>());

			graph.get(startChar).add(word);

		}

		Set<String> visited = new HashSet<>();

		return dfs(graph, words[0].charAt(0), words[0].charAt(0), visited, words.length);

	}

	private static boolean dfs(Map<Character, List<String>> graph, char start, char current, Set<String> visited,
			int totalWords) {

		if (visited.size() == totalWords) {

			// Visited all words

			return start == current;

		}

		if (!graph.containsKey(current)) {

			return false;

		}

		for (String word : graph.get(current)) {

			if (!visited.contains(word)) {

				visited.add(word);

				if (dfs(graph, start, word.charAt(word.length() - 1), visited, totalWords)) {

					return true;

				}

				visited.remove(word);

			}

		}

		return false;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		String[] words = new String[n];

		for (int i = 0; i < n; i++) {

			words[i] = scanner.next();

		}

		scanner.close();

		if (canFormCircle(words)) {

			System.out.println("Yes");

			for (String word : words) {

				System.out.print(word + " ");

			}

		} else {

			System.out.println("No");

		}

	}

}
