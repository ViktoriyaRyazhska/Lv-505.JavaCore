package com.softserve.javacore.homework3;

//Task 1.3

import java.util.Scanner;

public enum HTTPErrors {
    HTTPERROR401("401 Unauthorized error"),
    HTTPERROR402("402 Payment Required"),
    HTTPERROR403("403 Forbidden error");

    String name;

    HTTPErrors(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        String error = readError();

        switch (error) {
            case "401":
                System.out.println(HTTPERROR401.name);
                break;

            case "402":
                System.out.println(HTTPERROR402.name);
                break;

            case "403":
                System.out.println(HTTPERROR403.name);
                break;
        }

    }

    private static String readError() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the number of HTTP error: ");
        return scanner.nextLine();
    }
}
