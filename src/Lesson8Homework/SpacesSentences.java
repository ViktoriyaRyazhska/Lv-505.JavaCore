package Lesson8Homework;

import java.util.Scanner;

public class SpacesSentences {

    public static void main(String[] args) {

        //Enter a sentence that contains the words between more than one space.
        // Convert all spaces, consecutive, one.
        // For example, if we introduce the sentence "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence1 = sc2.nextLine();

        while(sentence1.contains("  ")){
           sentence1 =sentence1.replace("  "," ");
        }
        System.out.println("Sentence with only 1 space between words is " + sentence1.trim());

    }
}
