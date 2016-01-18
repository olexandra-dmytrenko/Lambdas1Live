package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by olexandra on 1/18/16.
 */
public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 5, 7);
        Integer numb = 7;
        System.out.println(isPrime(numb));
        System.out.println(isPrimeLambda(numb));
    }

    public static boolean isPrime(int numb) {
        for (int i = 2; i <= numb / 2; i++) {
            if (numb % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeLambda(final int numb) {
        return IntStream.rangeClosed(2, numb / 2).noneMatch(i -> numb % i == 0);
    }
}
