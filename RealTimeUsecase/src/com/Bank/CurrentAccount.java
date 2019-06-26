package com.Bank;

import java.util.logging.Logger;

public class CurrentAccount  implements BankAccount {
	
		Logger log = Logger.getLogger(CurrentAccount.class.getName());
		private double balance = 10000;

		public double Deposit(double amount) {
			if(amount<=0)
			{
				log.info("Invalid Amount");
			}
			else
			{
			balance += amount;
			log.info("Available Balance  :  " + balance);
			}
			return balance;
			
		}

		public boolean Withdraw(double amount) throws InvalidBankBalanceException {

			if (balance < amount) {
				InvalidBankBalanceException obj = new InvalidBankBalanceException("Insufficient balance!");
				throw obj;

			}

			else {
				balance -= amount;
				log.info("Successfully withdraw: " + amount);
				log.info("Available Balance  :  " + balance);
			}
			return true;
		}

	}


