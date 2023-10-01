package com.coreJava.exception.finallyTest;

public class FinallyWithException {

//Java program to demonstrate finally block in java When exception rise and handled by catch
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			// Throw an Arithmetic exception
			System.out.println(34 / 0);
		}
		// catch an Arithmetic exception
		catch (ArithmeticException e) {
			System.out.println("catch : exception handled.");
		}
		// Always execute
		finally {
			System.out.println("finally : i execute always.");
		}
	}
}
