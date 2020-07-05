package Lesson11HomeWork1;

import java.util.ArrayList;
import java.util.Iterator;


@FunctionalInterface
interface MyFunctional {
    ArrayList updatedList(ArrayList<Integer> list);
    //double g(double x);
}


public class FunctionalExample {

//Задекларувати функціональний інтерфейс.
// Написати клас з методом, який параметрами приймає список (List) та створений функціональний інтерфейс.

// Метод повинен змінювати список та повертати оновлений список.

    //В методі main створити об'єкт згаданого класу та викликати його метод.
// Алгоритм внесення змін задати через лямда вираз.
//Наприклад, поміняти місцями парні та непарні елементи, або вилучити кожний третій, etc.


    // вилучити кожний третій




    MyFunctional ref = (list) -> {
        Iterator iterator = list.iterator();

        try {
            while (iterator.hasNext()) {
                iterator.next();
                iterator.next();
                iterator.next();
                iterator.remove();


            }

        } catch (Exception e) {
        }
        return list;
    };


// поміняти місцями парні та непарні елементи
    /*

    int temp;
    int[] arr = {1, 2, 3, 4, 5, 6};
        for (int j = 1; j < arr.length; j += 2) {
        temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
    }

    */


    MyFunctional ref2 = (list) -> {
int temp1;
        int temp;

        for (int j = 1; j < list.size(); j += 2) {
            temp = list.get(j-1);
            temp1 = list.get(j);

//Чому я не можу звернутись до lista так як до  масиву

            list.remove(j-1);

            list.add(j-1,temp1);
            list.remove(j);
            list.add(j,temp);

        }
return list;
    };



    // @Override
//    public double f(double x) {
    //    return 0;
//    }

    //   public double integral(MyFunctional m, ArrayList <Integer> list) {
//Як заязати метод інтерфейсу і LIST

    // }


    public static void main(String[] args) {

        FunctionalExample functionalexample = new FunctionalExample();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        list.add(4, 4);
        list.add(5, 5);
        list.add(6, 6);
        list.add(7, 7);
        list.add(8, 8);
        list.add(9, 9);
        list.add(10, 10);


        System.out.println("Every 3rd element was removed: ");
        System.out.println(functionalexample.ref.updatedList(list));



        System.out.println("List with swapped elements is below: ");
        System.out.println(functionalexample.ref2.updatedList(list));
        //functionalexample.ref.updatedList(list);


    }


}
