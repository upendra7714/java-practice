package com.practice.operators;

import java.util.Scanner;

public class logical5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("---Our Menu---");
			System.out.println("pizza");
			System.out.println("burger");
			System.out.println("drinks");
			System.out.println("Enter your item :");
			String item = sc.next();
			switch (item) {
			case "pizza" ->{
				System.out.println("enter your pizza type veg or nonveg : ");
				String p1 =sc.next();
				switch(p1) {
				case "veg" ->{
					System.out.println("vegtable pizza = 150");
					System.out.println("panneer pizza = 200");
					System.out.println("cheese burger = 250");
				}
				case "nonveg" ->{
					System.out.println("chicken pizza = 200");
					System.out.println("mutton pizza = 300");
					System.out.println("fish pizza = 350");
				}
				
				}

			}
			case "burger" -> {
				System.out.println("enter your burger type veg or nonveg : ");
				String b1 =sc.next();
				switch(b1) {
				case "veg" ->{
					System.out.println("vegtable burger = 150");
					System.out.println("panneer burger = 200");
					System.out.println("cheese burger = 250");
				}
				case "nonveg" ->{
					System.out.println("chicken burger = 200");
					System.out.println("mutton burger = 300");
				}
				
				}

			}
			case "drinks"->{
				System.out.println("enter your drinks type coke or juice : ");
				String d1 =sc.next();
				switch(d1) {
				case "coke" ->{
					System.out.println("Coke = 80");
					System.out.println("Thumsup = 80");
					System.out.println("Sprite = 80");
				}
				case "juice" ->{
					System.out.println("oreo milkshake = 120");
					System.out.println("Avacoda = 100");
				}
				
				}

			}
			default ->{
				System.out.println("Entered item is not available");
			}
			}
			
			System.out.println("Do you want to continue? yes/no");
			choice = sc.next();
		}while (choice.equalsIgnoreCase("yes"));

			System.out.println("Thank You!");

}
}
