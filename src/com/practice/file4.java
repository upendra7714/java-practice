package com.practice;

import java.math.BigDecimal;
import java.math.BigInteger;

public class file4 {

	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("8579465775693874567856765654696");
		BigInteger bi2 = new BigInteger("51516461516111213456785665454");
		BigDecimal bd1 = new BigDecimal("85794657756.8756879387696");
		BigDecimal bd2 = new BigDecimal("85794657.876987457569387696");
		System.out.println("BigInteger Operations : ********************");
		System.out.println("Addition = " + bi1.add(bi2));
		System.out.println("Subtraction = " + bi1.subtract(bi2));
		System.out.println("Multiplication = " + bi1.multiply(bi2));
		System.out.println("Division = " + bi1.divide(bi2));
		System.out.println("Modular = " + bi1.mod(bi2));
		System.out.println("BigDecimal Operations : ********************");
		System.out.println("Addition = "+bd1.add(bd2));
		System.out.println("Subtraction = "+bd1.subtract(bd2));
		System.out.println("Multiplication = "+bd1.multiply(bd2));

	}

}
