package Lesson11HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class training {

    public static void main(String[] args) {
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

        int temp;
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int j = 1; j < arr.length; j += 2) {
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
        System.out.print(Arrays.toString(arr));




/*

        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0 && i != 0) {
                list.remove(i);
            }


        }
*/
        //System.out.println(list);

        Iterator iterator = list.iterator();
        try {
            while (iterator.hasNext()) {
                iterator.next();
                iterator.next();
                iterator.next();
                iterator.next();
                iterator.remove();


            }

        }catch (Exception e){}
        System.out.println(list);
        System.out.println(list.size());



        }


    }
