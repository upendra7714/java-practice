package com.practice;



public class Student {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalized method called");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1);
		Student s2 = new Student();
	
		System.out.println(s2);
		Student s3 = new Student();
		System.out.println(s3);
		s1=s2;
		s2=null;
		s3=s1;
		
		System.gc();

	}

}
