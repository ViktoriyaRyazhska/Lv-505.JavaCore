package Lesson10HomeWorkParacticeTask3;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileOutput {

    public static void main(String[] args) {
//побайтове читання не підходить для тексту
        byte[] r = new byte[10];
        String fileName = "C:/1/test.txt";
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            //int count = inFile.read(r, 0, bytesAv);
            //
            int count = 0;
            int k = 0;
            while ((k = inFile.read()) > 0) {
                r[count] = (byte) k;
                count++;
            }
            //
            System.out.println("Was readed: " + count + " bytes.");
            System.out.println("Print as bytes " + r[0] + " " + r[1] + " " + r[2]);
            System.out.println("Print as chars " + (char) r[0] + " " + (char) r[1] + " " + (char) r[2]);
            inFile.close();
            System.out.println("Input stream was closed.");
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }


    }

}
