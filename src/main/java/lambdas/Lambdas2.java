package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by olexandra on 1/18/16.
 */
public class Lambdas2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 6, 5, 4, 3, 8);
        Integer numb = 7;

        System.out.println(getDoubledEvenGT3(numbers));
        System.out.println(getDoubledEvenGT3Lambdas(numbers));
        System.out.println(getDoubledEvenGT3LambdasList(numbers));
        getDoubledEvenGT3LambdasList(numbers).stream().forEach(System.out::println);
        getDoubledEvenGT3LambdasList(numbers).stream().forEach(e ->
        {
            System.out.println(e);
        });
    }

    public static int getDoubledEvenGT3(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number > 3) {
                if (number % 2 == 0) {
                    return number * 2;
                }
            }
        }
        return 0;
    }

    public static int getDoubledEvenGT3Lambdas(List<Integer> numbers) {
        return getIntegerStream(numbers)
                .findFirst()
                .get();
    }

    public static List<Integer> getDoubledEvenGT3LambdasList(List<Integer> numbers) {
        return getIntegerStream(numbers)
                .collect(Collectors.toList());
    }

    private static Stream<Integer> getIntegerStream(List<Integer> numbers) {
        return numbers.stream()
//                .filter(isGreaterThan3())
//                .filter(Lambdas2::isGreaterThan3)
                .filter(number -> isGreaterThan3(number))
                .filter(isEven())
                .map(Lambdas2::getDoubled);
    }

    private static Function<Integer, Integer> getDoubled() {
        return number -> number * 2;
    }

    private static int getDoubled(int number) {
        System.out.println("getDoubled for " + number);
        return number * 2;
    }

    private static boolean isEven(int number) {
        System.out.println("isEven " + number);
        return number % 2 == 0;
    }

    private static Predicate<Integer> isEven() {
        return number -> number % 2 == 0;
    }

    //    private static Predicate<Integer> isGreaterThan3() {
//        return number -> number > 3;
//    }
    private static boolean isGreaterThan3(int number) {
        System.out.println("sGreaterThan3 " + number);
        return number > 3;
    }

    private void useIntStream() {
        IntStream.of(1, 2, 5, 4, 6, 5, 4, 3, 8)
                .filter(number -> number > 3)
                .filter(number -> number % 2 == 0)
                .map(Lambdas2::getDoubled).findFirst();
    }
}
