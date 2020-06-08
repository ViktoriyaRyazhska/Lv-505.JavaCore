package Lesson8Homework;
import java.util.Scanner;

public class OutputNames {

    public static void main(String[] args) {

        //Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
        //surnames and initials
        //name
        //name, middle name and last name

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surname, name and patronymic on the console as a variable of type String");
        String sentence = sc.nextLine();

//Розбити через split
        String[] arr = sentence.split(" ");

        System.out.println("Surname is " + arr[0] + " Initials are: " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".");
        System.out.println("Name is " + arr[1]);
        System.out.println("Name is " + arr[1] + " Middle name is " + arr[2] + " Last name is " + arr[0]);

    }
}
