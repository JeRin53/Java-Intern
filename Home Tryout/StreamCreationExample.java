import java.util.*;
import java.util.stream.*;

public class StreamCreationExample {

    public static void main(String[] args) {

        // 1️⃣ From Collection
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> s1 = list.stream();
        System.out.println("From Collection:");
        s1.forEach(System.out::println);

        System.out.println("------------------");

        // 2️⃣ From Arrays
        String[] arr = {"x", "y", "z"};
        Stream<String> s2 = Arrays.stream(arr);
        System.out.println("From Array:");
        s2.forEach(System.out::println);

        System.out.println("------------------");

        // 3️⃣ From Values
        Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("From Values:");
        s3.forEach(System.out::println);

        System.out.println("------------------");

        // 4️⃣ From Stream Builder
        Stream<String> s4 = Stream.<String>builder()
                .add("one")
                .add("two")
                .add("three")
                .build();

        System.out.println("From Stream Builder:");
        s4.forEach(System.out::println);
    }
}
