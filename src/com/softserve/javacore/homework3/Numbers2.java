package com.softserve.javacore.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Task 1.1 and 1.2

public class Numbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number:");
        float n1 = Float.parseFloat(br.readLine());

        System.out.println("Enter the second number:");
        float n2 = Float.parseFloat(br.readLine());

        System.out.println("Enter the third number:");
        float n3 = Float.parseFloat(br.readLine());

        System.out.println("Count of number in range (-5,5): " + returnNumbersInRange(n1, n2, n3));


        System.out.println("Enter the first number:");
        int n4 = Integer.parseInt(br.readLine());

        System.out.println("Enter the second number:");
        int n5= Integer.parseInt(br.readLine());

        System.out.println("Enter the third number:");
        int n6 = Integer.parseInt(br.readLine());

        System.out.println("Max number is: " + returnMaxNumber(n4, n5, n6));

    }

    public static float returnNumbersInRange(float n1, float n2, float n3) {
        int count = 0;

        if (n1 >= -5 && n1 < 5) {
            count++;
        }

        if (n2 >= -5 && n2 < 5) {
            count++;
        }

        if (n3 >= -5 && n3 < 5) {
            count++;
        }
        return count;
    }

    public static int returnMaxNumber(int n4, int n5, int n6) {
        int maxNumber;

        if (n4 > n5) {
            maxNumber = n4;

        } else {
            maxNumber = n5;
        }

        if (n6 > maxNumber) {
            maxNumber = n6;
        }

        return maxNumber;
    }
}