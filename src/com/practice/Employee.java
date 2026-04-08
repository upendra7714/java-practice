package com.practice;

public class Employee {
	String Name;
	static double Salary=60000.0;
	static double PF=Salary*0.12;
	static double Allowences=100*30;
	static double NetSalary=(Salary+Allowences)-PF;
	void display() {
		System.out.println("Name :" +Name);
		System.out.println("Basic Salary :"+Salary);
		System.out.println("PF Amount :"+PF);
		System.out.println("Allowences :"+Allowences);
		System.out.println("Total Net Salary :"+NetSalary);
	}

	public static void main(String[] args) {
		Employee e1=new Employee(); 
		e1.Name="Upendra";
		e1.display();
		

	}

}
