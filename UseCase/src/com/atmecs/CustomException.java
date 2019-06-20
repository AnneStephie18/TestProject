package com.atmecs;

import java.util.Scanner;
import java.util.logging.Logger;


import com.atmecs.InvalidBankBalanceException;



public class CustomException {
	public static void main(String[] args) {
		double withdr, dep;
		Logger log=Logger.getLogger(CustomException.class.getName());
		Scanner sc=new Scanner(System.in);
		log.info("Enter the name of accountholder");
		String name=sc.next();
		BankAccount CurrentAccount=new CurrentAccount();
		BankAccount SavingAccount =new SavingAccount();
		log.info("Enter the Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: log.info("1.Deposit");
		log.info("Enter the amount to deposit");
		 dep=sc.nextDouble();
		 
		 CurrentAccount.Deposit(dep);
		 SavingAccount.Deposit(dep);
		case 2: log.info("2.Withdraw");
		log.info("Enter the amount to withdraw");
		 withdr=sc.nextDouble();
		 try {
				
				try {
					CurrentAccount.Withdraw(withdr);
				} catch (LimitExceedException e) {
					
					e.printStackTrace();
				}
			}
			catch(InvalidBankBalanceException  e)
			{
				e.printStackTrace();
			}
		 try {
				SavingAccount.Withdraw(withdr);
			} 
			catch(InvalidBankBalanceException | LimitExceedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
interface BankAccount
{
    double Deposit(double amount);
    boolean Withdraw(double amount) throws InvalidBankBalanceException, LimitExceedException;
}
 class CurrentAccount implements BankAccount
{
	 Logger log=Logger.getLogger(CurrentAccount.class.getName());
    private double balance=10000;
    public double Deposit(double amount)
    {
        balance += amount;
        log.info("Available Balance  :  "+balance);
        return balance;
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
 
 class SavingAccount implements BankAccount
 {
 	 Logger log=Logger.getLogger(SavingAccount.class.getName());
     private double balance=10000;
     private double perDayLimit=5000;
     public double Deposit(double amount)
     {
         balance += amount;
         log.info("Available Balance  :  "+balance);
         return balance;
     }
     public boolean Withdraw(double amount) throws InvalidBankBalanceException,LimitExceedException
     {
     	
    	 if (balance < amount)
         {
         	InvalidBankBalanceException obj=new InvalidBankBalanceException("Insufficient balance!");
         	throw obj;
             
         }
         else if ( amount > perDayLimit) 
         {
        	 LimitExceedException ref=new LimitExceedException("Reached Limit failure!");   
        	 throw ref;
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
 