package com.atmecs.ExceptionDependency;

import com.atmecs.CustomException.BankAccount;
import com.atmecs.CustomException.CurrentAccount;
import com.atmecs.CustomException.InvalidBankBalanceException;

public class Test {
	public static void main(String[] args) {
		BankAccount obj=new CurrentAccount();
		obj.Deposit(5000);
		
		 
		 try {
		  obj.Withdraw(6000);
		 } 
		
		catch(InvalidBankBalanceException  e)
		{
		 e.printStackTrace();
		}

		
	}
}
