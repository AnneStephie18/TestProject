package com.Bank;

public interface BankAccount {
		double Deposit(double amount);

		boolean Withdraw(double amount) throws InvalidBankBalanceException, LimitExceedException;

	}


