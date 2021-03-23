package lt.codeacademy.stream_api.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStarter {

    public static void start() {
        List<String> stringNumbers = new ArrayList<>();
        stringNumbers.add("ONE");
        stringNumbers.add("TWO");
        stringNumbers.add("THREE");
        stringNumbers.add("four");
        stringNumbers.add("FIVE");
        stringNumbers.add("One Million and One");

        Stream<String> stringNumbersStream = stringNumbers.stream();

        // we can start using stream now

        // =================== MAP =====================
        stringNumbersStream
                .map(wordOrAnyOtherNameIwantToGiveIt -> {
                    // I can manipulate the object here
                    String transformedWord = wordOrAnyOtherNameIwantToGiveIt.toUpperCase();
                    return transformedWord;
                }).forEach(myWord -> {
                    System.out.println("My word is: " + myWord);
                });
        // shorter version now
        stringNumbers
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // =================== Filter =====================
        stringNumbers.stream()
                .filter(value -> value.length() > 3)
                .map(String::toUpperCase)
                .forEach(word -> System.out.println("Word that is longer than 3: " + word));

        // =================== Flat map =====================
        List<Integer> col1 = List.of(1, 2, 3, 3);
        List<Integer> col2 = List.of(22, 55, 24);
        List<Integer> col3 = List.of(100040, 88, 923424);
        List<List<Integer>> thead = List.of(col1, col2, col3);

        System.out.println("My nested lists" + thead);

        Stream.of(thead)
                .flatMap(number -> {
                    return number.stream();
                }).forEach(num -> System.out.println("Number in the list: " + num));

        // =================== Collect =====================
        List<Integer> col1ByTen = col1.stream()
                .map(num -> num * 10)
                .collect(Collectors.toList());
        System.out.println("Col1 multiplied by 10 in other list: " + col1ByTen);

        Collection<Integer> colUnique = col1.stream()
                .map(num -> num * 10)
                .collect(Collectors.toSet());
        System.out.println("Col1 unique elements multiplied by 10 in other list: " + colUnique);

        // =================== Reduce =====================
        List<Integer> orderTotals = Arrays.asList(99, 100, 200, 500);

        int grandTotal = orderTotals.stream()
                .reduce(0, (total, number) -> total + number);

        int grandTotalShorthand = orderTotals.stream()
                .reduce(100, Integer::sum);
        System.out.println("Grand total of all orders: " + grandTotal);
        System.out.println("Grand total of all orders with 100 initial: " + grandTotalShorthand);

        List<BigDecimal> myExpanses = List.of(BigDecimal.valueOf(80.38), BigDecimal.valueOf(201), BigDecimal.valueOf(77.20), BigDecimal.valueOf(52.50));
        BigDecimal myTotalExpansesToday = myExpanses.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total I spent: " + myTotalExpansesToday);

        // =================== Max =====================
        int biggestOrder = orderTotals.stream()
                .max((number1, number2) -> number1.compareTo(number2))
                .get();

        int biggestOrderShortHand = orderTotals.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println("Biggest order: " + biggestOrderShortHand);

        // =================== Min =====================
        int smallestOrder = orderTotals.stream()
                .min((v1, v2) -> v1.compareTo(v2))
                .get();

        int smallestOrderShortHand = orderTotals.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println("Smallest order was: " + smallestOrder);


        BigDecimal smallestExpanse = myExpanses.stream()
                .min(BigDecimal::compareTo)
                .get();

        System.out.println("My smallest expanse today was: " + smallestExpanse);


    }
}
