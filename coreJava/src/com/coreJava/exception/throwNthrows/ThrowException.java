package com.coreJava.exception.throwNthrows;

public class ThrowException {

	public static void main(String[] args) {
		try {
			System.out.println("main>try Start");
			fun();
			System.out.println("main>try End");
		} catch (NullPointerException e) {
			System.out.println("Caught in main.");
		}
	}

	static void fun() {
		try {
			System.out.println("main>fun>try Start");
			throw new NullPointerException("demo");
//			System.out.println("main>fun>try End");//Not reachable code.
		} catch (NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception. 
			// If not rethrow in main after fun call code will execute.
		}
	}
}
