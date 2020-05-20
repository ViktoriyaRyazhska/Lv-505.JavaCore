package Lesson5Homework;

import java.util.Arrays;
import java.util.Scanner;

public class InputNumberOfMonth {

    public static void main(String[] args) {


        int[] numberOfDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Elements in the array are:: ");
        System.out.println(Arrays.toString(numberOfDaysInMonth));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the month::");
        try {
            int index = sc.nextInt();
            System.out.println("Month with the given index has  :: " + numberOfDaysInMonth[index - 1] + " days");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you have entered is invalid");
            System.out.println("Please enter an index number between 1 and 12");
            int index = sc.nextInt();
            System.out.println("Month with the given index is :: " + numberOfDaysInMonth[index - 1] + " days");

        }

    }
}


