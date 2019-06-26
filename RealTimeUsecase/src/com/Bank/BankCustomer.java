package com.Bank;

public class BankCustomer {
	String name;
	Long accountnumber;
	String accounttype;

	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", accountnumber=" + accountnumber + ", accounttype=" + accounttype + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

}
