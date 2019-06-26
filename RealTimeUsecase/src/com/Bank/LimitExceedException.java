package com.Bank;

public class LimitExceedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LimitExceedException(String msg)
	{
		super(msg);
	}

}
