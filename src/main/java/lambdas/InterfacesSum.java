package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * Created by olexandra on 1/20/16.
 */
public class InterfacesSum {

    public static void main(String[] args) {
        InterfacesSum s = new InterfacesSum();
        int sum = s.countSum(Arrays.asList(2, 4, 3), new SelectorEven());
        System.out.println(sum);
    }
    private int countSum(List<Integer> list, Selector selector) {
        int sum = 0;
        for (Integer e : list) {
            if (selector.pick(e))
                sum += e;
        }
        return sum;
    }

    interface Selector {
        boolean pick(int a);
    }

    static class SelectorEven implements Selector{

        @Override
        public boolean pick(int a) {
            return a % 2 == 0;
        }
    }
}
