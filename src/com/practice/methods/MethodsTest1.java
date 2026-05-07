package com.practice.methods;

public class MethodsTest1 {
	int integer() {
		return 10;
	}
	String name() {
		return "upendra";
	}
	float fnumber() {
		return 776484;
	}
	long lnumber() {
		return 4567834567l;
	}
	double dnumber() {
		return 56745.456;
	}
	boolean bool() {
		return true;
	}
	void show() {
		System.out.println("Integer method return :"+integer());
		System.out.println("String method return :"+name());
		System.out.println("Float method return :"+fnumber());
		System.out.println("Long method return :"+lnumber());
		System.out.println("Double method return :"+dnumber());
		System.out.println("Boolean method return :"+bool());
		
	}

	public static void main(String[] args) {
		MethodsTest1 t1=new MethodsTest1();
		t1.show();

	}

}
