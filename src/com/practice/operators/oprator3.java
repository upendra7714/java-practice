package com.practice.operators;

import java.util.Scanner;

public class oprator3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a Value : ");
		  int a =sc.nextInt();
		  System.out.println("Enter b Value : ");
		  int b =sc.nextInt();
		  System.out.println("Enter c Value : ");
		  int c =sc.nextInt();
		  if(a>b && a>c) {
			  System.out.println(a+" value is larger number");
			  
		  }
		  else if(b>a && b>c) {
			  System.out.println(b+" value is larger number");
			  
		  }
		  else{
			  System.out.println(c+" value is larger number");
		  }

	}

}
