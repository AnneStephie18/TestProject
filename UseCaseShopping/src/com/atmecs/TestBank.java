package com.atmecs;
public class TestBank
{
	public static void main(String[] args) {
		Acct account=new Acct();
		AccountHolder accountholder=new AccountHolder(account);
		Thread t1=new Thread(accountholder);
		Thread t2=new Thread(accountholder);
		t1.setName("anne  ");
		t2.setName("stephie  ");
		t1.start();
		t2.start();
	}
}
 class AccountHolder implements Runnable{
    private Acct account;
    public AccountHolder(Acct account)
    {
    	this.account=account;
    }
	@Override
	public void run() 
	{
				for(int i=1;i<=4;i++)
				{
					makeWithdrawel(2000);
					if(account.getBalance()<0)
					{
						System.out.println("withdrawn");
					}
				}
	}
	private synchronized void makeWithdrawel(int withdrawAmount) {
		
		if(account.getBalance()>=withdrawAmount)
		{
			System.out.println(Thread.currentThread().getName()+"is going to withdraw  "+withdrawAmount);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()+" completes the  withdraw of  "+withdrawAmount);
		}
		else
		{
			System.out.println("Not enough  in  account for  "+Thread.currentThread().getName()+" to withdraw  "+account.getBalance());
		}
	}
 }
	class Acct
	{
		int balance=8000;

		public int getBalance() {
			
			return balance;
		}

		public void withdraw(int withdrawAmount) {
			balance=balance-withdrawAmount;
			
		}

		
			
		}
		
	


