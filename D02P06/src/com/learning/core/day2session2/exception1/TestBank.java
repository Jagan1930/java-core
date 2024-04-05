package com.learning.core.day2session2.exception1;

public class TestBank {
	public static void main(String[] args) {
		try {
			BankAccount acnt = new BankAccount(1234567, "Jagan", "Current", -1200);
			acnt.getBalance();
		} catch (LowBalanceException e) {
			System.out.println(e.getMessage());
		} catch (NegativeAmountException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
