package com.learning.core.day2session2.exception1;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;

	public BankAccount(int accNo, String custName, String accType, float balance)
			throws LowBalanceException, NegativeAmountException {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		if (accType.equals("Saving") && balance > 0 && balance < 1000) {
			throw new LowBalanceException("Low Balance");
		} else if (accType.equals("Current") && balance > 1000 && balance < 5000) {
			throw new LowBalanceException("Low Balance");
		} else if (balance < 0) {
			throw new NegativeAmountException("Negative Amount");
		}
		this.balance = balance;
	}

	public void deposit(float amount) throws NegativeAmountException {
		if (amount < 0) {
			throw new NegativeAmountException("Negative Amount Exception");
		}
		this.balance += amount;
	}

	public float getBalance() throws LowBalanceException {
		if (this.balance > 0 && this.balance < 1000 && accType.equals("Saving")) {
			throw new LowBalanceException("Low Balance Exception");
		} else if (this.balance > 1000 && this.balance < 5000 && accType.equals("Current")) {
			throw new LowBalanceException("Low Balance Exception");
		}
		return this.balance;

	}

}
