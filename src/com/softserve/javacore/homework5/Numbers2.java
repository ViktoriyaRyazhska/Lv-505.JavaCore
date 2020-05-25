package com.softserve.javacore.homework5;

import java.util.Scanner;

public class Numbers2 {

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        return scanner.nextInt();
    }

    private static int[] readNumbers() {
        int[] numbers = new int[5];
        numbers[0] = readNumber();
        numbers[1] = readNumber();
        numbers[2] = readNumber();
        numbers[3] = readNumber();
        numbers[4] = readNumber();

        return numbers;
    }

    private static int[] readNumbersViaLoop() {
        int[] numbers = new int[100];
        int i = 0;

        int readNumber = readNumber();
        while (readNumber > 0) {
            numbers[i] = readNumber;
            i++;
            readNumber = readNumber();
        }
        return numbers;
    }


    public static NumberOnPosition returnMinNumberAndPosition(int[] numbers) {
        int minNumber = numbers[0];
        int positionOfMinNumber = 0;

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                positionOfMinNumber = i;
            }

        return new NumberOnPosition(minNumber, positionOfMinNumber);
    }

    public static NumberOnPosition returnPositionOfSecondPositiveNumber(int[] numbers) {
        int secondPositiveNumber = 0;
        int positionOfSecondPositiveNumber = 0;

        int positionOfFirst = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && positionOfFirst >= 0) {
                secondPositiveNumber = numbers[i];
                positionOfSecondPositiveNumber = i;
            }
            if (numbers[i] > 0 && positionOfFirst == -1) {
                positionOfFirst = i;
            }
        }


        return new NumberOnPosition(secondPositiveNumber, positionOfSecondPositiveNumber);

    }

    public static int returnProductOfEvenNumbers(int[] numbers) {
        int productOfEvenNumbers = 1;
        int countOfEvenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 0) {
                productOfEvenNumbers = productOfEvenNumbers * numbers[i];
                countOfEvenNumbers++;
            }
        }

        if (countOfEvenNumbers == 0) {
            return 0;
        } else return productOfEvenNumbers;
    }


    public static void main(String[] args) {

        int[] readNumbers = readNumbers();
        NumberOnPosition minNumberAndPosition = returnMinNumberAndPosition(readNumbers);
        NumberOnPosition secondPositiveNumberAndPosition = returnPositionOfSecondPositiveNumber(readNumbers);

        System.out.println("Min number is: " + minNumberAndPosition.getNumber());
        System.out.println("Min number is on position: " + minNumberAndPosition.getPosition());
        System.out.println("Second positive numbers is: " + secondPositiveNumberAndPosition.getNumber());
        System.out.println("Second positive number is on position: " + secondPositiveNumberAndPosition.getPosition());

        System.out.println();
        System.out.println();
        System.out.println();

        int readPositiveNumbers = returnProductOfEvenNumbers(readNumbersViaLoop());
        System.out.println("Product of all entered even numbers is: " + readPositiveNumbers);

    }
}


class NumberOnPosition {
    private int number;
    private int position;

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }

    public NumberOnPosition(int number, int position) {
        this.number = number;
        this.position = position;


    }
}

