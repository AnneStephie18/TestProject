package com.Bank;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
//process deposit and withdraw method with handling exception 
public interface BankAccount {
		double Deposit(double amount);

		boolean Withdraw(double amount) throws InvalidBankBalanceException, LimitExceedException;

	}


