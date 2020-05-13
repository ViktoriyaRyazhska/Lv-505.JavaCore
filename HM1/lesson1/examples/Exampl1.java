package lesson1.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exampl1 {
 public static void main(String []args) throws IOException {
	 BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

	 	System.out.println("a=");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b=");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("a+b=" + (a+b));
		System.out.println("a-b=" + (a-b));
		System.out.println("a*b=" + (a*b));
		if(b!=0) {
			System.out.println("a/b=" + (a/b));
		} else {
			System.out.println("a = 0");
		}
 }
}
