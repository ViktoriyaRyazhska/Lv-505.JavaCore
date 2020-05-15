package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFloatNumbers {

    public static void main(String[] args) throws IOException,NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first number : ");
        float number1 = Float.parseFloat(br.readLine());
        System.out.println("Please enter your second number : ");
        float number2 = Float.parseFloat(br.readLine());
        System.out.println("Please enter your third number : ");
        float number3 = Float.parseFloat(br.readLine());


        if ((number1 >= -5) && (number1 <= 5)) {
            System.out.println("Number1 "+ +number1 + " belongs to the range [-5,5] ");
        } else {
            System.out.println("Number1 " +number1 +" does not belong to the range [-5,5]");
        }

        if ((number2 >= -5) && (number2 <= 5)) {
            System.out.println("Number2 " + number2+ " belongs to the range [-5,5] ");
        } else {
            System.out.println("Number2 " + number2+ " does not belong to the range [-5,5]");
        }

        if ((number3 >= -5) && (number3 <= 5)) {
            System.out.println("Number3 " + number3 + " belongs to the range [-5,5] ");
        } else {
            System.out.println("Number3 " + number3 + " does not belong to the range [-5,5]");
        }
    }
}
