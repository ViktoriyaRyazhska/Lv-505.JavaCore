package Lesson8Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaExpressionHomeWork {
    public static void main(String[] args) {

        //The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        // Using regular expressions implement checking the user name for validity.
        // Input five names in the main method . Output a message to the console of the validation of each of the entered names.

        String pattern = "[a-zA-Z0-9_]+";
//String text = "Nowisthetime8_";

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your username: ");
            String text = sc.nextLine();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);
            if (m.matches()) {
                System.out.println("m.matches() OK");
            } else {
                System.out.println("m.matches() is not OK");
            }
        }











      /*  while (m.find()){
            System.out.println(text.substring(m.start(),m.end()));
        }

*/


    }
}
