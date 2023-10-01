package com.coreJava.exception.finallyTest;

//Java program to demonstrate finally block in java When exception does not rise 
public class FinallyWithoutException {

	public static void main(String[] args) {
		// finally block in java When exception does not rise
		try {
			System.out.println("inside try block");
			// Not throw any exception
			System.out.println(34 / 2);
		}
		// Not execute in this case
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		// Always execute
		finally {
			System.out.println("finally : i execute always.");
		}
	}
}
