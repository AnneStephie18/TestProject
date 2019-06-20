package com.atmecs;

@SuppressWarnings("serial")
public class InvalidBankBalanceException extends Exception{
	public InvalidBankBalanceException(String message)
	{
		super(message);
	}
	
	
}
