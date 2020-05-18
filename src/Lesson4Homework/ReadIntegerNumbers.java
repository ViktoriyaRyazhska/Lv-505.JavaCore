package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadIntegerNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] integers = new int[3];
        int max = integers[0];


        for (int i = 0; i < integers.length; i++) {
            System.out.println("Please enter your  number : ");
            integers[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Arrays.toString(integers));


        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        int min = integers[0];

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);

    }
}
