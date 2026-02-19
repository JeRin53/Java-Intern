import java.util.*;
import java.util.stream.*;

public class StreamPipelineExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Jerin", "James", "John");

        List<String> result = names.stream()
                .filter(s -> s.length() > 4)        // Intermediate
                .map(String::toUpperCase)           // Intermediate
                .sorted()                           // Intermediate
                .collect(Collectors.toList());      // Terminal

        System.out.println("Final Result:");
        System.out.println(result);
    }
}
