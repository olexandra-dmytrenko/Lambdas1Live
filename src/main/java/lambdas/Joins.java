package lambdas;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by olexandra on 1/20/16.
 */
public class Joins {

    public static void main(String[] args) {
        String a = Stream.of(1, "Petite France", 3.65, "GoIT")
                .filter(el -> el instanceof String).map((el -> (String) el))
                .collect(Collectors.joining());
        System.out.println(a);
        System.out.println(Stream.of(1, "Petite France", 3.65, "GoIT")
                .filter(el -> el instanceof String).map((el -> (String) el))
                .collect(Collectors.joining(",")));
        System.out.println(Stream.of(1, "Petite France", 3.65, "GoIT")
                .filter(el -> el instanceof String).map((el -> (String) el))
                .collect(Collectors.joining(", \n" ,"\n", "\n EOF")));
        System.out.println(Stream.of(1, "Petite France", 3.65, "GoIT")
                .filter(String.class::isInstance).map((String.class::cast))
                .collect(Collectors.joining(", \n", "\n", "This is the end.")));
    }
}
