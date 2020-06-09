package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hm8 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        String task = "";
        Hm8 hm = new Hm8();

        while (true) {
            System.out.println("What task do you want to see?\n" +
                    "1 - the longest word in sentence;\n2 - Convert all spaces;\n" +
                    "3 - pattern for US currency;\n0 - exit from application.");
            try {
                task = br.readLine();
            } catch (IOException e) {
            }

            switch (task) {
                case "1":
                    hm.sentenceOfFiveWords();
                    break;
                case "2":
                    hm.manySpaces();
                    break;
                case "3":
                    hm.USCurrency();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    private void sentenceOfFiveWords() {

        System.out.println("\nTask 1.\n");
        System.out.println("Enter sentence:");
        String sentence = "";
        try {
            sentence = br.readLine();
        } catch (IOException e) {
        }

        String[] words = divideSentence(sentence);

        System.out.println("The longest word in the sentence: " + longest(words));
        System.out.println("Number of its letters: " + longest(words).length());
        System.out.println("Second word in reverse: " + reverse(words[1]));
        System.out.println("\nTask 1 done.\n");
    }

    private String[] divideSentence(String sentence) {

        return sentence.toLowerCase().trim().split(" +");
    }

    private String longest(String[] strings) {

        String string = strings[0];
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i + 1].length() > string.length()) {
                string = strings[i + 1];
            }
        }
        return string;
    }

    private String reverse(String word) {

        return new StringBuilder(word).reverse().toString();

        //alternative method
        /*
        String reverse = "";
        char[] letters = word.toCharArray();
        for (int i=letters.length-1;i>=0;i--){
            reverse = reverse.concat(String.valueOf(letters[i]));
        }
        return reverse;
        */
    }

    private void manySpaces() {

        System.out.println("\nTask 2.\n");
        System.out.println("Enter a sentence that contains a lot of spaces:");
        String sentence = "";
        try {
            sentence = br.readLine();
        } catch (IOException e) {
        }
        System.out.println("\nSentence after conversion:");
        System.out.println(removeManySpaces(sentence));
        System.out.println("\nTask 2 done.\n");
    }

    private String removeManySpaces(String string) {

        return string.trim().replaceAll(" +", " ");
    }

    private void USCurrency() {
        System.out.println("\nTask 3.\n");
        System.out.println("Enter the text contains several occurrences of US currency:");
        String text = "";
        try {
            text = br.readLine();
        } catch (IOException e) {
        }
        double[] money = separateDollarsFromText(text);
        for (double current : money) {
            System.out.printf("%.2f\n",current);
        }
        System.out.println("\nTask 3 done.\n");
    }

    private double[] separateDollarsFromText(String text) {

        Pattern pattern = Pattern.compile("\\$\\d+(,\\d{3})*\\.\\d{1,2}");
        Matcher matcher = pattern.matcher(text);
        List<Double> money = new ArrayList<>();
        while (matcher.find()) {
            money.add(Double.parseDouble(
                    text.substring(matcher.start() + 1, matcher.end()).
                            replaceAll(",", "")));
        }
        double[] rez = new double[money.size()];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = money.get(i);
        }
        return rez;
    }
}
