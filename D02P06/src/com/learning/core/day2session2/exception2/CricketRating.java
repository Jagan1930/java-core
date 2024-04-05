package com.learning.core.day2session2.exception2;

public class CricketRating {
	private String playerName;

	private float critic1;

	private float critic2;

	private float critic3;

	private float avgRating;

	private String Coins;

	public CricketRating(String playerName, float critic1) {

		this.playerName = playerName;

		this.critic1 = critic1;

		this.critic2 = critic2;

		calculateAverageRating(critic1, critic2);

		calculateCoins();

	}

	public CricketRating(String playerName, float critic1, float critic2, float critic3) {

		this.playerName = playerName;

		this.critic1 = critic1;

		this.critic2 = critic2;

		this.critic3 = critic3;

		calculateAverageRating(critic1, critic2, critic3);

		calculateCoins();

	}

	public void calculateAverageRating(float critic1, float critic2) {

		this.avgRating = (critic1 + critic2) / 2;

	}

	public void calculateAverageRating(float critic1, float critic2, float critic3) {

		this.avgRating = (critic1 + critic2 + critic3) / 3;

	}

	public String calculateCoins() {

		if (avgRating >= 7)

			Coins = "gold";

		else if (avgRating >= 5 && avgRating < 7)

			Coins = "silver";

		else if (avgRating >= 2 && avgRating < 5)

			Coins = "copper";

		else

			throw new NotEligibleException("Not eligible");

		return Coins;

	}

	public void display() {

		System.out.println("Player Name: " + playerName);

		System.out.println("Average Rating: " + avgRating);

		System.out.println("Coins: " + Coins);

	}

}
