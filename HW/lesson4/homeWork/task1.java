package lesson4.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		float[] numFloat = { 0, 0, 0 };
		boolean num = true;
		int[] numInt = { 0, 0, 0 };
		int max = 0, min = 0;
		int numError;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// read 3 float numbers and check: are they all belong to the range [-5,5];
		for (int i = 0; i < numFloat.length; i++) {
			System.out.println("Enter the number");
			numFloat[i] = Float.parseFloat(br.readLine());
			if (numFloat[i] > 5 && numFloat[i] > -5) {
				num = false;
			}
		}
		if (num) {
			System.out.println("All numbers are within range");
		} else {
			System.out.println("Numbers are out of range");
		}

		// read 3 integer numbers and write max and min of them;
		for (int i = 0; i < numInt.length; i++) {
			System.out.println("Enter the number");
			numInt[i] = Integer.parseInt(br.readLine());
		}

		min = max = numInt[0];

		for (int i = 0; i < numInt.length; i++) {
			if (numInt[i] > max) {
				max = numInt[i];
			}
			if (numInt[i] < min) {
				min = numInt[i];
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);

		// read number of HTTP Error (400, 401,402, ...) and write the name of this
		// error (Declare enum HTTPError)
		HTTPError httperror = HTTPError.Error400;
		System.out.println("Enter the error code");
		numError = Integer.parseInt(br.readLine());

		switch (numError) {
		case 400:
			httperror = HTTPError.Error400;
			break;
		case 401:
			httperror = HTTPError.Error401;
			break;
		case 402:
			httperror = HTTPError.Error402;
			break;
		case 403:
			httperror = HTTPError.Error403;
			break;
		case 404:
			httperror = HTTPError.Error404;
			break;
		default:
			System.out.println("Unknown error code");
		}
		

		System.out.println(httperror.getError());
	}

}
