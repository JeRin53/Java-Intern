import java.util.function.*;
import java.util.*;

public class LambdaExamples {
    public static void main(String[] args) {

        // Predicate - boolean test
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Is \"\" empty? " + isEmpty.test("")); // true

        // Comparator - compare two objects
        Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
        System.out.println("Compare \"apple\" vs \"banana\": " + comp.compare("apple", "banana"));

        // Function - transform input
        Function<Integer, String> intToStr = i -> String.valueOf(i);
        System.out.println("Integer 5 to String: " + intToStr.apply(5));

        // Consumer - perform an action
        Consumer<String> print = s -> System.out.println("Print: " + s);
        print.accept("Hello from Lambda!");

        // Supplier - generate value
        Supplier<String> greet = () -> "Hello World";
        System.out.println("Supplier gives: " + greet.get());

        // Example with stream and lambda
        List<String> names = Arrays.asList("Jay","Anna","Bob");
        names.stream()
             .filter(s -> s.length() > 3)
             .forEach(System.out::println);
    }
}

