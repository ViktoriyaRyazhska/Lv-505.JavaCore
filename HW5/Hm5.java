package homework5;

import study.homework4.Hm4;
import study.lesson5.Less5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hm5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Task 1.");
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter the number of month: ");
        int month = Integer.parseInt(br.readLine());
        if (month > 12 || month < 1) {
            System.out.println("Sorry, but there are only 12 months.");
        } else {
            System.out.println("This month has " + daysOfMonth[month - 1] + " days.");
        }

        System.out.println("\nTask 2.");
        int[] value = new int[10];
        System.out.println("Enter " + (value.length) + " integer values.");
        value = Hm5.input(value.length);

        if (value[0] > 0 && value[1] > 0 && value[2] > 0 && value[3] > 0 && value[4] > 0) {
            System.out.println("Sum of five first numbers is " + (value[0] + value[1] + value[2] + value[3] + value[4]));
        } else {
            System.out.println("Product of five last number is " + (value[value.length - 5] * value[value.length - 4] * value[value.length - 3] * value[value.length - 2] * value[value.length - 1]));
        }

        System.out.println("\nTask 3.");
        int[] arrayInt = new int[5];
        System.out.println("Enter " + arrayInt.length + " integer numbers.");
        arrayInt = Hm5.input(arrayInt.length);
        int inc = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > 0) {
                inc++;
                if (inc == 2) {
                    System.out.println("Position of second positive number: " + (i + 1));
                    break;
                }
            }
        }
        if (inc != 2) {
            System.out.println("There are no 2 positive numbers in the entered array.");
        }

        int min = arrayInt[0];
        int posOfMin = 0;
        for (int i = 0; i < arrayInt.length - 1; i++) {
            if (min > arrayInt[i + 1]) {
                min = arrayInt[i + 1];
                posOfMin = i + 1;
            }
        }
        System.out.println("Min value " + min + " is in " + (posOfMin + 1) + " position.");


        System.out.println("\nRefill array of not negative integer, enter negative value to finish filling earlier.");
        int productOfEven = 1;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter " + (i + 1) + " integer: ");
            arrayInt[i] = Integer.parseInt(br.readLine());
            if (arrayInt[i] > 0 && arrayInt[i] % 2 == 0) {
                productOfEven *= arrayInt[i];
            }
            if (arrayInt[i] < 0) {
                for (int j = i; j < arrayInt.length; j++) {
                    arrayInt[j] = -999;
                    continue;
                }
                break;
            }
        }

        System.out.println("You entered array " + Arrays.toString(arrayInt));
        if (productOfEven == 1) {
            System.out.println("There are no even numbers in the array.");
        } else {
            System.out.println("Product of positive even number = " + productOfEven);
        }


        System.out.println("\nTask 4.");

        Car[] cars = {
                new Car("BMW M3 F30", 2012, 3.5),
                new Car("BMW X1 E84", 2011, 2.8),
                new Car("BMW M5 F11", 2013, 4.0),
                new Car("BMW Z4 E89", 2012, 2.5)};

        Car.output(cars);
        System.out.print("\nEnter the wanted year of car production: ");
        int wantedYear = Integer.parseInt(br.readLine());
        Car.cerYear(cars,wantedYear);
        System.out.println("\nSorted cars from newest:");
        Car.output(Car.sort(cars));
    }

    public static int[] input(int length) throws IOException {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Your array is : " + Arrays.toString(arr));
        return arr;
    }
}
