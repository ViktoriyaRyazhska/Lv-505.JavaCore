package com.softserve.edu.hw15;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplStream {

public static Stream<Integer> duplicateElements(Stream<Integer> stream) {
    return stream
        .filter(i -> (i != null))
        //.sorted()
        .collect(Collectors.groupingBy(Function.identity()))
        //.forEach((key, value) -> System.out.print("\n" + key + ": " + value));
        .entrySet()
        .stream()
        .map(e -> e.getValue())
        .filter(list -> (list.size() > 1))
        .flatMap(list -> list.stream())
        .distinct()
        .sorted();
        //return null;
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 1, 2, 5, 4, 3, 5);
        duplicateElements(stream).forEach(e->System.out.print(e + "  "));;
    }
}
