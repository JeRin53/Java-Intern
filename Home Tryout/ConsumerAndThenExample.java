import java.util.*;
import java.util.function.*;

public class ConsumerAndThenExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jerin", "John", "James");

        System.out.println("Using andThen():");

        // First Consumer
        Consumer<String> upper = s ->
                System.out.println("Upper: " + s.toUpperCase());

        // Second Consumer
        Consumer<String> length = s ->
                System.out.println("Length: " + s.length());

        // Chaining Consumers
        Consumer<String> combined = upper.andThen(length);

        names.stream().forEach(combined);

        System.out.println("---------------------------");

        System.out.println("Using direct forEach():");

        names.stream().forEach(s -> {
            System.out.println("Upper: " + s.toUpperCase());
            System.out.println("Length: " + s.length());
        });
    }
}
