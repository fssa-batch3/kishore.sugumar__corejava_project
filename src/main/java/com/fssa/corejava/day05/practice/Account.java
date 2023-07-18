package com.fssa.corejava.day05.practice;

public class Account {

	String accNo;
	double balance;
	
	public Account(String accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
