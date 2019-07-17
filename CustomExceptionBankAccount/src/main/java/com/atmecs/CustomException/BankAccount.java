package com.atmecs.CustomException;

import java.util.logging.Logger;



public interface BankAccount
{
    boolean Deposit(double amount);
    boolean Withdraw(double amount) throws InvalidBankBalanceException;
}
  
 