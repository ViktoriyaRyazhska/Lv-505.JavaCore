package com.softserve.edu.train09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppStr {
	public static void main(String[] args) {
		/*-
		char[] chA = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		String strThird = new String(chA);
		System.out.println(strThird);
		String strFourth = new String(chA, 2, 4); // CDEF
		System.out.println(strFourth);
		//
		String str1 = "Hello ";
		String str2 = "World!";
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		System.out.println(str3 + "  " + str4);
		//
		String str = "I study Java language";
		int n = str.indexOf('J'); // 8
		System.out.println("J n = " + n);
		n = str.indexOf("ava"); // 9
		System.out.println("ava n = " + n);
		//
		// str[8] // Error
		char c = str.charAt(8); // J
		System.out.println("c = " + c);
		//
		String str = "0123456789";
		System.out.println("str = " + str);
		String str2 = str.substring(1, 4);
		System.out.println("str2 = " + str2);
		System.out.println("str = " + str);
		//
		String str = "\t   Tabulated   String    I    study   Java   language\t";
		System.out.println("origin str = " + str);
		String tStr = str.trim();
		System.out.println("trim tStr = " + tStr);
		//
		String rStr = tStr;
		while (rStr.contains("  ")) {
			rStr = rStr.replace("  ", " ");
		}
		System.out.println("replace rStr = " + rStr);
		String uStr = rStr.toUpperCase();
		System.out.println("toUpperCase uStr = " + uStr);
		//
		String a = "aaa";
		String A = "AaA";
		String b = "aaa";
		StringBuilder sb = new StringBuilder("aaa");
		System.out.println("a.equals(A) = " + a.equals(A));
		System.out.println("a.equals(b) = " + a.equals(b));
		System.out.println("a.equalsIgnoreCase(A) = " + a.equalsIgnoreCase(A));
		System.out.println("a.compareTo(A) = " + a.compareTo(A));
		System.out.println("a.compareToIgnoreCase(A) = " + a.compareToIgnoreCase(A));
		System.out.println("a.equals(sb) = " + a.equals(sb));
		System.out.println("a.contentEquals(sb) = " + a.contentEquals(sb));
		//
		int i = 56;
		System.out.println("i = " + i + "   as char = " + (char)i);
		//
		String str = "Java-SE_8";
		String[] arr = str.split("-|_");
		for (String word : arr) {
			System.out.println(word);
		}
		//
		String s1 = "Java"; // new String("Java");
		String s2 = "Java"; // new String("Java");
		String s3 = new String("Java");
		System.out.println("(s1 == s2) = " + (s1 == s2));
		System.out.println("(s1 == s3) = " + (s1 == s3));
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("s1.equals(s3) = " + s1.equals(s3));
		System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) = " + s1.compareTo(s3));
		System.out.println("s1.hashCode() = " + s1.hashCode());
		System.out.println("s2.hashCode() = " + s2.hashCode());
		System.out.println("s3.hashCode() = " + s3.hashCode());
		//
		final double PI = 3.1415926;
		String format = "Math %8s = %8.2f";
		String s = String.format(format, "Pi", PI);
		System.out.println(s);
		System.out.printf(format, "Pi", PI);
		//
		String s1 = new String("Hello");
		String s2 = " And Goodbye";
		StringBuilder sb = new StringBuilder();
		System.out.println("1. sb.capacity() = " + sb.capacity());
		sb.append(s1);
		sb.append(s2);
		System.out.println("2. sb.capacity() = " + sb.capacity());
		String str = sb.toString();
		System.out.println("str = " + str);
		sb.ensureCapacity(5); // Ignore
		sb.setLength(5);
		sb.ensureCapacity(5);
		System.out.println("3. sb.capacity() = " + sb.capacity());
		System.out.println("str = " + sb);
		*/
		String pattern = "[a-z]+";
		String text = "Now is the time";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		// 1.
		if (m.matches()) {
			System.out.println("m.matches() OK");
		}
		m.reset();
		//
		// 2.
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "*");
		}

	}
}