package com.practice.operators;

import java.util.Scanner;

public class operator4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Username = "admin";
		String Password = "1234";
		System.out.println("Enter Username : ");
		String uname=sc.next();
		System.out.println("Enter Password : ");
		String upassword = sc.next();
		if(Username .equals( uname) && Password  .equals(upassword)) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("incorrect details");
		}
	}

}
