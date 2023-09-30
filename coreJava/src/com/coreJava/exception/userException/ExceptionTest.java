package com.coreJava.exception.userException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest et = new ExceptionTest();
		et.userExcepMethod(et);
		
//		et.userExcepMethod(this);
		
//		RunTimeUserException rte = new RunTimeUserException("My custom UserException");
//		et.userRunTimeExcepMethod(rte);

	}

	private void userExcepMethod(ExceptionTest et) {
		// TODO Auto-generated method stub
		try {
			et.print();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("in finally");
		}
	}

	private void print() throws UserException {
		// TODO Auto-generated method stub
		throw new UserException("My custom UserException");
	}
	
//	private void userRunTimeExcepMethod(RunTimeUserException rte) {
//		// TODO Auto-generated method stub
//		try {
//			rte.runPrint();
//		} catch (RuntimeException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			System.out.println("in finally");
//		}
//	}
//	
//	private void runPrint() throws UserException {
//		// TODO Auto-generated method stub
//		throw new UserException("My custom UserException");
//	}

}
