package com.softserve.javacore.homework5;

import java.util.Scanner;

public class Month {
    static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static int readNumberOfMonth() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the number of month: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numberOfMonth = readNumberOfMonth();
        System.out.println(monthDays[numberOfMonth]);
    }
}