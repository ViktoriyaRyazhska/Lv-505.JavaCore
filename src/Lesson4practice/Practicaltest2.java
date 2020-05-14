package Lesson4practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practicaltest2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your day number");
        int NumberOfTheDay = Integer.parseInt(br.readLine());

        switch (NumberOfTheDay){

            case 1:
                System.out.println("Понеділок");
                System.out.println("Monday");
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Вівторок");
                System.out.println("Tuesday");
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Середа");
                System.out.println("Wednesday");
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четвер");
                System.out.println("Thursday");
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятниця");
                System.out.println("Friday");
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Субота");
                System.out.println("Saturday");
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Неділя");
                System.out.println("Sunday");
                System.out.println("Sontag");
                break;

            default:
                System.out.println("Input is wrong");
        }
    }
}
