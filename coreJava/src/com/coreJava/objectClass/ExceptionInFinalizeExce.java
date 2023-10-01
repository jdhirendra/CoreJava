package com.coreJava.objectClass;

public class ExceptionInFinalizeExce {

	public static void main(String[] args) {
		ExceptionInFinalizeExce object = new ExceptionInFinalizeExce();
		// Calling finalize method Explicitly.
		//object.finalize();
		object = null;
		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}
	// Here overriding finalize method
	public void finalize() {
		System.out.println("finalize method overridden");
		System.out.println(10 / 0);
		System.out.println("End of finalize method");
	}
}