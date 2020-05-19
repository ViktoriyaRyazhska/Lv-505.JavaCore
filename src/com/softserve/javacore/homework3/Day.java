package com.softserve.javacore.homework3;

import java.util.Scanner;

public enum Day {
    MONDAY("Понеділок", "Monday", "Montag"),
    TUESDAY("Вівторок", "Tuesday", "Dienstag"),
    WEDNESDAY("Середа", "Wednesday", "Mittwoch"),
    THURSDAY("Четвер", "Thursday", "Donnerstag"),
    FRIDAY("П'ятниця", "Friday", "Freitag"),
    SATURDAY("Субота", "Saturday", "Samstag"),
    SUNDAY("Неділя", "Sunday", "Sonntag");

    private String labelUA;
    private String labelEN;
    private String labelDE;

    Day(String labelUA, String labelEN, String labelDE) {
        this.labelUA = labelUA;
        this.labelEN = labelEN;
        this.labelDE = labelDE;
    }

    public static void main(String[] args) {
        int number = readNumber();

        switch (number) {
            case 1:
                System.out.println(MONDAY.labelUA + " " + MONDAY.labelEN + " " + MONDAY.labelDE);
                break;

            case 2:
                System.out.println(TUESDAY.labelUA + " " + TUESDAY.labelEN + " " + TUESDAY.labelDE);
                break;

            case 3:
                System.out.println(WEDNESDAY.labelUA + " " + WEDNESDAY.labelEN + " " + WEDNESDAY.labelDE);
                break;

            case 4:
                System.out.println(THURSDAY.labelUA + " " + THURSDAY.labelEN + " " + THURSDAY.labelDE);
                break;

            case 5:
                System.out.println(FRIDAY.labelUA + " " + FRIDAY.labelEN + " " + FRIDAY.labelDE);
                break;

            case 6:
                System.out.println(SATURDAY.labelUA + " " + SATURDAY.labelEN + " " + SATURDAY.labelDE);
                break;

            case 7:
                System.out.println(SUNDAY.labelUA + " " + SUNDAY.labelEN + " " + SUNDAY.labelDE);
                break;

            default:
                break;
        }

    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the number: ");
        return scanner.nextInt();
    }


}

