package com.practice;

public class Student1 {
	int id;
	String name;
	int marks;
	void details() {
		id=121;
		name="upendra";
		marks=99;
	}
	void display() {
		details();
		System.out.println("Student ID :" +id);
		System.out.println("Student Name :" +name);
		System.out.println("Student Marks :" +marks);
	}

	public static void main(String[] args) {
		Student1 std=new Student1();
		std.display();
		
	}

}
