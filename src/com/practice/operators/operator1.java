package com.practice.operators;

public class operator1 {
	int a=10;
	int b=20;
	int add() {
		int c=a+b;
		return c;
	}
	int sub() {
		int c1=a-b;
		return c1;
	}
	int mul() {
		int c2=a*b;
		return c2;
	}
	int div() {
		int c3=a/b;
		return c3;
	}
	int mod() {
		int c4=a%b;
		return c4;
	}

	public static void main(String[] args) {
		operator1 o=new operator1();
		int c=o.add();
		int c1=o.sub();
		int c2=o.mul();
		int c3=o.div();
		int c4=o.mod();
		System.out.println("Addition : " +c);
		System.out.println("Subtraction : " +c1);
		System.out.println("Multiplication : " +c2);
		System.out.println("Division : " +c3);
		System.out.println("Modulas : " +c4);
		

	}

}
