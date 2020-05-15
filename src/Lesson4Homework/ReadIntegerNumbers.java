package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadIntegerNumbers {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first number : ");
        int number1 = Integer.parseInt(br.readLine());
        System.out.println("Please enter your second number : ");
        int number2 = Integer.parseInt(br.readLine());
        System.out.println("Please enter your third number : ");
        int number3 = Integer.parseInt(br.readLine());

        if(number1>number2&&number1>number3){
            System.out.println("Number1 which equals to:  " + number1 + " is the biggest number from all three entered numbers " );
        }
        else if(number1<number2&&number1<number3){
            System.out.println("Number1 which equals to:  " + number1 + " is the smallest  number from all three entered numbers " );
        }


        if(number2>number1&&number2>number3){
            System.out.println("Number2 which equals to:  " + number2 + " is the biggest number from all three entered numbers " );
        }
        else if(number2<number1&&number2<number3){
            System.out.println("Number2 which equals to:  " + number2 + " is the smallest  number from all three entered numbers " );
        }

        if(number3>number1&&number3>number2){
            System.out.println("Number3 which equals to:  " + number3 + " is the biggest number from all three entered numbers " );
        }
        else if(number3<number1&&number3<number2){
            System.out.println("Number3 which equals to:  " + number3 + " is the smallest  number from all three entered numbers " );
        }

    }
}
