package lesson5.homeWork;

import java.util.Scanner;

public class task123 {

	public static void main(String[] args) {
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int nums[] = new int[10];
		boolean positiv = true;
		int i;
		int sum = 0;
		double prod = 1;
		int[] newInt = new int[5];
		int indexmin = 0;
		int min = 0;
		byte secpos = 0;
		Scanner sc = new Scanner(System.in);
		// task1
		System.out.println("Task 1");
		System.out.print("Enter the month number ");
		i = sc.nextInt();
		if (i > 0 && i < 13) {
			System.out.println(month[i - 1] + " days");
		} else {
			System.out.println("Unknown month");
		}
		// task2
		System.out.println("Task 2");
		System.out.println("Enter new numbers");
		for (int j = 0; j < nums.length; j++) {
			nums[j] = sc.nextInt();
		}

		for (int j = 0; j < 5; j++) {
			if (nums[j] > 0) {
				sum += nums[j];
			} else {
				positiv = false;
				break;
			}
		}
		if (!positiv) {
			for (int j = 5; j < nums.length; j++) {
				prod *= nums[j];
			}
			System.out.println("Product = " + prod);
		} else {
			System.out.println("Sum = " + sum);
		}
		// task3
		System.out.println("Task 3");
		for (int j = 0; j < newInt.length; j++) {
			newInt[j] = sc.nextInt();
			if (newInt[j] <= 0) {
				break;
			}
		}
		for (int j : newInt) {
			if (j > 0) {
				secpos++;
				if (secpos <= 2) {
					System.out.println("Position of second positive number = " + secpos);
					break;
				}
			}
		}
		min = newInt[0];
		for (int j = 0; j < newInt.length; j++) {
			if (newInt[j] < min) {
				min = newInt[j];
				indexmin = j;
			}
		}
		System.out.println("Min = " + min + " position = " + indexmin);
		sc.close();
	}
}
