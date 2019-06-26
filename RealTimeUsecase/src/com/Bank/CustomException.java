package com.Bank;

import java.util.Scanner;
import java.util.logging.Logger;

import com.Bank.InvalidBankBalanceException;

public class CustomException {
	public static void main(String[] args) {
		double withdr, dep;
		Logger log = Logger.getLogger(CustomException.class.getName());
		Scanner sc = new Scanner(System.in);
		int ch;BankCustomer bankcustomer=new BankCustomer();
		BankAccount CurrentAccount = new CurrentAccount();
		BankAccount SavingAccount = new SavingAccount();
		log.info("1.Enter customer details");
		log.info("2.Deposit in CurrentAccount");
		log.info("3.Deposit in SavingAccount");
		log.info("4.Withdraw in CurrentAccount");
		log.info("5.Withdraw in SavingAccount");
		log.info("Enter the Choice");

		do {
			ch = sc.nextInt();
			switch (ch) {
			case 1: 
				log.info("Enter your Name: ");
			String name = sc.next();bankcustomer.setName(name);
			log.info("Enter Account Number: ");
			long acctnum = sc.nextLong();bankcustomer.setAccountnumber(acctnum);
			log.info("Enter Account Type: ");
			String accttype = sc.next();bankcustomer.setAccounttype(accttype);
			log.info(bankcustomer.getName()+bankcustomer.getAccountnumber()+bankcustomer.getAccounttype());
			break;
			case 2:
				log.info("1.Deposit in CurrentAccount");
				log.info("Enter the amount to deposit");
				dep = sc.nextDouble();
				CurrentAccount.Deposit(dep);
                break;
			
			case 3:log.info("1.Deposit in SavingAccount");
			log.info("Enter the amount to deposit");
			dep = sc.nextDouble();
			SavingAccount.Deposit(dep);
			break;
			case 4:
				log.info("2.Withdraw in CurrentAccount");
				log.info("Enter the amount to withdraw");
				withdr = sc.nextDouble();
				

					try {
						try {
							CurrentAccount.Withdraw(withdr);
						} catch (LimitExceedException e) {
							e.printStackTrace();
						}
					} 
				 catch (InvalidBankBalanceException e) {
					e.printStackTrace();
				}break;
			case 5:
				log.info("2.Withdraw in SavingAccount");
				log.info("Enter the amount to withdraw");
				withdr = sc.nextDouble();
				try {
					SavingAccount.Withdraw(withdr);
				} catch (InvalidBankBalanceException | LimitExceedException e) {
					e.printStackTrace();
				}
			
			}
		}while (ch<=5);
		{
			log.info("No such option");
		}
		
	}
	}



	
	
