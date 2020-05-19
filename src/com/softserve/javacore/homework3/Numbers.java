package com.softserve.javacore.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number:");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println("Enter the second number:");
        int n2 = Integer.parseInt(br.readLine());

        System.out.println("Enter the third number:");
    int n3 = Integer.parseInt(br.readLine());


        System.out.println(calculateOddCount(n1, n2, n3));
    }

    public static int calculateOddCount(int n1, int n2, int n3) {
        int count = 0;

        if (n1 % 2 == 0) {
            count++;
        }

        if (n2 % 2 == 0) {
            count++;
        }

        if (n3 % 2 == 0) {
            count++;
        }

        return count;

    }


}

