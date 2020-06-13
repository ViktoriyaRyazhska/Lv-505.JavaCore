package homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hm9 {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        Hm9 hm9 = new Hm9();
        boolean isRun = true;
        String task = "";

        while (isRun) {
            System.out.println("What task do you want to see?\n" +
                    "1 - division of two double;\n2 - numbers in a range;\n" +
                    "0 - exit from application.");
            try {
                task = hm9.br.readLine();
            }
            catch (IOException e) {
                System.out.println("Sorry, something went wrong. Please repeat.");
                continue;
            }

            switch (task) {
                case "1":
                    hm9.taskDivide();
                    break;
                case "2":
                    hm9.numberInRange();
                    break;
                case "0":
                    isRun = false;
                    try {
                        hm9.br.close();
                    } catch (IOException e) {
                    }
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    private void taskDivide() {

        System.out.println("\nTask 1.\n");
        double one = 0;
        double two = 0;
        double result = 0;

        while (result == 0) {
            System.out.print("Enter two numbers:\n1: ");
            try {
                one = Double.parseDouble(br.readLine());
                System.out.print("2: ");
                two = Double.parseDouble(br.readLine());
            } catch (IOException e) {
                System.out.println("Sorry, something went wrong. Please repeat.");
                continue;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input. Be careful.");
                continue;
            }
            try {
                result = div(one, two);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Please repeat.");
            }
        }
        System.out.printf("Division: %.2f/%.2f is %.2f", one, two, result);
        System.out.println("\n\nTask 1 done!\n");
    }

    private double div(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    private void numberInRange() {

        System.out.println("\nTask 2.\n");
        boolean isRun = true;
        int start = 0;
        int end = 0;
        while (isRun) {
            try {
                System.out.print("Enter start point of a range: ");
                start = Integer.parseInt(br.readLine());
                System.out.print("Enter end point of a range: ");
                end = Integer.parseInt(br.readLine());
                isRun = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input. Repeat.");
            } catch (IOException e) {
            }
        }
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + " number in a range: ");
            try {
                numbers[i] = readNumber(start, end);
                System.out.println((i + 1) + " number: " + numbers[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        System.out.println("\nArray with entered numbers is:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("\nTask 2 done!\n");
    }

    private int readNumber(int start, int end) throws Exception {
        boolean isRun = true;
        int number = 0;
        while (isRun) {
            try {
                number = Integer.parseInt(br.readLine());
                isRun = false;
            } catch (IOException e) {
            } catch (NumberFormatException e) {
                System.out.print("Wrong input. Repeat: ");
            }
        }
        if (number > end || number < start) {
            throw new Exception("Number " + number + " not in a range [" + start + "; " + end + "].");
        }
        return number;
    }
}
