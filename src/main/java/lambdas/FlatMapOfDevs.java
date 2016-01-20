package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * Created by olexandra on 1/20/16.
 */
public class FlatMapOfDevs {
    public static void main(String[] args) {
        Developer polyglot = new Developer("polyglot");
        polyglot.add("Scala");
        polyglot.add("Java");
        polyglot.add("Pascal");

     Developer front = new Developer("front");
        front.add("Java Script");
        front.add("PHP");
        front.add("Ajax");
        List<Developer> devs = Arrays.asList(polyglot, front);

        devs.stream().flatMap(dev -> dev.getLanguages().stream()).limit(3).forEach(System.out::println);
    }

}
