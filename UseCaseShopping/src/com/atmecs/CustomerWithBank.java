package com.atmecs;

import java.util.logging.Logger;

public class CustomerWithBank {
	public static void main(String[] args) {
		BankAccount CurrentAccount=new CurrentAccount();
		CurrentAccount.Deposit(10000);
		CurrentAccount.Withdraw(6000);
		BankAccount SavingAccount =new SavingAccount();
		SavingAccount.Deposit(10000);
		SavingAccount.Withdraw(6000);
		
	}

}
interface BankAccount
{
    boolean Deposit(double amount);
    boolean Withdraw(double amount);
}
 class CurrentAccount implements BankAccount
{
	 Logger log=Logger.getLogger(SavingAccount.class.getName());
    private double balance;
    private double perDayLimit=5000;
    public boolean Deposit(double amount)
    {
        balance += amount;
        return true;
    }
    public boolean Withdraw(double amount)
    {
    	
        if (balance < amount)
        {
            log.info("Insufficient balance!");
            return false;
            
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
     private double balance;
     private double perDayLimit=5000;
     public boolean Deposit(double amount)
     {
         balance += amount;
         return true;
     }
     public boolean Withdraw(double amount)
     {
     	
         if (balance < amount)
         {
             log.info("Insufficient balance!");
             return false;
             
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