package com.practice.constructors;

class Vehicle {
	Vehicle(String brand) {
		System.out.println("Brand: " + brand);
	}
}

class Car extends Vehicle {
	Car(String brand, int price) {
		super(brand);
		System.out.println("Price: " + price);
	}
}

class ElectricCar extends Car {
	ElectricCar(String brand, int price, int battery) {
		super(brand, price);
		System.out.println("Battery: " + battery);
	}
}

public class Demo {

	public static void main(String[] args) {
		ElectricCar e = new ElectricCar("Tesla",500000,80);
		ElectricCar e1 = new ElectricCar("BMW",400000,85);

	}

}
