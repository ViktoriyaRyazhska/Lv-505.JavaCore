package com.softserve.javacore.homework5;

import java.util.Scanner;

public class Numbers {

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        return scanner.nextInt();
    }

    private static int[] readNumbers() {
        int[] numbers = new int[10];
        numbers[0] = readNumber();
        numbers[1] = readNumber();
        numbers[2] = readNumber();
        numbers[3] = readNumber();
        numbers[4] = readNumber();
        numbers[5] = readNumber();
        numbers[6] = readNumber();
        numbers[7] = readNumber();
        numbers[8] = readNumber();
        numbers[9] = readNumber();

        return numbers;

    }

    public static int calculateNumbers(int[] numbers) {
        if (numbers[0] > 0 && numbers[1] > 0 && numbers[2] > 0 && numbers[3] > 0 && numbers[4] > 0)
            return (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]);
        else
            return (numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9]);
    }

    public static void main(String[] args) {
        int[] readNumbers = readNumbers();
        int result = calculateNumbers(readNumbers);

        System.out.println(result);

    }

}
