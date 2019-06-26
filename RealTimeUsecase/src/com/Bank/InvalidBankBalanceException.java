package com.Bank;

@SuppressWarnings("serial")
public class InvalidBankBalanceException extends Exception{
	public InvalidBankBalanceException(String message)
	{
		super(message);
	}
	
	
}
