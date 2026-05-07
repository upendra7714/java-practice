package com.practice.operators;

import java.util.Scanner;

public class logical1 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		System.out.println("Enter the operator : ");
		String operator =sc.next();
		if(operator .equals("+")) {
			System.out.println("Addition of Two Values : "+(a+b));
		}
		else if(operator .equals("-")) {
			System.out.println("Subtraction of Two Values : "+(a-b));
		}
		else if(operator .equals("*")) {
			System.out.println("Multiplication of Two Values : "+(a*b));
		}
		else if(operator .equals("/")) {
			System.out.println("Division of Two Values : "+(a/b));
		}
		else if(operator .equals("%")) {
			System.out.println("Modulas of Two Values : "+(a%b));
		}
		else {
			System.out.println("----Operator is invalid----");
		}
	}

}
