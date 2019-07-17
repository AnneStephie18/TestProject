package com.atmecs.CustomException;

import java.util.logging.Logger;

public class CurrentAccount implements BankAccount 
{
	Logger log=Logger.getLogger(CurrentAccount.class.getName());
    private double balance;
    public boolean Deposit(double amount)
    {
        balance += amount;
        return true;
    }
    public boolean Withdraw(double amount) throws InvalidBankBalanceException
    {
    	
        if (balance < amount)
        {
        	InvalidBankBalanceException obj=new InvalidBankBalanceException("Insufficient balance!");
        	throw obj;
            
        }
        
        else
        {
            balance -= amount;
            log.info("Successfully withdraw: "+amount);
            log.info("Available Balance  :  "+balance);
        }
		return true;
    }

}
