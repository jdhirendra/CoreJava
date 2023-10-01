package com.coreJava.objectClass;

public class FinalizeExplicitCall {

	public static void main(String[] args) {
		FinalizeExplicitCall object = new FinalizeExplicitCall();
        // Calling finalize method Explicitly.
        object.finalize();
        object.finalize();
        object = null;
        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }
    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overridden");
    }
}