package com.Bank;
/**
 * This class implements a bank account and used to process withdraw and deposit for the current account
 */
import java.util.logging.Logger;

public class CurrentAccount  implements BankAccount {
	
		Logger log = Logger.getLogger(CurrentAccount.class.getName());
		private double balance = 10000;
/**
 * get the amount from user and deposit into the current account if the amount is greater than 0 and return the balance amount 
 * otherwise print invalid amount
 */
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
		/**
		 * get the amount from the user and withdraw an amount from the current account if the balance is greater than the amount and return the available balance    
		 * otherwise, throw the InvalidBankBalanceException
		 */
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


