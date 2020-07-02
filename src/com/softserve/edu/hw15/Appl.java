package com.softserve.edu.hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface My {
    boolean isApply(int k);
}

public class Appl {

    public static <T> List<T> work(List<T> list, My my) {
        Iterator<T> it = list.iterator();
        int k = 0;
        while (it.hasNext()) {
            k++;
            it.next();
            if (my.isApply(k)) {
                it.remove();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = new ArrayList<>(list2);
        list.forEach(i -> System.out.print(i + "  "));
        work(list, (int k) -> k % 3 == 0);
        System.out.println();
        list.forEach(i -> System.out.print(i + "  "));
    }
}
