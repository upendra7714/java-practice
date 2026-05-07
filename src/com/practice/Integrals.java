package com.practice;

import java.util.Scanner;

public class Integrals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal :");
		int decimal = sc.nextInt();
		System.out.println("Enter Binary :");
		String binary = sc.next();	
		String binary1 = Integer.toBinaryString(decimal);
		System.out.println("Binary Value :"+binary1);
		int decimal1 = Integer.parseInt(binary, 2);
		System.out.println("Decimal value :"+decimal1);
		sc.close();

	}

}
