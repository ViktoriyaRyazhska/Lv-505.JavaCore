package com.softserve.edu.train10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplRegex {
	public static void main(String[] args) {
//		String pattern = "[a-z]+";
//		String text = "Now is the time";
		//
		//String pattern = "<.*>"; // Invalid Solution
		//String pattern = "<[^>]+>"; // All Tags
		//String pattern = ">[^<]+<"; // All Text
//		String pattern = "<([^>]+)>[^<]+</\\1>";
//		String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
		//
//		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
//		String text = "a.bb.c_c@gmail.com i@i.ua aaaa@i.i";
		//
		//String pattern = "\\Bbb\\B";
//		String pattern = "([a-zA-Z])\\1";
//		String text = "abba bba  abb ccbbca";
		//
		String pattern = "\\d{1,3}(,\\d{3})*\\.\\d{2}";
		String text = "$1,513,513.65 4 item(s) - $1,513.65  text $13.65";
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
		List<String> allText = new ArrayList<>();
		//StringBuilder res = new StringBuilder(text);
		while (m.find()) {
			//System.out.print(text.substring(m.start(), m.end()) + "*");
			//allText.add(text.substring(m.start()+1, m.end()-1).trim());
			allText.add(text.substring(m.start(), m.end()).trim());
			//res.delete(m.start(), m.end());\
			//res.replace(m.start(), m.end(), "00");
		}
		//System.out.println(allText);
		double currency = 0;
		for (String current : allText) {
			System.out.println(current);
			currency = currency + Double.valueOf(current.replace(",", ""));
		}
		//System.out.println("res = " + res);
		System.out.println("currency = " + currency);
		System.out.printf("currency = %.2f", currency);
	}
}
