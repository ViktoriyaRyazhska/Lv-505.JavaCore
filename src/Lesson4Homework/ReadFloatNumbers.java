package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFloatNumbers {

    public static void main(String[] args) throws IOException,NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float []floatnumbers = new float[3];

        for(int i=0;i<floatnumbers.length;i++){
            System.out.println("Enter the number");
            floatnumbers[i]= Float.parseFloat(br.readLine());
            if(floatnumbers[i]>=-5 && floatnumbers[i]<=5){
                System.out.println("Number "+ floatnumbers[i] + " belongs to the range [-5,5] ");
            }else
            System.out.println("Number " +floatnumbers[i] +" does not belong to the range [-5,5]");
        }
    }
}
