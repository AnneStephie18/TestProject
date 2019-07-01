package com.Bank;
//This class is used to throw LimitExceedException
public class LimitExceedException extends Exception{
/**
 * 
 * @param msg
 * return the message which is given in the withdraw method in the saving  account.
 */
	public LimitExceedException(String msg)
	{
		super(msg);
	}


}
