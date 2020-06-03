package Lesson5Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IntegerNumbers {

    public static void main(String[] args) throws IOException, NumberFormatException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int[] integers = new int[10];

        for (int i = 0; i < integers.length; i++) {

            try {
                System.out.println("Please enter your  number : ");
                integers[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Input format is wrong");
                System.out.println("Please enter your  number : ");
                integers[i] = Integer.parseInt(br.readLine());

            }
            System.out.println(Arrays.toString(integers));
        }
        int sum = 0;
        int product = 1;
        for (int i = 0; i < integers.length; i++) {

            if (i < 5 && integers[i] > 0) {
                sum = sum + integers[i];
            } else if (i >= 5 && integers[i] < 0) {
                product = product * integers[i];

            }
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
