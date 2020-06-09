package lesson8;

import study.lesson7.Less7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less8 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Less8 tasks = new Less8();

        String task = "";

        while (true) {
            System.out.println("What task do you want to see?\n" +
                    "1 - substring;\n2 - naming;\n" +
                    "3 - name validation;\n0 - exit from application.");
            task = br.readLine();

            switch (task) {
                case "1":
                    tasks.subString();
                    break;
                case "2":
                    tasks.naming();
                    break;
                case "3":
                    tasks.nameValidation();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, no such choice, please repeat.");
            }
        }
    }

    private void subString() throws IOException {

        System.out.println("\nTask 1.\n");
        System.out.print("Enter first string: ");
        String str1 = br.readLine();
        System.out.print("Enter second string: ");
        String str2 = br.readLine();

        System.out.println("First string is" +
                (checkSubString(str1, str2) ? "" : "n't")
                + " substring of second");
        System.out.println("\nTask 1 done\n");

    }

    private boolean checkSubString(String sub, String string) {

        for (int i = 0; i < (string.length() - sub.length()); i++) {
            if (string.toLowerCase().startsWith(sub.toLowerCase(), i)) {
                return true;
            }
        }
        return false;
    }

    private void naming() throws IOException {

        System.out.println("\nTask 2.\n");
        System.out.println("Enter surname, name and patronymic in one line:");
        String all = br.readLine();
        String[] div = surnameNamePatronymic(all);

        System.out.println("Surnames and initials: " + div[0] + " "
                + div[1].substring(0, 1) + "." + div[2].substring(0, 1) + ".");
        System.out.println("Name: " + div[1]);
        System.out.println("Name, middle name and last name: " +
                div[1] + " " + div[2] + " " + div[0] + ".");
        System.out.println("\nTask 2 done\n");
    }

    private String[] surnameNamePatronymic(String all) {

        return all.trim().split(" +");
    }

    private void nameValidation() {

        System.out.println("\nTask 3.\n");
        List<String> names = new ArrayList<>();
        names.add("IgorPyrig_2000");
        names.add("UA");
        names.add("Ark@diy");
        names.add("Sneakylfrit69");
        names.add("Andiy.Chuk");

        System.out.println("List of usernames is:");

        for (String name: names) {
            System.out.println(name);
        }
        System.out.println();
        for (String current : names) {
            System.out.println(current + " is " + (validation(current) ? "" : "in") + "valid name.");
        }

        System.out.println("\nDo you want to validate your username?\ny - yes,\nany other - no.");
        try {
            if (br.readLine().toLowerCase().equals("y")) {
                System.out.print("Enter your username: ");
                String username = br.readLine();
                System.out.println(username + " is " + (validation(username) ? "" : "in") + "valid name.");
            }
        } catch (IOException ignored) {
        }
        System.out.println("\nTask 3 done\n");
    }

    private boolean validation(String string) {

        Pattern pattern = Pattern.compile("\\w{3,15}");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
