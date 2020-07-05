package Lesson11HomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomJava8 {


    public static void main(String[] args) {
//Print n random numbers on console using Java 8

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        System.out.println();

        //Print n random numbers on console using Java 8 in a sorted order

        random.ints( 5 ).sorted().forEach( System.out::println );

        System.out.println();

        //Using Java 8 show the biggest number from n random numbers
        //Це завдання требпа робити використовуючи клас random чи streams?


        Integer maxNumber = Stream.of(1, 2, 3, 4,10, 5, 6, 7, 8, 9)
               .max(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("maxNumber = " + maxNumber);

        System.out.println(random.ints(5).sorted().max());

       // Write a method for sorting list of Strings using Java 8
        List<String> strings = Arrays.asList("Oleh", "Petro", "Volodymyr", "Yaroslav", "Oksana","");
        Stream<String> st = strings.stream()
                .filter(string -> !string.isEmpty());
        System.out.println("----------------");


        //sorting in natural order ->alphabetic order
        strings.stream().sorted().forEachOrdered(System.out::println);

        //sorting according to length
        System.out.println("----------------");


//sorting ascending
        st=st.distinct().sorted((p1,p2)-> p1.length()- p2.length());
        st.forEach(System.out::println);

















    }
}
