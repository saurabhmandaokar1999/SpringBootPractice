package com.saurabh.beans;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		System.out.println("Debit Card CTOR");
	}
	
	@Override
	public boolean payBill(double amt) {
		System.out.println("Debit Card paying bill"+" "+ amt);
		return true;
	}
}
