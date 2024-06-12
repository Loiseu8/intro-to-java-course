 package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

    private double interestRate;

//constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
    }  
   public void applyInterest() {
    deposit(getBalance() * interestRate);
  }

  public double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(double interestRate) {
    if (interestRate >= 0) {
    this.interestRate = interestRate;
    }
  }
}
 