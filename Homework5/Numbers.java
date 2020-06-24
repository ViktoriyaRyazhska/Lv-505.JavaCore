package topic5;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Put on the value");

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println();

		int middle;
		middle = arr.length / 2;
		System.out.println(middle);

		int sumFirst5 = 0, prodLast5 = 1; // для знаходження суми перших 5 ел. для знаходження добутку перших 5 ел
		for (int i = 0; i < arr.length; i++) {
			if (i < middle) {
				if (arr[i] > 0) {
					System.out.println(arr[i]);
					sumFirst5 = sumFirst5 + arr[i];
				}
			}
			if (i >= middle) {
				if (arr[i] > 0) {
					prodLast5 = prodLast5 * arr[i];
				}
			}
		}
		System.out.println("sum first element " + sumFirst5 + " product " + prodLast5);
	}
}
