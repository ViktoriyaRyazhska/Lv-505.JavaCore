package study.homework4;

import java.util.Scanner;

public class Hm4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Task 1.1.");
        System.out.println("Enter three float number (Ex.: 1,2):");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        rangeOfFloat(n1, n2, n3);

        System.out.println("\nTask 1.2.");
        System.out.println("Enter three integer number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        maxInt(num1, num2, num3);
        minInt(num1, num2, num3);

        System.out.println("\nTask 1.3.");
        System.out.println("Enter the number of HTTP Error: ");
        int http = sc.nextInt();
        System.out.println(httpError(http));

        dogTask();

    }
    public static boolean rangeOfFloat(float n1, float n2, float n3) {

        if (n1 >= -5 && n1 <= 5 && n2 >= -5 && n2 <= 5 && n3 >= -5 && n3 <= 5) {
            System.out.println("They all belong to the range [-5;5]");
            return true;
        }
        System.out.println("Not all of them belong to the range [-5;5]");
        return false;
    }

    public static int maxInt(int num1, int num2, int num3) {

        int test = num1>num2 ? num1 : num2;
        test = test>num3 ? test : num3;
        System.out.println("Max value is: " + test);
        return test;
    }

    public static int minInt(int num1, int num2, int num3) {

        int test = num1<num2 ? num1 : num2;
        test = test<num3 ? test : num3;
        System.out.println("Min integer is: " + test);
        return test;
    }

    public static String httpError(int http) {

        switch (http) {
                case 400:
                    return HttpError.BadRequest400.getHttpError(); //number in the end of every name of enum is used for easy finding necessary error
                case 401:
                    return HttpError.Unauthorized401.getHttpError();
                case 402:
                    return HttpError.PaymentRequired402.getHttpError();
                case 403:
                    return HttpError.Forbidden403.getHttpError();
                case 404:
                    return HttpError.NotFound404.getHttpError();
                case 405:
                    return HttpError.MethodNotAllowed405.getHttpError();
                case 406:
                    return HttpError.NotAcceptable406.getHttpError();
                default:
                    return "HTTP error not found";
        }
    }


    public static void dogTask() {
        System.out.println("\nTask 2.");

        Dog dog1 = new Dog("Marsel", Breed.DOBERMAN, 12);
        Dog dog2 = new Dog("Lana", Breed.LABRADOR, 8);

        System.out.println("Enter name and age of your dog:");
        String testName = sc.next();
        int testAge = sc.nextInt();
        Dog dog3 = new Dog(testName, testAge);
        System.out.println("Choose breed from the list:");
        System.out.println("1 - Akita\n2 - Boxer\n3 - Bulldog\n4 - Collie\n5 - Doberman\n6 - Labrador");
        int i = sc.nextInt();
        switch (i) {
                case 1:
                    dog3.setBreed(Breed.AKITA);
                    break;
                case 2:
                    dog3.setBreed(Breed.BOXER);
                    break;
                case 3:
                    dog3.setBreed(Breed.BULLDOG);
                    break;
                case 4:
                    dog3.setBreed(Breed.COLLIE);
                    break;
                case 5:
                    dog3.setBreed(Breed.DOBERMAN);
                    break;
                case 6:
                    dog3.setBreed(Breed.LABRADOR);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
        }

        if (dog1.equals(dog2) || dog2.equals(dog3) || dog1.equals(dog3)) {
            System.out.println("Hooray. Our dogs have the same name.");
        } else System.out.println("All dogs have unique names.");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println(dog1.getBreed().getBreed());


        Dog testDog = dog1.older(dog2).older(dog3);
        System.out.println("The oldest dog is " + testDog.getName() + ", breed: " + testDog.getBreed().getBreed() + ".");
    }
}

