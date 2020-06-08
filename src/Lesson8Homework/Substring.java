package Lesson8Homework;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        //Enter the two variables of type String. Determine whether the first variable substring second.
        // For example, if you typed «IT» and «IT Academy» you must receive true.

        Scanner sc = new Scanner(System.in);
        System.out.println("User please enter the first String : ");
        String first = sc.nextLine();

        System.out.println("User please enter the second String : ");
        String second = sc.nextLine();

        if (second.contains(first)) {
            System.out.println("true");
        }
    }
}
