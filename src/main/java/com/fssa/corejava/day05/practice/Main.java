package com.fssa.corejava.day05.practice;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account("K1i6s0h7",88888.55555);
		AxisATM axis = new AxisATM();
		axis.withdraw(acc1,5555.55555d);
		axis.deposit(acc1,32578.55555d);
		axis.getBalance();

		
		Account acc2 = new Account("7h0s6i1K",87162.73721);
		IciciATM icic = new IciciATM();
		icic.withdraw(acc2,5555.55555d);
		icic.deposit(acc2,32578.55555d);
		icic.getBalance();
	}

}