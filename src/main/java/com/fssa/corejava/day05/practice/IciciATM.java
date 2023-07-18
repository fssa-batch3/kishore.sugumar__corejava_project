package com.fssa.corejava.day05.practice;

public class IciciATM implements ATM{

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		if(amount > 0) {
		double preAmount = account.getBalance();
		double depAmount = preAmount+amount; 
		 account.setBalance(depAmount);
		 System.out.println("Icic bank deposit: "+account.getBalance());
		 return true;
		}
		return false;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
        if (account.getBalance() < 10000) {
            throw new Exception("Insufficient balance for withdrawal.");
        }else {
        double totalAmount = account.getBalance();
        if(amount < totalAmount) {
        	double widAmount = totalAmount - (amount+10);
        	account.setBalance(widAmount);
   		 System.out.println("Icic bank withdraw: "+account.getBalance());
        	return true;
        }else {
        	return false;
        }
        }
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
