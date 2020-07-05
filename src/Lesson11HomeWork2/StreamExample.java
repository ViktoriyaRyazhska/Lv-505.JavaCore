package Lesson11HomeWork2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

//Написати метод, який вхідним параметром отримує стрім з числами та повертає стрім з з елементами, які дублюються у вхідному стрімі.
//Наприклад, якщо вхідний потік матиме елементи
//[3, 2, 1, 1, 12, 3, 8, 2, 4, 2]
//то на виході отримаємо
//[1, 2, 3]


    // public static void main(String[] args) {



    //  Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
    //  Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
    // System.out.println(duplicatedNumbersSet);


    // List<Integer> duplicatedNumbers = numbers.stream().


    //Як написати метод  з оцим
    public static Set<Integer> setOfDuplicates(List<Integer>numbers) {


    Set<Integer> duplicated = numbers
            .stream()
            .filter(n -> numbers
                    .stream()
                    .filter(x -> x == n)
                    .count() > 1)
            .collect(Collectors.toSet());

return duplicated;
}



    //Questions: як задавати на вхід stream of elements ,
    public static int[] getDuplicatesStreamsToArray(int[] input) {
        return


                (IntStream.of(input).boxed().collect(Collectors.collectingAndThen(
                Collectors.groupingBy(Function.identity(), Collectors.counting()),
                map -> {
                    map.values().removeIf(cnt -> cnt < 2);
                    return (map.keySet());
                })).stream().mapToInt(i -> i).toArray());




    }


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 2, 1, 1, 12, 3, 8, 2, 4, 2);
        System.out.println(Arrays.toString(getDuplicatesStreamsToArray(new int []  {3,2,1,1,12,3,8,2,4,2})));
        System.out.println("Result when using set:");

        System.out.println(setOfDuplicates(numbers));


        /*
        List<Integer> numbers  = Arrays.asList(3,2,1,1,12,3,8,2,4,2);
        Set<Integer> duplicated = numbers
                .stream()
                .filter(n -> numbers
                        .stream()
                        .filter(x -> x == n)
                        .count() > 1)
                .collect(Collectors.toSet());


*/

    }



}















