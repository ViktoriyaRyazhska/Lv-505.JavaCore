package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeWork4 {

private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public static void findSum(int[] name){
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        sum = sum + name[i];
    }
    System.out.println("The sum = " + sum);
}

public static void findProduct(int[] name){
    int product = 1;
    for (int i = 0; i < 5; i++) {
        product = product * name[9-i];
    }
    System.out.println("The product = " + product);
}

public static void checkAction(int[] name){
    int stateAction = 0;
    for (int i = 0; i < 5; i++) {
        if(name[i] > 0){
            stateAction = 0;
        } else {
         stateAction = 1;
         break;
        }
    }
    if (stateAction == 0 ){
        findSum(name);
    } else {
        findProduct(name);
    }
}

    public static void main(String[] args) throws IOException {

//        TASK 1
//        int[] monthDuration = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//        System.out.println("Please enter number of month: ");
//        int number = Integer.parseInt(br.readLine());
//        System.out.println("The month is " + monthNames[number-1] + ". It have " + monthDuration[number-1]+ " days in it.");


//        TASK 2
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        checkAction(numbers);

//        TASK 3
//        int[] numbers2 = new int[5];
//        int positionPositive = 0;
//        int minimum;
//        int positionMin = 0;
//        int product = 1;
//        for (int i = 0; i < numbers2.length; i++) {
//            numbers2[i] = Integer.parseInt(br.readLine());
//            if (numbers[i] < 0){
//                break;
//            }
//        }
//        minimum = numbers2[0];
//        for (int i = 0; i < numbers2.length; i++) {
//            if(numbers2[i] < minimum){
//                minimum = numbers2[i];
//                positionMin = i;
//            }
//
//            if(numbers2[i] > 0){
//                positionPositive++;
//
//                //finding position of second positive
//                if(positionPositive == 1){
//                    System.out.println("Second positive number in position: " + i);
//                }
//            }
//            //calculating production of even
//            if(numbers2[i] % 2 == 1){
//                product = product * numbers2[i];
//            }
//        }
//        System.out.println("Minimum number is: " + minimum + " and its position is: " + positionMin);
    }
}
