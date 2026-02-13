import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,1,2,1);

        List<Integer> integers = numbers.stream()
                .map(num -> num * 10)
                .collect(Collectors.toList());
        System.out.println(integers);

        Set<Integer> intMaps = numbers.stream()
                .map(num -> num * 10)
                .collect(Collectors.toSet());
        System.out.println(intMaps);

        long numberCount = numbers.stream().distinct().count();
        System.out.println(numberCount);

        boolean any2 = numbers.stream().anyMatch(num -> num > 2);
        System.out.println("Any number greater than 2? " + any2);

        boolean noneMatch = numbers.stream().noneMatch(num -> num > 20);
        System.out.println(noneMatch);

        boolean allMatch = numbers.stream().allMatch(num -> num > 0);
        System.out.println(allMatch);

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}