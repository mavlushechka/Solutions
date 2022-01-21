package com.mavlushechka.solutions.learning;

import java.util.Objects;

public class NullPointerExceptionComparingStrings {
	
	public static void main(String[] args) {
		String str1 = null;
		String str2 = null;

		/* it throws an NPE
		if (str1.equals("abc")) {
			System.out.println("The same");
		}
		*/

		// no NPE here
		if ("abc".equals(str1)) {
			    System.out.println("The same");
		}

		// no NPE here
		// This approach is recommended in modern Java programming since it is easy for reading and does not throw an NPE.
		if (Objects.equals(str1, str2)) {
			    System.out.println("Strings are the same");
		}
	}
}
