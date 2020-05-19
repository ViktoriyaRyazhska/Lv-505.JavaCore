package com.softserve.javacore.homework3;

import java.util.Scanner;

public enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    EUROPE;

    public static void main(String[] args) {
        String country = readCountry();

        switch (country) {
            case "Ukraine": case "France": case "Italy": case "Netherlands": case "Germany":
                System.out.println(EUROPE);
                break;

            case "Kenia": case "Angola": case "Gabon": case "Somalia":
                System.out.println(AFRICA);
                break;

            case "USA": case "Costa Rica": case "Dominicana": case "Cuba":
                System.out.println(NORTH_AMERICA);
                break;

            case "Peru": case "Brazil": case "Argentina":
                System.out.println(SOUTH_AMERICA);
                break;

            case "Indonesia": case "Thailand": case "Nepal":
                System.out.println(ASIA);
                break;

            default:
                System.out.println("Unmatched country");
                break;

        }

    }

    private static String readCountry() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the country: ");
        return scanner.nextLine();
    }
}