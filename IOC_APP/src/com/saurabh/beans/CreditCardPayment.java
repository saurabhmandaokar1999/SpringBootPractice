package com.saurabh.beans;

public class CreditCardPayment implements IPayment{

	public CreditCardPayment() {
		System.out.println("Credit Card Payemnt CTOR");
	}
	
	@Override
	public boolean payBill(double amt) {
		System.out.println("Credit Card paying bill" + " " + amt);
		return true	;
	}

}
