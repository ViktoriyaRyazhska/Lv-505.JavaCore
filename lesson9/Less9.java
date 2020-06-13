package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less9 {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        boolean isRun = true;
        Less9 less9 = new Less9();
        String task = "";

        while (isRun) {
            System.out.println("What task do you want to see?\n" +
                    "1 - area of rectangle;\n2 - plants;\n" +
                    "0 - exit from application.");
            try {
                task = less9.br.readLine();
            }
            catch (IOException e) {
                System.out.println("Sorry, something went wrong. Please repeat.");
                continue;
            }

            switch (task) {
                case "1":
                    less9.negativeAreaOfRectangle();
                    break;
                case "2":
                    less9.plants();
                    break;
                case "0":
                    isRun = false;
                    try {
                        less9.br.close();
                    } catch (IOException e) {
                    }
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    private void negativeAreaOfRectangle() {

        System.out.println("\nTask 1.\n");
        int length = 0;
        int width = 0;
        int area = 0;
        while (area == 0) {
            System.out.print("Enter length and width of rectangle:\nLength: ");
            try {
                length = Integer.parseInt(br.readLine());
                System.out.print("Width: ");
                width = Integer.parseInt(br.readLine());
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("You must fill data!");
            }catch (IOException e) {
                System.out.println("Sorry, something went wrong. Please repeat.");
                continue;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input. Try again.");
                continue;
            }
            try {
                area = squareRectangle(length, width);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Area of rectangle: " + area);
        System.out.println("\nTask 1 done!\n");
    }

    private int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("Numbers must be positive!");
        }
        return a * b;
    }

    private void plants() {

        System.out.println("\nTask 2.\n");
        boolean isRun = true;
        Plant[] plants = new Plant[6];
        try {
            plants[0] = new Plant("Onion", 2, "white", "vegetable");
            plants[1] = new Plant("Orange", 4, "orange", "fruit");
            plants[2] = new Plant("Tomato", 3, "red", "vegetable");
            plants[3] = new Plant("Sunflower", 7, "yellow", "flower");
            plants[4] = new Plant("Gooseberry", 1, "green", "berry");
        } catch (TypeException | ColorException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Array of plants is:");
        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }

        System.out.println("\nNow enter one your plant.");
        while (isRun) {
            try {
                System.out.print("Enter name of plant: ");
                String name = br.readLine();
                name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
                System.out.print("Enter its size: ");
                int size = Integer.parseInt(br.readLine());
                System.out.print("Enter its color: ");
                String color = br.readLine();
                System.out.print("And finally enter type of your plant: ");
                String type = br.readLine();
                plants[5] = new Plant(name, size, color, type);
                isRun = false;
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("You must fill data!");
            } catch (IOException e) {
                System.out.println("Something went wrong. Please repeat.");
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, be careful.");
            } catch (IllegalArgumentException | ColorException | TypeException e) {
                System.out.println(e.getMessage());
                System.out.println("Reenter please.");
            }
        }
        System.out.println("\nNow array of plants is:");
        for (Plant plant : plants) {
            System.out.println(plant);
        }
        System.out.println("\nTask 2 done!\n");
    }
}
