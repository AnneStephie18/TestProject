package com.atmecs.CustomException;
public class InvalidBankBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidBankBalanceException(String message)
	{
		super(message);
	}
	

}
