package com.Bank;
//This class is used to throw InvalidBankBalanceException
public class InvalidBankBalanceException extends Exception{
	/**
	 * 
	 * @param message
	 * return the message which is given in the withdraw method in both the current account and saving the account.
	 */
	public InvalidBankBalanceException(String message)
	{
		super(message);
	}
	

}
