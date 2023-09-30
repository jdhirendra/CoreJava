package com.coreJava.exception;

public class ThrowableMethods {

	public static void main(String[] args) {
		System.out.println("Start of main()");
		myPrint();
		System.out.println("End of main()");
	}

	private static void myPrint() {
		System.out.println("Start of myPrint()");
		justPrint();
		System.out.println("End of myPrint()");
	}

	private static void justPrint() {
		System.out.println("Start of justPrint()");
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
			System.out.println("This line will never be print");
		} 
		catch (ArithmeticException ex) {
			System.out.println("ex.toString()-----------------------------");
			System.out.println(ex.toString());
			System.out.println("ex.getMessage()---------------------------");
			System.out.println(ex.getMessage());
			System.out.println("ex.printStackTrace()----------------------");
			ex.printStackTrace();
//			To check finally block.			
//			System.out.println(a / b);
//			
//			System.out.println("This line also will never be print");
		} finally {
			System.out.println("finally : i execute always.");
		}
		System.out.println("End of justPrint()");
	}
}
