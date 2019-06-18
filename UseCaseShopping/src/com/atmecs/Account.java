package com.atmecs;

import java.util.Scanner;
import java.util.logging.Logger;

public class Account {
	static Logger log=Logger.getLogger(Account.class.getName());
	 private String name;
	    private long acctNum;
	    private double balance;
	     double interestRate;
	    public Account(long acctNum, String name) {
	        this.acctNum = acctNum;
	        this.name = name;
	        //this.balance = 0;
			//this.interestRate = 0;
			//log.info("Balance: "+balance);
			
	    }
	    public double interestPerYear() {
	        
			return balance * interestRate;
	    }
	    public static void main(String[] args) {
	    	
	    	Scanner sc=new Scanner(System.in);
	    	log.info("Enter account number");
	    	long acctnum=sc.nextLong();
	    	log.info("Enter account holder name");
	    	String nm=sc.next();
	    	Account saving=new Saving(acctnum,nm);
	    	
	    	//log.info("InterestRate: "+saving.interestRate);
		}
		

}
 class Saving extends Account {

    public Saving(long acctNum, String name) {
        super(acctNum, name);
       this.interestRate = 2.0;
       log.info("InterestRate: "+interestRate);
    }
}

 class FixedDeposit extends Saving {

    public FixedDeposit(int acctNum, String name) {
        super(acctNum, name);
        this.interestRate = 4.0;
    }
}