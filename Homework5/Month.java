
package topic5;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int day = 1;
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("Input number of month of the year from 1 to 12");
		day = input.nextInt();

		if (day > 0 && day <= 12) {
			System.out.println("The number of days in a month: " + months[day - 1]);
		}
	}
}
