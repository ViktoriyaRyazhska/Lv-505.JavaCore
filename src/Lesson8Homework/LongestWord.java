package Lesson8Homework;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {

        //Enter in the console sentence of five words.
        //display the longest word in the sentence
        //determine the number of its letters

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence = sc.nextLine();

        String[] arr = sentence.split(" ");
        String longestword = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() >= longestword.length()) {
                longestword = arr[i];
            }
        }

        //bring the second word in reverse order

        String reversedSecondWord = "";

        for(int i=arr[1].length()-1;i>=0;i--){
            reversedSecondWord = reversedSecondWord + arr[1].charAt(i);
        }

                System.out.println("Longest word is " + longestword + " and its number of letters is   " + longestword.length());
        System.out.println("Second  word in its revered version is " + reversedSecondWord);

        //Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println("Sorted array is "+ Arrays.toString(arr) )  ;

    }
}
