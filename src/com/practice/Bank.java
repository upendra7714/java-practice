package com.practice;

public class Bank {
	static int id=120;
	String name;
	double balance;
	{
		id++;
	}
	void display() {
		System.out.println("Account No : "+id);
		System.out.println("Account Holder : "+name);
		System.out.println("Account Balance : "+balance);
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name="upendra";
		b1.balance=490000.56;
		b1.display();
		Bank b2 = new Bank();
		b2.name="ram";
		b2.balance=700000.56;
		b2.display();
		

	}

}
