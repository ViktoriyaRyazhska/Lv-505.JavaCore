package Lesson9DuplicateHomeWork;

import java.util.Scanner;

public class Exceptions {

    public static String s;

    //Create method div(), which calculates the dividing of two double numbers.
    // In main method input 2 double numbers and call this method. Catch all exceptions.

    public static double div(double a, double b) throws NullPointerException, ArithmeticException, IllegalArgumentException {
        // int i =s.length();
        if (Math.abs(b) < 0.000001) {
            throw new IllegalArgumentException("Wrong parameter b");
        }
        return a / b;
    }

    //Write a method readNumber(int start, int end), that read from console integer number
    // and return it, if it is in the range [start...end].

    public static int readNumber(int start, int end) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();


        if (number > start && number < end) {
            return number;
        }

        //If an invalid number or non-number text is read, the method should throw an exception.

        else {
            throw new IllegalArgumentException("The input number is Wrong!!!");
        }
    }

    public static void main(String[] args) {
        try {

            double result = div(20.5, 2.2);
            System.out.println(result);

        } catch (NullPointerException | ArithmeticException | IllegalArgumentException e) {

            System.out.println("All exceptions");
        } finally {
            System.out.println("Finally is always running");
        }

        // Using this method write a method main(), that has to enter 10 numbers:
        //a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter the number which is in the range : 1 < a1 < ... < a10 < 100 ");
            System.out.println(readNumber(1, 100));
        }
    }
}
