package topic5;

import java.util.Scanner;

public class Numbers3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Put on the value");

		int[] intNum = new int[5];
		int prod = 1; // prod of first numbers;

		boolean firstNegative = true;

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = input.nextInt();
			if (intNum[i] < 0)
				firstNegative = false;
			if ((intNum[i] > 0) && firstNegative != false)
				prod = prod * intNum[i];
		}

		System.out.println("Prod of first positive number = " + prod);

		int countPositiveNum = 0;
		int posOfPositive = 0;

		int minimum = intNum[0];
		int posOfMinimum = 0;

		for (int i = 0; i < intNum.length; i++) {
			
			if (intNum[i] > 0)
				countPositiveNum += 1; // find position of positive number
			
			if (countPositiveNum == 2)
				posOfPositive = i + 1;

			if (intNum[i] < minimum) // find minimum and it position
			{
				minimum = intNum[i];
				posOfMinimum = i + 1;
			}
		}
		if (countPositiveNum <= 1) {
			System.out.println("There are not exist second positive element");
		} // show message if not exist 2 positive element

		System.out.println("Position of second positive number: " + posOfPositive);
		System.out.println("Minimum element = " + minimum + " Position of minimum element : " + posOfMinimum);

	}

}
