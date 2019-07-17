package com.atmecs.CustomException;

import java.util.logging.Logger;

class SavingAccount implements BankAccount
{
	 Logger log=Logger.getLogger(SavingAccount.class.getName());
    private double balance;
    private double perDayLimit=5000;
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
        else if ( amount > perDayLimit) 
        {
       	 log.info("Reached Limit failure!");
        	 return false;     
        }
        else
        {
            balance -= amount;
            perDayLimit += amount;
            log.info("Successfully withdraw: "+amount);
            log.info("Available Balance  :  "+balance);
        }
		return true;
    }
    
    }
