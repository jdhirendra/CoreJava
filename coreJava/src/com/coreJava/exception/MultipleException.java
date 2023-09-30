package com.coreJava.exception;

import java.util.ArrayList;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("One Hundred");

		System.out.println(al.toString());

		try {
			int indexValue = (int) al.get(1);
		}
		// Unreachable catch block for ArrayIndexOutOfBoundsException. It is already
		// handled by the catch block for Exception
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
//		catch (ArrayIndexOutOfBoundsException | ClassCastException e) {
//			e.printStackTrace();
//		}
		// Single catch block can handle more than one type of exception. However, the
		// base (or ancestor) class and subclass (or descendant) exceptions can not be
		// caught in one statement.
//		catch (RuntimeException | ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Exception encountered " + ex);
//		}
		// Always execute
		finally {
			System.out.println("finally : i execute always.");
		}

		System.out.println("After try-catch-finally : End of main method.");
	}

}
