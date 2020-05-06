package lesson1.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
	public static void main(String []args) throws IOException {
		 BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
		 double c1, c2, c3;
		 double t1, t2, t3;
		 double allCalls, firstCall, secondCall, thirdCall;
		System.out.println("Enter the price for the first country");
		c1= Double.parseDouble(br.readLine());
		System.out.println("Enter the price for the second country");
		c2= Double.parseDouble(br.readLine());
		System.out.println("Enter the price for the third country");
		c3= Double.parseDouble(br.readLine());
		
		System.out.println("How long did the first call last?");
		t1= Double.parseDouble(br.readLine());
		System.out.println("How long did the second call last?");
		t2= Double.parseDouble(br.readLine());
		System.out.println("How long did the third call last?");
		t3= Double.parseDouble(br.readLine());
		
		firstCall = t1 * c1;
		secondCall = t2 * c2;
		thirdCall = t3 * c3;
		allCalls = firstCall + secondCall + thirdCall;
		
		System.out.println("The cost of the first call is " + firstCall);
		System.out.println("The cost of the second call is " + secondCall);
		System.out.println("The cost of the third call is " + thirdCall);
		System.out.println("The total cost for calls is " + allCalls);
		
		
	}
}
