package study.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Less4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task 1.");
        System.out.println("Enter three numbers:");
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());

        int count =0;

        if(n1%2==1) {
            count++;
        }
        if(n2%2==1) {
            count++;
        }
        if(n3%2==1) {
            count++;
        }

        System.out.println("Quantity of odd number = "+count);
        System.out.println("\n------------------------------\n");
        System.out.println("Task 2.");
        System.out.println("Enter the number of day (1-7):");
        switch (Integer.parseInt(br.readLine())) {
            case 1
                    :System.out.println("Monday, понеділок");
            break;
            case 2
                    :System.out.println("Tuesday, вівторок");
                break;
            case 3
                    :System.out.println("Wednesday, середа");
                break;
            case 4
                    :System.out.println("Thursday, четвер");
                break;
            case 5
                    :System.out.println("Friday, п'ятниця");
                break;
            case 6
                    :System.out.println("Saturday, субота");
                break;
            case 7
                    :System.out.println("Sunday, неділя");
                break;
            default:
                System.out.println("Wrong input");
                break;

        }
        System.out.println("\n------------------------------\n");
        System.out.println("Task 3.");
        System.out.println("Enter the name of country: ");
        String country = br.readLine();
        switch (country.toLowerCase()){
            case "ukraine" :
            case "germany" :
            case "france" :
            case "poland" :
            case "spain" :
                System.out.println("This country is located in "+Continents.EUROPE);
                break;
            case "russia" :
            case "china" :
            case "india" :
            case "japan" :
            case "nepal" :
                System.out.println("This country is located in "+Continents.ASIA);
                break;
            case "australia" :
                System.out.println("This country is located in "+Continents.AUSTRALIA);
                break;
            case "canada" :
            case "usa" :
            case "cuba" :
            case "mexico" :
            case "costa rica" :
                System.out.println("This country is located in "+Continents.NORTH_AMERICA);
                break;
            case "chili" :
            case "brazil" :
            case "argentina" :
            case "colombia" :
            case "peru" :
                System.out.println("This country is located in "+Continents.SOUTH_AMERICA);
                break;
            case "egypt" :
            case "somali" :
            case "nigeria" :
            case "kenya" :
            case "madagascar" :
                System.out.println("This country is located in "+Continents.AFRICA);
                break;
            case "antarctica" :
                System.out.println("This country is located in "+Continents.ANTARCTICA);
            default:
                System.out.println("Wrong input");
        }

        System.out.println("\n------------------------------\n");
        System.out.println("Task 4.");
        Product p1 = new Product("Mouse",10,23);
        Product p2 = new Product("SD card",33,50);
        Product p3 = new Product("Keyboard",25,7);
        Product p4 = new Product("Web camera",40,10);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        Product test = p1.biggerQuantity(p2);
        test = test.biggerQuantity(p3);
        test = test.biggerQuantity(p4);

        System.out.println("Product, which has the biggest quantity is - "+test.getName());

        test = p1.moreExpensive(p2);
        test = test.moreExpensive(p3);
        test = test.moreExpensive(p4);

        System.out.println("The most expensive product is "+test.getName()+" with quantity "+test.getQuantity());



    }
}
