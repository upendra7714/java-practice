package com.practice.operators;

import java.util.Scanner;

public class logical4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yes;
		
		do {
			System.out.println("Enter the value : ");
			int value =sc.nextInt();
			if(value %3==0 && value %5==0) {
				System.out.println("FizzBuzz");
				
			}
			else if(value %3==0) {
				System.out.println("Fizz");
				
			}else if(value%5==0) {
				System.out.println("Buzz");
			}
			else  {
				System.out.println(value);
				
			}
		
			 System.out.println("Enter y to continue or n to stop:");
	            yes = sc.next();
		}while (yes.equalsIgnoreCase("y"));
		sc.close();
		}

	}


