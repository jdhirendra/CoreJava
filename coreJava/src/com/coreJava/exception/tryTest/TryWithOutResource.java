package com.coreJava.exception.tryTest;

import java.io.*;

//import java.util.*;

public class TryWithOutResource {

	public static void main(String[] args) {
		BufferedReader br = null;
		String str = " ";

		System.out.println("Enter the file path");
//		String path = "C:\\myStudy\\Java\\git token.txt";
		br = new BufferedReader(new InputStreamReader(System.in));

		try {
			str = br.readLine();
			String s;
			// file resource
			br = new BufferedReader(new FileReader(str));

			while ((s = br.readLine()) != null) {
			// print all the lines in the text file
			System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// This part was compulsory before Java 7 but with the introduction of
		// try with resource in Java 7 this part is optional now.
		finally {
			try {
				if (br != null)
					// closing the resource in 'finally' block
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
