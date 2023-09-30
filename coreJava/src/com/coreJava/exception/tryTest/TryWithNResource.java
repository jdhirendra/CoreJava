package com.coreJava.exception.tryTest;

public class TryWithNResource {

	public static void main(String[] args) {
		// note the order of opening the resources
		try (Demo1 d1 = new Demo1(); Demo2 d2 = new Demo2()) {
			int x = 10 / 0;
			d1.show1();
			d2.show2();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}

//custom resource 1
class Demo1 implements AutoCloseable {
	void show1() {
		System.out.println("inside show1");
	}

	public void close() {
		System.out.println("close from demo1");
	}
}
//custom resource 2
class Demo2 implements AutoCloseable {
	void show2() {
		System.out.println("inside show2");
	}
	
	public void close() {
		System.out.println("close from demo2");
	}
}