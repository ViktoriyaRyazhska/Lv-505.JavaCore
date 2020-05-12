package com.softserve.javacore.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius of the flower bed:");
        Double radius = Double.parseDouble(br.readLine());
        System.out.println("Radius:");

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println(area);
        System.out.println(perimeter);
    }
}