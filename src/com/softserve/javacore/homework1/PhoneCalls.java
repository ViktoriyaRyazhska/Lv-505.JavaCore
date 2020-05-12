package com.softserve.javacore.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the unit per minute:");
        Double c1 = Double.parseDouble(br.readLine());
        System.out.println("Enter the unit per minute:");
        Double c2 = Double.parseDouble(br.readLine());
        System.out.println("Enter the unit per minute:");
        Double c3 = Double.parseDouble(br.readLine());

        System.out.println("Talk is continued:");
        Double t1 = Double.parseDouble(br.readLine());
        System.out.println("Talk is continued:");
        Double t2 = Double.parseDouble(br.readLine());
        System.out.println("Talk is continued:");
        Double t3 = Double.parseDouble(br.readLine());

        System.out.println(c1 * t1);
        System.out.println(c2 * t2);
        System.out.println(c3 * t3);

        System.out.println((c1 * t1) + (c2 * t2) + (c3 * t3) );
    }
}
