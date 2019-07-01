package com.Bank;
/**
 * 
 * @author Anne.Sivakumar
 * This class is used to get the details of bank customer 
 *
 */
public class BankCustomer {
	String name;
	Long accountnumber;
	String accounttype;
    /**
     * return as a total of name, account number, account type of the bank customer
     */
	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", accountnumber=" + accountnumber + ", accounttype=" + accounttype + "]";
	}
	//get the name of the customer
	public String getName() {
		return name;
	}
	//set the name of the customer
	public void setName(String name) {
		this.name = name;
	}
	//get the account number of the customer
	public Long getAccountnumber() {
		return accountnumber;
	}
	//set the account number of the customer
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	//get the account type of the customer
	public String getAccounttype() {
		return accounttype;
	}
	//set the account type of the customer
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

}
