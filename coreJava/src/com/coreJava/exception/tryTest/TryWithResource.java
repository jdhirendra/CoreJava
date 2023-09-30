package com.coreJava.exception.tryTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
//		String str = "";
//		BufferedReader br = null;
//
//		System.out.println("Enter the file path");
//		br = new BufferedReader(new InputStreamReader(System.in));
//
//		try {
//			str = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String str = "C:\\myStudy\\Java\\git token.txt";
		// try with Resource note the syntax difference
		try (BufferedReader b = new BufferedReader(new FileReader(str))) {
			String s;
			while ((s = b.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
