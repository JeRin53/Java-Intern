import java.util.*;
import java.util.stream.*;

public class FLatMapExample {

    public static void main(String[] args) {

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

        List<Integer> numbers = Stream.of(evens, odds, primes)
                .flatMap(a -> a.stream())
                .collect(Collectors.toList());

        System.out.println("Flattened List:");
        System.out.println(numbers);
    }
}
