package Lesson10HomeWorkTask4ReadingandWritingIntoTheFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.io.*;

public class ReadText2 {


    public static void main(String[] args) {

//Create file1.txt file with a text about your career.
//Read context from file into array of strings. Each array item contains one line from file.
//Write in to the file2.txt
//   1) number of lines in file1.txt.
//   2) the longest line in file1.txt.
//   3) your name and birthday date.


//for reading from file
        String fileName2 = "C:/1/file1.txt";
        String fileName3 = "C:/1/file2.txt";


        FileReader fr1;
        BufferedReader br1;

        //for writing into files and to create file at the same time

        FileWriter fw = null;
        BufferedWriter bw = null;


        //   3) your name and birthday date.
        String data = "MY name is Volodymyr and my birthday is on 09.09.1988";


        try {

            //Reading and working with file
            fr1 = new FileReader(fileName2);
            br1 = new BufferedReader(fr1);


            String p = null;
            int count = 0;
            System.out.println("Read data from file: " + fileName2);


            String[] arr = new String[12];
            int i = 0;

            while ((p = br1.readLine()) != null)

                arr[i++] = p;
            // System.out.println(p); // просто текст без масиву
            System.out.println(Arrays.toString(arr));//рядки тексту як елементи масиву


            // 2) find the longest line.
            String max = arr[1];

            for (int c = 0; c < arr.length; c++) {

                if (arr[c].length() > max.length()) {
                    max = arr[c];

                }
            }

            System.out.println(" The longest line in file1.txt is :" + max);
            System.out.println();


            // 1) number of lines in file1.txt.
            System.out.println(" Number of lines in file1.txt is: " + arr.length);


            br1.close();

            //Here we write into any file we want

            fw = new FileWriter(fileName3);
            bw = new BufferedWriter(fw);

            System.out.println("Write data to file: " + fileName3);
            bw.write(" My name and birthday dates are: " + data + "\r\n");


            bw.write(" The longest line in file1.txt is : " + max + "\r\n");


            bw.write(" Number of lines in file1.txt is:  " + arr.length);


            bw.close();


        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

    }
}
