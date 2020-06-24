package Lesson10HomeWorkParacticeTask3;

import java.io.*;

import java.util.Arrays;


public class ReadTextFile {

    //Prepare mytext.txt file with a lot of text inside.
    //Read context from file into array of strings.
    //Each array item contains one line from file.
    //Complete next tasks:
    //   1) count and write the number of symbols in every line.
    //   2) find the longest and the shortest line.
    //   3) find and write only that lines, which consist of word «var»

    public static void main(String[] args) {

        String fileName = "C:/1/mytext.txt";
        FileReader fr;
        BufferedReader br;


        try {

            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            int count = 0;
            System.out.println("Read data from file: " + fileName);

            String[] arr = new String[9];
            int i = 0;

            while ((s = br.readLine()) != null)

                arr[i++] = s;
            // System.out.println(s); // просто текст без масиву
            System.out.println(Arrays.toString(arr));//рядки тексту як елементи масиву

            //  1) count and write the number of symbols in every line.

            for (int k = 0; k < arr.length; k++) {
                System.out.println("Number of symbols in  line :" + arr[k] + " is:  " + arr[k].length());
            }
            System.out.println();
            // 2) find the longest and the shortest line.
            String min = arr[0];
            for (int b = 0; b < arr.length; b++) {

                if (arr[b].length() < min.length()) {
                    min = arr[b];


                }

            }
            System.out.println("The shortest line is :" + min);

            System.out.println();
            String max = arr[1];

            for (int c = 0; c < arr.length; c++) {

                if (arr[c].length() > max.length()) {
                    max = arr[c];

                }
            }

            System.out.println("The longest line is :" + max);
            System.out.println();


            // 3) find and write only that lines, which consist of word «var»

            for (int d = 0; d < arr.length; d++) {

                if (arr[d].contains("var")) {
                    System.out.println("Line which contains word var is: " + arr[d]);
                }

            }


            br.close();
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }

}



