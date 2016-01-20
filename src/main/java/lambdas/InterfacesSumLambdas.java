package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by olexandra on 1/20/16.
 */
public class InterfacesSumLambdas {

    public static void main(String[] args) {
        InterfacesSumLambdas s = new InterfacesSumLambdas();
        int sum = s.countSum(Arrays.asList(2, 4, 3), a -> a % 2 == 0);
        System.out.println(sum);
    }

    private int countSum(List<Integer> list, Predicate<Integer> selector) {
        return list.stream().filter(selector).reduce(0, Math::addExact);
    }
}
