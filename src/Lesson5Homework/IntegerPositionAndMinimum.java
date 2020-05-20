package Lesson5Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class IntegerPositionAndMinimum {

    public static void main(String[] args) throws IOException, NumberFormatException {
//Enter 5 integer numbers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] integers2 = new int[5];

        for (int i = 0; i < integers2.length; i++) {

            try {
                System.out.println("Please enter the  number : ");
                integers2[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Input format is wrong");
                System.out.println("Please enter your  number : ");
                integers2[i] = Integer.parseInt(br.readLine());

            }
            System.out.println(Arrays.toString(integers2));
        }
//Find position of second positive number;

        int index = 0;
        for (int i = 0; i < integers2.length; i++) {

            if (integers2[i] > 0 && i != 0 && integers2[i] - 1 > 0) {


                index = i;
                break;

            }
        }
        System.out.println("Position of second positive number is " + index);

// Find minimum and its position in the array.

        int min = integers2[index];
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] < min) {
                min = integers2[i];
                index = i;
                System.out.println();
            }

        }
        System.out.println("Arrays minimum is " + min + " and its index is " + index);

        //Organizing entering integers until the first negative number. Count the product of all entered even numbers.
        int evenProduct = 1;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number >= 0) {

            if (number % 2 == 0) {
                evenProduct = evenProduct * number;
            }

            number = sc.nextInt();
        }
        System.out.println("Product of all entered even numbers is " + evenProduct);

    }
}
