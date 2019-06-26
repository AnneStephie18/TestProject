package com.Bank;

import java.util.Scanner;
import java.util.logging.Logger;

import com.Bank.InvalidBankBalanceException;

public class Test {
	public static double withdr;
	public static double dep;
	public static void main(String[] args) {
		
		
	Logger log=Logger.getLogger(Test.class.getName());
	Scanner sc=new Scanner(System.in);
	log.info("Enter the name of accountholder1");
	String name=sc.next();
	BankAccount1 CurrentAccount=new CurrentAccount1(name);
	log.info("Enter the amount to deposit");
	 dep=sc.nextDouble();
	log.info("Enter the amount to withdraw");
	 withdr=sc.nextDouble();
	CurrentAccount.Deposit(dep);
	
		try {
			try {
				CurrentAccount.Withdraw(withdr);
			} catch (LimitExceedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (InvalidBankBalanceException e) {
			
			e.printStackTrace();
		}
	
	
		log.info("Enter the name of accountholder2");
		String name1=sc.next();
	BankAccount1 SavingAccount =new SavingAccount1();
	log.info("Enter the amount to deposit");
	dep=sc.nextDouble();
	log.info("Enter the amount to withdraw");
	withdr=sc.nextDouble();
	SavingAccount.Deposit(dep);
	try {
		SavingAccount.Withdraw(withdr);
	} 
	catch(InvalidBankBalanceException | LimitExceedException e)
	{
		e.printStackTrace();
	}
	Thread t1=new Thread((Runnable) CurrentAccount);
	Thread t2=new Thread((Runnable) CurrentAccount);
	t1.start();
	t2.start();
}
}


interface BankAccount1
{
    boolean Deposit(double amount);
    boolean Withdraw(double amount) throws InvalidBankBalanceException, LimitExceedException;
}
 class CurrentAccount1 implements BankAccount1,Runnable
{
	 Logger log=Logger.getLogger(SavingAccount.class.getName());
    private double balance=1000;
    private String name;
    public CurrentAccount1(String name)
    {
    	this.name=name;
    }
	@Override
	public void run() 
	{
				for(int i=1;i<=2;i++)
				{
					try {
						Withdraw(Test.withdr);
					} catch (InvalidBankBalanceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
	}
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
        	log.info(Thread.currentThread().getName()+"is going to withdraw  "+amount);
        	try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
            balance -= amount;
            log.info(Thread.currentThread().getName()+"  Successfully withdraw: "+amount);
            log.info("Available Balance  :  "+balance);
        }
		return true;
    }
    
    }
 
 class SavingAccount1 implements BankAccount1
 {
 	 Logger log=Logger.getLogger(SavingAccount.class.getName());
     private double balance;
     private double perDayLimit=5000;
     public boolean Deposit(double amount)
     {
         balance += amount;
         return true;
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


