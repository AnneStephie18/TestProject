package com.Bank;

import java.util.logging.Logger;
/**
 * This class implements a bank account and used to process withdraw and deposit for the saving account
 */
public	class SavingAccount implements BankAccount {
		Logger log = Logger.getLogger(SavingAccount.class.getName());
		private double balance = 10000;
		private double perDayLimit = 5000;
		/**
		 * get the amount from user and deposit into the saving account if the amount is greater than 0 and return the balance amount 
		 * otherwise show the invalid amount
		 */
		public double Deposit(double amount)
		{
			if(amount<=0)
			{
				log.info("Invalid Amount");
			}
		
			else {
			balance += amount;
			log.info("Available Balance  :  " + balance);
			}
			return balance;
		}
		/**
		 * get the amount from the user and withdraw an amount from the saving account if the balance is greater than the amount and return the available balance    
		 * otherwise, throw the InvalidBankBalanceException
		 * Also, check whether the amount should not exceed the per day limit if it exceeds it throws LimitExceedException
		 */
		public boolean Withdraw(double amount) throws InvalidBankBalanceException, LimitExceedException {

			if (balance < amount) {
				InvalidBankBalanceException obj = new InvalidBankBalanceException("Insufficient balance!");
				throw obj;

			} else if (amount > perDayLimit) {
				LimitExceedException ref = new LimitExceedException("Reached Limit failure!");
				throw ref;
			} else {
				balance -= amount;
				perDayLimit += amount;
				log.info("Successfully withdraw: " + amount);
				log.info("Available Balance  :  " + balance);
			}
			return true;
		}

	}


