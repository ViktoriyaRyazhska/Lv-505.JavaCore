package com.softserve.edu.train10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplRead {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		try {
			System.out.print("n = ");
			int n = Integer.parseInt(br.readLine());
			System.out.print("k = ");
			int k = Integer.parseInt(br.readLine());
			res = n / k;
		} catch (NumberFormatException | IOException e) {
			System.out.println("NumberFormatException | IOException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
		System.out.println("res = " + res);
	}
}
