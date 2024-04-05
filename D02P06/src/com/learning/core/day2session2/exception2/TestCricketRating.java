package com.learning.core.day2session2.exception2;

public class TestCricketRating {
	public static void main(String[] args) {

		try {

			CricketRating player1 = new CricketRating("Jagan", 9.5f,9.5f,9.5f);

			player1.display();

		} catch (NotEligibleException e) {

			System.out.println(e.getMessage());

		}

	}

}
