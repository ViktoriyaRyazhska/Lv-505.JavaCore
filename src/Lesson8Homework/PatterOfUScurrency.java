package Lesson8Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterOfUScurrency {
    public static void main(String[] args) {

        //Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after the dot.
        // Enter the text from the console that contains several occurrences of US currency. Display all occurrences on the screen.

// \\$ one occurence of dollar, \\d*  is any number of digits, \\.  is only one dot, \\d{2} is only 2 digits after the dot

        String pattern = "[\\$(\\d*)(\\.\\d{2})]";

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your text: ");
            String text = sc.nextLine();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);


            while(m.find()){
                System.out.println(text.substring(m.start(),m.end())+"*");
            }

    }
}
