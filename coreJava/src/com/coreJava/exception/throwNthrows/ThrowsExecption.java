package com.coreJava.exception.throwNthrows;

//Java program to demonstrate working of throws
public class ThrowsExecption {

	public static void main(String[] args) {
		try {
			System.out.println("Inside main()>>try. Start");
			fun();
			System.out.println("Inside main()>>try. End");
		} catch (IllegalAccessException e) {
			System.out.println("caught in main.");
		}
		System.out.println("Inside main(). End");
	}

	static void fun() throws IllegalAccessException {
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}
}
