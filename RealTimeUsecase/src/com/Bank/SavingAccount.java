package com.Bank;

import java.util.logging.Logger;

public	class SavingAccount implements BankAccount {
		Logger log = Logger.getLogger(SavingAccount.class.getName());
		private double balance = 10000;
		private double perDayLimit = 5000;

		public double Deposit(double amount) {
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


