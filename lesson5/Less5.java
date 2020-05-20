package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Less5 {

    public static void main(String[] args) throws IOException {

        System.out.println("Task 1.");
        int[] numbers = {1, 2, 3, 0, 0, -4, -66, 44, -100, -4};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to overwrite array or leave existing? Enter:");
        System.out.println("1 - to overwrite\nAnything else - leave existing");
        String c = br.readLine();
        switch (c) {
            case "1":
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print("Enter " + (i + 1) + " element: ");
                    numbers[i] = Integer.parseInt(br.readLine());
                }
                System.out.println("Your array is : " + Arrays.toString(numbers));
                break;
            default:
                System.out.println("You leave array: " + Arrays.toString(numbers));
        }

        int[] rez = Less5.maxSumAmount(numbers);

        int pos = Less5.posValue(numbers);

        System.out.println("\nMaximum value is: " + rez[0]);
        System.out.println("Sum of positive elements: " + rez[1]);
        System.out.println("Amount of negative elements: " + rez[2]);

        switch (pos) {
            case 1:
                System.out.println("In array more positive values.");
                break;
            case 0:
                System.out.println("Amount of positive and negative values in array is equal.");
                break;
            case -1:
                System.out.println("In array more negative values.");
        }

        System.out.println("\nTask 2.\n");

        System.out.println("Our company has such employees:");
        Employee[] employees = {
                new Employee("Paul Stys", 1, 25000),
                new Employee("Igor Gul", 3, 15000),
                new Employee("Viktor Zhyk", 2, 200000),
                new Employee("Oleg Chymak", 1, 30000),
                new Employee("Stepan Lev", 2, 18000)};

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.print("\nEnter the wanted department number: ");
        int testDepNum = Integer.parseInt(br.readLine());
        System.out.println("Employees of " + testDepNum + " department are: ");
        Employee.departColl(employees, testDepNum);
        System.out.println("\nSorted list of employee by salary in descending order:");
        employees = Employee.descSort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }


    }

    public static int[] maxSumAmount(int[] numbers) {

        int max = numbers[0];
        int sumOfPos = 0;
        int amountOfNeg = 0;
        for (int i : numbers) {
            max = max > i ? max : i;
            if (i >= 0) {
                sumOfPos += i;
            } else {
                amountOfNeg++;
            }
        }
        return new int[]{max, sumOfPos, amountOfNeg};
    }

    public static int posValue(int[] numbers) {
        int pos = 0;
        int neg = 0;
        for (int i : numbers) {
            if (i == 0) {
                continue;
            }
            if (i > 0) {
                pos++;
                continue;
            }
            neg++;
        }

        if (pos > neg) {
            return 1;
        }
        if (pos < neg) {
            return -1;
        }
        return 0;
    }
}
