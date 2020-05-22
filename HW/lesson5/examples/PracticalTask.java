package lesson5.examples;

public class PracticalTask {

	public static void main(String[] args) {

		int[] num = { -1, 3, -4, -5, -5, -6, 80, 8, 0, -10 };
		int i = 0;
		int max;
		int sum = 0;
		int negative = 0;

		for (int element : num ) {
			System.out.println("num[" + i + "]= " + element);
			i++;
		}
		i = 0;
		max = num[0];
		while (i < num.length) {
			if (num[i] > 0) {
				sum += num[i];
			} else if (num[i] < 0) {
				negative++;
			}
			if (num[i] > max) {
				max = num[i];
			}
			i++;
		}
		System.out.println("Max = " + max);
		System.out.println("Sum positive numbers = " + sum);
		System.out.println("Amount of negative numbers = " + negative);
		if (negative > (num.length - negative)) {
			System.out.println("There are more negative numbers");
		} else {
			System.out.println("There are more positive numbers");
		}
	}
}
